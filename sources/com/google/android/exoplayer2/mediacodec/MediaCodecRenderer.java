package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.FrameworkCryptoConfig;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.d9;
import com.thinkup.core.common.n.mo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {
    public static final byte[] B1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public DrmSession A0;
    public boolean A1;
    public MediaCrypto B0;
    public boolean C0;
    public final long D0;
    public float E0;
    public float F0;
    public MediaCodecAdapter G0;
    public Format H0;
    public MediaFormat I0;
    public boolean J0;
    public float K0;
    public ArrayDeque L0;
    public DecoderInitializationException M0;
    public MediaCodecInfo N0;
    public int O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public C2Mp3TimestampTracker Z0;
    public long a1;
    public int b1;
    public int c1;
    public ByteBuffer d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public int k1;
    public int l1;
    public int m1;
    public final MediaCodecAdapter.Factory n0;
    public boolean n1;
    public final d o0;
    public boolean o1;
    public final float p0;
    public boolean p1;
    public final DecoderInputBuffer q0;
    public long q1;
    public final DecoderInputBuffer r0;
    public long r1;
    public final DecoderInputBuffer s0;
    public boolean s1;
    public final BatchBuffer t0;
    public boolean t1;
    public final ArrayList u0;
    public boolean u1;
    public final MediaCodec.BufferInfo v0;
    public boolean v1;
    public final ArrayDeque w0;
    public ExoPlaybackException w1;
    public Format x0;
    public DecoderCounters x1;
    public Format y0;
    public OutputStreamInfo y1;
    public DrmSession z0;
    public long z1;

    public static final class Api31 {
        public static void a(MediaCodecAdapter.Configuration configuration, PlayerId playerId) {
            LogSessionId logSessionIdA = playerId.a();
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            configuration.f18167b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    public static final class OutputStreamInfo {
        public static final OutputStreamInfo d = new OutputStreamInfo(-9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimedValueQueue f18178c;

        public OutputStreamInfo(long j, long j2) {
            this.f18176a = j;
            this.f18177b = j2;
            TimedValueQueue timedValueQueue = new TimedValueQueue();
            timedValueQueue.f18973a = new long[10];
            timedValueQueue.f18974b = new Object[10];
            this.f18178c = timedValueQueue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecRenderer(int i2, MediaCodecAdapter.Factory factory, float f) {
        super(i2);
        d dVar = MediaCodecSelector.f18179a;
        this.n0 = factory;
        this.o0 = dVar;
        this.p0 = f;
        this.q0 = new DecoderInputBuffer(0);
        this.r0 = new DecoderInputBuffer(0);
        this.s0 = new DecoderInputBuffer(2);
        BatchBuffer batchBuffer = new BatchBuffer(2);
        batchBuffer.k0 = 32;
        this.t0 = batchBuffer;
        this.u0 = new ArrayList();
        this.v0 = new MediaCodec.BufferInfo();
        this.E0 = 1.0f;
        this.F0 = 1.0f;
        this.D0 = -9223372036854775807L;
        this.w0 = new ArrayDeque();
        c0(OutputStreamInfo.d);
        batchBuffer.g(0);
        batchBuffer.Z.order(ByteOrder.nativeOrder());
        this.K0 = -1.0f;
        this.O0 = 0;
        this.k1 = 0;
        this.b1 = -1;
        this.c1 = -1;
        this.a1 = -9223372036854775807L;
        this.q1 = -9223372036854775807L;
        this.r1 = -9223372036854775807L;
        this.z1 = -9223372036854775807L;
        this.l1 = 0;
        this.m1 = 0;
    }

    public final List A(boolean z2) {
        Format format = this.x0;
        d dVar = this.o0;
        ArrayList arrayListD = D(dVar, format, z2);
        if (!arrayListD.isEmpty() || !z2) {
            return arrayListD;
        }
        ArrayList arrayListD2 = D(dVar, this.x0, false);
        if (!arrayListD2.isEmpty()) {
            Log.g("MediaCodecRenderer", "Drm session requires secure decoder for " + this.x0.m0 + ", but no secure decoder available. Trying to proceed with " + arrayListD2 + mo.ono);
        }
        return arrayListD2;
    }

    public boolean B() {
        return false;
    }

    public float C(float f, Format[] formatArr) {
        return -1.0f;
    }

    public abstract ArrayList D(d dVar, Format format, boolean z2);

    public final FrameworkCryptoConfig E(DrmSession drmSession) throws ExoPlaybackException {
        CryptoConfig cryptoConfigC = drmSession.c();
        if (cryptoConfigC == null || (cryptoConfigC instanceof FrameworkCryptoConfig)) {
            return (FrameworkCryptoConfig) cryptoConfigC;
        }
        throw i(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + cryptoConfigC), this.x0, false, 6001);
    }

    public abstract MediaCodecAdapter.Configuration F(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto, float f);

    public final long G() {
        return this.y1.f18177b;
    }

    public void H(DecoderInputBuffer decoderInputBuffer) {
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x0180  */
    public final void I(MediaCodecInfo mediaCodecInfo, MediaCrypto mediaCrypto) {
        float fC;
        int i2;
        boolean z2;
        boolean z3;
        String str = mediaCodecInfo.f18170a;
        int i3 = Util.f18979a;
        if (i3 < 23) {
            fC = -1.0f;
        } else {
            float f = this.F0;
            Format[] formatArr = this.i0;
            formatArr.getClass();
            fC = C(f, formatArr);
        }
        float f2 = fC > this.p0 ? fC : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodecAdapter.Configuration configurationF = F(mediaCodecInfo, this.x0, mediaCrypto, f2);
        if (i3 >= 31) {
            PlayerId playerId = this.f0;
            playerId.getClass();
            Api31.a(configurationF, playerId);
        }
        try {
            TraceUtil.a("createCodec:" + str);
            this.G0 = this.n0.a(configurationF);
            TraceUtil.b();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!mediaCodecInfo.d(this.x0)) {
                String strC = Format.c(this.x0);
                Locale locale = Locale.US;
                Log.g("MediaCodecRenderer", androidx.datastore.preferences.protobuf.a.n("Format exceeds selected codec's capabilities [", strC, ", ", str, d9.i.f24752e));
            }
            this.N0 = mediaCodecInfo;
            this.K0 = f2;
            this.H0 = this.x0;
            if (i3 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Util.d;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i2 = 2;
                } else if (i3 < 24) {
                    i2 = 0;
                } else {
                    i2 = 0;
                }
            } else if (i3 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i2 = 0;
            } else {
                String str3 = Util.f18980b;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
            }
            this.O0 = i2;
            this.P0 = i3 < 21 && this.H0.o0.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.Q0 = i3 < 18 || (i3 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i3 == 19 && Util.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
            this.R0 = i3 == 29 && "c2.android.aac.decoder".equals(str);
            if (i3 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
                if (i3 <= 19) {
                    String str4 = Util.f18980b;
                    z2 = ("hb2000".equals(str4) || "stvm8".equals(str4)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str));
                }
            }
            this.S0 = z2;
            this.T0 = i3 == 21 && "OMX.google.aac.decoder".equals(str);
            if (i3 < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(Util.f18981c)) {
                String str5 = Util.f18980b;
                if (str5.startsWith("baffin") || str5.startsWith("grand") || str5.startsWith("fortuna") || str5.startsWith("gprimelte") || str5.startsWith("j2y18lte") || str5.startsWith("ms01")) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            this.U0 = z3;
            this.V0 = i3 <= 18 && this.H0.z0 == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
            String str6 = mediaCodecInfo.f18170a;
            this.Y0 = (i3 <= 25 && "OMX.rk.video_decoder.avc".equals(str6)) || (i3 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str6)) || ((i3 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str6) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str6) || "OMX.bcm.vdec.avc.tunnel".equals(str6) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str6) || "OMX.bcm.vdec.hevc.tunnel".equals(str6) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str6))) || (("Amazon".equals(Util.f18981c) && "AFTS".equals(Util.d) && mediaCodecInfo.f) || B()));
            this.G0.getClass();
            if ("c2.android.mp3.decoder".equals(str6)) {
                this.Z0 = new C2Mp3TimestampTracker();
            }
            if (this.g0 == 2) {
                this.a1 = SystemClock.elapsedRealtime() + 1000;
            }
            this.x1.f17426a++;
            M(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            TraceUtil.b();
            throw th;
        }
    }

    public final void J() throws ExoPlaybackException {
        Format format;
        if (this.G0 != null || this.g1 || (format = this.x0) == null) {
            return;
        }
        if (this.A0 == null && e0(format)) {
            Format format2 = this.x0;
            u();
            String str = format2.m0;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            BatchBuffer batchBuffer = this.t0;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                batchBuffer.getClass();
                batchBuffer.k0 = 32;
            } else {
                batchBuffer.getClass();
                batchBuffer.k0 = 1;
            }
            this.g1 = true;
            return;
        }
        b0(this.A0);
        String str2 = this.x0.m0;
        DrmSession drmSession = this.z0;
        if (drmSession != null) {
            if (this.B0 == null) {
                FrameworkCryptoConfig frameworkCryptoConfigE = E(drmSession);
                if (frameworkCryptoConfigE != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(frameworkCryptoConfigE.f17487a, frameworkCryptoConfigE.f17488b);
                        this.B0 = mediaCrypto;
                        this.C0 = !frameworkCryptoConfigE.f17489c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e2) {
                        throw i(e2, this.x0, false, 6006);
                    }
                } else if (this.z0.getError() == null) {
                    return;
                }
            }
            if (FrameworkCryptoConfig.d) {
                int state = this.z0.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException error = this.z0.getError();
                    error.getClass();
                    throw i(error, this.x0, false, error.X);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            K(this.B0, this.C0);
        } catch (DecoderInitializationException e3) {
            throw i(e3, this.x0, false, 4001);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x004c A[SYNTHETIC] */
    public final void K(MediaCrypto mediaCrypto, boolean z2) throws DecoderInitializationException {
        DecoderInitializationException decoderInitializationException;
        String str;
        DecoderInitializationException decoderInitializationException2;
        String diagnosticInfo;
        if (this.L0 == null) {
            try {
                List listA = A(z2);
                this.L0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listA;
                if (!arrayList.isEmpty()) {
                    this.L0.add((MediaCodecInfo) arrayList.get(0));
                }
                this.M0 = null;
            } catch (MediaCodecUtil.DecoderQueryException e2) {
                throw new DecoderInitializationException(this.x0, e2, z2, -49998);
            }
        }
        if (this.L0.isEmpty()) {
            throw new DecoderInitializationException(this.x0, null, z2, -49999);
        }
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) this.L0.peekFirst();
        while (this.G0 == null) {
            MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) this.L0.peekFirst();
            if (!d0(mediaCodecInfo2)) {
                return;
            }
            try {
                I(mediaCodecInfo2, mediaCrypto);
            } catch (Exception e3) {
                if (mediaCodecInfo2 != mediaCodecInfo) {
                    throw e3;
                }
                try {
                    Log.g("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    I(mediaCodecInfo2, mediaCrypto);
                } catch (Exception e4) {
                    Log.h("MediaCodecRenderer", "Failed to initialize decoder: " + mediaCodecInfo2, e4);
                    this.L0.removeFirst();
                    Format format = this.x0;
                    String str2 = "Decoder init failed: " + mediaCodecInfo2.f18170a + ", " + format;
                    String str3 = format.m0;
                    if (Util.f18979a >= 21) {
                        if (e4 instanceof MediaCodec.CodecException) {
                            diagnosticInfo = ((MediaCodec.CodecException) e4).getDiagnosticInfo();
                        } else {
                            diagnosticInfo = null;
                        }
                        str = diagnosticInfo;
                    } else {
                        str = null;
                    }
                    decoderInitializationException = new DecoderInitializationException(str2, e4, str3, z2, mediaCodecInfo2, str);
                    L(decoderInitializationException);
                    decoderInitializationException2 = this.M0;
                    if (decoderInitializationException2 == null) {
                        this.M0 = decoderInitializationException;
                    } else {
                        this.M0 = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.X, decoderInitializationException2.f18175Y, decoderInitializationException2.Z, decoderInitializationException2.e0);
                    }
                    if (!this.L0.isEmpty()) {
                        throw this.M0;
                    }
                }
                Log.h("MediaCodecRenderer", "Failed to initialize decoder: " + mediaCodecInfo2, e4);
                this.L0.removeFirst();
                Format format2 = this.x0;
                String str4 = "Decoder init failed: " + mediaCodecInfo2.f18170a + ", " + format2;
                String str5 = format2.m0;
                if (Util.f18979a >= 21) {
                    if (e4 instanceof MediaCodec.CodecException) {
                        diagnosticInfo = ((MediaCodec.CodecException) e4).getDiagnosticInfo();
                    } else {
                        diagnosticInfo = null;
                    }
                    str = diagnosticInfo;
                } else {
                    str = null;
                }
                decoderInitializationException = new DecoderInitializationException(str4, e4, str5, z2, mediaCodecInfo2, str);
                L(decoderInitializationException);
                decoderInitializationException2 = this.M0;
                if (decoderInitializationException2 == null) {
                    this.M0 = decoderInitializationException;
                } else {
                    this.M0 = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.X, decoderInitializationException2.f18175Y, decoderInitializationException2.Z, decoderInitializationException2.e0);
                }
                if (!this.L0.isEmpty()) {
                    throw this.M0;
                }
            }
        }
        this.L0 = null;
    }

    public void L(Exception exc) {
    }

    public void N(String str) {
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        if (r13 != false) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.decoder.DecoderReuseEvaluation O(com.google.android.exoplayer2.FormatHolder r13) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.O(com.google.android.exoplayer2.FormatHolder):com.google.android.exoplayer2.decoder.DecoderReuseEvaluation");
    }

    public void P(Format format, MediaFormat mediaFormat) {
    }

    public void Q(long j) {
    }

    public void R(long j) {
        this.z1 = j;
        while (true) {
            ArrayDeque arrayDeque = this.w0;
            if (arrayDeque.isEmpty() || j < ((OutputStreamInfo) arrayDeque.peek()).f18176a) {
                return;
            }
            c0((OutputStreamInfo) arrayDeque.poll());
            S();
        }
    }

    public void S() {
    }

    public void T(DecoderInputBuffer decoderInputBuffer) {
    }

    public final void U() throws ExoPlaybackException {
        int i2 = this.m1;
        if (i2 == 1) {
            y();
            return;
        }
        if (i2 == 2) {
            y();
            h0();
        } else if (i2 != 3) {
            this.t1 = true;
            Y();
        } else {
            X();
            J();
        }
    }

    public abstract boolean V(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i2, int i3, int i4, long j3, boolean z2, boolean z3, Format format);

    public final boolean W(int i2) throws ExoPlaybackException {
        FormatHolder formatHolder = this.f16996Y;
        formatHolder.a();
        DecoderInputBuffer decoderInputBuffer = this.q0;
        decoderInputBuffer.d();
        int iQ = q(formatHolder, decoderInputBuffer, i2 | 4);
        if (iQ == -5) {
            O(formatHolder);
            return true;
        }
        if (iQ != -4 || !decoderInputBuffer.b(4)) {
            return false;
        }
        this.s1 = true;
        U();
        return false;
    }

    public final void X() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.G0;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.release();
                this.x1.f17427b++;
                N(this.N0.f18170a);
            }
            this.G0 = null;
            try {
                MediaCrypto mediaCrypto = this.B0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.B0 = null;
                b0(null);
                a0();
            }
        } catch (Throwable th) {
            this.G0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.B0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.B0 = null;
                b0(null);
                a0();
            }
        }
    }

    public void Y() {
    }

    public void Z() {
        this.b1 = -1;
        this.r0.Z = null;
        this.c1 = -1;
        this.d1 = null;
        this.a1 = -9223372036854775807L;
        this.o1 = false;
        this.n1 = false;
        this.W0 = false;
        this.X0 = false;
        this.e1 = false;
        this.f1 = false;
        this.u0.clear();
        this.q1 = -9223372036854775807L;
        this.r1 = -9223372036854775807L;
        this.z1 = -9223372036854775807L;
        C2Mp3TimestampTracker c2Mp3TimestampTracker = this.Z0;
        if (c2Mp3TimestampTracker != null) {
            c2Mp3TimestampTracker.f18159a = 0L;
            c2Mp3TimestampTracker.f18160b = 0L;
            c2Mp3TimestampTracker.f18161c = false;
        }
        this.l1 = 0;
        this.m1 = 0;
        this.k1 = this.j1 ? 1 : 0;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int a(Format format) throws ExoPlaybackException {
        try {
            return f0(this.o0, format);
        } catch (MediaCodecUtil.DecoderQueryException e2) {
            throw i(e2, format, false, 4002);
        }
    }

    public final void a0() {
        Z();
        this.w1 = null;
        this.Z0 = null;
        this.L0 = null;
        this.N0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = false;
        this.p1 = false;
        this.K0 = -1.0f;
        this.O0 = 0;
        this.P0 = false;
        this.Q0 = false;
        this.R0 = false;
        this.S0 = false;
        this.T0 = false;
        this.U0 = false;
        this.V0 = false;
        this.Y0 = false;
        this.j1 = false;
        this.k1 = 0;
        this.C0 = false;
    }

    public final void b0(DrmSession drmSession) {
        DrmSession.g(this.z0, drmSession);
        this.z0 = drmSession;
    }

    public final void c0(OutputStreamInfo outputStreamInfo) {
        this.y1 = outputStreamInfo;
        long j = outputStreamInfo.f18177b;
        if (j != -9223372036854775807L) {
            this.A1 = true;
            Q(j);
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void d(float f, float f2) throws ExoPlaybackException {
        this.E0 = f;
        this.F0 = f2;
        g0(this.H0);
    }

    public boolean d0(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    public boolean e0(Format format) {
        return false;
    }

    public abstract int f0(d dVar, Format format);

    public final boolean g0(Format format) throws ExoPlaybackException {
        if (Util.f18979a >= 23 && this.G0 != null && this.m1 != 3 && this.g0 != 0) {
            float f = this.F0;
            Format[] formatArr = this.i0;
            formatArr.getClass();
            float fC = C(f, formatArr);
            float f2 = this.K0;
            if (f2 != fC) {
                if (fC == -1.0f) {
                    if (this.n1) {
                        this.l1 = 1;
                        this.m1 = 3;
                        return false;
                    }
                    X();
                    J();
                    return false;
                }
                if (f2 != -1.0f || fC > this.p0) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fC);
                    this.G0.a(bundle);
                    this.K0 = fC;
                }
            }
        }
        return true;
    }

    public final void h0() throws ExoPlaybackException {
        try {
            this.B0.setMediaDrmSession(E(this.A0).f17488b);
            b0(this.A0);
            this.l1 = 0;
            this.m1 = 0;
        } catch (MediaCryptoException e2) {
            throw i(e2, this.x0, false, 6006);
        }
    }

    public final void i0(long j) {
        Object objC;
        Object objC2;
        TimedValueQueue timedValueQueue = this.y1.f18178c;
        synchronized (timedValueQueue) {
            objC = null;
            objC2 = null;
            while (timedValueQueue.d > 0 && j - timedValueQueue.f18973a[timedValueQueue.f18975c] >= 0) {
                objC2 = timedValueQueue.c();
            }
        }
        Format format = (Format) objC2;
        if (format == null && this.A1 && this.I0 != null) {
            TimedValueQueue timedValueQueue2 = this.y1.f18178c;
            synchronized (timedValueQueue2) {
                if (timedValueQueue2.d != 0) {
                    objC = timedValueQueue2.c();
                }
            }
            format = (Format) objC;
        }
        if (format != null) {
            this.y0 = format;
        } else if (!this.J0 || this.y0 == null) {
            return;
        }
        P(this.y0, this.I0);
        this.J0 = false;
        this.A1 = false;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.t1;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        boolean zIsReady;
        if (this.x0 != null) {
            if (hasReadStreamToEnd()) {
                zIsReady = this.l0;
            } else {
                SampleStream sampleStream = this.h0;
                sampleStream.getClass();
                zIsReady = sampleStream.isReady();
            }
            if (!zIsReady) {
                if ((this.c1 >= 0) || (this.a1 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.a1)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void j() {
        this.x0 = null;
        c0(OutputStreamInfo.d);
        this.w0.clear();
        z();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void k(boolean z2, boolean z3) {
        this.x1 = new DecoderCounters();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void l(long j, boolean z2) {
        int i2;
        this.s1 = false;
        this.t1 = false;
        this.v1 = false;
        if (this.g1) {
            this.t0.d();
            this.s0.d();
            this.h1 = false;
        } else if (z()) {
            J();
        }
        TimedValueQueue timedValueQueue = this.y1.f18178c;
        synchronized (timedValueQueue) {
            i2 = timedValueQueue.d;
        }
        if (i2 > 0) {
            this.u1 = true;
        }
        TimedValueQueue timedValueQueue2 = this.y1.f18178c;
        synchronized (timedValueQueue2) {
            timedValueQueue2.f18975c = 0;
            timedValueQueue2.d = 0;
            Arrays.fill(timedValueQueue2.f18974b, (Object) null);
        }
        this.w0.clear();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void m() {
        try {
            u();
            X();
        } finally {
            DrmSession.g(this.A0, null);
            this.A0 = null;
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void n() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void o() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r2 >= r7) goto L14;
     */
    @Override // com.google.android.exoplayer2.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(com.google.android.exoplayer2.Format[] r6, long r7, long r9) {
        /*
            r5 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r6 = r5.y1
            long r6 = r6.f18177b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L16
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r6 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r6.<init>(r0, r9)
            r5.c0(r6)
            return
        L16:
            java.util.ArrayDeque r6 = r5.w0
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L42
            long r7 = r5.q1
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L2e
            long r2 = r5.z1
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L42
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L42
        L2e:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r6 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r6.<init>(r0, r9)
            r5.c0(r6)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r6 = r5.y1
            long r6 = r6.f18177b
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L41
            r5.S()
        L41:
            return
        L42:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r7 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo
            long r0 = r5.q1
            r7.<init>(r0, r9)
            r6.add(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.p(com.google.android.exoplayer2.Format[], long, long):void");
    }

    public final boolean r(long j, long j2) throws ExoPlaybackException {
        BatchBuffer batchBuffer;
        Assertions.d(!this.t1);
        BatchBuffer batchBuffer2 = this.t0;
        int i2 = batchBuffer2.j0;
        if (i2 > 0) {
            batchBuffer = batchBuffer2;
            if (!V(j, j2, null, batchBuffer2.Z, this.c1, 0, i2, batchBuffer2.f0, batchBuffer2.b(Integer.MIN_VALUE), batchBuffer2.b(4), this.y0)) {
                return false;
            }
            R(batchBuffer.i0);
            batchBuffer.d();
        } else {
            batchBuffer = batchBuffer2;
        }
        if (this.s1) {
            this.t1 = true;
            return false;
        }
        boolean z2 = this.h1;
        DecoderInputBuffer decoderInputBuffer = this.s0;
        if (z2) {
            Assertions.d(batchBuffer.i(decoderInputBuffer));
            this.h1 = false;
        }
        if (this.i1) {
            if (batchBuffer.j0 > 0) {
                return true;
            }
            u();
            this.i1 = false;
            J();
            if (!this.g1) {
                return false;
            }
        }
        Assertions.d(!this.s1);
        FormatHolder formatHolder = this.f16996Y;
        formatHolder.a();
        decoderInputBuffer.d();
        while (true) {
            decoderInputBuffer.d();
            int iQ = q(formatHolder, decoderInputBuffer, 0);
            if (iQ == -5) {
                O(formatHolder);
                break;
            }
            if (iQ != -4) {
                if (iQ == -3) {
                    break;
                }
                throw new IllegalStateException();
            }
            if (decoderInputBuffer.b(4)) {
                this.s1 = true;
                break;
            }
            if (this.u1) {
                Format format = this.x0;
                format.getClass();
                this.y0 = format;
                P(format, null);
                this.u1 = false;
            }
            decoderInputBuffer.h();
            if (!batchBuffer.i(decoderInputBuffer)) {
                this.h1 = true;
                break;
            }
        }
        if (batchBuffer.j0 > 0) {
            batchBuffer.h();
        }
        return batchBuffer.j0 > 0 || this.s1 || this.i1;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void render(long j, long j2) throws ExoPlaybackException {
        boolean z2 = false;
        if (this.v1) {
            this.v1 = false;
            U();
        }
        ExoPlaybackException exoPlaybackException = this.w1;
        if (exoPlaybackException != null) {
            this.w1 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.t1) {
                Y();
                return;
            }
            if (this.x0 != null || W(2)) {
                J();
                if (this.g1) {
                    TraceUtil.a("bypassRender");
                    while (r(j, j2)) {
                    }
                    TraceUtil.b();
                } else if (this.G0 != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    TraceUtil.a("drainAndFeed");
                    while (w(j, j2)) {
                        long j3 = this.D0;
                        if (!(j3 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j3)) {
                            break;
                        }
                    }
                    while (x()) {
                        long j4 = this.D0;
                        if (!(j4 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j4)) {
                            break;
                        }
                    }
                    TraceUtil.b();
                } else {
                    DecoderCounters decoderCounters = this.x1;
                    int i2 = decoderCounters.d;
                    SampleStream sampleStream = this.h0;
                    sampleStream.getClass();
                    decoderCounters.d = i2 + sampleStream.skipData(j - this.j0);
                    W(1);
                }
                synchronized (this.x1) {
                }
            }
        } catch (IllegalStateException e2) {
            int i3 = Util.f18979a;
            if (i3 < 21 || !(e2 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            L(e2);
            if (i3 >= 21) {
                if (e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).isRecoverable() : false) {
                    z2 = true;
                }
            }
            if (z2) {
                X();
            }
            throw i(t(e2, this.N0), this.x0, z2, 4003);
        }
    }

    public DecoderReuseEvaluation s(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return new DecoderReuseEvaluation(mediaCodecInfo.f18170a, format, format2, 0, 1);
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public MediaCodecDecoderException t(IllegalStateException illegalStateException, MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecDecoderException(illegalStateException, mediaCodecInfo);
    }

    public final void u() {
        this.i1 = false;
        this.t0.d();
        this.s0.d();
        this.h1 = false;
        this.g1 = false;
    }

    public final boolean v() throws ExoPlaybackException {
        if (!this.n1) {
            h0();
            return true;
        }
        this.l1 = 1;
        if (this.Q0 || this.S0) {
            this.m1 = 3;
            return false;
        }
        this.m1 = 2;
        return true;
    }

    public final boolean w(long j, long j2) throws ExoPlaybackException {
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean zV;
        int i2;
        boolean z3;
        boolean z4 = this.c1 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.v0;
        if (!z4) {
            if (this.T0 && this.o1) {
                try {
                    i2 = this.G0.i(bufferInfo2);
                } catch (IllegalStateException unused) {
                    U();
                    if (this.t1) {
                        X();
                    }
                }
            } else {
                i2 = this.G0.i(bufferInfo2);
            }
            if (i2 < 0) {
                if (i2 != -2) {
                    if (this.Y0 && (this.s1 || this.l1 == 2)) {
                        U();
                        return false;
                    }
                    return false;
                }
                this.p1 = true;
                MediaFormat mediaFormatC = this.G0.c();
                if (this.O0 != 0 && mediaFormatC.getInteger("width") == 32 && mediaFormatC.getInteger("height") == 32) {
                    this.X0 = true;
                    return true;
                }
                if (this.V0) {
                    mediaFormatC.setInteger("channel-count", 1);
                }
                this.I0 = mediaFormatC;
                this.J0 = true;
                return true;
            }
            if (this.X0) {
                this.X0 = false;
                this.G0.j(i2, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                U();
                return false;
            }
            this.c1 = i2;
            ByteBuffer byteBufferK = this.G0.k(i2);
            this.d1 = byteBufferK;
            if (byteBufferK != null) {
                byteBufferK.position(bufferInfo2.offset);
                this.d1.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.U0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j3 = this.q1;
                if (j3 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j3;
                }
            }
            long j4 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.u0;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z3 = false;
                    break;
                }
                if (((Long) arrayList.get(i3)).longValue() == j4) {
                    arrayList.remove(i3);
                    z3 = true;
                    break;
                }
                i3++;
            }
            this.e1 = z3;
            long j5 = this.r1;
            long j6 = bufferInfo2.presentationTimeUs;
            this.f1 = j5 == j6;
            i0(j6);
        }
        if (this.T0 && this.o1) {
            try {
                z2 = false;
                bufferInfo = bufferInfo2;
                try {
                    zV = V(j, j2, this.G0, this.d1, this.c1, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.e1, this.f1, this.y0);
                } catch (IllegalStateException unused2) {
                    U();
                    if (!this.t1) {
                        return z2;
                    }
                    X();
                    return z2;
                }
            } catch (IllegalStateException unused3) {
                z2 = false;
            }
        } else {
            z2 = false;
            bufferInfo = bufferInfo2;
            zV = V(j, j2, this.G0, this.d1, this.c1, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.e1, this.f1, this.y0);
        }
        if (!zV) {
            return z2;
        }
        R(bufferInfo.presentationTimeUs);
        boolean z5 = (bufferInfo.flags & 4) != 0 ? true : z2;
        this.c1 = -1;
        this.d1 = null;
        if (!z5) {
            return r2;
        }
        U();
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0190  */
    /* JADX WARN: Code duplicated, block: B:108:0x0198  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b7 A[LOOP:2: B:115:0x01b5->B:116:0x01b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:120:0x01db  */
    /* JADX WARN: Code duplicated, block: B:122:0x0218  */
    /* JADX WARN: Code duplicated, block: B:125:0x0221  */
    /* JADX WARN: Code duplicated, block: B:128:0x022e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0236  */
    /* JADX WARN: Code duplicated, block: B:132:0x0245  */
    /* JADX WARN: Code duplicated, block: B:136:0x0264  */
    /* JADX WARN: Code duplicated, block: B:139:0x026c A[Catch: CryptoException -> 0x0275, TRY_ENTER, TryCatch #2 {CryptoException -> 0x0275, blocks: (B:139:0x026c, B:143:0x0277), top: B:157:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0277 A[Catch: CryptoException -> 0x0275, TRY_LEAVE, TryCatch #2 {CryptoException -> 0x0275, blocks: (B:139:0x026c, B:143:0x0277), top: B:157:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:155:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[LOOP:0: B:30:0x0072->B:32:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e6 A[Catch: CryptoException -> 0x00f8, TRY_LEAVE, TryCatch #1 {CryptoException -> 0x00f8, blocks: (B:60:0x00e0, B:63:0x00e6), top: B:155:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:76:0x011c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0128  */
    /* JADX WARN: Code duplicated, block: B:80:0x012c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0130  */
    /* JADX WARN: Code duplicated, block: B:86:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0151  */
    /* JADX WARN: Code duplicated, block: B:92:0x015a  */
    /* JADX WARN: Code duplicated, block: B:93:0x015c  */
    /* JADX WARN: Code duplicated, block: B:96:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x017c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0180  */
    public final boolean x() throws ExoPlaybackException {
        int iPosition;
        FormatHolder formatHolder;
        int iQ;
        boolean zB;
        CryptoInfo cryptoInfo;
        long jMax;
        C2Mp3TimestampTracker c2Mp3TimestampTracker;
        ArrayDeque arrayDeque;
        Format format;
        ByteBuffer byteBuffer;
        int i2;
        int i3;
        int iB;
        ByteBuffer byteBuffer2;
        int iPosition2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        MediaCodecAdapter mediaCodecAdapter = this.G0;
        if (mediaCodecAdapter != null && this.l1 != 2 && !this.s1) {
            int i9 = this.b1;
            DecoderInputBuffer decoderInputBuffer = this.r0;
            if (i9 < 0) {
                int iH = mediaCodecAdapter.h();
                this.b1 = iH;
                if (iH >= 0) {
                    decoderInputBuffer.Z = this.G0.e(iH);
                    decoderInputBuffer.d();
                    if (this.l1 == 1) {
                        if (!this.Y0) {
                            this.o1 = true;
                            this.G0.b(this.b1, 0, 4, 0L);
                            this.b1 = -1;
                            decoderInputBuffer.Z = null;
                        }
                        this.l1 = 2;
                        return false;
                    }
                    if (this.W0) {
                        this.W0 = false;
                        decoderInputBuffer.Z.put(B1);
                        this.G0.b(this.b1, 38, 0, 0L);
                        this.b1 = -1;
                        decoderInputBuffer.Z = null;
                        this.n1 = true;
                        return true;
                    }
                    if (this.k1 == 1) {
                        for (i8 = 0; i8 < this.H0.o0.size(); i8++) {
                            decoderInputBuffer.Z.put((byte[]) this.H0.o0.get(i8));
                        }
                        this.k1 = 2;
                    }
                    iPosition = decoderInputBuffer.Z.position();
                    formatHolder = this.f16996Y;
                    formatHolder.a();
                    try {
                        iQ = q(formatHolder, decoderInputBuffer, 0);
                        if (hasReadStreamToEnd() || decoderInputBuffer.b(536870912)) {
                            this.r1 = this.q1;
                        }
                        if (iQ != -3) {
                            if (iQ == -5) {
                                if (this.k1 == 2) {
                                    decoderInputBuffer.d();
                                    this.k1 = 1;
                                }
                                O(formatHolder);
                                return true;
                            }
                            if (decoderInputBuffer.b(4)) {
                                if (!this.n1 || decoderInputBuffer.b(1)) {
                                    zB = decoderInputBuffer.b(1073741824);
                                    cryptoInfo = decoderInputBuffer.f17433Y;
                                    if (zB) {
                                        if (iPosition == 0) {
                                            cryptoInfo.getClass();
                                        } else {
                                            if (cryptoInfo.d == null) {
                                                int[] iArr = new int[1];
                                                cryptoInfo.d = iArr;
                                                cryptoInfo.f17423i.numBytesOfClearData = iArr;
                                            }
                                            int[] iArr2 = cryptoInfo.d;
                                            iArr2[0] = iArr2[0] + iPosition;
                                        }
                                    }
                                    if (this.P0 && !zB) {
                                        byteBuffer2 = decoderInputBuffer.Z;
                                        iPosition2 = byteBuffer2.position();
                                        i4 = 0;
                                        i5 = 0;
                                        while (true) {
                                            i6 = i4 + 1;
                                            if (i6 >= iPosition2) {
                                                byteBuffer2.clear();
                                                break;
                                            }
                                            i7 = byteBuffer2.get(i4) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                            if (i5 == 3) {
                                                if (i7 == 1 && (byteBuffer2.get(i6) & 31) == 7) {
                                                    ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                                                    byteBufferDuplicate.position(i4 - 3);
                                                    byteBufferDuplicate.limit(iPosition2);
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.put(byteBufferDuplicate);
                                                    break;
                                                }
                                            } else if (i7 == 0) {
                                                i5++;
                                            }
                                            if (i7 != 0) {
                                                i5 = 0;
                                            }
                                            i4 = i6;
                                        }
                                        if (decoderInputBuffer.Z.position() != 0) {
                                            this.P0 = false;
                                        }
                                    }
                                    jMax = decoderInputBuffer.f0;
                                    c2Mp3TimestampTracker = this.Z0;
                                    if (c2Mp3TimestampTracker != null) {
                                        format = this.x0;
                                        if (c2Mp3TimestampTracker.f18160b == 0) {
                                            c2Mp3TimestampTracker.f18159a = jMax;
                                        }
                                        if (!c2Mp3TimestampTracker.f18161c) {
                                            byteBuffer = decoderInputBuffer.Z;
                                            byteBuffer.getClass();
                                            i3 = 0;
                                            for (i2 = 0; i2 < 4; i2++) {
                                                i3 = (i3 << 8) | (byteBuffer.get(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                            }
                                            iB = MpegAudioUtil.b(i3);
                                            if (iB == -1) {
                                                c2Mp3TimestampTracker.f18161c = true;
                                                c2Mp3TimestampTracker.f18160b = 0L;
                                                c2Mp3TimestampTracker.f18159a = decoderInputBuffer.f0;
                                                Log.g("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                                jMax = decoderInputBuffer.f0;
                                            } else {
                                                jMax = Math.max(0L, ((c2Mp3TimestampTracker.f18160b - 529) * 1000000) / format.A0) + c2Mp3TimestampTracker.f18159a;
                                                c2Mp3TimestampTracker.f18160b += (long) iB;
                                            }
                                        }
                                        long j = this.q1;
                                        C2Mp3TimestampTracker c2Mp3TimestampTracker2 = this.Z0;
                                        Format format2 = this.x0;
                                        c2Mp3TimestampTracker2.getClass();
                                        this.q1 = Math.max(j, Math.max(0L, ((c2Mp3TimestampTracker2.f18160b - 529) * 1000000) / format2.A0) + c2Mp3TimestampTracker2.f18159a);
                                    }
                                    if (decoderInputBuffer.b(Integer.MIN_VALUE)) {
                                        this.u0.add(Long.valueOf(jMax));
                                    }
                                    if (this.u1) {
                                        arrayDeque = this.w0;
                                        if (arrayDeque.isEmpty()) {
                                            this.y1.f18178c.a(jMax, this.x0);
                                        } else {
                                            ((OutputStreamInfo) arrayDeque.peekLast()).f18178c.a(jMax, this.x0);
                                        }
                                        this.u1 = false;
                                    }
                                    this.q1 = Math.max(this.q1, jMax);
                                    decoderInputBuffer.h();
                                    if (decoderInputBuffer.b(268435456)) {
                                        H(decoderInputBuffer);
                                    }
                                    T(decoderInputBuffer);
                                    try {
                                        if (zB) {
                                            this.G0.l(this.b1, cryptoInfo, jMax);
                                        } else {
                                            this.G0.b(this.b1, decoderInputBuffer.Z.limit(), 0, jMax);
                                        }
                                        this.b1 = -1;
                                        decoderInputBuffer.Z = null;
                                        this.n1 = true;
                                        this.k1 = 0;
                                        this.x1.f17428c++;
                                        return true;
                                    } catch (MediaCodec.CryptoException e2) {
                                        throw i(e2, this.x0, false, Util.o(e2.getErrorCode()));
                                    }
                                }
                                decoderInputBuffer.d();
                                if (this.k1 == 2) {
                                    this.k1 = 1;
                                    return true;
                                }
                                return true;
                            }
                            if (this.k1 == 2) {
                                decoderInputBuffer.d();
                                this.k1 = 1;
                            }
                            this.s1 = true;
                            if (!this.n1) {
                                U();
                                return false;
                            }
                            try {
                                if (this.Y0) {
                                    this.o1 = true;
                                    this.G0.b(this.b1, 0, 4, 0L);
                                    this.b1 = -1;
                                    decoderInputBuffer.Z = null;
                                    return false;
                                }
                            } catch (MediaCodec.CryptoException e3) {
                                throw i(e3, this.x0, false, Util.o(e3.getErrorCode()));
                            }
                        }
                    } catch (DecoderInputBuffer.InsufficientCapacityException e4) {
                        L(e4);
                        W(0);
                        y();
                        return true;
                    }
                }
            } else {
                if (this.l1 == 1) {
                    if (!this.Y0) {
                        this.o1 = true;
                        this.G0.b(this.b1, 0, 4, 0L);
                        this.b1 = -1;
                        decoderInputBuffer.Z = null;
                    }
                    this.l1 = 2;
                    return false;
                }
                if (this.W0) {
                    this.W0 = false;
                    decoderInputBuffer.Z.put(B1);
                    this.G0.b(this.b1, 38, 0, 0L);
                    this.b1 = -1;
                    decoderInputBuffer.Z = null;
                    this.n1 = true;
                    return true;
                }
                if (this.k1 == 1) {
                    while (i8 < this.H0.o0.size()) {
                        decoderInputBuffer.Z.put((byte[]) this.H0.o0.get(i8));
                    }
                    this.k1 = 2;
                }
                iPosition = decoderInputBuffer.Z.position();
                formatHolder = this.f16996Y;
                formatHolder.a();
                iQ = q(formatHolder, decoderInputBuffer, 0);
                if (hasReadStreamToEnd()) {
                    this.r1 = this.q1;
                } else {
                    this.r1 = this.q1;
                }
                if (iQ != -3) {
                    if (iQ == -5) {
                        if (this.k1 == 2) {
                            decoderInputBuffer.d();
                            this.k1 = 1;
                        }
                        O(formatHolder);
                        return true;
                    }
                    if (decoderInputBuffer.b(4)) {
                        if (this.n1) {
                            zB = decoderInputBuffer.b(1073741824);
                            cryptoInfo = decoderInputBuffer.f17433Y;
                            if (zB) {
                                if (iPosition == 0) {
                                    cryptoInfo.getClass();
                                } else {
                                    if (cryptoInfo.d == null) {
                                        int[] iArr3 = new int[1];
                                        cryptoInfo.d = iArr3;
                                        cryptoInfo.f17423i.numBytesOfClearData = iArr3;
                                    }
                                    int[] iArr4 = cryptoInfo.d;
                                    iArr4[0] = iArr4[0] + iPosition;
                                }
                            }
                            if (this.P0) {
                                byteBuffer2 = decoderInputBuffer.Z;
                                iPosition2 = byteBuffer2.position();
                                i4 = 0;
                                i5 = 0;
                                while (true) {
                                    i6 = i4 + 1;
                                    if (i6 >= iPosition2) {
                                        byteBuffer2.clear();
                                        break;
                                    }
                                    i7 = byteBuffer2.get(i4) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    if (i5 == 3) {
                                        if (i7 == 1) {
                                            ByteBuffer byteBufferDuplicate2 = byteBuffer2.duplicate();
                                            byteBufferDuplicate2.position(i4 - 3);
                                            byteBufferDuplicate2.limit(iPosition2);
                                            byteBuffer2.position(0);
                                            byteBuffer2.put(byteBufferDuplicate2);
                                            break;
                                        }
                                    } else if (i7 == 0) {
                                        i5++;
                                    }
                                    if (i7 != 0) {
                                        i5 = 0;
                                    }
                                    i4 = i6;
                                }
                                if (decoderInputBuffer.Z.position() != 0) {
                                    this.P0 = false;
                                }
                            }
                            jMax = decoderInputBuffer.f0;
                            c2Mp3TimestampTracker = this.Z0;
                            if (c2Mp3TimestampTracker != null) {
                                format = this.x0;
                                if (c2Mp3TimestampTracker.f18160b == 0) {
                                    c2Mp3TimestampTracker.f18159a = jMax;
                                }
                                if (!c2Mp3TimestampTracker.f18161c) {
                                    byteBuffer = decoderInputBuffer.Z;
                                    byteBuffer.getClass();
                                    i3 = 0;
                                    while (i2 < 4) {
                                        i3 = (i3 << 8) | (byteBuffer.get(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    }
                                    iB = MpegAudioUtil.b(i3);
                                    if (iB == -1) {
                                        c2Mp3TimestampTracker.f18161c = true;
                                        c2Mp3TimestampTracker.f18160b = 0L;
                                        c2Mp3TimestampTracker.f18159a = decoderInputBuffer.f0;
                                        Log.g("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                        jMax = decoderInputBuffer.f0;
                                    } else {
                                        jMax = Math.max(0L, ((c2Mp3TimestampTracker.f18160b - 529) * 1000000) / format.A0) + c2Mp3TimestampTracker.f18159a;
                                        c2Mp3TimestampTracker.f18160b += (long) iB;
                                    }
                                }
                                long j2 = this.q1;
                                C2Mp3TimestampTracker c2Mp3TimestampTracker3 = this.Z0;
                                Format format3 = this.x0;
                                c2Mp3TimestampTracker3.getClass();
                                this.q1 = Math.max(j2, Math.max(0L, ((c2Mp3TimestampTracker3.f18160b - 529) * 1000000) / format3.A0) + c2Mp3TimestampTracker3.f18159a);
                            }
                            if (decoderInputBuffer.b(Integer.MIN_VALUE)) {
                                this.u0.add(Long.valueOf(jMax));
                            }
                            if (this.u1) {
                                arrayDeque = this.w0;
                                if (arrayDeque.isEmpty()) {
                                    ((OutputStreamInfo) arrayDeque.peekLast()).f18178c.a(jMax, this.x0);
                                } else {
                                    this.y1.f18178c.a(jMax, this.x0);
                                }
                                this.u1 = false;
                            }
                            this.q1 = Math.max(this.q1, jMax);
                            decoderInputBuffer.h();
                            if (decoderInputBuffer.b(268435456)) {
                                H(decoderInputBuffer);
                            }
                            T(decoderInputBuffer);
                            if (zB) {
                                this.G0.l(this.b1, cryptoInfo, jMax);
                            } else {
                                this.G0.b(this.b1, decoderInputBuffer.Z.limit(), 0, jMax);
                            }
                            this.b1 = -1;
                            decoderInputBuffer.Z = null;
                            this.n1 = true;
                            this.k1 = 0;
                            this.x1.f17428c++;
                            return true;
                        }
                        zB = decoderInputBuffer.b(1073741824);
                        cryptoInfo = decoderInputBuffer.f17433Y;
                        if (zB) {
                            if (iPosition == 0) {
                                cryptoInfo.getClass();
                            } else {
                                if (cryptoInfo.d == null) {
                                    int[] iArr5 = new int[1];
                                    cryptoInfo.d = iArr5;
                                    cryptoInfo.f17423i.numBytesOfClearData = iArr5;
                                }
                                int[] iArr6 = cryptoInfo.d;
                                iArr6[0] = iArr6[0] + iPosition;
                            }
                        }
                        if (this.P0) {
                            byteBuffer2 = decoderInputBuffer.Z;
                            iPosition2 = byteBuffer2.position();
                            i4 = 0;
                            i5 = 0;
                            while (true) {
                                i6 = i4 + 1;
                                if (i6 >= iPosition2) {
                                    byteBuffer2.clear();
                                    break;
                                }
                                i7 = byteBuffer2.get(i4) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                if (i5 == 3) {
                                    if (i7 == 1) {
                                        ByteBuffer byteBufferDuplicate3 = byteBuffer2.duplicate();
                                        byteBufferDuplicate3.position(i4 - 3);
                                        byteBufferDuplicate3.limit(iPosition2);
                                        byteBuffer2.position(0);
                                        byteBuffer2.put(byteBufferDuplicate3);
                                        break;
                                    }
                                } else if (i7 == 0) {
                                    i5++;
                                }
                                if (i7 != 0) {
                                    i5 = 0;
                                }
                                i4 = i6;
                            }
                            if (decoderInputBuffer.Z.position() != 0) {
                                this.P0 = false;
                            }
                        }
                        jMax = decoderInputBuffer.f0;
                        c2Mp3TimestampTracker = this.Z0;
                        if (c2Mp3TimestampTracker != null) {
                            format = this.x0;
                            if (c2Mp3TimestampTracker.f18160b == 0) {
                                c2Mp3TimestampTracker.f18159a = jMax;
                            }
                            if (!c2Mp3TimestampTracker.f18161c) {
                                byteBuffer = decoderInputBuffer.Z;
                                byteBuffer.getClass();
                                i3 = 0;
                                while (i2 < 4) {
                                    i3 = (i3 << 8) | (byteBuffer.get(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                }
                                iB = MpegAudioUtil.b(i3);
                                if (iB == -1) {
                                    c2Mp3TimestampTracker.f18161c = true;
                                    c2Mp3TimestampTracker.f18160b = 0L;
                                    c2Mp3TimestampTracker.f18159a = decoderInputBuffer.f0;
                                    Log.g("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                    jMax = decoderInputBuffer.f0;
                                } else {
                                    jMax = Math.max(0L, ((c2Mp3TimestampTracker.f18160b - 529) * 1000000) / format.A0) + c2Mp3TimestampTracker.f18159a;
                                    c2Mp3TimestampTracker.f18160b += (long) iB;
                                }
                            }
                            long j3 = this.q1;
                            C2Mp3TimestampTracker c2Mp3TimestampTracker4 = this.Z0;
                            Format format4 = this.x0;
                            c2Mp3TimestampTracker4.getClass();
                            this.q1 = Math.max(j3, Math.max(0L, ((c2Mp3TimestampTracker4.f18160b - 529) * 1000000) / format4.A0) + c2Mp3TimestampTracker4.f18159a);
                        }
                        if (decoderInputBuffer.b(Integer.MIN_VALUE)) {
                            this.u0.add(Long.valueOf(jMax));
                        }
                        if (this.u1) {
                            arrayDeque = this.w0;
                            if (arrayDeque.isEmpty()) {
                                ((OutputStreamInfo) arrayDeque.peekLast()).f18178c.a(jMax, this.x0);
                            } else {
                                this.y1.f18178c.a(jMax, this.x0);
                            }
                            this.u1 = false;
                        }
                        this.q1 = Math.max(this.q1, jMax);
                        decoderInputBuffer.h();
                        if (decoderInputBuffer.b(268435456)) {
                            H(decoderInputBuffer);
                        }
                        T(decoderInputBuffer);
                        if (zB) {
                            this.G0.l(this.b1, cryptoInfo, jMax);
                        } else {
                            this.G0.b(this.b1, decoderInputBuffer.Z.limit(), 0, jMax);
                        }
                        this.b1 = -1;
                        decoderInputBuffer.Z = null;
                        this.n1 = true;
                        this.k1 = 0;
                        this.x1.f17428c++;
                        return true;
                        return true;
                    }
                    if (this.k1 == 2) {
                        decoderInputBuffer.d();
                        this.k1 = 1;
                    }
                    this.s1 = true;
                    if (!this.n1) {
                        U();
                        return false;
                    }
                    if (this.Y0) {
                        this.o1 = true;
                        this.G0.b(this.b1, 0, 4, 0L);
                        this.b1 = -1;
                        decoderInputBuffer.Z = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void y() {
        try {
            this.G0.flush();
        } finally {
            Z();
        }
    }

    public final boolean z() {
        if (this.G0 == null) {
            return false;
        }
        int i2 = this.m1;
        if (i2 == 3 || this.Q0 || ((this.R0 && !this.p1) || (this.S0 && this.o1))) {
            X();
            return true;
        }
        if (i2 == 2) {
            int i3 = Util.f18979a;
            Assertions.d(i3 >= 23);
            if (i3 >= 23) {
                try {
                    h0();
                } catch (ExoPlaybackException e2) {
                    Log.h("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e2);
                    X();
                    return true;
                }
            }
        }
        y();
        return false;
    }

    public static class DecoderInitializationException extends Exception {
        public final String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final boolean f18175Y;
        public final MediaCodecInfo Z;
        public final String e0;

        public DecoderInitializationException(Format format, MediaCodecUtil.DecoderQueryException decoderQueryException, boolean z2, int i2) {
            this("Decoder init failed: [" + i2 + "], " + format, decoderQueryException, format.m0, z2, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i2 < 0 ? "neg_" : "") + Math.abs(i2));
        }

        public DecoderInitializationException(String str, Throwable th, String str2, boolean z2, MediaCodecInfo mediaCodecInfo, String str3) {
            super(str, th);
            this.X = str2;
            this.f18175Y = z2;
            this.Z = mediaCodecInfo;
            this.e0 = str3;
        }
    }

    public void M(String str, long j, long j2) {
    }
}
