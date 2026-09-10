package com.facebook.ads.redexgen.core;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1561Nd implements Serializable {
    public static final long serialVersionUID = -2102939945352398575L;
    public long A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final List<String> A05;

    public C1561Nd(List<String> screenshots, long j, long j2, boolean z2, boolean z3, boolean z4) {
        this.A05 = screenshots;
        this.A00 = j;
        this.A01 = j2;
        this.A04 = z2;
        this.A02 = z3;
        this.A03 = z4;
    }

    public final long A00() {
        return this.A00;
    }

    public final long A01() {
        return this.A01;
    }

    public final List<String> A02() {
        return Collections.unmodifiableList(this.A05);
    }

    public final boolean A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }

    public final boolean A05() {
        return this.A04;
    }
}
