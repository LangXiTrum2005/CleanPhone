package com.chartboost.sdk.impl;

import A.F;
import android.view.ViewGroup;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.internal.Model.CBError;
import com.startapp.sdk.internal.C;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements m0, d0, z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f13662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f13663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f13664c;
    public final ScheduledExecutorService d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f13665e;
    public final uf f;
    public final b2 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function0 f13666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z6 f13667i;
    public Ad j;
    public AdCallback k;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13668a;

        static {
            int[] iArr = new int[CBError.Impression.values().length];
            try {
                iArr[CBError.Impression.ASSET_MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CBError.Impression.ASSETS_DOWNLOAD_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CBError.Impression.ASSET_PREFETCH_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CBError.Impression.WEB_VIEW_CLIENT_RECEIVED_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CBError.Impression.WEB_VIEW_PAGE_LOAD_TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CBError.Impression.ERROR_LOADING_WEB_VIEW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f13668a = iArr;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function2 {
        public b(Object obj) {
            super(2, obj, d.class, "onAdFailToLoad", "onAdFailToLoad(Ljava/lang/String;Lcom/chartboost/sdk/internal/Model/CBError$Type;)V", 0);
        }

        public final void a(String str, CBError.Type p1) {
            Intrinsics.f(p1, "p1");
            ((d) this.receiver).a(str, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (CBError.Type) obj2);
            return Unit.f43263a;
        }
    }

    public d(c0 adUnitLoader, k0 adUnitRenderer, AtomicReference sdkConfig, ScheduledExecutorService backgroundExecutorService, e adApiCallbackSender, uf session, b2 base64Wrapper, z6 eventTracker, Function0 androidVersion) {
        Intrinsics.f(adUnitLoader, "adUnitLoader");
        Intrinsics.f(adUnitRenderer, "adUnitRenderer");
        Intrinsics.f(sdkConfig, "sdkConfig");
        Intrinsics.f(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.f(adApiCallbackSender, "adApiCallbackSender");
        Intrinsics.f(session, "session");
        Intrinsics.f(base64Wrapper, "base64Wrapper");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(androidVersion, "androidVersion");
        this.f13662a = adUnitLoader;
        this.f13663b = adUnitRenderer;
        this.f13664c = sdkConfig;
        this.d = backgroundExecutorService;
        this.f13665e = adApiCallbackSender;
        this.f = session;
        this.g = base64Wrapper;
        this.f13666h = androidVersion;
        this.f13667i = eventTracker;
    }

    public final void a(String location, Ad ad, AdCallback callback, String str) {
        Intrinsics.f(location, "location");
        Intrinsics.f(ad, "ad");
        Intrinsics.f(callback, "callback");
        this.j = ad;
        this.k = callback;
        Object objA = h.f14033a.a(str, this.g, new b(this));
        if (Result.a(objA) == null) {
            this.d.execute(new F(ad, this, location, (String) objA, 25));
        }
    }

    public final boolean b() {
        l1 l1VarA = this.f13662a.a();
        return (l1VarA != null ? l1VarA.a() : null) != null;
    }

    @Override // com.chartboost.sdk.impl.m0
    public void c(String str) {
        a(fh.f.IMPRESSION_RECORDED, "", str);
        this.f13665e.b(str, this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f13667i.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f13667i.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.impl.m0
    public void d(String str) {
        this.f13665e.c(str, this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.m0
    public void e(String str) {
        a(fh.i.FINISH_SUCCESS, "", str);
        c();
        this.f13665e.a(str, (ShowError) null, this.j, this.k);
    }

    public final ug f(String str) {
        if (str == null) {
            str = "";
        }
        return new ug(null, null, str, null, null, null, null, null, 251, null);
    }

    public final boolean g(String location) {
        Intrinsics.f(location, "location");
        if (((Number) this.f13666h.invoke()).intValue() < 21) {
            return true;
        }
        qf qfVar = (qf) this.f13664c.get();
        if (qfVar == null || !qfVar.e()) {
            return location.length() == 0;
        }
        za.b("Chartboost Integration Warning: your account has been disabled for this session. This app has no active publishing campaigns, please create a publishing campaign in the Chartboost dashboard and wait at least 30 minutes to re-enable. If you need assistance, please visit http://chartboo.st/publishing .", (Throwable) null, 2, (Object) null);
        return true;
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f13667i.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f13667i.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f13667i.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f13667i.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.m0
    public void b(String str) {
        this.f13665e.a(str, (ClickError) null, this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f13667i.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f13667i.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f13667i.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f13667i.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f13667i.mo189track(event);
    }

    public final void c() {
        y yVarA;
        Ad ad = this.j;
        if (ad == null || (yVarA = a(ad)) == null) {
            return;
        }
        this.f.a(yVarA);
        za.c(android.support.v4.media.a.g(this.f.b(yVarA), this.f.b(), "Current session impression count: ", " in session: "), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Ad ad, d this$0, String location, String str) {
        Intrinsics.f(ad, "$ad");
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(location, "$location");
        if (ad instanceof Banner) {
            ViewGroup viewGroup = (ViewGroup) ad;
            Banner banner = (Banner) ad;
            this$0.f13662a.a(location, this$0, str, new a0(viewGroup, banner.getBannerWidth(), banner.getBannerHeight()));
            return;
        }
        c0.a(this$0.f13662a, location, this$0, str, null, 8, null);
    }

    public final void a() {
        if (b()) {
            this.f13662a.b();
        }
    }

    @Override // com.chartboost.sdk.impl.d0
    public void a(String str, CBError.Type error) {
        Intrinsics.f(error, "error");
        a(fh.a.FINISH_FAILURE, error.getName(), str);
        this.f13665e.a(str, q.a(error), this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.d0
    public void a(String str, fh trackingEventName) {
        Intrinsics.f(trackingEventName, "trackingEventName");
        a(trackingEventName, "", str);
        this.f13665e.a(str, (CacheError) null, this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.m0
    public void a(String str, String str2, CBError.Click error) {
        Intrinsics.f(error, "error");
        String strO = android.support.v4.media.a.o("Click error: ", error.name(), " url: ", str2);
        a(fh.b.INVALID_URL_ERROR, strO, str);
        this.f13665e.a(str, q.a(error, strO), this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.m0
    public void a(String str) {
        this.f13665e.a(str, this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.m0
    public void a(String str, int i2) {
        this.f13665e.a(str, this.j, this.k, i2);
    }

    @Override // com.chartboost.sdk.impl.m0
    public void a(String str, CBError.Impression error) {
        Intrinsics.f(error, "error");
        a(error, str);
        this.f13665e.a(str, q.a(error), this.j, this.k);
    }

    public final void a(Ad ad, AdCallback callback) {
        Intrinsics.f(ad, "ad");
        Intrinsics.f(callback, "callback");
        this.j = ad;
        this.k = callback;
        this.d.execute(new C(this, 18));
    }

    public static final void a(d this$0) {
        Unit unit;
        Intrinsics.f(this$0, "this$0");
        l1 l1VarA = this$0.f13662a.a();
        if (l1VarA != null) {
            this$0.f13663b.a(l1VarA, this$0);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.b("Missing app request on render", (Throwable) null, 2, (Object) null);
        }
    }

    public final y a(Ad ad) {
        if (ad instanceof Interstitial) {
            return y.b.g;
        }
        if (ad instanceof Rewarded) {
            return y.c.g;
        }
        if (ad instanceof Banner) {
            return y.a.g;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a(fh fhVar, String str, String str2) {
        String strB;
        String location;
        ch daVar;
        y yVarA;
        Ad ad = this.j;
        if (ad == null || (yVarA = a(ad)) == null || (strB = yVarA.b()) == null) {
            strB = "Unknown";
        }
        String str3 = strB;
        Ad ad2 = this.j;
        if (ad2 == null || (location = ad2.getLocation()) == null) {
            location = "";
        }
        String str4 = location;
        if (fhVar == fh.b.INVALID_URL_ERROR) {
            daVar = new h5(fhVar, str, str3, str4, this.f13663b.F(), f(str2));
        } else {
            daVar = new da(fhVar, str, str3, str4, this.f13663b.F(), f(str2));
        }
        track(daVar);
    }

    public final void a(fh eventName, String message, y adType, String location) {
        Intrinsics.f(eventName, "eventName");
        Intrinsics.f(message, "message");
        Intrinsics.f(adType, "adType");
        Intrinsics.f(location, "location");
        track((ch) new da(eventName, message, adType.b(), location, this.f13663b.F(), null, 32, null));
    }

    public final void a(CBError.Impression impression, String str) {
        fh.i iVar;
        switch (a.f13668a[impression.ordinal()]) {
            case 1:
            case 2:
            case 3:
                iVar = fh.i.UNAVAILABLE_ASSET_ERROR;
                break;
            case 4:
            case 5:
            case 6:
                iVar = fh.i.WEBVIEW_ERROR;
                break;
            default:
                iVar = fh.i.FINISH_FAILURE;
                break;
        }
        a(iVar, impression.name(), str);
    }
}
