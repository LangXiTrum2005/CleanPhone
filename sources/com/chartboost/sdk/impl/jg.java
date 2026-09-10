package com.chartboost.sdk.impl;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes3.dex */
public final class jg implements yc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kg f14270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yc f14271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f14272c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14273e;
    public final ConcurrentLinkedQueue f;
    public final ConcurrentHashMap.KeySetView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Mutex f14274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Job f14275i;
    public final CoroutineScope j;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14277c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14278e;
        public int f;
        public /* synthetic */ Object g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f14280i;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.f14280i |= Integer.MIN_VALUE;
            return jg.this.a((v6) null, this);
        }
    }

    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14282c;
        public /* synthetic */ Object d;
        public int f;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return jg.this.a(this);
        }
    }

    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14285c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f14286e;
        public Object f;
        public /* synthetic */ Object g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f14288i;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.f14288i |= Integer.MIN_VALUE;
            return jg.this.a((List) null, (ig) null, this);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14290c;

        public static final class a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f14291b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ jg f14292c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jg jgVar, Continuation continuation) {
                super(2, continuation);
                this.f14292c = jgVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f14292c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i2 = this.f14291b;
                if (i2 == 0) {
                    ResultKt.b(obj);
                    jg jgVar = this.f14292c;
                    this.f14291b = 1;
                    if (jgVar.a(this) == coroutineSingletons) {
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
            d dVar = jg.this.new d(continuation);
            dVar.f14290c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f14289b;
            Unit unit = Unit.f43263a;
            try {
                if (i2 == 0) {
                    ResultKt.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f14290c;
                    if (!jg.this.f14274h.tryLock()) {
                        za.a("Already running, skipping new trigger.", (Throwable) null, 2, (Object) null);
                        return unit;
                    }
                    if (!jg.this.f14271b.a()) {
                        za.a("Offline, skipping.", (Throwable) null, 2, (Object) null);
                        za.a("Releasing lock.", (Throwable) null, 2, (Object) null);
                        jg.this.f14274h.b(null);
                        return unit;
                    }
                    za.a("Acquired lock, starting job.", (Throwable) null, 2, (Object) null);
                    jg jgVar = jg.this;
                    jgVar.f14275i = BuildersKt.c(coroutineScope, null, null, new a(jgVar, null), 3);
                    Job job = jg.this.f14275i;
                    if (job != null) {
                        this.f14289b = 1;
                        if (job.n(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                za.a("Job finished.", (Throwable) null, 2, (Object) null);
                za.a("Releasing lock.", (Throwable) null, 2, (Object) null);
                jg.this.f14274h.b(null);
                return unit;
            } catch (Throwable th) {
                za.a("Releasing lock.", (Throwable) null, 2, (Object) null);
                jg.this.f14274h.b(null);
                throw th;
            }
        }
    }

    public jg(kg networkClient, yc networkStateChecker, CoroutineDispatcher dispatcher, long j, int i2) {
        Intrinsics.f(networkClient, "networkClient");
        Intrinsics.f(networkStateChecker, "networkStateChecker");
        Intrinsics.f(dispatcher, "dispatcher");
        this.f14270a = networkClient;
        this.f14271b = networkStateChecker;
        this.f14272c = dispatcher;
        this.d = j;
        this.f14273e = i2;
        this.f = new ConcurrentLinkedQueue();
        this.g = ConcurrentHashMap.newKeySet();
        this.f14274h = MutexKt.a();
        this.j = CoroutineScopeKt.a(dispatcher.plus(JobKt.a()));
        networkStateChecker.a(this);
    }

    @Override // com.chartboost.sdk.impl.yc.a
    public void b() {
        za.a("Network is lost. Will wait for onNetworkAvailable().", (Throwable) null, 2, (Object) null);
    }

    public final void c() {
        BuildersKt.c(this.j, null, null, new d(null), 3);
    }

    @Override // com.chartboost.sdk.impl.yc.a
    public void a() {
        za.a("Network is available. Attempting to process queue.", (Throwable) null, 2, (Object) null);
        c();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009c  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:33:0x0126  */
    /* JADX WARN: Code duplicated, block: B:35:0x012a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0176  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0128 -> B:38:0x0170). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x016d -> B:38:0x0170). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(com.chartboost.sdk.impl.v6 r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.jg.a(com.chartboost.sdk.impl.v6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jg(kg kgVar, yc ycVar, CoroutineDispatcher coroutineDispatcher, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 4) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher = DefaultIoScheduler.f45062Y;
        }
        this(kgVar, ycVar, coroutineDispatcher, (i3 & 8) != 0 ? 500L : j, (i3 & 16) != 0 ? 3 : i2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:24:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.jg.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0087 -> B:21:0x008a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.List r12, com.chartboost.sdk.impl.ig r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.chartboost.sdk.impl.jg.c
            if (r0 == 0) goto L13
            r0 = r14
            com.chartboost.sdk.impl.jg$c r0 = (com.chartboost.sdk.impl.jg.c) r0
            int r1 = r0.f14288i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14288i = r1
            goto L18
        L13:
            com.chartboost.sdk.impl.jg$c r0 = new com.chartboost.sdk.impl.jg$c
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.g
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r2 = r0.f14288i
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r12 = r0.f
            com.chartboost.sdk.impl.wg r12 = (com.chartboost.sdk.impl.wg) r12
            java.lang.Object r13 = r0.f14286e
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r2 = r0.d
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.f14285c
            com.chartboost.sdk.impl.ig r4 = (com.chartboost.sdk.impl.ig) r4
            java.lang.Object r5 = r0.f14284b
            com.chartboost.sdk.impl.jg r5 = (com.chartboost.sdk.impl.jg) r5
            kotlin.ResultKt.b(r14)
            r10 = r0
            r8 = r4
            goto L8a
        L3d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L45:
            kotlin.ResultKt.b(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r12 = r12.iterator()
            r8 = r13
            r2 = r14
            r10 = r0
            r13 = r12
            r12 = r11
        L56:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L97
            java.lang.Object r14 = r13.next()
            com.chartboost.sdk.impl.wg r14 = (com.chartboost.sdk.impl.wg) r14
            com.chartboost.sdk.impl.kg r4 = r12.f14270a
            java.lang.String r5 = r14.d()
            java.lang.String r6 = r14.c()
            java.lang.String r7 = r14.a()
            java.lang.String r9 = r14.b()
            r10.f14284b = r12
            r10.f14285c = r8
            r10.d = r2
            r10.f14286e = r13
            r10.f = r14
            r10.f14288i = r3
            java.lang.Object r0 = r4.a(r5, r6, r7, r8, r9, r10)
            if (r0 != r1) goto L87
            return r1
        L87:
            r5 = r12
            r12 = r14
            r14 = r0
        L8a:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L95
            r2.add(r12)
        L95:
            r12 = r5
            goto L56
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.jg.a(java.util.List, com.chartboost.sdk.impl.ig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a(ig eventData, List trackers) {
        Intrinsics.f(eventData, "eventData");
        Intrinsics.f(trackers, "trackers");
        za.a(android.support.v4.media.a.i(trackers.size(), " trackers.", androidx.datastore.preferences.protobuf.a.q("Received eventId=", eventData.a(), " (type=", eventData.getClass().getSimpleName(), ") with ")), (Throwable) null, 2, (Object) null);
        if (trackers.isEmpty()) {
            za.a(android.support.v4.media.a.n("No trackers configured for eventId=", eventData.a(), "; skipping."), (Throwable) null, 2, (Object) null);
            return;
        }
        synchronized (this) {
            try {
                if (this.g.add(eventData.a())) {
                    this.f.offer(new v6(eventData, trackers));
                    za.a("Enqueued eventId=" + eventData.a() + ", queue size=" + this.f.size(), (Throwable) null, 2, (Object) null);
                    c();
                } else {
                    za.a("EventId=" + eventData.a() + " has already been submitted; skipping duplicate.", (Throwable) null, 2, (Object) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
