package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sf1 implements yd1, zb0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sf1 f19953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final sf1 f19954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final sf1 f19955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final sf1 f19956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final sf1 f19957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final sf1 f19958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final sf1 f19959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final sf1 f19960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final sf1 f19961k;
    public static final sf1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final sf1 f19962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final sf1 f19963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final sf1 f19964o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19966b;

    static {
        int i10 = 0;
        f19953c = new sf1("SHA1", i10);
        f19954d = new sf1("SHA224", i10);
        f19955e = new sf1("SHA256", i10);
        f19956f = new sf1("SHA384", i10);
        f19957g = new sf1("SHA512", i10);
        int i11 = 1;
        f19958h = new sf1("TINK", i11);
        f19959i = new sf1("CRUNCHY", i11);
        f19960j = new sf1("NO_PREFIX", i11);
        int i12 = 2;
        f19961k = new sf1("TINK", i12);
        l = new sf1("NO_PREFIX", i12);
        int i13 = 3;
        f19962m = new sf1("SHA256", i13);
        f19963n = new sf1("SHA384", i13);
        f19964o = new sf1("SHA512", i13);
    }

    public /* synthetic */ sf1(String str, int i10) {
        this.f19965a = i10;
        this.f19966b = str;
    }

    public String toString() {
        switch (this.f19965a) {
            case 0:
                return this.f19966b;
            case 1:
                return this.f19966b;
            case 2:
                return this.f19966b;
            case 3:
                return this.f19966b;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo160zza(Object obj) {
        ((gc0) obj).zza(this.f19966b);
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        zzt.zzh().e(this.f19966b, th2);
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
    }
}
