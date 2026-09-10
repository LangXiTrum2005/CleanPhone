package com.p004ironsource;

import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.p;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.t2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class r7<Listener extends t2> extends o7<Listener> implements AdapterAdRewardListener {
    private ib r;

    public class a extends ks {
        public a() {
        }

        @Override // com.p004ironsource.ks
        public void a() {
            r7.this.U();
        }
    }

    public r7(vq vqVar, k1 k1Var, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, a3 a3Var, m5 m5Var, Listener listener) {
        super(vqVar, k1Var, baseAdAdapter, a3Var, m5Var, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.g == null) {
            IronLog.INTERNAL.verbose(a("placement is null "));
            c2 c2Var = this.d;
            if (c2Var != null) {
                c2Var.j.g("mCurrentPlacement is null state = " + this.f26762e);
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose(a("placement name = " + j()));
        if (this.d != null) {
            HashMap map = new HashMap();
            if (p.j().p() != null) {
                for (String str : p.j().p().keySet()) {
                    map.put(android.support.v4.media.a.C("custom_", str), p.j().p().get(str));
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.d.f24488i.a(j(), this.g.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME java.lang.String(), this.g.getRewardAmount(), jCurrentTimeMillis, IronSourceUtils.getTransId(jCurrentTimeMillis, c()), ib.a(this.r), map, p.j().i());
        }
        ((t2) this.f26760b).a((r7<?>) this, this.g);
    }

    @Override // com.p004ironsource.o7, com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.r = new ib();
        super.onAdClosed();
    }

    @Override // com.p004ironsource.s7, com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        this.r = null;
        super.onAdOpened();
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (u().c()) {
            u().a(new a());
        } else {
            U();
        }
    }
}
