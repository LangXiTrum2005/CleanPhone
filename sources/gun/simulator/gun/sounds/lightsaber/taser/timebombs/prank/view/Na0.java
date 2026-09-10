package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Na0 implements InterfaceC4306pN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f3460a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    public Na0(MediaCodec mediaCodec) {
        this.f3460a = mediaCodec;
        if (Ug0.f3833a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final MediaFormat a() {
        return this.f3460a.getOutputFormat();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final ByteBuffer b(int i) {
        return Ug0.f3833a >= 21 ? this.f3460a.getInputBuffer(i) : this.b[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void c(Surface surface) {
        this.f3460a.setOutputSurface(surface);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void d(JN jn, Handler handler) {
        this.f3460a.setOnFrameRenderedListener(new C6(this, jn, 1), handler);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void e(Bundle bundle) {
        this.f3460a.setParameters(bundle);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void f(int i, long j) {
        this.f3460a.releaseOutputBuffer(i, j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void flush() {
        this.f3460a.flush();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final int g() {
        return this.f3460a.dequeueInputBuffer(0L);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f3460a;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && Ug0.f3833a < 21) {
                this.c = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void i(int i, C2339Ck c2339Ck, long j) {
        this.f3460a.queueSecureInputBuffer(i, 0, c2339Ck.i, j, 0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void j(int i, boolean z) {
        this.f3460a.releaseOutputBuffer(i, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final ByteBuffer k(int i) {
        return Ug0.f3833a >= 21 ? this.f3460a.getOutputBuffer(i) : this.c[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void l(int i, int i2, long j, int i3) {
        this.f3460a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void release() {
        this.b = null;
        this.c = null;
        this.f3460a.release();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void setVideoScalingMode(int i) {
        this.f3460a.setVideoScalingMode(i);
    }
}
