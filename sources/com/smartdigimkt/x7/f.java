package com.smartdigimkt.x7;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f39961a = "placement_strategy";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f39962b = "app_strategy";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f39963c = "eu_traffic";
    public static final String d = "get_area";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f39964e = "get_plugin";
    public static final String f = "get_cdn_domain";
    public static final String g = "tracking";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f39965h = "agent";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f39966i = "bid";
    public static final String j = "request";
    public static final String k = "smart_wf";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f39967l = "s2s_reward";

    public static int a(String str) {
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
