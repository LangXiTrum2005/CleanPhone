package com.unity3d.ads.core.data.repository;

import ck.c;
import cn.d0;
import cn.w;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.LifecycleEvent;
import com.unity3d.ads.core.log.Logger;
import fn.e;
import fn.f;
import fn.g;
import fn.r0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/repository/FocusRepository;", "", "Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "getLifecycleFlow", "Lcn/w;", "defaultDispatcher", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;Lcn/w;Lcom/unity3d/ads/core/log/Logger;)V", "Lcom/unity3d/ads/core/log/Logger;", "Lfn/r0;", "Lcom/unity3d/ads/core/data/repository/FocusState;", "focusState", "Lfn/r0;", "getFocusState", "()Lfn/r0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class FocusRepository {
    private final r0 focusState;
    private final Logger logger;

    public FocusRepository(AndroidGetLifecycleFlow getLifecycleFlow, w defaultDispatcher, Logger logger) {
        r0 r0VarA;
        n.f(getLifecycleFlow, "getLifecycleFlow");
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(logger, "logger");
        this.logger = logger;
        try {
            final e eVarInvoke = getLifecycleFlow.invoke();
            final e eVar = new e() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                public static final class AnonymousClass2<T> implements f {
                    final /* synthetic */ f $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                    @ck.e(c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2", f = "FocusRepository.kt", l = {223}, m = "emit")
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
                    public static final class AnonymousClass1 extends c {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(ak.f fVar) {
                            super(fVar);
                        }

                        @Override // ck.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(f fVar) {
                        this.$this_unsafeFlow = fVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // fn.f
                    public final Object emit(Object obj, ak.f fVar) {
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
                            f fVar2 = this.$this_unsafeFlow;
                            LifecycleEvent lifecycleEvent = (LifecycleEvent) obj;
                            if ((lifecycleEvent instanceof LifecycleEvent.Paused) || (lifecycleEvent instanceof LifecycleEvent.Resumed)) {
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
                public Object collect(f fVar, ak.f fVar2) {
                    Object objCollect = eVarInvoke.collect(new AnonymousClass2(fVar), fVar2);
                    return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
                }
            };
            r0VarA = g.p(new e() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                public static final class AnonymousClass2<T> implements f {
                    final /* synthetic */ f $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                    @ck.e(c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2", f = "FocusRepository.kt", l = {223}, m = "emit")
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
                    public static final class AnonymousClass1 extends c {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(ak.f fVar) {
                            super(fVar);
                        }

                        @Override // ck.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(f fVar) {
                        this.$this_unsafeFlow = fVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // fn.f
                    public final Object emit(Object obj, ak.f fVar) {
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
                            f fVar2 = this.$this_unsafeFlow;
                            LifecycleEvent lifecycleEvent = (LifecycleEvent) obj;
                            Object focused = lifecycleEvent instanceof LifecycleEvent.Resumed ? new FocusState.Focused(lifecycleEvent.getActivity()) : new FocusState.Unfocused(lifecycleEvent.getActivity());
                            anonymousClass1.label = 1;
                            Object objEmit = fVar2.emit(focused, anonymousClass1);
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
                public Object collect(f fVar, ak.f fVar2) {
                    Object objCollect = eVar.collect(new AnonymousClass2(fVar), fVar2);
                    return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
                }
            }, d0.b(defaultDispatcher), 1);
        } catch (Exception e10) {
            this.logger.error("Could not subscribe to lifecycle flow", e10);
            r0VarA = g.a((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, en.a.f40122a);
        }
        this.focusState = r0VarA;
    }

    public final r0 getFocusState() {
        return this.focusState;
    }
}
