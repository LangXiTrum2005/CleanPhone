package com.thinkup.core.common.mn.oo.o;

import android.view.View;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUNativeAdInfo;
import com.thinkup.core.api.TUShakeViewListener;

/* JADX INFO: loaded from: classes6.dex */
public interface on extends TUNativeAdInfo {
    TUBaseAdAdapter m();

    TUNativeAdInfo.AdPrepareInfo n();

    View o(int i2, int i3, TUShakeViewListener tUShakeViewListener);

    BaseAd o();

    void o(TUNativeAdCustomRender tUNativeAdCustomRender);

    void o(TUNativeAdInfo.AdController adController);

    void o(com.thinkup.core.common.mn.m mVar);

    TUNativeAdCustomRender o0();
}
