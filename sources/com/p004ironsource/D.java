package com.p004ironsource;

import android.view.View;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class D implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f24187Y;

    public /* synthetic */ D(Object obj, int i2) {
        this.X = i2;
        this.f24187Y = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                bt.b((ws) this.f24187Y);
                break;
            case 1:
                ck.a((InitListener) this.f24187Y);
                break;
            case 2:
                ct.a((IronSourceError) this.f24187Y);
                break;
            case 3:
                ct.b((qt) this.f24187Y);
                break;
            case 4:
                ct.a((ts) this.f24187Y);
                break;
            case 5:
                go.a((go) this.f24187Y);
                break;
            case 6:
                n1.e((n1) this.f24187Y);
                break;
            case 7:
                nd.a((nd) this.f24187Y);
                break;
            case 8:
                qd.h((qd) this.f24187Y);
                break;
            case 9:
                rl.a((rl) this.f24187Y);
                break;
            case 10:
                tv.a((tv) this.f24187Y);
                break;
            case 11:
                ul.a((ul) this.f24187Y);
                break;
            case 12:
                w6.a.a((View) this.f24187Y);
                break;
            case 13:
                wv.e((wv) this.f24187Y);
                break;
            case 14:
                wv.a((oi) this.f24187Y);
                break;
            default:
                wv.b.a((wv.b) this.f24187Y);
                break;
        }
    }
}
