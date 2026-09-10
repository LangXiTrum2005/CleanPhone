package com.mbridge.msdk.newreward.function.command.receiver.showreceiver;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.newreward.player.imodel.IECModel;
import com.mbridge.msdk.newreward.player.imodel.IPlayModel;
import com.mbridge.msdk.newreward.player.redirect.RedirectModel;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.shake.MBShakeView;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class c implements com.mbridge.msdk.newreward.function.command.receiver.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CampaignEx f1645a;
    IECModel b;
    IPlayModel c;
    RedirectModel d;
    com.mbridge.msdk.shake.b e;
    com.mbridge.msdk.newreward.function.command.f f;
    MBridgeIds g;
    int h;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CampaignEx campaignEx = c.this.f1645a;
            if (campaignEx != null) {
                campaignEx.setClickTempSource(com.mbridge.msdk.foundation.same.report.metrics.a.h);
                c.this.f1645a.setTriggerClickSource(com.mbridge.msdk.foundation.same.report.metrics.a.m);
            }
            c cVar = c.this;
            if (cVar.h == 2) {
                cVar.b.eventClickUrl(cVar.d);
                c cVar2 = c.this;
                cVar2.b.eventTrackingForClick(cVar2.d);
                c cVar3 = c.this;
                cVar3.b.onAdClick(cVar3.g);
                return;
            }
            cVar.c.eventClickUrl(cVar.d);
            c cVar4 = c.this;
            cVar4.c.eventTrackingForClick(cVar4.d);
            c cVar5 = c.this;
            cVar5.c.onAdClick(cVar5.g);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CampaignEx campaignEx = c.this.f1645a;
            if (campaignEx != null) {
                campaignEx.setClickTempSource(com.mbridge.msdk.foundation.same.report.metrics.a.h);
                c.this.f1645a.setTriggerClickSource(com.mbridge.msdk.foundation.same.report.metrics.a.n);
            }
            c.this.d.setClickSenario(0);
            c cVar = c.this;
            cVar.b.eventClickUrl(cVar.d);
            c cVar2 = c.this;
            cVar2.b.eventTrackingForClick(cVar2.d);
            c cVar3 = c.this;
            cVar3.b.onAdClick(cVar3.g);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.function.command.receiver.showreceiver.c$c, reason: collision with other inner class name */
    public class C0208c extends com.mbridge.msdk.shake.b {
        public C0208c(int i, int i2) {
            super(i, i2);
        }

        @Override // com.mbridge.msdk.shake.b
        public void a() {
            CampaignEx campaignEx = c.this.f1645a;
            if (campaignEx != null) {
                campaignEx.setClickTempSource(com.mbridge.msdk.foundation.same.report.metrics.a.h);
                c.this.f1645a.setTriggerClickSource(com.mbridge.msdk.foundation.same.report.metrics.a.n);
            }
            c.this.d.setxInScreen(0.0f);
            c.this.d.setyInScreen(0.0f);
            c.this.d.setClickSenario(4);
            c cVar = c.this;
            cVar.b.eventClickUrl(cVar.d);
            c cVar2 = c.this;
            cVar2.b.eventTrackingForClick(cVar2.d);
            c cVar3 = c.this;
            cVar3.b.onAdClick(cVar3.g);
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1648a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.command.f.values().length];
            f1648a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.command.f.ADD_SHAKE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1648a[com.mbridge.msdk.newreward.function.command.f.ADD_BAIT_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(com.mbridge.msdk.newreward.function.command.f fVar) {
        this.f = fVar;
    }

    public Object a(Object obj) {
        Map map = (Map) obj;
        try {
            this.f1645a = (CampaignEx) map.get(MBInterstitialActivity.INTENT_CAMAPIGN);
            if (map.get("template_model") instanceof IECModel) {
                this.h = 2;
                this.b = (IECModel) map.get("template_model");
            } else if (map.get("template_model") instanceof IPlayModel) {
                this.h = 1;
                this.c = (IPlayModel) map.get("template_model");
            }
            this.d = (RedirectModel) map.get("template_redirect_model");
            this.g = (MBridgeIds) map.get("mbridge_ids");
            int i = d.f1648a[this.f.ordinal()];
            if (i == 1) {
                return a();
            }
            if (i != 2) {
                return null;
            }
            return a(map);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private View a(Map map) {
        if (this.f1645a == null) {
            return null;
        }
        View view = (View) map.get("bait_click_view");
        try {
            String strE = "";
            int i = this.h;
            int i2 = 1;
            if (i != 1) {
                if (i == 2) {
                    strE = this.f1645a.getendcard_url();
                    if (TextUtils.isEmpty(strE)) {
                        strE = this.f1645a.getEndScreenUrl();
                    }
                }
            } else if (this.f1645a.getRewardTemplateMode() != null) {
                strE = this.f1645a.getRewardTemplateMode().e();
            }
            String strA = z0.a(strE, "bait_click");
            if (TextUtils.isEmpty(strA)) {
                return null;
            }
            try {
                i2 = Integer.parseInt(strA);
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
            if (!TextUtils.isEmpty(strA) && i2 != 0 && view != null) {
                view.setVisibility(0);
                ((MBridgeBaitClickView) view).init(1342177280, i2);
                if (this.f1645a.getEcTemplateId() == 1302) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(1342177280);
                    gradientDrawable.setStroke(0, SupportMenu.CATEGORY_MASK);
                    gradientDrawable.setCornerRadius(25.0f);
                    view.setBackground(gradientDrawable);
                }
                ((MBridgeBaitClickView) view).startAnimation();
                view.setOnClickListener(new a());
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return view;
    }

    private View a() {
        int i;
        int i2;
        CampaignEx campaignEx = this.f1645a;
        MBShakeView mBShakeView = null;
        if (campaignEx == null) {
            return null;
        }
        try {
            String endScreenUrl = campaignEx.getendcard_url();
            if (TextUtils.isEmpty(endScreenUrl)) {
                endScreenUrl = this.f1645a.getEndScreenUrl();
            }
            String strA = z0.a(endScreenUrl, "shake_show");
            String strA2 = z0.a(endScreenUrl, "shake_strength");
            String strA3 = z0.a(endScreenUrl, "shake_time");
            if (TextUtils.isEmpty(strA) || !strA.equals("1")) {
                return null;
            }
            MBShakeView mBShakeView2 = new MBShakeView(com.mbridge.msdk.foundation.controller.c.n().d());
            try {
                mBShakeView2.initView(this.f1645a.getAdCall(), true);
                mBShakeView2.setOnClickListener(new b());
                int i3 = 10;
                if (!TextUtils.isEmpty(strA2) && (i2 = Integer.parseInt(strA2)) > 0) {
                    i3 = i2;
                }
                int i4 = 5000;
                if (!TextUtils.isEmpty(strA3) && (i = Integer.parseInt(strA3)) > 0) {
                    i4 = i * 1000;
                }
                this.e = new C0208c(i3, i4);
                com.mbridge.msdk.shake.a.a().a(this.e);
                return mBShakeView2;
            } catch (Throwable th) {
                th = th;
                mBShakeView = mBShakeView2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (!MBridgeConstans.DEBUG) {
            return mBShakeView;
        }
        th.printStackTrace();
        return mBShakeView;
    }
}
