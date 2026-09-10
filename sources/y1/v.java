package y1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.internal.ads.qx1;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f54184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f54185b;

    public v(MediaCodec mediaCodec, h hVar) {
        this.f54184a = mediaCodec;
        this.f54185b = hVar;
        if (Build.VERSION.SDK_INT < 35 || hVar == null) {
            return;
        }
        hVar.a(mediaCodec);
    }

    @Override // y1.j
    public final ByteBuffer A(int i10) {
        return this.f54184a.getOutputBuffer(i10);
    }

    @Override // y1.j
    public final void B(ArrayList arrayList) {
        this.f54184a.subscribeToVendorParameters(arrayList);
    }

    @Override // y1.j
    public final void C(ArrayList arrayList) {
        this.f54184a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override // y1.j
    public final void b(Bundle bundle) {
        this.f54184a.setParameters(bundle);
    }

    @Override // y1.j
    public final void c(int i10, qx1 qx1Var, long j10, int i11) {
        this.f54184a.queueSecureInputBuffer(i10, 0, qx1Var.f19238i, j10, i11);
    }

    @Override // y1.j
    public final void d(int i10, int i11, int i12, long j10) {
        this.f54184a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // y1.j
    public final void flush() {
        this.f54184a.flush();
    }

    @Override // y1.j
    public final MediaFormat j() {
        return this.f54184a.getOutputFormat();
    }

    @Override // y1.j
    public final void l() {
        this.f54184a.detachOutputSurface();
    }

    @Override // y1.j
    public final void o(h9.h hVar, Handler handler) {
        this.f54184a.setOnFrameRenderedListener(new a(this, hVar, 1), handler);
    }

    @Override // y1.j
    public final ByteBuffer q(int i10) {
        return this.f54184a.getInputBuffer(i10);
    }

    @Override // y1.j
    public final void r(Surface surface) {
        this.f54184a.setOutputSurface(surface);
    }

    @Override // y1.j
    public final void release() {
        h hVar = this.f54185b;
        MediaCodec mediaCodec = this.f54184a;
        try {
            if (Build.VERSION.SDK_INT < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && hVar != null) {
                hVar.c(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // y1.j
    public final void setVideoScalingMode(int i10) {
        this.f54184a.setVideoScalingMode(i10);
    }

    @Override // y1.j
    public final void t(int i10) {
        this.f54184a.releaseOutputBuffer(i10, false);
    }

    @Override // y1.j
    public final void v(int i10, long j10) {
        this.f54184a.releaseOutputBuffer(i10, j10);
    }

    @Override // y1.j
    public final int w() {
        return this.f54184a.dequeueInputBuffer(0L);
    }

    @Override // y1.j
    public final int x(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f54184a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }
}
