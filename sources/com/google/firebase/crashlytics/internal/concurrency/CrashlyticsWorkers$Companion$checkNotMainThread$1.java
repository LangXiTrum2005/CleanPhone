package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class CrashlyticsWorkers$Companion$checkNotMainThread$1 extends FunctionReferenceImpl implements Function0<Boolean> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((CrashlyticsWorkers.Companion) this.receiver).getClass();
        return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
    }
}
