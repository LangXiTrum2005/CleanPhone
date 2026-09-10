package com.unity3d.ads.core.domain;

import cn.a0;
import cn.d0;
import cn.f1;
import cn.w;
import cn.x;
import cn.y;
import cn.y1;
import com.google.android.gms.internal.auth.i;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;", "", "Lcn/w;", "defaultDispatcher", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcn/w;Lcom/unity3d/ads/core/log/Logger;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lwj/r;", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;)V", "Lcom/unity3d/ads/core/log/Logger;", "Lcn/y;", "coroutineExceptionHandler", "Lcn/y;", "Lcn/a0;", "coroutineScope", "Lcn/a0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CleanUpWhenOpportunityExpires {
    private final y coroutineExceptionHandler;
    private final a0 coroutineScope;
    private final Logger logger;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lwj/r;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends o implements b {
        final /* synthetic */ f1 $job;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(f1 f1Var) {
            super(1);
            this.$job = f1Var;
        }

        @Override // jk.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return r.f53297a;
        }

        public final void invoke(Throwable th2) {
            this.$job.a(null);
        }
    }

    public CleanUpWhenOpportunityExpires(w defaultDispatcher, Logger logger) {
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(logger, "logger");
        this.logger = logger;
        CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 = new CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(x.f6783a, this);
        this.coroutineExceptionHandler = cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1;
        this.coroutineScope = d0.b(i.D(d0.e(), defaultDispatcher).plus(cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1));
    }

    public final void invoke(AdObject adObject) {
        a0 adScope;
        n.f(adObject, "adObject");
        if (adObject.getAdScope() == null) {
            throw new IllegalArgumentException("AdObject does not have an adScope.");
        }
        y1 y1VarW = d0.w(this.coroutineScope, null, new CleanUpWhenOpportunityExpires$invoke$job$1(adObject, null), 3);
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (adScope = adPlayer.getScope()) == null) {
            adScope = adObject.getAdScope();
        }
        d0.r(adScope.getCoroutineContext()).n(new AnonymousClass2(y1VarW));
    }
}
