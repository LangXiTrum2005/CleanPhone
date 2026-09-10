package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f19536Y;

    public /* synthetic */ d(Object obj, int i2) {
        this.X = i2;
        this.f19536Y = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                ((ClearTextEndIconDelegate) this.f19536Y).t(true);
                break;
            case 1:
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) this.f19536Y;
                boolean zIsPopupShowing = dropdownMenuEndIconDelegate.f19502h.isPopupShowing();
                dropdownMenuEndIconDelegate.t(zIsPopupShowing);
                dropdownMenuEndIconDelegate.m = zIsPopupShowing;
                break;
            default:
                ((TextInputLayout) this.f19536Y).h0.requestLayout();
                break;
        }
    }
}
