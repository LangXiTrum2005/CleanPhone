package com.codejoy.boom.clap.fcm;

import p002kotlin.Metadata;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: FcmActionHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@igo.wireman(c = "com.codejoy.boom.clap.fcm.FcmActionHelper", f = "FcmActionHelper.kt", l = {130, 135, 137}, m = "performLanguageTopicRefresh", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class FcmActionHelper$performLanguageTopicRefresh$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FcmActionHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FcmActionHelper$performLanguageTopicRefresh$1(FcmActionHelper fcmActionHelper, wretchedly.dern<? super FcmActionHelper$performLanguageTopicRefresh$1> dernVar) {
        super(dernVar);
        this.this$0 = fcmActionHelper;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.taiyuan(null, false, this);
    }
}
