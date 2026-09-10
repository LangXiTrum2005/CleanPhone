package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class E6 implements InterfaceC4306pN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f3006a;
    public final J6 b;
    public final I6 c;
    public final boolean d;
    public boolean e;
    public int f = 0;

    public E6(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.f3006a = mediaCodec;
        this.b = new J6(handlerThread);
        this.c = new I6(mediaCodec, handlerThread2);
        this.d = z;
    }

    public static void m(E6 e6, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        J6 j6 = e6.b;
        FW.s(j6.c == null);
        HandlerThread handlerThread = j6.b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = e6.f3006a;
        mediaCodec.setCallback(j6, handler);
        j6.c = handler;
        FW.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        FW.A();
        I6 i6 = e6.c;
        if (!i6.f) {
            HandlerThread handlerThread2 = i6.b;
            handlerThread2.start();
            i6.c = new G6(i6, handlerThread2.getLooper());
            i6.f = true;
        }
        FW.c("startCodec");
        mediaCodec.start();
        FW.A();
        e6.f = 1;
    }

    public static String n(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final MediaFormat a() {
        MediaFormat mediaFormat;
        J6 j6 = this.b;
        synchronized (j6.f3254a) {
            try {
                mediaFormat = j6.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final ByteBuffer b(int i) {
        return this.f3006a.getInputBuffer(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void c(Surface surface) {
        o();
        this.f3006a.setOutputSurface(surface);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void d(JN jn, Handler handler) {
        o();
        this.f3006a.setOnFrameRenderedListener(new C6(this, jn, 0), handler);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void e(Bundle bundle) {
        o();
        this.f3006a.setParameters(bundle);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void f(int i, long j) {
        this.f3006a.releaseOutputBuffer(i, j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void flush() {
        this.c.a();
        this.f3006a.flush();
        J6 j6 = this.b;
        synchronized (j6.f3254a) {
            j6.k++;
            Handler handler = j6.c;
            int i = Ug0.f3833a;
            handler.post(new RunnableC2928Zc(j6, 10));
        }
        this.f3006a.start();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final int g() {
        int iD;
        RuntimeException runtimeException = (RuntimeException) this.c.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        J6 j6 = this.b;
        synchronized (j6.f3254a) {
            try {
                iD = -1;
                if (!(j6.k > 0 || j6.l)) {
                    IllegalStateException illegalStateException = j6.m;
                    if (illegalStateException != null) {
                        j6.m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = j6.j;
                    if (codecException != null) {
                        j6.j = null;
                        throw codecException;
                    }
                    C4633t40 c4633t40 = j6.d;
                    if (c4633t40.c != 0) {
                        iD = c4633t40.d();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iD;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        int iD;
        RuntimeException runtimeException = (RuntimeException) this.c.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        J6 j6 = this.b;
        synchronized (j6.f3254a) {
            try {
                iD = -1;
                if (!(j6.k > 0 || j6.l)) {
                    IllegalStateException illegalStateException = j6.m;
                    if (illegalStateException != null) {
                        j6.m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = j6.j;
                    if (codecException != null) {
                        j6.j = null;
                        throw codecException;
                    }
                    C4633t40 c4633t40 = j6.e;
                    if (c4633t40.c != 0) {
                        iD = c4633t40.d();
                        if (iD >= 0) {
                            FW.t(j6.h);
                            MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) j6.f.remove();
                            bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                        } else if (iD == -2) {
                            j6.h = (MediaFormat) j6.g.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iD;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void i(int i, C2339Ck c2339Ck, long j) {
        I6 i6 = this.c;
        RuntimeException runtimeException = (RuntimeException) i6.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        H6 h6B = I6.b();
        h6B.f3154a = i;
        h6B.b = 0;
        h6B.c = 0;
        h6B.e = j;
        h6B.f = 0;
        int i2 = c2339Ck.f;
        MediaCodec.CryptoInfo cryptoInfo = h6B.d;
        cryptoInfo.numSubSamples = i2;
        int[] iArr = c2339Ck.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c2339Ck.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c2339Ck.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = c2339Ck.f2937a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = c2339Ck.c;
        if (Ug0.f3833a >= 24) {
            F6.q();
            cryptoInfo.setPattern(F6.j(c2339Ck.g, c2339Ck.h));
        }
        i6.c.obtainMessage(1, h6B).sendToTarget();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void j(int i, boolean z) {
        this.f3006a.releaseOutputBuffer(i, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final ByteBuffer k(int i) {
        return this.f3006a.getOutputBuffer(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void l(int i, int i2, long j, int i3) {
        I6 i6 = this.c;
        RuntimeException runtimeException = (RuntimeException) i6.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        H6 h6B = I6.b();
        h6B.f3154a = i;
        h6B.b = 0;
        h6B.c = i2;
        h6B.e = j;
        h6B.f = i3;
        G6 g6 = i6.c;
        int i4 = Ug0.f3833a;
        g6.obtainMessage(0, h6B).sendToTarget();
    }

    public final void o() {
        if (this.d) {
            try {
                I6 i6 = this.c;
                C4581sZ c4581sZ = i6.e;
                c4581sZ.c();
                G6 g6 = i6.c;
                g6.getClass();
                g6.obtainMessage(2).sendToTarget();
                synchronized (c4581sZ) {
                    while (!c4581sZ.f4984a) {
                        c4581sZ.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void release() {
        try {
            if (this.f == 1) {
                I6 i6 = this.c;
                if (i6.f) {
                    i6.a();
                    i6.b.quit();
                }
                i6.f = false;
                J6 j6 = this.b;
                synchronized (j6.f3254a) {
                    j6.l = true;
                    j6.b.quit();
                    j6.a();
                }
            }
            this.f = 2;
            if (this.e) {
                return;
            }
            this.f3006a.release();
            this.e = true;
        } catch (Throwable th) {
            if (!this.e) {
                this.f3006a.release();
                this.e = true;
            }
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4306pN
    public final void setVideoScalingMode(int i) {
        o();
        this.f3006a.setVideoScalingMode(i);
    }
}
