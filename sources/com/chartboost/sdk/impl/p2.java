package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f14801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q8 f14802c;
    public final b2 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineDispatcher f14803e;
    public final Lazy f;
    public final Lazy g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f14804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile Job f14805i;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14806b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference invoke() {
            return new AtomicReference(null);
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14807b;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return p2.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f14807b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            p2.this.b();
            p2.this.f14805i = null;
            return Unit.f43263a;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(AppSetIdInfo appSetIdInfo) {
            p2.this.a(appSetIdInfo);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AppSetIdInfo) obj);
            return Unit.f43263a;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f14810b = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference invoke() {
            return new AtomicReference(null);
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f14811b = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicInteger invoke() {
            return new AtomicInteger();
        }
    }

    public p2(Context context, h1 android2, q8 ifa, b2 base64Wrapper, CoroutineDispatcher ioDispatcher) {
        Intrinsics.f(context, "context");
        Intrinsics.f(android2, "android");
        Intrinsics.f(ifa, "ifa");
        Intrinsics.f(base64Wrapper, "base64Wrapper");
        Intrinsics.f(ioDispatcher, "ioDispatcher");
        this.f14800a = context;
        this.f14801b = android2;
        this.f14802c = ifa;
        this.d = base64Wrapper;
        this.f14803e = ioDispatcher;
        this.f = LazyKt.b(d.f14810b);
        this.g = LazyKt.b(e.f14811b);
        this.f14804h = LazyKt.b(a.f14806b);
        f();
    }

    public final boolean a() {
        return true;
    }

    public final void b() {
        g();
        c().set(a(this.f14800a));
    }

    public final AtomicReference c() {
        return (AtomicReference) this.f14804h.getX();
    }

    public final AtomicReference d() {
        return (AtomicReference) this.f.getX();
    }

    public final AtomicInteger e() {
        return (AtomicInteger) this.g.getX();
    }

    public final void f() {
        try {
            this.f14805i = BuildersKt.c(CoroutineScopeKt.a(this.f14803e), null, null, new b(null), 3);
        } catch (Throwable th) {
            za.b("Error launching identity job", th);
        }
    }

    public final void g() {
        try {
            if (!a()) {
                za.b("AppSetId dependency not present", (Throwable) null, 2, (Object) null);
                return;
            }
            Task taskA = this.f14801b.a(this.f14800a);
            if (taskA != null) {
                taskA.addOnSuccessListener(new com.unity3d.ads.adplayer.b(new c(), 7));
            }
        } catch (Exception e2) {
            za.b("Error requesting AppSetId", e2);
        }
    }

    public final y8 h() {
        if (this.f14805i == null) {
            f();
        }
        y8 y8Var = (y8) c().get();
        return y8Var == null ? a(this.f14800a) : y8Var;
    }

    public final String a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            s2.a(jSONObject, "gaid", str);
        } else if (str2 != null) {
            s2.a(jSONObject, "uuid", str2);
        }
        String str4 = (String) d().get();
        if (str4 != null) {
            s2.a(jSONObject, "appsetid", str4);
        }
        if (str3 != null) {
            s2.a(jSONObject, "instance_id", str3);
        }
        b2 b2Var = this.d;
        String string = jSONObject.toString();
        Intrinsics.e(string, "toString(...)");
        return b2Var.c(string);
    }

    public final y8 a(Context context) {
        try {
            d1 d1VarA = this.f14802c.a();
            za.b("IFA: " + d1VarA, (Throwable) null, 2, (Object) null);
            String strA = d1VarA.a();
            kh khVarB = d1VarA.b();
            String strA2 = this.f14802c.a(context, khVarB == kh.TRACKING_LIMITED);
            if (strA != null) {
                strA2 = "000000000";
            }
            String str = strA2;
            String str2 = Chartboost.instanceId;
            if (nf.f14544a.d()) {
                nf.b(strA);
                nf.c(str);
            }
            return new y8(khVarB, a(strA, str, str2), str, strA, (String) d().get(), Integer.valueOf(e().get()), str2);
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message != null) {
                za.b(message, (Throwable) null, 2, (Object) null);
            }
            return new y8(null, null, null, null, null, null, null, 127, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p2(Context context, h1 h1Var, q8 q8Var, b2 b2Var, CoroutineDispatcher coroutineDispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 16) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher = DefaultIoScheduler.f45062Y;
        }
        this(context, h1Var, q8Var, b2Var, coroutineDispatcher);
    }

    public final void a(AppSetIdInfo appSetIdInfo) {
        if (appSetIdInfo != null) {
            d().set(appSetIdInfo.getId());
            e().set(appSetIdInfo.getScope());
        }
    }

    public static final void a(Function1 tmp0, Object obj) {
        Intrinsics.f(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}
