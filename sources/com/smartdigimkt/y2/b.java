package com.smartdigimkt.y2;

import android.app.Activity;
import android.webkit.WebView;
import com.smartdigimkt.expressad.video.bt.module.AnythinkBTContainer;
import com.smartdigimkt.expressad.video.module.AnythinkContainerView;
import com.smartdigimkt.expressad.video.module.AnythinkVideoView;
import com.smartdigimkt.x.d;
import com.smartdigimkt.x2.c;
import com.smartdigimkt.x2.e;
import com.smartdigimkt.x2.g;
import com.smartdigimkt.x2.i;
import com.smartdigimkt.z2.h;
import com.smartdigimkt.z2.j;
import com.smartdigimkt.z2.k;
import com.smartdigimkt.z2.l;
import com.smartdigimkt.z2.m;
import com.smartdigimkt.z2.n;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class b extends a {
    private Activity i0;
    private WebView j0;
    private AnythinkVideoView k0;
    private AnythinkContainerView l0;
    private d m0;
    private AnythinkBTContainer n0;
    private List<d> o0;
    private c.a p0;
    private String q0;

    public b(Activity activity) {
        this.i0 = activity;
    }

    public void a(j jVar) {
        this.f40025Y = jVar;
    }

    @Override // com.smartdigimkt.y2.a, com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public com.smartdigimkt.x2.a getActivityProxy() {
        WebView webView = this.j0;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.X == null) {
            this.X = new h(webView);
        }
        return this.X;
    }

    @Override // com.smartdigimkt.y2.a, com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        Activity activity;
        AnythinkContainerView anythinkContainerView = this.l0;
        if (anythinkContainerView == null || (activity = this.i0) == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.g0 == null) {
            this.g0 = new m(activity, anythinkContainerView);
        }
        return this.g0;
    }

    @Override // com.smartdigimkt.y2.a, com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public com.smartdigimkt.x2.b getJSBTModule() {
        if (this.i0 == null || this.n0 == null) {
            return super.getJSBTModule();
        }
        if (this.h0 == null) {
            this.h0 = new com.smartdigimkt.z2.i(this.i0, this.n0);
        }
        return this.h0;
    }

    @Override // com.smartdigimkt.y2.a, com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public c getJSCommon() {
        d dVar;
        List<d> list;
        Activity activity = this.i0;
        if (activity == null || (dVar = this.m0) == null) {
            return super.getJSCommon();
        }
        if (this.f40025Y == null) {
            this.f40025Y = new j(activity, dVar);
        }
        if (this.m0.t0() == 5 && (list = this.o0) != null) {
            c cVar = this.f40025Y;
            if (cVar instanceof j) {
                ((j) cVar).a(list);
            }
        }
        this.f40025Y.setActivity(this.i0);
        this.f40025Y.setUnitId(this.q0);
        this.f40025Y.a(this.p0);
        return this.f40025Y;
    }

    @Override // com.smartdigimkt.y2.a, com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        AnythinkContainerView anythinkContainerView = this.l0;
        if (anythinkContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f0 == null) {
            this.f0 = new k(anythinkContainerView);
        }
        return this.f0;
    }

    @Override // com.smartdigimkt.y2.a, com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        WebView webView = this.j0;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.e0 == null) {
            this.e0 = new l(webView);
        }
        return this.e0;
    }

    @Override // com.smartdigimkt.y2.a, com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public com.smartdigimkt.x2.j getJSVideoModule() {
        AnythinkVideoView anythinkVideoView = this.k0;
        if (anythinkVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.Z == null) {
            this.Z = new n(anythinkVideoView);
        }
        return this.Z;
    }

    public void a(List<d> list) {
        this.o0 = list;
    }

    public b(Activity activity, AnythinkBTContainer anythinkBTContainer, WebView webView) {
        this.i0 = activity;
        this.n0 = anythinkBTContainer;
        this.j0 = webView;
    }

    public b(Activity activity, WebView webView, AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, d dVar) {
        this.i0 = activity;
        this.j0 = webView;
        this.k0 = anythinkVideoView;
        this.l0 = anythinkContainerView;
        this.m0 = dVar;
    }

    public b(Activity activity, WebView webView, AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, d dVar, c.a aVar) {
        this.i0 = activity;
        this.j0 = webView;
        this.k0 = anythinkVideoView;
        this.l0 = anythinkContainerView;
        this.m0 = dVar;
        this.p0 = aVar;
        this.q0 = anythinkVideoView.getUnitId();
    }
}
