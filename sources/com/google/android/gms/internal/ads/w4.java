package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w4 extends x4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f21405e;

    public w4(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.f21402b = str;
        this.f21403c = str2;
        this.f21404d = str3;
        this.f21405e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w4.class == obj.getClass()) {
            w4 w4Var = (w4) obj;
            if (Objects.equals(this.f21402b, w4Var.f21402b) && Objects.equals(this.f21403c, w4Var.f21403c) && Objects.equals(this.f21404d, w4Var.f21404d) && Arrays.equals(this.f21405e, w4Var.f21405e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f21402b;
        return Arrays.hashCode(this.f21405e) + ((this.f21404d.hashCode() + ((this.f21403c.hashCode() + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.x4
    public final String toString() {
        String str = this.f21738a;
        int length = String.valueOf(str).length();
        String str2 = this.f21402b;
        int iR = l1.d.r(length, 11, String.valueOf(str2).length(), 11);
        String str3 = this.f21403c;
        int length2 = str3.length() + iR + 14;
        String str4 = this.f21404d;
        StringBuilder sb2 = new StringBuilder(str4.length() + length2);
        d5.u.r(sb2, str, ": mimeType=", str2, ", filename=");
        return q4.a.j(sb2, str3, ", description=", str4);
    }
}
