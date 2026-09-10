package com.facebook.ads.redexgen.core;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class mQ implements InterfaceC05277l {
    public final C04042p A00;
    public final AnonymousClass33 A01;
    public final C05357t A02;
    public final C1828k1 A03;
    public final boolean A04;

    public mQ(C1828k1 c1828k1, AnonymousClass33 anonymousClass33, C05357t c05357t, C04042p c04042p, boolean z) {
        this.A03 = c1828k1;
        this.A01 = anonymousClass33;
        this.A02 = c05357t;
        this.A00 = c04042p;
        this.A04 = z;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        AnonymousClass34 playableWebViewClient = new AnonymousClass34(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0F());
        playableWebViewClient.A03();
    }

    private void A01(boolean z) {
        if (this.A00.A0A() == EnumC04052q.A05) {
            A00();
            return;
        }
        String strA0F = this.A00.A0F();
        if (z) {
            C05357t c05357t = this.A02;
            String markupUrlResult = this.A00.A0F();
            strA0F = c05357t.A0R(markupUrlResult);
        }
        this.A00.A0K(strA0F);
        this.A01.AEU();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05277l
    public final void ACa() {
        if (this.A04) {
            this.A01.AET(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05277l
    public final void ACj() {
        A01(true);
    }
}
