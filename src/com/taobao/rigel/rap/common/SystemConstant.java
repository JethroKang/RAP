package com.taobao.rigel.rap.common;

import com.alibaba.platform.buc.sso.common.dto.SimpleSSOUser;



public class SystemConstant {
	public static final int FIRST_PAGE_NUM = 1;
	public static final int DEFAULT_PAGE_NUM = 10;
	public static String README_PATH = "";
	public static String ROOT = "";
	public static String DOMAIN_URL = "";
	public static final String ALI_LOGIN_URL = "";
    public static final String NODE_SERVER = "localhost:8827";
    public static boolean serviceInitialized = false;

	public static String getAliLoginUrl() {
		return ALI_LOGIN_URL;
	}

	public static String getDOMAIN_URL() {
		return DOMAIN_URL;
	}
	
	public static SimpleSSOUser user = null;
	
	

}
