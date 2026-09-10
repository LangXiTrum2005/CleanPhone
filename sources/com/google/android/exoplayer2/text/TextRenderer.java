package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.a;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.cea.Cea608Decoder;
import com.google.android.exoplayer2.text.cea.Cea708Decoder;
import com.google.android.exoplayer2.text.dvb.DvbDecoder;
import com.google.android.exoplayer2.text.pgs.PgsDecoder;
import com.google.android.exoplayer2.text.ssa.SsaDecoder;
import com.google.android.exoplayer2.text.subrip.SubripDecoder;
import com.google.android.exoplayer2.text.ttml.TtmlDecoder;
import com.google.android.exoplayer2.text.tx3g.Tx3gDecoder;
import com.google.android.exoplayer2.text.webvtt.Mp4WebvttDecoder;
import com.google.android.exoplayer2.text.webvtt.WebvttDecoder;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TextRenderer extends BaseRenderer implements Handler.Callback {
    public int A0;
    public long B0;
    public long C0;
    public long D0;
    public final Handler n0;
    public final TextOutput o0;
    public final SubtitleDecoderFactory p0;
    public final FormatHolder q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public int u0;
    public Format v0;
    public SubtitleDecoder w0;
    public SubtitleInputBuffer x0;
    public SubtitleOutputBuffer y0;
    public SubtitleOutputBuffer z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextRenderer(TextOutput textOutput, Looper looper) {
        Handler handler;
        super(3);
        SubtitleDecoderFactory subtitleDecoderFactory = SubtitleDecoderFactory.f18469a;
        this.o0 = textOutput;
        if (looper == null) {
            handler = null;
        } else {
            int i2 = Util.f18979a;
            handler = new Handler(looper, this);
        }
        this.n0 = handler;
        this.p0 = subtitleDecoderFactory;
        this.q0 = new FormatHolder();
        this.B0 = -9223372036854775807L;
        this.C0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int a(Format format) {
        ((SubtitleDecoderFactory.AnonymousClass1) this.p0).getClass();
        String str = format.m0;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return RendererCapabilities.c(format.H0 == 0 ? 4 : 2, 0, 0);
        }
        return MimeTypes.h(format.m0) ? RendererCapabilities.c(1, 0, 0) : RendererCapabilities.c(0, 0, 0);
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        CueGroup cueGroup = (CueGroup) message.obj;
        ImmutableList immutableList = cueGroup.X;
        TextOutput textOutput = this.o0;
        textOutput.onCues(immutableList);
        textOutput.onCues(cueGroup);
        return true;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public final boolean isEnded() {
        return this.s0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void j() {
        this.v0 = null;
        this.B0 = -9223372036854775807L;
        r();
        this.C0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        u();
        SubtitleDecoder subtitleDecoder = this.w0;
        subtitleDecoder.getClass();
        subtitleDecoder.release();
        this.w0 = null;
        this.u0 = 0;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void l(long j, boolean z2) {
        SubtitleDecoder dvbDecoder;
        byte b2 = 1;
        this.D0 = j;
        r();
        this.r0 = false;
        this.s0 = false;
        this.B0 = -9223372036854775807L;
        if (this.u0 == 0) {
            u();
            SubtitleDecoder subtitleDecoder = this.w0;
            subtitleDecoder.getClass();
            subtitleDecoder.flush();
            return;
        }
        u();
        SubtitleDecoder subtitleDecoder2 = this.w0;
        subtitleDecoder2.getClass();
        subtitleDecoder2.release();
        this.w0 = null;
        this.u0 = 0;
        this.t0 = true;
        Format format = this.v0;
        format.getClass();
        ((SubtitleDecoderFactory.AnonymousClass1) this.p0).getClass();
        String str = format.m0;
        if (str != null) {
            int i2 = format.E0;
            List list = format.o0;
            switch (str.hashCode()) {
                case -1351681404:
                    b2 = !str.equals("application/dvbsubs") ? (byte) -1 : (byte) 0;
                    break;
                case -1248334819:
                    if (!str.equals("application/pgs")) {
                        b2 = -1;
                    }
                    break;
                case -1026075066:
                    b2 = !str.equals("application/x-mp4-vtt") ? (byte) -1 : (byte) 2;
                    break;
                case -1004728940:
                    b2 = !str.equals("text/vtt") ? (byte) -1 : (byte) 3;
                    break;
                case 691401887:
                    b2 = !str.equals("application/x-quicktime-tx3g") ? (byte) -1 : (byte) 4;
                    break;
                case 822864842:
                    b2 = !str.equals("text/x-ssa") ? (byte) -1 : (byte) 5;
                    break;
                case 930165504:
                    b2 = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 6;
                    break;
                case 1201784583:
                    b2 = !str.equals("text/x-exoplayer-cues") ? (byte) -1 : (byte) 7;
                    break;
                case 1566015601:
                    b2 = !str.equals("application/cea-608") ? (byte) -1 : (byte) 8;
                    break;
                case 1566016562:
                    b2 = !str.equals("application/cea-708") ? (byte) -1 : (byte) 9;
                    break;
                case 1668750253:
                    b2 = !str.equals("application/x-subrip") ? (byte) -1 : (byte) 10;
                    break;
                case 1693976202:
                    b2 = !str.equals("application/ttml+xml") ? (byte) -1 : (byte) 11;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    dvbDecoder = new DvbDecoder(list);
                    break;
                case 1:
                    dvbDecoder = new PgsDecoder();
                    break;
                case 2:
                    dvbDecoder = new Mp4WebvttDecoder();
                    break;
                case 3:
                    dvbDecoder = new WebvttDecoder();
                    break;
                case 4:
                    dvbDecoder = new Tx3gDecoder(list);
                    break;
                case 5:
                    dvbDecoder = new SsaDecoder(list);
                    break;
                case 6:
                case 8:
                    dvbDecoder = new Cea608Decoder(str, i2);
                    break;
                case 7:
                    dvbDecoder = new ExoplayerCuesDecoder();
                    break;
                case 9:
                    dvbDecoder = new Cea708Decoder(i2, list);
                    break;
                case 10:
                    dvbDecoder = new SubripDecoder();
                    break;
                case 11:
                    dvbDecoder = new TtmlDecoder();
                    break;
            }
            this.w0 = dvbDecoder;
            return;
        }
        throw new IllegalArgumentException(a.C("Attempted to create decoder for unsupported MIME type: ", str));
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void p(Format[] formatArr, long j, long j2) {
        SubtitleDecoder dvbDecoder;
        SubtitleDecoder pgsDecoder;
        this.C0 = j2;
        byte b2 = 0;
        Format format = formatArr[0];
        this.v0 = format;
        if (this.w0 != null) {
            this.u0 = 1;
            return;
        }
        this.t0 = true;
        format.getClass();
        ((SubtitleDecoderFactory.AnonymousClass1) this.p0).getClass();
        String str = format.m0;
        if (str != null) {
            int i2 = format.E0;
            List list = format.o0;
            switch (str.hashCode()) {
                case -1351681404:
                    if (!str.equals("application/dvbsubs")) {
                        b2 = -1;
                    }
                    break;
                case -1248334819:
                    b2 = !str.equals("application/pgs") ? (byte) -1 : (byte) 1;
                    break;
                case -1026075066:
                    b2 = !str.equals("application/x-mp4-vtt") ? (byte) -1 : (byte) 2;
                    break;
                case -1004728940:
                    b2 = !str.equals("text/vtt") ? (byte) -1 : (byte) 3;
                    break;
                case 691401887:
                    b2 = !str.equals("application/x-quicktime-tx3g") ? (byte) -1 : (byte) 4;
                    break;
                case 822864842:
                    b2 = !str.equals("text/x-ssa") ? (byte) -1 : (byte) 5;
                    break;
                case 930165504:
                    b2 = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 6;
                    break;
                case 1201784583:
                    b2 = !str.equals("text/x-exoplayer-cues") ? (byte) -1 : (byte) 7;
                    break;
                case 1566015601:
                    b2 = !str.equals("application/cea-608") ? (byte) -1 : (byte) 8;
                    break;
                case 1566016562:
                    b2 = !str.equals("application/cea-708") ? (byte) -1 : (byte) 9;
                    break;
                case 1668750253:
                    b2 = !str.equals("application/x-subrip") ? (byte) -1 : (byte) 10;
                    break;
                case 1693976202:
                    b2 = !str.equals("application/ttml+xml") ? (byte) -1 : (byte) 11;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    dvbDecoder = new DvbDecoder(list);
                    pgsDecoder = dvbDecoder;
                    this.w0 = pgsDecoder;
                    return;
                case 1:
                    pgsDecoder = new PgsDecoder();
                    this.w0 = pgsDecoder;
                    return;
                case 2:
                    pgsDecoder = new Mp4WebvttDecoder();
                    this.w0 = pgsDecoder;
                    return;
                case 3:
                    pgsDecoder = new WebvttDecoder();
                    this.w0 = pgsDecoder;
                    return;
                case 4:
                    dvbDecoder = new Tx3gDecoder(list);
                    pgsDecoder = dvbDecoder;
                    this.w0 = pgsDecoder;
                    return;
                case 5:
                    dvbDecoder = new SsaDecoder(list);
                    pgsDecoder = dvbDecoder;
                    this.w0 = pgsDecoder;
                    return;
                case 6:
                case 8:
                    pgsDecoder = new Cea608Decoder(str, i2);
                    this.w0 = pgsDecoder;
                    return;
                case 7:
                    pgsDecoder = new ExoplayerCuesDecoder();
                    this.w0 = pgsDecoder;
                    return;
                case 9:
                    dvbDecoder = new Cea708Decoder(i2, list);
                    pgsDecoder = dvbDecoder;
                    this.w0 = pgsDecoder;
                    return;
                case 10:
                    pgsDecoder = new SubripDecoder();
                    this.w0 = pgsDecoder;
                    return;
                case 11:
                    pgsDecoder = new TtmlDecoder();
                    this.w0 = pgsDecoder;
                    return;
            }
        }
        throw new IllegalArgumentException(a.C("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final void r() {
        CueGroup cueGroup = new CueGroup(ImmutableList.x(), t(this.D0));
        Handler handler = this.n0;
        if (handler != null) {
            handler.obtainMessage(0, cueGroup).sendToTarget();
            return;
        }
        TextOutput textOutput = this.o0;
        textOutput.onCues(cueGroup.X);
        textOutput.onCues(cueGroup);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x0205 A[PHI: r26
  0x0205: PHI (r26v20 java.lang.String) = 
  (r26v7 java.lang.String)
  (r26v8 java.lang.String)
  (r26v9 java.lang.String)
  (r26v10 java.lang.String)
  (r26v11 java.lang.String)
  (r26v12 java.lang.String)
  (r26v13 java.lang.String)
  (r26v14 java.lang.String)
  (r26v15 java.lang.String)
  (r26v16 java.lang.String)
  (r26v17 java.lang.String)
  (r26v18 java.lang.String)
  (r26v21 java.lang.String)
 binds: [B:158:0x0296, B:154:0x028b, B:150:0x0280, B:146:0x0274, B:142:0x0269, B:138:0x025e, B:134:0x0253, B:130:0x0248, B:126:0x023a, B:122:0x022c, B:118:0x021e, B:114:0x0210, B:111:0x0203] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:181:0x0302  */
    /* JADX WARN: Code duplicated, block: B:22:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:252:0x0465  */
    @Override // com.google.android.exoplayer2.Renderer
    public final void render(long j, long j2) {
        boolean z2;
        Object obj;
        String str;
        long j3;
        Object obj2;
        char c2;
        byte b2;
        SubtitleDecoder dvbDecoder;
        SubtitleDecoder pgsDecoder;
        long j4;
        long eventTime;
        byte b3;
        SubtitleDecoder dvbDecoder2;
        SubtitleDecoder dvbDecoder3;
        SubtitleDecoder pgsDecoder2;
        FormatHolder formatHolder = this.q0;
        this.D0 = j;
        if (this.l0) {
            long j5 = this.B0;
            if (j5 != -9223372036854775807L && j >= j5) {
                u();
                this.s0 = true;
            }
        }
        if (this.s0) {
            return;
        }
        SubtitleOutputBuffer subtitleOutputBuffer = this.z0;
        SubtitleDecoderFactory subtitleDecoderFactory = this.p0;
        if (subtitleOutputBuffer == null) {
            SubtitleDecoder subtitleDecoder = this.w0;
            subtitleDecoder.getClass();
            subtitleDecoder.setPositionUs(j);
            try {
                SubtitleDecoder subtitleDecoder2 = this.w0;
                subtitleDecoder2.getClass();
                this.z0 = (SubtitleOutputBuffer) subtitleDecoder2.dequeueOutputBuffer();
            } catch (SubtitleDecoderException e2) {
                Log.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.v0, e2);
                r();
                u();
                SubtitleDecoder subtitleDecoder3 = this.w0;
                subtitleDecoder3.getClass();
                subtitleDecoder3.release();
                this.w0 = null;
                this.u0 = 0;
                this.t0 = true;
                Format format = this.v0;
                format.getClass();
                ((SubtitleDecoderFactory.AnonymousClass1) subtitleDecoderFactory).getClass();
                String str2 = format.m0;
                if (str2 != null) {
                    int i2 = format.E0;
                    List list = format.o0;
                    switch (str2) {
                        case "application/dvbsubs":
                            dvbDecoder3 = new DvbDecoder(list);
                            pgsDecoder2 = dvbDecoder3;
                            this.w0 = pgsDecoder2;
                            return;
                        case "application/pgs":
                            pgsDecoder2 = new PgsDecoder();
                            this.w0 = pgsDecoder2;
                            return;
                        case "application/x-mp4-vtt":
                            pgsDecoder2 = new Mp4WebvttDecoder();
                            this.w0 = pgsDecoder2;
                            return;
                        case "text/vtt":
                            pgsDecoder2 = new WebvttDecoder();
                            this.w0 = pgsDecoder2;
                            return;
                        case "application/x-quicktime-tx3g":
                            dvbDecoder3 = new Tx3gDecoder(list);
                            pgsDecoder2 = dvbDecoder3;
                            this.w0 = pgsDecoder2;
                            return;
                        case "text/x-ssa":
                            dvbDecoder3 = new SsaDecoder(list);
                            pgsDecoder2 = dvbDecoder3;
                            this.w0 = pgsDecoder2;
                            return;
                        case "application/x-mp4-cea-608":
                        case "application/cea-608":
                            pgsDecoder2 = new Cea608Decoder(str2, i2);
                            this.w0 = pgsDecoder2;
                            return;
                        case "text/x-exoplayer-cues":
                            pgsDecoder2 = new ExoplayerCuesDecoder();
                            this.w0 = pgsDecoder2;
                            return;
                        case "application/cea-708":
                            dvbDecoder3 = new Cea708Decoder(i2, list);
                            pgsDecoder2 = dvbDecoder3;
                            this.w0 = pgsDecoder2;
                            return;
                        case "application/x-subrip":
                            pgsDecoder2 = new SubripDecoder();
                            this.w0 = pgsDecoder2;
                            return;
                        case "application/ttml+xml":
                            pgsDecoder2 = new TtmlDecoder();
                            this.w0 = pgsDecoder2;
                            return;
                    }
                }
                throw new IllegalArgumentException(a.C("Attempted to create decoder for unsupported MIME type: ", str2));
            }
        }
        FormatHolder formatHolder2 = formatHolder;
        if (this.g0 != 2) {
            return;
        }
        if (this.y0 != null) {
            long jS = s();
            z2 = false;
            while (jS <= j) {
                this.A0++;
                jS = s();
                z2 = true;
            }
        } else {
            z2 = false;
        }
        SubtitleOutputBuffer subtitleOutputBuffer2 = this.z0;
        if (subtitleOutputBuffer2 == null) {
            obj = "application/dvbsubs";
            str = "Attempted to create decoder for unsupported MIME type: ";
            j3 = j;
        } else {
            if (subtitleOutputBuffer2.b(4)) {
                if (!z2 && s() == Long.MAX_VALUE) {
                    if (this.u0 == 2) {
                        u();
                        SubtitleDecoder subtitleDecoder4 = this.w0;
                        subtitleDecoder4.getClass();
                        subtitleDecoder4.release();
                        this.w0 = null;
                        this.u0 = 0;
                        this.t0 = true;
                        Format format2 = this.v0;
                        format2.getClass();
                        ((SubtitleDecoderFactory.AnonymousClass1) subtitleDecoderFactory).getClass();
                        String str3 = format2.m0;
                        if (str3 != null) {
                            z2 = z2;
                            int i3 = format2.E0;
                            List list2 = format2.o0;
                            switch (str3.hashCode()) {
                                case -1351681404:
                                    str = "Attempted to create decoder for unsupported MIME type: ";
                                    if (!str3.equals("application/dvbsubs")) {
                                        b3 = -1;
                                    } else {
                                        b3 = 0;
                                    }
                                    break;
                                case -1248334819:
                                    str = "Attempted to create decoder for unsupported MIME type: ";
                                    if (!str3.equals("application/pgs")) {
                                        b3 = -1;
                                    } else {
                                        b3 = 1;
                                    }
                                    break;
                                case -1026075066:
                                    str = "Attempted to create decoder for unsupported MIME type: ";
                                    if (!str3.equals("application/x-mp4-vtt")) {
                                        b3 = -1;
                                    } else {
                                        b3 = 2;
                                    }
                                    break;
                                case -1004728940:
                                    str = "Attempted to create decoder for unsupported MIME type: ";
                                    if (!str3.equals("text/vtt")) {
                                        b3 = -1;
                                    } else {
                                        b3 = 3;
                                    }
                                    break;
                                case 691401887:
                                    str = "Attempted to create decoder for unsupported MIME type: ";
                                    if (!str3.equals("application/x-quicktime-tx3g")) {
                                        b3 = -1;
                                    } else {
                                        b3 = 4;
                                    }
                                    break;
                                case 822864842:
                                    str = "Attempted to create decoder for unsupported MIME type: ";
                                    if (!str3.equals("text/x-ssa")) {
                                        b3 = -1;
                                    } else {
                                        b3 = 5;
                                    }
                                    break;
                                case 930165504:
                                    str = "Attempted to create decoder for unsupported MIME type: ";
                                    if (!str3.equals("application/x-mp4-cea-608")) {
                                        b3 = -1;
                                    } else {
                                        b3 = 6;
                                    }
                                    break;
                                case 1201784583:
                                    str = "Attempted to create decoder for unsupported MIME type: ";
                                    if (!str3.equals("text/x-exoplayer-cues")) {
                                        b3 = -1;
                                    } else {
                                        b3 = 7;
                                    }
                                    break;
                                case 1566015601:
                                    str = "Attempted to create decoder for unsupported MIME type: ";
                                    if (!str3.equals("application/cea-608")) {
                                        b3 = -1;
                                    } else {
                                        b3 = 8;
                                    }
                                    break;
                                case 1566016562:
                                    str = "Attempted to create decoder for unsupported MIME type: ";
                                    if (!str3.equals("application/cea-708")) {
                                        b3 = -1;
                                    } else {
                                        b3 = 9;
                                    }
                                    break;
                                case 1668750253:
                                    str = "Attempted to create decoder for unsupported MIME type: ";
                                    if (!str3.equals("application/x-subrip")) {
                                        b3 = -1;
                                    } else {
                                        b3 = 10;
                                    }
                                    break;
                                case 1693976202:
                                    str = "Attempted to create decoder for unsupported MIME type: ";
                                    if (!str3.equals("application/ttml+xml")) {
                                        b3 = -1;
                                    } else {
                                        b3 = 11;
                                    }
                                    break;
                                default:
                                    str = "Attempted to create decoder for unsupported MIME type: ";
                                    b3 = -1;
                                    break;
                            }
                            switch (b3) {
                                case 0:
                                    dvbDecoder2 = new DvbDecoder(list2);
                                    break;
                                case 1:
                                    dvbDecoder2 = new PgsDecoder();
                                    break;
                                case 2:
                                    dvbDecoder2 = new Mp4WebvttDecoder();
                                    break;
                                case 3:
                                    dvbDecoder2 = new WebvttDecoder();
                                    break;
                                case 4:
                                    dvbDecoder2 = new Tx3gDecoder(list2);
                                    break;
                                case 5:
                                    dvbDecoder2 = new SsaDecoder(list2);
                                    break;
                                case 6:
                                case 8:
                                    dvbDecoder2 = new Cea608Decoder(str3, i3);
                                    break;
                                case 7:
                                    dvbDecoder2 = new ExoplayerCuesDecoder();
                                    break;
                                case 9:
                                    dvbDecoder2 = new Cea708Decoder(i3, list2);
                                    break;
                                case 10:
                                    dvbDecoder2 = new SubripDecoder();
                                    break;
                                case 11:
                                    dvbDecoder2 = new TtmlDecoder();
                                    break;
                            }
                            this.w0 = dvbDecoder2;
                            obj = "application/dvbsubs";
                        } else {
                            str = "Attempted to create decoder for unsupported MIME type: ";
                        }
                        throw new IllegalArgumentException(a.C(str, str3));
                    }
                    u();
                    this.s0 = true;
                }
                obj = "application/dvbsubs";
                str = "Attempted to create decoder for unsupported MIME type: ";
            } else {
                z2 = z2;
                obj = "application/dvbsubs";
                str = "Attempted to create decoder for unsupported MIME type: ";
                if (subtitleOutputBuffer2.f17434Y <= j) {
                    SubtitleOutputBuffer subtitleOutputBuffer3 = this.y0;
                    if (subtitleOutputBuffer3 != null) {
                        subtitleOutputBuffer3.d();
                    }
                    j3 = j;
                    this.A0 = subtitleOutputBuffer2.getNextEventTimeIndex(j3);
                    this.y0 = subtitleOutputBuffer2;
                    this.z0 = null;
                    z2 = true;
                }
            }
            j3 = j;
        }
        if (z2) {
            this.y0.getClass();
            int nextEventTimeIndex = this.y0.getNextEventTimeIndex(j3);
            if (nextEventTimeIndex == 0 || this.y0.getEventTimeCount() == 0) {
                j4 = this.y0.f17434Y;
            } else {
                if (nextEventTimeIndex == -1) {
                    SubtitleOutputBuffer subtitleOutputBuffer4 = this.y0;
                    eventTime = subtitleOutputBuffer4.getEventTime(subtitleOutputBuffer4.getEventTimeCount() - 1);
                } else {
                    eventTime = this.y0.getEventTime(nextEventTimeIndex - 1);
                }
                j4 = eventTime;
            }
            obj2 = "application/pgs";
            CueGroup cueGroup = new CueGroup(this.y0.getCues(j3), t(j4));
            Handler handler = this.n0;
            if (handler != null) {
                handler.obtainMessage(0, cueGroup).sendToTarget();
            } else {
                TextOutput textOutput = this.o0;
                textOutput.onCues(cueGroup.X);
                textOutput.onCues(cueGroup);
            }
        } else {
            obj = obj;
            obj2 = "application/pgs";
        }
        if (this.u0 == 2) {
            return;
        }
        while (!this.r0) {
            try {
                SubtitleInputBuffer subtitleInputBuffer = this.x0;
                if (subtitleInputBuffer == null) {
                    SubtitleDecoder subtitleDecoder5 = this.w0;
                    subtitleDecoder5.getClass();
                    subtitleInputBuffer = (SubtitleInputBuffer) subtitleDecoder5.dequeueInputBuffer();
                    if (subtitleInputBuffer == null) {
                        return;
                    } else {
                        this.x0 = subtitleInputBuffer;
                    }
                }
                if (this.u0 == 1) {
                    try {
                        subtitleInputBuffer.X = 4;
                        SubtitleDecoder subtitleDecoder6 = this.w0;
                        subtitleDecoder6.getClass();
                        subtitleDecoder6.queueInputBuffer(subtitleInputBuffer);
                        this.x0 = null;
                        this.u0 = 2;
                        return;
                    } catch (SubtitleDecoderException e3) {
                        e = e3;
                    }
                } else {
                    formatHolder2 = formatHolder2;
                    int iQ = q(formatHolder2, subtitleInputBuffer, 0);
                    if (iQ == -4) {
                        c2 = 4;
                        try {
                            if (subtitleInputBuffer.b(4)) {
                                this.r0 = true;
                                this.t0 = false;
                            } else {
                                Format format3 = formatHolder2.f17094b;
                                if (format3 == null) {
                                    return;
                                }
                                subtitleInputBuffer.i0 = format3.q0;
                                subtitleInputBuffer.h();
                                this.t0 &= !subtitleInputBuffer.b(1);
                            }
                            if (!this.t0) {
                                SubtitleDecoder subtitleDecoder7 = this.w0;
                                subtitleDecoder7.getClass();
                                subtitleDecoder7.queueInputBuffer(subtitleInputBuffer);
                                this.x0 = null;
                            }
                        } catch (SubtitleDecoderException e4) {
                            e = e4;
                        }
                    } else {
                        formatHolder2 = formatHolder2;
                        if (iQ == -3) {
                            return;
                        }
                    }
                }
            } catch (SubtitleDecoderException e5) {
                e = e5;
            }
            c2 = 4;
            Log.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.v0, e);
            r();
            u();
            SubtitleDecoder subtitleDecoder8 = this.w0;
            subtitleDecoder8.getClass();
            subtitleDecoder8.release();
            this.w0 = null;
            this.u0 = 0;
            this.t0 = true;
            Format format4 = this.v0;
            format4.getClass();
            ((SubtitleDecoderFactory.AnonymousClass1) subtitleDecoderFactory).getClass();
            String str4 = format4.m0;
            if (str4 != null) {
                int i4 = format4.E0;
                List list3 = format4.o0;
                switch (str4.hashCode()) {
                    case -1351681404:
                        if (!str4.equals(obj)) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case -1248334819:
                        if (!str4.equals(obj2)) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case -1026075066:
                        if (!str4.equals("application/x-mp4-vtt")) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case -1004728940:
                        if (!str4.equals("text/vtt")) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    case 691401887:
                        if (!str4.equals("application/x-quicktime-tx3g")) {
                            b2 = -1;
                        } else {
                            b2 = c2;
                        }
                        break;
                    case 822864842:
                        if (!str4.equals("text/x-ssa")) {
                            b2 = -1;
                        } else {
                            b2 = 5;
                        }
                        break;
                    case 930165504:
                        if (!str4.equals("application/x-mp4-cea-608")) {
                            b2 = -1;
                        } else {
                            b2 = 6;
                        }
                        break;
                    case 1201784583:
                        if (!str4.equals("text/x-exoplayer-cues")) {
                            b2 = -1;
                        } else {
                            b2 = 7;
                        }
                        break;
                    case 1566015601:
                        if (!str4.equals("application/cea-608")) {
                            b2 = -1;
                        } else {
                            b2 = 8;
                        }
                        break;
                    case 1566016562:
                        if (!str4.equals("application/cea-708")) {
                            b2 = -1;
                        } else {
                            b2 = 9;
                        }
                        break;
                    case 1668750253:
                        if (!str4.equals("application/x-subrip")) {
                            b2 = -1;
                        } else {
                            b2 = 10;
                        }
                        break;
                    case 1693976202:
                        if (!str4.equals("application/ttml+xml")) {
                            b2 = -1;
                        } else {
                            b2 = 11;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    case 0:
                        dvbDecoder = new DvbDecoder(list3);
                        pgsDecoder = dvbDecoder;
                        this.w0 = pgsDecoder;
                        return;
                    case 1:
                        pgsDecoder = new PgsDecoder();
                        this.w0 = pgsDecoder;
                        return;
                    case 2:
                        pgsDecoder = new Mp4WebvttDecoder();
                        this.w0 = pgsDecoder;
                        return;
                    case 3:
                        pgsDecoder = new WebvttDecoder();
                        this.w0 = pgsDecoder;
                        return;
                    case 4:
                        dvbDecoder = new Tx3gDecoder(list3);
                        pgsDecoder = dvbDecoder;
                        this.w0 = pgsDecoder;
                        return;
                    case 5:
                        dvbDecoder = new SsaDecoder(list3);
                        pgsDecoder = dvbDecoder;
                        this.w0 = pgsDecoder;
                        return;
                    case 6:
                    case 8:
                        pgsDecoder = new Cea608Decoder(str4, i4);
                        this.w0 = pgsDecoder;
                        return;
                    case 7:
                        pgsDecoder = new ExoplayerCuesDecoder();
                        this.w0 = pgsDecoder;
                        return;
                    case 9:
                        dvbDecoder = new Cea708Decoder(i4, list3);
                        pgsDecoder = dvbDecoder;
                        this.w0 = pgsDecoder;
                        return;
                    case 10:
                        pgsDecoder = new SubripDecoder();
                        this.w0 = pgsDecoder;
                        return;
                    case 11:
                        pgsDecoder = new TtmlDecoder();
                        this.w0 = pgsDecoder;
                        return;
                }
            }
            throw new IllegalArgumentException(a.C(str, str4));
        }
    }

    public final long s() {
        if (this.A0 == -1) {
            return Long.MAX_VALUE;
        }
        this.y0.getClass();
        if (this.A0 >= this.y0.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.y0.getEventTime(this.A0);
    }

    public final long t(long j) {
        Assertions.d(j != -9223372036854775807L);
        Assertions.d(this.C0 != -9223372036854775807L);
        return j - this.C0;
    }

    public final void u() {
        this.x0 = null;
        this.A0 = -1;
        SubtitleOutputBuffer subtitleOutputBuffer = this.y0;
        if (subtitleOutputBuffer != null) {
            subtitleOutputBuffer.d();
            this.y0 = null;
        }
        SubtitleOutputBuffer subtitleOutputBuffer2 = this.z0;
        if (subtitleOutputBuffer2 != null) {
            subtitleOutputBuffer2.d();
            this.z0 = null;
        }
    }
}
