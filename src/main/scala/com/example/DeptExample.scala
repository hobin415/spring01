package com.example

object DeptExample{
	def main(args: Array[String]): Unit = {
		
		var dept = new Dept
		dept.deptno = 10
		dept.dname = "충무부"
		dept.loc = "서울"
		
		println("detpno = " + dept.deptno);
		println("dname = " + dept.dname);
		println("loc = " + dept.loc);
	}
}