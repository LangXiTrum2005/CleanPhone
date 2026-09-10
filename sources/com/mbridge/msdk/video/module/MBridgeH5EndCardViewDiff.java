package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.mbridge.msdk.click.a;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.mraid.b;
import com.mbridge.msdk.video.signal.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class MBridgeH5EndCardViewDiff extends MBridgeBaseView implements h, b, j {
    public String unitId;

    public MBridgeH5EndCardViewDiff(Context context) {
        super(context);
    }

    public abstract /* synthetic */ void close();

    public abstract /* synthetic */ void expand(String str, boolean z10);

    public abstract /* synthetic */ CampaignEx getMraidCampaign();

    public abstract /* synthetic */ void handlerPlayableException(String str);

    public abstract /* synthetic */ void install(CampaignEx campaignEx);

    public abstract /* synthetic */ void notifyCloseBtn(int i10);

    public void open(String str) {
        try {
            String clickURL = this.f37560b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f37560b.setClickURL(str);
                reportOpen(str);
            }
            this.f37560b.setClickTempSource(2);
            this.f37560b.setClickType(2);
            this.f37560b.setTriggerClickSource(2);
            a aVar = new a(getContext(), this.unitId);
            aVar.a(this);
            aVar.a(this.f37560b);
            this.f37560b.setClickURL(clickURL);
            this.notifyListener.a(WebSocketProtocol.PAYLOAD_SHORT, "");
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public abstract /* synthetic */ void orientation(Configuration configuration);

    public abstract /* synthetic */ void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar);

    public abstract /* synthetic */ void readyStatus(int i10);

    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.f37560b.isBidCampaign());
        }
    }

    public abstract /* synthetic */ void toggleCloseBtn(int i10);

    public abstract /* synthetic */ void unload();

    public abstract /* synthetic */ void useCustomClose(boolean z10);

    public abstract /* synthetic */ void webviewshow();

    public MBridgeH5EndCardViewDiff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
