package com.thinkup.core.common.inner.mixad.n;

import android.view.View;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ITUThirdPartyMaterial;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUNativeAdInfo;
import com.thinkup.core.api.TUShakeViewListener;
import com.thinkup.core.common.mn.oo.o.on;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements on {
    private ITUThirdPartyMaterial m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TUNativeAdInfo.AdPrepareInfo f41816n;
    private final BaseAd o;
    private TUNativeAdInfo.AdController o0;
    private com.thinkup.core.common.mn.m om;
    private TUNativeAdCustomRender oo;

    public n(BaseAd baseAd) {
        this.o = baseAd;
    }

    @Override // com.thinkup.core.api.TUNativeAdInfo
    public final TUNativeAdInfo.AdController getAdController() {
        return this.o0;
    }

    @Override // com.thinkup.core.api.TUNativeAdInfo
    public final ITUThirdPartyMaterial getAdMaterial() {
        BaseAd baseAd = this.o;
        if (baseAd == null) {
            return null;
        }
        if (this.m == null) {
            this.m = new o0(baseAd, this);
        }
        return this.m;
    }

    @Override // com.thinkup.core.common.mn.oo.o.on
    public final TUBaseAdAdapter m() {
        return null;
    }

    @Override // com.thinkup.core.common.mn.oo.o.on
    public final TUNativeAdInfo.AdPrepareInfo n() {
        return this.f41816n;
    }

    @Override // com.thinkup.core.common.mn.oo.o.on
    public final void o(TUNativeAdInfo.AdController adController) {
        this.o0 = adController;
    }

    @Override // com.thinkup.core.common.mn.oo.o.on
    public final TUNativeAdCustomRender o0() {
        return this.oo;
    }

    @Override // com.thinkup.core.api.TUNativeAdInfo
    public final void prepare(TUNativeAdInfo.AdPrepareInfo adPrepareInfo) {
        this.f41816n = adPrepareInfo;
    }

    @Override // com.thinkup.core.common.mn.oo.o.on
    public final BaseAd o() {
        return this.o;
    }

    @Override // com.thinkup.core.common.mn.oo.o.on
    public final void o(TUNativeAdCustomRender tUNativeAdCustomRender) {
        this.oo = tUNativeAdCustomRender;
    }

    @Override // com.thinkup.core.common.mn.oo.o.on
    public final void o(com.thinkup.core.common.mn.m mVar) {
        this.om = mVar;
    }

    @Override // com.thinkup.core.common.mn.oo.o.on
    public final View o(int i2, int i3, TUShakeViewListener tUShakeViewListener) {
        View shakeView;
        BaseAd baseAd = this.o;
        if (baseAd != null && (shakeView = baseAd.getShakeView(i2, i3, tUShakeViewListener)) != null) {
            return shakeView;
        }
        com.thinkup.core.common.mn.m mVar = this.om;
        if (mVar == null) {
            return null;
        }
        Object objO = mVar.o(i2, i3, tUShakeViewListener);
        if (objO instanceof View) {
            return (View) objO;
        }
        return null;
    }
}
