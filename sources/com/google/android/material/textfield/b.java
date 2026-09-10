package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f19534Y;

    public /* synthetic */ b(EndIconDelegate endIconDelegate, int i2) {
        this.X = i2;
        this.f19534Y = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.X) {
            case 0:
                ClearTextEndIconDelegate clearTextEndIconDelegate = (ClearTextEndIconDelegate) this.f19534Y;
                clearTextEndIconDelegate.t(clearTextEndIconDelegate.u());
                break;
            default:
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) this.f19534Y;
                dropdownMenuEndIconDelegate.f19504l = z2;
                dropdownMenuEndIconDelegate.q();
                if (!z2) {
                    dropdownMenuEndIconDelegate.t(false);
                    dropdownMenuEndIconDelegate.m = false;
                }
                break;
        }
    }
}
