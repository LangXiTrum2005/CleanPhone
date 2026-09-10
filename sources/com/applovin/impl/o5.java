package com.applovin.impl;

import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class o5 extends n5 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f8896r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f8897s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8898t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f8899u;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements e0.a {
        public a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                o5.this.f8896r.j1();
                o5.this.f8896r.a(uri);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements n5.c {
        public b() {
        }

        @Override // com.applovin.impl.n5.c
        public void a(String str) {
            o5.this.f8896r.d(o5.this.c(str));
            o5.this.f8896r.b(true);
            com.applovin.impl.sdk.p pVar = o5.this.f8299c;
            if (com.applovin.impl.sdk.p.a()) {
                o5 o5Var = o5.this;
                o5Var.f8299c.a(o5Var.f8298b, "Finish caching non-video resources for ad #" + o5.this.f8896r.getAdIdNumber());
            }
            o5 o5Var2 = o5.this;
            o5Var2.f8299c.f(o5Var2.f8298b, "Ad updated with cachedHTML = " + o5.this.f8896r.d1());
        }
    }

    public o5(com.applovin.impl.sdk.ad.a aVar, long j10, com.applovin.impl.sdk.l lVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, lVar, appLovinAdLoadListener);
        this.f8896r = aVar;
        this.f8897s = j10;
    }

    private void j() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Caching non-optional HTML resources...");
        }
        this.f8896r.d(c(a(this.f8896r.d1(), this.f8896r.S(), this.f8896r)));
        this.f8896r.b(true);
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Finish caching non-optional HTML resources for ad #" + this.f8896r.getAdIdNumber());
        }
        this.f8299c.f(this.f8298b, "Ad HTML updated to reference locally cached non-optional resources = " + this.f8896r.d1());
    }

    private void k() {
        Uri uriB;
        if (i() || (uriB = b(this.f8896r.h1())) == null) {
            return;
        }
        this.f8896r.j1();
        this.f8896r.a(uriB);
    }

    private d0 l() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Caching HTML resources...");
        }
        return a(this.f8896r.d1(), this.f8896r.S(), new b());
    }

    private e0 m() {
        return a(this.f8896r.h1(), new a());
    }

    private void n() {
        ArrayList<String> arrayList = new ArrayList(this.f8896r.H());
        arrayList.addAll(this.f8896r.Z());
        if (CollectionUtils.isEmpty(arrayList)) {
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Caching optional HTML resources...");
        }
        String strD1 = this.f8896r.d1();
        for (String str : arrayList) {
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.A("Caching optional resource: ", str, this.f8299c, this.f8298b);
            }
            int iA = this.f8297a.I().a(str, this.f8834g);
            Map mapA = h2.a((AppLovinAdImpl) this.f8834g);
            String strA = this.f8297a.I().a(com.applovin.impl.sdk.l.p(), str, this.f8896r.getCachePrefix(), this.f8896r.S(), true, true, iA, this.f8836i, mapA);
            if (StringUtils.isValidString(strA)) {
                if (com.applovin.impl.sdk.p.a()) {
                    defpackage.e.A("Updating HTML with cached optional resource: ", strA, this.f8299c, this.f8298b);
                }
                this.f8896r.a(strA, str);
                strD1 = strD1.replace(str, strA);
                this.f8896r.d(strD1);
            } else {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.b(this.f8298b, "Failed to cache optional resource: " + str);
                }
                a(str, "cacheOptionalHtmlResource", mapA);
            }
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Finish caching optional HTML resources for ad #" + this.f8896r.getAdIdNumber());
        }
    }

    private void o() {
        Long l = (Long) this.f8297a.a(z4.f10099a1);
        if (l.longValue() <= 0) {
            e();
            return;
        }
        long jA1 = (this.f8896r.a1() - l.longValue()) - (SystemClock.elapsedRealtime() - this.f8897s);
        if (jA1 > 0) {
            this.f8297a.s0().a(new u6(this.f8297a, "delayAdLoadSuccessCallback", new u9(this, 13)), f6.b.CACHING, jA1);
        } else {
            e();
        }
    }

    public void b(boolean z10) {
        this.f8899u = z10;
    }

    public void c(boolean z10) {
        this.f8898t = z10;
    }

    @Override // com.applovin.impl.n5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zA0 = this.f8896r.A0();
        boolean z10 = this.f8899u;
        if (zA0 || z10) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Begin caching for streaming ad #" + this.f8896r.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f8297a.a(z4.J0)).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                if (!zA0) {
                    e();
                    d0 d0VarL = l();
                    if (d0VarL != null) {
                        arrayList.add(d0VarL);
                    }
                } else if (this.f8898t) {
                    e();
                    d0 d0VarL2 = l();
                    if (d0VarL2 != null) {
                        arrayList.add(d0VarL2);
                    }
                    e0 e0VarM = m();
                    if (e0VarM != null) {
                        arrayList.add(e0VarM);
                    }
                } else {
                    d0 d0VarL3 = l();
                    if (d0VarL3 != null) {
                        a(Arrays.asList(d0VarL3));
                    }
                    e();
                    e0 e0VarM2 = m();
                    if (e0VarM2 != null) {
                        arrayList.add(e0VarM2);
                    }
                }
                a(arrayList);
                e();
            } else if (zA0) {
                if (this.f8898t) {
                    e();
                }
                j();
                if (!this.f8898t) {
                    e();
                }
                k();
            } else {
                e();
                j();
            }
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Begin processing for non-streaming ad #" + this.f8896r.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f8297a.a(z4.J0)).booleanValue()) {
                ArrayList arrayList2 = new ArrayList();
                d0 d0VarL4 = l();
                if (d0VarL4 != null) {
                    arrayList2.add(d0VarL4);
                }
                e0 e0VarM3 = m();
                if (e0VarM3 != null) {
                    arrayList2.add(e0VarM3);
                }
                a(arrayList2);
                o();
                n();
                e();
            } else {
                j();
                k();
                o();
                n();
                e();
            }
        }
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        if (q7.j(com.applovin.impl.sdk.l.p())) {
            str = q7.c(str);
        }
        if (!this.f8896r.isOpenMeasurementEnabled()) {
            return str;
        }
        return this.f8297a.g0().a(str, h2.a((AppLovinAdImpl) this.f8834g));
    }
}
