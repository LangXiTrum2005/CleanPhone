package com.startapp.sdk.internal;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes6.dex */
public final class rd implements MediaPlayer.OnBufferingUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd f41444a;

    public rd(sd sdVar) {
        this.f41444a = sdVar;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        yj yjVar = this.f41444a.f;
        if (yjVar != null) {
            yjVar.a(i2);
        }
    }
}
