package com.inmobi.media;

import okhttp3.marial;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2832cl implements Function1 {
    public final /* synthetic */ marial a;

    public C2832cl(marial marialVar) {
        this.a = marialVar;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.cancel();
        return Unit.f29295attabal;
    }
}
