package com.thinkup.core.common.mn.oo;

import android.content.Context;
import android.view.View;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.common.mn.oo.o.m;
import com.thinkup.core.common.on.n0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o implements m {
    private com.thinkup.core.common.on.o adCacheInfo;
    private int clickType;
    private int clickedArea;

    public o() {
    }

    public int getClickType() {
        return this.clickType;
    }

    public int getClickedArea() {
        return this.clickedArea;
    }

    @Override // com.thinkup.core.common.mn.oo.o.m
    public void onAdClicked(View view) {
        TUBaseAdAdapter tUBaseAdAdapterOo;
        com.thinkup.core.common.on.o oVar = this.adCacheInfo;
        if (oVar == null || (tUBaseAdAdapterOo = oVar.oo()) == null || tUBaseAdAdapterOo.getTrackingInfo() == null) {
            return;
        }
        n0 trackingInfo = tUBaseAdAdapterOo.getTrackingInfo();
        trackingInfo.mmm(getClickedArea());
        trackingInfo.mmn(getClickType());
    }

    @Override // com.thinkup.core.common.mn.oo.o.m
    public void onAdDislikeButtonClick() {
    }

    @Override // com.thinkup.core.common.mn.oo.o.m
    public void onAdImpressed() {
    }

    @Override // com.thinkup.core.common.mn.oo.o.m
    public void onAdVideoEnd() {
    }

    @Override // com.thinkup.core.common.mn.oo.o.m
    public void onAdVideoProgress(int i2) {
    }

    @Override // com.thinkup.core.common.mn.oo.o.m
    public void onAdVideoStart() {
    }

    @Override // com.thinkup.core.common.mn.oo.o.m
    public void onClose() {
    }

    @Override // com.thinkup.core.common.mn.oo.o.m
    public void onDeeplinkCallback(boolean z2) {
    }

    @Override // com.thinkup.core.common.mn.oo.o.m
    public void onDownloadConfirmCallback(Context context, View view, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
    }

    @Override // com.thinkup.core.common.mn.oo.o.m
    public void onVideoError(String str, String str2) {
    }

    public void setClickType(int i2) {
        this.clickType = i2;
    }

    public void setClickedArea(int i2) {
        this.clickedArea = i2;
    }

    public o(com.thinkup.core.common.on.o oVar) {
        this.adCacheInfo = oVar;
    }
}
