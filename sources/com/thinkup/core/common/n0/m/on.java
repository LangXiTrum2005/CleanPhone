package com.thinkup.core.common.n0.m;

/* JADX INFO: loaded from: classes6.dex */
public final class on {
    public static final String m = "app_strategy";
    public static final String m0 = "agent";
    public static final String mm = "request";
    public static final String mn = "smart_wf";
    public static final String mo = "bid";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f41944n = "eu_traffic";
    public static final String n0 = "s2s_reward";
    public static final String o = "placement_strategy";
    public static final String o0 = "get_area";
    public static final String om = "get_cdn_domain";
    public static final String on = "tracking";
    public static final String oo = "get_plugin";

    public static int o(String str) {
        str.getClass();
        switch (str) {
            case "s2s_reward":
                return 4;
            case "bid":
                return 3;
            case "placement_strategy":
                return 2;
            case "request":
                return 5;
            case "app_strategy":
                return 1;
            default:
                return 0;
        }
    }
}
