package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.C3276ue;
import com.inmobi.media.ads.network.common.model.LandingPageParam;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.Link;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.saran;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3276ue extends AbstractC3361y {
    public final C3230si b;
    public final Sg c;
    public final D4 d;
    public final AbstractC2863e1 e;
    public final Nc f;
    public final Ec g;
    public final saran h;
    public final taiyuan i;
    public final taiyuan j;
    public final taiyuan k;
    public final taiyuan l;
    public final taiyuan m;
    public final taiyuan n;
    public final taiyuan o;
    public final taiyuan p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3276ue(C3230si renderedStateCache, Sg publisherNativeViewData, D4 contextualDataHandler, AbstractC2863e1 adSessionManager, Nc nativeBeaconProcessor, Ec nativeAdUnitComponent) {
        super(nativeAdUnitComponent.a);
        Intrinsics.checkNotNullParameter(renderedStateCache, "renderedStateCache");
        Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        this.b = renderedStateCache;
        this.c = publisherNativeViewData;
        this.d = contextualDataHandler;
        this.e = adSessionManager;
        this.f = nativeBeaconProcessor;
        this.g = nativeAdUnitComponent;
        this.h = P4.a(k());
        this.i = saneness.saneness(new Function0() { // from class: adsuki.svd
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3276ue.g(this.f3696kowloon);
            }
        });
        this.j = saneness.saneness(new Function0() { // from class: adsuki.gargoyle
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3276ue.c(this.f3442kowloon);
            }
        });
        this.k = saneness.saneness(new Function0() { // from class: adsuki.acidy
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3276ue.e(this.f3301kowloon);
            }
        });
        this.l = saneness.saneness(new Function0() { // from class: adsuki.scarbroite
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3276ue.h(this.f3655kowloon);
            }
        });
        this.m = saneness.saneness(new Function0() { // from class: adsuki.adjudge
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3276ue.b(this.f3303kowloon);
            }
        });
        this.n = saneness.saneness(new Function0() { // from class: adsuki.bubbles
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3276ue.a(this.f3351kowloon);
            }
        });
        this.o = saneness.saneness(new Function0() { // from class: adsuki.phrasemonger
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3276ue.f(this.f3591kowloon);
            }
        });
        this.p = saneness.saneness(new Function0() { // from class: adsuki.atria
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3276ue.d(this.f3321kowloon);
            }
        });
    }

    public static final C3106ni a(C3276ue c3276ue) {
        return new C3106ni(c3276ue.d, c3276ue.e, c3276ue.g);
    }

    public static final Sc b(C3276ue c3276ue) {
        Ec ec = c3276ue.g;
        AbstractC2863e1 clickSession = c3276ue.e;
        D4 contextualDataHandler = c3276ue.d;
        Nc nativeBeaconProcessor = c3276ue.f;
        C3001jd nativeLandingPageHandler = (C3001jd) c3276ue.p.getValue();
        InterfaceC3072m9 interfaceC3072m9L = c3276ue.l();
        Intrinsics.checkNotNullParameter(ec, "<this>");
        Intrinsics.checkNotNullParameter(clickSession, "clickSession");
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeLandingPageHandler, "nativeLandingPageHandler");
        Intrinsics.checkNotNullParameter(ec, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonAssetObject assetsObject = ec.b.getAssetsObject();
        if (assetsObject != null) {
            Title title = assetsObject.getTitle();
            if (title != null) {
                Link link = title.getLink();
                linkedHashMap.put((short) 3, new Kc(link != null ? link.getUrl() : null, title.getTrackers()));
            }
            Description description = assetsObject.getDescription();
            if (description != null) {
                Link link2 = description.getLink();
                linkedHashMap.put((short) 4, new Kc(link2 != null ? link2.getUrl() : null, description.getTrackers()));
            }
            Icon icon = assetsObject.getIcon();
            if (icon != null) {
                Link link3 = icon.getLink();
                linkedHashMap.put((short) 5, new Kc(link3 != null ? link3.getUrl() : null, icon.getTrackers()));
            }
            CTA cta = assetsObject.getCta();
            if (cta != null) {
                Link link4 = cta.getLink();
                linkedHashMap.put((short) 6, new Kc(link4 != null ? link4.getUrl() : null, cta.getTrackers()));
            }
            Image adChoice = assetsObject.getAdChoice();
            if (adChoice != null) {
                Link link5 = adChoice.getLink();
                linkedHashMap.put((short) 7, new Kc(link5 != null ? link5.getUrl() : null, adChoice.getTrackers()));
            } else {
                linkedHashMap.put((short) 7, new Kc(ec.a.b.a.b.getNative().getAdChoiceConfig().getLink(), adultoid.formularize()));
            }
        }
        return new Sc(nativeLandingPageHandler, clickSession, contextualDataHandler, nativeBeaconProcessor, new Rc(ec.e, new C3355xi(linkedHashMap, ec.b.getMainLink(), ec.a.b.g)), interfaceC3072m9L);
    }

    public static final C2901fd c(C3276ue c3276ue) {
        saran saranVar = c3276ue.h;
        C3285un c3285un = (C3285un) c3276ue.i.getValue();
        Ec ec = c3276ue.g;
        Intrinsics.checkNotNullParameter(ec, "<this>");
        AdConfig.NativeViewabilityConfig viewabilityConfig = ec.a.b.a.b.getNative().getViewabilityConfig();
        F f = ec.a.b.m;
        C3360xn c3360xn = new C3360xn(viewabilityConfig.getImpressionConfig().getPollInterval(), f.d, AbstractC2960hl.a(viewabilityConfig.getParentMinDimension().getDimensions()), f.c);
        formularize formularizeVar = ((yo) c3276ue.l.getValue()).b;
        c3276ue.l();
        return new C2901fd(saranVar, c3285un, c3360xn, formularizeVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    public static final C3001jd d(C3276ue c3276ue) {
        boolean z;
        String creativeType;
        String openMode;
        List<LandingPageParam> landingPageParams;
        LandingPageParam landingPageParam;
        List<LandingPageParam> landingPageParams2;
        LandingPageParam landingPageParam2;
        Context context = c3276ue.g.a.a.b;
        G g = c3276ue.a.b;
        MetaInfo metaInfo = g.d;
        if (metaInfo != null && (landingPageParams2 = metaInfo.getLandingPageParams()) != null && (landingPageParam2 = (LandingPageParam) CollectionsKt.lotta(landingPageParams2, 0)) != null) {
            z = landingPageParam2.getSupportLockScreen();
        }
        G g2 = c3276ue.a.b;
        Jg jg = g2.a.a;
        long j = jg.a;
        String str = g2.m.b;
        String str2 = jg.g;
        String str3 = g2.c;
        MetaInfo metaInfo2 = g2.d;
        if (metaInfo2 == null || (creativeType = metaInfo2.getCreativeType()) == null) {
            creativeType = "unknown";
        }
        String str4 = creativeType;
        String str5 = c3276ue.g.a.b.i;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = str5;
        G g3 = c3276ue.a.b;
        boolean z2 = g3.b.a;
        MetaInfo metaInfo3 = g3.d;
        if (metaInfo3 == null || (landingPageParams = metaInfo3.getLandingPageParams()) == null || (landingPageParam = (LandingPageParam) CollectionsKt.lotta(landingPageParams, 0)) == null || (openMode = landingPageParam.getOpenMode()) == null) {
            openMode = "DEFAULT";
        }
        return new C3001jd(new C3026kd(context, g, z, new Za(j, str, str2, "native", str3, str4, str6, z2, openMode), (Dc) c3276ue.g.f.getValue(), c3276ue.g.c, c3276ue.l()));
    }

    public static final Fd e(C3276ue c3276ue) {
        Vb k5;
        NativeMedia media;
        NativeVideo video;
        saran saranVar = c3276ue.h;
        Ec ec = c3276ue.g;
        C3285un viewHolderConfig = (C3285un) c3276ue.i.getValue();
        Intrinsics.checkNotNullParameter(ec, "<this>");
        Intrinsics.checkNotNullParameter(viewHolderConfig, "viewHolderConfig");
        E e = ec.a.b.n;
        InMobiJsonResponse inMobiJsonResponse = ec.b;
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "<this>");
        JsonAssetObject assetsObject = inMobiJsonResponse.getAssetsObject();
        if ((assetsObject == null || (media = assetsObject.getMedia()) == null || (video = media.getVideo()) == null) ? false : video.getRequired()) {
            k5 = new Nm(((C3050lc) ec.g.getValue()).e, e.a);
        } else {
            AdConfig.NativeViewabilityConfig viewabilityConfig = ec.a.b.a.b.getNative().getViewabilityConfig();
            k5 = new K5(viewHolderConfig, new C3360xn(viewabilityConfig.getImpressionConfig().getPollInterval(), e.b, AbstractC2960hl.a(viewabilityConfig.getParentMinDimension().getDimensions()), e.a));
        }
        return new Fd(saranVar, k5, ((yo) c3276ue.l.getValue()).b);
    }

    public static final Ug f(C3276ue c3276ue) {
        c3276ue.getClass();
        return new Ug();
    }

    public static final C3285un g(C3276ue c3276ue) {
        NativeMedia media;
        NativeImage image;
        Icon icon;
        NativeMedia media2;
        NativeVideo video;
        NativeMedia media3;
        NativeMedia media4;
        Ec ec = c3276ue.g;
        Sg publisherNativeViewData = c3276ue.c;
        Intrinsics.checkNotNullParameter(ec, "<this>");
        Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        AdConfig.NativeConfig nativeConfig = ec.a.b.a.b.getNative();
        JsonAssetObject assetsObject = ec.b.getAssetsObject();
        Boolean boolValueOf = null;
        String type = (assetsObject == null || (media4 = assetsObject.getMedia()) == null) ? null : media4.getType();
        InMobiJsonResponse inMobiJsonResponse = ec.b;
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "<this>");
        JsonAssetObject assetsObject2 = inMobiJsonResponse.getAssetsObject();
        if (Intrinsics.wireman((assetsObject2 == null || (media3 = assetsObject2.getMedia()) == null) ? null : media3.getType(), "video")) {
            JsonAssetObject assetsObject3 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject3 != null && (media2 = assetsObject3.getMedia()) != null && (video = media2.getVideo()) != null) {
                boolValueOf = Boolean.valueOf(video.getRequired());
            }
        } else {
            JsonAssetObject assetsObject4 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject4 != null && (media = assetsObject4.getMedia()) != null && (image = media.getImage()) != null) {
                boolValueOf = Boolean.valueOf(image.getRequired());
            }
        }
        boolean required = false;
        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
        if (Intrinsics.wireman(type, "video")) {
            if (!zBooleanValue) {
                required = true;
            }
        } else if (assetsObject != null && (icon = assetsObject.getIcon()) != null) {
            required = icon.getRequired();
        }
        return new C3285un(required, zBooleanValue, AbstractC2960hl.a(nativeConfig.getViewabilityConfig().getIconMinDimension().getDimensions()), AbstractC2960hl.a(nativeConfig.getViewabilityConfig().getMediaMinDimension().getDimensions()), publisherNativeViewData);
    }

    public static final yo h(C3276ue c3276ue) {
        return new yo(c3276ue.a.b.a.b.getViewability().getWindowPollingInterval(), c3276ue.h, c3276ue.c.a.getParentView(), c3276ue.l());
    }
}
