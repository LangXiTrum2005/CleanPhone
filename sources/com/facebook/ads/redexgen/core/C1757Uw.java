package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1757Uw {
    public final View A00;
    public final C2296ge A01;
    public final VA A02;
    public final String A03;
    public final HashMap<String, String> A04 = new HashMap<>();
    public final boolean A05;
    public final boolean A06;

    public C1757Uw(C2296ge c2296ge, View view, String str, boolean z2, boolean z3) {
        this.A03 = str;
        this.A01 = c2296ge;
        this.A02 = c2296ge.A0A();
        this.A00 = view;
        this.A05 = z3;
        this.A06 = z2;
    }

    public final View A00() {
        return this.A00;
    }

    public final C2296ge A01() {
        return this.A01;
    }

    public final VA A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }

    public final Map<String, String> A04() {
        return Collections.unmodifiableMap(this.A04);
    }

    public final boolean A05() {
        return this.A05;
    }

    public final boolean A06() {
        return this.A06;
    }
}
