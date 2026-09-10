package com.vungle.ads.internal.ui;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ VungleWebClient f42866Y;
    public final /* synthetic */ WebView Z;

    public /* synthetic */ b(VungleWebClient vungleWebClient, WebView webView, int i2) {
        this.X = i2;
        this.f42866Y = vungleWebClient;
        this.Z = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                VungleWebClient.m3263shouldOverrideUrlLoading$lambda16$lambda11(this.f42866Y, this.Z);
                break;
            case 1:
                VungleWebClient.m3269shouldOverrideUrlLoading$lambda16$lambda8$lambda7(this.f42866Y, this.Z);
                break;
            case 2:
                VungleWebClient.m3262shouldOverrideUrlLoading$lambda16$lambda10$lambda9(this.f42866Y, this.Z);
                break;
            case 3:
                VungleWebClient.m3265shouldOverrideUrlLoading$lambda16$lambda15$lambda14$lambda13(this.f42866Y, this.Z);
                break;
            case 4:
                VungleWebClient.m3266shouldOverrideUrlLoading$lambda16$lambda6(this.f42866Y, this.Z);
                break;
            case 5:
                VungleWebClient.m3268shouldOverrideUrlLoading$lambda16$lambda8(this.f42866Y, this.Z);
                break;
            default:
                VungleWebClient.m3261shouldOverrideUrlLoading$lambda16$lambda10(this.f42866Y, this.Z);
                break;
        }
    }
}
