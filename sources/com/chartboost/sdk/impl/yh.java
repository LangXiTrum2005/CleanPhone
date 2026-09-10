package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class yh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yh f15659a = new yh();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static z2 f15660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static rj f15661c;
    public static final CoroutineScope d;

    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ki f15663c;
        public final /* synthetic */ dh d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f15664e;
        public final /* synthetic */ id f;
        public final /* synthetic */ p2 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ki kiVar, dh dhVar, Context context, id idVar, p2 p2Var, Continuation continuation) {
            super(2, continuation);
            this.f15663c = kiVar;
            this.d = dhVar;
            this.f15664e = context;
            this.f = idVar;
            this.g = p2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f15663c, this.d, this.f15664e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f15662b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            try {
                ki kiVar = this.f15663c;
                rj rjVar = yh.f15661c;
                dh dhVar = this.d;
                Context applicationContext = this.f15664e.getApplicationContext();
                Intrinsics.e(applicationContext, "getApplicationContext(...)");
                kiVar.a(rjVar, dhVar, applicationContext, this.f, this.g);
            } catch (Exception e2) {
                za.b("Error tracking VAST event " + this.f15663c.a() + ": " + e2.getMessage(), e2);
            }
            return Unit.f43263a;
        }
    }

    static {
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        d = CoroutineScopeKt.a(DefaultIoScheduler.f45062Y);
    }

    public final void a(z2 service) {
        Intrinsics.f(service, "service");
        f15660b = service;
    }

    public final z2 b() {
        return f15660b;
    }

    public final void a(rj rjVar) {
        f15661c = rjVar;
    }

    public final void a(ki eventType, dh dhVar, Context androidContext, id omManager, p2 identity) {
        Intrinsics.f(eventType, "eventType");
        Intrinsics.f(androidContext, "androidContext");
        Intrinsics.f(omManager, "omManager");
        Intrinsics.f(identity, "identity");
        BuildersKt.c(d, null, null, new a(eventType, dhVar, androidContext, omManager, identity, null), 3);
    }
}
