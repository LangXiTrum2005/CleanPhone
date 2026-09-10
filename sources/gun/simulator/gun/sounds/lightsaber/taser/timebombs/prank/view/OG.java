package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import java.io.IOException;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class OG implements Qo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Co0 f3496a;
    public Eo0 b;
    public Go0 c;
    public Ko0 d;
    public Jo0 e;
    public Mo0 f;
    public Io0 g;
    public boolean h = false;
    public final MediaPlayer i;
    public final HG j;
    public NK k;
    public Surface l;
    public final Object m;
    public volatile boolean n;

    public OG() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.m = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.i = mediaPlayer;
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Class<?> cls = Class.forName("android.media.MediaTimeProvider");
                Class<?> cls2 = Class.forName("android.media.SubtitleController");
                Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
                Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(Ro0.f3682a, null, null);
                Field declaredField = cls2.getDeclaredField("mHandler");
                declaredField.setAccessible(true);
                try {
                    declaredField.set(objNewInstance, new Handler());
                    declaredField.setAccessible(false);
                    mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
                } catch (Throwable unused) {
                    declaredField.setAccessible(false);
                }
            } catch (Throwable unused2) {
            }
        }
        try {
            this.i.setAudioStreamType(3);
        } catch (Throwable unused3) {
        }
        this.j = new HG(this);
        e();
    }

    public final void a(long j, int i) {
        int i2 = Build.VERSION.SDK_INT;
        MediaPlayer mediaPlayer = this.i;
        if (i2 < 26) {
            mediaPlayer.seekTo((int) j);
            return;
        }
        if (i == 0) {
            mediaPlayer.seekTo((int) j, 0);
            return;
        }
        if (i == 1) {
            mediaPlayer.seekTo((int) j, 1);
            return;
        }
        if (i == 2) {
            mediaPlayer.seekTo((int) j, 2);
        } else if (i != 3) {
            mediaPlayer.seekTo((int) j);
        } else {
            mediaPlayer.seekTo((int) j, 3);
        }
    }

    public final synchronized void b(Uo0 uo0) {
        NK nk = new NK(Ro0.f3682a, uo0);
        NK.e.put(uo0.STP(), nk);
        this.k = nk;
        Po0.a(uo0);
        this.i.setDataSource(this.k);
    }

    public final void c(String str) throws IOException {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme);
        MediaPlayer mediaPlayer = this.i;
        if (zIsEmpty || !scheme.equalsIgnoreCase("file")) {
            mediaPlayer.setDataSource(str);
        } else {
            mediaPlayer.setDataSource(uri.getPath());
        }
    }

    public final void d() {
        this.f3496a = null;
        this.c = null;
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final void e() {
        MediaPlayer mediaPlayer = this.i;
        HG hg = this.j;
        mediaPlayer.setOnPreparedListener(hg);
        mediaPlayer.setOnBufferingUpdateListener(hg);
        mediaPlayer.setOnCompletionListener(hg);
        mediaPlayer.setOnSeekCompleteListener(hg);
        mediaPlayer.setOnVideoSizeChangedListener(hg);
        mediaPlayer.setOnErrorListener(hg);
        mediaPlayer.setOnInfoListener(hg);
    }

    public final void f() {
        try {
            Surface surface = this.l;
            if (surface != null) {
                surface.release();
                this.l = null;
            }
        } catch (Throwable unused) {
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        f();
    }
}
