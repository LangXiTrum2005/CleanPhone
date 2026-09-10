package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.ironsource.sdk.utils.Logger;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3766u1 {
    public static final b a = new b(null);
    private static final String b;

    /* JADX INFO: renamed from: com.ironsource.u1$a */
    public static final class a {
        private final String a;
        private final C3653n8.e b;
        private final String c;
        private final JSONObject d;

        public a(String name, C3653n8.e productType, String demandSourceName, JSONObject params) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
            Intrinsics.checkNotNullParameter(params, "params");
            this.a = name;
            this.b = productType;
            this.c = demandSourceName;
            this.d = params;
        }

        public final String a() {
            return this.a;
        }

        public final C3653n8.e b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final JSONObject d() {
            return this.d;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            a aVar = (a) obj;
            return Intrinsics.wireman(this.a, aVar.a) && this.b == aVar.b && Intrinsics.wireman(this.c, aVar.c) && Intrinsics.wireman(this.d.toString(), aVar.d.toString());
        }

        public final String f() {
            return this.a;
        }

        public final JSONObject g() {
            return this.d;
        }

        public final C3653n8.e h() {
            return this.b;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public final JSONObject i() throws JSONException {
            JSONObject jSONObjectPut = new JSONObject(this.d.toString()).put(X3.i.m, this.b).put("demandSourceName", this.c);
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject(params.toStri…eName\", demandSourceName)");
            return jSONObjectPut;
        }

        public String toString() {
            return "CallbackResult(name=" + this.a + ", productType=" + this.b + ", demandSourceName=" + this.c + ", params=" + this.d + ")";
        }

        public final a a(String name, C3653n8.e productType, String demandSourceName, JSONObject params) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
            Intrinsics.checkNotNullParameter(params, "params");
            return new a(name, productType, demandSourceName, params);
        }

        public static /* synthetic */ a a(a aVar, String str, C3653n8.e eVar, String str2, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                eVar = aVar.b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.c;
            }
            if ((i & 8) != 0) {
                jSONObject = aVar.d;
            }
            return aVar.a(str, eVar, str2, jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u1$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u1$c */
    @igo.wireman(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", f = "AndroidSandboxJSHandler.kt", l = {80}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.saran, wretchedly.dern<? super Unit>, Object> {
        int a;
        final /* synthetic */ MeasurementManager c;
        final /* synthetic */ Uri d;
        final /* synthetic */ MotionEvent e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, wretchedly.dern<? super c> dernVar) {
            super(2, dernVar);
            this.c = measurementManager;
            this.d = uri;
            this.e = motionEvent;
        }

        @Override // p002kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.saran saranVar, wretchedly.dern<? super Unit> dernVar) {
            return ((c) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
            return C3766u1.this.new c(this.c, this.d, this.e, dernVar);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
            int i = this.a;
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                C3766u1 c3766u1 = C3766u1.this;
                MeasurementManager measurementManager = this.c;
                Uri uri = this.d;
                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                MotionEvent motionEvent = this.e;
                this.a = 1;
                if (c3766u1.a(measurementManager, uri, motionEvent, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
            return Unit.f29295attabal;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u1$d */
    @igo.wireman(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", f = "AndroidSandboxJSHandler.kt", l = {60}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2<kotlinx.coroutines.saran, wretchedly.dern<? super Unit>, Object> {
        int a;
        final /* synthetic */ MeasurementManager c;
        final /* synthetic */ Uri d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MeasurementManager measurementManager, Uri uri, wretchedly.dern<? super d> dernVar) {
            super(2, dernVar);
            this.c = measurementManager;
            this.d = uri;
        }

        @Override // p002kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.saran saranVar, wretchedly.dern<? super Unit> dernVar) {
            return ((d) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
            return C3766u1.this.new d(this.c, this.d, dernVar);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
            int i = this.a;
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                C3766u1 c3766u1 = C3766u1.this;
                MeasurementManager measurementManager = this.c;
                Uri uri = this.d;
                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                this.a = 1;
                if (c3766u1.a(measurementManager, uri, null, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
            return Unit.f29295attabal;
        }
    }

    static {
        String name = b.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "this::class.java.name");
        b = name;
    }

    public final a a(Context context, InterfaceC3800w1 message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof InterfaceC3800w1.a) {
            return a(context, (InterfaceC3800w1.a) message);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final a a(Context context, InterfaceC3800w1.a aVar) {
        MeasurementManager measurementManagerA = C3609l0.a(context);
        if (measurementManagerA == null) {
            Logger.i(b, "could not obtain measurement manager");
            return a(aVar, "could not obtain measurement manager");
        }
        try {
            if (aVar instanceof InterfaceC3800w1.a.b) {
                return a(aVar, measurementManagerA);
            }
            if (aVar instanceof InterfaceC3800w1.a.C0416a) {
                return a((InterfaceC3800w1.a.C0416a) aVar, measurementManagerA);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            C3631m4.d().a(e);
            return a(aVar, "failed to handle attribution, message: " + e.getMessage());
        }
    }

    private final a a(InterfaceC3800w1.a aVar, MeasurementManager measurementManager) throws InterruptedException {
        kotlinx.coroutines.taiyuan.saneness(null, new d(measurementManager, Uri.parse(aVar.b()), null), 1, null);
        return a(aVar);
    }

    private final a a(InterfaceC3800w1.a.C0416a c0416a, MeasurementManager measurementManager) throws InterruptedException {
        Uri uri = Uri.parse(c0416a.b());
        long jUptimeMillis = SystemClock.uptimeMillis();
        kotlinx.coroutines.taiyuan.saneness(null, new c(measurementManager, uri, MotionEvent.obtain(jUptimeMillis, jUptimeMillis, c0416a.n(), c0416a.o().c(), c0416a.o().d(), c0416a.p()), null), 1, null);
        return a(c0416a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, wretchedly.dern<? super Unit> dernVar) throws Throwable {
        wretchedly.beachfront beachfrontVar = new wretchedly.beachfront(IntrinsicsKt__IntrinsicsJvmKt.dern(dernVar));
        measurementManager.registerSource(uri, motionEvent, Executors.newSingleThreadExecutor(), C3783v1.a(beachfrontVar));
        Object objAttabal = beachfrontVar.attabal();
        if (objAttabal == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            igo.beachfront.dern(dernVar);
        }
        return objAttabal == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objAttabal : Unit.f29295attabal;
    }

    private final a a(InterfaceC3800w1.a aVar) throws JSONException {
        JSONObject params = new JSONObject().put("params", new JSONObject().put("type", aVar instanceof InterfaceC3800w1.a.C0416a ? "click" : "impression"));
        String strA = aVar.a();
        C3653n8.e eVarD = aVar.d();
        String strE = aVar.e();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        return new a(strA, eVarD, strE, params);
    }

    private final a a(InterfaceC3800w1 interfaceC3800w1, String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("reason", str).put("type", interfaceC3800w1 instanceof InterfaceC3800w1.a.C0416a ? "click" : "impression");
        String strC = interfaceC3800w1.c();
        C3653n8.e eVarD = interfaceC3800w1.d();
        String strE = interfaceC3800w1.e();
        JSONObject jSONObjectPut2 = new JSONObject().put("params", jSONObjectPut);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut2, "JSONObject().put(\"params\", payload)");
        return new a(strC, eVarD, strE, jSONObjectPut2);
    }
}
