package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class g9 implements i9, g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f13995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uh f13996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final la f13997c;
    public final d4 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g4 f13998e;
    public final v9 f;
    public final h9 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hd f13999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n0 f14000i;
    public final qf j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f14001l;
    public boolean m;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f14002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CBError.Click f14003c;
        public final /* synthetic */ g9 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, CBError.Click click, g9 g9Var) {
            super(1);
            this.f14002b = str;
            this.f14003c = click;
            this.d = g9Var;
        }

        public final void a(h9 notify) {
            Intrinsics.f(notify, "$this$notify");
            notify.a(this.f14002b, this.f14003c);
            this.d.b("Impression click callback for: " + this.f14002b + " failed with error: " + this.f14003c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h9) obj);
            return Unit.f43263a;
        }
    }

    public static final class b implements e4 {
        @Override // com.chartboost.sdk.impl.e4
        public void a(String str) {
            za.b("onClickRequestFailure " + str, (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.e4
        public void a(JSONObject jSONObject) {
            String string;
            if (jSONObject == null || (string = jSONObject.toString()) == null) {
                string = "";
            }
            za.b("onClickRequestSuccess ".concat(string), (Throwable) null, 2, (Object) null);
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f14005c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f14005c = str;
        }

        public final void a(h9 notify) {
            Intrinsics.f(notify, "$this$notify");
            notify.d();
            g9.this.a("Url impression callback success: " + this.f14005c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h9) obj);
            return Unit.f43263a;
        }
    }

    public g9(z adUnit, uh urlResolver, la intentResolver, d4 clickRequest, g4 clickTracking, v9 mediaType, h9 impressionCallback, hd openMeasurementImpressionCallback, n0 adUnitRendererImpressionCallback, qf sdkConfig) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(urlResolver, "urlResolver");
        Intrinsics.f(intentResolver, "intentResolver");
        Intrinsics.f(clickRequest, "clickRequest");
        Intrinsics.f(clickTracking, "clickTracking");
        Intrinsics.f(mediaType, "mediaType");
        Intrinsics.f(impressionCallback, "impressionCallback");
        Intrinsics.f(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.f(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.f(sdkConfig, "sdkConfig");
        this.f13995a = adUnit;
        this.f13996b = urlResolver;
        this.f13997c = intentResolver;
        this.d = clickRequest;
        this.f13998e = clickTracking;
        this.f = mediaType;
        this.g = impressionCallback;
        this.f13999h = openMeasurementImpressionCallback;
        this.f14000i = adUnitRendererImpressionCallback;
        this.j = sdkConfig;
    }

    @Override // com.chartboost.sdk.impl.i9
    public void a(String str, CBError.Click error) {
        Intrinsics.f(error, "error");
        this.f14000i.a(this.f13995a.m(), str, error);
    }

    @Override // com.chartboost.sdk.impl.i9
    public void b(f3 cbUrl) {
        Intrinsics.f(cbUrl, "cbUrl");
        a(cbUrl.b(), cbUrl.a(), true);
    }

    @Override // com.chartboost.sdk.impl.i9
    public void c(f3 cbUrl) {
        Intrinsics.f(cbUrl, "cbUrl");
        c(cbUrl.b());
    }

    @Override // com.chartboost.sdk.impl.i9
    public void d() {
        this.f14000i.b(this.f13995a.m());
        if (this.m) {
            this.g.D();
        }
    }

    @Override // com.chartboost.sdk.impl.i9
    public void e(boolean z2) {
        this.k = z2;
    }

    public final void a(h9 h9Var, String str, CBError.Click click) {
        a(h9Var, new a(str, click, this));
    }

    @Override // com.chartboost.sdk.impl.i9
    public void b(String location, Float f, Float f2) {
        Intrinsics.f(location, "location");
        this.d.a(new b(), new b4(location, this.f13995a.a(), this.f13995a.A(), this.f13995a.g(), this.f13995a.i(), f, f2, this.f, this.f14001l));
    }

    public final void c(String str) {
        a(this.g, str, CBError.Click.LOAD_NOT_FINISHED);
    }

    public boolean a() {
        return this.k;
    }

    public final void d(String str) {
        this.f13996b.a(str, this.f13995a.h(), this.f13998e, false);
    }

    public final void a(String str, Boolean bool, boolean z2) {
        Unit unit;
        this.f13999h.b();
        if (bool != null) {
            this.m = bool.booleanValue();
        }
        CBError.Click clickA = this.f13996b.a(str, this.f13995a.h(), this.f13998e, z2);
        if (clickA != null) {
            a(this.g, str, clickA);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            a(this.g, str);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g9(z zVar, uh uhVar, la laVar, d4 d4Var, g4 g4Var, v9 v9Var, h9 h9Var, hd hdVar, n0 n0Var, qf qfVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        qf qfVar2;
        if ((i2 & 512) != 0) {
            Object obj = w3.f15454b.a().b().get();
            Intrinsics.e(obj, "get(...)");
            qfVar2 = (qf) obj;
        } else {
            qfVar2 = qfVar;
        }
        this(zVar, uhVar, laVar, d4Var, g4Var, v9Var, h9Var, hdVar, n0Var, qfVar2);
    }

    public final void a(h9 h9Var, Function1 function1) {
        Unit unit;
        if (h9Var != null) {
            h9Var.a(false);
            function1.invoke(h9Var);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.b("Impression callback is null", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.g4
    public void b(String message) {
        Intrinsics.f(message, "message");
        this.f13998e.b(message);
    }

    @Override // com.chartboost.sdk.impl.i9
    public boolean a(String urlFromCreative, Boolean bool, w9 impressionState) {
        Intrinsics.f(urlFromCreative, "urlFromCreative");
        Intrinsics.f(impressionState, "impressionState");
        if (bool != null) {
            this.m = bool.booleanValue();
        }
        if (impressionState != w9.DISPLAYED) {
            return false;
        }
        if (!this.j.f14934A || StringsKt.w(urlFromCreative)) {
            urlFromCreative = this.f13995a.o();
        }
        String strK = this.f13995a.k();
        if (this.f13997c.b(strK)) {
            this.f14001l = Boolean.TRUE;
            urlFromCreative = strK;
        } else {
            this.f14001l = Boolean.FALSE;
        }
        if (a()) {
            return false;
        }
        e(true);
        this.g.b(false);
        a(urlFromCreative, Boolean.valueOf(this.m), true);
        return true;
    }

    @Override // com.chartboost.sdk.impl.i9
    public void a(f3 cbUrl) {
        Intrinsics.f(cbUrl, "cbUrl");
        d(cbUrl.b());
    }

    public final void a(h9 h9Var, String str) {
        a(h9Var, new c(str));
    }

    @Override // com.chartboost.sdk.impl.g4
    public void a(String message) {
        Intrinsics.f(message, "message");
        this.f13998e.a(message);
    }
}
