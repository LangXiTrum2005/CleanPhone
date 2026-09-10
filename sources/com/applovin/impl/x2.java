package com.applovin.impl;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f9990a = new StringBuilder();

    public x2 a(String str, Object obj) {
        return a(str, obj, "");
    }

    public x2 b(String str) {
        this.f9990a.append(str);
        return this;
    }

    public String toString() {
        return this.f9990a.toString();
    }

    public x2 a(String str, Object obj, String str2) {
        StringBuilder sb2 = this.f9990a;
        sb2.append("\n");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append(str2);
        return this;
    }

    public x2 b(com.applovin.impl.sdk.ad.b bVar) {
        a("Target", bVar.W()).a("close_style", bVar.p()).a("close_delay_graphic", Long.valueOf(bVar.r()), "s");
        if (bVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) bVar;
            a("HTML", aVar.d1().substring(0, Math.min(aVar.d1().length(), 64)));
        }
        if (bVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(bVar.c0()), "s").a("skip_style", bVar.U()).a("Streaming", Boolean.valueOf(bVar.A0())).a("Video Location", bVar.I());
        }
        return this;
    }

    public x2 a(String str) {
        StringBuilder sb2 = this.f9990a;
        sb2.append("\n");
        sb2.append(str);
        return this;
    }

    public x2 a() {
        this.f9990a.append("\n========================================");
        return this;
    }

    public x2 a(com.applovin.impl.sdk.ad.b bVar) {
        boolean z10 = bVar instanceof r7;
        a("Format", bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null).a("Ad ID", Long.valueOf(bVar.getAdIdNumber())).a("Zone ID", bVar.getAdZone().e()).a("Ad Class", z10 ? "VastAd" : "AdServerAd");
        String dspName = bVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z10) {
            a("VAST DSP", ((r7) bVar).j1());
        }
        return this;
    }

    public x2 a(a3 a3Var) {
        return a(AndroidInitializeBoldSDK.MSG_NETWORK, a3Var.c()).a("Adapter Version", a3Var.A()).a("Format", a3Var.getFormat().getLabel()).a("Ad Unit ID", a3Var.getAdUnitId()).a("Placement", a3Var.getPlacement()).a("Network Placement", a3Var.U()).a("Serve ID", a3Var.T()).a("Creative ID", StringUtils.isValidString(a3Var.getCreativeId()) ? a3Var.getCreativeId() : "None").a("Ad Domain", StringUtils.isValidString(a3Var.v()) ? a3Var.v() : "None").a("DSP Name", StringUtils.isValidString(a3Var.getDspName()) ? a3Var.getDspName() : "None").a("DSP ID", StringUtils.isValidString(a3Var.getDspId()) ? a3Var.getDspId() : "None").a("Server Parameters", a3Var.l());
    }

    public x2 a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", g8.a(appLovinAdView.getVisibility()));
    }

    public x2 a(com.applovin.impl.sdk.l lVar) {
        return a("Muted", Boolean.valueOf(lVar.p0().isMuted()));
    }

    public x2 a(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                a(str, bundle.get(str));
            }
        }
        return this;
    }
}
