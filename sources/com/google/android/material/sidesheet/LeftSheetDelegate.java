package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
final class LeftSheetDelegate extends SheetDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior f19475a;

    public LeftSheetDelegate(SideSheetBehavior sideSheetBehavior) {
        this.f19475a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final float b(int i2) {
        float fE = e();
        return (i2 - fE) / (d() - fE);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int d() {
        SideSheetBehavior sideSheetBehavior = this.f19475a;
        return Math.max(0, sideSheetBehavior.o0 + sideSheetBehavior.p0);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int e() {
        SideSheetBehavior sideSheetBehavior = this.f19475a;
        return (-sideSheetBehavior.m0) - sideSheetBehavior.p0;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int f() {
        return this.f19475a.p0;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int g() {
        return -this.f19475a.m0;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int h(View view) {
        return view.getRight() + this.f19475a.p0;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int j() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean k(float f) {
        return f > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean l(View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean m(float f, float f2) {
        if (Math.abs(f) <= Math.abs(f2)) {
            return false;
        }
        float fAbs = Math.abs(f);
        this.f19475a.getClass();
        return fAbs > ((float) 500);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean n(View view, float f) {
        float left = view.getLeft();
        SideSheetBehavior sideSheetBehavior = this.f19475a;
        float fAbs = Math.abs((f * sideSheetBehavior.l0) + left);
        sideSheetBehavior.getClass();
        return fAbs > 0.5f;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        marginLayoutParams.leftMargin = i2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3) {
        if (i2 <= this.f19475a.n0) {
            marginLayoutParams.leftMargin = i3;
        }
    }
}
