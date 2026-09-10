package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected CampaignEx f31401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected MBNativeAdvancedView f31402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.advanced.middle.d f31403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f31404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.c f31405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f31406g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f31408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f31409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f31410k;
    protected MBridgeIds l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f31411m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31400a = "NativeAdvancedShowManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f31407h = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View.OnClickListener f31412n = new ViewOnClickListenerC0093a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f31413o = new b(Looper.getMainLooper());

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.a f31414p = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class ViewOnClickListenerC0093a implements View.OnClickListener {
        public ViewOnClickListenerC0093a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f31406g) {
                a.this.a(1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            CampaignEx campaignEx;
            MBNativeAdvancedView mBNativeAdvancedView;
            MBNativeAdvancedWebview advancedNativeWebview;
            super.handleMessage(message);
            if (message.what != 2 || (campaignEx = a.this.f31401b) == null || !campaignEx.isActiveOm() || (mBNativeAdvancedView = a.this.f31402c) == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null) {
                return;
            }
            try {
                AdSession adSession = advancedNativeWebview.getAdSession();
                if (adSession != null) {
                    AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
                    adEventsCreateAdEvents.loaded();
                    adEventsCreateAdEvents.impressionOccurred();
                    q0.a("OMSDK", "adSession.impressionOccurred()");
                }
            } catch (Throwable th2) {
                q0.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx2 = a.this.f31401b;
                if (campaignEx2 != null) {
                    String requestId = campaignEx2.getRequestId();
                    String requestIdNotice = a.this.f31401b.getRequestIdNotice();
                    String id2 = a.this.f31401b.getId();
                    new h(advancedNativeWebview.getContext()).a(requestId, requestIdNotice, id2, a.this.f31409j, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements com.mbridge.msdk.advanced.middle.a {
        public c() {
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(CampaignEx campaignEx) {
            a.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void close() {
            a.this.a(1);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void toggleCloseBtn(int i10) {
            a.this.f31407h = i10;
            MBNativeAdvancedView mBNativeAdvancedView = a.this.f31402c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.changeCloseBtnState(i10);
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void triggerCloseBtn(Object obj, String str) {
            MBNativeAdvancedView mBNativeAdvancedView = a.this.f31402c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.setVisibility(8);
            }
            a.this.a(1);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(int i10) {
            q0.b(a.this.f31400a, "resetCountdown" + i10);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(boolean z10) {
            a aVar = a.this;
            if (aVar.f31403d != null) {
                aVar.f31411m = z10;
                if (z10) {
                    a aVar2 = a.this;
                    aVar2.f31403d.f(aVar2.l);
                } else {
                    a aVar3 = a.this;
                    aVar3.f31403d.a(aVar3.l);
                }
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(boolean z10, String str) {
            try {
                if (a.this.f31403d != null) {
                    if (TextUtils.isEmpty(str)) {
                        a aVar = a.this;
                        aVar.f31403d.b(aVar.l);
                        a aVar2 = a.this;
                        aVar2.f31403d.d(aVar2.l);
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(a.this.f31401b));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    a.this.a(campaignWithBackData, z10, str);
                }
            } catch (Exception e10) {
                q0.b(a.this.f31400a, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedView f31421b;

        public e(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView) {
            this.f31420a = campaignEx;
            this.f31421b = mBNativeAdvancedView;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.f31420a, this.f31421b, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f31423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31424b;

        public f(Context context, CampaignEx campaignEx) {
            this.f31423a = context;
            this.f31424b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j.a(g.a(this.f31423a)).b(this.f31424b.getId());
            } catch (Exception unused) {
                q0.b(a.this.f31400a, "campain can't insert db");
            }
        }
    }

    public a(Context context, String str, String str2) {
        this.f31409j = str2;
        this.f31410k = str;
        this.l = new MBridgeIds(str, str2);
        if (this.f31408i == null) {
            ImageView imageView = new ImageView(context);
            this.f31408i = imageView;
            imageView.setPadding(v0.a(context, 2.0f), v0.a(context, 2.0f), v0.a(context, 2.0f), v0.a(context, 2.0f));
            d();
        }
    }

    private void d() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f31408i.setScaleType(ImageView.ScaleType.FIT_XY);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f31408i.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(v0.a(contextD, 29.0f), v0.a(contextD, 16.0f));
        }
        this.f31408i.setLayoutParams(layoutParams);
        this.f31408i.setImageResource(contextD.getResources().getIdentifier("mbridge_native_advanced_close_icon", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
    }

    private void h() {
        if (this.f31401b.isReport()) {
            return;
        }
        a(this.f31401b);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31401b, this.f31409j);
        com.mbridge.msdk.advanced.middle.d dVar = this.f31403d;
        if (dVar != null) {
            dVar.e(this.l);
        }
    }

    private void i() {
        CampaignEx campaignEx;
        MBNativeAdvancedView mBNativeAdvancedView = this.f31402c;
        if (mBNativeAdvancedView == null || (campaignEx = this.f31401b) == null) {
            return;
        }
        mBNativeAdvancedView.setAdChoiceCampaign(campaignEx);
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    public String c() {
        CampaignEx campaignEx = this.f31401b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f31401b.getRequestId();
    }

    public void e() {
        MBNativeAdvancedWebview advancedNativeWebview;
        MBNativeAdvancedView mBNativeAdvancedView = this.f31402c;
        if (mBNativeAdvancedView == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) advancedNativeWebview, "onViewDisappeared", "");
    }

    public void f() {
        MBNativeAdvancedWebview advancedNativeWebview;
        if (this.f31402c == null || com.mbridge.msdk.foundation.feedback.b.f33675f || (advancedNativeWebview = this.f31402c.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.advanced.signal.a.a(advancedNativeWebview, "onViewAppeared", "");
    }

    public void g() {
        if (this.f31403d != null) {
            this.f31403d = null;
        }
        if (this.f31414p != null) {
            this.f31414p = null;
        }
        if (this.f31412n != null) {
            this.f31412n = null;
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f31402c;
        if (mBNativeAdvancedView != null) {
            MBNativeAdvancedWebview advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
            this.f31402c.destroy();
        }
        if (this.f31405f != null) {
            this.f31405f = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f31409j);
    }

    public com.mbridge.msdk.advanced.middle.a b() {
        return this.f31414p;
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f31753n);
            } catch (Throwable th2) {
                q0.b(this.f31400a, th2.getMessage());
            }
        }
    }

    private void c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    CampaignEx campaignEx2 = campaignEx;
                    Context context2 = context;
                    String str2 = str;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, str2, it.next(), false, true);
                    context = context2;
                    campaignEx = campaignEx2;
                    str = str2;
                }
            } catch (Throwable th2) {
                q0.b(this.f31400a, th2.getMessage());
            }
        }
    }

    public void a(com.mbridge.msdk.advanced.middle.c cVar) {
        this.f31405f = cVar;
    }

    public void a(com.mbridge.msdk.advanced.middle.d dVar) {
        this.f31403d = dVar;
    }

    public String a() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f31401b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements com.mbridge.msdk.foundation.feedback.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedView f31418a;

        public d(MBNativeAdvancedView mBNativeAdvancedView) {
            this.f31418a = mBNativeAdvancedView;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            a.this.e();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(a.this.f31400a, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f31418a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(a.this.f31400a, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f31418a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(a.this.f31400a, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f31418a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public void a(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView, boolean z10) {
        MBNativeAdvancedWebview advancedNativeWebview;
        View viewA;
        RelativeLayout.LayoutParams layoutParams;
        if (mBNativeAdvancedView == null) {
            return;
        }
        this.f31401b = campaignEx;
        this.f31402c = mBNativeAdvancedView;
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f31409j, new d(mBNativeAdvancedView));
        if (campaignEx.isMraid() && com.mbridge.msdk.foundation.feedback.b.b().a() && (viewA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f31409j)) != null) {
            try {
                layoutParams = (RelativeLayout.LayoutParams) viewA.getLayoutParams();
            } catch (Exception e10) {
                e10.printStackTrace();
                layoutParams = null;
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f33674e, com.mbridge.msdk.foundation.feedback.b.f33673d);
            }
            layoutParams.addRule(12);
            ViewGroup viewGroup = (ViewGroup) viewA.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(viewA);
            }
            mBNativeAdvancedView.addView(viewA, layoutParams);
        }
        a(this.f31406g);
        com.mbridge.msdk.advanced.signal.b advancedNativeSignalCommunicationImpl = mBNativeAdvancedView.getAdvancedNativeSignalCommunicationImpl();
        campaignEx.setLocalRequestId(campaignEx.getCurrentLocalRid());
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        if (advancedNativeSignalCommunicationImpl == null) {
            advancedNativeSignalCommunicationImpl = new com.mbridge.msdk.advanced.signal.b(mBNativeAdvancedView.getContext(), this.f31410k, this.f31409j);
            advancedNativeSignalCommunicationImpl.a(arrayList);
        }
        advancedNativeSignalCommunicationImpl.a(this.f31406g ? 1 : 0);
        advancedNativeSignalCommunicationImpl.a(this.f31414p);
        mBNativeAdvancedView.setAdvancedNativeSignalCommunicationImpl(advancedNativeSignalCommunicationImpl);
        b1.a(mBNativeAdvancedView.getAdvancedNativeWebview(), campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
        if (campaignEx.isHasMBTplMark() || !this.f31406g) {
            this.f31408i.setVisibility(8);
        }
        a(this.f31408i);
        mBNativeAdvancedView.setCloseView(this.f31408i);
        if (mBNativeAdvancedView.getVisibility() != 0) {
            mBNativeAdvancedView.setVisibility(0);
        }
        l lVarA = com.mbridge.msdk.foundation.tools.h.a(mBNativeAdvancedView.getAdvancedNativeWebview(), campaignEx.getImpReportType());
        if (this.f31405f == null || !lVarA.a() || this.f31405f.d() == null || this.f31405f.d().getAlpha() < 0.5f || this.f31405f.d().getVisibility() != 0 || this.f31411m) {
            if (z10) {
                mBNativeAdvancedView.postDelayed(new e(campaignEx, mBNativeAdvancedView), 200L);
                return;
            }
            return;
        }
        com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
        mBNativeAdvancedView.show();
        com.mbridge.msdk.foundation.controller.c.n().a(mBNativeAdvancedView.getContext());
        campaignEx.setCampaignUnitId(this.f31409j);
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f31409j, campaignEx);
        CampaignEx campaignEx2 = this.f31401b;
        if (campaignEx2 != null && campaignEx2.isActiveOm() && (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) != null) {
            try {
                AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), advancedNativeWebview, advancedNativeWebview.getUrl(), this.f31401b);
                if (adSessionA != null) {
                    advancedNativeWebview.setAdSession(adSessionA);
                    adSessionA.registerAdView(advancedNativeWebview);
                    adSessionA.start();
                    q0.a("OMSDK", "adSession.start()");
                }
            } catch (Throwable th2) {
                q0.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx3 = this.f31401b;
                if (campaignEx3 != null) {
                    String requestId = campaignEx3.getRequestId();
                    String requestIdNotice = this.f31401b.getRequestIdNotice();
                    String id2 = this.f31401b.getId();
                    new h(com.mbridge.msdk.foundation.controller.c.n().d()).a(requestId, requestIdNotice, id2, this.f31409j, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
        h();
        if (campaignEx.isMraid()) {
            i();
        }
        int i10 = this.f31407h;
        if (i10 != -1) {
            mBNativeAdvancedView.changeCloseBtnState(i10);
        }
        com.mbridge.msdk.advanced.manager.d.b(this.f31409j);
        com.mbridge.msdk.advanced.common.c.b(this.f31410k + this.f31409j + campaignEx.getRequestId());
        this.f31413o.sendEmptyMessageDelayed(2, 1000L);
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31401b.getMaitve(), this.f31401b.getMaitve_src());
    }

    private void a(CampaignEx campaignEx) {
        if (campaignEx.isHasMBTplMark()) {
            return;
        }
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f31409j);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f31409j, campaignEx, "h5_native");
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f31409j);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f31409j);
    }

    public void a(boolean z10) {
        this.f31406g = z10;
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f31412n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        com.mbridge.msdk.advanced.middle.d dVar = this.f31403d;
        if (dVar != null) {
            dVar.c(this.l);
            this.f31403d = null;
            com.mbridge.msdk.advanced.report.a.a(this.f31409j, this.f31401b);
        }
        com.mbridge.msdk.advanced.report.a.a(this.f31409j, i10, this.f31401b);
        MBNativeAdvancedView mBNativeAdvancedView = this.f31402c;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.setVisibility(8);
            e();
            MBNativeAdvancedWebview advancedNativeWebview = this.f31402c.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
        }
        Handler handler = this.f31413o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.n().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new f(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f31752m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }
}
