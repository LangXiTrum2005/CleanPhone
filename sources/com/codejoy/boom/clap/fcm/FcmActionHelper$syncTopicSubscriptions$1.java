package com.codejoy.boom.clap.fcm;

import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: FcmActionHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@igo.wireman(c = "com.codejoy.boom.clap.fcm.FcmActionHelper", f = "FcmActionHelper.kt", l = {Opcodes.IF_ACMPEQ, Opcodes.RET}, m = "syncTopicSubscriptions", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class FcmActionHelper$syncTopicSubscriptions$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FcmActionHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FcmActionHelper$syncTopicSubscriptions$1(FcmActionHelper fcmActionHelper, wretchedly.dern<? super FcmActionHelper$syncTopicSubscriptions$1> dernVar) {
        super(dernVar);
        this.this$0 = fcmActionHelper;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.kowloon(null, null, false, this);
    }
}
