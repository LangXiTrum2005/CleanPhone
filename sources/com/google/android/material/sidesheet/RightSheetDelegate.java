package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
final class RightSheetDelegate extends SheetDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior f19476a;

    public RightSheetDelegate(SideSheetBehavior sideSheetBehavior) {
        this.f19476a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final float b(int i2) {
        float f = this.f19476a.n0;
        return (f - i2) / (f - d());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int d() {
        SideSheetBehavior sideSheetBehavior = this.f19476a;
        return Math.max(0, (sideSheetBehavior.n0 - sideSheetBehavior.m0) - sideSheetBehavior.p0);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int e() {
        return this.f19476a.n0;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int f() {
        return this.f19476a.n0;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int g() {
        return d();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int h(View view) {
        return view.getLeft() - this.f19476a.p0;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int j() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean k(float f) {
        return f < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean l(View view) {
        return view.getLeft() > (this.f19476a.n0 + d()) / 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean m(float f, float f2) {
        if (Math.abs(f) <= Math.abs(f2)) {
            return false;
        }
        float fAbs = Math.abs(f);
        this.f19476a.getClass();
        return fAbs > ((float) 500);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean n(View view, float f) {
        float right = view.getRight();
        SideSheetBehavior sideSheetBehavior = this.f19476a;
        float fAbs = Math.abs((f * sideSheetBehavior.l0) + right);
        sideSheetBehavior.getClass();
        return fAbs > 0.5f;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        marginLayoutParams.rightMargin = i2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3) {
        int i4 = this.f19476a.n0;
        if (i2 <= i4) {
            marginLayoutParams.rightMargin = i4 - i2;
        }
    }
}
