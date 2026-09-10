package com.google.firebase.crashlytics.internal.concurrency;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class CrashlyticsWorkers$Companion$checkBackgroundThread$1 extends FunctionReferenceImpl implements Function0<Boolean> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((CrashlyticsWorkers.Companion) this.receiver).getClass();
        String strA = CrashlyticsWorkers.Companion.a();
        Intrinsics.e(strA, "<get-threadName>(...)");
        return Boolean.valueOf(StringsKt.l(strA, "Firebase Background Thread #", false));
    }
}
