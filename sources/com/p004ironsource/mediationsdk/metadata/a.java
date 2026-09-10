package com.p004ironsource.mediationsdk.metadata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f25958a = "do_not_sell";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f25959b = "is_child_directed";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f25960c = "is_deviceid_optout";
    public static final String d = "google_family_self_certified_sdks";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f25961e = "iiqf";
    public static final String f = "is_test_suite";
    public static final String g = "true";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final String f25962h = "false";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f25963i = "google_water_mark";
    public static final String j = "enable";
    static final Set<String> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Set<String> f25964l;
    static final Set<String> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f25965n = 2048;

    static {
        HashSet hashSet = new HashSet(Arrays.asList(f25959b, f25960c, f, d, f25961e));
        k = hashSet;
        f25964l = new HashSet(Arrays.asList(f25960c, d, f, f25961e));
        HashSet hashSet2 = new HashSet(hashSet);
        m = hashSet2;
        hashSet2.add(f25958a);
    }
}
