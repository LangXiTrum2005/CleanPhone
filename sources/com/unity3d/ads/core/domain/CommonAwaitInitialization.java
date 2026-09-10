package com.unity3d.ads.core.domain;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import fn.g;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096Bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonAwaitInitialization;", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "", "timeout", "Lcom/unity3d/ads/core/data/model/InitializationState;", "invoke", "(JLak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonAwaitInitialization implements AwaitInitialization {
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lcom/unity3d/ads/core/data/model/InitializationState;", "<anonymous>", "(Lcn/a0;)Lcom/unity3d/ads/core/data/model/InitializationState;"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2", f = "CommonAwaitInitialization.kt", l = {15}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c {
        int label;

        public AnonymousClass2(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return CommonAwaitInitialization.this.new AnonymousClass2(fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return obj;
            }
            t9.e.z(obj);
            final fn.e observeInitializationState = CommonAwaitInitialization.this.sessionRepository.getObserveInitializationState();
            fn.e eVar = new fn.e() { // from class: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                public static final class AnonymousClass2<T> implements fn.f {
                    final /* synthetic */ fn.f $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                    @e(c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2", f = "CommonAwaitInitialization.kt", l = {223}, m = "emit")
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
                            InitializationState initializationState = (InitializationState) obj;
                            if (initializationState == InitializationState.INITIALIZED || initializationState == InitializationState.FAILED) {
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
                    Object objCollect = observeInitializationState.collect(new AnonymousClass2(fVar), fVar2);
                    return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
                }
            };
            this.label = 1;
            Object objK = g.k(eVar, this);
            bk.a aVar = bk.a.f5708a;
            return objK == aVar ? aVar : objK;
        }
    }

    public CommonAwaitInitialization(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.AwaitInitialization
    public Object invoke(long j10, f fVar) {
        return d0.K(j10, new AnonymousClass2(null), fVar);
    }
}
