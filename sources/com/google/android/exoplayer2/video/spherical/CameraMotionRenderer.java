package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraMotionRenderer extends BaseRenderer {
    public final DecoderInputBuffer n0;
    public final ParsableByteArray o0;
    public long p0;
    public CameraMotionListener q0;
    public long r0;

    public CameraMotionRenderer() {
        super(6);
        this.n0 = new DecoderInputBuffer(1);
        this.o0 = new ParsableByteArray();
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int a(Format format) {
        return "application/x-camera-motion".equals(format.m0) ? RendererCapabilities.c(4, 0, 0) : RendererCapabilities.c(0, 0, 0);
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public final void handleMessage(int i2, Object obj) {
        if (i2 == 8) {
            this.q0 = (CameraMotionListener) obj;
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void j() {
        CameraMotionListener cameraMotionListener = this.q0;
        if (cameraMotionListener != null) {
            cameraMotionListener.c();
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void l(long j, boolean z2) {
        this.r0 = Long.MIN_VALUE;
        CameraMotionListener cameraMotionListener = this.q0;
        if (cameraMotionListener != null) {
            cameraMotionListener.c();
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void p(Format[] formatArr, long j, long j2) {
        this.p0 = j2;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void render(long j, long j2) {
        float[] fArr;
        while (!hasReadStreamToEnd() && this.r0 < 100000 + j) {
            DecoderInputBuffer decoderInputBuffer = this.n0;
            decoderInputBuffer.d();
            FormatHolder formatHolder = this.f16996Y;
            formatHolder.a();
            if (q(formatHolder, decoderInputBuffer, 0) != -4 || decoderInputBuffer.b(4)) {
                return;
            }
            this.r0 = decoderInputBuffer.f0;
            if (this.q0 != null && !decoderInputBuffer.b(Integer.MIN_VALUE)) {
                decoderInputBuffer.h();
                ByteBuffer byteBuffer = decoderInputBuffer.Z;
                int i2 = Util.f18979a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    ParsableByteArray parsableByteArray = this.o0;
                    parsableByteArray.D(bArrArray, iLimit);
                    parsableByteArray.F(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i3 = 0; i3 < 3; i3++) {
                        fArr2[i3] = Float.intBitsToFloat(parsableByteArray.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.q0.a(fArr, this.r0 - this.p0);
                }
            }
        }
    }
}
