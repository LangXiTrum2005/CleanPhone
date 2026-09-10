package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u4 extends x4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f20618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x4[] f20619f;

    public u4(String str, boolean z10, boolean z11, String[] strArr, x4[] x4VarArr) {
        super(ChapterTocFrame.ID);
        this.f20615b = str;
        this.f20616c = z10;
        this.f20617d = z11;
        this.f20618e = strArr;
        this.f20619f = x4VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u4.class == obj.getClass()) {
            u4 u4Var = (u4) obj;
            if (this.f20616c == u4Var.f20616c && this.f20617d == u4Var.f20617d && Objects.equals(this.f20615b, u4Var.f20615b) && Arrays.equals(this.f20618e, u4Var.f20618e) && Arrays.equals(this.f20619f, u4Var.f20619f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20615b.hashCode() + (((((this.f20616c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f20617d ? 1 : 0)) * 31);
    }
}
