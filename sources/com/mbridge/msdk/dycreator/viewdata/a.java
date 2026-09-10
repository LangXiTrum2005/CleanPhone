package com.mbridge.msdk.dycreator.viewdata;

import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements com.mbridge.msdk.dycreator.viewdata.base.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DyOption f33293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f33294b;

    public a(DyOption dyOption) {
        this.f33293a = dyOption;
        this.f33294b = dyOption.getCampaignEx();
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public CampaignEx getBindData() {
        return this.f33294b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public DyOption getEffectData() {
        return this.f33293a;
    }
}
