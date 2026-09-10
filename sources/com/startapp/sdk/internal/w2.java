package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class w2 implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41600a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41601b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x2 f41602c;

    public w2(x2 x2Var) {
        this.f41602c = x2Var;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        ConcurrentHashMap concurrentHashMap;
        List<StartAppAd> list;
        if (this.f41601b) {
            concurrentHashMap = null;
        } else {
            synchronized (this.f41602c.v) {
                concurrentHashMap = new ConcurrentHashMap(this.f41602c.v);
                x2 x2Var = this.f41602c;
                x2Var.o = null;
                x2Var.v.clear();
            }
        }
        this.f41601b = true;
        this.f41602c.f41662u.d();
        this.f41602c.t.e();
        this.f41602c.f41661p.set(false);
        if (concurrentHashMap != null) {
            for (AdEventListener adEventListener : concurrentHashMap.keySet()) {
                if (adEventListener != null) {
                    this.f41602c.getClass();
                    try {
                        list = (List) concurrentHashMap.get(adEventListener);
                    } catch (Throwable th) {
                        g9.a(th);
                        list = null;
                    }
                    if (list != null) {
                        for (StartAppAd startAppAd : list) {
                            if (ad != null) {
                                startAppAd.setErrorMessage(ad.getErrorMessage());
                            }
                            adEventListener.onFailedToReceiveAd(startAppAd);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        List list;
        ?? r0 = this.f41602c.o;
        boolean z2 = r0 != 0 && r0.getVideoCancelCallBack();
        this.f41602c.t.d();
        o2 o2Var = this.f41602c.f41662u;
        o2Var.e();
        o2Var.f = 0;
        o2Var.g = false;
        this.f41602c.f41661p.set(false);
        if (this.f41600a || z2) {
            return;
        }
        this.f41600a = true;
        synchronized (this.f41602c.v) {
            try {
                for (AdEventListener adEventListener : this.f41602c.v.keySet()) {
                    if (adEventListener != null) {
                        try {
                            list = (List) this.f41602c.v.get(adEventListener);
                        } catch (Throwable th) {
                            g9.a(th);
                            list = null;
                        }
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((StartAppAd) it.next()).setErrorMessage(ad.getErrorMessage());
                                adEventListener.onReceiveAd(ad);
                            }
                        }
                    }
                }
                this.f41602c.v.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
