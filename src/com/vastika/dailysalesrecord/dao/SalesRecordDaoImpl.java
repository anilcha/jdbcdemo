package com.vastika.dailysalesrecord.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.vastika.dailysalesrecord.util.DbConnection;

public class SalesRecordDaoImpl implements SalesRecordDao{
	
	public static final String SQL = "";

	@Override
	public int saveSalesRecord(SalesRecordDao sales) {
		
		int saved = 0;
		
		try (
				Connection con = DbConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(SQL)){
			
			ps.setInt(parameterIndex, x);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

}
