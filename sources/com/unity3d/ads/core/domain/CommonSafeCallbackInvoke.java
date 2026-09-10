package com.unity3d.ads.core.domain;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.w;
import com.unity3d.services.core.misc.Utilities;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonSafeCallbackInvoke;", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "Lcn/w;", "mainDispatcher", "<init>", "(Lcn/w;)V", "Lkotlin/Function0;", "Lwj/r;", "block", "invoke", "(Ljk/a;)V", "Lcn/w;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonSafeCallbackInvoke implements SafeCallbackInvoke {
    private final w mainDispatcher;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonSafeCallbackInvoke$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.CommonSafeCallbackInvoke$invoke$1", f = "CommonSafeCallbackInvoke.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ jk.a $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(jk.a aVar, f fVar) {
            super(2, fVar);
            this.$block = aVar;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass1(this.$block, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            final jk.a aVar = this.$block;
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.core.domain.a
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.invoke();
                }
            });
            return r.f53297a;
        }
    }

    public CommonSafeCallbackInvoke(w mainDispatcher) {
        n.f(mainDispatcher, "mainDispatcher");
        this.mainDispatcher = mainDispatcher;
    }

    @Override // com.unity3d.ads.core.domain.SafeCallbackInvoke
    public void invoke(jk.a block) {
        n.f(block, "block");
        d0.w(d0.b(this.mainDispatcher), null, new AnonymousClass1(block, null), 3);
    }
}
