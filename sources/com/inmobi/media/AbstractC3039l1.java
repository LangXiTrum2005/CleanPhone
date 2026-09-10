package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.TextView;
import arytenoidectomy.wireman;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.Partner;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.media.AbstractC3039l1;
import com.inmobi.media.EnumC2765a6;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.inmobi.media.ads.network.common.model.LandingPageParam;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import com.inmobi.media.ads.network.common.model.Viewability;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.saneness;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;
import patroclinal.formularize;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3039l1 extends AbstractC2880ei implements E2, InterfaceC3083mk, InterfaceC3312w0, ro {
    public static final /* synthetic */ int E = 0;
    public WatermarkData A;
    public final taiyuan B;
    public boolean C;
    public final taiyuan D;
    public final String a;
    public byte b;
    public final AdConfig c;
    public WeakReference d;
    public TimeoutConfigurations e;
    public WeakReference f;
    public final C3372ya g;
    public ArrayList h;
    public C3097n9 i;
    public Handler j;
    public boolean k;
    public C3287v0 l;
    public AdResponse m;
    public C3133ok n;
    public int o;
    public int p;
    public long q;
    public final TreeSet r;
    public boolean s;
    public String t;
    public C2785b0 u;
    public C2898fa v;
    public C3100nc w;
    public final Handler x;
    public final LinkedHashMap y;
    public final C3188r1 z;

    public AbstractC3039l1(Context context, C3287v0 adPlacement, Dk dk) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.a = string;
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        this.c = (AdConfig) Y3.a.a(AdConfig.class);
        this.g = (C3372ya) AbstractC3397za.a.getValue();
        this.h = new ArrayList();
        this.l = adPlacement;
        this.q = -1L;
        this.r = new TreeSet();
        this.x = new Handler(Looper.getMainLooper());
        this.y = new LinkedHashMap();
        this.z = new C3188r1(this);
        this.B = saneness.saneness(new Function0() { // from class: adsuki.hoiden
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC3039l1.d(this.f3460kowloon);
            }
        });
        this.d = new WeakReference(context);
        this.f = new WeakReference(dk);
        Ab ab = Jh.a;
        Jh.a(dk, this.i);
        WeakReference weakReference = this.f;
        String strL = l();
        AdSet adSetR = r();
        this.u = new C2785b0(weakReference, strL, adSetR != null ? adSetR.getIsRewarded() : false);
        L();
        this.D = saneness.saneness(new Function0() { // from class: adsuki.holophone
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC3039l1.e(this.f3461kowloon);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:8:0x0017, B:10:0x001d, B:13:0x0028, B:12:0x0023), top: B:21:0x0017, outer: #1 }] */
    public static final void c(AbstractC3039l1 abstractC3039l1) {
        AdConfig.OmidConfig omidConfig;
        Cf cf = Bf.a;
        Context contextN = abstractC3039l1.n();
        AdConfig adConfig = abstractC3039l1.c;
        cf.getClass();
        try {
            if (!Omid.isActive()) {
                Omid.activate(contextN);
                return;
            }
            if (adConfig != null) {
                try {
                    AdConfig.ViewabilityConfig viewability = adConfig.getViewability();
                    if (viewability == null || (omidConfig = viewability.getOmidConfig()) == null) {
                        omidConfig = new AdConfig.OmidConfig();
                    }
                } catch (Exception e) {
                    taiyuan taiyuanVar = P9.a;
                    P9.a(new L2(e));
                    return;
                }
            } else {
                omidConfig = new AdConfig.OmidConfig();
            }
            cf.b = Partner.createPartner(omidConfig.getPartnerKey(), cf.a());
        } catch (Exception e2) {
            taiyuan taiyuanVar2 = P9.a;
            AbstractC2973i9.a(e2);
        }
    }

    public static final ko d(AbstractC3039l1 abstractC3039l1) {
        return new ko(abstractC3039l1.i);
    }

    public final void A() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "initTelemetry " + this);
        }
        this.y.put("AdImpressionSuccessful", this.z);
    }

    public final boolean B() throws JSONException {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "isBlockingStateForLoadWithResponse getter " + this + " state=" + ((int) this.b));
        }
        if (!W6.a()) {
            d();
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), true, (short) 2141);
            return true;
        }
        if (E()) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n10.b("l1", "Some of the dependency libraries for " + l() + " not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return true;
        }
        byte b = this.b;
        if (b == 1) {
            C3097n9 c3097n11 = this.i;
            if (c3097n11 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n11.b("l1", "load with reasponse called while loading");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (short) 2001);
            return true;
        }
        if (b != 7) {
            return false;
        }
        C3097n9 c3097n12 = this.i;
        if (c3097n12 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n12.b("l1", "ad active before load");
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2003);
        return true;
    }

    public void C() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "load  " + this);
        }
        C3188r1 c3188r1 = this.z;
        c3188r1.getClass();
        c3188r1.c = SystemClock.elapsedRealtime();
        a(new Function0() { // from class: adsuki.portwide
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC3039l1.a(this.f3602kowloon);
            }
        }, new Function1() { // from class: adsuki.industrialist
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC3039l1.a(this.f3486kowloon, (EnumC2765a6) obj);
            }
        });
    }

    public final void D() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "makeUnitActive " + this);
        }
        this.k = false;
    }

    public boolean E() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "missingPrerequisitesForAd " + this);
        }
        try {
            polloi.saneness(wireman.class).taiyuan();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public void F() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "onDidParseAfterFetch " + this);
        }
        c((byte) 2);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: adsuki.nonexistence
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3039l1.c(this.f3558kowloon);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    public final Le G() {
        boolean z;
        Integer num;
        Integer num2;
        Integer num3;
        AdConfig.RenderingConfig rendering;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "prepareAdRequest " + this);
        }
        Context contextN = n();
        C2903ff c2903ff = contextN != null ? new C2903ff(contextN, this.i) : null;
        String str = this.l.g;
        Intrinsics.beachfront(str);
        this.l.getClass();
        C3287v0 c3287v0 = this.l;
        Map map = c3287v0.c;
        long j = c3287v0.a;
        String str2 = c3287v0.i;
        String strL = l();
        HashMap mapK = k();
        String str3 = this.l.d;
        AdConfig adConfig = this.c;
        if (adConfig != null && (rendering = adConfig.getRendering()) != null) {
            z = rendering.getEnablePubMuteControl() && Ji.f;
        }
        C3088n0 c3088n0 = new C3088n0(str, map, j, str2, strL, mapK, str3, z);
        C3100nc c3100nc = this.w;
        int iIntValue = 15000;
        long jIntValue = (c3100nc == null || (num3 = c3100nc.d) == null) ? 15000 : num3.intValue();
        C3100nc c3100nc2 = this.w;
        long jIntValue2 = (c3100nc2 == null || (num2 = c3100nc2.d) == null) ? 15000 : num2.intValue();
        C3100nc c3100nc3 = this.w;
        if (c3100nc3 != null && (num = c3100nc3.d) != null) {
            iIntValue = num.intValue();
        }
        C3158pk c3158pk = new C3158pk(jIntValue, jIntValue2, iIntValue);
        AdConfig adConfig2 = this.c;
        String url = adConfig2 != null ? adConfig2.getUrl() : null;
        AdConfig adConfig3 = this.c;
        Intrinsics.beachfront(adConfig3);
        Ak ak = new Ak(adConfig3.getIncludeIds());
        C2852df c2852dfA = c2903ff != null ? c2903ff.a() : null;
        C3097n9 c3097n10 = this.i;
        AdConfig adConfig4 = this.c;
        return new C3138p0(url, ak, c3088n0, c3158pk, c2852dfA, c3097n10, adConfig4 != null ? adConfig4.getApplyGzipReq() : false).a();
    }

    public final void H() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "printPublisherTestId " + this);
        }
        AbstractC3407zk.b();
    }

    public void I() throws JSONException {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "resetContainersForNextAd " + this);
        }
        int size = this.h.size();
        int i = this.p;
        if (size <= i || this.h.get(i) == null) {
            return;
        }
        a(this.p, false);
    }

    public final void J() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.d("l1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 1);
    }

    public void K() {
        Intrinsics.checkNotNullParameter("activity", "monetizationContext");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "setMonetizationContext " + this);
        }
        C3287v0 c3287v0 = this.l;
        c3287v0.getClass();
        Intrinsics.checkNotNullParameter("activity", "<set-?>");
        c3287v0.i = "activity";
    }

    public final void L() {
        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        toString();
        this.e = y();
        c((byte) 0);
        this.j = new Handler(Looper.getMainLooper());
        this.n = new C3133ok(this);
    }

    public final boolean M() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "shouldBlockLoadAd " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        if (adB != null && 4 == this.b && !z()) {
            AbstractC2915g1 abstractC2915g1M = m();
            if (abstractC2915g1M != null) {
                C3097n9 c3097n10 = this.i;
                if (c3097n10 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3097n10.a("l1", "ad is ready - load success");
                }
                d(abstractC2915g1M);
            } else {
                c((short) 2188);
            }
            return true;
        }
        if (adB == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2131);
            C3097n9 c3097n11 = this.i;
            if (c3097n11 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n11.b("l1", "ad no longer available");
            }
            return true;
        }
        if (2 == this.b) {
            if (!z()) {
                return false;
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2133);
            C3097n9 c3097n12 = this.i;
            if (c3097n12 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n12.b("l1", "ad is expired");
            }
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2132);
        C3097n9 c3097n13 = this.i;
        if (c3097n13 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n13.b("l1", "ad no longer available. state - " + ((int) this.b));
        }
        return true;
    }

    public final void N() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad;
        int i;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "startLoadingHTMLAd " + this);
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = null;
        try {
            AdSet adSetR = r();
            com.inmobi.media.ads.network.common.model.Ad ad2 = (adSetR == null || (i = this.o) < 0 || i >= adSetR.getAds().size()) ? null : adSetR.getAds().get(this.o);
            d(this.o);
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                AdSet adSetR2 = r();
                c3097n10.a("l1", "Loading ad with impressionId : " + ((adSetR2 == null || (ads = adSetR2.getAds()) == null || (ad = ads.get(this.o)) == null) ? null : ad.getImpressionId()));
            }
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = (GestureDetectorOnGestureListenerC2829ci) this.h.get(this.o);
            if (ad2 != null) {
                Gg pubContent = ad2.getPubContent();
                if (pubContent instanceof U7) {
                    C3097n9 c3097n11 = this.i;
                    if (c3097n11 != null) {
                        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                        c3097n11.a("l1", "Loading HTML content into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC2829ci2 != null) {
                        gestureDetectorOnGestureListenerC2829ci2.h(((U7) pubContent).a);
                    }
                } else if (pubContent instanceof V7) {
                    C3097n9 c3097n12 = this.i;
                    if (c3097n12 != null) {
                        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                        c3097n12.a("l1", "Loading HTML URL into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC2829ci2 != null) {
                        gestureDetectorOnGestureListenerC2829ci2.j(StringsKt.stupefactive(((V7) pubContent).a).toString());
                    }
                }
            }
            if (gestureDetectorOnGestureListenerC2829ci2 == null || !Intrinsics.wireman(s(), "htmlUrl")) {
                return;
            }
            m(gestureDetectorOnGestureListenerC2829ci2);
        } catch (Exception e) {
            C3097n9 c3097n13 = this.i;
            if (c3097n13 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n13.a("l1", "Loading ad markup into container encountered an unexpected error: " + e.getMessage());
            }
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e);
            int i2 = this.o;
            if (i2 >= 0 && i2 < this.h.size()) {
                gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) this.h.get(this.o);
            }
            a(gestureDetectorOnGestureListenerC2829ci, (short) 2135);
        }
    }

    public final void O() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "submitAdLoadCalled " + this);
        }
        HashMap map = new HashMap();
        c(map);
        c("AdLoadCalled", map);
    }

    public final void P() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "submitAdLoadSuccessfulEvent ADunit markuptype : " + s() + " " + this);
        }
        HashMap map = new HashMap();
        long j = this.z.c;
        saran saranVar = AbstractC2984il.a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO == null || (impressionId = adO.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adO2 = o();
        if (adO2 != null && (metaInfo = adO2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        C2898fa c2898fa = this.v;
        if (c2898fa != null) {
            map.put("retryCount", Integer.valueOf(c2898fa.b));
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.getIsRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        c("AdLoadSuccessful", map);
    }

    public final void Q() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "submitAdShowCalled " + this);
        }
        C3188r1 c3188r1 = this.z;
        c3188r1.getClass();
        c3188r1.f = SystemClock.elapsedRealtime();
        HashMap map = new HashMap();
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        long j = this.z.i;
        saran saranVar = AbstractC2984il.a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.getIsRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        c("AdShowCalled", map);
    }

    public final void R() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "submitAdShowSuccess " + this);
        }
        HashMap map = new HashMap();
        long j = this.z.f;
        saran saranVar = AbstractC2984il.a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.getIsRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        c("AdShowSuccessful", map);
    }

    public final void S() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "submitRenderSuccessEvent ADunit markuptype : " + s() + " " + this);
        }
        HashMap map = new HashMap();
        long j = this.z.g;
        saran saranVar = AbstractC2984il.a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        C2898fa c2898fa = this.v;
        if (c2898fa != null) {
            map.put("retryCount", Integer.valueOf(c2898fa.b));
        }
        map.put("plType", Byte.valueOf(t()));
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.getIsRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        a(p(), map);
        c("RenderSuccess", map);
    }

    public final long T() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "timeSincePodShow " + this);
        }
        if (this.s) {
            return System.currentTimeMillis() - this.q;
        }
        return -1L;
    }

    public final void U() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.b("l1", "ad unloaded");
        }
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n10.d("l1", "AdUnit " + this + " state - UNLOADED");
        }
        c((byte) 8);
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public void a(GestureDetectorOnGestureListenerC2829ci renderView, boolean z) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "onRenderProcessGone didCrash=" + z + " state=" + ((int) this.b));
        }
        byte b = this.b;
        if (b == 0) {
            short s = z ? (short) 2214 : (short) 2213;
            J();
            renderView.a(z, s);
            return;
        }
        if (b == 1) {
            short s2 = z ? (short) 2216 : (short) 2215;
            J();
            c(s2);
            AbstractC2915g1 abstractC2915g1M = m();
            if (abstractC2915g1M != null) {
                abstractC2915g1M.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b == 3) {
            renderView.a(z, z ? (short) 2226 : (short) 2225);
            return;
        }
        if (b == 2) {
            J();
            c(z ? (short) 2218 : (short) 2217);
            AbstractC2915g1 abstractC2915g1M2 = m();
            if (abstractC2915g1M2 != null) {
                abstractC2915g1M2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b == 4 || b == 6 || b == 7 || b != 8) {
            return;
        }
        renderView.a(z, z ? (short) 2240 : (short) 2241);
    }

    public final com.inmobi.media.ads.network.common.model.Ad b(int i) {
        Iterable iterableFormularize;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads3;
        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        toString();
        AdSet adSetR = r();
        if (adSetR == null || (ads3 = adSetR.getAds()) == null || (iterableFormularize = adultoid.impassible(ads3)) == null) {
            iterableFormularize = adultoid.formularize();
        }
        if (CollectionsKt.permissivist(iterableFormularize, Integer.valueOf(i))) {
            AdSet adSetR2 = r();
            if (adSetR2 == null || (ads2 = adSetR2.getAds()) == null) {
                return null;
            }
            return ads2.get(i);
        }
        AdSet adSetR3 = r();
        if (adSetR3 == null || (ads = adSetR3.getAds()) == null) {
            return null;
        }
        return ads.peekFirst();
    }

    public final void e(AbstractC2915g1 abstractC2915g1) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "adUnitEventListener setter " + this);
        }
        WeakReference weakReference = new WeakReference(abstractC2915g1);
        this.f = weakReference;
        AdSet adSetR = r();
        C2785b0 c2785b0 = new C2785b0(weakReference, "int", adSetR != null ? adSetR.getIsRewarded() : false);
        this.u = c2785b0;
        C3097n9 logger = this.i;
        if (logger != null) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            c2785b0.f = logger;
        }
    }

    public final void f() throws JSONException {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "destroyAllContainer " + this);
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            a(i, true);
        }
    }

    public final void g() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "doAdLoadWork " + this);
        }
        try {
            c((byte) 1);
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n10.d("l1", "AdUnit " + this + " state - LOADING");
            }
            H();
            C2968i4 c2968i4 = Y3.a;
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            if (((RootConfig) Y3.a.a(RootConfig.class)).getMonetizationDisabled()) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (short) 2012);
                C3097n9 c3097n11 = this.i;
                if (c3097n11 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3097n11.b("l1", "Monetization is Disabled");
                    return;
                }
                return;
            }
            if (d((byte) 0)) {
                this.g.a(this.a, new C2940h1(this, null));
                C3097n9 c3097n12 = this.i;
                if (c3097n12 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3097n12.a("l1", "Fresh ad requested");
                }
            }
        } catch (Exception e) {
            C3097n9 c3097n13 = this.i;
            if (c3097n13 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n13.b("l1", "Load failed with unexpected error: " + e.getMessage());
            }
            taiyuan taiyuanVar = P9.a;
            P9.a(new L2(e));
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2000);
        }
    }

    public final void h() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "fireAdServedBeacon " + this);
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciI = i();
        if (gestureDetectorOnGestureListenerC2829ciI == null) {
            return;
        }
        gestureDetectorOnGestureListenerC2829ciI.t();
    }

    public final GestureDetectorOnGestureListenerC2829ci i() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "adMarkupContainer getter " + this);
        }
        byte b = this.b;
        String strS = s();
        if (Intrinsics.wireman(strS, "html")) {
            if (b == 0 || 1 == b || 3 == b || 8 == b) {
                return null;
            }
            return q();
        }
        if (!Intrinsics.wireman(strS, "htmlUrl") || b == 0 || 1 == b || 3 == b || 8 == b) {
            return null;
        }
        return q();
    }

    public final AdMetaInfo j() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "adMetaInfo getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        if (adB != null) {
            return new AdMetaInfo(adB.getCreativeId(), adB.getTransaction());
        }
        return null;
    }

    public HashMap k() {
        return new HashMap();
    }

    public abstract String l();

    public final void l(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        int iIndexOf = this.h.indexOf(gestureDetectorOnGestureListenerC2829ci);
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.b("l1", "fireLoadAdTokenUrlFailed : " + iIndexOf + " " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(iIndexOf);
        if (adB != null) {
            for (String url : AbstractC3380yi.a(adB, "load_ad_token_url_failure")) {
                C3315w3 c3315w3 = C3315w3.a;
                C3097n9 c3097n10 = this.i;
                Intrinsics.checkNotNullParameter(url, "url");
                C3315w3.a(url, true, c3097n10);
            }
        }
    }

    public final AbstractC2915g1 m() {
        C3097n9 c3097n9;
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n10.c("l1", "adUnitEventListener getter " + this);
        }
        AbstractC2915g1 abstractC2915g1 = (AbstractC2915g1) this.f.get();
        if (abstractC2915g1 == null && (c3097n9 = this.i) != null) {
            c3097n9.b("InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return abstractC2915g1;
    }

    public final Context n() {
        WeakReference weakReference = this.d;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public final com.inmobi.media.ads.network.common.model.Ad o() {
        return this.s ? b(this.o) : b(0);
    }

    public final com.inmobi.media.ads.network.common.model.Ad p() {
        return this.s ? b(this.p) : b(0);
    }

    public abstract GestureDetectorOnGestureListenerC2829ci q();

    public void q(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "onAdUnloadedAfterShowSuccess");
        }
        renderView.m();
        b((byte) 4);
    }

    public final AdSet r() {
        List<AdSet> adSets;
        AdResponse adResponse = this.m;
        if (adResponse == null || (adSets = adResponse.getAdSets()) == null) {
            return null;
        }
        return (AdSet) CollectionsKt.firstOrNull(adSets);
    }

    public final String s() {
        String markupType;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "markupType getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        return (adB == null || (markupType = adB.getMarkupType()) == null) ? "unknown" : markupType;
    }

    public abstract byte t();

    public final String u() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "getPodAdContext " + this);
        }
        if (this.s) {
            return this.t;
        }
        return null;
    }

    public final JSONArray v() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "getRenderableAdIndexes " + this);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.r.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            jSONArray.put(((Number) next).intValue());
        }
        return jSONArray;
    }

    public final long w() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "getShowTimeStamp " + this);
        }
        if (this.s) {
            return this.q;
        }
        return -1L;
    }

    public final String x() {
        String telemetryMetadataBlob;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet adSetR = r();
        com.inmobi.media.ads.network.common.model.Ad ad = (adSetR == null || (ads = adSetR.getAds()) == null) ? null : (com.inmobi.media.ads.network.common.model.Ad) CollectionsKt.firstOrNull(ads);
        return (ad == null || (telemetryMetadataBlob = ad.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }

    public final TimeoutConfigurations y() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "timeOutConfiguration getter " + this);
        }
        AdConfig adConfig = this.c;
        Intrinsics.beachfront(adConfig);
        return adConfig.getTimeouts();
    }

    public final boolean z() {
        AdConfig.CacheConfig cacheConfig;
        C3097n9 c3097n9;
        boolean z = false;
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        if (adB == null) {
            return false;
        }
        AdConfig adConfig = this.c;
        if (adConfig != null && (cacheConfig = adConfig.getCacheConfig(l())) != null) {
            z = ((adB.getExpiryTimestampInMillis() > (-1L) ? 1 : (adB.getExpiryTimestampInMillis() == (-1L) ? 0 : -1)) == 0 ? TimeUnit.SECONDS.toMillis(cacheConfig.getTimeToLive()) + adB.getInsertionTimestampInMillis() : adB.getExpiryTimestampInMillis()) - System.currentTimeMillis() < 0;
            if (z && (c3097n9 = this.i) != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n9.b("l1", "Top ad has expired, failing show of ad.");
            }
        }
        return z;
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void k(GestureDetectorOnGestureListenerC2829ci renderView) throws JSONException {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        byte b = this.b;
        if (b == 2) {
            U();
            b((byte) 1);
            AbstractC2915g1 abstractC2915g1M = m();
            InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
            if (abstractC2915g1M != null) {
                abstractC2915g1M.a(this, inMobiAdRequestStatus);
            } else {
                C3097n9 c3097n9 = this.i;
                if (c3097n9 != null) {
                    c3097n9.a();
                }
            }
            c((short) 2238);
            renderView.b();
            return;
        }
        if (b == 4) {
            p(renderView);
            renderView.b();
            b((byte) 4);
        } else {
            if (b == 6 || b == 7) {
                q(renderView);
                return;
            }
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n10.b("l1", "onUnloadCalled - invalid state - " + ((int) this.b));
            }
        }
    }

    public final int n(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "getCurrentRenderingPodAdIndex " + this);
        }
        if (!this.s) {
            return -1;
        }
        int iIndexOf = this.h.indexOf(renderView);
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n10.c("l1", "getCurrentRenderingPodAdIndex " + iIndexOf);
        }
        return iIndexOf;
    }

    public final void d(int i) {
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "initializeHtmlAdContainer " + this);
        }
        Context contextN = n();
        if (contextN == null) {
            return;
        }
        try {
            if (this.h.get(i) != null && ((gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) this.h.get(i)) == null || !gestureDetectorOnGestureListenerC2829ci.M.get())) {
                return;
            }
            com.inmobi.media.ads.network.common.model.Ad adB = b(i);
            C3113o0 c3113o0A = a(i);
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = ((ko) this.B.getValue()).a(new Di("adUnit-" + i, BuildConfig.FLAVOR), contextN, (short) 0, c3113o0A, this.c);
            a(gestureDetectorOnGestureListenerC2829ciA, c3113o0A.p);
            this.h.set(i, gestureDetectorOnGestureListenerC2829ciA);
            gestureDetectorOnGestureListenerC2829ciA.a(this);
            gestureDetectorOnGestureListenerC2829ciA.a(adB);
        } catch (Exception e) {
            a((GestureDetectorOnGestureListenerC2829ci) this.h.get(this.o), (short) 2136);
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n10.a("l1", "Exception while initializing WebView", e);
            }
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e);
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void h(final GestureDetectorOnGestureListenerC2829ci renderView) {
        Handler handler;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "onRenderViewSignaledAdFailed " + this);
        }
        if (this.k || n() == null || (handler = this.j) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: adsuki.emodin
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3039l1.a(this.f3420kowloon, renderView);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public void j(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "RenderView visible, for index " + this.h.indexOf(renderView) + " " + this);
        }
    }

    public final void m(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        int iIndexOf = this.h.indexOf(gestureDetectorOnGestureListenerC2829ci);
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "fireLoadAdTokenUrlSuccessful : " + iIndexOf + " " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(iIndexOf);
        if (adB != null) {
            for (String url : AbstractC3380yi.a(adB, "load_ad_token_url")) {
                C3315w3 c3315w3 = C3315w3.a;
                C3097n9 c3097n10 = this.i;
                Intrinsics.checkNotNullParameter(url, "url");
                C3315w3.a(url, true, c3097n10);
            }
        }
    }

    public void o(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        Gh gh;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "Render view signaled ad ready, for index " + this.h.indexOf(gestureDetectorOnGestureListenerC2829ci) + " " + this);
        }
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n10.a("l1", "==== CHECKPOINT REACHED - LOAD SUCCESS ====");
        }
        C3097n9 c3097n11 = this.i;
        if (c3097n11 == null || (gh = c3097n11.a) == null) {
            return;
        }
        gh.a();
    }

    public void p(GestureDetectorOnGestureListenerC2829ci renderView) {
        int iN;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "onAdUnloadedAfterLoadSuccess");
        }
        if (this.s && (iN = n(renderView)) > this.p) {
            this.r.remove(Integer.valueOf(iN));
        } else {
            U();
        }
    }

    public final void b(AbstractC2915g1 abstractC2915g1) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "onAdShowFailed " + this);
        }
        d((short) 85);
        abstractC2915g1.b();
    }

    public final void b(InMobiAdRequestStatus requestStatus, short s) {
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "onAdFetchFailed " + this);
        }
        if (!this.k && n() != null && this.b != 3) {
            a(requestStatus, s);
            return;
        }
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n10.b("l1", "callback ignored - isDestroyed - " + this.k + " context - " + n() + " state- " + ((int) this.b));
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void i(final GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "onRenderViewSignaledAdReady " + this);
        }
        if (!this.k && n() != null) {
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: adsuki.transpositive
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC3039l1.b(this.f3715kowloon, renderView);
                    }
                });
                return;
            } else {
                c((short) 2187);
                return;
            }
        }
        c((short) 2186);
    }

    public final void e() throws JSONException {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "clearAdPods " + this);
        }
        if (this.s) {
            f();
            this.h.clear();
            this.o = 0;
            this.p = 0;
            this.r.clear();
        }
    }

    public final void c(byte b) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.d("l1", "STATE UPDATE: from " + ((int) this.b) + " to " + ((int) b));
        }
        this.b = b;
    }

    public final boolean c(int i) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "getAllowAutoRedirectionForIndex " + this + " index - " + i);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(i);
        return adB != null && adB.getAllowAutoRedirection();
    }

    public final void b(InMobiAdRequestStatus requestStatus, boolean z, short s) {
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.b("l1", "handleAdLoadFailure " + this + " errorCode - " + ((int) s));
        }
        if (this.b == 1 && z) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n10.b("l1", "load failed - " + ((int) s));
            }
            C3097n9 c3097n11 = this.i;
            if (c3097n11 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n11.d("l1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC2915g1 abstractC2915g1M = m();
        if (abstractC2915g1M != null) {
            abstractC2915g1M.a(this, requestStatus);
        } else {
            C3097n9 c3097n12 = this.i;
            if (c3097n12 != null) {
                c3097n12.a();
            }
        }
        if (s != 0) {
            c(s);
        }
    }

    public final void c(AbstractC2915g1 listener) {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        Intrinsics.checkNotNullParameter(listener, "listener");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "onFetchSuccess " + this);
        }
        HashMap map = new HashMap();
        c(map);
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO == null || (impressionId = adO.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        long j = this.z.h;
        saran saranVar = AbstractC2984il.a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put("metadataBlob", x());
        C2898fa c2898fa = this.v;
        if (c2898fa != null) {
            map.put("retryCount", Integer.valueOf(c2898fa.b));
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.getIsRewarded()));
        }
        com.inmobi.media.ads.network.common.model.Ad adO2 = o();
        if (adO2 != null && (metaInfo = adO2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        c("ParseSuccess", map);
        AdMetaInfo adMetaInfoJ = j();
        if (adMetaInfoJ == null) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n10.b("l1", "ad meta info null. fail");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2106);
            return;
        }
        C3097n9 c3097n11 = this.i;
        if (c3097n11 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n11.a("l1", "callback - onAdFetchSuccess");
        }
        listener.b(adMetaInfoJ);
    }

    public final void e(int i) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "resetCurrentRenderingIndex " + this);
        }
        this.p = i;
    }

    public static final void a(AbstractC3039l1 abstractC3039l1, W w) {
        abstractC3039l1.getClass();
        if (w instanceof C2925gb) {
            C3188r1 c3188r1 = abstractC3039l1.z;
            c3188r1.getClass();
            c3188r1.d = SystemClock.elapsedRealtime();
            return;
        }
        if (w instanceof If) {
            C3188r1 c3188r2 = abstractC3039l1.z;
            c3188r2.getClass();
            c3188r2.h = SystemClock.elapsedRealtime();
        } else {
            if (w instanceof Oi) {
                Map map = ((Oi) w).a;
                Map mapKowloon = seminary.kowloon(formularize.attabal("latency", Long.valueOf(SystemClock.elapsedRealtime() - abstractC3039l1.z.d)), formularize.attabal("networkType", C3342x5.m()), formularize.attabal("plId", Long.valueOf(abstractC3039l1.l.a)));
                mapKowloon.putAll(map);
                String str = abstractC3039l1.l.f;
                if (str != null) {
                    mapKowloon.put("plType", str);
                }
                String str2 = abstractC3039l1.l.e;
                if (str2 != null) {
                    mapKowloon.put("adType", str2);
                }
                abstractC3039l1.b("ServerFill", mapKowloon);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final po e(AbstractC3039l1 abstractC3039l1) {
        com.inmobi.media.ads.network.common.model.Ad adB = abstractC3039l1.b(0);
        if (adB == null || abstractC3039l1.z()) {
            adB = null;
        }
        C3097n9 c3097n9 = abstractC3039l1.i;
        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        return new po(adB, c3097n9);
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void g(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "RenderView completed loading ad content, for index " + this.h.indexOf(renderView) + " " + this);
        }
    }

    public final void d(AbstractC2915g1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "onLoadSuccess " + this);
        }
        AdMetaInfo adMetaInfoJ = j();
        if (adMetaInfoJ == null) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n10.b("l1", "load success - ad unit null");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2107);
            return;
        }
        b((byte) 1);
        C3097n9 c3097n11 = this.i;
        if (c3097n11 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n11.a("l1", "callback - onAdLoadSucceeded");
        }
        listener.c(adMetaInfoJ);
    }

    public static final void b(AbstractC3039l1 abstractC3039l1, GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        abstractC3039l1.o(gestureDetectorOnGestureListenerC2829ci);
    }

    public final void b(String podAdContext) {
        Intrinsics.checkNotNullParameter(podAdContext, "podAdContext");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "setPodAdContext " + this);
        }
        if (this.s) {
            this.t = podAdContext;
        }
    }

    public static final void b(AbstractC3039l1 abstractC3039l1) {
        if (6 == abstractC3039l1.b) {
            abstractC3039l1.a((short) 2158);
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void b(HashMap rewards) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "onAdRewardActionCompleted " + this);
        }
        if (this.k || n() == null) {
            return;
        }
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n10.a("l1", "Ad reward action completed. Params:" + rewards);
        }
        AbstractC2915g1 abstractC2915g1M = m();
        if (abstractC2915g1M != null) {
            abstractC2915g1M.b(rewards);
        }
    }

    public void d() throws JSONException {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "clear " + this);
        }
        if (this.k) {
            return;
        }
        this.k = true;
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        e();
        C2898fa c2898fa = this.v;
        if (c2898fa != null) {
            c2898fa.b = 0;
        }
        I();
        c((byte) 0);
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n10.d("l1", "AdUnit " + this + " state - CREATED");
        }
        C3372ya c3372ya = this.g;
        String id = this.a;
        c3372ya.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        List list = (List) c3372ya.b.get(id);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                monroe.attabal.attabal((monroe) it.next(), null, 1, null);
            }
        }
        List list2 = (List) c3372ya.b.get(id);
        if (list2 != null) {
            list2.clear();
        }
        this.m = null;
        this.s = false;
    }

    public final void b(short s) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "submitAdLoadDroppedAtSDK " + this);
        }
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        c(map);
        c("AdLoadDroppedAtSDK", map);
    }

    public final void b(Map map) {
        MetaInfo metaInfo;
        String creativeType;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.z.d));
        map.put("networkType", C3342x5.m());
        map.put("plId", Long.valueOf(this.l.a));
        AdSet adSetR = r();
        map.put("isRewarded", Boolean.valueOf(adSetR != null ? adSetR.getIsRewarded() : false));
        String str = this.l.e;
        if (str != null) {
            map.put("adType", str);
        }
        String str2 = this.l.f;
        if (str2 != null) {
            map.put("plType", str2);
        }
        C2898fa c2898fa = this.v;
        if (c2898fa != null) {
            map.put("retryCount", Integer.valueOf(c2898fa.b));
        }
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO != null && (metaInfo = adO.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        a(o(), map);
        b("ServerError", map);
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void c() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "onAdScreenDisplayFailed " + this);
        }
        if (this.k || n() == null) {
            return;
        }
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n10.b("l1", "Ad failed to display");
        }
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: adsuki.midian
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3039l1.b(this.f3536kowloon);
                }
            });
        }
    }

    public final void a(Context context, C3287v0 adPlacement, Dk dk) {
        C3287v0 c3287v0;
        String str;
        String str2;
        C3097n9 c3097n9;
        C3097n9 c3097n10;
        C3097n9 c3097n11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        toString();
        a(context);
        this.f = new WeakReference(dk);
        Ab ab = Jh.a;
        Jh.a(dk, this.i);
        WeakReference weakReference = this.f;
        String strL = l();
        AdSet adSetR = r();
        this.u = new C2785b0(weakReference, strL, adSetR != null ? adSetR.getIsRewarded() : false);
        this.l = adPlacement;
        A();
        C3097n9 c3097n12 = this.i;
        if (c3097n12 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n12.c("l1", "initInternetAvailabilityAdRetry");
        }
        if (this.c == null && (c3097n11 = this.i) != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n11.c("l1", "adConfig is null");
            Unit unit = Unit.f29295attabal;
        }
        if (this.l.f == null && (c3097n10 = this.i) != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n10.c("l1", "placement.placementType is null");
            Unit unit2 = Unit.f29295attabal;
        }
        if (this.l.e == null && (c3097n9 = this.i) != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "placement.adType is null");
            Unit unit3 = Unit.f29295attabal;
        }
        AdConfig adConfig = this.c;
        if (adConfig != null && (str = (c3287v0 = this.l).f) != null && (str2 = c3287v0.e) != null) {
            C3100nc c3100ncA = AbstractC3075mc.a(adConfig.getTimeouts().X(), str, str2, Ki.b);
            this.v = new C2898fa(c3100ncA);
            this.w = c3100ncA;
        }
        if (J5.h != null) {
            Intrinsics.checkNotNullExpressionValue("J5", "TAG");
        } else {
            J5.h = Float.valueOf(new TextView(context).getTextSize());
            Intrinsics.checkNotNullExpressionValue("J5", "TAG");
        }
        L();
    }

    public final void c(HashMap map) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "constructTelemetryPayload " + this);
        }
        map.put("adType", l());
        map.put("networkType", C3342x5.m());
        map.put("plId", Long.valueOf(this.l.a));
        String str = this.l.f;
        if (str != null) {
            map.put("plType", str);
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void d(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (this.C) {
            return;
        }
        this.C = true;
        C3081mi c3081mi = renderView.d0;
        if (c3081mi != null) {
            Map mapA = c3081mi.a();
            Wj wj = Wj.a;
            Wj.b("AttachedToWindow", mapA, EnumC2779ak.SDK);
        }
    }

    public final void c(short s) {
        long j;
        long jElapsedRealtime;
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "submitAdLoadFailedEvent " + this);
        }
        HashMap map = new HashMap();
        if (s == 2138 || s == 2109) {
            j = this.z.e;
            saran saranVar = AbstractC2984il.a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else if (s == 2139) {
            j = this.z.g;
            saran saranVar2 = AbstractC2984il.a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j = this.z.c;
            saran saranVar3 = AbstractC2984il.a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        map.put("latency", Long.valueOf(jElapsedRealtime - j));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO == null || (impressionId = adO.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adO2 = o();
        if (adO2 != null && (metaInfo = adO2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        C2898fa c2898fa = this.v;
        if (c2898fa != null) {
            map.put("retryCount", Integer.valueOf(c2898fa.b));
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.getIsRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        a(o(), map);
        c("AdLoadFailed", map);
    }

    public final void d(short s) {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "submitAdShowFailed " + this);
        }
        HashMap map = new HashMap();
        long j = this.z.f;
        saran saranVar = AbstractC2984il.a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.getIsRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        a(p(), map);
        c("AdShowFailed", map);
    }

    public final void b(String str, Map map) {
        com.inmobi.media.ads.network.common.model.Ad adO;
        MetaInfo metaInfo;
        String creativeType;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "onTelemetryEvent " + this + " adState=" + ((int) this.b));
        }
        if (this.b != 3) {
            a(str, map);
            if ((Intrinsics.wireman(str, "ServerFill") || Intrinsics.wireman(str, "ServerError")) && (adO = o()) != null && (metaInfo = adO.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
                map.put("creativeType", creativeType);
            }
            c(str, map);
        }
    }

    public final void b(com.inmobi.media.ads.network.common.model.Ad ad) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "updateAd " + this);
        }
        AdSet adSetR = r();
        if (adSetR == null || (ads = adSetR.getAds()) == null) {
            return;
        }
        ads.set(0, ad);
    }

    public final void b(byte b) {
        C3133ok c3133ok;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "cancelTimer " + this);
        }
        if (b == 1 && (c3133ok = this.n) != null) {
            c3133ok.a((byte) 2);
        }
        C3133ok c3133ok2 = this.n;
        if (c3133ok2 != null) {
            c3133ok2.a(b);
        }
    }

    public final void b(int i, boolean z) {
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "fireAdPodShowResult " + this);
        }
        ArrayList list = this.h;
        Intrinsics.checkNotNullParameter(list, "list");
        if (i < 0 || i >= list.size() || (gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) this.h.get(i)) == null) {
            return;
        }
        gestureDetectorOnGestureListenerC2829ci.b(z);
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "setContext " + this);
        }
        this.d = new WeakReference(context);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    public final boolean d(byte b) {
        int iY;
        Integer num;
        long j;
        Integer num2;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "startTimer " + this);
        }
        if (b == 0) {
            C3100nc c3100nc = this.w;
            if (c3100nc == null || (num2 = c3100nc.d) == null) {
                j = 15000;
            } else {
                iY = num2.intValue();
                j = iY;
            }
        } else if (b == 1) {
            C3100nc c3100nc2 = this.w;
            if (c3100nc2 != null) {
                iY = c3100nc2.c;
                j = iY;
            } else {
                j = 15000;
            }
        } else {
            if (b == 2) {
                C3100nc c3100nc3 = this.w;
                if (c3100nc3 == null || (num = c3100nc3.e) == null) {
                    j = 15000;
                } else {
                    iY = num.intValue();
                }
            } else if (b == 4) {
                TimeoutConfigurations timeoutConfigurations = this.e;
                Intrinsics.beachfront(timeoutConfigurations);
                iY = timeoutConfigurations.Y();
            } else {
                C3097n9 c3097n10 = this.i;
                if (c3097n10 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3097n10.b("l1", "Invalid value for timeOutScenario passed!. Please pass a valid value");
                }
                return false;
            }
            j = iY;
        }
        C3133ok c3133ok = this.n;
        return c3133ok != null && c3133ok.a(b, j);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0130  */
    /* JADX WARN: Code duplicated, block: B:78:0x0195  */
    public final C3113o0 a(int i) {
        String markupType;
        String openMode;
        InlineParams inlineParams;
        String creativeId;
        MetaInfo metaInfo;
        String creativeType;
        List<LandingPageParam> landingPageParams;
        LandingPageParam landingPageParam;
        List<LandingPageParam> landingPageParams2;
        LandingPageParam landingPageParam2;
        AdConfig.ViewabilityConfig viewability;
        AdConfig.OmidConfig omidConfig;
        MetaInfo metaInfo2;
        com.inmobi.media.ads.network.common.model.Ad ad = b(i);
        if (ad == null || (markupType = ad.getMarkupType()) == null) {
            markupType = "html";
        }
        String str = markupType;
        String str2 = "audio";
        String str3 = (Intrinsics.wireman(this.l.e, "banner") || Intrinsics.wireman(this.l.e, "audio")) ? this.l.h : null;
        String str4 = this.l.e;
        boolean zA = a(ad);
        long j = this.l.a;
        boolean zC = c(i);
        String str5 = this.l.k;
        String creativeType2 = (ad == null || (metaInfo2 = ad.getMetaInfo()) == null) ? null : metaInfo2.getCreativeType();
        AdMetaInfo adMetaInfoJ = j();
        String creativeID = adMetaInfoJ != null ? adMetaInfoJ.getCreativeID() : null;
        boolean z = this.l.j;
        String str6 = creativeType2;
        LinkedHashMap linkedHashMap = this.y;
        WatermarkData watermarkData = this.A;
        AdQualityControl adQualityControl = ad != null ? ad.getAdQualityControl() : null;
        byte bT = t();
        Intrinsics.beachfront(ad);
        AdConfig adConfig = this.c;
        Intrinsics.checkNotNullParameter(ad, "ad");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MetaInfo metaInfo3 = ad.getMetaInfo();
        if (Intrinsics.wireman((adConfig == null || (viewability = adConfig.getViewability()) == null || (omidConfig = viewability.getOmidConfig()) == null) ? null : Boolean.valueOf(omidConfig.isOmidEnabled()), Boolean.TRUE)) {
            if ((metaInfo3 != null ? metaInfo3.getOmsdkInfo() : null) != null) {
                OmSdkInfo omsdkInfo = metaInfo3.getOmsdkInfo();
                if (omsdkInfo.getOmidEnabled()) {
                    C3332wk c3332wk = new C3332wk((byte) 3);
                    boolean isolateVerificationScripts = omsdkInfo.getIsolateVerificationScripts();
                    String customReferenceData = omsdkInfo.getCustomReferenceData();
                    HashMap<String, String> obj = omsdkInfo.getMacros();
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    JSONObject jSONObjectA = AbstractC3073ma.a(obj, obj.getClass());
                    byte impressionType = omsdkInfo.getImpressionType();
                    String creativeType3 = metaInfo3.getCreativeType();
                    int iHashCode = creativeType3.hashCode();
                    if (iHashCode != 93166550) {
                        if (iHashCode == 112202875) {
                            str2 = "video";
                            if (!creativeType3.equals("video")) {
                                str2 = "unknown";
                            }
                        } else if (iHashCode != 1425678798) {
                            str2 = "unknown";
                        } else {
                            str2 = "nonvideo";
                            if (!creativeType3.equals("nonvideo")) {
                                str2 = "unknown";
                            }
                        }
                    } else if (!creativeType3.equals("audio")) {
                        str2 = "unknown";
                    }
                    HashMap map = new HashMap();
                    if (jSONObjectA != null) {
                        for (Iterator<String> itKeys = jSONObjectA.keys(); itKeys.hasNext(); itKeys = itKeys) {
                            String next = itKeys.next();
                            map.put(next, jSONObjectA.optString(next));
                        }
                    }
                    HashMap mapApical = seminary.apical(formularize.attabal("creativeType", str2), formularize.attabal("customReferenceData", customReferenceData), formularize.attabal("impressionType", Byte.valueOf(impressionType)), formularize.attabal("macros", map), formularize.attabal("isolateVerificationScripts", Boolean.valueOf(isolateVerificationScripts)));
                    if (mapApical == null) {
                        mapApical = null;
                    }
                    if (mapApical == null) {
                        mapApical = new HashMap();
                    }
                    c3332wk.b = mapApical;
                    linkedHashSet.add(c3332wk);
                }
            }
        }
        for (Viewability viewability2 : ad.getViewability()) {
            if (viewability2.getInmobi() != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                int iA = AbstractC3357xk.a(viewability2.getInmobi().getTime());
                if (iA != -1) {
                    linkedHashMap2.put("time", Integer.valueOf(iA));
                }
                int iA2 = AbstractC3357xk.a(viewability2.getInmobi().getView());
                if (iA2 != -1) {
                    linkedHashMap2.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, Integer.valueOf(iA2));
                }
                int iA3 = AbstractC3357xk.a(viewability2.getInmobi().getPixel());
                if (iA3 != -1) {
                    linkedHashMap2.put("pixel", Integer.valueOf(iA3));
                }
                byte type = viewability2.getInmobi().getType();
                linkedHashMap2.put("type", Integer.valueOf(type));
                if (type == 2) {
                    if (viewability2.getInmobi().getFrame().length == 4) {
                        linkedHashMap2.put("frame", viewability2.getInmobi().getFrame());
                    } else {
                        linkedHashMap2.put("frame", new JSONArray("[0,0,0,0]"));
                    }
                }
                C3332wk c3332wk2 = new C3332wk((byte) 2);
                c3332wk2.b = linkedHashMap2;
                linkedHashSet.add(c3332wk2);
                break;
            }
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(i);
        String impressionId = adB != null ? adB.getImpressionId() : null;
        MetaInfo metaInfo4 = ad.getMetaInfo();
        if (metaInfo4 == null || (landingPageParams2 = metaInfo4.getLandingPageParams()) == null || (landingPageParam2 = (LandingPageParam) CollectionsKt.lotta(landingPageParams2, 0)) == null || (openMode = landingPageParam2.getOpenMode()) == null) {
            openMode = "DEFAULT";
        }
        String str7 = openMode;
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        C3056li c3056li = new C3056li(((TelemetryConfig) Y3.a.a(TelemetryConfig.class)).getMaxTemplateEvents());
        MetaInfo metaInfo5 = ad.getMetaInfo();
        if (metaInfo5 == null || (landingPageParams = metaInfo5.getLandingPageParams()) == null || (landingPageParam = (LandingPageParam) CollectionsKt.lotta(landingPageParams, 0)) == null || (inlineParams = landingPageParam.getAParams()) == null) {
            inlineParams = new InlineParams(null, null, null, false, null, null, false, 127, null);
        }
        inlineParams.setTargetBundleId(ad.getBidBundle());
        inlineParams.setCallerBundleId(A1.a);
        inlineParams.setPingInWebView(this.c.getInlineInstaller().getShouldPingInWebView());
        C3287v0 c3287v0 = this.l;
        String strS = s();
        String impressionId2 = ad.getImpressionId();
        String str8 = impressionId2 == null ? "" : impressionId2;
        String telemetryMetadataBlob = ad.getTelemetryMetadataBlob();
        String str9 = telemetryMetadataBlob == null ? "" : telemetryMetadataBlob;
        C2898fa c2898fa = this.v;
        int i2 = c2898fa != null ? c2898fa.b : 0;
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        String str10 = (adO == null || (metaInfo = adO.getMetaInfo()) == null || (creativeType = metaInfo.getCreativeType()) == null) ? "" : creativeType;
        com.inmobi.media.ads.network.common.model.Ad adO2 = o();
        String str11 = (adO2 == null || (creativeId = adO2.getCreativeId()) == null) ? "" : creativeId;
        AdSet adSetR = r();
        return new C3113o0(str4, zA, j, zC, creativeID, str6, str, str3, this, str5, linkedHashMap, Boolean.valueOf(z), watermarkData, adQualityControl, bT, linkedHashSet, impressionId, str7, new C2932gi(c3287v0, strS, str8, str9, i2, str10, str11, adSetR != null ? adSetR.getIsRewarded() : false, i, this.z.j, c3056li, BuildConfig.FLAVOR, inlineParams), this.i);
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void b(GestureDetectorOnGestureListenerC2829ci renderView) {
        MetaInfo metaInfo;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "fireClickTracker " + this);
        }
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.ads.network.common.model.Ad adB = b(this.h.indexOf(renderView));
        if (Intrinsics.wireman((adB == null || (metaInfo = adB.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || adB == null) {
            return;
        }
        for (String url : AbstractC3380yi.a(adB, "click")) {
            C3315w3 c3315w3 = C3315w3.a;
            C3097n9 c3097n10 = this.i;
            Intrinsics.checkNotNullParameter(url, "url");
            C3315w3.a(url, true, c3097n10);
        }
    }

    public final void c(String eventType, Map kv) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(kv, "kv");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "submitTelemetryEvent " + this);
        }
        Wj wj = Wj.a;
        Wj.b(eventType, kv, EnumC2779ak.SDK);
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void c(GestureDetectorOnGestureListenerC2829ci renderView) {
        MetaInfo metaInfo;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "fireImpressionTracker " + this);
        }
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.ads.network.common.model.Ad adB = b(this.h.indexOf(renderView));
        if (Intrinsics.wireman((adB == null || (metaInfo = adB.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || adB == null) {
            return;
        }
        for (String url : AbstractC3380yi.a(adB, "impression")) {
            C2934gk telemetryOnAdImpression = renderView.getTelemetryOnAdImpression();
            telemetryOnAdImpression.getClass();
            Intrinsics.checkNotNullParameter("adResponseTracker", "<set-?>");
            telemetryOnAdImpression.f = "adResponseTracker";
            C3315w3 c3315w3 = C3315w3.a;
            C2759a0 c2759a0 = new C2759a0(this.u, telemetryOnAdImpression);
            C3097n9 c3097n10 = this.i;
            Intrinsics.checkNotNullParameter(url, "url");
            Dg.a(Ag.HIGHEST, new C3116o3(url, c3097n10, c2759a0, null));
        }
    }

    public final boolean a(com.inmobi.media.ads.network.common.model.Ad ad) {
        Short sh;
        Pair pair;
        O0 features;
        boolean enableImmersive = this.c.getRendering().getEnableImmersive();
        boolean z = J5.i;
        boolean zA = (ad == null || (features = ad.getFeatures()) == null) ? false : features.a(false);
        boolean z2 = enableImmersive && z && zA;
        if (!z2) {
            StringBuilder sb = new StringBuilder("Immersive not supported on");
            BitSet bitSet = new BitSet(3);
            ArrayList arrayList = new ArrayList();
            if (!enableImmersive) {
                arrayList.add(" config");
                bitSet.set(0);
            }
            if (!z) {
                arrayList.add(" device");
                bitSet.set(1);
            }
            if (!zA) {
                arrayList.add(" ad");
                bitSet.set(2);
            }
            sb.append(CollectionsKt.preterite(arrayList, ",", null, null, 0, null, null, 62, null));
            Intrinsics.checkNotNullParameter(bitSet, "bitSet");
            if (bitSet.get(0) && bitSet.get(1) && bitSet.get(2)) {
                sh = (short) 2202;
            } else if (bitSet.get(0) && bitSet.get(1)) {
                sh = (short) 2200;
            } else if (bitSet.get(0) && bitSet.get(2)) {
                sh = (short) 2199;
            } else if (bitSet.get(1) && bitSet.get(2)) {
                sh = (short) 2201;
            } else if (bitSet.get(0)) {
                sh = (short) 2196;
            } else if (bitSet.get(1)) {
                sh = (short) 2197;
            } else {
                sh = bitSet.get(2) ? (short) 2198 : null;
            }
            short sShortValue = sh != null ? sh.shortValue() : (short) -1;
            if (sShortValue == -1) {
                pair = new Pair("Invalid Reason", (short) -1);
            } else {
                pair = new Pair(sb.toString(), Short.valueOf(sShortValue));
            }
            String str = (String) pair.component1();
            short sShortValue2 = ((Number) pair.component2()).shortValue();
            HashMap map = new HashMap();
            map.put("reason", str);
            map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(sShortValue2));
            c("ImmersiveNotSupported", map);
        }
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "Immersive support - config, device, adResponse - (" + enableImmersive + " " + z + " " + zA + ")");
        }
        return z2;
    }

    public final void a(AbstractC2915g1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "onAdDisplayed " + this);
        }
        AdMetaInfo adMetaInfoJ = j();
        if (adMetaInfoJ == null) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n10.b("l1", "callback onAdDisplayed failed. ad meta info is null");
            }
            b(listener);
            return;
        }
        C3097n9 c3097n11 = this.i;
        if (c3097n11 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n11.a("l1", "callback - onAdDisplayed");
        }
        listener.a(adMetaInfoJ);
    }

    public final void a(AdResponse adResponse) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "handleAdFetchSuccessful " + this);
        }
        if (!this.k && n() != null) {
            if (this.b == 1) {
                this.m = adResponse;
                AdSet adSetR = r();
                int size = 0;
                this.s = adSetR != null ? adSetR.getIsPod() : false;
                AdSet adSetR2 = r();
                if (adSetR2 != null && (ads2 = adSetR2.getAds()) != null) {
                    size = ads2.size();
                }
                this.h = new ArrayList(size);
                AdSet adSetR3 = r();
                if (adSetR3 != null && (ads = adSetR3.getAds()) != null) {
                    for (com.inmobi.media.ads.network.common.model.Ad ad : ads) {
                        this.h.add(null);
                    }
                }
                F();
                return;
            }
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n10.b("l1", "incorrect state - " + ((int) this.b));
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2118);
            return;
        }
        c((short) 2185);
        C3097n9 c3097n11 = this.i;
        if (c3097n11 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n11.b("l1", "adUnit is destroyed");
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "handleMarkupFetchFailure " + this);
        }
        try {
            if (this.b == 1) {
                C3097n9 c3097n10 = this.i;
                if (c3097n10 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3097n10.b("l1", "Failed to fetch ad for placement id: " + this.l + ", reason - " + inMobiAdRequestStatus.getMessage());
                }
                String str = "MarkupFetch failed reason is: " + inMobiAdRequestStatus.getMessage();
                C3097n9 c3097n11 = this.i;
                if (c3097n11 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3097n11.b("l1", str);
                }
                C3097n9 c3097n12 = this.i;
                if (c3097n12 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3097n12.d("l1", "AdUnit " + this + " state - FAILED");
                }
                c((byte) 3);
                b((byte) 1);
                if (s != 0) {
                    b(s);
                }
                AbstractC2915g1 abstractC2915g1M = m();
                if (abstractC2915g1M != null) {
                    abstractC2915g1M.a(inMobiAdRequestStatus);
                    return;
                }
                C3097n9 c3097n13 = this.i;
                if (c3097n13 != null) {
                    c3097n13.a();
                }
            }
        } catch (Exception e) {
            C3097n9 c3097n14 = this.i;
            if (c3097n14 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n14.a("l1", "onAdFetchFailed with error: ", e);
            }
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e);
        }
    }

    public final void a(short s) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.b("l1", "handleAdShowFailure " + this + " errorCode - " + ((int) s));
        }
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n10.d("l1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 4);
        AbstractC2915g1 abstractC2915g1M = m();
        if (abstractC2915g1M != null) {
            abstractC2915g1M.b();
        }
        if (s != 0) {
            d(s);
        }
    }

    public final void a(InMobiAdRequestStatus requestStatus, boolean z, short s) {
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.b("l1", "handleAdFetchFailure " + this + " errorCode - " + ((int) s));
        }
        if (this.b == 3 && z) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n10.d("l1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC2915g1 abstractC2915g1M = m();
        if (abstractC2915g1M != null) {
            abstractC2915g1M.a(this, requestStatus);
        }
        if (s != 0) {
            b(s);
        }
    }

    public final void a(Map map) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "setPublisherSuppliedExtras " + this + " - " + map);
        }
        this.l.c = map;
    }

    public static final Unit a(AbstractC3039l1 abstractC3039l1) {
        C3188r1 c3188r1 = abstractC3039l1.z;
        c3188r1.getClass();
        c3188r1.e = SystemClock.elapsedRealtime();
        abstractC3039l1.g();
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public static final Unit a(AbstractC3039l1 abstractC3039l1, EnumC2765a6 errorCode) {
        short s;
        Intrinsics.checkNotNullParameter(errorCode, "it");
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int iOrdinal = errorCode.ordinal();
        if (iOrdinal == 0) {
            s = 2100;
        } else if (iOrdinal != 21) {
            switch (iOrdinal) {
                case 12:
                    s = 2101;
                    break;
                case 13:
                    s = 2102;
                    break;
                case 14:
                    s = 2103;
                    break;
                case 15:
                    s = 2104;
                    break;
                case 16:
                    s = 2105;
                    break;
                default:
                    s = 2100;
                    break;
            }
        } else {
            s = 2228;
        }
        abstractC3039l1.a(inMobiAdRequestStatus, true, s);
        return Unit.f29295attabal;
    }

    public final void a(final Function0 onSuccess, final Function1 onMaxRetryReached) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onMaxRetryReached, "onMaxRetryReached");
        C3097n9 c3097n9 = this.i;
        Object ub = null;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            C2898fa c2898fa = this.v;
            c3097n9.c("l1", "loadWithRetry " + (c2898fa != null ? Integer.valueOf(c2898fa.b) : null));
        }
        C2898fa c2898fa2 = this.v;
        if (c2898fa2 != null) {
            EnumC2765a6 enumC2765a6A = Re.a();
            if (enumC2765a6A == null) {
                ub = Hf.a;
            } else {
                int i = c2898fa2.b + 1;
                c2898fa2.b = i;
                if (i >= c2898fa2.a.b) {
                    ub = new Ub(enumC2765a6A);
                } else {
                    ub = C3080mh.a;
                }
            }
        }
        if (ub instanceof Ub) {
            onMaxRetryReached.invoke(((Ub) ub).a);
            return;
        }
        if (ub instanceof Hf) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n10.c("l1", "load with retry success");
            }
            onSuccess.invoke();
            return;
        }
        if (!(ub instanceof C3080mh)) {
            if (ub == null) {
                C3097n9 c3097n11 = this.i;
                if (c3097n11 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3097n11.c("l1", "shouldProceedToLoad result null. starting as if we have internet.");
                }
                onSuccess.invoke();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        C3097n9 c3097n12 = this.i;
        if (c3097n12 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n12.c("l1", "load failed, retrying");
        }
        Handler handler = this.x;
        Runnable runnable = new Runnable() { // from class: adsuki.shinplaster
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3039l1.a(this.f3667kowloon, onSuccess, onMaxRetryReached);
            }
        };
        C3100nc c3100nc = this.w;
        handler.postDelayed(runnable, c3100nc != null ? c3100nc.a : 1000L);
    }

    public static final void a(AbstractC3039l1 abstractC3039l1, Function0 function0, Function1 function1) {
        C3097n9 c3097n9 = abstractC3039l1.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            C2898fa c2898fa = abstractC3039l1.v;
            c3097n9.c("l1", "Loading from retry Handler " + (c2898fa != null ? Integer.valueOf(c2898fa.b) : null));
        }
        abstractC3039l1.a(function0, function1);
    }

    public void a(byte[] bArr) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "load response " + this);
        }
        C3188r1 c3188r1 = this.z;
        c3188r1.getClass();
        c3188r1.c = SystemClock.elapsedRealtime();
        if (B()) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n10.a("l1", "isBlockingStateForLoadWithResponse - blocking");
                return;
            }
            return;
        }
        if (bArr != null && bArr.length != 0) {
            c((byte) 1);
            C3097n9 c3097n11 = this.i;
            if (c3097n11 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n11.d("l1", "AdUnit " + this + " state - LOADING");
            }
            this.g.a(this.a, new C2989j1(bArr, this, null));
            return;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (short) 2143);
        C3097n9 c3097n12 = this.i;
        if (c3097n12 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n12.a("l1", "null response. failing");
        }
    }

    public static final void a(AbstractC3039l1 abstractC3039l1, Y y) {
        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        Objects.toString(y);
        V v = y.b;
        if (v instanceof Pi) {
            abstractC3039l1.getClass();
            Map mapKowloon = seminary.kowloon(formularize.attabal("latency", Long.valueOf(SystemClock.elapsedRealtime() - abstractC3039l1.z.d)), formularize.attabal("networkType", C3342x5.m()), formularize.attabal("plId", Long.valueOf(abstractC3039l1.l.a)));
            String str = abstractC3039l1.l.f;
            if (str != null) {
                mapKowloon.put("plType", str);
            }
            String str2 = abstractC3039l1.l.e;
            if (str2 != null) {
                mapKowloon.put("adType", str2);
            }
            abstractC3039l1.b("ServerNoFill", mapKowloon);
            abstractC3039l1.b(y.a, (short) 0);
            return;
        }
        if (v instanceof J6) {
            abstractC3039l1.b(y.a, ((J6) v).a);
            return;
        }
        if (v instanceof K6) {
            abstractC3039l1.b(seminary.kowloon(formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(((K6) v).a))));
            abstractC3039l1.b(y.a, (short) 2205);
        } else {
            if (v instanceof Ni) {
                abstractC3039l1.b(((Ni) v).a);
                abstractC3039l1.b(y.a, (short) 0);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final void a(AbstractC3039l1 abstractC3039l1, GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        abstractC3039l1.a(gestureDetectorOnGestureListenerC2829ci, (short) 2137);
    }

    public void a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, short s) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.b("l1", "Render view signaled ad failed, for index " + this.h.indexOf(gestureDetectorOnGestureListenerC2829ci) + " " + this);
        }
        if (gestureDetectorOnGestureListenerC2829ci == null || !Intrinsics.wireman(gestureDetectorOnGestureListenerC2829ci.getMarkupType(), "htmlUrl")) {
            return;
        }
        l(gestureDetectorOnGestureListenerC2829ci);
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void a(HashMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "onAdInteraction " + this);
        }
        if (this.k || n() == null) {
            return;
        }
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n10.a("l1", "Ad interaction. Params: " + params);
        }
        AbstractC2915g1 abstractC2915g1M = m();
        if (abstractC2915g1M != null) {
            abstractC2915g1M.a(params);
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void a(final C2934gk telemetryOnAdImpression) {
        C2959hk c2959hk;
        AtomicBoolean atomicBoolean;
        Intrinsics.checkNotNullParameter(telemetryOnAdImpression, "telemetryOnAdImpression");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "onImpressionFiredFromTemplate " + this);
        }
        telemetryOnAdImpression.getClass();
        Intrinsics.checkNotNullParameter("imraid_impressionFired", "<set-?>");
        telemetryOnAdImpression.f = "imraid_impressionFired";
        if (!this.k && n() != null) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n10.a("l1", "onImpressionFiredFromTemplate");
            }
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: adsuki.motel
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC3039l1.a(this.f3548kowloon, telemetryOnAdImpression);
                    }
                });
                return;
            }
            return;
        }
        C3188r1 c3188r1 = telemetryOnAdImpression.a;
        if (c3188r1 == null || (c2959hk = c3188r1.b) == null || (atomicBoolean = c2959hk.a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = telemetryOnAdImpression.a();
            linkedHashMapA.put("networkType", C3342x5.m());
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2180);
            String str = telemetryOnAdImpression.d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj = Wj.a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC2779ak.SDK);
        }
    }

    public static final void a(AbstractC3039l1 abstractC3039l1, C2934gk c2934gk) {
        abstractC3039l1.u.a(c2934gk);
    }

    @Override // com.inmobi.media.AbstractC2880ei, com.inmobi.media.InterfaceC2780al
    public final void a() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "onUserLeaveApplication " + this);
        }
        if (this.k || n() == null) {
            return;
        }
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n10.a("l1", "User left application");
        }
        AbstractC2915g1 abstractC2915g1M = m();
        if (abstractC2915g1M != null) {
            abstractC2915g1M.e();
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad, Map map) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "updateIdsInTelemetryPayload " + this);
        }
        if (ad != null) {
            map.put("creativeId", ad.getCreativeId());
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void a(String eventType, HashMap kv) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(kv, "kv");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "onRenderViewRequestedAction " + this);
        }
        c(eventType, kv);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(String str, Map map) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "addRetryCountToTelemetryEvent event - " + str);
        }
        switch (str.hashCode()) {
            case -1959333523:
                if (!str.equals("RenderSuccess")) {
                    return;
                }
                break;
            case 167123846:
                if (!str.equals("ServerFill")) {
                    return;
                }
                break;
            case 885222501:
                if (!str.equals("ServerError")) {
                    return;
                }
                break;
            case 925075267:
                if (!str.equals("AdLoadSuccessful")) {
                    return;
                }
                break;
            case 1881615718:
                if (!str.equals("AdLoadFailed")) {
                    return;
                }
                break;
            case 1925668903:
                if (!str.equals("ServerNoFill")) {
                    return;
                }
                break;
            default:
                return;
        }
        C2898fa c2898fa = this.v;
        if (c2898fa != null) {
            map.put("retryCount", Integer.valueOf(c2898fa.b));
        }
    }

    public final void a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, LinkedHashSet linkedHashSet) {
        AdConfig.ViewabilityConfig viewability;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "omidSessionForHtmlMarkup " + this);
        }
        AdConfig adConfig = this.c;
        AdConfig.OmidConfig omidConfig = (adConfig == null || (viewability = adConfig.getViewability()) == null) ? null : viewability.getOmidConfig();
        if (omidConfig == null || omidConfig.isOmidEnabled()) {
            Bf.a.getClass();
            if (Omid.isActive()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    C3332wk c3332wk = (C3332wk) it.next();
                    if (3 == c3332wk.a) {
                        try {
                            Intrinsics.checkNotNullParameter("creativeType", com.ironsource.X3.i.W);
                            Intrinsics.checkNotNullParameter(String.class, "classType");
                            Object obj = c3332wk.b.get("creativeType");
                            String str = (String) (String.class.isInstance(obj) ? String.class.cast(obj) : null);
                            Intrinsics.checkNotNullParameter("customReferenceData", com.ironsource.X3.i.W);
                            Intrinsics.checkNotNullParameter(String.class, "classType");
                            Object obj2 = c3332wk.b.get("customReferenceData");
                            String str2 = (String) (String.class.isInstance(obj2) ? String.class.cast(obj2) : null);
                            Intrinsics.checkNotNullParameter("isolateVerificationScripts", com.ironsource.X3.i.W);
                            Intrinsics.checkNotNullParameter(Boolean.class, "classType");
                            Object obj3 = c3332wk.b.get("isolateVerificationScripts");
                            Boolean bool = (Boolean) (Boolean.class.isInstance(obj3) ? Boolean.class.cast(obj3) : null);
                            Intrinsics.checkNotNullParameter("impressionType", com.ironsource.X3.i.W);
                            Intrinsics.checkNotNullParameter(Byte.class, "classType");
                            Object obj4 = c3332wk.b.get("impressionType");
                            Byte b = (Byte) (Byte.class.isInstance(obj4) ? Byte.class.cast(obj4) : null);
                            C3003jf c3003jfA = (str == null || bool == null || b == null) ? null : AbstractC3277uf.a(str, gestureDetectorOnGestureListenerC2829ci, bool.booleanValue(), this.l.k, b.byteValue(), str2);
                            if (c3003jfA != null) {
                                c3332wk.b.put("omidAdSession", c3003jfA);
                                c3332wk.b.put("deferred", Boolean.TRUE);
                                C3097n9 c3097n10 = this.i;
                                if (c3097n10 != null) {
                                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                                    c3097n10.a("l1", "OMID ad session created and WebView container registered with OMID");
                                }
                            } else {
                                C3097n9 c3097n11 = this.i;
                                if (c3097n11 != null) {
                                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                                    c3097n11.a("l1", "Ignoring IAB meta data for this ad markup");
                                }
                            }
                        } catch (Exception e) {
                            C3097n9 c3097n12 = this.i;
                            if (c3097n12 != null) {
                                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                                c3097n12.b("l1", "Setting up impression tracking for IAB encountered an unexpected error: " + e.getMessage());
                            }
                            taiyuan taiyuanVar = P9.a;
                            AbstractC2973i9.a(e);
                        }
                    }
                }
            }
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad, String str) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "updateAdForBlob " + this);
        }
        ad.setWebVast(str);
        b(ad);
    }

    public final void a(String blob, String str) {
        Intrinsics.checkNotNullParameter(blob, "blob");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "saveBlob " + this);
        }
        this.g.a(this.a, new C3014k1(this, str, blob, null));
    }

    public final void a(String jsCallbackNamespace, String callback, F2 receiver, String str) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "getBlob " + this);
        }
        this.g.a(this.a, new C2965i1(this, str, receiver, jsCallbackNamespace, callback, null));
    }

    public void a(int i, GestureDetectorOnGestureListenerC2829ci renderView, Context context) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "Show pod ad with index : " + i + " from creative: " + this.h.indexOf(renderView) + " " + this);
        }
        if (i >= 0) {
            this.p = i;
        } else {
            this.p++;
        }
    }

    public void a(GestureDetectorOnGestureListenerC2829ci renderView, Activity activity) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.c("l1", "closeCurrentPodAd " + this);
        }
    }

    public boolean a(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 == null) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        c3097n9.c("l1", "hasNextAdInAdPod " + this);
        return false;
    }

    public void a(byte b) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "onTimeOut " + this);
        }
        if (b == 0) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n10.a("l1", "AdRequestTimeOut by timer, Adstate=" + ((int) this.b));
            }
            if (this.b != 3) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2109);
                return;
            }
            return;
        }
        if (b != 2 && b != 1) {
            if (b == 4) {
                C3097n9 c3097n11 = this.i;
                if (c3097n11 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3097n11.a("l1", "Show RequestTimeOut by show timer");
                }
                AbstractC2915g1 abstractC2915g1M = m();
                if (abstractC2915g1M != null) {
                    abstractC2915g1M.d();
                    return;
                }
                return;
            }
            C3097n9 c3097n12 = this.i;
            if (c3097n12 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n12.a("l1", "Unknown TimeOut ignored");
                return;
            }
            return;
        }
        C3097n9 c3097n13 = this.i;
        if (c3097n13 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n13.a("l1", "Internal LoadTimeOut by timer, Adstate=" + ((int) this.b));
        }
        if (this.b != 3) {
            this.x.removeCallbacksAndMessages(null);
            C3097n9 c3097n14 = this.i;
            if (c3097n14 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3097n14.a("l1", "adUnitEventListener=" + m() + ", Adstate=" + ((int) this.b));
            }
            byte b2 = this.b;
            if (2 == b2) {
                J();
                c(Re.a() == null ? (short) 2139 : (short) 2203);
                AbstractC2915g1 abstractC2915g1M2 = m();
                if (abstractC2915g1M2 != null) {
                    abstractC2915g1M2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            if (1 == b2) {
                J();
                c((short) 2138);
                AbstractC2915g1 abstractC2915g1M3 = m();
                if (abstractC2915g1M3 != null) {
                    abstractC2915g1M3.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
                }
            }
        }
    }

    public final void a(int i, boolean z) throws JSONException {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "Destroying container for index " + i + " " + this);
        }
        ArrayList list = this.h;
        Intrinsics.checkNotNullParameter(list, "list");
        if (i < 0 || i >= list.size()) {
            return;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) this.h.get(i);
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            gestureDetectorOnGestureListenerC2829ci.I0.set(z);
            gestureDetectorOnGestureListenerC2829ci.stopLoading();
            gestureDetectorOnGestureListenerC2829ci.b();
        }
        this.h.set(i, null);
    }

    public final void a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, Integer num, int i) {
        int iIntValue;
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            iIntValue = this.h.indexOf(gestureDetectorOnGestureListenerC2829ci);
        } else if (num == null) {
            return;
        } else {
            iIntValue = num.intValue();
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(iIntValue);
        if (adB != null) {
            Iterator it = AbstractC3380yi.a(adB, "pod_abort").iterator();
            while (it.hasNext()) {
                String url = dovishness.polder(dovishness.polder((String) it.next(), "$PODINDEX", String.valueOf(iIntValue), false, 4, null), "$REASON", String.valueOf(i), false, 4, null);
                C3315w3 c3315w3 = C3315w3.a;
                C3097n9 c3097n9 = this.i;
                Intrinsics.checkNotNullParameter(url, "url");
                C3315w3.a(url, true, c3097n9);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void a(GestureDetectorOnGestureListenerC2829ci renderView, String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n9.a("l1", "fireLandingPageTracker " + trackerName + " " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(this.h.indexOf(renderView));
        if (adB != null) {
            for (String str : AbstractC3380yi.a(adB, trackerName)) {
                String url = str;
                for (Map.Entry entry : macros.entrySet()) {
                    url = dovishness.polder(url, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
                }
                C3315w3 c3315w3 = C3315w3.a;
                C3097n9 c3097n10 = this.i;
                Intrinsics.checkNotNullParameter(url, "url");
                C3315w3.a(url, true, c3097n10);
            }
            return;
        }
        C3097n9 c3097n11 = this.i;
        if (c3097n11 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3097n11.a("l1", "fireLandingPageTracker failed");
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void a(String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        AbstractC2915g1 abstractC2915g1M = m();
        if (abstractC2915g1M != null) {
            abstractC2915g1M.a(log);
        }
    }

    @Override // com.inmobi.media.ro
    public final String a(int i, double d) {
        return ((ro) this.D.getValue()).a(i, d);
    }

    @Override // com.inmobi.media.ro
    public final String a(double d) {
        return ((ro) this.D.getValue()).a(d);
    }
}
