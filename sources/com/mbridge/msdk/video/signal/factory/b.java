package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.impl.i;
import com.mbridge.msdk.video.signal.impl.j;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.impl.m;
import com.mbridge.msdk.video.signal.impl.n;
import com.mbridge.msdk.video.signal.impl.o;
import com.mbridge.msdk.video.signal.impl.q;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class b extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Activity f38131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WebView f38132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBridgeVideoView f38133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MBridgeContainerView f38134k;
    private CampaignEx l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MBridgeBTContainer f38135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.a.InterfaceC0207a f38136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f38137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<CampaignEx> f38138p;

    public b(Activity activity) {
        this.f38131h = activity;
    }

    public void a(k kVar) {
        this.f38125b = kVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.f38132i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f38124a == null) {
            this.f38124a = new i(webView);
        }
        return this.f38124a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f38134k;
        if (mBridgeContainerView == null || (activity = this.f38131h) == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f38129f == null) {
            this.f38129f = new o(activity, mBridgeContainerView);
        }
        return this.f38129f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f38131h == null || this.f38135m == null) {
            return super.getJSBTModule();
        }
        if (this.f38130g == null) {
            this.f38130g = new j(this.f38131h, this.f38135m);
        }
        return this.f38130g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f38131h;
        if (activity == null || (campaignEx = this.l) == null) {
            return super.getJSCommon();
        }
        if (this.f38125b == null) {
            this.f38125b = new k(activity, campaignEx);
        }
        if (this.l.getDynamicTempCode() == 5 && (list = this.f38138p) != null) {
            d dVar = this.f38125b;
            if (dVar instanceof k) {
                ((k) dVar).a(list);
            }
        }
        this.f38125b.setActivity(this.f38131h);
        this.f38125b.setUnitId(this.f38137o);
        this.f38125b.a(this.f38136n);
        return this.f38125b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f38134k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f38128e == null) {
            this.f38128e = new m(mBridgeContainerView);
        }
        return this.f38128e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        WebView webView = this.f38132i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f38127d == null) {
            this.f38127d = new n(webView);
        }
        return this.f38127d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f38133j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f38126c == null) {
            this.f38126c = new q(mBridgeVideoView);
        }
        return this.f38126c;
    }

    public void a(List<CampaignEx> list) {
        this.f38138p = list;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f38131h = activity;
        this.f38135m = mBridgeBTContainer;
        this.f38132i = webView;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a) {
        this.f38131h = activity;
        this.f38132i = webView;
        this.f38133j = mBridgeVideoView;
        this.f38134k = mBridgeContainerView;
        this.l = campaignEx;
        this.f38136n = interfaceC0207a;
        this.f38137o = mBridgeVideoView.getUnitId();
    }
}
