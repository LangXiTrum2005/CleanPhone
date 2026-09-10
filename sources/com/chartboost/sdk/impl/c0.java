package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.internal.Model.CBError;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements e0, s1, z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f13551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a8 f13552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f13553c;
    public final dj d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1 f13554e;
    public final s f;
    public final sd g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Mediation f13555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z6 f13556i;
    public l1 j;
    public d0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a0 f13557l;
    public final AtomicBoolean m;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13558a;

        static {
            int[] iArr = new int[t1.values().length];
            try {
                iArr[t1.FAILURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t1.READY_TO_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t1.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13558a = iArr;
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l1 f13560c;

        public static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f13561b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l1 f13562c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c0 c0Var, l1 l1Var) {
                super(1);
                this.f13561b = c0Var;
                this.f13562c = l1Var;
            }

            public final void a(xa fold) {
                Intrinsics.f(fold, "$this$fold");
                this.f13561b.b(fold, this.f13562c);
                this.f13561b.b(this.f13562c);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((xa) obj);
                return Unit.f43263a;
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.c0$b$b, reason: collision with other inner class name */
        public static final class C0164b extends Lambda implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f13563b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l1 f13564c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0164b(c0 c0Var, l1 l1Var) {
                super(2);
                this.f13563b = c0Var;
                this.f13564c = l1Var;
            }

            public final void a(xa fold, CBError error) {
                Intrinsics.f(fold, "$this$fold");
                Intrinsics.f(error, "error");
                this.f13563b.a(error, this.f13564c.d());
                this.f13563b.a(fold, this.f13564c);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((xa) obj, (CBError) obj2);
                return Unit.f43263a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l1 l1Var) {
            super(1);
            this.f13560c = l1Var;
        }

        public final void a(xa loadAd) {
            Intrinsics.f(loadAd, "$this$loadAd");
            u.a(loadAd, new a(c0.this, this.f13560c), new C0164b(c0.this, this.f13560c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((xa) obj);
            return Unit.f43263a;
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l1 f13565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c0 f13566c;

        public static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l1 f13567b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c0 f13568c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l1 l1Var, c0 c0Var) {
                super(1);
                this.f13567b = l1Var;
                this.f13568c = c0Var;
            }

            public final void a(xa fold) {
                Intrinsics.f(fold, "$this$fold");
                this.f13567b.a(fold.a());
                this.f13568c.e(this.f13567b);
                this.f13568c.b(fold, this.f13567b);
                this.f13568c.a(this.f13567b, fh.a.FINISH_SUCCESS);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((xa) obj);
                return Unit.f43263a;
            }
        }

        public static final class b extends Lambda implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f13569b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l1 f13570c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c0 c0Var, l1 l1Var) {
                super(2);
                this.f13569b = c0Var;
                this.f13570c = l1Var;
            }

            public final void a(xa fold, CBError it) {
                Intrinsics.f(fold, "$this$fold");
                Intrinsics.f(it, "it");
                this.f13569b.a(fold, this.f13570c);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((xa) obj, (CBError) obj2);
                return Unit.f43263a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l1 l1Var, c0 c0Var) {
            super(1);
            this.f13565b = l1Var;
            this.f13566c = c0Var;
        }

        public final void a(xa loadAd) {
            Intrinsics.f(loadAd, "$this$loadAd");
            u.a(loadAd, new a(this.f13565b, this.f13566c), new b(this.f13566c, this.f13565b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((xa) obj);
            return Unit.f43263a;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function2 {
        public d(Object obj) {
            super(2, obj, c0.class, "loadOpenRTBAd", "loadOpenRTBAd(Lcom/chartboost/sdk/internal/AdUnitManager/data/AppRequest;Lcom/chartboost/sdk/internal/AdUnitManager/loaders/LoadParams;)V", 0);
        }

        public final void a(l1 p0, wa p1) {
            Intrinsics.f(p0, "p0");
            Intrinsics.f(p1, "p1");
            ((c0) this.receiver).b(p0, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((l1) obj, (wa) obj2);
            return Unit.f43263a;
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function2 {
        public e(Object obj) {
            super(2, obj, c0.class, "loadAdGet", "loadAdGet(Lcom/chartboost/sdk/internal/AdUnitManager/data/AppRequest;Lcom/chartboost/sdk/internal/AdUnitManager/loaders/LoadParams;)V", 0);
        }

        public final void a(l1 p0, wa p1) {
            Intrinsics.f(p0, "p0");
            Intrinsics.f(p1, "p1");
            ((c0) this.receiver).a(p0, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((l1) obj, (wa) obj2);
            return Unit.f43263a;
        }
    }

    public c0(y adType, a8 fileCache, a3 reachability, dj videoRepository, w1 assetsDownloader, s adLoader, sd ortbLoader, Mediation mediation, z6 eventTracker) {
        Intrinsics.f(adType, "adType");
        Intrinsics.f(fileCache, "fileCache");
        Intrinsics.f(reachability, "reachability");
        Intrinsics.f(videoRepository, "videoRepository");
        Intrinsics.f(assetsDownloader, "assetsDownloader");
        Intrinsics.f(adLoader, "adLoader");
        Intrinsics.f(ortbLoader, "ortbLoader");
        Intrinsics.f(eventTracker, "eventTracker");
        this.f13551a = adType;
        this.f13552b = fileCache;
        this.f13553c = reachability;
        this.d = videoRepository;
        this.f13554e = assetsDownloader;
        this.f = adLoader;
        this.g = ortbLoader;
        this.f13555h = mediation;
        this.f13556i = eventTracker;
        this.m = new AtomicBoolean(false);
    }

    public final String c(l1 l1Var) {
        z zVarA = l1Var.a();
        if (zVarA != null) {
            return zVarA.m();
        }
        return null;
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f13556i.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f13556i.clearFromStorage(chVar);
    }

    public final void d(l1 l1Var) {
        b(l1Var, CBError.Impression.ASSETS_DOWNLOAD_FAILURE);
        f(l1Var);
    }

    public final void e(l1 l1Var) {
        String strC;
        String strB;
        z zVarA = l1Var.a();
        if (zVarA == null || !zVarA.D()) {
            return;
        }
        dj djVar = this.d;
        z zVarA2 = l1Var.a();
        String str = "";
        if (zVarA2 == null || (strC = zVarA2.C()) == null) {
            strC = "";
        }
        z zVarA3 = l1Var.a();
        if (zVarA3 != null && (strB = zVarA3.B()) != null) {
            str = strB;
        }
        djVar.a(strC, str, false, null);
    }

    public final void f(l1 l1Var) {
        a(l1Var);
        l1Var.a((z) null);
        this.m.set(false);
    }

    public final void g(l1 l1Var) {
        a0 a0Var = this.f13557l;
        Integer numValueOf = a0Var != null ? Integer.valueOf(a0Var.a()) : null;
        a0 a0Var2 = this.f13557l;
        Pair pairA = g0.f13971a.a(l1Var, new wa(l1Var, true, numValueOf, a0Var2 != null ? Integer.valueOf(a0Var2.c()) : null), new d(this), new e(this));
        ((Function2) pairA.X).invoke(l1Var, (wa) pairA.f43249Y);
    }

    public final void h(l1 l1Var) {
        try {
            g(l1Var);
        } catch (Exception e2) {
            za.b("sendAdGetRequest", e2);
            a(l1Var, new CBError(CBError.Internal.MISCELLANEOUS, "error sending ad-get request"));
        }
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f13556i.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f13556i.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f13556i.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f13556i.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f13556i.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f13556i.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f13556i.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f13556i.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f13556i.mo189track(event);
    }

    public final void b(l1 l1Var) {
        this.f13554e.a(l1Var, this.f13551a.b(), this, this);
    }

    public final void a(l1 l1Var) {
        String strR;
        z6 z6Var = this.f13556i;
        z zVarA = l1Var.a();
        if (zVarA == null || (strR = zVarA.r()) == null) {
            strR = "";
        }
        z6Var.clear(strR, l1Var.d());
    }

    public final void b(l1 l1Var, wa waVar) {
        this.g.a(waVar, new c(l1Var, this));
    }

    public final void b() {
        if (this.m.get()) {
            return;
        }
        l1 l1Var = this.j;
        if (l1Var != null) {
            a(l1Var);
            l1Var.a((z) null);
        }
        this.j = null;
    }

    public final void a(xa xaVar, l1 l1Var) {
        a(l1Var.d(), (z) null);
        a(l1Var, xaVar.b());
    }

    public final l1 a() {
        return this.j;
    }

    public final CBError.Impression a(CBError cBError) {
        return (cBError != null ? cBError.getImpressionError() : null) != null ? cBError.getImpressionError() : CBError.Impression.INTERNAL;
    }

    public final void b(l1 l1Var, CBError.Impression impression) {
        this.m.set(false);
        a(l1Var, impression);
        if (impression == CBError.Impression.NO_AD_FOUND) {
            return;
        }
        String strB = this.f13551a.b();
        z zVarA = l1Var.a();
        String strA = zVarA != null ? zVarA.a() : null;
        String strD = l1Var.d();
        StringBuilder sb = new StringBuilder("reportError: adTypeTraits: ");
        sb.append(strB);
        sb.append(" reason: cache  format: web error: ");
        sb.append(impression);
        sb.append(" adId: ");
        za.b(android.support.v4.media.a.s(sb, strA, " appRequest.location: ", strD), (Throwable) null, 2, (Object) null);
    }

    public final void a(String location, d0 callback, String str, a0 a0Var) {
        z zVarA;
        Intrinsics.f(location, "location");
        Intrinsics.f(callback, "callback");
        if (this.m.getAndSet(true)) {
            a(fh.a.IGNORED, location);
            return;
        }
        l1 l1Var = this.j;
        if (l1Var != null && (zVarA = l1Var.a()) != null && !this.f13552b.a(zVarA).booleanValue()) {
            a(l1Var);
            this.j = null;
        }
        l1 l1Var2 = this.j;
        if (l1Var2 != null) {
            l1Var2.a(str);
        }
        l1 l1Var3 = this.j;
        if (l1Var3 == null) {
            l1 l1Var4 = new l1((int) System.currentTimeMillis(), location, str, null, null, false, false, 120, null);
            this.k = callback;
            this.f13557l = a0Var;
            l1Var4.a(a0Var);
            this.j = l1Var4;
            l1Var3 = l1Var4;
        }
        if (!this.f13553c.e()) {
            b(l1Var3, CBError.Impression.INTERNET_UNAVAILABLE_AT_CACHE);
            return;
        }
        l1Var3.a(true);
        if (l1Var3.a() == null) {
            a(fh.a.START, l1Var3.d());
            h(l1Var3);
        } else {
            a(l1Var3, fh.a.IGNORED);
        }
    }

    public final void b(xa xaVar, l1 l1Var) {
        a(l1Var.d(), xaVar.a());
        l1Var.a(xaVar.a());
    }

    public static /* synthetic */ void a(c0 c0Var, String str, d0 d0Var, String str2, a0 a0Var, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            a0Var = null;
        }
        c0Var.a(str, d0Var, str2, a0Var);
    }

    public final void a(l1 l1Var, wa waVar) {
        this.f.a(waVar, new b(l1Var));
    }

    public final void a(l1 l1Var, CBError cBError) {
        b(l1Var, a(cBError));
        f(l1Var);
    }

    @Override // com.chartboost.sdk.impl.e0
    public void a(l1 appRequest, fh trackingEventName) {
        Intrinsics.f(appRequest, "appRequest");
        Intrinsics.f(trackingEventName, "trackingEventName");
        d0 d0Var = this.k;
        if (d0Var != null) {
            d0Var.a(c(appRequest), trackingEventName);
        }
        this.m.set(false);
    }

    @Override // com.chartboost.sdk.impl.s1
    public void a(l1 request, t1 resultAsset) {
        Intrinsics.f(request, "request");
        Intrinsics.f(resultAsset, "resultAsset");
        int i2 = a.f13558a[resultAsset.ordinal()];
        if (i2 == 1) {
            d(request);
        } else if (i2 == 2) {
            za.a("onAssetDownloaded: Ready to show", (Throwable) null, 2, (Object) null);
        } else {
            if (i2 != 3) {
                return;
            }
            za.a("onAssetDownloaded: Success", (Throwable) null, 2, (Object) null);
        }
    }

    public final void a(l1 l1Var, CBError.Impression impression) {
        d0 d0Var = this.k;
        if (d0Var != null) {
            d0Var.a(c(l1Var), impression);
        }
    }

    public final void a(String str, z zVar) {
        String strM;
        String strI;
        String strP;
        String strB;
        String strY;
        if (str == null) {
            str = "no location";
        }
        String str2 = str;
        String strB2 = this.f13551a.b();
        if (zVar == null || (strM = zVar.m()) == null) {
            strM = "";
        }
        if (zVar == null || (strI = zVar.i()) == null) {
            strI = "";
        }
        if (zVar == null || (strP = zVar.p()) == null) {
            strP = "";
        }
        if (zVar == null || (strB = zVar.b()) == null) {
            strB = "";
        }
        store(new ug(str2, strB2, strM, strI, strP, strB, (zVar == null || (strY = zVar.y()) == null) ? "" : strY, b0.a(this.f13557l)));
    }

    public final void a(CBError cBError, String str) {
        CBError.Type type = cBError.getType();
        if (type == CBError.Internal.HTTP_NOT_FOUND || type == CBError.Internal.HTTP_NOT_OK) {
            a(cBError, fh.a.SERVER_ERROR, str);
        } else if (type == CBError.Internal.UNSUPPORTED_OS_VERSION) {
            a(cBError, fh.f.UNSUPPORTED_OS_VERSION, str);
        } else {
            a(cBError, fh.a.REQUEST_ERROR, str);
        }
    }

    public final void a(CBError cBError, fh fhVar, String str) {
        String message = cBError.getMessage();
        if (message == null) {
            message = "";
        }
        track((ch) new u6(fhVar, message, this.f13551a.b(), str, this.f13555h));
    }

    public final void a(fh fhVar, String str) {
        track((ch) new da(fhVar, "", this.f13551a.b(), str, this.f13555h, null, 32, null));
    }
}
