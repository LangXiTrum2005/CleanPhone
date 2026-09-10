package com.inmobi.media;

import android.media.MediaPlayer;
import kotlinx.coroutines.kowloon;

/* JADX INFO: loaded from: classes3.dex */
public final class Im implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ InterfaceC3072m9 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ kowloon c;

    public Im(InterfaceC3072m9 interfaceC3072m9, String str, kowloon kowloonVar) {
        this.a = interfaceC3072m9;
        this.b = str;
        this.c = kowloonVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("VideoLoaderHelper", "Video Load Success for URL: " + this.b);
        }
        P4.a(this.c, Boolean.TRUE);
    }
}
