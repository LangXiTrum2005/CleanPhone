package com.startapp.sdk.internal;

import android.media.MediaPlayer;
import android.os.Build;
import android.widget.ProgressBar;
import android.widget.VideoView;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer$MediaErrorExtra;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer$MediaErrorType;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface$VideoPlayerErrorType;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* JADX INFO: loaded from: classes6.dex */
public final class sd extends c2 implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnErrorListener {
    public MediaPlayer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final VideoView f41480h;

    public sd(VideoView videoView) {
        this.f41480h = videoView;
        videoView.setOnPreparedListener(this);
        videoView.setOnCompletionListener(this);
        videoView.setOnErrorListener(this);
    }

    public final void a(String str) {
        this.f40846a = str;
        if (str != null) {
            try {
                this.f41480h.setVideoPath(str);
            } catch (Throwable th) {
                g9.a(th);
                onError(this.g, 1, 0);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.startapp.sdk.ads.video.b bVar = this.d;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        NativeVideoPlayer$MediaErrorExtra nativeVideoPlayer$MediaErrorExtra;
        if (this.f40848c == null) {
            return false;
        }
        int currentPosition = mediaPlayer != null ? mediaPlayer.getCurrentPosition() : -1;
        zj zjVar = this.f40848c;
        VideoPlayerInterface$VideoPlayerErrorType videoPlayerInterface$VideoPlayerErrorType = (i2 == 100 ? NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_SERVER_DIED : NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_UNKNOWN) == NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_SERVER_DIED ? VideoPlayerInterface$VideoPlayerErrorType.SERVER_DIED : VideoPlayerInterface$VideoPlayerErrorType.UNKNOWN;
        if (i3 == -1010) {
            nativeVideoPlayer$MediaErrorExtra = NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_UNSUPPORTED;
        } else if (i3 != -1007) {
            nativeVideoPlayer$MediaErrorExtra = i3 != -110 ? NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_IO : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_TIMED_OUT;
        } else {
            nativeVideoPlayer$MediaErrorExtra = NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_MALFORMED;
        }
        String string = nativeVideoPlayer$MediaErrorExtra.toString();
        ck ckVar = new ck(videoPlayerInterface$VideoPlayerErrorType, string, currentPosition);
        com.startapp.sdk.ads.video.c cVar = zjVar.f41784a;
        if (cVar.f40531N != null) {
            if (!cVar.a0 || cVar.f40540d0 > cVar.e0 || currentPosition <= 0 || !string.equals("MEDIA_ERROR_IO")) {
                zjVar.f41784a.a(ckVar);
            } else {
                com.startapp.sdk.ads.video.c cVar2 = zjVar.f41784a;
                cVar2.f40540d0++;
                ProgressBar progressBar = cVar2.f40534R;
                if (progressBar == null || !progressBar.isShown()) {
                    cVar2.k0.postDelayed(new qj(cVar2), AdsCommonMetaData.k().F().h());
                }
                com.startapp.sdk.ads.video.c cVar3 = zjVar.f41784a;
                cVar3.f40531N.a(cVar3.x().getLocalVideoPath());
                zjVar.f41784a.f40531N.a(currentPosition);
            }
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2;
        MediaEvents mediaEvents;
        this.g = mediaPlayer;
        mediaPlayer.setOnSeekCompleteListener(this);
        xj xjVar = this.f40847b;
        if (xjVar != null) {
            com.startapp.sdk.ads.video.c cVar = xjVar.f41690a;
            int i2 = cVar.h0;
            if (i2 > 0) {
                sd sdVar = cVar.f40531N;
                if (sdVar != null) {
                    sdVar.a(i2);
                }
                com.startapp.sdk.ads.video.c cVar2 = xjVar.f41690a;
                VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
                vd vdVar = cVar2.f41770F;
                if (vdVar != null && (mediaEvents = vdVar.f41581c) != null) {
                    mediaEvents.resume();
                }
                cVar2.a(cVar2.h0, new VideoPausedTrackingParams(cVar2.o, cVar2.a(cVar2.h0), cVar2.C, cVar2.W, pauseOrigin, cVar2.j0), "resumed", cVar2.x().getVideoTrackingDetails().n());
                cVar2.W++;
            } else if (cVar.B()) {
                xjVar.f41690a.H();
            }
        }
        if (h0.b(this.f40846a) && (mediaPlayer2 = this.g) != null) {
            mediaPlayer2.setOnBufferingUpdateListener(new rd(this));
        } else {
            if (h0.b(this.f40846a)) {
                return;
            }
            qe.f41406a.f41446b = this.f;
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        wj wjVar = this.f40849e;
        if (wjVar != null) {
            wjVar.f41643a.H();
        }
    }

    public final void a(int i2) {
        try {
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaPlayer.seekTo(i2, 3);
                } else {
                    mediaPlayer.seekTo(i2);
                }
            }
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
