package com.inmobi.media;

import android.media.MediaPlayer;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class Hm implements Function1 {
    public final /* synthetic */ MediaPlayer a;

    public Hm(MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.release();
        return Unit.f29295attabal;
    }
}
