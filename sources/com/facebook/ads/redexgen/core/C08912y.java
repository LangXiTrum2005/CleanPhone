package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C08912y {
    public final Uri A00;
    public final List<Integer> A01;

    @Deprecated
    public final List<Integer> A02;
    public final Map<String, String> A03;

    @Deprecated
    public final Map<String, String> A04;
    public final UUID A05;

    @Deprecated
    public final UUID A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A;

    public C08912y(C08902x c08902x) {
        byte[] bArrCopyOf;
        AbstractC09153y.A08((c08902x.A04 && c08902x.A00 == null) ? false : true);
        this.A05 = (UUID) AbstractC09153y.A01(c08902x.A03);
        this.A06 = this.A05;
        this.A00 = c08902x.A00;
        this.A04 = c08902x.A02;
        this.A03 = c08902x.A02;
        this.A08 = c08902x.A05;
        this.A07 = c08902x.A04;
        this.A09 = c08902x.A06;
        this.A02 = c08902x.A01;
        this.A01 = c08902x.A01;
        if (c08902x.A07 != null) {
            bArrCopyOf = Arrays.copyOf(c08902x.A07, c08902x.A07.length);
        } else {
            bArrCopyOf = null;
        }
        this.A0A = bArrCopyOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08912y)) {
            return false;
        }
        C08912y c08912y = (C08912y) obj;
        if (this.A05.equals(c08912y.A05) && C5C.A1E(this.A00, c08912y.A00) && C5C.A1E(this.A03, c08912y.A03) && this.A08 == c08912y.A08 && this.A07 == c08912y.A07 && this.A09 == c08912y.A09 && this.A01.equals(c08912y.A01) && Arrays.equals(this.A0A, c08912y.A0A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.A05.hashCode() * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31) + this.A03.hashCode()) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + this.A01.hashCode()) * 31) + Arrays.hashCode(this.A0A);
    }
}
