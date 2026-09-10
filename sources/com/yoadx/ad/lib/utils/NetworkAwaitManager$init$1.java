package com.yoadx.ad.lib.utils;

import com.blankj.utilcode.util.NetworkUtils;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: NetworkAwaitManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 0, 0})
@igo.wireman(c = "com.yoadx.ad.lib.utils.NetworkAwaitManager$init$1", f = "NetworkAwaitManager.kt", l = {}, m = "invokeSuspend")
public final class NetworkAwaitManager$init$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    int label;

    /* JADX INFO: compiled from: NetworkAwaitManager.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/yoadx/ad/lib/utils/NetworkAwaitManager$init$1$attabal", "Lcom/blankj/utilcode/util/NetworkUtils$attabal;", "", "onDisconnected", "()V", "Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;", "networkType", "attabal", "(Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;)V", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements NetworkUtils.attabal {
        @Override // com.blankj.utilcode.util.NetworkUtils.attabal
        public void attabal(NetworkUtils.NetworkType networkType) {
            NetworkAwaitManager._networkState.setValue(Boolean.TRUE);
        }

        @Override // com.blankj.utilcode.util.NetworkUtils.attabal
        public void onDisconnected() {
            NetworkAwaitManager._networkState.setValue(Boolean.FALSE);
        }
    }

    public NetworkAwaitManager$init$1(wretchedly.dern<? super NetworkAwaitManager$init$1> dernVar) {
        super(2, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new NetworkAwaitManager$init$1(dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p002kotlin.dern.saneness(obj);
        NetworkAwaitManager._networkState.setValue(igo.attabal.attabal(NetworkUtils.dern()));
        NetworkUtils.marial(new attabal());
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((NetworkAwaitManager$init$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
