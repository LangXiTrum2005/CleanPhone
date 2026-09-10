package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.ironsource.X3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class po1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f18749f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f18750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f18751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18754e;

    static {
        z5.a("media3.datasource");
    }

    public po1(Uri uri, long j10, long j11) {
        this(uri, Collections.EMPTY_MAP, j10, j11, 0);
    }

    public final String toString() {
        String string = this.f18750a.toString();
        int length = string.length();
        long j10 = this.f18752c;
        int length2 = String.valueOf(j10).length();
        long j11 = this.f18753d;
        int length3 = String.valueOf(j11).length();
        int i10 = this.f18754e;
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i10).length() + 1);
        wi.d.m(sb2, "DataSpec[GET ", string, ", ");
        sb2.append(j10);
        q4.a.r(sb2, ", ", j11, ", null, ");
        return l1.d.i(sb2, i10, X3.j.f27836e);
    }

    public po1(Uri uri, Map map, long j10, long j11, int i10) {
        boolean z10 = false;
        boolean z11 = j10 >= 0;
        ps1.v(z11);
        ps1.v(z11);
        if (j11 > 0) {
            z10 = true;
        } else if (j11 == -1) {
            j11 = -1;
            z10 = true;
        }
        ps1.v(z10);
        uri.getClass();
        this.f18750a = uri;
        this.f18751b = Collections.unmodifiableMap(new HashMap(map));
        this.f18752c = j10;
        this.f18753d = j11;
        this.f18754e = i10;
    }
}
