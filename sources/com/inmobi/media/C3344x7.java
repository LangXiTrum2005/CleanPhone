package com.inmobi.media;

import kotlinx.coroutines.flow.apical;
import kotlinx.coroutines.flow.dern;
import kotlinx.coroutines.flow.wireman;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;

/* JADX INFO: renamed from: com.inmobi.media.x7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3344x7 implements dern {
    public final /* synthetic */ apical a;

    public C3344x7(apical apicalVar) {
        this.a = apicalVar;
    }

    @Override // kotlinx.coroutines.flow.dern
    public final Object collect(wireman wiremanVar, wretchedly.dern dernVar) {
        Object objCollect = this.a.collect(new C3319w7(wiremanVar), dernVar);
        return objCollect == attabal.beachfront() ? objCollect : Unit.f29295attabal;
    }
}
