package sg.bigo.ads.core.player.b;

import android.media.MediaPlayer;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final AtomicBoolean f48788h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    MediaPlayer f48789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f48790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a f48791c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f48792e;
    boolean f;
    private Surface j;
    private long k;
    private boolean m;
    int d = 0;
    final Runnable g = new Runnable() { // from class: sg.bigo.ads.core.player.b.c.1
        @Override // java.lang.Runnable
        public final void run() {
            if (c.this.f48791c != null) {
                c.this.f48791c.i();
            }
            if (c.this.d == 3 || c.this.d == 4 || c.this.d == 5) {
                return;
            }
            sg.bigo.ads.common.n.d.a(2, c.this.g, 500L);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f48794l = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f48793i = 0;

    public interface a {
        void a(int i2, String str, int i3);

        void a(MediaPlayer mediaPlayer, int i2);

        boolean a(int i2);

        boolean a(int i2, int i3);

        void e_();

        void f();

        void g();

        void h();

        void i();

        void j();

        void k();
    }

    public c() {
        this.m = false;
        this.m = i.f46986a.n().a(3);
        g();
    }

    private boolean h() {
        return !this.m || this.f48793i >= 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        try {
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "prepareAsync");
            this.k = SystemClock.elapsedRealtime();
            this.f48789a.prepareAsync();
            return true;
        } catch (Exception e2) {
            a aVar = this.f48791c;
            if (aVar != null) {
                aVar.a(10, Log.getStackTraceString(e2), this.f48793i);
            }
            b(10);
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "Player prepareAsync failed");
            return false;
        }
    }

    public final int c() {
        try {
            if (this.f48792e) {
                return this.f48789a.getCurrentPosition();
            }
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "getCurrentPosition failed，not initialize or release already");
            return 0;
        } catch (IllegalStateException e2) {
            a aVar = this.f48791c;
            if (aVar != null) {
                aVar.a(5, Log.getStackTraceString(e2), this.f48793i);
            }
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "getCurrentPosition IllegalStateException");
            return 0;
        }
    }

    public final boolean d() {
        try {
            this.f48789a.stop();
            sg.bigo.ads.common.n.d.a(this.g);
            this.d = 4;
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "stop play");
            a aVar = this.f48791c;
            if (aVar != null) {
                aVar.h();
            }
            return true;
        } catch (IllegalStateException e2) {
            a aVar2 = this.f48791c;
            if (aVar2 != null) {
                aVar2.a(6, Log.getStackTraceString(e2), this.f48793i);
            }
            sg.bigo.ads.common.t.a.a(1, "MediaPlayerWrapper", "Failed to stop video: " + e2.getMessage());
            return false;
        }
    }

    public final void e() {
        try {
            this.f48789a.release();
            f48788h.set(true);
            sg.bigo.ads.common.n.d.a(this.g);
        } catch (IllegalStateException e2) {
            a aVar = this.f48791c;
            if (aVar != null) {
                aVar.a(7, Log.getStackTraceString(e2), this.f48793i);
            }
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "player release IllegalStateException");
        }
        this.d = 0;
        this.f48792e = false;
        sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "player release called");
    }

    public final int f() {
        try {
            if (this.f48792e) {
                return this.f48789a.getDuration();
            }
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "getDuration failed，not initialize or release already");
            return 0;
        } catch (IllegalStateException e2) {
            a aVar = this.f48791c;
            if (aVar != null) {
                aVar.a(8, Log.getStackTraceString(e2), this.f48793i);
            }
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "getDuration IllegalStateException");
            return 0;
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "onBufferingUpdate percent = ".concat(String.valueOf(i2)));
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        sg.bigo.ads.common.n.d.a(this.g);
        a aVar = this.f48791c;
        if (aVar != null) {
            this.d = 5;
            aVar.j();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        a aVar;
        if (h() && (aVar = this.f48791c) != null) {
            return aVar.a(i2, i3);
        }
        sg.bigo.ads.common.n.d.a(this.g);
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        a aVar = this.f48791c;
        if (aVar != null) {
            return aVar.a(i2);
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (!this.f) {
            sg.bigo.ads.common.t.a.b("MediaPlayerWrapper", "Surface is not available, do prepare cancel");
            return;
        }
        this.d = 1;
        this.f48792e = true;
        sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "onPrepared called cost = " + (SystemClock.elapsedRealtime() - this.k));
        a aVar = this.f48791c;
        if (aVar != null) {
            aVar.a(mediaPlayer, this.f48793i);
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        a aVar = this.f48791c;
        if (aVar != null) {
            aVar.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f48789a = new MediaPlayer();
        f48788h.set(false);
        this.f48789a.setOnCompletionListener(this);
        this.f48789a.setOnErrorListener(this);
        this.f48789a.setOnInfoListener(this);
        this.f48789a.setOnPreparedListener(this);
        this.f48789a.setOnVideoSizeChangedListener(this);
        this.f48789a.setOnBufferingUpdateListener(this);
    }

    public final void a(Surface surface) {
        try {
            this.j = surface;
            this.f48789a.setSurface(surface);
            this.f = true;
        } catch (Exception e2) {
            a aVar = this.f48791c;
            if (aVar != null) {
                aVar.a(12, Log.getStackTraceString(e2), this.f48793i);
            }
            b(12);
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "setSurface IllegalStateException");
        }
    }

    public final void b(final int i2) {
        if (!this.m) {
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "createMediaPlayerWhenException switch is off");
            return;
        }
        int i3 = this.f48793i;
        if (i3 >= 3) {
            a aVar = this.f48791c;
            if (aVar != null) {
                aVar.a(i2, "retry times has reached limit", i3);
            }
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "createMediaPlayer times reach the limit(3 times), stop creating");
            return;
        }
        this.f48793i = i3 + 1;
        sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "start to create mediaPlayer, retry time: " + this.f48793i);
        e();
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.player.b.c.3
            @Override // java.lang.Runnable
            public final void run() {
                c.this.g();
                int i4 = i2;
                if (i4 != 9 && i4 != 10) {
                    if (i4 == 12) {
                        c cVar = c.this;
                        cVar.a(cVar.j);
                        return;
                    } else if (i4 != 15) {
                        return;
                    }
                }
                c cVar2 = c.this;
                cVar2.a(cVar2.j);
                c cVar3 = c.this;
                cVar3.a(cVar3.f48790b);
            }
        });
    }

    public final void a(final String str) {
        if (q.a((CharSequence) str)) {
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "invalidate file path, set data source failed");
        } else {
            this.f48790b = str;
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.b(str)) {
                        c.this.i();
                    }
                }
            });
        }
    }

    public final boolean b() {
        try {
            this.f48789a.pause();
            sg.bigo.ads.common.n.d.a(this.g);
            this.d = 3;
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "pauseAd play");
            a aVar = this.f48791c;
            if (aVar != null) {
                aVar.g();
            }
            return true;
        } catch (IllegalStateException e2) {
            a aVar2 = this.f48791c;
            if (aVar2 != null) {
                aVar2.a(4, Log.getStackTraceString(e2), this.f48793i);
            }
            sg.bigo.ads.common.t.a.a(1, "MediaPlayerWrapper", "Failed to pause video: " + e2.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        try {
            if (!this.f) {
                sg.bigo.ads.common.t.a.b("MediaPlayerWrapper", "Surface is not available, setDataSource cancel");
                return false;
            }
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "player setDataSource, path = ".concat(String.valueOf(str)));
            this.f48789a.reset();
            this.f48789a.setDataSource(str);
            return true;
        } catch (Exception e2) {
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "Player setDataSource failed");
            if (this.f48791c != null) {
                if (h()) {
                    sg.bigo.ads.common.t.a.b("MediaPlayerWrapper", "setDataSource called onError");
                    this.f48791c.a(1, -1004);
                }
                this.f48791c.a(9, Log.getStackTraceString(e2), this.f48793i);
            }
            b(9);
            return false;
        }
    }

    public final boolean a() {
        try {
            if (this.f48792e && this.f) {
                if (this.f48789a.isPlaying()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "startAd but is playing, return.");
                    return true;
                }
                this.f48789a.start();
                if (!this.f48794l) {
                    this.f48794l = true;
                    a aVar = this.f48791c;
                    if (aVar != null) {
                        aVar.e_();
                    }
                }
                this.d = 2;
                sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "startAd play called ");
                sg.bigo.ads.common.n.d.a(this.g);
                sg.bigo.ads.common.n.d.a(2, this.g);
                a aVar2 = this.f48791c;
                if (aVar2 != null) {
                    aVar2.f();
                }
                return true;
            }
            sg.bigo.ads.common.t.a.b("MediaPlayerWrapper", "Surface is not available or player unprepared, do start play cancel");
            return false;
        } catch (IllegalStateException e2) {
            a aVar3 = this.f48791c;
            if (aVar3 != null) {
                aVar3.a(3, Log.getStackTraceString(e2), this.f48793i);
            }
            sg.bigo.ads.common.t.a.a(1, "MediaPlayerWrapper", "Failed to play video: " + e2.getMessage());
            return false;
        }
    }

    public final boolean a(int i2) {
        try {
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "seekTo : ".concat(String.valueOf(i2)));
            this.f48789a.seekTo(i2);
            return true;
        } catch (IllegalStateException e2) {
            a aVar = this.f48791c;
            if (aVar != null) {
                aVar.a(1, Log.getStackTraceString(e2), this.f48793i);
            }
            sg.bigo.ads.common.t.a.a(1, "MediaPlayerWrapper", "The video failed to seek:" + e2.getMessage());
            return false;
        }
    }

    public final boolean a(boolean z2) {
        try {
            if (z2) {
                this.f48789a.setVolume(0.0f, 0.0f);
                return z2;
            }
            this.f48789a.setVolume(1.0f, 1.0f);
            return z2;
        } catch (IllegalStateException e2) {
            a aVar = this.f48791c;
            if (aVar != null) {
                aVar.a(14, Log.getStackTraceString(e2), this.f48793i);
            }
            sg.bigo.ads.common.t.a.a(1, "MediaPlayerWrapper", "The video failed to set volume: " + e2.getMessage());
            return z2;
        }
    }
}
