package com.chartboost.sdk.impl;

import android.os.SystemClock;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class pg {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f14847l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14850c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14851e;
    public rg g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Function0 f14852h;
    public b f = b.NOT_STARTED;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public sg f14853i = sg.ARC;
    public String j = "Reward in %d seconds";
    public final CompletableJob k = SupervisorKt.b();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum b {
        STARTED,
        PAUSED,
        STOPPED,
        COMPLETED,
        NOT_STARTED;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f14857h = EnumEntriesKt.a(a());
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14858a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14858a = iArr;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14859b;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return pg.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f14859b;
            if (i2 != 0 && i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            while (pg.this.d() == b.STARTED) {
                long jUptimeMillis = (SystemClock.uptimeMillis() - pg.this.f14850c) - pg.this.d;
                pg pgVar = pg.this;
                long j = pgVar.f14848a - jUptimeMillis;
                if (j < 0) {
                    j = 0;
                }
                pgVar.f14849b = j;
                rg rgVarC = pg.this.c();
                if (rgVarC != null) {
                    rgVarC.a(pg.this.f14849b, pg.this.f14848a);
                }
                if (pg.this.f14849b == 0) {
                    pg.this.f = b.COMPLETED;
                    Function0 function0B = pg.this.b();
                    if (function0B == null) {
                        break;
                    }
                    function0B.invoke();
                    break;
                }
                this.f14859b = 1;
                if (DelayKt.a(16L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f43263a;
        }
    }

    public pg(long j, Function0 function0) {
        this.f14848a = j;
        this.f14849b = j;
        a(function0);
    }

    public final void e() {
        if (this.f == b.STARTED) {
            this.f = b.PAUSED;
            this.f14851e = SystemClock.uptimeMillis();
        }
    }

    public final void f() {
        this.f = b.NOT_STARTED;
        long j = this.f14848a;
        this.f14849b = j;
        this.f14850c = 0L;
        this.d = 0L;
        this.f14851e = 0L;
        rg rgVar = this.g;
        if (rgVar != null) {
            rgVar.a(j, j);
        }
    }

    public final void g() {
        b bVar = this.f;
        b bVar2 = b.STARTED;
        if (bVar == bVar2 || bVar == b.COMPLETED) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i2 = c.f14858a[this.f.ordinal()];
        if (i2 == 1) {
            this.f14850c = jUptimeMillis;
            this.d = 0L;
        } else if (i2 == 2) {
            this.d = (jUptimeMillis - this.f14851e) + this.d;
        } else {
            if (i2 != 3) {
                return;
            }
            this.f14850c = jUptimeMillis;
            this.d = 0L;
        }
        this.f = bVar2;
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a.plus(this.k)), null, null, new d(null), 3);
    }

    public final Function0 b() {
        return this.f14852h;
    }

    public final rg c() {
        return this.g;
    }

    public final b d() {
        return this.f;
    }

    public final void a() {
        a((rg) null);
        Iterator f44671a = this.k.m().getF44671a();
        while (f44671a.hasNext()) {
            ((Job) f44671a.next()).a(null);
        }
    }

    public final void a(sg mode, String str, String str2) {
        Intrinsics.f(mode, "mode");
        this.f14853i = mode;
        if (str != null) {
            this.j = str;
        }
        rg rgVar = this.g;
        if (rgVar != null) {
            rgVar.a(mode, str, str2);
        }
    }

    public final void a(Function0 function0) {
        this.f14852h = function0;
    }

    public final void a(rg rgVar) {
        this.g = rgVar;
        if (rgVar != null) {
            rgVar.a(this.f14849b, this.f14848a);
        }
    }
}
