package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s4 extends x4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f19829b;

    public s4(String str, byte[] bArr) {
        super(str);
        this.f19829b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s4.class == obj.getClass()) {
            s4 s4Var = (s4) obj;
            if (this.f21738a.equals(s4Var.f21738a) && Arrays.equals(this.f19829b, s4Var.f19829b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19829b) + ((this.f21738a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }
}
