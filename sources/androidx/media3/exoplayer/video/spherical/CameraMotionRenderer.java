package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class CameraMotionRenderer extends BaseRenderer {
    public final DecoderInputBuffer s0;
    public final ParsableByteArray t0;
    public long u0;
    public CameraMotionListener v0;
    public long w0;

    public CameraMotionRenderer() {
        super(6);
        this.s0 = new DecoderInputBuffer(1);
        this.t0 = new ParsableByteArray();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format) {
        return "application/x-camera-motion".equals(format.m) ? RendererCapabilities.h(4, 0, 0, 0) : RendererCapabilities.h(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void handleMessage(int i2, Object obj) {
        if (i2 == 8) {
            this.v0 = (CameraMotionListener) obj;
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void p() {
        CameraMotionListener cameraMotionListener = this.v0;
        if (cameraMotionListener != null) {
            cameraMotionListener.c();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void r(long j, boolean z2) {
        this.w0 = Long.MIN_VALUE;
        CameraMotionListener cameraMotionListener = this.v0;
        if (cameraMotionListener != null) {
            cameraMotionListener.c();
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void render(long j, long j2) {
        float[] fArr;
        while (!hasReadStreamToEnd() && this.w0 < 100000 + j) {
            DecoderInputBuffer decoderInputBuffer = this.s0;
            decoderInputBuffer.d();
            FormatHolder formatHolder = this.Z;
            formatHolder.a();
            if (x(formatHolder, decoderInputBuffer, 0) != -4 || decoderInputBuffer.b(4)) {
                return;
            }
            long j3 = decoderInputBuffer.g0;
            this.w0 = j3;
            boolean z2 = j3 < this.m0;
            if (this.v0 != null && !z2) {
                decoderInputBuffer.h();
                ByteBuffer byteBuffer = decoderInputBuffer.e0;
                int i2 = Util.f5683a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    ParsableByteArray parsableByteArray = this.t0;
                    parsableByteArray.E(bArrArray, iLimit);
                    parsableByteArray.G(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i3 = 0; i3 < 3; i3++) {
                        fArr2[i3] = Float.intBitsToFloat(parsableByteArray.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.v0.a(fArr, this.w0 - this.u0);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void w(Format[] formatArr, long j, long j2) {
        this.u0 = j2;
    }
}
