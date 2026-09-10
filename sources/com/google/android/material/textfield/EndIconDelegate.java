package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes4.dex */
abstract class EndIconDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f19511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EndCompoundLayout f19512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f19513c;
    public final CheckableImageButton d;

    public EndIconDelegate(EndCompoundLayout endCompoundLayout) {
        this.f19511a = endCompoundLayout.e0;
        this.f19512b = endCompoundLayout;
        this.f19513c = endCompoundLayout.getContext();
        this.d = endCompoundLayout.k0;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManagerCompat.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i2) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof DropdownMenuEndIconDelegate;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void p(boolean z2) {
    }

    public final void q() {
        this.f19512b.f(false);
    }

    public void r() {
    }

    public void s() {
    }

    public void a() {
    }

    public void b() {
    }

    public void n(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }
}
