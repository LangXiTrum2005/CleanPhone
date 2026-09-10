package com.inmobi.media;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3137p extends SuspendLambda implements Function2 {
    public final /* synthetic */ InterfaceC3072m9 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3137p(InterfaceC3072m9 interfaceC3072m9, Context context, long j, dern dernVar) {
        super(2, dernVar);
        this.a = interfaceC3072m9;
        this.b = context;
        this.c = j;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3137p(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3137p) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("AdAudioTracker", "Starting audio volume tracking");
        }
        if (C3162q.b == null) {
            Object systemService = this.b.getSystemService("audio");
            Intrinsics.competently(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            C3162q.b = (AudioManager) systemService;
        }
        C3162q c3162q = C3162q.a;
        C3162q.f = F3.a(C3162q.g, 0L, this.c, new C3112o(null));
        C3162q.a(this.c);
        Context context = this.b;
        C3162q.c = new C3012k();
        context.registerReceiver(C3162q.c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        C3162q.a(Float.valueOf(c3162q.a()));
        return Unit.f29295attabal;
    }
}
