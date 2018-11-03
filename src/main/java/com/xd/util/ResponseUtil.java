package com.xd.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class ResponseUtil {
	public static void write(HttpServletResponse response,String type ,String content){
		response.setContentType("text/"+type+";charset=utf-8");
		PrintWriter out =null;
		try {
			out = response.getWriter();
			out.print(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.flush();
			out.close();
		}
	}
}