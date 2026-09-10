package com.ironsource.mediationsdk.metadata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f29604a = "do_not_sell";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f29605b = "is_child_directed";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f29606c = "is_deviceid_optout";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f29607d = "google_family_self_certified_sdks";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f29608e = "iiqf";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f29609f = "is_test_suite";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f29610g = "true";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final String f29611h = "false";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f29612i = "google_water_mark";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f29613j = "enable";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Set<String> f29614k;
    static final Set<String> l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final Set<String> f29615m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f29616n = 2048;

    static {
        HashSet hashSet = new HashSet(Arrays.asList(f29605b, f29606c, f29609f, f29607d, f29608e));
        f29614k = hashSet;
        l = new HashSet(Arrays.asList(f29606c, f29607d, f29609f, f29608e));
        HashSet hashSet2 = new HashSet(hashSet);
        f29615m = hashSet2;
        hashSet2.add("do_not_sell");
    }
}
