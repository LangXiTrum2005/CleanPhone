package com.chartboost.sdk.internal.clickthrough;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.chartboost.sdk.impl.c4;
import com.chartboost.sdk.impl.f4;
import com.chartboost.sdk.impl.la;
import com.chartboost.sdk.impl.ph;
import com.chartboost.sdk.impl.qh;
import com.chartboost.sdk.impl.sh;
import com.chartboost.sdk.impl.za;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f15818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15819c;
        public int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15819c = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = b.a(null, null, null, null, null, null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0182b extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0182b f15820b = new C0182b();

        public C0182b() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f15821b = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Uri it) {
            Intrinsics.f(it, "it");
            return new Intent("android.intent.action.VIEW", it);
        }
    }

    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f15822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15823c;
        public int d;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15823c = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = b.a(null, null, null, null, null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f15824b = new e();

        public e() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class f extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f15825b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(1);
            this.f15825b = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(String url) {
            Intrinsics.f(url, "url");
            return EmbeddedBrowserActivity.INSTANCE.a(this.f15825b, url);
        }
    }

    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f15826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15827c;
        public int d;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15827c = obj;
            this.d |= Integer.MIN_VALUE;
            Object objB = b.b(null, null, null, null, null, this);
            return objB == CoroutineSingletons.X ? objB : new Result(objB);
        }
    }

    public /* synthetic */ class h extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f15828b = new h();

        public h() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class i extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f15829b = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Uri it) {
            Intrinsics.f(it, "it");
            return new Intent("android.intent.action.VIEW", it);
        }
    }

    public static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f15830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15831c;
        public int d;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15831c = obj;
            this.d |= Integer.MIN_VALUE;
            Object objC = b.c(null, null, null, null, null, this);
            return objC == CoroutineSingletons.X ? objC : new Result(objC);
        }
    }

    public /* synthetic */ class k extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f15832b = new k();

        public k() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class l extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f15833b = new l();

        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Uri it) {
            Intrinsics.f(it, "it");
            return new Intent("android.intent.action.VIEW", it);
        }
    }

    public static final class m extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f15835c;
        public final /* synthetic */ Intent d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Context context, Intent intent, Continuation continuation) {
            super(2, continuation);
            this.f15835c = context;
            this.d = intent;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new m(this.f15835c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f15834b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            this.f15835c.startActivity(b.b(this.d));
            return Unit.f43263a;
        }
    }

    public static final boolean a(qh qhVar) {
        return qhVar.a() == c4.CLICK_PREFERENCE_EMBEDDED;
    }

    public static final boolean b(qh qhVar) {
        return qhVar.a() == c4.CLICK_PREFERENCE_NATIVE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object c(qh qhVar, Context context, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        j jVar;
        Object objA;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.d = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object obj = jVar.f15831c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = jVar.d;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                za.a("Attempting to open unsecure link. Url: " + qhVar.b(), (Throwable) null, 2, (Object) null);
                if (!a(qhVar, function1)) {
                    throw com.chartboost.sdk.internal.clickthrough.a.c.f15816b;
                }
                Intent intent = (Intent) function2.invoke(function1.invoke(qhVar.b()));
                jVar.f15830b = qhVar;
                jVar.d = 1;
                if (a(context, intent, coroutineDispatcher, jVar) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qhVar = (qh) jVar.f15830b;
                ResultKt.b(obj);
            }
            objA = new ph("openUnsecureLink");
            za.a("Successfully opened unsecure link. Url: " + qhVar.b(), (Throwable) null, 2, (Object) null);
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.e("Failed to open unsecure link. Url: " + qhVar.b() + ", Reason: " + thA, null, 2, null);
        }
        return objA;
    }

    public static final boolean a(qh qhVar, Function1 function1) {
        if (qhVar != null) {
            return Intrinsics.a(((Uri) function1.invoke(qhVar.b())).getScheme(), "http");
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object b(qh qhVar, Context context, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        g gVar;
        Object objA;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.d = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.f15827c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = gVar.d;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                za.a("Attempting to open in native browser. Url: " + qhVar.b(), (Throwable) null, 2, (Object) null);
                if (!qhVar.c()) {
                    throw com.chartboost.sdk.internal.clickthrough.a.b.f15815b;
                }
                if (!b(qhVar)) {
                    throw com.chartboost.sdk.internal.clickthrough.a.d.f15817b;
                }
                Intent intent = (Intent) function2.invoke(function1.invoke(sh.b(qhVar).b()));
                gVar.f15826b = qhVar;
                gVar.d = 1;
                if (a(context, intent, coroutineDispatcher, gVar) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qhVar = (qh) gVar.f15826b;
                ResultKt.b(obj);
            }
            objA = new ph("openInNativeBrowser");
            za.a("Successfully opened in native browser. Url: " + qhVar.b(), (Throwable) null, 2, (Object) null);
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.e("Failed to open in native browser. Url: " + qhVar.b() + ", Reason: " + thA, null, 2, null);
        }
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(qh qhVar, Context context, la laVar, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        a aVar;
        Object objA;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f15819c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = aVar.d;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                za.a("Attempting to open deep link. Url: " + qhVar.b(), (Throwable) null, 2, (Object) null);
                if (qhVar.c()) {
                    if (laVar.b(qhVar.b())) {
                        Intent intent = (Intent) function2.invoke(function1.invoke(qhVar.b()));
                        aVar.f15818b = qhVar;
                        aVar.d = 1;
                        if (a(context, intent, coroutineDispatcher, aVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        throw com.chartboost.sdk.internal.clickthrough.a.C0181a.f15814b;
                    }
                } else {
                    throw com.chartboost.sdk.internal.clickthrough.a.b.f15815b;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qhVar = (qh) aVar.f15818b;
                ResultKt.b(obj);
            }
            objA = new ph("openDeepLink");
            za.a("Successfully opened deep link. Url: " + qhVar.b(), (Throwable) null, 2, (Object) null);
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.e("Failed to open deep link. Url: " + qhVar.b() + ", Reason: " + thA, null, 2, null);
        }
        return objA;
    }

    public static Object c(qh qhVar, Context context, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = f4.a();
        }
        if ((i2 & 4) != 0) {
            function1 = k.f15832b;
        }
        if ((i2 & 8) != 0) {
            function2 = l.f15833b;
        }
        if ((i2 & 16) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher = MainDispatcherLoader.f45042a;
        }
        Function1 function3 = function2;
        return c(qhVar, context, function1, function3, coroutineDispatcher, continuation);
    }

    public static Object a(qh qhVar, Context context, la laVar, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = f4.a();
        }
        if ((i2 & 4) != 0) {
            laVar = f4.b();
        }
        if ((i2 & 8) != 0) {
            function1 = C0182b.f15820b;
        }
        if ((i2 & 16) != 0) {
            function2 = c.f15821b;
        }
        if ((i2 & 32) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher = MainDispatcherLoader.f45042a;
        }
        CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
        return a(qhVar, context, laVar, function1, function2, coroutineDispatcher2, continuation);
    }

    public static Object b(qh qhVar, Context context, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = f4.a();
        }
        if ((i2 & 4) != 0) {
            function1 = h.f15828b;
        }
        if ((i2 & 8) != 0) {
            function2 = i.f15829b;
        }
        if ((i2 & 16) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher = MainDispatcherLoader.f45042a;
        }
        Function1 function3 = function2;
        return b(qhVar, context, function1, function3, coroutineDispatcher, continuation);
    }

    public static final Intent b(Intent intent) {
        intent.setFlags(268435456);
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(qh qhVar, Context context, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        d dVar;
        Object objA;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f15823c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = dVar.d;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                za.a("Attempting to open in embedded browser. Url: " + qhVar.b(), (Throwable) null, 2, (Object) null);
                if (qhVar.c()) {
                    if (a(qhVar)) {
                        function1.invoke(qhVar.b());
                        Intent intent = (Intent) function2.invoke(sh.b(qhVar).b());
                        dVar.f15822b = qhVar;
                        dVar.d = 1;
                        if (a(context, intent, coroutineDispatcher, dVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        throw com.chartboost.sdk.internal.clickthrough.a.d.f15817b;
                    }
                } else {
                    throw com.chartboost.sdk.internal.clickthrough.a.b.f15815b;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qhVar = (qh) dVar.f15822b;
                ResultKt.b(obj);
            }
            objA = new ph("openInEmbeddedBrowser");
            za.a("Successfully opened in embedded browser. Url: " + qhVar.b(), (Throwable) null, 2, (Object) null);
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.e("Failed to open in embedded browser. Url: " + qhVar.b() + ", Reason: " + thA, null, 2, null);
        }
        return objA;
    }

    public static Object a(qh qhVar, Context context, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = f4.a();
        }
        if ((i2 & 4) != 0) {
            function1 = e.f15824b;
        }
        if ((i2 & 8) != 0) {
            function2 = new f(context);
        }
        if ((i2 & 16) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher = MainDispatcherLoader.f45042a;
        }
        Function1 function3 = function2;
        return a(qhVar, context, function1, function3, coroutineDispatcher, continuation);
    }

    public static final Object a(Context context, Intent intent, CoroutineDispatcher coroutineDispatcher, Continuation continuation) throws Throwable {
        Object objF = BuildersKt.f(coroutineDispatcher, new m(context, intent, null), continuation);
        return objF == CoroutineSingletons.X ? objF : Unit.f43263a;
    }
}
