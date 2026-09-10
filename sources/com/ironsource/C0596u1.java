package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.ironsource.sdk.utils.Logger;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.u1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0596u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f30765a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f30766b = b.class.getName();

    /* JADX INFO: renamed from: com.ironsource.u1$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0514p8.e f30768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f30769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final JSONObject f30770d;

        public a(String name, C0514p8.e productType, String demandSourceName, JSONObject params) {
            kotlin.jvm.internal.n.f(name, "name");
            kotlin.jvm.internal.n.f(productType, "productType");
            kotlin.jvm.internal.n.f(demandSourceName, "demandSourceName");
            kotlin.jvm.internal.n.f(params, "params");
            this.f30767a = name;
            this.f30768b = productType;
            this.f30769c = demandSourceName;
            this.f30770d = params;
        }

        public final String a() {
            return this.f30767a;
        }

        public final C0514p8.e b() {
            return this.f30768b;
        }

        public final String c() {
            return this.f30769c;
        }

        public final JSONObject d() {
            return this.f30770d;
        }

        public final String e() {
            return this.f30769c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.n.a(this.f30767a, aVar.f30767a) && this.f30768b == aVar.f30768b && kotlin.jvm.internal.n.a(this.f30769c, aVar.f30769c) && kotlin.jvm.internal.n.a(this.f30770d.toString(), aVar.f30770d.toString());
        }

        public final String f() {
            return this.f30767a;
        }

        public final JSONObject g() {
            return this.f30770d;
        }

        public final C0514p8.e h() {
            return this.f30768b;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public final JSONObject i() throws JSONException {
            JSONObject jSONObjectPut = new JSONObject(this.f30770d.toString()).put(X3.i.f27802m, this.f30768b).put("demandSourceName", this.f30769c);
            kotlin.jvm.internal.n.e(jSONObjectPut, "JSONObject(params.toStri…eName\", demandSourceName)");
            return jSONObjectPut;
        }

        public String toString() {
            return "CallbackResult(name=" + this.f30767a + ", productType=" + this.f30768b + ", demandSourceName=" + this.f30769c + ", params=" + this.f30770d + ")";
        }

        public final a a(String name, C0514p8.e productType, String demandSourceName, JSONObject params) {
            kotlin.jvm.internal.n.f(name, "name");
            kotlin.jvm.internal.n.f(productType, "productType");
            kotlin.jvm.internal.n.f(demandSourceName, "demandSourceName");
            kotlin.jvm.internal.n.f(params, "params");
            return new a(name, productType, demandSourceName, params);
        }

        public static /* synthetic */ a a(a aVar, String str, C0514p8.e eVar, String str2, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f30767a;
            }
            if ((i10 & 2) != 0) {
                eVar = aVar.f30768b;
            }
            if ((i10 & 4) != 0) {
                str2 = aVar.f30769c;
            }
            if ((i10 & 8) != 0) {
                jSONObject = aVar.f30770d;
            }
            return aVar.a(str, eVar, str2, jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u1$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u1$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @ck.e(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", f = "AndroidSandboxJSHandler.kt", l = {80}, m = "invokeSuspend")
    public static final class c extends ck.i implements jk.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30771a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MeasurementManager f30773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f30774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ MotionEvent f30775e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, ak.f fVar) {
            super(2, fVar);
            this.f30773c = measurementManager;
            this.f30774d = uri;
            this.f30775e = motionEvent;
        }

        @Override // jk.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cn.a0 a0Var, ak.f fVar) {
            return ((c) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
        }

        @Override // ck.a
        public final ak.f create(Object obj, ak.f fVar) {
            return C0596u1.this.new c(this.f30773c, this.f30774d, this.f30775e, fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i10 = this.f30771a;
            if (i10 == 0) {
                t9.e.z(obj);
                C0596u1 c0596u1 = C0596u1.this;
                MeasurementManager measurementManager = this.f30773c;
                Uri uri = this.f30774d;
                kotlin.jvm.internal.n.e(uri, "uri");
                MotionEvent motionEvent = this.f30775e;
                this.f30771a = 1;
                Object objA = c0596u1.a(measurementManager, uri, motionEvent, this);
                bk.a aVar = bk.a.f5708a;
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return wj.r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u1$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @ck.e(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", f = "AndroidSandboxJSHandler.kt", l = {60}, m = "invokeSuspend")
    public static final class d extends ck.i implements jk.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30776a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MeasurementManager f30778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f30779d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MeasurementManager measurementManager, Uri uri, ak.f fVar) {
            super(2, fVar);
            this.f30778c = measurementManager;
            this.f30779d = uri;
        }

        @Override // jk.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cn.a0 a0Var, ak.f fVar) {
            return ((d) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
        }

        @Override // ck.a
        public final ak.f create(Object obj, ak.f fVar) {
            return C0596u1.this.new d(this.f30778c, this.f30779d, fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i10 = this.f30776a;
            if (i10 == 0) {
                t9.e.z(obj);
                C0596u1 c0596u1 = C0596u1.this;
                MeasurementManager measurementManager = this.f30778c;
                Uri uri = this.f30779d;
                kotlin.jvm.internal.n.e(uri, "uri");
                this.f30776a = 1;
                Object objA = c0596u1.a(measurementManager, uri, null, this);
                bk.a aVar = bk.a.f5708a;
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return wj.r.f53297a;
        }
    }

    public final a a(Context context, InterfaceC0632w1 message) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(message, "message");
        if (message instanceof InterfaceC0632w1.a) {
            return a(context, (InterfaceC0632w1.a) message);
        }
        throw new aa.b((byte) 0, 20);
    }

    private final a a(Context context, InterfaceC0632w1.a aVar) {
        MeasurementManager measurementManagerA = C0434l0.a(context);
        if (measurementManagerA == null) {
            Logger.i(f30766b, "could not obtain measurement manager");
            return a(aVar, "could not obtain measurement manager");
        }
        try {
            if (aVar instanceof InterfaceC0632w1.a.b) {
                return a(aVar, measurementManagerA);
            }
            if (aVar instanceof InterfaceC0632w1.a.C0090a) {
                return a((InterfaceC0632w1.a.C0090a) aVar, measurementManagerA);
            }
            throw new aa.b((byte) 0, 20);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return a(aVar, defpackage.e.n("failed to handle attribution, message: ", e10.getMessage()));
        }
    }

    private final a a(InterfaceC0632w1.a aVar, MeasurementManager measurementManager) {
        cn.d0.B(new d(measurementManager, Uri.parse(aVar.b()), null));
        return a(aVar);
    }

    private final a a(InterfaceC0632w1.a.C0090a c0090a, MeasurementManager measurementManager) {
        Uri uri = Uri.parse(c0090a.b());
        long jUptimeMillis = SystemClock.uptimeMillis();
        cn.d0.B(new c(measurementManager, uri, MotionEvent.obtain(jUptimeMillis, jUptimeMillis, c0090a.n(), c0090a.o().c(), c0090a.o().d(), c0090a.p()), null));
        return a(c0090a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public final Object a(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, ak.f fVar) throws Throwable {
        ak.m mVar = new ak.m(com.google.android.gms.internal.play_billing.q1.t(fVar));
        measurementManager.registerSource(uri, motionEvent, Executors.newSingleThreadExecutor(), C0614v1.a(mVar));
        Object objA = mVar.a();
        return objA == bk.a.f5708a ? objA : wj.r.f53297a;
    }

    private final a a(InterfaceC0632w1.a aVar) throws JSONException {
        JSONObject params = new JSONObject().put("params", new JSONObject().put("type", aVar instanceof InterfaceC0632w1.a.C0090a ? "click" : "impression"));
        String strA = aVar.a();
        C0514p8.e eVarD = aVar.d();
        String strE = aVar.e();
        kotlin.jvm.internal.n.e(params, "params");
        return new a(strA, eVarD, strE, params);
    }

    private final a a(InterfaceC0632w1 interfaceC0632w1, String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("reason", str).put("type", interfaceC0632w1 instanceof InterfaceC0632w1.a.C0090a ? "click" : "impression");
        String strC = interfaceC0632w1.c();
        C0514p8.e eVarD = interfaceC0632w1.d();
        String strE = interfaceC0632w1.e();
        JSONObject jSONObjectPut2 = new JSONObject().put("params", jSONObjectPut);
        kotlin.jvm.internal.n.e(jSONObjectPut2, "JSONObject().put(\"params\", payload)");
        return new a(strC, eVarD, strE, jSONObjectPut2);
    }
}
