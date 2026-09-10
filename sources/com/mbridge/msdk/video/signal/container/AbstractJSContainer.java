package com.mbridge.msdk.video.signal.container;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.video.signal.b;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.factory.a;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.j;
import com.mbridge.msdk.videocommon.setting.c;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Activity f38110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f38111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f38112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected c f38113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f38114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.entity.c f38115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f38116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f38117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f38118k;
    protected boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f38119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f38120n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f38121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected boolean f38122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected IJSFactory f38123q;

    public AbstractJSContainer(Context context) {
        super(context);
        this.f38108a = 0;
        this.f38109b = 1;
        this.f38117j = 2;
        this.f38118k = false;
        this.l = false;
        this.f38122p = false;
        this.f38123q = new a();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private boolean i(int i10) {
        try {
            if (i10 == 1) {
                this.f38110c.setRequestedOrientation(12);
            } else {
                if (i10 != 2) {
                    return false;
                }
                this.f38110c.setRequestedOrientation(11);
            }
            return true;
        } catch (Throwable th2) {
            q0.b("AbstractJSContainer", th2.getMessage(), th2);
            return false;
        }
    }

    public void a(Object obj) {
        f.a().b(obj, h(this.f38108a));
    }

    public void b(Object obj, String str) {
        f.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public b getActivityProxy() {
        return this.f38123q.getActivityProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.f38123q.getIJSRewardVideoV1();
    }

    public String getInnerPlacementId() {
        c cVar;
        return (!TextUtils.isEmpty(this.f38112e) || (cVar = this.f38113f) == null || TextUtils.isEmpty(cVar.t())) ? this.f38112e : this.f38113f.t();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.c getJSBTModule() {
        return this.f38123q.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        return this.f38123q.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.f getJSContainerModule() {
        return this.f38123q.getJSContainerModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        return this.f38123q.getJSNotifyProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.f38123q.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.f38112e;
    }

    public String getUnitId() {
        return this.f38111d;
    }

    public String h(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            q0.b("AbstractJSContainer", "code to string is error");
            return "";
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().a()) {
            getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().a()) {
            getActivityProxy().b();
        }
    }

    public void onPause() {
        if (getJSCommon().a()) {
            getActivityProxy().g();
        }
        getActivityProxy().a(1);
    }

    public void onRestart() {
        if (getJSCommon().a()) {
            getActivityProxy().f();
        }
        getActivityProxy().a(4);
    }

    public void onResume() {
        if (com.mbridge.msdk.foundation.feedback.b.f33675f) {
            return;
        }
        if (getJSCommon().a()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(0);
    }

    public void onStart() {
        if (getJSCommon().a()) {
            getActivityProxy().h();
        }
        getActivityProxy().a(2);
    }

    public void onStop() {
        if (getJSCommon().a()) {
            getActivityProxy().c();
        }
        getActivityProxy().a(3);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f38123q = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.f38110c = activity;
    }

    public void setBidCampaign(boolean z10) {
        this.l = z10;
    }

    public void setBigOffer(boolean z10) {
        this.f38122p = z10;
    }

    public void setIV(boolean z10) {
        this.f38118k = z10;
    }

    public void setIVRewardEnable(int i10, int i11, int i12) {
        this.f38119m = i10;
        this.f38120n = i11;
        this.f38121o = i12;
    }

    public void setMute(int i10) {
        this.f38117j = i10;
    }

    public void setPlacementId(String str) {
        this.f38112e = str;
    }

    public void setReward(com.mbridge.msdk.videocommon.entity.c cVar) {
        this.f38115h = cVar;
    }

    public void setRewardId(String str) {
        this.f38116i = str;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f38113f = cVar;
    }

    public void setUnitId(String str) {
        this.f38111d = str;
    }

    public void setUserId(String str) {
        this.f38114g = str;
    }

    public void a(Object obj, String str) {
        f.a().a(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    public void b(String str) {
        q0.b("AbstractJSContainer", str);
        Activity activity = this.f38110c;
        if (activity != null) {
            activity.finish();
        }
    }

    public int a(CampaignEx campaignEx) {
        k kVarB = b(campaignEx);
        if (kVarB != null) {
            return kVarB.n();
        }
        return 0;
    }

    public void a(c cVar, CampaignEx campaignEx) {
        CampaignEx.c rewardTemplateMode;
        if (a(campaignEx) == 1) {
            return;
        }
        if (((campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) ? false : i(rewardTemplateMode.g())) || cVar == null) {
            return;
        }
        i(this.f38113f.y());
    }

    public k b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        com.mbridge.msdk.videocommon.a.C0209a c0209aA = com.mbridge.msdk.videocommon.a.a(this.f38118k ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, campaignEx);
        if (c0209aA != null && c0209aA.c()) {
            WindVaneWebView windVaneWebViewB = c0209aA.b();
            if (windVaneWebViewB.getObject() instanceof k) {
                return (k) windVaneWebViewB.getObject();
            }
        }
        return null;
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38108a = 0;
        this.f38109b = 1;
        this.f38117j = 2;
        this.f38118k = false;
        this.l = false;
        this.f38122p = false;
        this.f38123q = new a();
    }
}
