package com.mbridge.msdk.newreward.player;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.newreward.adapter.e;
import com.mbridge.msdk.newreward.function.command.d;
import com.mbridge.msdk.newreward.function.command.retention.BridgeParameter;
import com.mbridge.msdk.newreward.player.iview.IMetaData;
import com.mbridge.msdk.newreward.player.presenter.ActivityPresenter;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes2.dex */
public class MBRewardVideoActivity extends BaseActivity implements IMetaData {
    Object data;
    ViewGroup viewGroup;

    @Override // com.mbridge.msdk.newreward.player.iview.IMetaData
    public void activityReport(String str) {
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IMetaData
    public Object getDate() {
        return this.data;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IMetaData
    public ViewGroup getRootViewGroup() {
        return this.viewGroup;
    }

    @Override // com.mbridge.msdk.newreward.player.BaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(g0.a(getApplicationContext(), "mbridge_activity", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
        this.viewGroup = viewGroup;
        setContentView(viewGroup);
        this.activityPresenter = new ActivityPresenter(this, getIntent().getStringExtra(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID));
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IMetaData
    public void onShowFail(@BridgeParameter(key = "reason") String str, @BridgeParameter(key = "code") int i) {
        try {
            e eVarB = d.b().b(getIntent().getStringExtra(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID));
            if (eVarB != null && !eVarB.V()) {
                eVarB.b(true);
                if (eVarB.M() != null) {
                    eVarB.M().onShowFail(eVarB.T(), str);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        finish();
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IMetaData
    public void setDate(Object obj) {
        this.data = obj;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IMetaData
    public void activityReport(String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
    }
}
