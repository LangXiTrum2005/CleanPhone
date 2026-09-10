package com.google.firebase.sessions;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: SessionDatastore.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/wireman;", "Landroidx/datastore/preferences/core/dern;", "", "exception", "", "<anonymous>", "(Lkotlinx/coroutines/flow/wireman;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
@igo.wireman(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", l = {82}, m = "invokeSuspend")
public final class SessionDatastoreImpl$firebaseSessionDataFlow$1 extends SuspendLambda implements tetrahedral.triweekly<kotlinx.coroutines.flow.wireman<? super androidx.datastore.preferences.core.dern>, Throwable, wretchedly.dern<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SessionDatastoreImpl$firebaseSessionDataFlow$1(wretchedly.dern<? super SessionDatastoreImpl$firebaseSessionDataFlow$1> dernVar) {
        super(3, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            kotlinx.coroutines.flow.wireman wiremanVar = (kotlinx.coroutines.flow.wireman) this.L$0;
            androidx.datastore.preferences.core.dern dernVarAttabal = androidx.datastore.preferences.core.wireman.attabal();
            this.L$0 = null;
            this.label = 1;
            if (wiremanVar.emit(dernVarAttabal, this) == objBeachfront) {
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

    @Override // tetrahedral.triweekly
    public final Object invoke(kotlinx.coroutines.flow.wireman<? super androidx.datastore.preferences.core.dern> wiremanVar, Throwable th, wretchedly.dern<? super Unit> dernVar) {
        SessionDatastoreImpl$firebaseSessionDataFlow$1 sessionDatastoreImpl$firebaseSessionDataFlow$1 = new SessionDatastoreImpl$firebaseSessionDataFlow$1(dernVar);
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$0 = wiremanVar;
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$1 = th;
        return sessionDatastoreImpl$firebaseSessionDataFlow$1.invokeSuspend(Unit.f29295attabal);
    }
}
