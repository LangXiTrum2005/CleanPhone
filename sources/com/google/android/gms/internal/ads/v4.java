package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v4 extends x4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21019d;

    public v4(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.f21017b = str;
        this.f21018c = str2;
        this.f21019d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v4.class == obj.getClass()) {
            v4 v4Var = (v4) obj;
            if (Objects.equals(this.f21018c, v4Var.f21018c) && Objects.equals(this.f21017b, v4Var.f21017b) && Objects.equals(this.f21019d, v4Var.f21019d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f21018c.hashCode() + ((this.f21017b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        String str = this.f21019d;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.x4
    public final String toString() {
        String str = this.f21738a;
        int length = String.valueOf(str).length();
        String str2 = this.f21019d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f21017b;
        int length3 = str3.length() + length + 11 + 14;
        String str4 = this.f21018c;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 7 + length2);
        d5.u.r(sb2, str, ": language=", str3, ", description=");
        return q4.a.j(sb2, str4, ", text=", str2);
    }
}
