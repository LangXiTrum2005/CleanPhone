package com.bytedance.sdk.openadsdk.core.lk;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.OY.brP;
import com.bytedance.sdk.openadsdk.core.model.tD;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends lk {
    public LD(@NonNull Context context, tD tDVar, AdSlot adSlot) {
        super(context, tDVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lk.lk
    public void Lxb() {
        brP brp = new brP(this.Lxb, this.lk, this.ZU, this.lc);
        this.LD = brp;
        addView(brp, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.JXs;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    public com.bytedance.sdk.openadsdk.multipro.LD.Lxb getVideoModel() {
        com.bytedance.sdk.openadsdk.core.OY.tD tDVar = this.LD;
        if (tDVar != null) {
            return ((brP) tDVar).getVideoModel();
        }
        return null;
    }
}
