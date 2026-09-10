package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class a2 extends x1 {
    public a2(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.l lVar) {
        super(bVar, activity, lVar);
    }

    @Override // com.applovin.impl.x1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f9988d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f9987c.n(), (this.f9987c.s0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.f9988d.addView(kVar, this.f9989e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f9988d);
        } else {
            this.f9986b.setContentView(this.f9988d);
        }
    }
}
