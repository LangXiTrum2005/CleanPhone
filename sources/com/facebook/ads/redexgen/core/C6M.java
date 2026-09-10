package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6M extends AbstractC1461Jg {
    public ZI A00;
    public InterfaceC2062cq A01;
    public C2141e8 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public RelativeLayout A06;
    public C1376Fy A07;
    public final C2300gi A08;
    public final EA A09;
    public final E4 A0A;
    public final E2 A0B;
    public final E0 A0C;
    public final AbstractC1318Dr A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final C2017c7 A0I;
    public static String[] A0J = {"MpRqvkZj1q70y", "JmeA7cKwz52Cf66UfzrPr0LMRH4SYAx7", "6sdDVsKAMYqDcEUPGSGZSzHS1QCr5tGd", "kTGZxaoWJV94XtNMqSwvdL", "Mc6tnSsqpweEwwZBrEzxWewdD5U0ZBnH", "pH8A6EuZ6tOwC2LEaYgoPeYfMAE", "hIXMP87egv28CzL5Z81pRvvAccgq29VA", "kjeLkimcHFb7T02SebLVQF"};
    public static final int A0L = (int) (XX.A02 * 0.0f);
    public static final int A0M = (int) (XX.A02 * 9.0f);
    public static final int A0K = (int) (XX.A02 * 9.0f);

    public C6M(C2017c7 c2017c7, boolean z2, String str, C1376Fy c1376Fy) {
        super(c2017c7, z2);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new AbstractC1318Dr() { // from class: com.facebook.ads.redexgen.X.6S
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C1319Ds c1319Ds) {
                if (this.A00.getVideoView() != null) {
                    this.A00.A07.A0P().setVolume(this.A00.getVideoView().getVolume());
                }
            }
        };
        this.A09 = new EA() { // from class: com.facebook.ads.redexgen.X.6R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4K c4k) {
                this.A00.A01();
                Object tag = this.A00.getTag(-1593835536);
                if (tag != null) {
                    this.A00.A07.A0N().AGM(((Integer) tag).intValue());
                }
            }
        };
        this.A0B = new E2() { // from class: com.facebook.ads.redexgen.X.6Q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E3 e3) {
                this.A00.A00();
                this.A00.A07.A0O().AGY(this.A00);
            }
        };
        this.A0A = new E4() { // from class: com.facebook.ads.redexgen.X.6O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4B c4b) {
                this.A00.A01();
                this.A00.A07.A0O().AGW(this.A00);
            }
        };
        this.A0C = new E0() { // from class: com.facebook.ads.redexgen.X.6N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E1 e1) {
                this.A00.A05 = true;
                this.A00.A02();
            }
        };
        this.A0I = c2017c7;
        this.A07 = c1376Fy;
        this.A0E = str;
        this.A08 = c2017c7.A06();
        setGravity(17);
        setPadding(A0L, 0, A0L, A0L);
        YB.A0N(this, 0);
        setUpView(this.A08);
        this.A0F = new Paint();
        this.A0F.setColor(-16777216);
        this.A0F.setStyle(Paint.Style.FILL);
        this.A0F.setAlpha(16);
        this.A0F.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        if (this.A0I.A0E() != null && this.A02 != null) {
            DZ dzA0E = this.A0I.A0E();
            C1337Ek simpleVideoView = this.A02.getSimpleVideoView();
            if (A0J[2].charAt(30) != 'G') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[6] = "7Tm7E6hvxl2lrINlaGqN4b4kJs9I709m";
            strArr[1] = "njm7q4dCrj2NJr9FsCrNNlLowJdEGDJD";
            dzA0E.AAv(simpleVideoView);
            if (C1750Up.A2L(getContext())) {
                this.A0I.A0E().A09(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A0I.A0E() != null) {
            this.A0I.A0E().A06();
            if (this.A02 != null) {
                this.A0I.A0E().AKV(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    public void A02() {
        if (this.A01 == null) {
            return;
        }
        if (!A1V()) {
            if (!A1V()) {
                return;
            } else {
                return;
            }
        }
        boolean z2 = this.A05;
        if (A0J[4].charAt(16) == 'S') {
            throw new RuntimeException();
        }
        A0J[4] = "H2PvwmHOgvOi5klEuL8elNjNTBtJADxS";
        if (!z2) {
            if (!A1V() || !this.A04) {
                return;
            }
        }
        this.A01.ACz();
    }

    private void A03(View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        YB.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final boolean A0A() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final boolean A1O() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1461Jg
    public final void A1R() {
        if (A1V() && this.A02 != null) {
            C2141e8 c2141e8 = this.A02;
            if (A0J[4].charAt(16) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[0] = "PPsdw83Xwgr8n";
            strArr[5] = "5ciU0wOzbld7CiHKSmuHpDfStOE";
            c2141e8.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1461Jg
    public final void A1S() {
        if (A1V()) {
            A1T();
            if (this.A02 != null) {
                this.A02.A05(EnumC2187et.A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1461Jg
    public final void A1T() {
        float volume = this.A07.A0P().getVolume();
        if (!A1V() || this.A02 == null) {
            return;
        }
        float newVolume = this.A02.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1461Jg
    public final boolean A1U() {
        return A1V() && this.A02 != null && this.A02.A06();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1461Jg
    public final boolean A1V() {
        return this.A03;
    }

    public final void A1W(Map<String, String> extraParams) {
        if (this.A02 != null) {
            this.A02.A02();
            if (A1V()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    public final C2141e8 getVideoView() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i2 = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z2 = radius == 1;
        if (z2) {
            i2 = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i2, i2, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        RectF rectF = this.A0H;
        int radius2 = A0L;
        float f = radius2;
        int width = getWidth();
        int radius3 = A0L;
        float f2 = width - radius3;
        int height = getHeight();
        int radius4 = A0L;
        rectF.set(f, 0.0f, f2, height - radius4);
        if (z2) {
            i2 = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i2, i2, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setCTAInfo(C1560Nc c1560Nc, Map<String, String> extraData) {
        getCtaButton().setCta(c1560Nc, this.A0E, extraData);
    }

    public void setImageUrl(String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(0);
            new LM(this.A00, this.A08).A04().A06(new C1485Ke(this)).A07(str);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z2) {
        this.A03 = z2;
    }

    public void setOnAssetsLoadedListener(InterfaceC2062cq interfaceC2062cq) {
        this.A01 = interfaceC2062cq;
    }

    public void setUpImageView(C2300gi c2300gi) {
        this.A00 = new ZI(c2300gi);
        if (C1750Up.A1J(c2300gi)) {
            AbstractC1960bC.A00(this.A00, C1750Up.A1K(c2300gi), new ViewOnClickListenerC1986bc(this));
        }
        A04(this.A00);
    }

    public void setUpMediaContainer(C2300gi c2300gi) {
        this.A06 = new RelativeLayout(c2300gi);
        A04(this.A06);
        if (this.A00 != null) {
            this.A06.addView(this.A00);
            A03(this.A00);
        }
        if (this.A02 != null) {
            this.A06.addView(this.A02);
            A03(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C2300gi c2300gi) {
        this.A02 = new C2141e8(c2300gi, new VI(this.A0E, getAdEventManager()));
        if (C1750Up.A1L(c2300gi)) {
            AbstractC1960bC.A00(this.A02, C1750Up.A1M(c2300gi), new ViewOnClickListenerC1987bd(this));
        }
        C2141e8 c2141e8 = this.A02;
        if (A0J[2].charAt(30) != 'G') {
            throw new RuntimeException();
        }
        A0J[4] = "tNSgYVifT5FMSy2OwNBjuNxtKDkDnPPF";
        A04(c2141e8);
    }

    private void setUpView(C2300gi c2300gi) {
        setUpImageView(c2300gi);
        setUpVideoView(c2300gi);
        setUpMediaContainer(c2300gi);
    }

    public void setVideoPlaceholderUrl(String str) {
        if (this.A02 != null) {
            this.A02.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(8);
        }
        C2141e8 c2141e8 = this.A02;
        String[] strArr = A0J;
        if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
            throw new RuntimeException();
        }
        A0J[2] = "Key351avhXFGNIES0xzUdjVz8AR1nkGO";
        if (c2141e8 != null) {
            this.A02.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
