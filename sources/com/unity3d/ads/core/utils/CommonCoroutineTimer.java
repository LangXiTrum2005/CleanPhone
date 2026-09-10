package com.unity3d.ads.core.utils;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.f1;
import cn.s;
import cn.w;
import cn.z1;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.a;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/utils/CommonCoroutineTimer;", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "Lcn/w;", "dispatcher", "<init>", "(Lcn/w;)V", "", "delayStartMillis", "repeatMillis", "Lkotlin/Function0;", "Lwj/r;", "action", "Lcn/f1;", "start", "(JJLjk/a;)Lcn/f1;", "Lcn/w;", "Lcn/s;", "job", "Lcn/s;", "Lcn/a0;", "scope", "Lcn/a0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonCoroutineTimer implements CoroutineTimer {
    private final w dispatcher;
    private final s job;
    private final a0 scope;

    /* JADX INFO: renamed from: com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", l = {21, 24}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ a $action;
        final /* synthetic */ long $delayStartMillis;
        final /* synthetic */ long $repeatMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j10, a aVar, long j11, f fVar) {
            super(2, fVar);
            this.$delayStartMillis = j10;
            this.$action = aVar;
            this.$repeatMillis = j11;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delayStartMillis, this.$action, this.$repeatMillis, fVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            a0 a0Var;
            int i10 = this.label;
            bk.a aVar = bk.a.f5708a;
            if (i10 == 0) {
                t9.e.z(obj);
                a0Var = (a0) this.L$0;
                long j10 = this.$delayStartMillis;
                this.L$0 = a0Var;
                this.label = 1;
                if (d0.l(j10, this) != aVar) {
                }
                return aVar;
            }
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = (a0) this.L$0;
            t9.e.z(obj);
            while (d0.v(a0Var)) {
                this.$action.invoke();
                long j11 = this.$repeatMillis;
                this.L$0 = a0Var;
                this.label = 2;
                if (d0.l(j11, this) == aVar) {
                    return aVar;
                }
            }
            return r.f53297a;
        }
    }

    public CommonCoroutineTimer(w dispatcher) {
        n.f(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        z1 z1VarE = d0.e();
        this.job = z1VarE;
        this.scope = d0.b(dispatcher.plus(z1VarE));
    }

    @Override // com.unity3d.ads.core.utils.CoroutineTimer
    public f1 start(long delayStartMillis, long repeatMillis, a action) {
        n.f(action, "action");
        return d0.w(this.scope, this.dispatcher, new AnonymousClass1(delayStartMillis, action, repeatMillis, null), 2);
    }
}
