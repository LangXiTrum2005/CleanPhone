package com.scwang.smart.refresh.layout.constant;

/* JADX INFO: loaded from: classes5.dex */
public class SpinnerStyle {
    public static final SpinnerStyle d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SpinnerStyle f33545e;
    public static final SpinnerStyle f;
    public static final SpinnerStyle g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SpinnerStyle[] f33546h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f33548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33549c;

    static {
        SpinnerStyle spinnerStyle = new SpinnerStyle(0, true, false);
        d = spinnerStyle;
        SpinnerStyle spinnerStyle2 = new SpinnerStyle(1, true, true);
        SpinnerStyle spinnerStyle3 = new SpinnerStyle(2, false, false);
        f33545e = spinnerStyle3;
        SpinnerStyle spinnerStyle4 = new SpinnerStyle(3, true, false);
        f = spinnerStyle4;
        SpinnerStyle spinnerStyle5 = new SpinnerStyle(4, true, false);
        g = spinnerStyle5;
        f33546h = new SpinnerStyle[]{spinnerStyle, spinnerStyle2, spinnerStyle3, spinnerStyle4, spinnerStyle5};
    }

    public SpinnerStyle(int i2, boolean z2, boolean z3) {
        this.f33547a = i2;
        this.f33548b = z2;
        this.f33549c = z3;
    }
}
