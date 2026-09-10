package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import decarock.grimness;
import decarock.supplicat;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class impromptu implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final MediaCodec f12076attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public ByteBuffer[] f12077dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public ByteBuffer[] f12078saneness;

    /* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
    public static class saneness implements wireman.saneness {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.mediacodec.impromptu$attabal] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // androidx.media3.exoplayer.mediacodec.wireman.saneness
        public wireman attabal(wireman.attabal attabalVar) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecSaneness = saneness(attabalVar);
                try {
                    supplicat.attabal("configureCodec");
                    mediaCodecSaneness.configure(attabalVar.f12108saneness, attabalVar.f12109wireman, attabalVar.f12107marial, attabalVar.f12105beachfront);
                    supplicat.saneness();
                    supplicat.attabal("startCodec");
                    mediaCodecSaneness.start();
                    supplicat.saneness();
                    return new impromptu(mediaCodecSaneness);
                } catch (IOException | RuntimeException e) {
                    e = e;
                    mediaCodec = mediaCodecSaneness;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (RuntimeException e3) {
                e = e3;
            }
        }

        public MediaCodec saneness(wireman.attabal attabalVar) throws IOException {
            decarock.attabal.marial(attabalVar.f12104attabal);
            String str = attabalVar.f12104attabal.name;
            supplicat.attabal("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            supplicat.saneness();
            return mediaCodecCreateByCodecName;
        }
    }

    public static /* synthetic */ void kowloon(impromptu impromptuVar, wireman.InterfaceC0087wireman interfaceC0087wireman, MediaCodec mediaCodec, long j, long j2) {
        impromptuVar.getClass();
        interfaceC0087wireman.attabal(impromptuVar, j, j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public int apical() {
        return this.f12076attabal.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void attabal(int i, int i2, miliaria.dern dernVar, long j, int i3) {
        this.f12076attabal.queueSecureInputBuffer(i, i2, dernVar.attabal(), j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public MediaFormat beachfront() {
        return this.f12076attabal.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public ByteBuffer competently(int i) {
        return grimness.f25080attabal >= 21 ? this.f12076attabal.getInputBuffer(i) : ((ByteBuffer[]) grimness.impromptu(this.f12078saneness))[i];
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void cutely(int i, long j) {
        this.f12076attabal.releaseOutputBuffer(i, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void dern(Bundle bundle) {
        this.f12076attabal.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void flush() {
        this.f12076attabal.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public int formularize(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f12076attabal.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && grimness.f25080attabal < 21) {
                this.f12077dern = this.f12076attabal.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void impassible(int i, boolean z) {
        this.f12076attabal.releaseOutputBuffer(i, z);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void impromptu(Surface surface) {
        this.f12076attabal.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void marial(final wireman.InterfaceC0087wireman interfaceC0087wireman, Handler handler) {
        this.f12076attabal.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: rajahship.gintrap
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                androidx.media3.exoplayer.mediacodec.impromptu.kowloon(this.f36044attabal, interfaceC0087wireman, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void release() {
        this.f12078saneness = null;
        this.f12077dern = null;
        try {
            int i = grimness.f25080attabal;
            if (i >= 30 && i < 33) {
                this.f12076attabal.stop();
            }
        } finally {
            this.f12076attabal.release();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void saneness(int i, int i2, int i3, long j, int i4) {
        this.f12076attabal.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void setVideoScalingMode(int i) {
        this.f12076attabal.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public boolean taiyuan() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public ByteBuffer triweekly(int i) {
        return grimness.f25080attabal >= 21 ? this.f12076attabal.getOutputBuffer(i) : ((ByteBuffer[]) grimness.impromptu(this.f12077dern))[i];
    }

    public impromptu(MediaCodec mediaCodec) {
        this.f12076attabal = mediaCodec;
        if (grimness.f25080attabal < 21) {
            this.f12078saneness = mediaCodec.getInputBuffers();
            this.f12077dern = mediaCodec.getOutputBuffers();
        }
    }
}
