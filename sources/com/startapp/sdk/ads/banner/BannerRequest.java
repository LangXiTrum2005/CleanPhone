package com.startapp.sdk.ads.banner;

import A.RunnableC0914v;
import android.content.Context;
import android.graphics.Point;
import androidx.media3.exoplayer.analytics.o;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.ca;
import com.startapp.sdk.internal.da;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.ea;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.k0;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.r1;
import com.startapp.sdk.internal.s7;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z6;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class BannerRequest {
    private final lb adCacheManager;
    private BannerFormat adFormat;
    private AdPreferences adPreferences;
    private Point adSizeDp;
    private final lb consentManager;
    private final Context context;
    private final lb eventTracer;
    private final lb externalAds;
    protected final lb httpClient;
    protected final lb motionProcessor;
    protected final lb networkApiExecutor;
    private final lb videoAdCacheManager;
    protected final lb webViewCacheLoader;
    private final lb webViewFactory;

    public interface Callback {
        void onFinished(BannerCreator bannerCreator, String str);
    }

    public BannerRequest(Context context) {
        this(context, com.startapp.sdk.components.a.a(context).K, com.startapp.sdk.components.a.a(context).j, com.startapp.sdk.components.a.a(context).M, com.startapp.sdk.components.a.a(context).f40730N, com.startapp.sdk.components.a.a(context).f40735b, com.startapp.sdk.components.a.a(context).f40741n, com.startapp.sdk.components.a.a(context).f40724A, com.startapp.sdk.components.a.a(context).f40744w, com.startapp.sdk.components.a.a(context).f40736c, com.startapp.sdk.components.a.a(context).f40734a);
    }

    private Point chooseSize() {
        int i2;
        int i3;
        Point point = this.adSizeDp;
        if (point != null) {
            i2 = point.x;
            i3 = point.y;
        } else {
            BannerFormat bannerFormat = this.adFormat;
            i2 = bannerFormat.widthDp;
            i3 = bannerFormat.heightDp;
        }
        return new Point(i2, i3);
    }

    private String getAdTag() {
        AdPreferences adPreferences = this.adPreferences;
        if (adPreferences != null) {
            return adPreferences.getAdTag();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0(Callback callback, BannerCreator bannerCreator, String str) {
        if (bannerCreator != null) {
            ((z6) ((y6) this.eventTracer.a())).c(this, ii.f);
        } else {
            ((z6) ((y6) this.eventTracer.a())).c(this, ii.g);
        }
        ((z6) ((y6) this.eventTracer.a())).b(this, ii.d);
        callback.onFinished(bannerCreator, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Unit lambda$loadExternalAd$3(Callback callback, Point point, AdPreferences adPreferences, AdUnitConfig adUnitConfig, int i2, MetaData metaData, ea eaVar) {
        Unit unit = Unit.f43263a;
        if (eaVar == null) {
            callback.onFinished(null, null);
            return unit;
        }
        s7 s7Var = (s7) eaVar;
        s7Var.f41472c = point.x;
        s7Var.d = point.y;
        s7Var.f41473e = new d(this, callback, adPreferences, point, adUnitConfig, i2, metaData);
        s7Var.a();
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadExternalAd$4(Callback callback, final int i2) {
        final Callback callback2;
        Throwable th;
        final AdUnitConfig adUnitConfig;
        try {
            AdPreferences adPreferences = this.adPreferences;
            if (adPreferences == null) {
                adPreferences = new AdPreferences();
            }
            final AdPreferences adPreferences2 = adPreferences;
            final MetaData metaDataE = MetaData.E();
            ExternalAdConfig externalAdConfigV = metaDataE.v();
            if (externalAdConfigV != null) {
                try {
                    adUnitConfig = externalAdConfigV.getMapping().get(adPreferences2.getAdTag());
                } catch (Throwable th2) {
                    th = th2;
                    callback2 = callback;
                }
            } else {
                adUnitConfig = null;
            }
            if (adUnitConfig == null) {
                callback.onFinished(null, "No ad unit found");
                return;
            }
            final Point pointChooseSize = chooseSize();
            callback2 = callback;
            try {
                ((k0) this.externalAds.a()).a(adUnitConfig, new Function1() { // from class: com.startapp.sdk.ads.banner.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        BannerRequest bannerRequest = this.X;
                        AdPreferences adPreferences3 = adPreferences2;
                        AdUnitConfig adUnitConfig2 = adUnitConfig;
                        int i3 = i2;
                        return bannerRequest.lambda$loadExternalAd$3(callback2, pointChooseSize, adPreferences3, adUnitConfig2, i3, metaDataE, (ea) obj);
                    }
                });
                return;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            callback2 = callback;
        }
        th = th;
        callback2.onFinished(null, th.getMessage());
        g9.a(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadImpl$1(Callback callback, String str, BannerCreator bannerCreator, String str2) {
        if (bannerCreator != null) {
            callback.onFinished(bannerCreator, str2);
            return;
        }
        ExternalConfig externalConfigU = MetaData.E().u();
        if (externalConfigU == null || !externalConfigU.getLoadInnerAdIfNoExternal()) {
            callback.onFinished(null, str2);
        } else {
            loadInnerAd(callback, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadInnerAd$2(Callback callback, BannerCreator bannerCreator, String str) {
        if (bannerCreator != null) {
            callback.onFinished(bannerCreator, str);
        } else if (e7.a(true, getAdTag(), true, false)) {
            loadExternalAd(callback, 2);
        } else {
            callback.onFinished(null, str);
        }
    }

    private void loadExternalAd(Callback callback, int i2) {
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.C);
        h0.a(new RunnableC0914v(this, callback, i2, 7));
    }

    private void loadImpl(Callback callback, String str) {
        if (e7.a(false, getAdTag(), true, false)) {
            loadExternalAd(new o(this, callback, str, 10), 1);
        } else {
            loadInnerAd(callback, str);
        }
    }

    private void loadInnerAd(Callback callback, String str) {
        loadInnerAdImpl(new e(this, callback, 0), str);
    }

    private void loadInnerAdImpl(Callback callback, String str) {
        AdPreferences adPreferences = this.adPreferences;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        r1 r1Var = new r1(this.context, this.eventTracer, this.consentManager, this.adCacheManager, this.videoAdCacheManager, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.motionProcessor, this.webViewCacheLoader, 0);
        BannerFormat bannerFormat = this.adFormat;
        Point pointChooseSize = chooseSize();
        ((z6) ((y6) this.eventTracer.a())).a(this, r1Var);
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.D);
        r1Var.t = bannerFormat.type;
        int i2 = pointChooseSize.x;
        int i3 = pointChooseSize.y;
        r1Var.f41299c = i2;
        r1Var.d = i3;
        r1Var.load(adPreferences, new c(callback, bannerFormat, adPreferences, r1Var), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendInfoAdRequest(boolean z2, String uuid, String originalTS, AdPreferences adPreferences, Point size, AdUnitConfig config, int i2) {
        Context context = this.context;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
        lb lbVar = this.httpClient;
        lb lbVar2 = this.networkApiExecutor;
        lb lbVar3 = this.eventTracer;
        lb lbVar4 = this.motionProcessor;
        ca caVar = new ca(context, adPreferences, placement, lbVar, lbVar2, lbVar3, lbVar4);
        caVar.f40866b = z2;
        Intrinsics.f(uuid, "uuid");
        caVar.f40867c = uuid;
        Intrinsics.f(originalTS, "originalTS");
        caVar.f40868e = originalTS;
        Intrinsics.f(config, "config");
        caVar.d = config;
        Intrinsics.f(size, "size");
        caVar.f = size;
        caVar.g = Integer.valueOf(this.adFormat.type);
        caVar.f40869h = Integer.valueOf(i2);
        caVar.f40870i = config.getSioPrice();
        new da(context, adPreferences, placement, lbVar, lbVar2, lbVar3, lbVar4, caVar).a();
    }

    public void load(Callback callback) {
        load(callback, null);
    }

    public BannerRequest setAdFormat(BannerFormat bannerFormat) {
        this.adFormat = bannerFormat;
        return this;
    }

    public BannerRequest setAdPreferences(AdPreferences adPreferences) {
        this.adPreferences = adPreferences;
        return this;
    }

    public BannerRequest setAdSize(int i2, int i3) {
        this.adSizeDp = new Point(i2, i3);
        return this;
    }

    public void load(Callback callback, String str) {
        ((z6) ((y6) this.eventTracer.a())).a((Object) this, ii.d);
        loadImpl(new e(this, callback, 1), str);
    }

    public BannerRequest(Context context, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9, lb lbVar10) {
        this.adFormat = BannerFormat.BANNER;
        this.context = context.getApplicationContext();
        this.eventTracer = lbVar;
        this.consentManager = lbVar2;
        this.adCacheManager = lbVar3;
        this.videoAdCacheManager = lbVar4;
        this.webViewFactory = lbVar5;
        this.httpClient = lbVar6;
        this.networkApiExecutor = lbVar7;
        this.motionProcessor = lbVar8;
        this.webViewCacheLoader = lbVar9;
        this.externalAds = lbVar10;
    }
}
