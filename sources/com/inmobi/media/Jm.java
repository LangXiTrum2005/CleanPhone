package com.inmobi.media;

import android.media.MediaPlayer;
import kotlinx.coroutines.kowloon;

/* JADX INFO: loaded from: classes3.dex */
public final class Jm implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ InterfaceC3072m9 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ kowloon c;

    public Jm(InterfaceC3072m9 interfaceC3072m9, String str, kowloon kowloonVar) {
        this.a = interfaceC3072m9;
        this.b = str;
        this.c = kowloonVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).b("VideoLoaderHelper", "Video Load Error URL: " + this.b);
        }
        P4.a(this.c, Boolean.FALSE);
        return true;
    }
}
