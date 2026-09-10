package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r4 extends x4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f19367e;

    public r4(String str, String str2, int i10, byte[] bArr) {
        super(ApicFrame.ID);
        this.f19364b = str;
        this.f19365c = str2;
        this.f19366d = i10;
        this.f19367e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.v7
    public final void a(o6 o6Var) {
        o6Var.b(this.f19366d, this.f19367e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r4.class == obj.getClass()) {
            r4 r4Var = (r4) obj;
            if (this.f19366d == r4Var.f19366d && Objects.equals(this.f19364b, r4Var.f19364b) && Objects.equals(this.f19365c, r4Var.f19365c) && Arrays.equals(this.f19367e, r4Var.f19367e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19364b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f19365c;
        return Arrays.hashCode(this.f19367e) + ((((((this.f19366d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.x4
    public final String toString() {
        String str = this.f21738a;
        int length = String.valueOf(str).length();
        String str2 = this.f19364b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f19365c;
        StringBuilder sb2 = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        d5.u.r(sb2, str, ": mimeType=", str2, ", description=");
        sb2.append(str3);
        return sb2.toString();
    }
}
