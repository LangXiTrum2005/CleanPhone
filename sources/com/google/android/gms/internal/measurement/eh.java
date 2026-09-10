package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eh {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final dh f23441f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final dh f23443h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mh f23436a = new mh("cause", Throwable.class, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mh f23437b = new mh("ratelimit_count", Integer.class, false, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mh f23438c = new mh("sampling_count", Integer.class, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mh f23439d = new mh("ratelimit_period", yg.class, false, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mh f23440e = new mh("skipped", Integer.class, false, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mh f23442g = new mh("forced", Boolean.class, false, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final mh f23444i = new mh("stack_size", th.class, false, false);

    static {
        boolean z10 = true;
        f23441f = new dh("group_by", Object.class, z10, z10, 0);
        f23443h = new dh("tags", w.class, false, z10, 1);
    }
}
