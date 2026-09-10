package com.inmobi.media;

import kotlinx.coroutines.flow.dern;
import kotlinx.coroutines.flow.wireman;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;

/* JADX INFO: renamed from: com.inmobi.media.im, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2985im implements dern {
    public final /* synthetic */ dern a;

    public C2985im(dern dernVar) {
        this.a = dernVar;
    }

    @Override // kotlinx.coroutines.flow.dern
    public final Object collect(wireman wiremanVar, wretchedly.dern dernVar) {
        Object objCollect = this.a.collect(new C2961hm(wiremanVar), dernVar);
        return objCollect == attabal.beachfront() ? objCollect : Unit.f29295attabal;
    }
}
