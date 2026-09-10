package com.inmobi.media;

import android.graphics.drawable.Drawable;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import picketboat.saneness;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2969i5 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ C2993j5 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2969i5(C2993j5 c2993j5, int i, int i2, int i3, int i4, int i5, dern dernVar) {
        super(2, dernVar);
        this.b = c2993j5;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C2969i5 c2969i5 = new C2969i5(this.b, this.c, this.d, this.e, this.f, this.g, dernVar);
        c2969i5.a = obj;
        return c2969i5;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2969i5) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        Drawable drawable = saneness.getDrawable(this.b.getContext(), this.c);
        if (drawable != null) {
            this.b.a(drawable, this.d, this.e, this.f, this.g);
            return Unit.f29295attabal;
        }
        C2993j5 c2993j5 = this.b;
        InterfaceC3072m9 interfaceC3072m9 = c2993j5.b;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).b("CustomView", "CustomView drawable for " + ((int) c2993j5.a) + " cannot be created");
        }
        return Unit.f29295attabal;
    }
}
