package com.facebook.ads.redexgen.core;

import java.io.Serializable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04203f implements Serializable {
    public C04193e A00;
    public C04193e A01;

    public C04203f() {
        this(0.5d, 0.5d);
    }

    public C04203f(double d) {
        this(d, 0.5d);
    }

    public C04203f(double d, double d2) {
        this.A00 = new C04193e(d);
        this.A01 = new C04193e(d2);
        A02();
    }

    public final C04193e A00() {
        return this.A00;
    }

    public final C04193e A01() {
        return this.A01;
    }

    public final void A02() {
        this.A00.A07();
        this.A01.A07();
    }

    public final void A03() {
        this.A00.A08();
        this.A01.A08();
    }

    public final void A04(double d, double d2) {
        this.A00.A09(d, d2);
    }

    public final void A05(double d, double d2) {
        this.A01.A09(d, d2);
    }
}
