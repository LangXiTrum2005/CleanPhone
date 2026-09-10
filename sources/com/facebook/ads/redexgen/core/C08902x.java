package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C08902x {
    public Uri A00;
    public List<Integer> A01;
    public Map<String, String> A02;
    public UUID A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public byte[] A07;

    @Deprecated
    public C08902x() {
        this.A02 = Collections.emptyMap();
        this.A01 = Collections.emptyList();
    }

    public final C08912y A08() {
        return new C08912y(this);
    }
}
