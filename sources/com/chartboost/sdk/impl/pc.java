package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class pc extends te implements xe {
    public static final a m = new a(null);
    public final List d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f14829e;
    public final CoroutineScope f;
    public final List g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f2 f14831i;
    public float j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14832l;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14834c;
        public /* synthetic */ Object d;
        public int f;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object objA = pc.this.a(null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14837c;
        public final /* synthetic */ List d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, Continuation continuation) {
            super(2, continuation);
            this.d = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.d, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002b  */
        /* JADX WARN: Code duplicated, block: B:18:0x003b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0044 A[Catch: Exception -> 0x0011, TRY_LEAVE, TryCatch #0 {Exception -> 0x0011, blocks: (B:6:0x000d, B:19:0x003c, B:16:0x0031, B:21:0x0044), top: B:26:0x000d }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0039 -> B:19:0x003c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
                int r1 = r4.f14837c
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r4.f14836b
                java.util.Iterator r1 = (java.util.Iterator) r1
                kotlin.ResultKt.b(r5)     // Catch: java.lang.Exception -> L11
                goto L3c
            L11:
                r5 = move-exception
                goto L4e
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1b:
                kotlin.ResultKt.b(r5)
                java.util.List r5 = r4.d
                java.util.Iterator r5 = r5.iterator()
                r1 = r5
            L25:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L54
                java.lang.Object r5 = r1.next()
                kotlinx.coroutines.Deferred r5 = (kotlinx.coroutines.Deferred) r5
                r4.f14836b = r1     // Catch: java.lang.Exception -> L11
                r4.f14837c = r2     // Catch: java.lang.Exception -> L11
                java.lang.Object r5 = r5.r(r4)     // Catch: java.lang.Exception -> L11
                if (r5 != r0) goto L3c
                return r0
            L3c:
                kotlin.Result r5 = (kotlin.Result) r5     // Catch: java.lang.Exception -> L11
                java.lang.Object r5 = r5.X     // Catch: java.lang.Exception -> L11
                boolean r3 = r5 instanceof kotlin.Result.Failure     // Catch: java.lang.Exception -> L11
                if (r3 == 0) goto L25
                java.lang.String r3 = "An optional renderable failed to load in the background."
                java.lang.Throwable r5 = kotlin.Result.a(r5)     // Catch: java.lang.Exception -> L11
                com.chartboost.sdk.impl.za.e(r3, r5)     // Catch: java.lang.Exception -> L11
                goto L25
            L4e:
                java.lang.String r3 = "Exception while awaiting an optional renderable."
                com.chartboost.sdk.impl.za.b(r3, r5)
                goto L25
            L54:
                kotlin.Unit r5 = kotlin.Unit.f43263a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.pc.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f2 f14839c;
        public final /* synthetic */ pc d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f14840e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f2 f2Var, pc pcVar, Context context, Continuation continuation) {
            super(2, continuation);
            this.f14839c = f2Var;
            this.d = pcVar;
            this.f14840e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f14839c, this.d, this.f14840e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f14838b;
            if (i2 == 0) {
                ResultKt.b(obj);
                this.f14839c.a(this.d);
                f2 f2Var = this.f14839c;
                Context context = this.f14840e;
                this.f14838b = 1;
                objA = f2Var.a(context, this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objA = ((Result) obj).X;
            }
            return new Result(objA);
        }
    }

    public pc(List renderables, w adMarkupConfig) {
        Intrinsics.f(renderables, "renderables");
        Intrinsics.f(adMarkupConfig, "adMarkupConfig");
        this.d = renderables;
        this.f14829e = adMarkupConfig;
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        this.f = CoroutineScopeKt.a(DefaultIoScheduler.f45062Y.plus(SupervisorKt.b()));
        this.g = new ArrayList();
        this.f14830h = -1;
        this.j = 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0151 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002a, B:80:0x01b6, B:82:0x01bc, B:92:0x01df, B:94:0x01ec, B:97:0x01fb, B:96:0x01f4, B:85:0x01c3, B:86:0x01c7, B:88:0x01cd, B:90:0x01d9, B:19:0x0042, B:55:0x0145, B:56:0x014b, B:58:0x0151, B:62:0x0160, B:64:0x0164, B:66:0x016c, B:67:0x0173, B:68:0x017c, B:70:0x0182, B:71:0x0192, B:73:0x0197, B:49:0x012f, B:51:0x0135, B:75:0x01a7, B:77:0x01ad, B:99:0x0200), top: B:103:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0164 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002a, B:80:0x01b6, B:82:0x01bc, B:92:0x01df, B:94:0x01ec, B:97:0x01fb, B:96:0x01f4, B:85:0x01c3, B:86:0x01c7, B:88:0x01cd, B:90:0x01d9, B:19:0x0042, B:55:0x0145, B:56:0x014b, B:58:0x0151, B:62:0x0160, B:64:0x0164, B:66:0x016c, B:67:0x0173, B:68:0x017c, B:70:0x0182, B:71:0x0192, B:73:0x0197, B:49:0x012f, B:51:0x0135, B:75:0x01a7, B:77:0x01ad, B:99:0x0200), top: B:103:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x016c A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002a, B:80:0x01b6, B:82:0x01bc, B:92:0x01df, B:94:0x01ec, B:97:0x01fb, B:96:0x01f4, B:85:0x01c3, B:86:0x01c7, B:88:0x01cd, B:90:0x01d9, B:19:0x0042, B:55:0x0145, B:56:0x014b, B:58:0x0151, B:62:0x0160, B:64:0x0164, B:66:0x016c, B:67:0x0173, B:68:0x017c, B:70:0x0182, B:71:0x0192, B:73:0x0197, B:49:0x012f, B:51:0x0135, B:75:0x01a7, B:77:0x01ad, B:99:0x0200), top: B:103:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0182 A[Catch: Exception -> 0x002f, LOOP:2: B:68:0x017c->B:70:0x0182, LOOP_END, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002a, B:80:0x01b6, B:82:0x01bc, B:92:0x01df, B:94:0x01ec, B:97:0x01fb, B:96:0x01f4, B:85:0x01c3, B:86:0x01c7, B:88:0x01cd, B:90:0x01d9, B:19:0x0042, B:55:0x0145, B:56:0x014b, B:58:0x0151, B:62:0x0160, B:64:0x0164, B:66:0x016c, B:67:0x0173, B:68:0x017c, B:70:0x0182, B:71:0x0192, B:73:0x0197, B:49:0x012f, B:51:0x0135, B:75:0x01a7, B:77:0x01ad, B:99:0x0200), top: B:103:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0197 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002a, B:80:0x01b6, B:82:0x01bc, B:92:0x01df, B:94:0x01ec, B:97:0x01fb, B:96:0x01f4, B:85:0x01c3, B:86:0x01c7, B:88:0x01cd, B:90:0x01d9, B:19:0x0042, B:55:0x0145, B:56:0x014b, B:58:0x0151, B:62:0x0160, B:64:0x0164, B:66:0x016c, B:67:0x0173, B:68:0x017c, B:70:0x0182, B:71:0x0192, B:73:0x0197, B:49:0x012f, B:51:0x0135, B:75:0x01a7, B:77:0x01ad, B:99:0x0200), top: B:103:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b3, code lost:
    
        if (r14 == r1) goto L79;
     */
    @Override // com.chartboost.sdk.impl.te
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(android.content.Context r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.pc.a(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void b(boolean z2) {
        f2 f2Var;
        this.k = z2;
        if (!z2) {
            if (this.f14832l || (f2Var = this.f14831i) == null) {
                return;
            }
            f2Var.a(this.j);
            return;
        }
        if (this.f14832l) {
            f2 f2Var2 = this.f14831i;
            if (f2Var2 != null) {
                f2Var2.j();
                return;
            }
            return;
        }
        this.j = 1.0f;
        f2 f2Var3 = this.f14831i;
        if (f2Var3 != null) {
            f2Var3.a(0.2f);
        }
    }

    public void c(boolean z2) {
        f2 f2Var = this.f14831i;
        if (f2Var != null) {
            f2Var.b(z2);
        }
    }

    @Override // com.chartboost.sdk.impl.xe
    public void f() {
        xe xeVarI = i();
        if (xeVarI != null) {
            xeVarI.f();
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public long g() {
        f2 f2Var = this.f14831i;
        if (f2Var != null) {
            return f2Var.g();
        }
        return 0L;
    }

    @Override // com.chartboost.sdk.impl.te
    public boolean h() {
        f2 f2Var = this.f14831i;
        return (f2Var != null && f2Var.h()) || this.f14830h < this.d.size() - 1;
    }

    @Override // com.chartboost.sdk.impl.te
    public float j() {
        this.f14832l = true;
        f2 f2Var = this.f14831i;
        if (f2Var != null) {
            this.j = this.k ? 0.2f : this.j;
            f2Var.j();
        }
        return this.j;
    }

    @Override // com.chartboost.sdk.impl.te
    public View k() {
        f2 f2Var = this.f14831i;
        if (f2Var != null && f2Var.h()) {
            f2 f2Var2 = this.f14831i;
            if (f2Var2 != null) {
                return f2Var2.k();
            }
            return null;
        }
        int i2 = this.f14830h + 1;
        this.f14830h = i2;
        if (i2 >= this.d.size()) {
            return null;
        }
        f2 f2Var3 = (f2) this.d.get(this.f14830h);
        f2Var3.a(this);
        this.f14831i = f2Var3;
        return f2Var3.k();
    }

    @Override // com.chartboost.sdk.impl.te
    public void l() {
        f2 f2Var = this.f14831i;
        if (f2Var != null) {
            f2Var.l();
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public void m() {
        f2 f2Var = this.f14831i;
        if (f2Var != null) {
            f2Var.m();
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public void n() {
        f2 f2Var = this.f14831i;
        if (f2Var != null) {
            f2Var.n();
            if (this.f14832l) {
                f2Var.j();
            } else {
                f2Var.a(p());
            }
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public void o() {
        f2 f2Var = this.f14831i;
        if (f2Var != null) {
            f2Var.o();
        }
    }

    public final float p() {
        if (this.k) {
            return 0.2f;
        }
        float f = this.j;
        if (f > 0.0f) {
            return f;
        }
        return 1.0f;
    }

    public final w q() {
        return this.f14829e;
    }

    public final long r() {
        f2 f2Var = this.f14831i;
        if (f2Var != null) {
            return f2Var.s();
        }
        return 0L;
    }

    public final long s() {
        f2 f2Var = this.f14831i;
        if (f2Var != null) {
            return f2Var.t();
        }
        return 0L;
    }

    public final f2 t() {
        return this.f14831i;
    }

    public final int u() {
        return this.f14830h;
    }

    public final List v() {
        return this.d;
    }

    public final boolean w() {
        return this.f14832l;
    }

    public void x() {
        f2 f2Var = this.f14831i;
        if (f2Var != null) {
            f2Var.x();
        }
    }

    @Override // com.chartboost.sdk.impl.xe
    public void b(Throwable error) {
        Intrinsics.f(error, "error");
        xe xeVarI = i();
        if (xeVarI != null) {
            xeVarI.b(error);
        }
    }

    @Override // com.chartboost.sdk.impl.xe
    public void a() {
        xe xeVarI = i();
        if (xeVarI != null) {
            xeVarI.a();
        }
    }

    @Override // com.chartboost.sdk.impl.xe
    public void a(rd request) {
        Intrinsics.f(request, "request");
        xe xeVarI = i();
        if (xeVarI != null) {
            xeVarI.a(request);
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public void a(fg reason) {
        Intrinsics.f(reason, "reason");
        for (Deferred deferred : this.g) {
            if (deferred.isActive()) {
                deferred.a(ExceptionsKt.a("MultiRenderable stopped.", null));
            }
        }
        f2 f2Var = this.f14831i;
        if (f2Var != null) {
            f2Var.a(reason);
        }
        f2 f2Var2 = this.f14831i;
        if (f2Var2 != null) {
            f2Var2.a((xe) null);
        }
        this.f14831i = null;
        this.f14830h = -1;
    }

    @Override // com.chartboost.sdk.impl.te
    public void a(boolean z2) {
        f2 f2Var = this.f14831i;
        if (f2Var != null) {
            f2Var.a(z2);
            return;
        }
        xe xeVarI = i();
        if (xeVarI != null) {
            xeVarI.f();
        }
    }

    public void a(q6 type) {
        Intrinsics.f(type, "type");
        f2 f2Var = this.f14831i;
        if (f2Var != null) {
            f2Var.a(type);
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public void a(float f) {
        this.f14832l = false;
        f2 f2Var = this.f14831i;
        if (f2Var != null) {
            f2Var.a(p());
        }
    }
}
