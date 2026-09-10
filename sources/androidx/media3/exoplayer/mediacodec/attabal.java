package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.media3.common.polloi;
import androidx.media3.common.rotuma;
import com.google.common.base.arytenoidectomy;
import decarock.grimness;
import decarock.supplicat;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: AsynchronousMediaCodecAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final MediaCodec f12063attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final rajahship.competently f12064dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f12065marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final androidx.media3.exoplayer.mediacodec.saneness f12066saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f12067wireman;

    /* JADX INFO: compiled from: AsynchronousMediaCodecAdapter.java */
    public static final class saneness implements wireman.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final arytenoidectomy<HandlerThread> f12068attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f12069dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final arytenoidectomy<HandlerThread> f12070saneness;

        public saneness(final int i) {
            this(new arytenoidectomy() { // from class: rajahship.saneness
                @Override // com.google.common.base.arytenoidectomy
                public final Object get() {
                    return androidx.media3.exoplayer.mediacodec.attabal.saneness.dern(i);
                }
            }, new arytenoidectomy() { // from class: rajahship.dern
                @Override // com.google.common.base.arytenoidectomy
                public final Object get() {
                    return androidx.media3.exoplayer.mediacodec.attabal.saneness.saneness(i);
                }
            });
        }

        public static boolean beachfront(polloi polloiVar) {
            int i = grimness.f25080attabal;
            if (i < 34) {
                return false;
            }
            return i >= 35 || rotuma.apical(polloiVar.f11218triweekly);
        }

        public static /* synthetic */ HandlerThread dern(int i) {
            return new HandlerThread(attabal.molybdenite(i));
        }

        public static /* synthetic */ HandlerThread saneness(int i) {
            return new HandlerThread(attabal.graveside(i));
        }

        public void marial(boolean z) {
            this.f12069dern = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.mediacodec.attabal$attabal] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.media3.exoplayer.mediacodec.attabal] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v4 */
        @Override // androidx.media3.exoplayer.mediacodec.wireman.saneness
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public attabal attabal(wireman.attabal attabalVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            rajahship.competently wiremanVar;
            String str = attabalVar.f12104attabal.name;
            ?? r1 = 0;
            r1 = 0;
            try {
                supplicat.attabal("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    int i = attabalVar.f12105beachfront;
                    if (this.f12069dern && beachfront(attabalVar.f12106dern)) {
                        wiremanVar = new rajahship.rotuma(mediaCodecCreateByCodecName);
                        i |= 4;
                    } else {
                        wiremanVar = new rajahship.wireman(mediaCodecCreateByCodecName, this.f12070saneness.get());
                    }
                    attabal attabalVar2 = new attabal(mediaCodecCreateByCodecName, this.f12068attabal.get(), wiremanVar);
                    try {
                        supplicat.saneness();
                        attabalVar2.dovishness(attabalVar.f12108saneness, attabalVar.f12109wireman, attabalVar.f12107marial, i);
                        return attabalVar2;
                    } catch (Exception e) {
                        e = e;
                        r1 = attabalVar2;
                        if (r1 != 0) {
                            r1.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodecCreateByCodecName = null;
            }
        }

        public saneness(arytenoidectomy<HandlerThread> arytenoidectomyVar, arytenoidectomy<HandlerThread> arytenoidectomyVar2) {
            this.f12068attabal = arytenoidectomyVar;
            this.f12070saneness = arytenoidectomyVar2;
            this.f12069dern = true;
        }
    }

    public static String adultoid(int i, String str) {
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

    public static String graveside(int i) {
        return adultoid(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static /* synthetic */ void kowloon(attabal attabalVar, wireman.InterfaceC0087wireman interfaceC0087wireman, MediaCodec mediaCodec, long j, long j2) {
        attabalVar.getClass();
        interfaceC0087wireman.attabal(attabalVar, j, j2);
    }

    public static String molybdenite(int i) {
        return adultoid(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public int apical() {
        this.f12064dern.wireman();
        return this.f12066saneness.dern();
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void attabal(int i, int i2, miliaria.dern dernVar, long j, int i3) {
        this.f12064dern.attabal(i, i2, dernVar, j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public MediaFormat beachfront() {
        return this.f12066saneness.competently();
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public ByteBuffer competently(int i) {
        return this.f12063attabal.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void cutely(int i, long j) {
        this.f12063attabal.releaseOutputBuffer(i, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void dern(Bundle bundle) {
        this.f12064dern.dern(bundle);
    }

    public final void dovishness(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.f12066saneness.impromptu(this.f12063attabal);
        supplicat.attabal("configureCodec");
        this.f12063attabal.configure(mediaFormat, surface, mediaCrypto, i);
        supplicat.saneness();
        this.f12064dern.start();
        supplicat.attabal("startCodec");
        this.f12063attabal.start();
        supplicat.saneness();
        this.f12065marial = 1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void flush() {
        this.f12064dern.flush();
        this.f12063attabal.flush();
        this.f12066saneness.marial();
        this.f12063attabal.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public int formularize(MediaCodec.BufferInfo bufferInfo) {
        this.f12064dern.wireman();
        return this.f12066saneness.wireman(bufferInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void impassible(int i, boolean z) {
        this.f12063attabal.releaseOutputBuffer(i, z);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void impromptu(Surface surface) {
        this.f12063attabal.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void marial(final wireman.InterfaceC0087wireman interfaceC0087wireman, Handler handler) {
        this.f12063attabal.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: rajahship.attabal
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                androidx.media3.exoplayer.mediacodec.attabal.kowloon(this.f36037attabal, interfaceC0087wireman, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void release() {
        try {
            if (this.f12065marial == 1) {
                this.f12064dern.shutdown();
                this.f12066saneness.monoploid();
            }
            this.f12065marial = 2;
            if (this.f12067wireman) {
                return;
            }
            try {
                int i = grimness.f25080attabal;
                if (i >= 30 && i < 33) {
                    this.f12063attabal.stop();
                }
            } finally {
                this.f12063attabal.release();
                this.f12067wireman = true;
            }
        } catch (Throwable th) {
            if (!this.f12067wireman) {
                try {
                    int i2 = grimness.f25080attabal;
                    if (i2 >= 30 && i2 < 33) {
                        this.f12063attabal.stop();
                    }
                } finally {
                    this.f12063attabal.release();
                    this.f12067wireman = true;
                }
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void saneness(int i, int i2, int i3, long j, int i4) {
        this.f12064dern.saneness(i, i2, i3, j, i4);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public void setVideoScalingMode(int i) {
        this.f12063attabal.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public boolean taiyuan() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public ByteBuffer triweekly(int i) {
        return this.f12063attabal.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman
    public boolean wireman(wireman.dern dernVar) {
        this.f12066saneness.arytenoidectomy(dernVar);
        return true;
    }

    public attabal(MediaCodec mediaCodec, HandlerThread handlerThread, rajahship.competently competentlyVar) {
        this.f12063attabal = mediaCodec;
        this.f12066saneness = new androidx.media3.exoplayer.mediacodec.saneness(handlerThread);
        this.f12064dern = competentlyVar;
        this.f12065marial = 0;
    }
}
