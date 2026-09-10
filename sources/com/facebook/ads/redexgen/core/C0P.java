package com.facebook.ads.redexgen.core;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0p, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C0p extends C0y {
    @Override // com.facebook.ads.redexgen.core.Q2
    public final Object A00(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z2, z3);
    }

    @Override // com.facebook.ads.redexgen.core.Q2
    public final Object A01(int i2, int i3, boolean z2, int i4) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z2, i4);
    }
}
