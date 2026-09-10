package com.unity3d.services.core.domain.task;

import ak.f;
import bk.a;
import ck.c;
import ck.e;
import com.unity3d.services.core.domain.task.BaseParams;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import wj.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
@e(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", l = {11}, m = "invoke-gIAlu-s")
public final class BaseTask$invoke$1<P extends BaseParams, R> extends c {
    int label;
    /* synthetic */ Object result;

    public BaseTask$invoke$1(f fVar) {
        super(fVar);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3240invokegIAlus = BaseTask.DefaultImpls.m3240invokegIAlus(null, null, this);
        return objM3240invokegIAlus == a.f5708a ? objM3240invokegIAlus : new h(objM3240invokegIAlus);
    }
}
