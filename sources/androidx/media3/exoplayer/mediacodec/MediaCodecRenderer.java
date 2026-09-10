package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.Format;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.OggOpusAudioPacketizer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.FrameworkCryptoConfig;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.extractor.OpusUtil;
import com.google.common.base.Preconditions;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.d9;
import com.thinkup.core.common.n.mo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {
    public static final byte[] E1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final ArrayDeque A0;
    public DecoderCounters A1;
    public final OggOpusAudioPacketizer B0;
    public OutputStreamInfo B1;
    public Format C0;
    public long C1;
    public Format D0;
    public boolean D1;
    public DrmSession E0;
    public DrmSession F0;
    public Renderer.WakeupListener G0;
    public MediaCrypto H0;
    public final long I0;
    public float J0;
    public float K0;
    public MediaCodecAdapter L0;
    public Format M0;
    public MediaFormat N0;
    public boolean O0;
    public float P0;
    public ArrayDeque Q0;
    public DecoderInitializationException R0;
    public MediaCodecInfo S0;
    public int T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public boolean c1;
    public long d1;
    public int e1;
    public int f1;
    public ByteBuffer g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public int n1;
    public int o1;
    public int p1;
    public boolean q1;
    public boolean r1;
    public final MediaCodecAdapter.Factory s0;
    public boolean s1;
    public final d t0;
    public long t1;
    public final float u0;
    public long u1;
    public final DecoderInputBuffer v0;
    public boolean v1;
    public final DecoderInputBuffer w0;
    public boolean w1;
    public final DecoderInputBuffer x0;
    public boolean x1;
    public final BatchBuffer y0;
    public boolean y1;
    public final MediaCodec.BufferInfo z0;
    public ExoPlaybackException z1;

    public static final class Api21 {
        public static boolean a(MediaCodecAdapter mediaCodecAdapter, MediaCodecRendererCodecAdapterListener mediaCodecRendererCodecAdapterListener) {
            return mediaCodecAdapter.l(mediaCodecRendererCodecAdapterListener);
        }
    }

    public static final class Api31 {
        public static void a(MediaCodecAdapter.Configuration configuration, PlayerId playerId) {
            LogSessionId logSessionIdA = playerId.a();
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            configuration.f6289b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    public final class MediaCodecRendererCodecAdapterListener implements MediaCodecAdapter.OnBufferAvailableListener {
        public MediaCodecRendererCodecAdapterListener() {
        }
    }

    public static final class OutputStreamInfo {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final OutputStreamInfo f6300e = new OutputStreamInfo(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6303c;
        public final TimedValueQueue d = new TimedValueQueue();

        public OutputStreamInfo(long j, long j2, long j3) {
            this.f6301a = j;
            this.f6302b = j2;
            this.f6303c = j3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecRenderer(int i2, MediaCodecAdapter.Factory factory, float f) {
        super(i2);
        d dVar = MediaCodecSelector.f6304a;
        this.s0 = factory;
        this.t0 = dVar;
        this.u0 = f;
        this.v0 = new DecoderInputBuffer(0);
        this.w0 = new DecoderInputBuffer(0);
        this.x0 = new DecoderInputBuffer(2);
        BatchBuffer batchBuffer = new BatchBuffer(2);
        batchBuffer.l0 = 32;
        this.y0 = batchBuffer;
        this.z0 = new MediaCodec.BufferInfo();
        this.J0 = 1.0f;
        this.K0 = 1.0f;
        this.I0 = -9223372036854775807L;
        this.A0 = new ArrayDeque();
        this.B1 = OutputStreamInfo.f6300e;
        batchBuffer.g(0);
        batchBuffer.e0.order(ByteOrder.nativeOrder());
        OggOpusAudioPacketizer oggOpusAudioPacketizer = new OggOpusAudioPacketizer();
        oggOpusAudioPacketizer.f6175a = AudioProcessor.f5559a;
        oggOpusAudioPacketizer.f6177c = 0;
        oggOpusAudioPacketizer.f6176b = 2;
        this.B0 = oggOpusAudioPacketizer;
        this.P0 = -1.0f;
        this.T0 = 0;
        this.n1 = 0;
        this.e1 = -1;
        this.f1 = -1;
        this.d1 = -9223372036854775807L;
        this.t1 = -9223372036854775807L;
        this.u1 = -9223372036854775807L;
        this.C1 = -9223372036854775807L;
        this.o1 = 0;
        this.p1 = 0;
        this.A1 = new DecoderCounters();
    }

    public MediaCodecDecoderException A(IllegalStateException illegalStateException, MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecDecoderException(illegalStateException, mediaCodecInfo);
    }

    public final void B() {
        this.l1 = false;
        this.y0.d();
        this.x0.d();
        this.k1 = false;
        this.j1 = false;
        OggOpusAudioPacketizer oggOpusAudioPacketizer = this.B0;
        oggOpusAudioPacketizer.getClass();
        oggOpusAudioPacketizer.f6175a = AudioProcessor.f5559a;
        oggOpusAudioPacketizer.f6177c = 0;
        oggOpusAudioPacketizer.f6176b = 2;
    }

    public final boolean C() throws ExoPlaybackException {
        if (!this.q1) {
            r0();
            return true;
        }
        this.o1 = 1;
        if (this.V0 || this.X0) {
            this.p1 = 3;
            return false;
        }
        this.p1 = 2;
        return true;
    }

    public final boolean D(long j, long j2) throws ExoPlaybackException {
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean zF0;
        int i2;
        MediaCodecAdapter mediaCodecAdapter = this.L0;
        mediaCodecAdapter.getClass();
        boolean z3 = this.f1 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.z0;
        if (!z3) {
            if (this.Y0 && this.r1) {
                try {
                    i2 = mediaCodecAdapter.i(bufferInfo2);
                } catch (IllegalStateException unused) {
                    e0();
                    if (this.w1) {
                        h0();
                    }
                }
            } else {
                i2 = mediaCodecAdapter.i(bufferInfo2);
            }
            if (i2 < 0) {
                if (i2 != -2) {
                    if (this.c1 && (this.v1 || this.o1 == 2)) {
                        e0();
                        return false;
                    }
                    return false;
                }
                this.s1 = true;
                MediaCodecAdapter mediaCodecAdapter2 = this.L0;
                mediaCodecAdapter2.getClass();
                MediaFormat mediaFormatC = mediaCodecAdapter2.c();
                if (this.T0 != 0 && mediaFormatC.getInteger("width") == 32 && mediaFormatC.getInteger("height") == 32) {
                    this.b1 = true;
                    return true;
                }
                this.N0 = mediaFormatC;
                this.O0 = true;
                return true;
            }
            if (this.b1) {
                this.b1 = false;
                mediaCodecAdapter.j(i2, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                e0();
                return false;
            }
            this.f1 = i2;
            ByteBuffer byteBufferK = mediaCodecAdapter.k(i2);
            this.g1 = byteBufferK;
            if (byteBufferK != null) {
                byteBufferK.position(bufferInfo2.offset);
                this.g1.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Z0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0 && this.t1 != -9223372036854775807L) {
                bufferInfo2.presentationTimeUs = this.u1;
            }
            long j3 = bufferInfo2.presentationTimeUs;
            this.h1 = j3 < this.m0;
            long j4 = this.u1;
            this.i1 = j4 != -9223372036854775807L && j4 <= j3;
            s0(j3);
        }
        if (this.Y0 && this.r1) {
            try {
                ByteBuffer byteBuffer = this.g1;
                int i3 = this.f1;
                int i4 = bufferInfo2.flags;
                long j5 = bufferInfo2.presentationTimeUs;
                boolean z4 = this.h1;
                boolean z5 = this.i1;
                Format format = this.D0;
                format.getClass();
                z2 = false;
                bufferInfo = bufferInfo2;
                try {
                    zF0 = f0(j, j2, mediaCodecAdapter, byteBuffer, i3, i4, 1, j5, z4, z5, format);
                } catch (IllegalStateException unused2) {
                    e0();
                    if (!this.w1) {
                        return z2;
                    }
                    h0();
                    return z2;
                }
            } catch (IllegalStateException unused3) {
                z2 = false;
            }
        } else {
            z2 = false;
            bufferInfo = bufferInfo2;
            ByteBuffer byteBuffer2 = this.g1;
            int i5 = this.f1;
            int i6 = bufferInfo.flags;
            long j6 = bufferInfo.presentationTimeUs;
            boolean z6 = this.h1;
            boolean z7 = this.i1;
            Format format2 = this.D0;
            format2.getClass();
            zF0 = f0(j, j2, mediaCodecAdapter, byteBuffer2, i5, i6, 1, j6, z6, z7, format2);
        }
        if (!zF0) {
            return z2;
        }
        a0(bufferInfo.presentationTimeUs);
        boolean z8 = (bufferInfo.flags & 4) != 0 ? true : z2;
        this.f1 = -1;
        this.g1 = null;
        if (!z8) {
            return r2;
        }
        e0();
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0194  */
    /* JADX WARN: Code duplicated, block: B:107:0x019c  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f4 A[Catch: CryptoException -> 0x01fc, TRY_ENTER, TryCatch #1 {CryptoException -> 0x01fc, blocks: (B:122:0x01f4, B:125:0x01fe), top: B:136:0x01f2 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01fe A[Catch: CryptoException -> 0x01fc, TRY_LEAVE, TryCatch #1 {CryptoException -> 0x01fc, blocks: (B:122:0x01f4, B:125:0x01fe), top: B:136:0x01f2 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0091 A[EDGE_INSN: B:140:0x0091->B:33:0x0091 BREAK  A[LOOP:0: B:30:0x006f->B:32:0x007c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[LOOP:0: B:30:0x006f->B:32:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e7 A[Catch: CryptoException -> 0x00f7, TRY_LEAVE, TryCatch #2 {CryptoException -> 0x00f7, blocks: (B:58:0x00e1, B:61:0x00e7), top: B:138:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0107  */
    /* JADX WARN: Code duplicated, block: B:74:0x011b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:78:0x0127  */
    /* JADX WARN: Code duplicated, block: B:79:0x012b  */
    /* JADX WARN: Code duplicated, block: B:81:0x012f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0142 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0153  */
    /* JADX WARN: Code duplicated, block: B:91:0x015c  */
    /* JADX WARN: Code duplicated, block: B:92:0x015e  */
    /* JADX WARN: Code duplicated, block: B:95:0x017c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x017e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0182  */
    public final boolean E() throws ExoPlaybackException {
        int iPosition;
        FormatHolder formatHolder;
        int iX;
        boolean zB;
        long j;
        int I2;
        ArrayDeque arrayDeque;
        ByteBuffer byteBuffer;
        int iPosition2;
        int i2;
        int i3;
        int i4;
        ByteBuffer byteBuffer2;
        int i5;
        CryptoInfo cryptoInfo;
        int i6;
        Format format;
        MediaCodecAdapter mediaCodecAdapter = this.L0;
        if (mediaCodecAdapter != null && this.o1 != 2 && !this.v1) {
            int i7 = this.e1;
            DecoderInputBuffer decoderInputBuffer = this.w0;
            if (i7 < 0) {
                int iH = mediaCodecAdapter.h();
                this.e1 = iH;
                if (iH >= 0) {
                    decoderInputBuffer.e0 = mediaCodecAdapter.e(iH);
                    decoderInputBuffer.d();
                    if (this.o1 == 1) {
                        if (!this.c1) {
                            this.r1 = true;
                            mediaCodecAdapter.b(this.e1, 0, 4, 0L);
                            this.e1 = -1;
                            decoderInputBuffer.e0 = null;
                        }
                        this.o1 = 2;
                        return false;
                    }
                    if (this.a1) {
                        this.a1 = false;
                        ByteBuffer byteBuffer3 = decoderInputBuffer.e0;
                        byteBuffer3.getClass();
                        byteBuffer3.put(E1);
                        mediaCodecAdapter.b(this.e1, 38, 0, 0L);
                        this.e1 = -1;
                        decoderInputBuffer.e0 = null;
                        this.q1 = true;
                        return true;
                    }
                    if (this.n1 == 1) {
                        i6 = 0;
                        while (true) {
                            format = this.M0;
                            format.getClass();
                            if (i6 < format.f5414p.size()) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.M0.f5414p.get(i6);
                            ByteBuffer byteBuffer4 = decoderInputBuffer.e0;
                            byteBuffer4.getClass();
                            byteBuffer4.put(bArr);
                            i6++;
                        }
                        this.n1 = 2;
                    }
                    ByteBuffer byteBuffer5 = decoderInputBuffer.e0;
                    byteBuffer5.getClass();
                    iPosition = byteBuffer5.position();
                    formatHolder = this.Z;
                    formatHolder.a();
                    try {
                        iX = x(formatHolder, decoderInputBuffer, 0);
                        if (iX == -3) {
                            if (hasReadStreamToEnd()) {
                                this.u1 = this.t1;
                                return false;
                            }
                        } else {
                            if (iX == -5) {
                                if (this.n1 == 2) {
                                    decoderInputBuffer.d();
                                    this.n1 = 1;
                                }
                                X(formatHolder);
                                return true;
                            }
                            if (decoderInputBuffer.b(4)) {
                                if (!this.q1 || decoderInputBuffer.b(1)) {
                                    zB = decoderInputBuffer.b(1073741824);
                                    if (zB) {
                                        cryptoInfo = decoderInputBuffer.Z;
                                        if (iPosition == 0) {
                                            cryptoInfo.getClass();
                                        } else {
                                            if (cryptoInfo.d == null) {
                                                int[] iArr = new int[1];
                                                cryptoInfo.d = iArr;
                                                cryptoInfo.f5798i.numBytesOfClearData = iArr;
                                            }
                                            int[] iArr2 = cryptoInfo.d;
                                            iArr2[0] = iArr2[0] + iPosition;
                                        }
                                    }
                                    if (this.U0 && !zB) {
                                        byteBuffer = decoderInputBuffer.e0;
                                        byteBuffer.getClass();
                                        iPosition2 = byteBuffer.position();
                                        i2 = 0;
                                        i3 = 0;
                                        while (true) {
                                            i4 = i2 + 1;
                                            if (i4 >= iPosition2) {
                                                byteBuffer.clear();
                                                break;
                                            }
                                            i5 = byteBuffer.get(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                            if (i3 == 3) {
                                                if (i5 == 1 && (byteBuffer.get(i4) & 31) == 7) {
                                                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                                                    byteBufferDuplicate.position(i2 - 3);
                                                    byteBufferDuplicate.limit(iPosition2);
                                                    byteBuffer.position(0);
                                                    byteBuffer.put(byteBufferDuplicate);
                                                    break;
                                                }
                                            } else if (i5 == 0) {
                                                i3++;
                                            }
                                            if (i5 != 0) {
                                                i3 = 0;
                                            }
                                            i2 = i4;
                                        }
                                        byteBuffer2 = decoderInputBuffer.e0;
                                        byteBuffer2.getClass();
                                        if (byteBuffer2.position() != 0) {
                                            this.U0 = false;
                                        }
                                    }
                                    j = decoderInputBuffer.g0;
                                    if (this.x1) {
                                        arrayDeque = this.A0;
                                        if (arrayDeque.isEmpty()) {
                                            TimedValueQueue timedValueQueue = this.B1.d;
                                            Format format2 = this.C0;
                                            format2.getClass();
                                            timedValueQueue.a(j, format2);
                                        } else {
                                            TimedValueQueue timedValueQueue2 = ((OutputStreamInfo) arrayDeque.peekLast()).d;
                                            Format format3 = this.C0;
                                            format3.getClass();
                                            timedValueQueue2.a(j, format3);
                                        }
                                        this.x1 = false;
                                    }
                                    this.t1 = Math.max(this.t1, j);
                                    if (hasReadStreamToEnd() || decoderInputBuffer.b(536870912)) {
                                        this.u1 = this.t1;
                                    }
                                    decoderInputBuffer.h();
                                    if (decoderInputBuffer.b(268435456)) {
                                        P(decoderInputBuffer);
                                    }
                                    c0(decoderInputBuffer);
                                    I2 = I(decoderInputBuffer);
                                    try {
                                        if (zB) {
                                            mediaCodecAdapter.d(this.e1, decoderInputBuffer.Z, j, I2);
                                        } else {
                                            int i8 = this.e1;
                                            ByteBuffer byteBuffer6 = decoderInputBuffer.e0;
                                            byteBuffer6.getClass();
                                            mediaCodecAdapter.b(i8, byteBuffer6.limit(), I2, j);
                                        }
                                        this.e1 = -1;
                                        decoderInputBuffer.e0 = null;
                                        this.q1 = true;
                                        this.n1 = 0;
                                        this.A1.f5825c++;
                                        return true;
                                    } catch (MediaCodec.CryptoException e2) {
                                        throw o(e2, this.C0, false, Util.s(e2.getErrorCode()));
                                    }
                                }
                                decoderInputBuffer.d();
                                if (this.n1 == 2) {
                                    this.n1 = 1;
                                    return true;
                                }
                                return true;
                            }
                            this.u1 = this.t1;
                            if (this.n1 == 2) {
                                decoderInputBuffer.d();
                                this.n1 = 1;
                            }
                            this.v1 = true;
                            if (!this.q1) {
                                e0();
                                return false;
                            }
                            try {
                                if (this.c1) {
                                    this.r1 = true;
                                    mediaCodecAdapter.b(this.e1, 0, 4, 0L);
                                    this.e1 = -1;
                                    decoderInputBuffer.e0 = null;
                                    return false;
                                }
                            } catch (MediaCodec.CryptoException e3) {
                                throw o(e3, this.C0, false, Util.s(e3.getErrorCode()));
                            }
                        }
                    } catch (DecoderInputBuffer.InsufficientCapacityException e4) {
                        U(e4);
                        g0(0);
                        F();
                        return true;
                    }
                }
            } else {
                if (this.o1 == 1) {
                    if (!this.c1) {
                        this.r1 = true;
                        mediaCodecAdapter.b(this.e1, 0, 4, 0L);
                        this.e1 = -1;
                        decoderInputBuffer.e0 = null;
                    }
                    this.o1 = 2;
                    return false;
                }
                if (this.a1) {
                    this.a1 = false;
                    ByteBuffer byteBuffer7 = decoderInputBuffer.e0;
                    byteBuffer7.getClass();
                    byteBuffer7.put(E1);
                    mediaCodecAdapter.b(this.e1, 38, 0, 0L);
                    this.e1 = -1;
                    decoderInputBuffer.e0 = null;
                    this.q1 = true;
                    return true;
                }
                if (this.n1 == 1) {
                    i6 = 0;
                    while (true) {
                        format = this.M0;
                        format.getClass();
                        if (i6 < format.f5414p.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = (byte[]) this.M0.f5414p.get(i6);
                        ByteBuffer byteBuffer8 = decoderInputBuffer.e0;
                        byteBuffer8.getClass();
                        byteBuffer8.put(bArr2);
                        i6++;
                    }
                    this.n1 = 2;
                }
                ByteBuffer byteBuffer9 = decoderInputBuffer.e0;
                byteBuffer9.getClass();
                iPosition = byteBuffer9.position();
                formatHolder = this.Z;
                formatHolder.a();
                iX = x(formatHolder, decoderInputBuffer, 0);
                if (iX == -3) {
                    if (hasReadStreamToEnd()) {
                        this.u1 = this.t1;
                        return false;
                    }
                } else {
                    if (iX == -5) {
                        if (this.n1 == 2) {
                            decoderInputBuffer.d();
                            this.n1 = 1;
                        }
                        X(formatHolder);
                        return true;
                    }
                    if (decoderInputBuffer.b(4)) {
                        if (this.q1) {
                            zB = decoderInputBuffer.b(1073741824);
                            if (zB) {
                                cryptoInfo = decoderInputBuffer.Z;
                                if (iPosition == 0) {
                                    cryptoInfo.getClass();
                                } else {
                                    if (cryptoInfo.d == null) {
                                        int[] iArr3 = new int[1];
                                        cryptoInfo.d = iArr3;
                                        cryptoInfo.f5798i.numBytesOfClearData = iArr3;
                                    }
                                    int[] iArr4 = cryptoInfo.d;
                                    iArr4[0] = iArr4[0] + iPosition;
                                }
                            }
                            if (this.U0) {
                                byteBuffer = decoderInputBuffer.e0;
                                byteBuffer.getClass();
                                iPosition2 = byteBuffer.position();
                                i2 = 0;
                                i3 = 0;
                                while (true) {
                                    i4 = i2 + 1;
                                    if (i4 >= iPosition2) {
                                        byteBuffer.clear();
                                        break;
                                    }
                                    i5 = byteBuffer.get(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    if (i3 == 3) {
                                        if (i5 == 1) {
                                            ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
                                            byteBufferDuplicate2.position(i2 - 3);
                                            byteBufferDuplicate2.limit(iPosition2);
                                            byteBuffer.position(0);
                                            byteBuffer.put(byteBufferDuplicate2);
                                            break;
                                        }
                                    } else if (i5 == 0) {
                                        i3++;
                                    }
                                    if (i5 != 0) {
                                        i3 = 0;
                                    }
                                    i2 = i4;
                                }
                                byteBuffer2 = decoderInputBuffer.e0;
                                byteBuffer2.getClass();
                                if (byteBuffer2.position() != 0) {
                                    this.U0 = false;
                                }
                            }
                            j = decoderInputBuffer.g0;
                            if (this.x1) {
                                arrayDeque = this.A0;
                                if (arrayDeque.isEmpty()) {
                                    TimedValueQueue timedValueQueue3 = ((OutputStreamInfo) arrayDeque.peekLast()).d;
                                    Format format4 = this.C0;
                                    format4.getClass();
                                    timedValueQueue3.a(j, format4);
                                } else {
                                    TimedValueQueue timedValueQueue4 = this.B1.d;
                                    Format format5 = this.C0;
                                    format5.getClass();
                                    timedValueQueue4.a(j, format5);
                                }
                                this.x1 = false;
                            }
                            this.t1 = Math.max(this.t1, j);
                            if (hasReadStreamToEnd()) {
                                this.u1 = this.t1;
                            } else {
                                this.u1 = this.t1;
                            }
                            decoderInputBuffer.h();
                            if (decoderInputBuffer.b(268435456)) {
                                P(decoderInputBuffer);
                            }
                            c0(decoderInputBuffer);
                            I2 = I(decoderInputBuffer);
                            if (zB) {
                                mediaCodecAdapter.d(this.e1, decoderInputBuffer.Z, j, I2);
                            } else {
                                int i9 = this.e1;
                                ByteBuffer byteBuffer10 = decoderInputBuffer.e0;
                                byteBuffer10.getClass();
                                mediaCodecAdapter.b(i9, byteBuffer10.limit(), I2, j);
                            }
                            this.e1 = -1;
                            decoderInputBuffer.e0 = null;
                            this.q1 = true;
                            this.n1 = 0;
                            this.A1.f5825c++;
                            return true;
                        }
                        zB = decoderInputBuffer.b(1073741824);
                        if (zB) {
                            cryptoInfo = decoderInputBuffer.Z;
                            if (iPosition == 0) {
                                cryptoInfo.getClass();
                            } else {
                                if (cryptoInfo.d == null) {
                                    int[] iArr5 = new int[1];
                                    cryptoInfo.d = iArr5;
                                    cryptoInfo.f5798i.numBytesOfClearData = iArr5;
                                }
                                int[] iArr6 = cryptoInfo.d;
                                iArr6[0] = iArr6[0] + iPosition;
                            }
                        }
                        if (this.U0) {
                            byteBuffer = decoderInputBuffer.e0;
                            byteBuffer.getClass();
                            iPosition2 = byteBuffer.position();
                            i2 = 0;
                            i3 = 0;
                            while (true) {
                                i4 = i2 + 1;
                                if (i4 >= iPosition2) {
                                    byteBuffer.clear();
                                    break;
                                }
                                i5 = byteBuffer.get(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                if (i3 == 3) {
                                    if (i5 == 1) {
                                        ByteBuffer byteBufferDuplicate3 = byteBuffer.duplicate();
                                        byteBufferDuplicate3.position(i2 - 3);
                                        byteBufferDuplicate3.limit(iPosition2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(byteBufferDuplicate3);
                                        break;
                                    }
                                } else if (i5 == 0) {
                                    i3++;
                                }
                                if (i5 != 0) {
                                    i3 = 0;
                                }
                                i2 = i4;
                            }
                            byteBuffer2 = decoderInputBuffer.e0;
                            byteBuffer2.getClass();
                            if (byteBuffer2.position() != 0) {
                                this.U0 = false;
                            }
                        }
                        j = decoderInputBuffer.g0;
                        if (this.x1) {
                            arrayDeque = this.A0;
                            if (arrayDeque.isEmpty()) {
                                TimedValueQueue timedValueQueue5 = ((OutputStreamInfo) arrayDeque.peekLast()).d;
                                Format format6 = this.C0;
                                format6.getClass();
                                timedValueQueue5.a(j, format6);
                            } else {
                                TimedValueQueue timedValueQueue6 = this.B1.d;
                                Format format7 = this.C0;
                                format7.getClass();
                                timedValueQueue6.a(j, format7);
                            }
                            this.x1 = false;
                        }
                        this.t1 = Math.max(this.t1, j);
                        if (hasReadStreamToEnd()) {
                            this.u1 = this.t1;
                        } else {
                            this.u1 = this.t1;
                        }
                        decoderInputBuffer.h();
                        if (decoderInputBuffer.b(268435456)) {
                            P(decoderInputBuffer);
                        }
                        c0(decoderInputBuffer);
                        I2 = I(decoderInputBuffer);
                        if (zB) {
                            mediaCodecAdapter.d(this.e1, decoderInputBuffer.Z, j, I2);
                        } else {
                            int i10 = this.e1;
                            ByteBuffer byteBuffer11 = decoderInputBuffer.e0;
                            byteBuffer11.getClass();
                            mediaCodecAdapter.b(i10, byteBuffer11.limit(), I2, j);
                        }
                        this.e1 = -1;
                        decoderInputBuffer.e0 = null;
                        this.q1 = true;
                        this.n1 = 0;
                        this.A1.f5825c++;
                        return true;
                        return true;
                    }
                    this.u1 = this.t1;
                    if (this.n1 == 2) {
                        decoderInputBuffer.d();
                        this.n1 = 1;
                    }
                    this.v1 = true;
                    if (!this.q1) {
                        e0();
                        return false;
                    }
                    if (this.c1) {
                        this.r1 = true;
                        mediaCodecAdapter.b(this.e1, 0, 4, 0L);
                        this.e1 = -1;
                        decoderInputBuffer.e0 = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void F() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.L0;
            Assertions.f(mediaCodecAdapter);
            mediaCodecAdapter.flush();
        } finally {
            j0();
        }
    }

    public final boolean G() {
        if (this.L0 == null) {
            return false;
        }
        int i2 = this.p1;
        if (i2 == 3 || this.V0 || ((this.W0 && !this.s1) || (this.X0 && this.r1))) {
            h0();
            return true;
        }
        if (i2 == 2) {
            int i3 = Util.f5683a;
            Assertions.e(i3 >= 23);
            if (i3 >= 23) {
                try {
                    r0();
                } catch (ExoPlaybackException e2) {
                    Log.h("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e2);
                    h0();
                    return true;
                }
            }
        }
        F();
        return false;
    }

    public final List H(boolean z2) {
        Format format = this.C0;
        format.getClass();
        d dVar = this.t0;
        ArrayList arrayListL = L(dVar, format, z2);
        if (!arrayListL.isEmpty() || !z2) {
            return arrayListL;
        }
        ArrayList arrayListL2 = L(dVar, format, false);
        if (!arrayListL2.isEmpty()) {
            Log.g("MediaCodecRenderer", "Drm session requires secure decoder for " + format.m + ", but no secure decoder available. Trying to proceed with " + arrayListL2 + mo.ono);
        }
        return arrayListL2;
    }

    public int I(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    public boolean J() {
        return false;
    }

    public float K(float f, Format[] formatArr) {
        return -1.0f;
    }

    public abstract ArrayList L(d dVar, Format format, boolean z2);

    public abstract MediaCodecAdapter.Configuration M(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto, float f);

    public final long N() {
        return this.B1.f6303c;
    }

    public final long O() {
        return this.B1.f6302b;
    }

    public void P(DecoderInputBuffer decoderInputBuffer) {
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:89:0x018e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(MediaCodecInfo mediaCodecInfo, MediaCrypto mediaCrypto) {
        float fK;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        Format format = this.C0;
        format.getClass();
        String str = mediaCodecInfo.f6292a;
        int i4 = Util.f5683a;
        if (i4 < 23) {
            fK = -1.0f;
        } else {
            float f = this.K0;
            Format[] formatArr = this.k0;
            formatArr.getClass();
            fK = K(f, formatArr);
        }
        float f2 = fK > this.u0 ? fK : -1.0f;
        d0(format);
        this.h0.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodecAdapter.Configuration configurationM = M(mediaCodecInfo, format, mediaCrypto, f2);
        if (i4 >= 31) {
            PlayerId playerId = this.g0;
            playerId.getClass();
            Api31.a(configurationM, playerId);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            MediaCodecAdapter mediaCodecAdapterA = this.s0.a(configurationM);
            this.L0 = mediaCodecAdapterA;
            if (i4 >= 21) {
                Api21.a(mediaCodecAdapterA, new MediaCodecRendererCodecAdapterListener());
            }
            Trace.endSection();
            this.h0.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (mediaCodecInfo.d(format)) {
                i2 = 1;
            } else {
                String strC = Format.c(format);
                Locale locale = Locale.US;
                i2 = 1;
                Log.g("MediaCodecRenderer", androidx.datastore.preferences.protobuf.a.n("Format exceeds selected codec's capabilities [", strC, ", ", str, d9.i.f24752e));
            }
            this.S0 = mediaCodecInfo;
            this.P0 = f2;
            this.M0 = format;
            if (i4 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Util.d;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i3 = 2;
                } else if (i4 < 24) {
                    i3 = 0;
                } else {
                    i3 = 0;
                }
            } else if (i4 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i3 = 0;
            } else {
                String str3 = Util.f5684b;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    i3 = i2;
                } else {
                    i3 = 0;
                }
            }
            this.T0 = i3;
            Format format2 = this.M0;
            format2.getClass();
            this.U0 = (i4 < 21 && format2.f5414p.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str)) ? i2 : 0;
            this.V0 = (i4 == 19 && Util.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str))) ? i2 : 0;
            this.W0 = (i4 == 29 && "c2.android.aac.decoder".equals(str)) ? i2 : 0;
            if (i4 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
                if (i4 == 19) {
                    String str4 = Util.f5684b;
                    z2 = (("hb2000".equals(str4) || "stvm8".equals(str4)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) ? i2 : 0;
                }
            }
            this.X0 = z2;
            this.Y0 = (i4 == 21 && "OMX.google.aac.decoder".equals(str)) ? i2 : 0;
            if (i4 < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(Util.f5685c)) {
                String str5 = Util.f5684b;
                if (str5.startsWith("baffin") || str5.startsWith("grand") || str5.startsWith("fortuna") || str5.startsWith("gprimelte") || str5.startsWith("j2y18lte") || str5.startsWith("ms01")) {
                    z3 = i2;
                } else {
                    z3 = 0;
                }
            } else {
                z3 = 0;
            }
            this.Z0 = z3;
            String str6 = mediaCodecInfo.f6292a;
            this.c1 = ((i4 > 25 || !"OMX.rk.video_decoder.avc".equals(str6)) && (i4 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str6) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str6) || "OMX.bcm.vdec.avc.tunnel".equals(str6) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str6) || "OMX.bcm.vdec.hevc.tunnel".equals(str6) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str6))) && !(("Amazon".equals(Util.f5685c) && "AFTS".equals(Util.d) && mediaCodecInfo.f) || J())) ? 0 : i2;
            this.L0.getClass();
            if (this.i0 == 2) {
                this.h0.getClass();
                this.d1 = SystemClock.elapsedRealtime() + 1000;
            }
            this.A1.f5823a++;
            V(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean R(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        Format format = this.D0;
        return format == null || !Objects.equals(format.m, "audio/opus") || j - j2 > 80000;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2 A[Catch: DecoderInitializationException -> 0x00bc, TryCatch #1 {DecoderInitializationException -> 0x00bc, blocks: (B:56:0x00ae, B:58:0x00b2, B:64:0x00bf), top: B:76:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    public final void S() {
        Format format;
        DrmSession drmSession;
        if (this.L0 != null || this.j1 || (format = this.C0) == null) {
            return;
        }
        boolean z2 = true;
        boolean z3 = this.F0 == null && o0(format);
        String str = format.m;
        if (z3) {
            B();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            BatchBuffer batchBuffer = this.y0;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                batchBuffer.getClass();
                batchBuffer.l0 = 32;
            } else {
                batchBuffer.getClass();
                batchBuffer.l0 = 1;
            }
            this.j1 = true;
            return;
        }
        l0(this.F0);
        if (this.E0 == null) {
            try {
                drmSession = this.E0;
                if (drmSession != null) {
                    Assertions.f(str);
                    if (!drmSession.d(str)) {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                T(this.H0, z2);
            } catch (DecoderInitializationException e2) {
                throw o(e2, format, false, 4001);
            }
        } else {
            Assertions.e(this.H0 == null);
            DrmSession drmSession2 = this.E0;
            CryptoConfig cryptoConfigC = drmSession2.c();
            if (FrameworkCryptoConfig.f6235c && (cryptoConfigC instanceof FrameworkCryptoConfig)) {
                int state = drmSession2.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException error = drmSession2.getError();
                    error.getClass();
                    throw o(error, this.C0, false, error.X);
                }
                if (state == 4) {
                    if (cryptoConfigC == null) {
                        if (drmSession2.getError() != null) {
                        }
                    } else if (cryptoConfigC instanceof FrameworkCryptoConfig) {
                        FrameworkCryptoConfig frameworkCryptoConfig = (FrameworkCryptoConfig) cryptoConfigC;
                        this.H0 = new MediaCrypto(frameworkCryptoConfig.f6236a, frameworkCryptoConfig.f6237b);
                    }
                    drmSession = this.E0;
                    if (drmSession != null) {
                        Assertions.f(str);
                        if (!drmSession.d(str)) {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    T(this.H0, z2);
                }
            } else {
                if (cryptoConfigC == null) {
                    if (drmSession2.getError() != null) {
                    }
                } else if (cryptoConfigC instanceof FrameworkCryptoConfig) {
                    FrameworkCryptoConfig frameworkCryptoConfig2 = (FrameworkCryptoConfig) cryptoConfigC;
                    try {
                        this.H0 = new MediaCrypto(frameworkCryptoConfig2.f6236a, frameworkCryptoConfig2.f6237b);
                    } catch (MediaCryptoException e3) {
                        throw o(e3, this.C0, false, 6006);
                    }
                }
                drmSession = this.E0;
                if (drmSession != null) {
                    Assertions.f(str);
                    if (!drmSession.d(str)) {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                T(this.H0, z2);
            }
        }
        MediaCrypto mediaCrypto = this.H0;
        if (mediaCrypto == null || this.L0 != null) {
            return;
        }
        mediaCrypto.release();
        this.H0 = null;
    }

    public final void T(MediaCrypto mediaCrypto, boolean z2) throws DecoderInitializationException {
        String diagnosticInfo;
        Format format = this.C0;
        format.getClass();
        if (this.Q0 == null) {
            try {
                List listH = H(z2);
                this.Q0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listH;
                if (!arrayList.isEmpty()) {
                    this.Q0.add((MediaCodecInfo) arrayList.get(0));
                }
                this.R0 = null;
            } catch (MediaCodecUtil.DecoderQueryException e2) {
                throw new DecoderInitializationException(format, e2, z2, -49998);
            }
        }
        if (this.Q0.isEmpty()) {
            throw new DecoderInitializationException(format, null, z2, -49999);
        }
        ArrayDeque arrayDeque = this.Q0;
        arrayDeque.getClass();
        while (this.L0 == null) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) arrayDeque.peekFirst();
            mediaCodecInfo.getClass();
            if (!n0(mediaCodecInfo)) {
                return;
            }
            try {
                Q(mediaCodecInfo, mediaCrypto);
            } catch (Exception e3) {
                Log.h("MediaCodecRenderer", "Failed to initialize decoder: " + mediaCodecInfo, e3);
                arrayDeque.removeFirst();
                String str = "Decoder init failed: " + mediaCodecInfo.f6292a + ", " + format;
                if (Util.f5683a >= 21) {
                    diagnosticInfo = e3 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e3).getDiagnosticInfo() : null;
                } else {
                    diagnosticInfo = null;
                }
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(str, e3, format.m, z2, mediaCodecInfo, diagnosticInfo);
                U(decoderInitializationException);
                DecoderInitializationException decoderInitializationException2 = this.R0;
                if (decoderInitializationException2 == null) {
                    this.R0 = decoderInitializationException;
                } else {
                    this.R0 = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.X, decoderInitializationException2.f6298Y, decoderInitializationException2.Z, decoderInitializationException2.e0);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.R0;
                }
            }
        }
        this.Q0 = null;
    }

    public void U(Exception exc) {
    }

    public void W(String str) {
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        if (r4.d(r3) != false) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.media3.exoplayer.DecoderReuseEvaluation X(androidx.media3.exoplayer.FormatHolder r13) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.X(androidx.media3.exoplayer.FormatHolder):androidx.media3.exoplayer.DecoderReuseEvaluation");
    }

    public void Y(Format format, MediaFormat mediaFormat) {
    }

    public void Z(long j) {
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format) throws ExoPlaybackException {
        try {
            return p0(this.t0, format);
        } catch (MediaCodecUtil.DecoderQueryException e2) {
            throw o(e2, format, false, 4002);
        }
    }

    public void a0(long j) {
        this.C1 = j;
        while (true) {
            ArrayDeque arrayDeque = this.A0;
            if (arrayDeque.isEmpty() || j < ((OutputStreamInfo) arrayDeque.peek()).f6301a) {
                return;
            }
            OutputStreamInfo outputStreamInfo = (OutputStreamInfo) arrayDeque.poll();
            outputStreamInfo.getClass();
            m0(outputStreamInfo);
            b0();
        }
    }

    public void b0() {
    }

    public void c0(DecoderInputBuffer decoderInputBuffer) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void d(float f, float f2) {
        this.J0 = f;
        this.K0 = f2;
        q0(this.M0);
    }

    public void d0(Format format) {
    }

    public final void e0() throws ExoPlaybackException {
        int i2 = this.p1;
        if (i2 == 1) {
            F();
            return;
        }
        if (i2 == 2) {
            F();
            r0();
        } else if (i2 != 3) {
            this.w1 = true;
            i0();
        } else {
            h0();
            S();
        }
    }

    public abstract boolean f0(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i2, int i3, int i4, long j3, boolean z2, boolean z3, Format format);

    public final boolean g0(int i2) throws ExoPlaybackException {
        FormatHolder formatHolder = this.Z;
        formatHolder.a();
        DecoderInputBuffer decoderInputBuffer = this.v0;
        decoderInputBuffer.d();
        int iX = x(formatHolder, decoderInputBuffer, i2 | 4);
        if (iX == -5) {
            X(formatHolder);
            return true;
        }
        if (iX != -4 || !decoderInputBuffer.b(4)) {
            return false;
        }
        this.v1 = true;
        e0();
        return false;
    }

    public final void h0() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.L0;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.release();
                this.A1.f5824b++;
                MediaCodecInfo mediaCodecInfo = this.S0;
                mediaCodecInfo.getClass();
                W(mediaCodecInfo.f6292a);
            }
            this.L0 = null;
            try {
                MediaCrypto mediaCrypto = this.H0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.H0 = null;
                l0(null);
                k0();
            }
        } catch (Throwable th) {
            this.L0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.H0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.H0 = null;
                l0(null);
                k0();
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i2, Object obj) {
        if (i2 == 11) {
            this.G0 = (Renderer.WakeupListener) obj;
        }
    }

    public void i0() {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.w1;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        boolean zIsReady;
        if (this.C0 != null) {
            if (hasReadStreamToEnd()) {
                zIsReady = this.o0;
            } else {
                SampleStream sampleStream = this.j0;
                sampleStream.getClass();
                zIsReady = sampleStream.isReady();
            }
            if (!zIsReady) {
                if (!(this.f1 >= 0)) {
                    if (this.d1 != -9223372036854775807L) {
                        this.h0.getClass();
                        if (SystemClock.elapsedRealtime() < this.d1) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void j0() {
        this.e1 = -1;
        this.w0.e0 = null;
        this.f1 = -1;
        this.g1 = null;
        this.d1 = -9223372036854775807L;
        this.r1 = false;
        this.q1 = false;
        this.a1 = false;
        this.b1 = false;
        this.h1 = false;
        this.i1 = false;
        this.t1 = -9223372036854775807L;
        this.u1 = -9223372036854775807L;
        this.C1 = -9223372036854775807L;
        this.o1 = 0;
        this.p1 = 0;
        this.n1 = this.m1 ? 1 : 0;
    }

    public final void k0() {
        j0();
        this.z1 = null;
        this.Q0 = null;
        this.S0 = null;
        this.M0 = null;
        this.N0 = null;
        this.O0 = false;
        this.s1 = false;
        this.P0 = -1.0f;
        this.T0 = 0;
        this.U0 = false;
        this.V0 = false;
        this.W0 = false;
        this.X0 = false;
        this.Y0 = false;
        this.Z0 = false;
        this.c1 = false;
        this.m1 = false;
        this.n1 = 0;
    }

    public final void l0(DrmSession drmSession) {
        DrmSession.e(this.E0, drmSession);
        this.E0 = drmSession;
    }

    public final void m0(OutputStreamInfo outputStreamInfo) {
        this.B1 = outputStreamInfo;
        long j = outputStreamInfo.f6303c;
        if (j != -9223372036854775807L) {
            this.D1 = true;
            Z(j);
        }
    }

    public boolean n0(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    public boolean o0(Format format) {
        return false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void p() {
        this.C0 = null;
        m0(OutputStreamInfo.f6300e);
        this.A0.clear();
        G();
    }

    public abstract int p0(d dVar, Format format);

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void q(boolean z2, boolean z3) {
        this.A1 = new DecoderCounters();
    }

    public final boolean q0(Format format) {
        if (Util.f5683a >= 23 && this.L0 != null && this.p1 != 3 && this.i0 != 0) {
            float f = this.K0;
            format.getClass();
            Format[] formatArr = this.k0;
            formatArr.getClass();
            float fK = K(f, formatArr);
            float f2 = this.P0;
            if (f2 != fK) {
                if (fK == -1.0f) {
                    if (this.q1) {
                        this.o1 = 1;
                        this.p1 = 3;
                        return false;
                    }
                    h0();
                    S();
                    return false;
                }
                if (f2 != -1.0f || fK > this.u0) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fK);
                    MediaCodecAdapter mediaCodecAdapter = this.L0;
                    mediaCodecAdapter.getClass();
                    mediaCodecAdapter.a(bundle);
                    this.P0 = fK;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void r(long j, boolean z2) {
        this.v1 = false;
        this.w1 = false;
        this.y1 = false;
        if (this.j1) {
            this.y0.d();
            this.x0.d();
            this.k1 = false;
            OggOpusAudioPacketizer oggOpusAudioPacketizer = this.B0;
            oggOpusAudioPacketizer.getClass();
            oggOpusAudioPacketizer.f6175a = AudioProcessor.f5559a;
            oggOpusAudioPacketizer.f6177c = 0;
            oggOpusAudioPacketizer.f6176b = 2;
        } else if (G()) {
            S();
        }
        if (this.B1.d.h() > 0) {
            this.x1 = true;
        }
        this.B1.d.b();
        this.A0.clear();
    }

    public final void r0() throws ExoPlaybackException {
        DrmSession drmSession = this.F0;
        drmSession.getClass();
        CryptoConfig cryptoConfigC = drmSession.c();
        if (cryptoConfigC instanceof FrameworkCryptoConfig) {
            try {
                MediaCrypto mediaCrypto = this.H0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((FrameworkCryptoConfig) cryptoConfigC).f6237b);
            } catch (MediaCryptoException e2) {
                throw o(e2, this.C0, false, 6006);
            }
        }
        l0(this.F0);
        this.o1 = 0;
        this.p1 = 0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) throws ExoPlaybackException {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.y1) {
            this.y1 = false;
            e0();
        }
        ExoPlaybackException exoPlaybackException = this.z1;
        if (exoPlaybackException != null) {
            this.z1 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.w1) {
                i0();
                return;
            }
            if (this.C0 != null || g0(2)) {
                S();
                if (this.j1) {
                    Trace.beginSection("bypassRender");
                    while (y(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.L0 != null) {
                    this.h0.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (D(j, j2)) {
                        long j3 = this.I0;
                        if (j3 != -9223372036854775807L) {
                            this.h0.getClass();
                            z3 = SystemClock.elapsedRealtime() - jElapsedRealtime < j3;
                        }
                        if (!z3) {
                            break;
                        }
                    }
                    while (E()) {
                        long j4 = this.I0;
                        if (j4 != -9223372036854775807L) {
                            this.h0.getClass();
                            z2 = SystemClock.elapsedRealtime() - jElapsedRealtime < j4;
                        }
                        if (!z2) {
                            break;
                        }
                    }
                    Trace.endSection();
                } else {
                    DecoderCounters decoderCounters = this.A1;
                    int i2 = decoderCounters.d;
                    SampleStream sampleStream = this.j0;
                    sampleStream.getClass();
                    decoderCounters.d = i2 + sampleStream.skipData(j - this.l0);
                    g0(1);
                }
                synchronized (this.A1) {
                }
            }
        } catch (IllegalStateException e2) {
            int i3 = Util.f5683a;
            if (i3 < 21 || !(e2 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            U(e2);
            if (i3 >= 21) {
                if (e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).isRecoverable() : false) {
                    z4 = true;
                }
            }
            if (z4) {
                h0();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionA = A(e2, this.S0);
            throw o(mediaCodecDecoderExceptionA, this.C0, z4, mediaCodecDecoderExceptionA.X == 1101 ? 4006 : 4003);
        }
    }

    public final void s0(long j) {
        Format format = (Format) this.B1.d.f(j);
        if (format == null && this.D1 && this.N0 != null) {
            format = (Format) this.B1.d.e();
        }
        if (format != null) {
            this.D0 = format;
        } else if (!this.O0 || this.D0 == null) {
            return;
        }
        Format format2 = this.D0;
        format2.getClass();
        Y(format2, this.N0);
        this.O0 = false;
        this.D1 = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void t() {
        try {
            B();
            h0();
        } finally {
            DrmSession.e(this.F0, null);
            this.F0 = null;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void u() {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void v() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(androidx.media3.common.Format[] r13, long r14, long r16) {
        /*
            r12 = this;
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r13 = r12.B1
            long r0 = r13.f6303c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r4 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.m0(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.A0
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L52
            long r0 = r12.t1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L36
            long r4 = r12.C1
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L52
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L52
        L36:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r5 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.m0(r5)
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r13 = r12.B1
            long r13 = r13.f6303c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.b0()
        L51:
            return
        L52:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r5 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo
            long r6 = r12.t1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.w(androidx.media3.common.Format[], long, long):void");
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0312  */
    /* JADX WARN: Code duplicated, block: B:122:0x031a A[LOOP:0: B:25:0x008f->B:122:0x031a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    public final boolean y(long j, long j2) {
        BatchBuffer batchBuffer;
        ?? r5;
        Assertions.e(!this.w1);
        BatchBuffer batchBuffer2 = this.y0;
        if (batchBuffer2.j()) {
            ByteBuffer byteBuffer = batchBuffer2.e0;
            int i2 = this.f1;
            int i3 = batchBuffer2.k0;
            long j3 = batchBuffer2.g0;
            boolean zR = R(this.m0, batchBuffer2.j0);
            boolean zB = batchBuffer2.b(4);
            Format format = this.D0;
            format.getClass();
            batchBuffer = batchBuffer2;
            if (f0(j, j2, null, byteBuffer, i2, 0, i3, j3, zR, zB, format)) {
                a0(batchBuffer.j0);
                batchBuffer.d();
            }
        }
        batchBuffer = batchBuffer2;
        if (this.v1) {
            this.w1 = true;
            return false;
        }
        ?? r2 = 0;
        boolean z2 = this.k1;
        DecoderInputBuffer decoderInputBuffer = this.x0;
        if (z2) {
            Assertions.e(batchBuffer.i(decoderInputBuffer));
            this.k1 = false;
        }
        if (this.l1) {
            if (batchBuffer.j()) {
                return true;
            }
            B();
            this.l1 = false;
            S();
            if (!this.j1) {
                return false;
            }
        }
        Assertions.e(!this.v1);
        FormatHolder formatHolder = this.Z;
        formatHolder.a();
        decoderInputBuffer.d();
        while (true) {
            decoderInputBuffer.d();
            int iX = x(formatHolder, decoderInputBuffer, r2);
            if (iX == -5) {
                X(formatHolder);
            } else if (iX != -4) {
                if (iX != -3) {
                    throw new IllegalStateException();
                }
                if (hasReadStreamToEnd()) {
                    this.u1 = this.t1;
                }
            } else if (decoderInputBuffer.b(4)) {
                this.v1 = true;
                this.u1 = this.t1;
            } else {
                this.t1 = Math.max(this.t1, decoderInputBuffer.g0);
                if (hasReadStreamToEnd() || this.w0.b(536870912)) {
                    this.u1 = this.t1;
                }
                byte[] bArr = null;
                if (this.x1) {
                    Format format2 = this.C0;
                    format2.getClass();
                    this.D0 = format2;
                    if (Objects.equals(format2.m, "audio/opus") && !this.D0.f5414p.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.D0.f5414p.get(r2);
                        int i4 = (bArr2[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr2[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
                        Format format3 = this.D0;
                        format3.getClass();
                        Format.Builder builderA = format3.a();
                        builderA.C = i4;
                        this.D0 = new Format(builderA);
                    }
                    Y(this.D0, null);
                    this.x1 = r2;
                }
                decoderInputBuffer.h();
                Format format4 = this.D0;
                if (format4 != null && Objects.equals(format4.m, "audio/opus")) {
                    if (decoderInputBuffer.b(268435456)) {
                        decoderInputBuffer.f5801Y = this.D0;
                        P(decoderInputBuffer);
                    }
                    if (this.m0 - decoderInputBuffer.g0 <= 80000) {
                        Format format5 = this.D0;
                        format5.getClass();
                        OggOpusAudioPacketizer oggOpusAudioPacketizer = this.B0;
                        oggOpusAudioPacketizer.getClass();
                        decoderInputBuffer.e0.getClass();
                        if (decoderInputBuffer.e0.limit() - decoderInputBuffer.e0.position() != 0) {
                            if (oggOpusAudioPacketizer.f6176b == 2) {
                                ?? r4 = format5.f5414p;
                                if (r4.size() == 1 || r4.size() == 3) {
                                    bArr = (byte[]) r4.get(r2);
                                }
                            }
                            ByteBuffer byteBuffer2 = decoderInputBuffer.e0;
                            int iPosition = byteBuffer2.position();
                            int iLimit = byteBuffer2.limit();
                            int i5 = iLimit - iPosition;
                            int i6 = (i5 + 255) / 255;
                            int i7 = i6 + 27 + i5;
                            if (oggOpusAudioPacketizer.f6176b == 2) {
                                int length = bArr != null ? bArr.length + 28 : 47;
                                i7 = (length == true ? 1 : 0) + 44 + i7;
                                r5 = length;
                            } else {
                                r5 = r2;
                            }
                            int i8 = i7;
                            if (oggOpusAudioPacketizer.f6175a.capacity() < i8) {
                                oggOpusAudioPacketizer.f6175a = ByteBuffer.allocate(i8).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                oggOpusAudioPacketizer.f6175a.clear();
                            }
                            ByteBuffer byteBuffer3 = oggOpusAudioPacketizer.f6175a;
                            if (oggOpusAudioPacketizer.f6176b == 2) {
                                if (bArr != null) {
                                    OggOpusAudioPacketizer.a(byteBuffer3, 0L, 0, 1, true);
                                    long length2 = bArr.length;
                                    Preconditions.d(length2, (length2 >> 8) == 0, "out of range: %s");
                                    byteBuffer3.put((byte) length2);
                                    byteBuffer3.put(bArr);
                                    byteBuffer3.putInt(22, Util.l(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    byteBuffer3.put(OggOpusAudioPacketizer.d);
                                }
                                byteBuffer3.put(OggOpusAudioPacketizer.f6174e);
                            } else {
                                iLimit = iLimit;
                            }
                            int iB = oggOpusAudioPacketizer.f6177c + ((int) ((OpusUtil.b(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            oggOpusAudioPacketizer.f6177c = iB;
                            OggOpusAudioPacketizer.a(byteBuffer3, iB, oggOpusAudioPacketizer.f6176b, i6, false);
                            for (int i9 = 0; i9 < i6; i9++) {
                                if (i5 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i5 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i5);
                                    i5 = 0;
                                }
                            }
                            int i10 = iLimit;
                            while (iPosition < i10) {
                                byteBuffer3.put(byteBuffer2.get(iPosition));
                                iPosition++;
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (oggOpusAudioPacketizer.f6176b == 2) {
                                byteBuffer3.putInt(r5 + 66, Util.l(byteBuffer3.arrayOffset() + r5 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            } else {
                                byteBuffer3.putInt(22, Util.l(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            }
                            oggOpusAudioPacketizer.f6176b++;
                            oggOpusAudioPacketizer.f6175a = byteBuffer3;
                            decoderInputBuffer.d();
                            decoderInputBuffer.g(oggOpusAudioPacketizer.f6175a.remaining());
                            decoderInputBuffer.e0.put(oggOpusAudioPacketizer.f6175a);
                            decoderInputBuffer.h();
                        }
                    }
                }
                if (batchBuffer.j()) {
                    long j4 = this.m0;
                    if (R(j4, batchBuffer.j0) == R(j4, decoderInputBuffer.g0)) {
                        if (!batchBuffer.i(decoderInputBuffer)) {
                            r2 = 0;
                        }
                    }
                } else if (!batchBuffer.i(decoderInputBuffer)) {
                    r2 = 0;
                }
                this.k1 = true;
            }
            if (batchBuffer.j()) {
                batchBuffer.h();
            }
            return batchBuffer.j() || this.v1 || this.l1;
        }
    }

    public DecoderReuseEvaluation z(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return new DecoderReuseEvaluation(mediaCodecInfo.f6292a, format, format2, 0, 1);
    }

    public static class DecoderInitializationException extends Exception {
        public final String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final boolean f6298Y;
        public final MediaCodecInfo Z;
        public final String e0;

        public DecoderInitializationException(Format format, MediaCodecUtil.DecoderQueryException decoderQueryException, boolean z2, int i2) {
            this("Decoder init failed: [" + i2 + "], " + format, decoderQueryException, format.m, z2, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i2 < 0 ? "neg_" : "") + Math.abs(i2));
        }

        public DecoderInitializationException(String str, Throwable th, String str2, boolean z2, MediaCodecInfo mediaCodecInfo, String str3) {
            super(str, th);
            this.X = str2;
            this.f6298Y = z2;
            this.Z = mediaCodecInfo;
            this.e0 = str3;
        }
    }

    public void V(String str, long j, long j2) {
    }
}
