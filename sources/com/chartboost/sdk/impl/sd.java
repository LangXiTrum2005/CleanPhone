package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.impl.sd;
import com.chartboost.sdk.internal.Model.CBError;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class sd implements s, z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f15129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k6 f15130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final md f15131c;
    public final Function1 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function0 f15132e;
    public final /* synthetic */ z6 f;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f15133b = new a();

        public a() {
            super(1, JSONObject.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject invoke(String str) {
            return new JSONObject(str);
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f15134b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public sd(y adType, k6 downloader, md openRTBAdUnitParser, Function1 jsonFactory, Function0 androidVersion, z6 eventTracker) {
        Intrinsics.f(adType, "adType");
        Intrinsics.f(downloader, "downloader");
        Intrinsics.f(openRTBAdUnitParser, "openRTBAdUnitParser");
        Intrinsics.f(jsonFactory, "jsonFactory");
        Intrinsics.f(androidVersion, "androidVersion");
        Intrinsics.f(eventTracker, "eventTracker");
        this.f15129a = adType;
        this.f15130b = downloader;
        this.f15131c = openRTBAdUnitParser;
        this.d = jsonFactory;
        this.f15132e = androidVersion;
        this.f = eventTracker;
    }

    public final void a(k6 k6Var, z zVar, q1 q1Var) {
        Map mapD = zVar.d();
        AtomicInteger atomicInteger = new AtomicInteger();
        k6Var.c();
        k6Var.a(ae.HIGH, mapD, atomicInteger, q1Var, this.f15129a.b());
    }

    public final void b(Function1 function1, wa waVar) {
        fh.a aVar = fh.a.BID_RESPONSE_PARSING_ERROR;
        String strD = waVar.a().d();
        String strC = waVar.a().c();
        if (strC == null) {
            strC = "";
        }
        a(aVar, strD, strC, "Invalid bid response");
        function1.invoke(new xa(waVar.a(), null, new CBError(CBError.Internal.UNEXPECTED_RESPONSE, "Error parsing response"), 0L, 0L, 26, null));
    }

    public final void c(Function1 function1, wa waVar) {
        function1.invoke(new xa(waVar.a(), null, new CBError(CBError.Internal.UNSUPPORTED_OS_VERSION, android.support.v4.media.a.h(Build.VERSION.SDK_INT, "Unsupported Android version ")), 0L, 0L, 26, null));
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f.mo189track(event);
    }

    public String a(JSONObject jSONObject, String str, String str2) {
        return s.a.a(this, jSONObject, str, str2);
    }

    public final boolean a(wa waVar) {
        String strC;
        return waVar.a().d().length() > 0 && (strC = waVar.a().c()) != null && strC.length() > 0;
    }

    public /* synthetic */ sd(y yVar, k6 k6Var, md mdVar, Function1 function1, Function0 function0, z6 z6Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, k6Var, mdVar, (i2 & 8) != 0 ? a.f15133b : function1, (i2 & 16) != 0 ? b.f15134b : function0, z6Var);
    }

    @Override // com.chartboost.sdk.impl.s
    public void a(wa params, Function1 callback) {
        Intrinsics.f(params, "params");
        Intrinsics.f(callback, "callback");
        if (((Number) this.f15132e.invoke()).intValue() < 21) {
            c(callback, params);
            return;
        }
        if (!a(params)) {
            b(callback, params);
            return;
        }
        try {
            String strC = params.a().c();
            a(params, this.f15131c.a(this.f15129a, strC != null ? (JSONObject) this.d.invoke(strC) : null), callback);
        } catch (JSONException e2) {
            a(callback, params, e2);
        }
    }

    public final void a(Function1 function1, wa waVar) {
        fh.a aVar = fh.a.ASSET_DOWNLOAD_ERROR;
        String strD = waVar.a().d();
        String strC = waVar.a().c();
        if (strC == null) {
            strC = "";
        }
        a(aVar, strD, strC, "ASSETS_DOWNLOAD_FAILURE");
        function1.invoke(new xa(waVar.a(), null, new CBError(CBError.Internal.INVALID_RESPONSE, "Error parsing response"), 0L, 0L, 26, null));
    }

    public final void a(Function1 function1, wa waVar, Exception exc) {
        fh.a aVar = fh.a.BID_RESPONSE_PARSING_ERROR;
        String strD = waVar.a().d();
        String strC = waVar.a().c();
        if (strC == null) {
            strC = "";
        }
        a(aVar, strD, strC, exc.toString());
        function1.invoke(new xa(waVar.a(), null, new CBError(CBError.Internal.INVALID_RESPONSE, "Error parsing response"), 0L, 0L, 26, null));
    }

    public final void a(Function1 function1, wa waVar, z zVar) {
        function1.invoke(new xa(waVar.a(), zVar, null, 0L, 0L, 24, null));
    }

    public final void a(final wa waVar, final z zVar, final Function1 function1) {
        a(this.f15130b, zVar, new q1() { // from class: p.i
            @Override // com.chartboost.sdk.impl.q1
            public final void a(boolean z2) {
                sd.a(this.f45287a, function1, waVar, zVar, z2);
            }
        });
    }

    public static final void a(sd this$0, Function1 callback, wa loaderParams, z openRTBAdUnit, boolean z2) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(callback, "$callback");
        Intrinsics.f(loaderParams, "$loaderParams");
        Intrinsics.f(openRTBAdUnit, "$openRTBAdUnit");
        if (z2) {
            this$0.a(callback, loaderParams, openRTBAdUnit);
        } else {
            this$0.a(callback, loaderParams);
        }
    }

    public final void a(fh fhVar, String str, String str2, String str3) {
        track((ch) new h5(fhVar, a(new JSONObject(), str3, str2), this.f15129a.b(), str, null, null, 48, null));
    }
}
