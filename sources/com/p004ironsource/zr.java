package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.p004ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;

/* JADX INFO: loaded from: classes5.dex */
public class zr extends r7<t2> implements RewardedVideoAdListener {
    public zr(vq vqVar, k1 k1Var, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, m5 m5Var, t2 t2Var) {
        super(vqVar, k1Var, baseAdAdapter, new a3(k1Var.g(), k1Var.g().getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), m5Var, t2Var);
    }
}
