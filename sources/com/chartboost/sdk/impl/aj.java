package com.chartboost.sdk.impl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class aj implements zi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f13469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zi.b f13470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f13471c;
    public Job d;

    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f13473c;
        public final /* synthetic */ aj d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, aj ajVar, Continuation continuation) {
            super(2, continuation);
            this.f13473c = j;
            this.d = ajVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f13473c, this.d, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:12:0x0023). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
                int r1 = r5.f13472b
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                kotlin.ResultKt.b(r6)
                goto L23
            Ld:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L15:
                kotlin.ResultKt.b(r6)
            L18:
                long r3 = r5.f13473c
                r5.f13472b = r2
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.a(r3, r5)
                if (r6 != r0) goto L23
                return r0
            L23:
                com.chartboost.sdk.impl.aj r6 = r5.d
                com.chartboost.sdk.impl.c1 r6 = com.chartboost.sdk.impl.aj.a(r6)
                if (r6 == 0) goto L18
                com.chartboost.sdk.impl.aj r1 = r5.d
                com.chartboost.sdk.impl.zi$b r1 = com.chartboost.sdk.impl.aj.b(r1)
                long r3 = r1.a()
                r6.a(r3)
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.aj.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public aj(c1 c1Var, zi.b videoProgress, CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.f(videoProgress, "videoProgress");
        Intrinsics.f(coroutineDispatcher, "coroutineDispatcher");
        this.f13469a = c1Var;
        this.f13470b = videoProgress;
        this.f13471c = coroutineDispatcher;
    }

    @Override // com.chartboost.sdk.impl.zi
    public void a(long j) {
        za.a("startProgressUpdate()", (Throwable) null, 2, (Object) null);
        if (this.d != null) {
            return;
        }
        this.d = BuildersKt.c(CoroutineScopeKt.a(this.f13471c), null, null, new a(j, this, null), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public aj(c1 c1Var, zi.b bVar, CoroutineDispatcher coroutineDispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        c1Var = (i2 & 1) != 0 ? null : c1Var;
        if ((i2 & 4) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher = MainDispatcherLoader.f45042a;
        }
        this(c1Var, bVar, coroutineDispatcher);
    }

    @Override // com.chartboost.sdk.impl.zi
    public void a() {
        za.a("stopProgressUpdate()", (Throwable) null, 2, (Object) null);
        Job job = this.d;
        if (job != null) {
            job.a(null);
        }
        this.d = null;
    }
}
