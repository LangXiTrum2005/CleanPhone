package com.inmobi.media;

import A.AbstractC0891g;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C3017f8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.f8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3017f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3114l9 f23609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23610c;
    public final Object d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AudioAttributes f23611e;
    public AudioFocusRequest f;
    public AudioManager.OnAudioFocusChangeListener g;

    public C3017f8(Context context, C3114l9 audioFocusListener) {
        Intrinsics.f(context, "context");
        Intrinsics.f(audioFocusListener, "audioFocusListener");
        this.f23608a = context;
        this.f23609b = audioFocusListener;
        this.d = new Object();
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();
        Intrinsics.e(audioAttributesBuild, "build(...)");
        this.f23611e = audioAttributesBuild;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                Object systemService = this.f23608a.getSystemService("audio");
                AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                if (audioManager != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        AudioFocusRequest audioFocusRequest = this.f;
                        if (audioFocusRequest != null) {
                            audioManager.abandonAudioFocusRequest(audioFocusRequest);
                        }
                    } else {
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.g;
                        if (onAudioFocusChangeListener != null) {
                            audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AudioManager.OnAudioFocusChangeListener b() {
        return new AudioManager.OnAudioFocusChangeListener() { // from class: A.Z
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i2) {
                C3017f8.a(this.X, i2);
            }
        };
    }

    public final void c() {
        int iRequestAudioFocus;
        synchronized (this.d) {
            try {
                Object systemService = this.f23608a.getSystemService("audio");
                AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                if (audioManager != null) {
                    if (this.g == null) {
                        this.g = b();
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        if (this.f == null) {
                            androidx.media3.exoplayer.a.o();
                            AudioFocusRequest.Builder audioAttributes = AbstractC0891g.m().setAudioAttributes(this.f23611e);
                            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.g;
                            Intrinsics.c(onAudioFocusChangeListener);
                            AudioFocusRequest audioFocusRequestBuild = audioAttributes.setOnAudioFocusChangeListener(onAudioFocusChangeListener, new Handler(Looper.getMainLooper())).build();
                            Intrinsics.e(audioFocusRequestBuild, "build(...)");
                            this.f = audioFocusRequestBuild;
                        }
                        AudioFocusRequest audioFocusRequest = this.f;
                        Intrinsics.c(audioFocusRequest);
                        iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
                    } else {
                        iRequestAudioFocus = audioManager.requestAudioFocus(this.g, 3, 2);
                    }
                } else {
                    iRequestAudioFocus = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iRequestAudioFocus == 1) {
            C3114l9 c3114l9 = this.f23609b;
            c3114l9.i();
            C3002e9 c3002e9 = c3114l9.f23781n;
            if (c3002e9 == null || c3002e9.d == null) {
                return;
            }
            c3002e9.j = false;
            c3002e9.f23563i.removeView(c3002e9.g);
            c3002e9.f23563i.removeView(c3002e9.f);
            c3002e9.a();
            return;
        }
        C3114l9 c3114l10 = this.f23609b;
        c3114l10.h();
        C3002e9 c3002e10 = c3114l10.f23781n;
        if (c3002e10 == null || c3002e10.d == null) {
            return;
        }
        c3002e10.j = true;
        c3002e10.f23563i.removeView(c3002e10.f);
        c3002e10.f23563i.removeView(c3002e10.g);
        c3002e10.b();
    }

    public static final void a(C3017f8 this$0, int i2) {
        Intrinsics.f(this$0, "this$0");
        if (i2 == -2) {
            synchronized (this$0.d) {
                this$0.f23610c = true;
            }
            C3114l9 c3114l9 = this$0.f23609b;
            c3114l9.h();
            C3002e9 c3002e9 = c3114l9.f23781n;
            if (c3002e9 == null || c3002e9.d == null) {
                return;
            }
            c3002e9.j = true;
            c3002e9.f23563i.removeView(c3002e9.f);
            c3002e9.f23563i.removeView(c3002e9.g);
            c3002e9.b();
            return;
        }
        if (i2 == -1) {
            synchronized (this$0.d) {
                this$0.f23610c = false;
            }
            C3114l9 c3114l10 = this$0.f23609b;
            c3114l10.h();
            C3002e9 c3002e10 = c3114l10.f23781n;
            if (c3002e10 == null || c3002e10.d == null) {
                return;
            }
            c3002e10.j = true;
            c3002e10.f23563i.removeView(c3002e10.f);
            c3002e10.f23563i.removeView(c3002e10.g);
            c3002e10.b();
            return;
        }
        if (i2 != 1) {
            return;
        }
        synchronized (this$0.d) {
            try {
                if (this$0.f23610c) {
                    C3114l9 c3114l11 = this$0.f23609b;
                    if (c3114l11.isPlaying()) {
                        c3114l11.i();
                        C3002e9 c3002e11 = c3114l11.f23781n;
                        if (c3002e11 != null && c3002e11.d != null) {
                            c3002e11.j = false;
                            c3002e11.f23563i.removeView(c3002e11.g);
                            c3002e11.f23563i.removeView(c3002e11.f);
                            c3002e11.a();
                        }
                    }
                }
                this$0.f23610c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
