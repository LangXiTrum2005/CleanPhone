package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1972e8 extends FrameLayout {
    public static final int A08 = XV.A0b;
    public C09736e A00;
    public C1178Eu A01;
    public C4L A02;
    public C1137Df A03;
    public C3S A04;
    public AnonymousClass34 A05;
    public final C2131gi A06;
    public final VI A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A04(VA va, String str, Map<String, String> map) {
        A02();
        this.A02 = new C4L(this.A06, va, this.A00, str, null, map);
        if (C1581Up.A20(this.A06)) {
            this.A01 = new C1178Eu(this.A06, va, this.A00, str, false, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C1972e8(C2131gi c2131gi, VI vi) {
        super(c2131gi);
        this.A07 = vi;
        this.A06 = c2131gi;
        setUpView(c2131gi);
    }

    public final void A01() {
        A0i(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A07();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0p();
            this.A02 = null;
        }
    }

    public final void A03(UN un) {
        getEventBus().A05(un);
    }

    public final void A05(EnumC2018et enumC2018et) {
        A0e(enumC2018et, 13);
    }

    public final boolean A06() {
        return A0p();
    }

    public C1168Ek getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C2131gi c2131gi) {
        A0Y();
        this.A04 = new C3S(c2131gi);
        A0f(this.A04);
        this.A03 = new C1137Df(c2131gi, this.A07);
        A0f(new C09073q(c2131gi));
        A0f(this.A03);
        this.A05 = new AnonymousClass34(c2131gi, true, this.A07);
        A0f(this.A05);
        A0f(new C1139Dh(this.A05, EnumC2034f9.A02, true, true));
        if (!A0k()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        addView(this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6e] */
    private void setUpVideo(final C2131gi c2131gi) {
        this.A00 = new C1168Ek(c2131gi) { // from class: com.facebook.ads.redexgen.X.6e
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i, int i2) {
                int newWidthSpec = View.MeasureSpec.getMode(i);
                if (newWidthSpec == 1073741824) {
                    i2 = i;
                } else {
                    int newWidthSpec2 = View.MeasureSpec.getMode(i2);
                    if (newWidthSpec2 == 1073741824) {
                        i = i2;
                    }
                }
                super.onMeasure(i, i2);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        YB.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC1971e7(this));
    }

    private void setUpView(C2131gi c2131gi) {
        setUpVideo(c2131gi);
        setUpPlugins(c2131gi);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f) {
        setVolume(f);
        this.A03.A09();
    }
}
