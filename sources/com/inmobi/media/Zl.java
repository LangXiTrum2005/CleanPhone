package com.inmobi.media;

import android.view.ViewGroup;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Zl extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3135om a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zl(C3135om c3135om, dern dernVar) {
        super(2, dernVar);
        this.a = c3135om;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new Zl(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Zl(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        ViewGroup viewGroup = this.a.j;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
        }
        return Unit.f29295attabal;
    }
}
