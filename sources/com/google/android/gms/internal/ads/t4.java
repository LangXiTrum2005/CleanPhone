package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t4 extends x4 implements k4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4[] f20161g;

    public t4(String str, int i10, int i11, long j10, long j11, x4[] x4VarArr) {
        String str2;
        super(ChapterFrame.ID);
        ps1.v(i10 <= i11);
        this.f20156b = str;
        this.f20157c = i10;
        this.f20158d = i11;
        int length = x4VarArr.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                str2 = null;
                break;
            }
            x4 x4Var = x4VarArr[i12];
            if (x4Var instanceof c5) {
                c5 c5Var = (c5) x4Var;
                ca1 ca1Var = c5Var.f13041c;
                if (c5Var.f21738a.equals("TIT2") && !ca1Var.isEmpty()) {
                    str2 = (String) ca1Var.get(0);
                    break;
                }
            }
            i12++;
        }
        if (str2 != null) {
            new i32(null, str2);
        }
        this.f20159e = j10;
        this.f20160f = j11;
        this.f20161g = x4VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t4.class == obj.getClass()) {
            t4 t4Var = (t4) obj;
            if (this.f20157c == t4Var.f20157c && this.f20158d == t4Var.f20158d && this.f20159e == t4Var.f20159e && this.f20160f == t4Var.f20160f && Objects.equals(this.f20156b, t4Var.f20156b) && Arrays.equals(this.f20161g, t4Var.f20161g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20156b.hashCode() + ((((((((this.f20157c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f20158d) * 31) + ((int) this.f20159e)) * 31) + ((int) this.f20160f)) * 31);
    }
}
