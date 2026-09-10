package com.smartdigimkt.expressad.video.signal.container;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.smartdigimkt.d3.c;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.expressad.video.signal.factory.IJSFactory;
import com.smartdigimkt.f3.d;
import com.smartdigimkt.n.h;
import com.smartdigimkt.x2.b;
import com.smartdigimkt.x2.e;
import com.smartdigimkt.x2.g;
import com.smartdigimkt.x2.i;
import com.smartdigimkt.x2.j;
import com.smartdigimkt.y2.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {
    protected static final String v0 = "AbstractJSContainer";
    private int e0;
    private int f0;
    protected Activity g0;
    protected String h0;
    protected String i0;
    protected d j0;
    protected String k0;
    protected c l0;
    protected String m0;
    protected int n0;
    protected boolean o0;
    protected boolean p0;
    protected int q0;
    protected int r0;
    protected int s0;
    protected boolean t0;
    protected IJSFactory u0;

    public AbstractJSContainer(Context context) {
        super(context);
        this.e0 = 0;
        this.f0 = 1;
        this.n0 = 2;
        this.o0 = false;
        this.p0 = false;
        this.t0 = false;
        this.u0 = new a();
    }

    private boolean i(int i2) {
        try {
            if (i2 == 1) {
                this.g0.setRequestedOrientation(12);
            } else {
                if (i2 != 2) {
                    return false;
                }
                this.g0.setRequestedOrientation(11);
            }
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void a(Object obj) {
        h.a().a(obj, h(this.f0));
    }

    public void b(Object obj) {
        h.a().b(obj, h(this.e0));
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public com.smartdigimkt.x2.a getActivityProxy() {
        return this.u0.getActivityProxy();
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.u0.getIJSRewardVideoV1();
    }

    public String getInnerPlacementId() {
        d dVar;
        return (!TextUtils.isEmpty(this.i0) || (dVar = this.j0) == null || TextUtils.isEmpty(dVar.F())) ? this.i0 : this.j0.F();
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public b getJSBTModule() {
        return this.u0.getJSBTModule();
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public com.smartdigimkt.x2.c getJSCommon() {
        return this.u0.getJSCommon();
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        return this.u0.getJSContainerModule();
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        return this.u0.getJSNotifyProxy();
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.u0.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.i0;
    }

    public String getUnitId() {
        return this.h0;
    }

    public String h(int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i2);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().b()) {
            getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().b()) {
            getActivityProxy().b();
        }
    }

    public void onPause() {
        if (getJSCommon().b()) {
            getActivityProxy().g();
        }
        getActivityProxy().a(1);
    }

    public void onRestart() {
        if (getJSCommon().b()) {
            getActivityProxy().f();
        }
        getActivityProxy().a(4);
    }

    public void onResume() {
        if (com.smartdigimkt.z.b.f) {
            return;
        }
        if (getJSCommon().b()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(0);
    }

    public void onStart() {
        if (getJSCommon().b()) {
            getActivityProxy().h();
        }
        getActivityProxy().a(2);
    }

    public void onStop() {
        if (getJSCommon().b()) {
            getActivityProxy().c();
        }
        getActivityProxy().a(3);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.u0 = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.g0 = activity;
    }

    public void setBidCampaign(boolean z2) {
        this.p0 = z2;
    }

    public void setBigOffer(boolean z2) {
        this.t0 = z2;
    }

    public void setIV(boolean z2) {
        this.o0 = z2;
    }

    public void setIVRewardEnable(int i2, int i3, int i4) {
        this.q0 = i2;
        this.r0 = i3;
        this.s0 = i4;
    }

    public void setMute(int i2) {
        this.n0 = i2;
    }

    public void setPlacementId(String str) {
        this.i0 = str;
    }

    public void setReward(c cVar) {
        this.l0 = cVar;
    }

    public void setRewardId(String str) {
        this.m0 = str;
    }

    public void setRewardUnitSetting(d dVar) {
        this.j0 = dVar;
    }

    public void setUnitId(String str) {
        this.h0 = str;
    }

    public void setUserId(String str) {
        this.k0 = str;
    }

    public void a(Object obj, String str) {
        h.a().a(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    public void b(Object obj, String str) {
        h.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    public void a(WindVaneWebView windVaneWebView, String str, String str2) {
        h.a().a((WebView) windVaneWebView, str, Base64.encodeToString(str2.getBytes(), 2));
    }

    public void b(String str) {
        Activity activity = this.g0;
        if (activity != null) {
            activity.finish();
        }
    }

    public int a(com.smartdigimkt.x.d dVar) {
        com.smartdigimkt.z2.j jVarB = b(dVar);
        if (jVarB != null) {
            return jVarB.i();
        }
        return 0;
    }

    public com.smartdigimkt.z2.j b(com.smartdigimkt.x.d dVar) {
        if (dVar == null) {
            return null;
        }
        com.smartdigimkt.a3.a.C0428a c0428aA = com.smartdigimkt.a3.a.a(this.o0 ? 287 : 94, dVar);
        if (c0428aA != null && c0428aA.c()) {
            WindVaneWebView windVaneWebViewB = c0428aA.b();
            if (windVaneWebViewB.getObject() instanceof com.smartdigimkt.z2.j) {
                return (com.smartdigimkt.z2.j) windVaneWebViewB.getObject();
            }
        }
        return null;
    }

    public void a(d dVar, com.smartdigimkt.x.d dVar2) {
        com.smartdigimkt.x.d.c cVarU1;
        if (a(dVar2) == 1) {
            return;
        }
        if ((dVar2 == null || (cVarU1 = dVar2.U1()) == null || !i(cVarU1.c())) && dVar != null) {
            i(this.j0.M());
        }
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = 0;
        this.f0 = 1;
        this.n0 = 2;
        this.o0 = false;
        this.p0 = false;
        this.t0 = false;
        this.u0 = new a();
    }
}
