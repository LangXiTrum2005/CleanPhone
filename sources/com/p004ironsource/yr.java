package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.IronSourceSegment;
import com.p004ironsource.mediationsdk.LoadWhileShowSupportState;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class yr extends q7<zr> {
    public yr(List<NetworkSettings> list, bs bsVar, String str, boolean z2, xk xkVar, IronSourceSegment ironSourceSegment) {
        super(new wr(str, list, bsVar, z2), xkVar, ironSourceSegment);
    }

    @Override // com.p004ironsource.p7
    public LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return ((AdapterSettingsInterface) adapterBaseInterface).getLoadWhileShowSupportedState(networkSettings);
    }

    public zr b(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, int i2, String str, m5 m5Var) {
        return new zr(this, new k1(IronSource.AD_UNIT.REWARDED_VIDEO, this.o.getUserId(), i2, this.g, str, this.f26462e, this.f, networkSettings, this.o.getSmashLoadTimeout()), baseAdAdapter, m5Var, this);
    }

    @Override // com.p004ironsource.p7
    public j2 g() {
        return new es();
    }

    @Override // com.p004ironsource.p7
    public String l() {
        return IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    @Override // com.p004ironsource.p7
    public String o() {
        return IronSourceConstants.OPW_RV_MANAGER_NAME;
    }

    @Override // com.p004ironsource.p7
    public boolean q() {
        return this.o.getLoadingData().a() == m2.a.MANUAL;
    }

    @Override // com.p004ironsource.p7
    public boolean t() {
        return this.o.getLoadingData().a() == m2.a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    @Override // com.p004ironsource.p7
    public /* bridge */ /* synthetic */ s7 a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i2, String str, m5 m5Var) {
        return b(networkSettings, (BaseAdAdapter<?, AdapterAdRewardListener>) baseAdAdapter, i2, str, m5Var);
    }

    @Override // com.p004ironsource.p7
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getRewardedVideoSettings();
    }

    @Override // com.p004ironsource.p7
    public void a(IronSourceError ironSourceError) {
        m2.a aVarA = this.o.getLoadingData().a();
        if (aVarA == m2.a.AUTOMATIC_LOAD_AFTER_CLOSE || aVarA == m2.a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.t.a(false, (AdInfo) null);
        } else {
            super.a(ironSourceError);
        }
    }
}
