package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.p0;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinWebViewBase extends WebView {
    public AppLovinWebViewBase(Context context) {
        super(context);
    }

    public void applySettings(com.applovin.impl.sdk.ad.b bVar) {
        Boolean boolM;
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
        int iL0 = bVar.l0();
        if (iL0 >= 0) {
            setLayerType(iL0, null);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(bVar.C());
        if (bVar.B0()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        l lVarM0 = bVar.m0();
        if (lVarM0 != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState pluginStateB = lVarM0.b();
            if (pluginStateB != null) {
                settings.setPluginState(pluginStateB);
            }
            Boolean boolE = lVarM0.e();
            if (boolE != null) {
                settings.setAllowFileAccess(boolE.booleanValue());
            }
            Boolean boolI = lVarM0.i();
            if (boolI != null) {
                settings.setLoadWithOverviewMode(boolI.booleanValue());
            }
            Boolean boolQ = lVarM0.q();
            if (boolQ != null) {
                settings.setUseWideViewPort(boolQ.booleanValue());
            }
            Boolean boolD = lVarM0.d();
            if (boolD != null) {
                settings.setAllowContentAccess(boolD.booleanValue());
            }
            Boolean boolP = lVarM0.p();
            if (boolP != null) {
                settings.setBuiltInZoomControls(boolP.booleanValue());
            }
            Boolean boolH = lVarM0.h();
            if (boolH != null) {
                settings.setDisplayZoomControls(boolH.booleanValue());
            }
            Boolean boolL = lVarM0.l();
            if (boolL != null) {
                settings.setSaveFormData(boolL.booleanValue());
            }
            Boolean boolC = lVarM0.c();
            if (boolC != null) {
                settings.setGeolocationEnabled(boolC.booleanValue());
            }
            Boolean boolJ = lVarM0.j();
            if (boolJ != null) {
                settings.setNeedInitialFocus(boolJ.booleanValue());
            }
            Boolean boolF = lVarM0.f();
            if (boolF != null) {
                settings.setAllowFileAccessFromFileURLs(boolF.booleanValue());
            }
            Boolean boolG = lVarM0.g();
            if (boolG != null) {
                settings.setAllowUniversalAccessFromFileURLs(boolG.booleanValue());
            }
            Boolean boolO = lVarM0.o();
            if (boolO != null) {
                settings.setLoadsImagesAutomatically(boolO.booleanValue());
            }
            Boolean boolN = lVarM0.n();
            if (boolN != null) {
                settings.setBlockNetworkImage(boolN.booleanValue());
            }
            Integer numA = lVarM0.a();
            if (numA != null) {
                settings.setMixedContentMode(numA.intValue());
            }
            Boolean boolK = lVarM0.k();
            if (boolK != null) {
                settings.setOffscreenPreRaster(boolK.booleanValue());
            }
            if (!p0.h() || (boolM = lVarM0.m()) == null) {
                return;
            }
            settings.setAlgorithmicDarkeningAllowed(boolM.booleanValue());
        }
    }
}
