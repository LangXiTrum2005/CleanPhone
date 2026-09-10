package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityClickableSpanCompat extends ClickableSpan {
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final AccessibilityNodeInfoCompat f4531Y;
    public final int Z;

    public AccessibilityClickableSpanCompat(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i3) {
        this.X = i2;
        this.f4531Y = accessibilityNodeInfoCompat;
        this.Z = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.X);
        this.f4531Y.f4534a.performAction(this.Z, bundle);
    }
}
