package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3249tc extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3274uc a;
    public final /* synthetic */ C3324wc b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3249tc(C3274uc c3274uc, C3324wc c3324wc, boolean z, dern dernVar) {
        super(2, dernVar);
        this.a = c3274uc;
        this.b = c3324wc;
        this.c = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3249tc(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3249tc) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        Context context = this.a.b;
        if (context != null) {
            Object systemService = context.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                try {
                    int streamVolume = audioManager.getStreamVolume(3);
                    C3274uc c3274uc = this.a;
                    if (streamVolume != c3274uc.c) {
                        c3274uc.c = streamVolume;
                        InterfaceC3072m9 interfaceC3072m9 = this.b.b;
                        if (interfaceC3072m9 != null) {
                            ((C3097n9) interfaceC3072m9).a("MraidMediaProcessor", "volume change detected - " + this.c);
                        }
                        this.b.a(this.a.a, streamVolume);
                    }
                } catch (Exception e) {
                    InterfaceC3072m9 interfaceC3072m10 = this.b.b;
                    if (interfaceC3072m10 != null) {
                        ((C3097n9) interfaceC3072m10).a("MraidMediaProcessor", "Unexpected error in volume listener", e);
                    }
                }
            }
        }
        return Unit.f29295attabal;
    }
}
