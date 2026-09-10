package com.chartboost.sdk.impl;

import com.thinkup.core.common.n.mo;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class l5 implements m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f14396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f14397b;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.l5$a$a, reason: collision with other inner class name */
        public static final class C0168a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f14399b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f14400c;
            public final /* synthetic */ MutableSharedFlow d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ l5 f14401e;

            /* JADX INFO: renamed from: com.chartboost.sdk.impl.l5$a$a$a, reason: collision with other inner class name */
            public static final class C0169a extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f14402b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f14403c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0169a(String str, Continuation continuation) {
                    super(2, continuation);
                    this.f14403c = str;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
                    return ((C0169a) create(flowCollector, continuation)).invokeSuspend(Unit.f43263a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0169a(this.f14403c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                    if (this.f14402b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    za.d("Subscription count flow active for " + this.f14403c, null, 2, null);
                    return Unit.f43263a;
                }
            }

            /* JADX INFO: renamed from: com.chartboost.sdk.impl.l5$a$a$b */
            public static final class b extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f14404b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ int f14405c;

                public b(Continuation continuation) {
                    super(2, continuation);
                }

                public final Object a(int i2, Continuation continuation) {
                    return ((b) create(Integer.valueOf(i2), continuation)).invokeSuspend(Unit.f43263a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    b bVar = new b(continuation);
                    bVar.f14405c = ((Number) obj).intValue();
                    return bVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return a(((Number) obj).intValue(), (Continuation) obj2);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                    if (this.f14404b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return Boolean.valueOf(this.f14405c == 0);
                }
            }

            /* JADX INFO: renamed from: com.chartboost.sdk.impl.l5$a$a$c */
            public static final class c extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f14406b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ int f14407c;

                public c(Continuation continuation) {
                    super(2, continuation);
                }

                public final Object a(int i2, Continuation continuation) {
                    return ((c) create(Integer.valueOf(i2), continuation)).invokeSuspend(Unit.f43263a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    c cVar = new c(continuation);
                    cVar.f14407c = ((Number) obj).intValue();
                    return cVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return a(((Number) obj).intValue(), (Continuation) obj2);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                    if (this.f14406b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return Boolean.valueOf(this.f14407c == 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0168a(String str, MutableSharedFlow mutableSharedFlow, l5 l5Var, Continuation continuation) {
                super(2, continuation);
                this.f14400c = str;
                this.d = mutableSharedFlow;
                this.f14401e = l5Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0168a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0168a(this.f14400c, this.d, this.f14401e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i2 = this.f14399b;
                try {
                    if (i2 == 0) {
                        ResultKt.b(obj);
                        za.d("Starting subscription count monitor for " + this.f14400c, null, 2, null);
                        FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1(new b(null), FlowKt.q(this.d.d(), new C0169a(this.f14400c, null)));
                        c cVar = new c(null);
                        this.f14399b = 1;
                        if (FlowKt.m(flowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1, cVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    }
                    za.d("Subscription count for " + this.f14400c + " reached zero. Attempting cleanup.", null, 2, null);
                    if (((MutableSharedFlow) this.f14401e.f14397b.get(this.f14400c)) != this.d) {
                        za.d("Flow for " + this.f14400c + " was already removed or replaced before cleanup could execute.", null, 2, null);
                    } else if (this.f14401e.f14397b.remove(this.f14400c, this.d)) {
                        za.d("Successfully removed inactive SharedFlow for " + this.f14400c + mo.ono, null, 2, null);
                    } else {
                        za.e("Failed to remove flow for " + this.f14400c + " during cleanup, likely already removed concurrently.", null, 2, null);
                    }
                    za.d("Subscription count monitor finished for " + this.f14400c, null, 2, null);
                } catch (CancellationException unused) {
                    za.d("Cleanup job for " + this.f14400c + " was cancelled.", null, 2, null);
                } catch (Exception e2) {
                    za.b("Error during cache notifier cleanup monitor for " + this.f14400c, e2);
                } finally {
                    za.d("Subscription count monitor finished for " + this.f14400c, null, 2, null);
                }
                return Unit.f43263a;
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableSharedFlow invoke(String flowKey) {
            Intrinsics.f(flowKey, "flowKey");
            za.d("Creating new SharedFlow for cache events: ".concat(flowKey), null, 2, null);
            SharedFlowImpl sharedFlowImplA = SharedFlowKt.a(0, 64, BufferOverflow.f44779Y);
            BuildersKt.c(l5.this.f14396a, null, null, new C0168a(flowKey, sharedFlowImplA, l5.this, null), 3);
            return sharedFlowImplA;
        }
    }

    public l5(CoroutineScope scope) {
        Intrinsics.f(scope, "scope");
        this.f14396a = scope;
        this.f14397b = new ConcurrentHashMap();
    }

    @Override // com.chartboost.sdk.impl.m3
    public Object a(URL url, s7 s7Var, Continuation continuation) {
        Unit unit;
        String string = url.toString();
        Intrinsics.e(string, "toString(...)");
        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.f14397b.get(string);
        Unit unit2 = Unit.f43263a;
        if (mutableSharedFlow != null) {
            if (mutableSharedFlow.a(new k3.a(s7Var, url))) {
                za.d(android.support.v4.media.a.n("Notified eviction for ", string, mo.ono), null, 2, null);
            } else {
                za.e("Failed to emit eviction event for " + string + " (buffer full). Current subs: " + mutableSharedFlow.d().getValue(), null, 2, null);
            }
            unit = unit2;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.d(android.support.v4.media.a.n("Attempted to notify eviction for ", string, ", but no active observers found."), null, 2, null);
        }
        return unit2;
    }

    @Override // com.chartboost.sdk.impl.m3
    public Flow a(URL url) {
        Intrinsics.f(url, "url");
        String string = url.toString();
        Intrinsics.e(string, "toString(...)");
        Object objComputeIfAbsent = this.f14397b.computeIfAbsent(string, new com.google.android.material.color.utilities.a(new a(), 17));
        Intrinsics.e(objComputeIfAbsent, "computeIfAbsent(...)");
        return FlowKt.a((MutableSharedFlow) objComputeIfAbsent);
    }

    public static final MutableSharedFlow a(Function1 tmp0, Object obj) {
        Intrinsics.f(tmp0, "$tmp0");
        return (MutableSharedFlow) tmp0.invoke(obj);
    }
}
