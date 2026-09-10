package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.bt.module.listener.b;
import com.mbridge.msdk.video.bt.module.orglistener.h;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MBTempContainerDiff extends AbstractJSContainer {
    public MBridgeVideoView mbridgeVideoView;

    public MBTempContainerDiff(Context context) {
        super(context);
    }

    public boolean checkChinaSendToServerDiff(h hVar) {
        return false;
    }

    public boolean checkChinaShowingAlertViewState() {
        return false;
    }

    public MBTempContainerDiff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setChinaCTACallBack() {
    }

    public void setChinaDestroy() {
    }

    public void setChinaJsCommonContext() {
    }

    public void setChinaCallBackStatus(WindVaneWebView windVaneWebView) {
    }

    public void setChinaBrowserCallBack(b bVar, String str, h hVar, CampaignEx campaignEx) {
    }
}
