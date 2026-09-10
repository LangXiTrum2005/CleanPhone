package com.inmobi.media;

import androidx.media3.exoplayer.adultoid;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class Km implements Function1 {
    public final /* synthetic */ adultoid a;
    public final /* synthetic */ Lm b;

    public Km(adultoid adultoidVar, Lm lm) {
        this.a = adultoidVar;
        this.b = lm;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.impromptu(this.b);
        this.a.stop();
        this.a.dern();
        return Unit.f29295attabal;
    }
}
