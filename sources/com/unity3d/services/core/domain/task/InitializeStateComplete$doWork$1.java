package com.unity3d.services.core.domain.task;

import ak.f;
import bk.a;
import ck.c;
import ck.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import wj.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@e(c = "com.unity3d.services.core.domain.task.InitializeStateComplete", f = "InitializeStateComplete.kt", l = {21}, m = "doWork-gIAlu-s")
@Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InitializeStateComplete$doWork$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateComplete this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateComplete$doWork$1(InitializeStateComplete initializeStateComplete, f fVar) {
        super(fVar);
        this.this$0 = initializeStateComplete;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3245doWorkgIAlus = this.this$0.mo3238doWorkgIAlus((InitializeStateComplete.Params) null, (f) this);
        return objM3245doWorkgIAlus == a.f5708a ? objM3245doWorkgIAlus : new h(objM3245doWorkgIAlus);
    }
}
