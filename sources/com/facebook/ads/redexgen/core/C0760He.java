package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.He, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0760He extends FrameLayout {
    public static final int A08 = (int) (CP.A02 * 16.0f);
    public C0868Li A00;
    public C1366cQ A01;
    public C0835Kb A02;
    public C1307bT A03;
    public KA A04;
    public IX A05;
    public final C1828k1 A06;
    public final AF A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A04(A7 a7, String str, Map<String, String> map) {
        A02();
        this.A02 = new C0835Kb(this.A06, a7, this.A00, str, null, map);
        if (C05789m.A1t(this.A06)) {
            this.A01 = new C1366cQ(this.A06, a7, this.A00, str, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C0760He(C1828k1 c1828k1, AF af) {
        super(c1828k1);
        this.A07 = af;
        this.A06 = c1828k1;
        setUpView(c1828k1);
    }

    public final void A01() {
        this.A00.A0k(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A05();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0p();
            this.A02 = null;
        }
    }

    public final void A03(C9K c9k) {
        this.A00.getEventBus().A05(c9k);
    }

    public final void A05(IP ip) {
        this.A00.A0g(ip, 13);
    }

    public final boolean A06() {
        return this.A00.A0r();
    }

    public C1361cL getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return this.A00.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C1828k1 c1828k1) {
        this.A00.A0a();
        this.A04 = new KA(c1828k1);
        this.A00.A0h(this.A04);
        this.A03 = new C1307bT(c1828k1, this.A07);
        this.A00.A0h(new KO(c1828k1));
        this.A00.A0h(this.A03);
        this.A05 = new IX(c1828k1, true, this.A07);
        this.A00.A0h(this.A05);
        this.A00.A0h(new C1311bX(this.A05, EnumC0787If.A02, true, true));
        if (!this.A00.A0m()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        this.A00.addView(this.A03);
    }

    private void setUpVideo(C1828k1 c1828k1) {
        this.A00 = new C0868Li(c1828k1);
        this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        D3.A0I(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC0759Hd(this));
    }

    private void setUpView(C1828k1 c1828k1) {
        setUpVideo(c1828k1);
        setUpPlugins(c1828k1);
    }

    public void setVideoURI(String str) {
        this.A00.setVideoURI(str);
    }

    public void setVolume(float f) {
        this.A00.setVolume(f);
        this.A03.A09();
    }
}
