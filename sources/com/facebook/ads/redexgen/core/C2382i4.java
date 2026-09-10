package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2382i4 extends PK {
    @Override // com.facebook.ads.redexgen.core.PK
    public final View.AccessibilityDelegate A00(PL pl) {
        return new PI(this, pl);
    }

    @Override // com.facebook.ads.redexgen.core.PK
    public final Q8 A01(View.AccessibilityDelegate accessibilityDelegate, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new Q8(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.PK
    public final boolean A02(View.AccessibilityDelegate accessibilityDelegate, View view, int i2, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i2, bundle);
    }
}
