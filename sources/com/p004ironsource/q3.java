package com.p004ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.applovin.impl.Z;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.sdk.utils.Logger;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J-\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0083@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0010J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/ironsource/q3;", "", "Landroid/content/Context;", "context", "Lcom/ironsource/s3$a;", PglCryptUtils.KEY_MESSAGE, "Lcom/ironsource/q3$a;", "a", "Landroid/adservices/measurement/MeasurementManager;", "measurementManager", "Lcom/ironsource/s3$a$a;", "Landroid/net/Uri;", "uri", "Landroid/view/MotionEvent;", "inputEvent", "", "(Landroid/adservices/measurement/MeasurementManager;Landroid/net/Uri;Landroid/view/MotionEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ironsource/s3;", "", "reason", "<init>", "()V", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class q3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f26526b = Companion.class.getName();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J1\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/ironsource/q3$a;", "", "Lorg/json/JSONObject;", i.f37957c, x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "", "hashCode", "", "a", "Lcom/ironsource/mh$e;", "b", "c", "d", "name", d9.h.m, "demandSourceName", "params", "toString", "Ljava/lang/String;", f.j, "()Ljava/lang/String;", "Lcom/ironsource/mh$e;", h.f36614b, "()Lcom/ironsource/mh$e;", "e", "Lorg/json/JSONObject;", g.f40227p, "()Lorg/json/JSONObject;", "<init>", "(Ljava/lang/String;Lcom/ironsource/mh$e;Ljava/lang/String;Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final mh.e productType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String demandSourceName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final JSONObject params;

        public a(String name, mh.e productType, String demandSourceName, JSONObject params) {
            Intrinsics.f(name, "name");
            Intrinsics.f(productType, "productType");
            Intrinsics.f(demandSourceName, "demandSourceName");
            Intrinsics.f(params, "params");
            this.name = name;
            this.productType = productType;
            this.demandSourceName = demandSourceName;
            this.params = params;
        }

        public static /* synthetic */ a a(a aVar, String str, mh.e eVar, String str2, JSONObject jSONObject, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aVar.name;
            }
            if ((i2 & 2) != 0) {
                eVar = aVar.productType;
            }
            if ((i2 & 4) != 0) {
                str2 = aVar.demandSourceName;
            }
            if ((i2 & 8) != 0) {
                jSONObject = aVar.params;
            }
            return aVar.a(str, eVar, str2, jSONObject);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final mh.e getProductType() {
            return this.productType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDemandSourceName() {
            return this.demandSourceName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final JSONObject getParams() {
            return this.params;
        }

        public final String e() {
            return this.demandSourceName;
        }

        public boolean equals(Object other) {
            if (!(other instanceof a)) {
                return false;
            }
            if (this == other) {
                return true;
            }
            a aVar = (a) other;
            return Intrinsics.a(this.name, aVar.name) && this.productType == aVar.productType && Intrinsics.a(this.demandSourceName, aVar.demandSourceName) && Intrinsics.a(this.params.toString(), aVar.params.toString());
        }

        public final String f() {
            return this.name;
        }

        public final JSONObject g() {
            return this.params;
        }

        public final mh.e h() {
            return this.productType;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public final JSONObject i() throws JSONException {
            JSONObject jSONObjectPut = new JSONObject(this.params.toString()).put(d9.h.m, this.productType).put("demandSourceName", this.demandSourceName);
            Intrinsics.e(jSONObjectPut, "JSONObject(params.toStri…eName\", demandSourceName)");
            return jSONObjectPut;
        }

        public String toString() {
            return "CallbackResult(name=" + this.name + ", productType=" + this.productType + ", demandSourceName=" + this.demandSourceName + ", params=" + this.params + ')';
        }

        public final a a(String name, mh.e productType, String demandSourceName, JSONObject params) {
            Intrinsics.f(name, "name");
            Intrinsics.f(productType, "productType");
            Intrinsics.f(demandSourceName, "demandSourceName");
            Intrinsics.f(params, "params");
            return new a(name, productType, demandSourceName, params);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", f = "AndroidSandboxJSHandler.kt", l = {80}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26530a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MeasurementManager f26532c;
        final /* synthetic */ Uri d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ MotionEvent f26533e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f26532c = measurementManager;
            this.d = uri;
            this.f26533e = motionEvent;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q3.this.new c(this.f26532c, this.d, this.f26533e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f26530a;
            if (i2 == 0) {
                ResultKt.b(obj);
                q3 q3Var = q3.this;
                MeasurementManager measurementManager = this.f26532c;
                Uri uri = this.d;
                Intrinsics.e(uri, "uri");
                MotionEvent motionEvent = this.f26533e;
                this.f26530a = 1;
                if (q3Var.a(measurementManager, uri, motionEvent, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f43263a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", f = "AndroidSandboxJSHandler.kt", l = {60}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26534a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MeasurementManager f26536c;
        final /* synthetic */ Uri d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MeasurementManager measurementManager, Uri uri, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f26536c = measurementManager;
            this.d = uri;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q3.this.new d(this.f26536c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f26534a;
            if (i2 == 0) {
                ResultKt.b(obj);
                q3 q3Var = q3.this;
                MeasurementManager measurementManager = this.f26536c;
                Uri uri = this.d;
                Intrinsics.e(uri, "uri");
                this.f26534a = 1;
                if (q3Var.a(measurementManager, uri, null, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f43263a;
        }
    }

    private final a a(s3.a.C0290a message, MeasurementManager measurementManager) throws Throwable {
        Uri uri = Uri.parse(message.getUrl());
        long jUptimeMillis = SystemClock.uptimeMillis();
        BuildersKt.d(EmptyCoroutineContext.X, new c(measurementManager, uri, MotionEvent.obtain(jUptimeMillis, jUptimeMillis, message.m(), message.n().c(), message.n().d(), message.o()), null));
        return a(message);
    }

    private final a a(s3.a message) throws JSONException {
        JSONObject params = new JSONObject().put("params", new JSONObject().put("type", message instanceof s3.a.C0290a ? "click" : "impression"));
        String successCallback = message.getSuccessCallback();
        mh.e productType = message.getCom.ironsource.d9.h.m java.lang.String();
        String demandSourceName = message.getDemandSourceName();
        Intrinsics.e(params, "params");
        return new a(successCallback, productType, demandSourceName, params);
    }

    private final a a(s3.a message, MeasurementManager measurementManager) throws Throwable {
        BuildersKt.d(EmptyCoroutineContext.X, new d(measurementManager, Uri.parse(message.getUrl()), null));
        return a(message);
    }

    private final a a(s3 message, String reason) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("reason", reason).put("type", message instanceof s3.a.C0290a ? "click" : "impression");
        String failCallback = message.getFailCallback();
        mh.e productType = message.getCom.ironsource.d9.h.m java.lang.String();
        String demandSourceName = message.getDemandSourceName();
        JSONObject jSONObjectPut2 = new JSONObject().put("params", jSONObjectPut);
        Intrinsics.e(jSONObjectPut2, "JSONObject().put(\"params\", payload)");
        return new a(failCallback, productType, demandSourceName, jSONObjectPut2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, Continuation<? super Unit> continuation) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(continuation));
        measurementManager.registerSource(uri, motionEvent, Executors.newSingleThreadExecutor(), r3.a(safeContinuation));
        Object objA = safeContinuation.a();
        return objA == CoroutineSingletons.X ? objA : Unit.f43263a;
    }

    private final a a(Context context, s3.a message) {
        MeasurementManager measurementManagerA = i1.a(context);
        if (measurementManagerA == null) {
            Logger.i(f26526b, "could not obtain measurement manager");
            return a(message, "could not obtain measurement manager");
        }
        try {
            if (message instanceof s3.a.b) {
                return a(message, measurementManagerA);
            }
            if (message instanceof s3.a.C0290a) {
                return a((s3.a.C0290a) message, measurementManagerA);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e2) {
            return a(message, Z.m(e2, com.google.firebase.crashlytics.internal.model.a.o(e2, "failed to handle attribution, message: ")));
        }
    }

    public final a a(Context context, s3 message) {
        Intrinsics.f(context, "context");
        Intrinsics.f(message, "message");
        if (message instanceof s3.a) {
            return a(context, (s3.a) message);
        }
        throw new NoWhenBranchMatchedException();
    }
}
