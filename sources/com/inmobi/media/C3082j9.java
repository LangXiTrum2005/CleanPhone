package com.inmobi.media;

import android.media.MediaPlayer;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3082j9 implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3114l9 f23724a;

    public C3082j9(C3114l9 c3114l9) {
        this.f23724a = c3114l9;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mp) {
        HashMap map;
        C3002e9 c3002e9;
        HashMap map2;
        HashMap map3;
        Intrinsics.f(mp, "mp");
        if (this.f23724a.getMediaPlayer() == null) {
            return;
        }
        G8 mediaPlayer = this.f23724a.getMediaPlayer();
        if (mediaPlayer != null) {
            mediaPlayer.f22844a = 2;
        }
        C3114l9 c3114l9 = this.f23724a;
        c3114l9.r = true;
        c3114l9.q = true;
        c3114l9.f23782p = true;
        C3002e9 c3002e10 = c3114l9.f23781n;
        if (c3002e10 != null) {
            c3002e10.setEnabled(true);
        }
        this.f23724a.f23777e = mp.getVideoWidth();
        this.f23724a.f = mp.getVideoHeight();
        Object tag = this.f23724a.getTag();
        C2968c9 c2968c9 = tag instanceof C2968c9 ? (C2968c9) tag : null;
        int iIntValue = 0;
        if (c2968c9 != null) {
            Object obj = c2968c9.t.get("didCompleteQ4");
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj).booleanValue()) {
                this.f23724a.a(8, 0);
                Object obj2 = c2968c9.t.get("placementType");
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Byte");
                if (((Byte) obj2).byteValue() == 1) {
                    return;
                }
            }
        }
        InterfaceC3034g9 playbackEventListener = this.f23724a.getPlaybackEventListener();
        if (playbackEventListener != null) {
            ((A8) playbackEventListener).a((byte) 0);
        }
        Object obj3 = (c2968c9 == null || (map3 = c2968c9.t) == null) ? null : map3.get("didCompleteQ4");
        if (Intrinsics.a(obj3 instanceof Boolean ? (Boolean) obj3 : null, Boolean.FALSE)) {
            Object obj4 = c2968c9.t.get("seekPosition");
            Intrinsics.d(obj4, "null cannot be cast to non-null type kotlin.Int");
            iIntValue = ((Integer) obj4).intValue();
        }
        C3114l9 c3114l10 = this.f23724a;
        if (c3114l10.f23777e == 0 || c3114l10.f == 0) {
            G8 mediaPlayer2 = c3114l10.getMediaPlayer();
            if (mediaPlayer2 == null || 3 != mediaPlayer2.f22845b) {
                return;
            }
            Object obj5 = (c2968c9 == null || (map = c2968c9.t) == null) ? null : map.get("isFullScreen");
            if (Intrinsics.a(obj5 instanceof Boolean ? (Boolean) obj5 : null, Boolean.TRUE)) {
                this.f23724a.start();
                return;
            }
            return;
        }
        G8 mediaPlayer3 = c3114l10.getMediaPlayer();
        if (mediaPlayer3 == null || 3 != mediaPlayer3.f22845b) {
            if (this.f23724a.isPlaying()) {
                return;
            }
            if ((iIntValue != 0 || this.f23724a.getCurrentPosition() > 0) && (c3002e9 = this.f23724a.f23781n) != null) {
                c3002e9.d();
                return;
            }
            return;
        }
        Object obj6 = (c2968c9 == null || (map2 = c2968c9.t) == null) ? null : map2.get("isFullScreen");
        if (Intrinsics.a(obj6 instanceof Boolean ? (Boolean) obj6 : null, Boolean.TRUE)) {
            this.f23724a.start();
        }
        C3002e9 c3002e11 = this.f23724a.f23781n;
        if (c3002e11 != null) {
            c3002e11.d();
        }
    }
}
