package com.facebook.ads.redexgen.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04253k implements Serializable {
    public static final long serialVersionUID = -3209129042070173126L;
    public C04253k A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final List<C04253k> A04;

    public C04253k(int i, String str, String str2) {
        this.A04 = new ArrayList();
        this.A01 = i;
        this.A03 = str;
        this.A02 = str2;
    }

    public C04253k(String str) {
        this(0, null, str);
    }

    private void A00(C04253k c04253k) {
        this.A00 = c04253k;
    }

    public final int A01() {
        return this.A01;
    }

    public final C04253k A02() {
        return this.A00;
    }

    public final String A03() {
        return this.A02;
    }

    public final String A04() {
        return this.A03;
    }

    public final List<C04253k> A05() {
        return this.A04;
    }

    public final void A06(C04253k c04253k) {
        c04253k.A00(this);
        this.A04.add(c04253k);
    }
}
