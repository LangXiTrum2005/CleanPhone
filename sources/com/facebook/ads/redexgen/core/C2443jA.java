package com.facebook.ads.redexgen.core;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2443jA implements InterfaceC1698Sp {
    public final C1572No A00;
    public final O3 A01;
    public final C1706Sx A02;
    public final C2300gi A03;
    public final boolean A04;

    public C2443jA(C2300gi c2300gi, O3 o3, C1706Sx c1706Sx, C1572No c1572No, boolean z2) {
        this.A03 = c2300gi;
        this.A01 = o3;
        this.A02 = c1706Sx;
        this.A00 = c1572No;
        this.A04 = z2;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        O4 playableWebViewClient = new O4(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0L());
        playableWebViewClient.A03();
    }

    private void A01(boolean z2) {
        if (this.A00.A0G() == EnumC1573Np.A05) {
            A00();
            return;
        }
        String strA0L = this.A00.A0L();
        if (z2) {
            C1706Sx c1706Sx = this.A02;
            String markupUrlResult = this.A00.A0L();
            strA0L = c1706Sx.A0S(markupUrlResult);
        }
        this.A00.A0T(strA0L);
        this.A01.AFG();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1698Sp
    public final void ADL() {
        if (this.A04) {
            this.A01.AFF(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1698Sp
    public final void ADT() {
        A01(true);
    }
}
