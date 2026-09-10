package com.google.firebase.sessions.settings;

import android.util.Log;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "msg", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
final class RemoteSettings$updateSettings$2$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object X;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(2, continuation);
        remoteSettings$updateSettings$2$2.X = obj;
        return remoteSettings$updateSettings$2$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = (RemoteSettings$updateSettings$2$2) create((String) obj, (Continuation) obj2);
        Unit unit = Unit.f43263a;
        remoteSettings$updateSettings$2$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.X));
        return Unit.f43263a;
    }
}
