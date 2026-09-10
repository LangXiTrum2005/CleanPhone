package com.inmobi.media;

import kotlinx.coroutines.flow.wireman;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.em, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2884em implements wireman {
    public final /* synthetic */ C3135om a;

    public C2884em(saran saranVar, C3135om c3135om) {
        this.a = c3135om;
    }

    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, dern dernVar) {
        Object objEmit = this.a.d.emit((AbstractC2797bc) obj, dernVar);
        return objEmit == attabal.beachfront() ? objEmit : Unit.f29295attabal;
    }
}
