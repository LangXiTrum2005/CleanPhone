package com.thinkup.core.common.inner.mixad.shake;

import android.content.Context;
import android.view.View;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUSDKGlobalSetting;
import com.thinkup.core.api.TUShakeViewListener;
import com.thinkup.core.common.mn.m;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.oon;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements m {
    private BaseAd m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f41824n;
    private final int[] o = {22, 8, 15};
    private oon o0;

    public o(Context context, BaseAd baseAd, oon oonVar) {
        this.f41824n = context;
        this.m = baseAd;
        this.o0 = oonVar;
    }

    @Override // com.thinkup.core.common.mn.m
    public final com.thinkup.core.common.mn.o o(int i2, int i3, TUShakeViewListener tUShakeViewListener) {
        Boolean boolIsShakeEnabled;
        BaseAd baseAd = this.m;
        if (baseAd == null || this.f41824n == null) {
            return null;
        }
        n0 detail = baseAd.getDetail();
        int iN0n = detail != null ? detail.n0n() : 0;
        if (iN0n != 0 && (boolIsShakeEnabled = TUSDKGlobalSetting.isShakeEnabled(iN0n)) != null && !boolIsShakeEnabled.booleanValue()) {
            return null;
        }
        View shakeView = this.m.getShakeView(i2, i3, tUShakeViewListener);
        if (shakeView != null) {
            return new MixNativeAdNetworkShakeView(this.f41824n, shakeView, i2, i3);
        }
        int[] iArr = this.o;
        if (iArr != null) {
            for (int i4 : iArr) {
                if (i4 == iN0n) {
                    return null;
                }
            }
        }
        MixNativeAdShakeView mixNativeAdShakeView = new MixNativeAdShakeView(this.f41824n, this.o0, this.m.getNativeAdInteractionType());
        mixNativeAdShakeView.initView(i2, i3, tUShakeViewListener);
        return mixNativeAdShakeView;
    }

    private static boolean o(int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }
}
