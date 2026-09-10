package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.IronSourceSegment;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class pj extends n7<rj, AdapterAdInteractionListener> {
    public pj(fg fgVar, eg egVar, List<NetworkSettings> list, uj ujVar, String str, xk xkVar, IronSourceSegment ironSourceSegment) {
        super(fgVar, egVar, new qj(str, list, ujVar), xkVar, ironSourceSegment);
    }

    @Override // com.p004ironsource.p7
    public /* bridge */ /* synthetic */ s7 a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i2, String str, m5 m5Var) {
        return b(networkSettings, (BaseAdAdapter<?, AdapterAdInteractionListener>) baseAdAdapter, i2, str, m5Var);
    }

    public rj b(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, int i2, String str, m5 m5Var) {
        return new rj(this, new k1(IronSource.AD_UNIT.INTERSTITIAL, this.o.getUserId(), i2, this.g, str, this.f26462e, this.f, networkSettings, this.o.getSmashLoadTimeout()), baseAdAdapter, m5Var, this);
    }

    @Override // com.p004ironsource.p7
    public j2 g() {
        return new yj();
    }

    @Override // com.p004ironsource.p7
    public String l() {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    @Override // com.p004ironsource.p7
    public String o() {
        return IronSourceConstants.OPW_IS_MANAGER_NAME;
    }

    public pj(List<NetworkSettings> list, uj ujVar, String str, xk xkVar, IronSourceSegment ironSourceSegment) {
        super(new qj(str, list, ujVar), xkVar, ironSourceSegment);
    }

    @Override // com.p004ironsource.p7
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getInterstitialSettings();
    }
}
