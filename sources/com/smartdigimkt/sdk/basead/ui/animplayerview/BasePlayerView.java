package com.smartdigimkt.sdk.basead.ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.smartdigimkt.k5.d;
import com.smartdigimkt.v3.h;
import com.smartdigimkt.w6.f;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BasePlayerView extends RelativeLayout {
    protected long e0;
    protected long f0;
    protected int g0;
    protected int h0;
    protected int i0;
    protected boolean j0;
    protected boolean k0;
    protected boolean l0;
    protected boolean m0;
    protected boolean n0;
    protected boolean o0;
    protected boolean p0;
    protected Thread q0;
    protected Handler r0;
    protected a s0;
    protected f t0;
    protected com.smartdigimkt.v6.a u0;
    protected boolean v0;
    private int w0;

    public interface a {
        void a();

        void a(int i2);

        void a(long j);

        void a(h hVar);

        void b();

        void b(int i2);

        void b(long j);

        void c();

        void d();

        void e();

        void onVideoDownloadResume();
    }

    public BasePlayerView(Context context) {
        super(context);
        this.e0 = 5000L;
        this.f0 = -1L;
        this.n0 = false;
        this.o0 = false;
        this.p0 = false;
        this.v0 = false;
    }

    public void a(h hVar) {
        a aVar = this.s0;
        if (aVar != null) {
            aVar.a(hVar);
        }
        if (this.v0) {
            return;
        }
        a();
    }

    public void b(h hVar) {
        a aVar = this.s0;
        if (aVar != null) {
            aVar.a(hVar);
        }
        a();
    }

    public abstract long getCurrentPosition();

    public abstract long getVideoLength();

    public int getViewType() {
        return this.w0;
    }

    public abstract boolean hasVideo();

    public void init(f fVar, com.smartdigimkt.v6.a aVar, boolean z2, List<Bitmap> list, d dVar) {
        this.t0 = fVar;
        this.u0 = aVar;
    }

    public abstract boolean isMute();

    public boolean isPlayCompletion() {
        return this.p0;
    }

    public abstract boolean isPlaying();

    public abstract void pause();

    public void rePlayVideo() {
    }

    public void release(int i2) {
    }

    public abstract void setListener(a aVar);

    public abstract void setMute(boolean z2);

    public void setNeedInterruptRelease(boolean z2) {
        this.v0 = z2;
    }

    public void setViewType(int i2) {
        this.w0 = i2;
    }

    public abstract void start();

    public abstract void stop();

    public void a() {
        this.s0 = null;
    }

    public BasePlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = 5000L;
        this.f0 = -1L;
        this.n0 = false;
        this.o0 = false;
        this.p0 = false;
        this.v0 = false;
    }

    public BasePlayerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = 5000L;
        this.f0 = -1L;
        this.n0 = false;
        this.o0 = false;
        this.p0 = false;
        this.v0 = false;
    }
}
