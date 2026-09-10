package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2074oL {
    public final InterfaceC2078oP A00;
    public final String A01;
    public final Collection<C2088oc> A02;
    public final Collection<C2088oc> A03;
    public final List<Rect> A04;

    public C2074oL(String str, InterfaceC2078oP interfaceC2078oP, List<Rect> rects, Collection<C2088oc> collection, Collection<C2088oc> collection2) {
        this.A01 = str;
        this.A00 = interfaceC2078oP;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
