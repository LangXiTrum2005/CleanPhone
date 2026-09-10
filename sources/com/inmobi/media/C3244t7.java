package com.inmobi.media;

import kotlinx.coroutines.flow.wireman;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.t7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3244t7 implements wireman {
    public final /* synthetic */ N7 a;

    public C3244t7(saran saranVar, N7 n7) {
        this.a = n7;
    }

    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, dern dernVar) {
        N7 n7 = this.a;
        n7.x.a();
        n7.l.set(EnumC3228sg.STATE_PLAYBACK_COMPLETED);
        return Unit.f29295attabal;
    }
}
