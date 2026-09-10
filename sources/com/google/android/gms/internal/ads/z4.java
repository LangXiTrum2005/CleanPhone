package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z4 extends x4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22490d;

    public z4(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.f22488b = str;
        this.f22489c = str2;
        this.f22490d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z4.class == obj.getClass()) {
            z4 z4Var = (z4) obj;
            if (Objects.equals(this.f22489c, z4Var.f22489c) && Objects.equals(this.f22488b, z4Var.f22488b) && Objects.equals(this.f22490d, z4Var.f22490d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22490d.hashCode() + ((this.f22489c.hashCode() + ((this.f22488b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.x4
    public final String toString() {
        String str = this.f21738a;
        int length = String.valueOf(str).length() + 9;
        String str2 = this.f22488b;
        int length2 = str2.length() + length + 14;
        String str3 = this.f22489c;
        StringBuilder sb2 = new StringBuilder(str3.length() + length2);
        d5.u.r(sb2, str, ": domain=", str2, ", description=");
        sb2.append(str3);
        return sb2.toString();
    }
}
