package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.63, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass63 extends ViewGroup.MarginLayoutParams {
    public C6K A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;

    public AnonymousClass63(int i, int i2) {
        super(i, i2);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public AnonymousClass63(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public AnonymousClass63(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public AnonymousClass63(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public AnonymousClass63(AnonymousClass63 anonymousClass63) {
        super((ViewGroup.LayoutParams) anonymousClass63);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public final int A00() {
        return this.A00.A0I();
    }

    public final boolean A01() {
        return this.A00.A0d();
    }

    public final boolean A02() {
        return this.A00.A0a();
    }

    public final boolean A03() {
        return this.A00.A0Z();
    }
}
