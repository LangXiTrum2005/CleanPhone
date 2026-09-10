package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g22[] f17832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17833e;

    static {
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public ni(String str, g22... g22VarArr) {
        int length = g22VarArr.length;
        int i10 = 1;
        ps1.v(length > 0);
        this.f17830b = str;
        this.f17832d = g22VarArr;
        this.f17829a = length;
        String str2 = g22VarArr[0].f14678o;
        this.f17831c = TextUtils.isEmpty(str2) ? na.e(g22VarArr[0].f14677n) : na.e(str2);
        g22 g22Var = g22VarArr[0];
        String str3 = g22Var.f14668d;
        str3 = (str3 == null || str3.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str3;
        int i11 = g22Var.f14670f | Http2.INITIAL_MAX_FRAME_SIZE;
        while (true) {
            g22[] g22VarArr2 = this.f17832d;
            if (i10 >= g22VarArr2.length) {
                return;
            }
            g22 g22Var2 = g22VarArr2[i10];
            String str4 = g22Var2.f14668d;
            if (!str3.equals((str4 == null || str4.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str4)) {
                a(i10, "languages", g22VarArr2[0].f14668d, str4);
                return;
            } else {
                if (i11 != (g22Var2.f14670f | Http2.INITIAL_MAX_FRAME_SIZE)) {
                    a(i10, "role flags", Integer.toBinaryString(g22VarArr2[0].f14670f), Integer.toBinaryString(this.f17832d[i10].f14670f));
                    return;
                }
                i10++;
            }
        }
    }

    public static void a(int i10, String str, String str2, String str3) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i10).length() + 1);
        d5.u.r(sb2, "Different ", str, " combined in one TrackGroup: '", str2);
        sb2.append("' (track 0) and '");
        sb2.append(str3);
        sb2.append("' (track ");
        sb2.append(i10);
        sb2.append(")");
        v71.J("TrackGroup", "", new IllegalStateException(sb2.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ni.class == obj.getClass()) {
            ni niVar = (ni) obj;
            if (this.f17830b.equals(niVar.f17830b) && Arrays.equals(this.f17832d, niVar.f17832d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f17833e;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f17832d) + ((this.f17830b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        this.f17833e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string = Arrays.toString(this.f17832d);
        String str = this.f17830b;
        return q4.a.j(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length()), str, ": ", string);
    }
}
