package com.mbridge.msdk.newreward.function.command.receiver.showreceiver;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.apt_anotation.ReceiverAction;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.newreward.player.model.MoreOfferModel;
import com.mbridge.msdk.newreward.player.redirect.MoreOfferRedirectModel;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@ReceiverAction(id = "MoreOfferPreSendTrackingReceiver", type = com.mbridge.msdk.newreward.function.command.receiver.b.class)
public class MoreOfferPreSendTrackingReceiver implements com.mbridge.msdk.newreward.function.command.receiver.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.adapter.e f1643a;
    private CampaignEx b;
    private List<CampaignEx> c;
    private int d;
    private int e;
    private com.mbridge.msdk.newreward.function.command.c f;
    private MoreOfferModel g;
    private MoreOfferRedirectModel h;
    private List<Integer> i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MoreOfferPreSendTrackingReceiver.this.a();
        }
    }

    private void b() {
        try {
            com.mbridge.msdk.newreward.function.command.c cVarA = com.mbridge.msdk.newreward.function.command.d.b().a();
            this.f = cVarA;
            this.g = new MoreOfferModel(cVarA);
            if (this.f1643a.C() != null) {
                this.i = this.f1643a.C().c();
            }
            MoreOfferRedirectModel moreOfferRedirectModel = new MoreOfferRedirectModel();
            this.h = moreOfferRedirectModel;
            moreOfferRedirectModel.setContext(com.mbridge.msdk.foundation.controller.c.n().d());
            this.h.setSettingModel(this.f1643a.O());
            if (this.f1643a.C() != null && this.f1643a.C().a() != null) {
                this.c = this.f1643a.C().a().f();
            }
            new Handler(Looper.getMainLooper()).post(new a());
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.function.command.receiver.b
    public void a(Object obj) {
        com.mbridge.msdk.newreward.adapter.e eVar = (com.mbridge.msdk.newreward.adapter.e) obj;
        this.f1643a = eVar;
        if (eVar != null) {
            this.b = eVar.H();
            a(2);
            b();
        }
    }

    public void a(int i) {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject(this.b.getMoreOfferJsonData());
            if (i != 1) {
                jSONObject = i != 2 ? null : jSONObject2.getJSONObject(CampaignEx.ENDCARD_URL);
            } else {
                jSONObject = jSONObject2.getJSONObject("template_url");
            }
            if (jSONObject != null) {
                if (jSONObject.has(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMFTM)) {
                    this.d = jSONObject.getInt(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMFTM);
                }
                if (jSONObject.has(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMF)) {
                    this.e = jSONObject.getInt(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMF);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void b(int i) {
        if (this.f1643a == null || this.h == null) {
            return;
        }
        try {
            String str = "117361";
            CampaignEx campaignEx = this.c.get(i);
            String strA = "";
            if (campaignEx != null) {
                this.h.setCampaignEx(campaignEx);
                strA = z0.a(campaignEx.getendcard_url(), "mof_testuid");
                if (TextUtils.isEmpty(strA)) {
                    strA = z0.a(campaignEx.getendcard_url(), "mof_uid");
                }
            }
            if (!TextUtils.isEmpty(strA)) {
                str = strA;
            }
            this.h.setUnitId(str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void a() {
        if (this.d == 1) {
            try {
                int iMin = Math.min(this.e, this.c.size());
                for (int i = 0; i < iMin; i++) {
                    this.h.setItemPositionId(i);
                    if (!this.i.contains(Integer.valueOf(i))) {
                        this.i.add(Integer.valueOf(i));
                        b(i);
                        if (i == 0) {
                            this.g.eventOnlyImpression(this.h);
                        }
                        this.g.eventImpression(this.h);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
