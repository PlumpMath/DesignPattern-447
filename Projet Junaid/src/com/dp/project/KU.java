package com.dp.project;

public class KU {

	
	public iDepartment getOutline(String dept) {
        if (dept.equalsIgnoreCase("cs")) {
            return new CS();
        }
        else if (dept.equalsIgnoreCase("mechanics")) {
            return new Mechanical();
        }else {
            return new Null();
        }
    }
	
}
