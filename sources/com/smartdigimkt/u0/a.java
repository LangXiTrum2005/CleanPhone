package com.smartdigimkt.u0;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaPlayer f38776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f38777c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile MediaPlayer.OnPreparedListener f38778e;
    Object f = new Object();
    private volatile boolean d = false;

    /* JADX INFO: renamed from: com.smartdigimkt.u0.a$a, reason: collision with other inner class name */
    public class C0624a implements MediaPlayer.OnPreparedListener {
        public C0624a() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            synchronized (a.this.f) {
                try {
                    a.this.d = true;
                    if (a.this.f38778e != null) {
                        a.this.f38778e.onPrepared(mediaPlayer);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public String b() {
        return this.f38775a;
    }

    public boolean c() {
        boolean z2;
        synchronized (this.f) {
            z2 = this.f38777c;
        }
        return z2;
    }

    public boolean d() {
        boolean z2;
        synchronized (this.f) {
            z2 = this.d;
        }
        return z2;
    }

    public void a(MediaPlayer mediaPlayer, String str) {
        this.f38776b = mediaPlayer;
        this.f38775a = str;
        this.f38777c = true;
        this.f38776b.setOnPreparedListener(new C0624a());
        try {
            this.f38776b.prepareAsync();
        } catch (Throwable unused) {
        }
    }

    public void a(MediaPlayer.OnPreparedListener onPreparedListener) {
        synchronized (this.f) {
            this.f38778e = onPreparedListener;
        }
    }

    public MediaPlayer a() {
        return this.f38776b;
    }
}
