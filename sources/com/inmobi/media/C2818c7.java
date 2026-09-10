package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.FunctionReferenceImpl;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2818c7 extends FunctionReferenceImpl implements Function2 {
    public C2818c7(Object obj) {
        super(2, obj, C3070m7.class, "handleResultInternal", "handleResultInternal(Lcom/inmobi/media/pingsv2/executor/PingExecutor$PingResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object objA = ((C3070m7) this.receiver).b.a((Xf) obj, (dern) obj2);
        return objA == attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
