package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.r9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2727r9 {
    public final InterfaceC2731rD A00;
    public final String A01;
    public final Collection<C2740rN> A02;
    public final Collection<C2740rN> A03;
    public final List<Rect> A04;

    public C2727r9(String str, InterfaceC2731rD interfaceC2731rD, List<Rect> rects, Collection<C2740rN> collection2, Collection<C2740rN> collection3) {
        this.A01 = str;
        this.A00 = interfaceC2731rD;
        this.A04 = new ArrayList(rects);
        this.A02 = collection2;
        this.A03 = collection3;
    }
}
