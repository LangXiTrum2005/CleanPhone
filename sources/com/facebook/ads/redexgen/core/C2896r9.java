package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.r9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2896r9 {
    public final InterfaceC2900rD A00;
    public final String A01;
    public final Collection<C2909rN> A02;
    public final Collection<C2909rN> A03;
    public final List<Rect> A04;

    public C2896r9(String str, InterfaceC2900rD interfaceC2900rD, List<Rect> rects, Collection<C2909rN> collection, Collection<C2909rN> collection2) {
        this.A01 = str;
        this.A00 = interfaceC2900rD;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
