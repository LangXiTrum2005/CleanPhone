package com.unity3d.ads;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import com.unity3d.ads.core.data.model.AdObjectState;
import fn.n0;
import fn.q;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.RewardedAd$1$1", f = "RewardedAd.kt", l = {45}, m = "invokeSuspend")
public final class RewardedAd$1$1 extends i implements jk.c {
    int label;
    final /* synthetic */ RewardedAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAd$1$1(RewardedAd rewardedAd, f fVar) {
        super(2, fVar);
        this.this$0 = rewardedAd;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new RewardedAd$1$1(this.this$0, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((RewardedAd$1$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 == 0) {
            t9.e.z(obj);
            final n0 state = this.this$0.adObject.getState();
            final AdObjectState adObjectState = AdObjectState.EXPIRED;
            q qVar = new q(new fn.e() { // from class: com.unity3d.ads.RewardedAd$1$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: com.unity3d.ads.RewardedAd$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                public static final class AnonymousClass2<T> implements fn.f {
                    final /* synthetic */ fn.f $this_unsafeFlow;
                    final /* synthetic */ AdObjectState receiver$inlined;

                    /* JADX INFO: renamed from: com.unity3d.ads.RewardedAd$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                    @e(c = "com.unity3d.ads.RewardedAd$1$1$invokeSuspend$$inlined$filter$1$2", f = "RewardedAd.kt", l = {223}, m = "emit")
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

                    public AnonymousClass2(fn.f fVar, AdObjectState adObjectState) {
                        this.$this_unsafeFlow = fVar;
                        this.receiver$inlined = adObjectState;
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
                            if (this.receiver$inlined.equals(obj)) {
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
                    Object objCollect = state.collect(new AnonymousClass2(fVar, adObjectState), fVar2);
                    return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
                }
            }, 1);
            final RewardedAd rewardedAd = this.this$0;
            fn.f fVar = new fn.f() { // from class: com.unity3d.ads.RewardedAd$1$1.2

                /* JADX INFO: renamed from: com.unity3d.ads.RewardedAd$1$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwj/r;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                public static final class AnonymousClass1 extends o implements jk.a {
                    final /* synthetic */ RewardedAd this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(RewardedAd rewardedAd) {
                        super(0);
                        this.this$0 = rewardedAd;
                    }

                    @Override // jk.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3197invoke();
                        return r.f53297a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3197invoke() {
                        AdExpiredListener<RewardedAd> onAdExpired = this.this$0.getOnAdExpired();
                        if (onAdExpired != null) {
                            onAdExpired.onAdExpired(this.this$0);
                        }
                    }
                }

                @Override // fn.f
                public final Object emit(AdObjectState adObjectState2, f fVar2) {
                    rewardedAd.safeCallbackInvoke.invoke(new AnonymousClass1(rewardedAd));
                    return r.f53297a;
                }
            };
            this.label = 1;
            Object objCollect = qVar.collect(fVar, this);
            bk.a aVar = bk.a.f5708a;
            if (objCollect == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
        }
        return r.f53297a;
    }
}
