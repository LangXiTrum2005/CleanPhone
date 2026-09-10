package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes4.dex */
class ClickActionDelegate extends AccessibilityDelegateCompat {
    public final AccessibilityNodeInfoCompat.AccessibilityActionCompat d;

    public ClickActionDelegate(Context context, int i2) {
        this.d = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, context.getString(i2));
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f4417a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f4534a);
        accessibilityNodeInfoCompat.b(this.d);
    }
}
