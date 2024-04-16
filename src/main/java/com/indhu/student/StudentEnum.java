package com.indhu.student;

public enum StudentEnum {
	
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    PENDING("Pending");

    private final String value;

    StudentEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
