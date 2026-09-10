package com.yoadx.ad.lib.admob.format.natived;

import com.yoadx.ad.lib.utils.NetworkAwaitManager;
import igo.wireman;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: compiled from: AdmobNativeImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 0, 0})
@wireman(c = "com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl$produce$2", f = "AdmobNativeImpl.kt", l = {202}, m = "invokeSuspend")
public final class AdmobNativeImpl$produce$2 extends SuspendLambda implements Function2<saran, dern<? super Unit>, Object> {
    int label;

    public AdmobNativeImpl$produce$2(dern<? super AdmobNativeImpl$produce$2> dernVar) {
        super(2, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern<Unit> create(Object obj, dern<?> dernVar) {
        return new AdmobNativeImpl$produce$2(dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            NetworkAwaitManager networkAwaitManager = NetworkAwaitManager.f23890attabal;
            this.label = 1;
            if (networkAwaitManager.saneness(true, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, dern<? super Unit> dernVar) {
        return ((AdmobNativeImpl$produce$2) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
