package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n5 extends k5 implements x3.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f8834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AppLovinAdLoadListener f8835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final String f8836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f8837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Collection f8838k;
    private boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f8839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected ExecutorService f8840n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected ExecutorService f8841o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected List f8842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private d0 f8843q;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0.a f8844a;

        public a(e0.a aVar) {
            this.f8844a = aVar;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri == null) {
                com.applovin.impl.sdk.p pVar = n5.this.f8299c;
                if (com.applovin.impl.sdk.p.a()) {
                    n5 n5Var = n5.this;
                    n5Var.f8299c.b(n5Var.f8298b, "Failed to cache video");
                }
                n5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
                Bundle bundle = new Bundle();
                bundle.putLong("ad_id", n5.this.f8834g.getAdIdNumber());
                n5.this.f8297a.u().a(bundle, "video_caching_failed");
                return;
            }
            com.applovin.impl.sdk.p pVar2 = n5.this.f8299c;
            if (com.applovin.impl.sdk.p.a()) {
                n5 n5Var2 = n5.this;
                n5Var2.f8299c.a(n5Var2.f8298b, "Finish caching video for ad #" + n5.this.f8834g.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
            }
            this.f8844a.a(uri);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements d0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f8846a;

        public b(c cVar) {
            this.f8846a = cVar;
        }

        @Override // com.applovin.impl.d0.d
        public void a(String str, boolean z10) {
            if (z10) {
                n5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            c cVar = this.f8846a;
            if (cVar != null) {
                cVar.a(str);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface c {
        void a(String str);
    }

    public n5(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, lVar);
        this.f8836i = UUID.randomUUID().toString();
        this.f8839m = new Object();
        if (bVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f8834g = bVar;
        this.f8835h = appLovinAdLoadListener;
        this.f8837j = lVar.I();
        this.f8838k = g();
        if (((Boolean) lVar.a(z4.J0)).booleanValue()) {
            if (lVar.s0().e()) {
                this.f8840n = lVar.s0().a();
                this.f8841o = lVar.s0().d();
            } else {
                String mediationServeId = StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString();
                this.f8840n = lVar.s0().a(defpackage.e.n("com.applovin.sdk.caching.", mediationServeId), ((Integer) lVar.a(z4.L0)).intValue());
                this.f8841o = lVar.s0().a(defpackage.e.n("com.applovin.sdk.caching.html.", mediationServeId), ((Integer) lVar.a(z4.M0)).intValue());
            }
        }
    }

    private Collection g() {
        HashSet hashSet = new HashSet();
        for (char c4 : ((String) this.f8297a.a(z4.E0)).toCharArray()) {
            hashSet.add(Character.valueOf(c4));
        }
        hashSet.add('\"');
        return hashSet;
    }

    @Override // com.applovin.impl.x3.a
    public void a(a3 a3Var) {
        if (a3Var.T().equalsIgnoreCase(this.f8834g.getMediationServeId())) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Updating flag for timeout...");
            }
            f();
        }
        this.f8297a.b0().b(this);
    }

    public Uri b(String str) {
        return b(str, this.f8834g.S(), true);
    }

    public String c(String str, List list, boolean z10) {
        try {
            InputStream inputStreamA = this.f8837j.a(str, list, z10, h2.a((AppLovinAdImpl) this.f8834g));
            if (inputStreamA == null) {
                if (inputStreamA == null) {
                    return null;
                }
                inputStreamA.close();
                return null;
            }
            try {
                String strA = this.f8837j.a(inputStreamA);
                inputStreamA.close();
                return strA;
            } catch (Throwable th2) {
                try {
                    inputStreamA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Unknown failure to read input stream.", th4);
            }
            this.f8299c.a(this.f8298b, th4);
            this.f8297a.E().a(this.f8298b, "readInputStreamAsString", th4);
            return null;
        }
    }

    public void f() {
        this.l = true;
        List list = this.f8842p;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f8842p.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a(true);
            }
        }
        if (this.f8297a.s0().e()) {
            d0 d0Var = this.f8843q;
            if (d0Var != null) {
                d0Var.c();
                return;
            }
            return;
        }
        ExecutorService executorService = this.f8840n;
        if (executorService != null) {
            executorService.shutdown();
            this.f8840n = null;
        }
        ExecutorService executorService2 = this.f8841o;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f8841o = null;
        }
    }

    public void h() {
        this.f8297a.b0().b(this);
        if (!this.f8297a.s0().e()) {
            ExecutorService executorService = this.f8840n;
            if (executorService != null) {
                executorService.shutdown();
                this.f8840n = null;
            }
            ExecutorService executorService2 = this.f8841o;
            if (executorService2 != null) {
                executorService2.shutdown();
                this.f8841o = null;
            }
        }
        MaxAdFormat maxAdFormatD = this.f8834g.getAdZone().d();
        if (((Boolean) this.f8297a.a(z4.f10107b1)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f8297a.i().b(this.f8834g);
        }
        this.f8297a.f0().a(this.f8836i);
    }

    public boolean i() {
        return this.l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f8834g.X0()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Subscribing to timeout events...");
            }
            this.f8297a.b0().a(this);
        }
    }

    public Uri b(String str, List list, boolean z10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Caching video " + str + "...");
        }
        int iA = this.f8297a.I().a(str, this.f8834g);
        Map mapA = h2.a((AppLovinAdImpl) this.f8834g);
        String strA = this.f8837j.a(a(), str, this.f8834g.getCachePrefix(), list, z10, iA, this.f8836i, mapA);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Failed to cache video: " + str);
            }
            a(str, "cacheVideo", mapA);
            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            return null;
        }
        File fileA = this.f8837j.a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Unable to retrieve File from cached video filename = " + strA);
            }
            a(strA, "retrieveVideoFile", mapA);
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Unable to create URI from cached video file = " + fileA);
            }
            a(strA, "extractUriFromVideoFile", mapA);
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Finish caching video for ad #" + this.f8834g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strA);
        }
        return uriFromFile;
    }

    public void e() {
        synchronized (this.f8839m) {
            try {
                if (this.f8835h == null) {
                    return;
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.a(this.f8298b, "Rendered new ad:" + this.f8834g);
                }
                AppLovinAdLoadListener appLovinAdLoadListener = this.f8835h;
                this.f8835h = null;
                AppLovinSdkUtils.runOnUiThread(new x8(10, this, appLovinAdLoadListener));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public List a(List list) {
        this.f8842p = list;
        return this.f8297a.s0().a(list, this.f8840n);
    }

    public e0 a(String str, e0.a aVar) {
        return a(str, this.f8834g.S(), true, aVar);
    }

    public e0 a(String str, List list, boolean z10, e0.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            this.f8299c.a(this.f8298b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Caching video " + str + "...");
        }
        return new e0(str, this.f8834g, list, z10, this.f8836i, this.f8297a, new a(aVar));
    }

    private String c(String str, List list, com.applovin.impl.sdk.ad.b bVar) {
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) this.f8297a.a(z4.F0)).booleanValue()) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.a(this.f8298b, "Resource caching is disabled, skipping cache...");
                    return str;
                }
            } else {
                StringBuilder sb2 = new StringBuilder(str);
                List listQ = bVar.Q();
                List listH = bVar.H();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    int iIndexOf = 0;
                    int i10 = 0;
                    while (iIndexOf < sb2.length()) {
                        if (!i()) {
                            iIndexOf = sb2.indexOf(str2, i10);
                            if (iIndexOf == -1) {
                                break;
                            }
                            int length = sb2.length();
                            int i11 = iIndexOf;
                            while (!this.f8838k.contains(Character.valueOf(sb2.charAt(i11))) && i11 < length) {
                                i11++;
                            }
                            if (i11 > iIndexOf && i11 != length) {
                                String strSubstring = sb2.substring(str2.length() + iIndexOf, i11);
                                String strH = wi.d.h(str2, strSubstring);
                                if (StringUtils.isValidString(strSubstring) && !listH.contains(strH)) {
                                    if (listQ.contains(strH)) {
                                        Uri uriA = a(str2, strSubstring);
                                        if (uriA != null) {
                                            sb2.replace(iIndexOf, i11, uriA.toString());
                                            bVar.a(uriA.toString(), strH);
                                        } else {
                                            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                                            this.l = true;
                                            if (com.applovin.impl.sdk.p.a()) {
                                                this.f8299c.b(this.f8298b, "Failed to cache HTML Resource: " + strH);
                                            }
                                            a(strH, "cacheHtmlResource", h2.a((AppLovinAdImpl) bVar));
                                        }
                                    } else {
                                        if (com.applovin.impl.sdk.p.a()) {
                                            defpackage.e.A("Skip caching of uncategorized resource: ", strSubstring, this.f8299c, this.f8298b);
                                        }
                                        arrayList.add(strH);
                                    }
                                } else if (com.applovin.impl.sdk.p.a()) {
                                    defpackage.e.A("Skip caching of optional or non-resource: ", strSubstring, this.f8299c, this.f8298b);
                                }
                                i10 = i11;
                            } else if (com.applovin.impl.sdk.p.a()) {
                                this.f8299c.b(this.f8298b, "Unable to cache resource; ad HTML is invalid.");
                            }
                        }
                    }
                }
                bVar.a(arrayList);
                return sb2.toString();
            }
        }
        return str;
    }

    public d0 a(String str, List list, c cVar) {
        d0 d0Var = new d0(str, this.f8834g, list, this.f8841o, this.f8836i, this.f8297a, new b(cVar));
        this.f8843q = d0Var;
        return d0Var;
    }

    public Uri a(String str, List list, boolean z10) {
        try {
            int iA = this.f8297a.I().a(str, this.f8834g);
            Map mapA = h2.a((AppLovinAdImpl) this.f8834g);
            String strA = this.f8837j.a(a(), str, this.f8834g.getCachePrefix(), list, z10, iA, this.f8836i, mapA);
            if (StringUtils.isValidString(strA)) {
                File fileA = this.f8837j.a(strA, a());
                if (fileA != null) {
                    Uri uriFromFile = Uri.fromFile(fileA);
                    if (uriFromFile != null) {
                        return uriFromFile;
                    }
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f8299c.b(this.f8298b, "Unable to extract Uri from image file");
                    }
                    a(strA, "extractUriFromImageFile", mapA);
                    return null;
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.b(this.f8298b, "Unable to retrieve File from cached image filename = " + strA);
                }
                a(strA, "retrieveImageFile", mapA);
                return null;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Failed to cache image: " + str);
            }
            a(str, "cacheImageResource", mapA);
            return null;
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Failed to cache image at url = " + str, th2);
            }
            Map mapA2 = h2.a((AppLovinAdImpl) this.f8834g);
            CollectionUtils.putStringIfValid("url", str, mapA2);
            this.f8297a.E().a(this.f8298b, "cacheImageResource", th2, mapA2);
            return null;
        }
    }

    private String b(String str, List list, com.applovin.impl.sdk.ad.b bVar) {
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) this.f8297a.a(z4.F0)).booleanValue()) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.a(this.f8298b, "Resource caching is disabled, skipping cache...");
                    return str;
                }
            } else {
                StringBuilder sb2 = new StringBuilder(str);
                List listQ = bVar.Q();
                List listH = bVar.H();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    int iIndexOf = 0;
                    int i10 = 0;
                    while (iIndexOf < sb2.length()) {
                        if (!i()) {
                            iIndexOf = sb2.indexOf(str2, i10);
                            if (iIndexOf == -1) {
                                break;
                            }
                            int length = sb2.length();
                            int i11 = iIndexOf;
                            while (!this.f8838k.contains(Character.valueOf(sb2.charAt(i11))) && i11 < length) {
                                i11++;
                            }
                            if (i11 > iIndexOf && i11 != length) {
                                String strSubstring = sb2.substring(str2.length() + iIndexOf, i11);
                                String strH = wi.d.h(str2, strSubstring);
                                if (StringUtils.isValidString(strSubstring) && !listH.contains(strH)) {
                                    Uri uriA = a(str2, strSubstring);
                                    if (uriA != null) {
                                        sb2.replace(iIndexOf, i11, uriA.toString());
                                        bVar.a(uriA.toString(), strH);
                                    } else {
                                        if (listQ.contains(strH)) {
                                            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                                            this.l = true;
                                        }
                                        if (com.applovin.impl.sdk.p.a()) {
                                            this.f8299c.b(this.f8298b, "Failed to cache HTML Resource: " + strH);
                                        }
                                        a(strH, "cacheHtmlResource", h2.a((AppLovinAdImpl) bVar));
                                    }
                                } else if (com.applovin.impl.sdk.p.a()) {
                                    defpackage.e.A("Skip caching of optional or non-resource: ", strSubstring, this.f8299c, this.f8298b);
                                }
                                i10 = i11;
                            } else if (com.applovin.impl.sdk.p.a()) {
                                this.f8299c.b(this.f8298b, "Unable to cache resource; ad HTML is invalid.");
                            }
                        }
                    }
                }
                return sb2.toString();
            }
        }
        return str;
    }

    public String a(String str, List list, com.applovin.impl.sdk.ad.b bVar) {
        if (((Boolean) this.f8297a.a(z4.Z0)).booleanValue()) {
            return c(str, list, bVar);
        }
        return b(str, list, bVar);
    }

    private Uri a(String str, String str2) {
        File fileA = this.f8837j.a(q7.a(Uri.parse(str2), this.f8834g.getCachePrefix(), this.f8297a), com.applovin.impl.sdk.l.p());
        if (fileA == null) {
            return null;
        }
        String strH = wi.d.h(str, str2);
        if (!this.f8837j.a(fileA, strH, Arrays.asList(str), this.f8297a.I().a(strH, this.f8834g), this.f8836i, h2.a((AppLovinAdImpl) this.f8834g))) {
            return null;
        }
        return Uri.parse("file://" + fileA.getAbsolutePath());
    }

    public void a(int i10) {
        synchronized (this.f8839m) {
            try {
                if (this.f8835h == null) {
                    return;
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.a(this.f8298b, "Calling back ad load failed with error code: " + i10);
                }
                AppLovinAdLoadListener appLovinAdLoadListener = this.f8835h;
                this.f8835h = null;
                appLovinAdLoadListener.failedToReceiveAd(i10);
                f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        appLovinAdLoadListener.adReceived(this.f8834g);
    }

    public void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("url", str, map2);
        this.f8297a.E().a(f2.U0, str2, map2);
    }
}
