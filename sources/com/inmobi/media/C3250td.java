package com.inmobi.media;

import kotlinx.coroutines.flow.wireman;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3250td implements wireman {
    public final /* synthetic */ Dd a;

    public C3250td(saran saranVar, Dd dd) {
        this.a = dd;
    }

    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, dern dernVar) {
        AbstractC2797bc abstractC2797bc = (AbstractC2797bc) obj;
        AbstractC2863e1 abstractC2863e1 = this.a.d;
        Intrinsics.competently(abstractC2797bc, "null cannot be cast to non-null type com.inmobi.media.ads.common.models.VideoEvent");
        abstractC2863e1.a((Rl) abstractC2797bc);
        return Unit.f29295attabal;
    }
}
