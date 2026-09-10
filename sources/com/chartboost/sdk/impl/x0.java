package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15499c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GradientDrawable f15500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t5 f15501b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Context context, AttributeSet attributeSet, int i2, GradientDrawable backgroundDrawable, t5 densityProvider) {
        super(context, attributeSet, i2);
        Intrinsics.f(context, "context");
        Intrinsics.f(backgroundDrawable, "backgroundDrawable");
        Intrinsics.f(densityProvider, "densityProvider");
        this.f15500a = backgroundDrawable;
        this.f15501b = densityProvider;
        a();
    }

    public final int a(double d) {
        return this.f15501b.a(d);
    }

    public final GradientDrawable getBackgroundDrawable() {
        return this.f15500a;
    }

    public final void setCornerRadius(int i2) {
        this.f15500a.setCornerRadius(i2);
    }

    public final int a(int i2) {
        return this.f15501b.a(i2);
    }

    public final void a(boolean z2) {
        setBackground(z2 ? this.f15500a : null);
    }

    public final void a() {
        GradientDrawable gradientDrawable = this.f15500a;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(16.0f);
        gradientDrawable.setColor(-15262682);
        setBackgroundColor(0);
        setBackground(this.f15500a);
    }

    public /* synthetic */ x0(Context context, AttributeSet attributeSet, int i2, GradientDrawable gradientDrawable, t5 t5Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? new GradientDrawable() : gradientDrawable, (i3 & 16) != 0 ? new n5(context) : t5Var);
    }
}
