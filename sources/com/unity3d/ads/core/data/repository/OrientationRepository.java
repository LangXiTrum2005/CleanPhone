package com.unity3d.ads.core.data.repository;

import ak.f;
import android.app.Activity;
import ck.e;
import ck.i;
import cn.d0;
import cn.w;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.LifecycleEvent;
import fn.a1;
import fn.g;
import fn.n0;
import fn.s;
import fn.y0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.v;
import qk.t;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "", "Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "getLifecycleFlow", "Lcn/w;", "defaultDispatcher", "<init>", "(Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;Lcn/w;)V", "Lwj/r;", "invoke", "()V", "Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "Lcn/w;", "Lfn/n0;", "", "isRunning", "Lfn/n0;", "", "_resumedActivityOrientation", "Lfn/y0;", "resumedActivityOrientation", "Lfn/y0;", "getResumedActivityOrientation", "()Lfn/y0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class OrientationRepository {
    private final n0 _resumedActivityOrientation;
    private final w defaultDispatcher;
    private final AndroidGetLifecycleFlow getLifecycleFlow;
    private final n0 isRunning;
    private final y0 resumedActivityOrientation;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activity", "Lwj/r;", "<anonymous>", "(Ljava/lang/ref/WeakReference;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4", f = "OrientationRepository.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends i implements c {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass4(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass4 anonymousClass4 = OrientationRepository.this.new AnonymousClass4(fVar);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            WeakReference weakReference = (WeakReference) this.L$0;
            n0 n0Var = OrientationRepository.this._resumedActivityOrientation;
            Activity activity = (Activity) weakReference.get();
            Integer num = new Integer(activity != null ? activity.getRequestedOrientation() : -1);
            a1 a1Var = (a1) n0Var;
            a1Var.getClass();
            a1Var.e0(null, num);
            return r.f53297a;
        }

        @Override // jk.c
        public final Object invoke(WeakReference<Activity> weakReference, f fVar) {
            return ((AnonymousClass4) create(weakReference, fVar)).invokeSuspend(r.f53297a);
        }
    }

    public OrientationRepository(AndroidGetLifecycleFlow getLifecycleFlow, w defaultDispatcher) {
        n.f(getLifecycleFlow, "getLifecycleFlow");
        n.f(defaultDispatcher, "defaultDispatcher");
        this.getLifecycleFlow = getLifecycleFlow;
        this.defaultDispatcher = defaultDispatcher;
        this.isRunning = g.c(Boolean.FALSE);
        a1 a1VarC = g.c(-1);
        this._resumedActivityOrientation = a1VarC;
        this.resumedActivityOrientation = a1VarC;
    }

    public final y0 getResumedActivityOrientation() {
        return this.resumedActivityOrientation;
    }

    public final void invoke() {
        a1 a1Var;
        Object value;
        Boolean bool;
        n0 n0Var = this.isRunning;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!a1Var.c0(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        final fn.e eVarInvoke = this.getLifecycleFlow.invoke();
        final fn.e eVar = new fn.e() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements fn.f {
                final /* synthetic */ fn.f $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @e(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2", f = "OrientationRepository.kt", l = {224}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
                public static final class AnonymousClass1 extends ck.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(f fVar) {
                        super(fVar);
                    }

                    @Override // ck.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(fn.f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // fn.f
                public final Object emit(Object obj, f fVar) {
                    AnonymousClass1 anonymousClass1;
                    if (fVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) fVar;
                        int i10 = anonymousClass1.label;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(fVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(fVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        t9.e.z(obj2);
                        fn.f fVar2 = this.$this_unsafeFlow;
                        if (obj instanceof LifecycleEvent.Resumed) {
                            anonymousClass1.label = 1;
                            Object objEmit = fVar2.emit(obj, anonymousClass1);
                            bk.a aVar = bk.a.f5708a;
                            if (objEmit == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj2);
                    }
                    return r.f53297a;
                }
            }

            @Override // fn.e
            public Object collect(fn.f fVar, f fVar2) {
                Object objCollect = eVarInvoke.collect(new AnonymousClass2(fVar), fVar2);
                return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
            }
        };
        final AnonymousClass3 anonymousClass3 = new v() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository.invoke.3
            @Override // kotlin.jvm.internal.v, qk.t
            public Object get(Object obj) {
                return ((LifecycleEvent) obj).getActivity();
            }
        };
        g.o(new s(new fn.e() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements fn.f {
                final /* synthetic */ fn.f $this_unsafeFlow;
                final /* synthetic */ t receiver$inlined;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @e(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2", f = "OrientationRepository.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
                public static final class AnonymousClass1 extends ck.c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(f fVar) {
                        super(fVar);
                    }

                    @Override // ck.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(fn.f fVar, t tVar) {
                    this.$this_unsafeFlow = fVar;
                    this.receiver$inlined = tVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // fn.f
                public final Object emit(Object obj, f fVar) {
                    AnonymousClass1 anonymousClass1;
                    if (fVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) fVar;
                        int i10 = anonymousClass1.label;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(fVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(fVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        t9.e.z(obj2);
                        fn.f fVar2 = this.$this_unsafeFlow;
                        Object obj3 = this.receiver$inlined.get((LifecycleEvent) obj);
                        anonymousClass1.label = 1;
                        Object objEmit = fVar2.emit(obj3, anonymousClass1);
                        bk.a aVar = bk.a.f5708a;
                        if (objEmit == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj2);
                    }
                    return r.f53297a;
                }
            }

            @Override // fn.e
            public Object collect(fn.f fVar, f fVar2) {
                Object objCollect = eVar.collect(new AnonymousClass2(fVar, anonymousClass3), fVar2);
                return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
            }
        }, new AnonymousClass4(null), 2), d0.b(this.defaultDispatcher));
    }
}
