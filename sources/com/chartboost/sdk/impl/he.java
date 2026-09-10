package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd f14108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f14109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14110c;
    public final CoroutineScope d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Job f14111e;
    public final Set f;

    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14113c;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = he.this.new a(continuation);
            aVar.f14113c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f14112b;
            if (i2 == 0) {
                ResultKt.b(obj);
                coroutineScope = (CoroutineScope) this.f14113c;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f14113c;
                ResultKt.b(obj);
            }
            while (CoroutineScopeKt.e(coroutineScope)) {
                long jB = he.this.f14108a.b();
                long jA = he.this.f14108a.a();
                if (jA < 1) {
                    jA = 1;
                }
                double d = jB / jA;
                List list = he.this.f14109b;
                he heVar = he.this;
                ArrayList<ge> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!heVar.f.contains((ge) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                he heVar2 = he.this;
                for (ge geVar : arrayList) {
                    ie ieVarB = geVar.b();
                    if (!(ieVarB instanceof ie.a)) {
                        if (!(ieVarB instanceof ie.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (jB >= ((ie.b) ieVarB).a()) {
                            heVar2.f.add(geVar);
                            geVar.a().invoke();
                        }
                    } else if (d >= ((ie.a) ieVarB).a()) {
                        heVar2.f.add(geVar);
                        geVar.a().invoke();
                    }
                }
                long j = he.this.f14110c;
                this.f14113c = coroutineScope;
                this.f14112b = 1;
                if (DelayKt.a(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f43263a;
        }
    }

    public he(vd provider, List events, long j, CoroutineScope coroutineScope) {
        Intrinsics.f(provider, "provider");
        Intrinsics.f(events, "events");
        this.f14108a = provider;
        this.f14109b = events;
        this.f14110c = j;
        if (coroutineScope == null) {
            Job jobB = SupervisorKt.b();
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineScope = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.d((JobSupport) jobB, MainDispatcherLoader.f45042a));
        }
        this.d = coroutineScope;
        this.f = new LinkedHashSet();
    }

    public final void a() {
        Job job = this.f14111e;
        if (job == null || !job.isActive()) {
            this.f14111e = BuildersKt.c(this.d, null, null, new a(null), 3);
        }
    }

    public final void b() {
        Job job = this.f14111e;
        if (job != null) {
            job.a(null);
        }
        this.f14111e = null;
        this.f.clear();
    }
}
