package com.inmobi.media;

import com.inmobi.media.C2825ce;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2825ce extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3251te a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2825ce(C3251te c3251te, dern dernVar) {
        super(2, dernVar);
        this.a = c3251te;
    }

    public static final Unit a(C3251te c3251te, short s) {
        InterfaceC3072m9 interfaceC3072m9L = c3251te.l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("NativeRenderedState", "onAssetClickEvent " + ((int) s));
        }
        ((Sc) c3251te.b.m.getValue()).a(s);
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2825ce(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2825ce(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        Ug ug = (Ug) this.a.b.o.getValue();
        final C3251te c3251te = this.a;
        Sg sg = c3251te.b.c;
        Function1 function1 = new Function1() { // from class: adsuki.transitional
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C2825ce.a(c3251te, ((Short) obj2).shortValue());
            }
        };
        ug.getClass();
        Ug.a(sg, function1);
        return Unit.f29295attabal;
    }
}
