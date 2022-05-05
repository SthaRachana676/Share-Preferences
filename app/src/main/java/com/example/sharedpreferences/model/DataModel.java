package com.example.sharedpreferences.model;

public class DataModel {
    private String[] names = {
            "RAM","RACHANA","PRAKASH","GITANGALI","URMILA","SARITA",
            "RAM","RACHANA","PRAKASH","GITANGALI","URMILA","SARITA",
            "RAM","RACHANA","PRAKASH","GITANGALI","URMILA","SARITA",
            "RAM","RACHANA","PRAKASH","GITANGALI","URMILA","SARITA",
            "RAM","RACHANA","PRAKASH","GITANGALI","URMILA","SARITA",
            "RAM","RACHANA","PRAKASH","GITANGALI","URMILA","SARITA"
    };
    private String[] address = {
            "KATHMANDU", "BHAKTAPUR", "LALITPUR", "MAKWANPUR", "NUWAKOT",
            "KATHMANDU", "BHAKTAPUR", "LALITPUR", "MAKWANPUR", "NUWAKOT",
            "KATHMANDU", "BHAKTAPUR", "LALITPUR", "MAKWANPUR", "NUWAKOT",
            "KATHMANDU", "BHAKTAPUR", "LALITPUR", "MAKWANPUR", "NUWAKOT",
            "KATHMANDU", "BHAKTAPUR", "LALITPUR", "MAKWANPUR", "NUWAKOT",
            "KATHMANDU", "BHAKTAPUR", "LALITPUR", "MAKWANPUR", "NUWAKOT"
    };

    public String[] getNames(){
        return names;
    }

    public String[] getAddress() {
        return address;
    }
}
