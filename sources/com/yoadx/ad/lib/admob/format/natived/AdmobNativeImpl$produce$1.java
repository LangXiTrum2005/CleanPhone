package com.yoadx.ad.lib.admob.format.natived;

import igo.wireman;
import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import wretchedly.dern;

/* JADX INFO: compiled from: AdmobNativeImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@wireman(c = "com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl", f = "AdmobNativeImpl.kt", l = {Opcodes.IF_ACMPEQ, 200, 204}, m = "produce")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class AdmobNativeImpl$produce$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdmobNativeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdmobNativeImpl$produce$1(AdmobNativeImpl admobNativeImpl, dern<? super AdmobNativeImpl$produce$1> dernVar) {
        super(dernVar);
        this.this$0 = admobNativeImpl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.kattegat(null, false, false, this);
    }
}
