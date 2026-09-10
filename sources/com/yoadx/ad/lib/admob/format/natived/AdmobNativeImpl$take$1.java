package com.yoadx.ad.lib.admob.format.natived;

import igo.wireman;
import p002kotlin.Metadata;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import wretchedly.dern;

/* JADX INFO: compiled from: AdmobNativeImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@wireman(c = "com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl", f = "AdmobNativeImpl.kt", l = {62}, m = "take")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class AdmobNativeImpl$take$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdmobNativeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdmobNativeImpl$take$1(AdmobNativeImpl admobNativeImpl, dern<? super AdmobNativeImpl$take$1> dernVar) {
        super(dernVar);
        this.this$0 = admobNativeImpl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.polder(null, this);
    }
}
