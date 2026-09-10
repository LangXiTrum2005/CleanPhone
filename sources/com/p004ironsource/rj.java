package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.p004ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;

/* JADX INFO: loaded from: classes5.dex */
public class rj extends o7<h2> implements InterstitialAdListener {
    public rj(vq vqVar, k1 k1Var, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, m5 m5Var, h2 h2Var) {
        super(vqVar, k1Var, baseAdAdapter, new a3(k1Var.g(), k1Var.g().getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), m5Var, h2Var);
    }
}
