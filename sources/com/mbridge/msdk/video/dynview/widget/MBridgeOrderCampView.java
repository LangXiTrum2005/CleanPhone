package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.video.bt.module.orglistener.f;
import com.mbridge.msdk.video.dynview.listener.h;
import com.mbridge.msdk.video.module.MBridgeBaseView;
import com.mbridge.msdk.widget.FeedBackButton;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MBridgeOrderCampView extends MBridgeBaseView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MBridgeOrderCampView f37460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<CampaignEx> f37461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f37462o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f37463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f37464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f37465r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f37466s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FeedBackButton f37467t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f37468u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f37469v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.c f37470w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.b f37471x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f37472y;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements com.mbridge.msdk.video.dynview.listener.c {
        public a() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.c
        public void a(CampaignEx campaignEx, int i10) {
            if (campaignEx != null) {
                try {
                    MBridgeOrderCampView.this.setCampaign(campaignEx);
                    campaignEx.setClickTempSource(2);
                    campaignEx.setTriggerClickSource(2);
                    MBridgeOrderCampView.this.a(campaignEx, 0, i10);
                } catch (Exception e10) {
                    q0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.c
        public void close() {
            MBridgeOrderCampView.this.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements com.mbridge.msdk.foundation.feedback.a {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37477a;

        public d(String str) {
            this.f37477a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.click.c.e(((MBridgeBaseView) MBridgeOrderCampView.this).f37559a, this.f37477a);
        }
    }

    public MBridgeOrderCampView(Context context) {
        super(context);
        this.f37469v = false;
        this.f37470w = new a();
        this.f37472y = false;
    }

    private void f() {
        if (this.f37468u == null) {
            return;
        }
        g gVarI = f2.i(i.b());
        if (gVarI == null) {
            this.f37468u.setVisibility(8);
            return;
        }
        String strC = gVarI.c();
        if (TextUtils.isEmpty(strC)) {
            this.f37468u.setVisibility(8);
        }
        this.f37468u.setOnClickListener(new d(strC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            e eVar = new e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", this.f37560b);
        } catch (Throwable th2) {
            q0.a(MBridgeBaseView.TAG, th2.getMessage());
        }
        try {
            com.mbridge.msdk.video.dynview.moffer.a.a().b();
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null) {
            aVar.a(InterfaceC0435l1.d.b.f29108e, "");
        }
    }

    public void createView(ViewGroup viewGroup) {
        if (this.f37461n == null) {
            com.mbridge.msdk.video.dynview.listener.b bVar = this.f37471x;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put("order_view_callback", this.f37470w);
        com.mbridge.msdk.video.dynview.b.a().a(new com.mbridge.msdk.video.dynview.wrapper.c().b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37461n), new b(viewGroup), map);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        this.f37460m = this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        JSONException e10;
        JSONObject jSONObject;
        super.onAttachedToWindow();
        if (this.f37461n == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f37461n.size(); i10++) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("camp_position", i10);
                } catch (JSONException e11) {
                    e10 = e11;
                    e10.printStackTrace();
                }
            } catch (JSONException e12) {
                e10 = e12;
                jSONObject = null;
            }
            com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
            if (aVar != null) {
                aVar.a(InterfaceC0435l1.d.b.f29111h, jSONObject);
            }
        }
    }

    public void setCampOrderViewBuildCallback(com.mbridge.msdk.video.dynview.listener.b bVar) {
        this.f37471x = bVar;
    }

    public void setCampaignExes(List<CampaignEx> list) {
        this.f37461n = list;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        this.f37462o = i10;
        this.f37463p = i11;
        this.f37464q = i12;
        this.f37465r = i13;
        setViewStatus();
    }

    public void setRewarded(boolean z10) {
        this.f37472y = z10;
    }

    public void setViewStatus() {
        MBridgeOrderCampView mBridgeOrderCampView = this.f37460m;
        if (mBridgeOrderCampView == null || !this.f37472y) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) mBridgeOrderCampView.findViewById(filterFindViewId(this.f37469v, "mbridge_native_order_camp_controller"));
        this.f37467t = (FeedBackButton) this.f37460m.findViewById(filterFindViewId(this.f37469v, "mbridge_native_order_camp_feed_btn"));
        this.f37468u = (ImageView) this.f37460m.findViewById(filterFindViewId(this.f37469v, "mbridge_iv_link"));
        if (relativeLayout != null) {
            relativeLayout.setPadding(this.f37462o, this.f37464q, this.f37463p, this.f37465r);
        }
        if (this.f37467t != null) {
            try {
                e();
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
            }
        }
        if (this.f37468u != null) {
            try {
                f();
            } catch (Exception e11) {
                q0.b(MBridgeBaseView.TAG, e11.getMessage());
            }
        }
    }

    public void startAlphaAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        alphaAnimation.setDuration(500L);
        this.f37460m.startAnimation(alphaAnimation);
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        translateAnimation.setDuration(500L);
        this.f37460m.startAnimation(translateAnimation);
    }

    private void e() {
        List<CampaignEx> list = this.f37461n;
        if (list == null || list.get(0) == null) {
            FeedBackButton feedBackButton = this.f37467t;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        this.f37466s = this.f37461n.get(0).getCampaignUnitId();
        this.f37560b = this.f37461n.get(0);
        com.mbridge.msdk.foundation.feedback.b.b().a(defpackage.e.q(this.f37466s, "_2", new StringBuilder()), this.f37560b);
        if (this.f37467t == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.feedback.b.b().a()) {
            this.f37467t.setVisibility(8);
            return;
        }
        com.mbridge.msdk.foundation.feedback.b.b().a(defpackage.e.q(this.f37466s, "_2", new StringBuilder()), new c());
        com.mbridge.msdk.foundation.feedback.b.b().a(defpackage.e.q(this.f37466s, "_2", new StringBuilder()), this.f37467t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, int i10, int i11) {
        JSONException jSONException;
        JSONObject jSONObject;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.k() + "";
                }
                String str2 = str;
                j.a(com.mbridge.msdk.foundation.controller.c.n().d(), "order_view_click" + str2, campaignEx.getCampaignUnitId(), campaignEx.isBidCampaign(), campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str2);
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f33724j, a(i10));
                jSONObject.put("camp_position", i11);
            } catch (JSONException e11) {
                jSONException = e11;
                jSONException.printStackTrace();
            }
        } catch (JSONException e12) {
            jSONException = e12;
            jSONObject = null;
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null) {
            aVar.a(InterfaceC0435l1.d.b.f29109f, jSONObject);
        }
    }

    public MBridgeOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37469v = false;
        this.f37470w = new a();
        this.f37472y = false;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f37474a;

        public b(ViewGroup viewGroup) {
            this.f37474a = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            if (aVar != null) {
                try {
                    MBridgeOrderCampView.this.f37460m.addView(aVar.b());
                    MBridgeOrderCampView.this.f37469v = aVar.c();
                    this.f37474a.removeAllViews();
                    this.f37474a.addView(MBridgeOrderCampView.this.f37460m);
                    f.a(com.mbridge.msdk.foundation.controller.c.n().d(), (List<CampaignEx>) MBridgeOrderCampView.this.f37461n, ((CampaignEx) MBridgeOrderCampView.this.f37461n.get(0)).getCampaignUnitId());
                    MBridgeOrderCampView.this.setViewStatus();
                    if (MBridgeOrderCampView.this.f37471x != null) {
                        MBridgeOrderCampView.this.f37471x.a();
                    }
                } catch (Exception e10) {
                    q0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            try {
                f.a(com.mbridge.msdk.foundation.controller.c.n().d(), (List<CampaignEx>) MBridgeOrderCampView.this.f37461n, ((CampaignEx) MBridgeOrderCampView.this.f37461n.get(0)).getCampaignUnitId(), aVar.h());
                if (MBridgeOrderCampView.this.f37471x != null) {
                    MBridgeOrderCampView.this.f37471x.b();
                }
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
            }
        }
    }
}
