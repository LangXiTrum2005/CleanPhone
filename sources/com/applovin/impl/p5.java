package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
class p5 extends n5 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final r7 f8968r;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z7 f8969a;

        public a(z7 z7Var) {
            this.f8969a = z7Var;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                this.f8969a.a(uri);
                p5.this.f8968r.b(true);
                return;
            }
            com.applovin.impl.sdk.p pVar = p5.this.f8299c;
            if (com.applovin.impl.sdk.p.a()) {
                p5 p5Var = p5.this;
                p5Var.f8299c.b(p5Var.f8298b, "Failed to cache static companion ad");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements n5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z7 f8971a;

        public b(z7 z7Var) {
            this.f8971a = z7Var;
        }

        @Override // com.applovin.impl.n5.c
        public void a(String str) {
            this.f8971a.a(str);
            p5.this.f8968r.b(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements n5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z7 f8973a;

        public c(z7 z7Var) {
            this.f8973a = z7Var;
        }

        @Override // com.applovin.impl.n5.c
        public void a(String str) {
            this.f8973a.a(str);
            p5.this.f8968r.b(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f8 f8975a;

        public d(f8 f8Var) {
            this.f8975a = f8Var;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.p pVar = p5.this.f8299c;
                if (com.applovin.impl.sdk.p.a()) {
                    p5 p5Var = p5.this;
                    p5Var.f8299c.a(p5Var.f8298b, "Video file successfully cached into: " + uri);
                }
                this.f8975a.a(uri);
                return;
            }
            com.applovin.impl.sdk.p pVar2 = p5.this.f8299c;
            if (com.applovin.impl.sdk.p.a()) {
                p5 p5Var2 = p5.this;
                p5Var2.f8299c.b(p5Var2.f8298b, "Failed to cache video file: " + this.f8975a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements n5.c {
        public e() {
        }

        @Override // com.applovin.impl.n5.c
        public void a(String str) {
            if (p5.this.f8968r.isOpenMeasurementEnabled()) {
                str = p5.this.f8297a.g0().a(str, h2.a((AppLovinAdImpl) p5.this.f8834g));
            }
            p5.this.f8968r.d(str);
            com.applovin.impl.sdk.p pVar = p5.this.f8299c;
            if (com.applovin.impl.sdk.p.a()) {
                p5 p5Var = p5.this;
                p5Var.f8299c.a(p5Var.f8298b, "Finish caching HTML template " + p5.this.f8968r.e1() + " for ad #" + p5.this.f8968r.getAdIdNumber());
            }
        }
    }

    public p5(r7 r7Var, com.applovin.impl.sdk.l lVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", r7Var, lVar, appLovinAdLoadListener);
        this.f8968r = r7Var;
    }

    private String c(String str) {
        for (String str2 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f8297a.a(z4.f10204m5)), 1)) {
            if (!TextUtils.isEmpty(str2)) {
                Uri uriA = a(str2, Collections.EMPTY_LIST, false);
                if (uriA != null) {
                    str = str.replace(str2, uriA.toString());
                    this.f8834g.a(uriA.toString(), str2);
                } else if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.b(this.f8298b, "Failed to cache JavaScript resource: " + str2);
                }
            }
        }
        return str;
    }

    private void j() {
        if (i()) {
            return;
        }
        if (!this.f8968r.q1()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Companion ad caching disabled. Skipping...");
                return;
            }
            return;
        }
        u7 u7VarC1 = this.f8968r.c1();
        if (u7VarC1 == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        z7 z7VarE = u7VarC1.e();
        if (z7VarE == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                return;
            }
            return;
        }
        Uri uriC = z7VarE.c();
        String string = uriC != null ? uriC.toString() : "";
        String strB = z7VarE.b();
        if (!URLUtil.isValidUrl(string) && !StringUtils.isValidString(strB)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.k(this.f8298b, "Companion ad does not have any resources attached. Skipping...");
                return;
            }
            return;
        }
        if (z7VarE.d() == z7.a.STATIC) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Caching static companion ad at " + string + "...");
            }
            Uri uriA = a(string, Collections.EMPTY_LIST, false);
            if (uriA != null) {
                z7VarE.a(uriA);
                this.f8968r.b(true);
                return;
            } else {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.b(this.f8298b, "Failed to cache static companion ad");
                    return;
                }
                return;
            }
        }
        if (z7VarE.d() != z7.a.HTML) {
            if (z7VarE.d() == z7.a.IFRAME && com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Skip caching of iFrame resource...");
                return;
            }
            return;
        }
        if (!StringUtils.isValidString(string)) {
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.A("Caching provided HTML for companion ad. No fetch required. HTML: ", strB, this.f8299c, this.f8298b);
            }
            if (((Boolean) this.f8297a.a(z4.f10195l5)).booleanValue()) {
                strB = c(strB);
            }
            z7VarE.a(a(strB, Collections.EMPTY_LIST, this.f8968r));
            this.f8968r.b(true);
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Begin caching HTML companion ad. Fetching from " + string + "...");
        }
        String strC = c(string, (List) null, false);
        if (StringUtils.isValidString(strC)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "HTML fetched. Caching HTML now...");
            }
            z7VarE.a(a(strC, Collections.EMPTY_LIST, this.f8968r));
            this.f8968r.b(true);
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.b(this.f8298b, "Unable to load companion ad resources from " + string);
        }
    }

    private void k() {
        if (i() || !d8.a(this.f8968r)) {
            return;
        }
        String strE1 = this.f8968r.e1();
        if (!StringUtils.isValidString(strE1)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Unable to load HTML template");
                return;
            }
            return;
        }
        String strA = a(strE1, this.f8968r.S(), this.f8834g);
        if (this.f8968r.isOpenMeasurementEnabled()) {
            strA = this.f8297a.g0().a(strA, h2.a((AppLovinAdImpl) this.f8834g));
        }
        this.f8968r.d(strA);
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Finish caching HTML template " + this.f8968r.e1() + " for ad #" + this.f8968r.getAdIdNumber());
        }
    }

    private void l() {
        f8 f8VarM1;
        Uri uriE;
        if (i()) {
            return;
        }
        if (!this.f8968r.r1()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Video caching disabled. Skipping...");
                return;
            }
            return;
        }
        if (this.f8968r.l1() == null || (f8VarM1 = this.f8968r.m1()) == null || (uriE = f8VarM1.e()) == null) {
            return;
        }
        Uri uriB = b(uriE.toString(), Collections.EMPTY_LIST, false);
        if (uriB != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Video file successfully cached into: " + uriB);
            }
            f8VarM1.a(uriB);
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.b(this.f8298b, "Failed to cache video file: " + f8VarM1);
        }
    }

    private c0 m() {
        if (!this.f8968r.q1()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        u7 u7VarC1 = this.f8968r.c1();
        if (u7VarC1 == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        z7 z7VarE = u7VarC1.e();
        if (z7VarE == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri uriC = z7VarE.c();
        String string = uriC != null ? uriC.toString() : "";
        String strB = z7VarE.b();
        if (URLUtil.isValidUrl(string) || StringUtils.isValidString(strB)) {
            if (z7VarE.d() == z7.a.STATIC) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.a(this.f8298b, "Caching static companion ad at " + string + "...");
                }
                return new e0(string, this.f8968r, Collections.EMPTY_LIST, false, this.f8836i, this.f8297a, new a(z7VarE));
            }
            if (z7VarE.d() == z7.a.HTML) {
                if (!StringUtils.isValidString(string)) {
                    if (com.applovin.impl.sdk.p.a()) {
                        defpackage.e.A("Caching provided HTML for companion ad. No fetch required. HTML: ", strB, this.f8299c, this.f8298b);
                    }
                    return a(strB, Collections.EMPTY_LIST, new c(z7VarE));
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.a(this.f8298b, "Begin caching HTML companion ad. Fetching from " + string + "...");
                }
                String strC = c(string, (List) null, false);
                if (StringUtils.isValidString(strC)) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f8299c.a(this.f8298b, "HTML fetched. Caching HTML now...");
                    }
                    return a(strC, Collections.EMPTY_LIST, new b(z7VarE));
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.b(this.f8298b, "Unable to load companion ad resources from " + string);
                }
            } else if (z7VarE.d() == z7.a.IFRAME && com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Skip caching of iFrame resource...");
            }
        } else if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.k(this.f8298b, "Companion ad does not have any resources attached. Skipping...");
        }
        return null;
    }

    @Override // com.applovin.impl.n5
    public void e() {
        this.f8968r.getAdEventTracker().h();
        super.e();
    }

    public d0 n() {
        if (!TextUtils.isEmpty(this.f8968r.e1())) {
            return a(this.f8968r.e1(), this.f8968r.S(), new e());
        }
        if (!com.applovin.impl.sdk.p.a()) {
            return null;
        }
        this.f8299c.a(this.f8298b, "Unable to load HTML template");
        return null;
    }

    public e0 o() {
        f8 f8VarM1;
        Uri uriE;
        if (!this.f8968r.r1()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Video caching disabled. Skipping...");
            }
            return null;
        }
        if (this.f8968r.l1() == null || (f8VarM1 = this.f8968r.m1()) == null || (uriE = f8VarM1.e()) == null) {
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Caching video file " + f8VarM1 + " creative...");
        }
        return a(uriE.toString(), Collections.EMPTY_LIST, false, new d(f8VarM1));
    }

    @Override // com.applovin.impl.n5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zA0 = this.f8968r.A0();
        if (com.applovin.impl.sdk.p.a()) {
            com.applovin.impl.sdk.p pVar = this.f8299c;
            String str = this.f8298b;
            StringBuilder sb2 = new StringBuilder("Begin caching for VAST ");
            sb2.append(zA0 ? "streaming " : "");
            sb2.append("ad #");
            sb2.append(this.f8834g.getAdIdNumber());
            sb2.append("...");
            pVar.a(str, sb2.toString());
        }
        if (zA0) {
            if (!((Boolean) this.f8297a.a(z4.J0)).booleanValue()) {
                if (this.f8968r.o1()) {
                    e();
                }
                r7.c cVarF1 = this.f8968r.f1();
                r7.c cVar = r7.c.COMPANION_AD;
                if (cVarF1 == cVar) {
                    j();
                    k();
                } else {
                    l();
                }
                if (!this.f8968r.o1()) {
                    e();
                }
                if (this.f8968r.f1() == cVar) {
                    l();
                } else {
                    j();
                    k();
                }
            } else if (this.f8968r.o1()) {
                e();
                ArrayList arrayList = new ArrayList();
                c0 c0VarM = m();
                if (c0VarM != null) {
                    arrayList.add(c0VarM);
                }
                d0 d0VarN = n();
                if (d0VarN != null) {
                    arrayList.add(d0VarN);
                }
                e0 e0VarO = o();
                if (e0VarO != null) {
                    arrayList.add(e0VarO);
                }
                a(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (this.f8968r.f1() == r7.c.COMPANION_AD) {
                    c0 c0VarM2 = m();
                    if (c0VarM2 != null) {
                        arrayList2.add(c0VarM2);
                    }
                    d0 d0VarN2 = n();
                    if (d0VarN2 != null) {
                        arrayList2.add(d0VarN2);
                    }
                    a(arrayList2);
                    e();
                    e0 e0VarO2 = o();
                    if (e0VarO2 != null) {
                        arrayList3.add(e0VarO2);
                    }
                    a(arrayList3);
                } else {
                    e0 e0VarO3 = o();
                    if (e0VarO3 != null) {
                        arrayList2.add(e0VarO3);
                    }
                    a(arrayList2);
                    e();
                    c0 c0VarM3 = m();
                    if (c0VarM3 != null) {
                        arrayList3.add(c0VarM3);
                    }
                    d0 d0VarN3 = n();
                    if (d0VarN3 != null) {
                        arrayList3.add(d0VarN3);
                    }
                    a(arrayList3);
                }
            }
        } else if (((Boolean) this.f8297a.a(z4.J0)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            c0 c0VarM4 = m();
            if (c0VarM4 != null) {
                arrayList4.add(c0VarM4);
            }
            e0 e0VarO4 = o();
            if (e0VarO4 != null) {
                arrayList4.add(e0VarO4);
            }
            d0 d0VarN4 = n();
            if (d0VarN4 != null) {
                arrayList4.add(d0VarN4);
            }
            a(arrayList4);
            e();
        } else {
            j();
            l();
            k();
            e();
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Finished caching VAST ad #" + this.f8968r.getAdIdNumber());
        }
        this.f8968r.p1();
        h();
    }

    @Override // com.applovin.impl.n5
    public void a(int i10) {
        this.f8968r.getAdEventTracker().f();
        super.a(i10);
    }
}
