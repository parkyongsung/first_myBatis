package com.choa.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.choa.util.DBConnector;


public class MemberDAOImpl implements MemberDAO {

	@Override
	public int join(MemberDTO memberDTO) {
		DBConnector dbc = new DBConnector();
		Connection con = dbc.getConnect();
		PreparedStatement st = null;
		String sql = "insert into member where (member_seq,?,?)";
		int result=0;
		try {
			st=con.prepareStatement(sql);
			st.setString(1, memberDTO.getId());
			st.setString(2, memberDTO.getPw());
			result=st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public MemberDTO login(MemberDTO memberDTO) {
		DBConnector dbc = new DBConnector();
		Connection con = dbc.getConnect();
		PreparedStatement st = null;
		ResultSet rs =null;
		String sql = "select * from member where id=? and pw=?";
		try {
			st=con.prepareStatement(sql);
			st.setString(1, memberDTO.getId());
			st.setString(2, memberDTO.getPw());
			rs=st.executeQuery();
			if(rs.next()){
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memberDTO;
	}

	

}
