package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ih {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f15742m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f5 f15743n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f15744a = f15742m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f5 f15745b = f15743n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f15748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w1 f15751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f15753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15754k;
    public int l;

    static {
        aa1 aa1Var = ca1.f13122b;
        ya1 ya1Var = ya1.f22208e;
        List list = Collections.EMPTY_LIST;
        ya1 ya1Var2 = ya1.f22208e;
        t3 t3Var = t3.f20138a;
        Uri uri = Uri.EMPTY;
        f15743n = new f5("androidx.media3.common.Timeline", new b0(), uri != null ? new l2(uri, ya1Var2) : null, new w1(), f7.B);
        String str = uu0.f20901a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final void a(f5 f5Var, boolean z10, boolean z11, w1 w1Var, long j10) {
        this.f15744a = f15742m;
        if (f5Var == null) {
            f5Var = f15743n;
        }
        this.f15745b = f5Var;
        this.f15746c = C.TIME_UNSET;
        this.f15747d = C.TIME_UNSET;
        this.f15748e = C.TIME_UNSET;
        this.f15749f = z10;
        this.f15750g = z11;
        this.f15751h = w1Var;
        this.f15753j = j10;
        this.f15754k = 0;
        this.l = 0;
        this.f15752i = false;
    }

    public final boolean b() {
        return this.f15751h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ih.class.equals(obj.getClass())) {
            return false;
        }
        ih ihVar = (ih) obj;
        return Objects.equals(this.f15744a, ihVar.f15744a) && Objects.equals(this.f15745b, ihVar.f15745b) && Objects.equals(this.f15751h, ihVar.f15751h) && this.f15746c == ihVar.f15746c && this.f15747d == ihVar.f15747d && this.f15748e == ihVar.f15748e && this.f15749f == ihVar.f15749f && this.f15750g == ihVar.f15750g && this.f15752i == ihVar.f15752i && this.f15753j == ihVar.f15753j && this.f15754k == ihVar.f15754k && this.l == ihVar.l;
    }

    public final int hashCode() {
        int iHashCode = ((this.f15744a.hashCode() + 217) * 31) + this.f15745b.hashCode();
        w1 w1Var = this.f15751h;
        int iHashCode2 = ((iHashCode * 961) + (w1Var == null ? 0 : w1Var.hashCode())) * 31;
        long j10 = this.f15746c;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f15747d;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f15748e;
        int i12 = ((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f15749f ? 1 : 0)) * 31) + (this.f15750g ? 1 : 0)) * 31) + (this.f15752i ? 1 : 0);
        long j13 = this.f15753j;
        return ((((((i12 * 961) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f15754k) * 31) + this.l) * 31;
    }
}
