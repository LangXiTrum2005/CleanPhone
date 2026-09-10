package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11827s {
    public static final C11827s A01 = new C11827s(false);
    public final boolean A00;

    public C11827s(boolean z2) {
        this.A00 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.A00 == ((C11827s) obj).A00;
    }

    public final int hashCode() {
        return !this.A00 ? 1 : 0;
    }
}
