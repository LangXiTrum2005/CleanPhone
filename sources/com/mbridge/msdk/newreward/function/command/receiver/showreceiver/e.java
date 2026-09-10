package com.mbridge.msdk.newreward.function.command.receiver.showreceiver;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class e implements com.mbridge.msdk.newreward.function.command.receiver.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<CampaignEx> f1649a;
    CampaignEx b;
    String c;

    @Override // com.mbridge.msdk.newreward.function.command.receiver.a
    public void a(com.mbridge.msdk.newreward.function.command.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
        Map map = (Map) bVar.b();
        this.f1649a = ((com.mbridge.msdk.newreward.function.core.campaign.b) map.get("more_offer_campaign")).f();
        CampaignEx campaignEx = (CampaignEx) map.get(MBInterstitialActivity.INTENT_CAMAPIGN);
        this.b = campaignEx;
        if (campaignEx != null) {
            this.c = z0.a(campaignEx.getendcard_url(), "mof_textmod");
        }
        List<CampaignEx> list = this.f1649a;
        if (list == null || list.isEmpty()) {
            bVar2.reqFailed(new com.mbridge.msdk.foundation.error.b(-1, ""));
        } else {
            bVar2.reqSuccessful(a(this.f1649a));
        }
    }

    private LinearLayout a(List<CampaignEx> list) {
        LinearLayout linearLayout = new LinearLayout(com.mbridge.msdk.foundation.controller.c.n().d());
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        Iterator<CampaignEx> it = list.iterator();
        while (it.hasNext()) {
            View viewA = a(it.next());
            if (viewA != null) {
                linearLayout.addView(viewA);
            }
        }
        return linearLayout;
    }

    private View a(CampaignEx campaignEx) {
        View viewInflate = LayoutInflater.from(com.mbridge.msdk.foundation.controller.c.n().d()).inflate(g0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_end_card_more_offer_item", TtmlNode.TAG_LAYOUT), (ViewGroup) null, false);
        int iA = g0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_end_card_item_iv", "id");
        if (viewInflate == null) {
            return null;
        }
        RoundImageView roundImageView = (RoundImageView) viewInflate.findViewById(iA);
        if (roundImageView != null) {
            roundImageView.setImageDrawable(null);
        }
        TextView textView = (TextView) viewInflate.findViewById(g0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_end_card_item_title_tv", "id"));
        if (!TextUtils.isEmpty(campaignEx.getAppName())) {
            if (!TextUtils.isEmpty(this.c) && this.c.equals("1")) {
                textView.setText(campaignEx.getAppName());
            } else {
                textView.setVisibility(8);
            }
        }
        return viewInflate;
    }
}
