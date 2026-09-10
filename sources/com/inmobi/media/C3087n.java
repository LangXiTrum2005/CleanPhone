package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3087n extends SuspendLambda implements Function2 {
    public final /* synthetic */ InterfaceC3072m9 a;
    public final /* synthetic */ InterfaceC2987j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3087n(InterfaceC3072m9 interfaceC3072m9, InterfaceC2987j interfaceC2987j, dern dernVar) {
        super(2, dernVar);
        this.a = interfaceC3072m9;
        this.b = interfaceC2987j;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3087n(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3087n(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("AdAudioTracker", "Removing audio volume change listener");
        }
        CopyOnWriteArraySet<WeakReference> copyOnWriteArraySet = C3162q.h;
        InterfaceC2987j interfaceC2987j = this.b;
        for (WeakReference weakReference : copyOnWriteArraySet) {
            if (Intrinsics.wireman(weakReference.get(), interfaceC2987j)) {
                C3162q.h.remove(weakReference);
            }
        }
        if (C3162q.h.isEmpty()) {
            InterfaceC3072m9 interfaceC3072m10 = this.a;
            if (interfaceC3072m10 != null) {
                ((C3097n9) interfaceC3072m10).c("AdAudioTracker", "Stopping audio volume change listener");
            }
            InterfaceC3072m9 interfaceC3072m11 = this.a;
            Context context = Ji.a;
            if (context == null) {
                if (interfaceC3072m11 != null) {
                    ((C3097n9) interfaceC3072m11).b("AdAudioTracker", "Context is null. Cannot stop audio volume tracking");
                }
                C3162q.a((Float) null);
            } else if (C3162q.d.compareAndSet(true, false)) {
                if (interfaceC3072m11 != null) {
                    ((C3097n9) interfaceC3072m11).c("AdAudioTracker", "Stopping audio volume tracking");
                }
                C3162q.a(context, interfaceC3072m11);
            } else if (interfaceC3072m11 != null) {
                ((C3097n9) interfaceC3072m11).c("AdAudioTracker", "Audio volume tracking is already stopped");
            }
        }
        return Unit.f29295attabal;
    }
}
