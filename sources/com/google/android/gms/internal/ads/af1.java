package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class af1 implements yd1, zb0, qv0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final af1 f12010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final af1 f12011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final af1 f12012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final af1 f12013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final af1 f12014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final af1 f12015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final af1 f12016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final af1 f12017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final af1 f12018k;
    public static final af1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final af1 f12019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final af1 f12020n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final af1 f12021o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final af1 f12022p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final af1 f12023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final af1 f12024r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12026b;

    static {
        int i10 = 0;
        f12010c = new af1("ENABLED", i10);
        f12011d = new af1("DISABLED", i10);
        f12012e = new af1("DESTROYED", i10);
        int i11 = 1;
        f12013f = new af1("TINK", i11);
        f12014g = new af1("CRUNCHY", i11);
        f12015h = new af1("NO_PREFIX", i11);
        int i12 = 2;
        f12016i = new af1("ASSUME_AES_GCM", i12);
        f12017j = new af1("ASSUME_XCHACHA20POLY1305", i12);
        f12018k = new af1("ASSUME_CHACHA20POLY1305", i12);
        l = new af1("ASSUME_AES_CTR_HMAC", i12);
        f12019m = new af1("ASSUME_AES_EAX", i12);
        f12020n = new af1("ASSUME_AES_GCM_SIV", i12);
        int i13 = 3;
        f12021o = new af1("TINK", i13);
        f12022p = new af1("CRUNCHY", i13);
        f12023q = new af1("LEGACY", i13);
        f12024r = new af1("NO_PREFIX", i13);
    }

    public /* synthetic */ af1(String str, int i10) {
        this.f12025a = i10;
        this.f12026b = str;
    }

    public String toString() {
        switch (this.f12025a) {
            case 0:
                return this.f12026b;
            case 1:
                return this.f12026b;
            case 2:
                return this.f12026b;
            case 3:
                return this.f12026b;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.qv0
    public Object zza(Object obj) {
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.f12026b, Integer.toString(0)});
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public /* synthetic */ void mo160zza(Object obj) {
        switch (this.f12025a) {
            case 5:
                ((gc0) obj).b(this.f12026b);
                break;
            default:
                ((vc0) obj).zze(this.f12026b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        zzt.zzh().d(this.f12026b, th2);
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
    }
}
