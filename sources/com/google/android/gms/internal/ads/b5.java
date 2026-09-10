package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b5 extends x4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f12635c;

    public b5(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.f12634b = str;
        this.f12635c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b5.class == obj.getClass()) {
            b5 b5Var = (b5) obj;
            if (Objects.equals(this.f12634b, b5Var.f12634b) && Arrays.equals(this.f12635c, b5Var.f12635c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12635c) + ((this.f12634b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // com.google.android.gms.internal.ads.x4
    public final String toString() {
        String str = this.f21738a;
        int length = String.valueOf(str).length() + 8;
        String str2 = this.f12634b;
        return q4.a.j(new StringBuilder(str2.length() + length), str, ": owner=", str2);
    }
}
