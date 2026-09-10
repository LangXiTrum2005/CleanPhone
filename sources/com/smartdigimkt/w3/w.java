package com.smartdigimkt.w3;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.smartdigimkt.j4.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
public interface w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f39377h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f39378i = 2;
    public static final int j = 3;
    public static final int k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f39379l = 0;
    public static final int m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f39380n = 2;
    public static final int o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f39381p = 1;
    public static final int q = 2;
    public static final int r = 3;
    public static final int s = 4;
    public static final int t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f39382u = 1;
    public static final int v = 2;

    public static abstract class a implements c {
        @Deprecated
        public void a(e0 e0Var, Object obj) {
        }

        @Override // com.smartdigimkt.w3.w.c
        public void onLoadingChanged(boolean z2) {
        }

        @Override // com.smartdigimkt.w3.w.c
        public void onPlaybackParametersChanged(v vVar) {
        }

        @Override // com.smartdigimkt.w3.w.c
        public void onPlayerError(com.smartdigimkt.w3.g gVar) {
        }

        @Override // com.smartdigimkt.w3.w.c
        public void onPlayerStateChanged(boolean z2, int i2) {
        }

        @Override // com.smartdigimkt.w3.w.c
        public void onPositionDiscontinuity(int i2) {
        }

        @Override // com.smartdigimkt.w3.w.c
        public void onRepeatModeChanged(int i2) {
        }

        @Override // com.smartdigimkt.w3.w.c
        public void onSeekProcessed() {
        }

        @Override // com.smartdigimkt.w3.w.c
        public void onShuffleModeEnabledChanged(boolean z2) {
        }

        @Override // com.smartdigimkt.w3.w.c
        public void onTimelineChanged(e0 e0Var, Object obj, int i2) {
            a(e0Var, obj);
        }

        @Override // com.smartdigimkt.w3.w.c
        public void onTracksChanged(f0 f0Var, com.smartdigimkt.m4.g gVar) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public interface c {
        void onLoadingChanged(boolean z2);

        void onPlaybackParametersChanged(v vVar);

        void onPlayerError(com.smartdigimkt.w3.g gVar);

        void onPlayerStateChanged(boolean z2, int i2);

        void onPositionDiscontinuity(int i2);

        void onRepeatModeChanged(int i2);

        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean z2);

        void onTimelineChanged(e0 e0Var, Object obj, int i2);

        void onTracksChanged(f0 f0Var, com.smartdigimkt.m4.g gVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    public interface g {
        int A();

        void C();

        void a(Surface surface);

        void a(SurfaceHolder surfaceHolder);

        void a(SurfaceView surfaceView);

        void a(TextureView textureView);

        void a(com.smartdigimkt.q4.g gVar);

        void b(int i2);

        void b(Surface surface);

        void b(SurfaceHolder surfaceHolder);

        void b(SurfaceView surfaceView);

        void b(TextureView textureView);

        void b(com.smartdigimkt.q4.g gVar);
    }

    boolean B();

    int D();

    com.smartdigimkt.m4.g E();

    long F();

    e G();

    g a();

    void a(int i2);

    void a(int i2, long j2);

    void a(long j2);

    void a(v vVar);

    void a(c cVar);

    void a(boolean z2);

    v b();

    void b(c cVar);

    void b(boolean z2);

    void c(int i2);

    void c(boolean z2);

    boolean c();

    int d(int i2);

    boolean d();

    long e();

    int f();

    Object g();

    long h();

    boolean i();

    int j();

    int k();

    int l();

    com.smartdigimkt.w3.g m();

    int o();

    boolean p();

    void q();

    int r();

    void release();

    int s();

    void stop();

    int t();

    boolean u();

    f0 v();

    int w();

    long x();

    Object y();

    e0 z();
}
