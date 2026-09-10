package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f40856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdPreferences f40857c;
    public final MetaDataRequest$RequestReason d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MetaData f40858e;
    public BannerMetaData f;
    public CacheMetaData g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AdInformationMetaData f40859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AdsCommonMetaData f40860i;
    public final k7 j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f40861l;

    public c8(Context context, lb lbVar, AdPreferences adPreferences, MetaDataRequest$RequestReason metaDataRequest$RequestReason, k7 k7Var, int i2) {
        this.f40855a = context;
        this.f40856b = lbVar;
        this.f40857c = adPreferences;
        this.d = metaDataRequest$RequestReason;
        this.j = k7Var;
        this.k = i2;
    }

    public final void a(Boolean bool) {
        m8 m8Var = (m8) com.startapp.sdk.components.a.a(this.f40855a).y.a();
        m8Var.f41243a.post(new com.google.android.exoplayer2.video.a(12, this, bool));
    }

    public final void b() {
        ((Executor) com.startapp.sdk.components.a.a(this.f40855a).f40724A.a()).execute(new C(this, 0));
    }

    public final /* synthetic */ void c() {
        a(a());
    }

    public final void d() {
        synchronized (MetaData.H()) {
            try {
                if ((this.j == null ? true : Integer.valueOf(this.k).equals(this.j.a())) && this.f40858e != null) {
                    WeakHashMap weakHashMap = vi.f41589a;
                    if (this.f40860i != null) {
                        try {
                            if (!vi.a((Object) AdsCommonMetaData.k(), (Object) this.f40860i)) {
                                this.f40861l = true;
                                AdsCommonMetaData.a(this.f40855a, this.f40860i);
                            }
                        } catch (Throwable th) {
                            g9.a(th);
                        }
                    }
                    WeakHashMap weakHashMap2 = vi.f41589a;
                    if (this.f != null) {
                        try {
                            if (!vi.a((Object) BannerMetaData.c(), (Object) this.f)) {
                                this.f40861l = true;
                                BannerMetaData.a(this.f40855a, this.f);
                            }
                        } catch (Throwable th2) {
                            g9.a(th2);
                        }
                    }
                    WeakHashMap weakHashMap3 = vi.f41589a;
                    if (this.g != null) {
                        try {
                            if (!vi.a((Object) CacheMetaData.b(), (Object) this.g)) {
                                this.f40861l = true;
                                CacheMetaData.a(this.f40855a, this.g);
                            }
                        } catch (Throwable th3) {
                            g9.a(th3);
                        }
                    }
                    WeakHashMap weakHashMap4 = vi.f41589a;
                    if (this.f40859h != null) {
                        try {
                            if (!vi.a((Object) AdInformationMetaData.c(), (Object) this.f40859h)) {
                                this.f40861l = true;
                                AdInformationMetaData.a(this.f40855a, this.f40859h);
                            }
                        } catch (Throwable th4) {
                            g9.a(th4);
                        }
                    }
                    try {
                        MetaData.a(this.f40855a, this.f40858e.k());
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(Boolean bool) {
        MetaData metaData;
        WeakHashMap weakHashMap = vi.f41589a;
        synchronized (MetaData.H()) {
            try {
                if (this.j == null ? true : Integer.valueOf(this.k).equals(this.j.a())) {
                    if (!Boolean.TRUE.equals(bool) || (metaData = this.f40858e) == null) {
                        MetaData.a(this.d);
                    } else {
                        try {
                            MetaData.a(this.f40855a, metaData, this.d, this.f40861l);
                        } catch (Throwable th) {
                            g9.a(th);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Boolean a() {
        try {
            mc mcVar = new mc(this.f40855a, (vf) com.startapp.sdk.components.a.a(this.f40855a).G.a(), this.d);
            mcVar.a(this.f40855a, this.f40857c);
            String strA = a(this.f40855a, mcVar);
            if (TextUtils.isEmpty(strA)) {
                return Boolean.FALSE;
            }
            MetaData metaData = (MetaData) JsonParser.fromJson(strA, MetaData.class);
            this.f40858e = metaData;
            if (metaData == null) {
                return Boolean.FALSE;
            }
            if (metaData.m() != null) {
                r0 r0Var = (r0) com.startapp.sdk.components.a.a(this.f40855a).m.a();
                String strM = this.f40858e.m();
                if (strM != null) {
                    strM = strM.trim();
                }
                synchronized (r0Var.f41419a) {
                    uf ufVarEdit = r0Var.f41420b.edit();
                    ufVarEdit.a("31721150b470a3b9", strM);
                    ufVarEdit.f41545a.putString("31721150b470a3b9", strM);
                    ufVarEdit.f41545a.commit();
                }
            }
            WeakHashMap weakHashMap = vi.f41589a;
            AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) JsonParser.fromJson(strA, AdsCommonMetaData.class);
            if (adsCommonMetaData != null) {
                this.f40860i = adsCommonMetaData;
            }
            BannerMetaData bannerMetaData = (BannerMetaData) JsonParser.fromJson(strA, BannerMetaData.class);
            if (bannerMetaData != null) {
                this.f = bannerMetaData;
            }
            CacheMetaData cacheMetaData = (CacheMetaData) JsonParser.fromJson(strA, CacheMetaData.class);
            if (cacheMetaData != null) {
                this.g = cacheMetaData;
            }
            AdInformationMetaData adInformationMetaData = (AdInformationMetaData) JsonParser.fromJson(strA, AdInformationMetaData.class);
            if (adInformationMetaData != null) {
                this.f40859h = adInformationMetaData;
            }
            d();
            return Boolean.TRUE;
        } catch (Throwable th) {
            g9.a(th);
            return Boolean.FALSE;
        }
    }

    public final Void b(p8 p8Var) {
        y6 y6Var = (y6) this.f40856b.a();
        WeakHashMap weakHashMap = vi.f41589a;
        p8Var.getClass();
        ((z6) y6Var).a(this, p8Var);
        return null;
    }

    public final String a(Context context, mc mcVar) {
        String strB;
        q8 q8Var = (q8) com.startapp.sdk.components.a.a(context).f40741n.a();
        MetaData metaData = this.f40858e;
        double dY = metaData != null ? metaData.y() : 0.0d;
        for (String str : MetaData.E().I()) {
            if (vi.a(dY)) {
                StringBuilder sbW = android.support.v4.media.a.w(str);
                sbW.append(i0.d);
                p8 p8Var = new p8(q8Var, sbW.toString());
                p8Var.f41355c = mcVar.a(((HttpClientConfig) q8Var.f.a()).e());
                a(p8Var);
                p8Var.d = ((HttpClientConfig) q8Var.f.a()).a(2);
                strB = p8Var.b();
            } else {
                StringBuilder sbW2 = android.support.v4.media.a.w(str);
                sbW2.append(i0.d);
                p8 p8Var2 = new p8(q8Var, mcVar.a(sbW2.toString()));
                b(p8Var2);
                p8Var2.d = ((HttpClientConfig) q8Var.f.a()).a(2);
                t8 t8VarA = p8Var2.a();
                strB = t8VarA != null ? t8VarA.f41508b : null;
            }
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
            if (!((g6) com.startapp.sdk.components.a.a(context).t.a()).b()) {
                break;
            }
        }
        return null;
    }

    public final Void a(p8 p8Var) {
        y6 y6Var = (y6) this.f40856b.a();
        WeakHashMap weakHashMap = vi.f41589a;
        p8Var.getClass();
        ((z6) y6Var).a(this, p8Var);
        return null;
    }
}
