package com.choa.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choa.util.DBConnector;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private DataSource dataSource;
	
	public void test(){
		try {
			System.out.println(dataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public int join(MemberDTO memberDTO) {
		Connection con;
		int result=0;
		try {
			con = dataSource.getConnection();
			PreparedStatement st = null;
			String sql = "insert into member2 where (member2_seq,?,?,?)";
			st = con.prepareStatement(sql);
			st.setString(1, memberDTO.getId());
			st.setString(2, memberDTO.getPw());
			st.setString(3, memberDTO.getName());
			result=st.executeUpdate();
			}catch (SQLException e1) {
			e1.printStackTrace();
			}finally {
				
			}
		return result;
	}

	@Override
	public MemberDTO login(MemberDTO memberDTO) {
		DBConnector dbc = new DBConnector();
		Connection con = dbc.getConnect();
		PreparedStatement st = null;
		ResultSet rs =null;
		String sql = "select * from member2 where id=? and pw=?";
		try {
			st=con.prepareStatement(sql);
			st.setString(1, memberDTO.getId());
			st.setString(2, memberDTO.getPw());
			rs=st.executeQuery();
			if(rs.next()){
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return memberDTO;
	}

	

}
