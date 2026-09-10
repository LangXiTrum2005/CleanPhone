package com.inmobi.media;

import kotlinx.coroutines.flow.apical;
import kotlinx.coroutines.flow.dern;
import kotlinx.coroutines.flow.wireman;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;

/* JADX INFO: renamed from: com.inmobi.media.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3350xd implements dern {
    public final /* synthetic */ apical a;

    public C3350xd(apical apicalVar) {
        this.a = apicalVar;
    }

    @Override // kotlinx.coroutines.flow.dern
    public final Object collect(wireman wiremanVar, wretchedly.dern dernVar) {
        Object objCollect = this.a.collect(new C3325wd(wiremanVar), dernVar);
        return objCollect == attabal.beachfront() ? objCollect : Unit.f29295attabal;
    }
}
