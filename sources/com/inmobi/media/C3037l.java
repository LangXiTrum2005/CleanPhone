package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3037l extends SuspendLambda implements Function2 {
    public final /* synthetic */ InterfaceC3072m9 a;
    public final /* synthetic */ InterfaceC2987j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3037l(InterfaceC3072m9 interfaceC3072m9, InterfaceC2987j interfaceC2987j, dern dernVar) {
        super(2, dernVar);
        this.a = interfaceC3072m9;
        this.b = interfaceC2987j;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3037l(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3037l(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("AdAudioTracker", "Adding audio volume change listener. Existing listeners - " + C3162q.h.size());
        }
        for (WeakReference weakReference : C3162q.h) {
            if (weakReference.get() == null) {
                C3162q.h.remove(weakReference);
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet = C3162q.h;
        boolean zIsEmpty = copyOnWriteArraySet.isEmpty();
        copyOnWriteArraySet.add(new WeakReference(this.b));
        InterfaceC2987j interfaceC2987j = this.b;
        Float f = (Float) C3162q.e.get();
        ((Ph) interfaceC2987j).a(f != null ? igo.attabal.dern(F3.a(f.floatValue() * 100.0f)) : null);
        if (zIsEmpty) {
            InterfaceC3072m9 interfaceC3072m10 = this.a;
            if (interfaceC3072m10 != null) {
                ((C3097n9) interfaceC3072m10).c("AdAudioTracker", "Starting audio volume change listener");
            }
            C3162q.a(this.a);
        } else {
            InterfaceC3072m9 interfaceC3072m11 = this.a;
            if (interfaceC3072m11 != null) {
                ((C3097n9) interfaceC3072m11).c("AdAudioTracker", "Resuming audio volume change listener");
            }
        }
        return Unit.f29295attabal;
    }
}
