package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaPlayer;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class HG implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f3164a;

    public HG(OG og) {
        this.f3164a = new WeakReference(og);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        Go0 go0;
        try {
            OG og = (OG) this.f3164a.get();
            if (og == null || (go0 = og.c) == null) {
                return;
            }
            go0.Lxb(og, i);
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Eo0 eo0;
        try {
            OG og = (OG) this.f3164a.get();
            if (og == null || (eo0 = og.b) == null) {
                return;
            }
            eo0.Lxb(og);
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Mo0 mo0;
        try {
            OG og = (OG) this.f3164a.get();
            return (og == null || (mo0 = og.f) == null || !mo0.Lxb(og, i, i2)) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Io0 io0;
        try {
            OG og = (OG) this.f3164a.get();
            return (og == null || (io0 = og.g) == null || !io0.LD(og, i, i2)) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        Co0 co0;
        try {
            OG og = (OG) this.f3164a.get();
            if (og == null || (co0 = og.f3496a) == null) {
                return;
            }
            co0.LD(og);
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        Ko0 ko0;
        try {
            OG og = (OG) this.f3164a.get();
            if (og == null || (ko0 = og.d) == null) {
                return;
            }
            ko0.lk(og);
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        Jo0 jo0;
        try {
            OG og = (OG) this.f3164a.get();
            if (og == null || (jo0 = og.e) == null) {
                return;
            }
            jo0.Lxb(og, i, i2, 1, 1);
        } catch (Throwable unused) {
        }
    }
}
