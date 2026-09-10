package androidx.media3.exoplayer.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.CueDecoder;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.cea.Cea608Decoder;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class TextRenderer extends BaseRenderer implements Handler.Callback {
    public SubtitleOutputBuffer A0;
    public SubtitleOutputBuffer B0;
    public int C0;
    public final Handler D0;
    public final TextOutput E0;
    public final FormatHolder F0;
    public boolean G0;
    public boolean H0;
    public Format I0;
    public long J0;
    public long K0;
    public long L0;
    public final CueDecoder s0;
    public final DecoderInputBuffer t0;
    public CuesResolver u0;
    public final SubtitleDecoderFactory v0;
    public boolean w0;
    public int x0;
    public SubtitleDecoder y0;
    public SubtitleInputBuffer z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextRenderer(TextOutput textOutput, Looper looper) {
        super(3);
        SubtitleDecoderFactory subtitleDecoderFactory = SubtitleDecoderFactory.f6502a;
        this.E0 = textOutput;
        this.D0 = looper == null ? null : new Handler(looper, this);
        this.v0 = subtitleDecoderFactory;
        this.s0 = new CueDecoder();
        this.t0 = new DecoderInputBuffer(1);
        this.F0 = new FormatHolder();
        this.L0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
    }

    public final long A() {
        if (this.C0 == -1) {
            return Long.MAX_VALUE;
        }
        this.A0.getClass();
        if (this.C0 >= this.A0.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.A0.getEventTime(this.C0);
    }

    public final long B(long j) {
        Assertions.e(j != -9223372036854775807L);
        Assertions.e(this.J0 != -9223372036854775807L);
        return j - this.J0;
    }

    public final void C() {
        this.z0 = null;
        this.C0 = -1;
        SubtitleOutputBuffer subtitleOutputBuffer = this.A0;
        if (subtitleOutputBuffer != null) {
            subtitleOutputBuffer.f();
            this.A0 = null;
        }
        SubtitleOutputBuffer subtitleOutputBuffer2 = this.B0;
        if (subtitleOutputBuffer2 != null) {
            subtitleOutputBuffer2.f();
            this.B0 = null;
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format) {
        if (!Objects.equals(format.m, "application/x-media3-cues")) {
            SubtitleDecoderFactory.AnonymousClass1 anonymousClass1 = (SubtitleDecoderFactory.AnonymousClass1) this.v0;
            anonymousClass1.getClass();
            if (!anonymousClass1.f6503b.a(format)) {
                String str = format.m;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return MimeTypes.j(str) ? RendererCapabilities.h(1, 0, 0, 0) : RendererCapabilities.h(0, 0, 0, 0);
                }
            }
        }
        return RendererCapabilities.h(format.f5405J == 0 ? 4 : 2, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        CueGroup cueGroup = (CueGroup) message.obj;
        ImmutableList immutableList = cueGroup.f5614a;
        TextOutput textOutput = this.E0;
        textOutput.onCues(immutableList);
        textOutput.onCues(cueGroup);
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final boolean isEnded() {
        return this.H0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void p() {
        this.I0 = null;
        this.L0 = -9223372036854775807L;
        z();
        this.J0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        if (this.y0 != null) {
            C();
            SubtitleDecoder subtitleDecoder = this.y0;
            subtitleDecoder.getClass();
            subtitleDecoder.release();
            this.y0 = null;
            this.x0 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void r(long j, boolean z2) {
        DefaultSubtitleParserFactory defaultSubtitleParserFactory;
        SubtitleDecoder delegatingSubtitleDecoder;
        byte b2 = 1;
        this.K0 = j;
        CuesResolver cuesResolver = this.u0;
        if (cuesResolver != null) {
            cuesResolver.clear();
        }
        z();
        this.G0 = false;
        this.H0 = false;
        this.L0 = -9223372036854775807L;
        Format format = this.I0;
        if (format == null || Objects.equals(format.m, "application/x-media3-cues")) {
            return;
        }
        if (this.x0 == 0) {
            C();
            SubtitleDecoder subtitleDecoder = this.y0;
            subtitleDecoder.getClass();
            subtitleDecoder.flush();
            subtitleDecoder.a(this.m0);
            return;
        }
        C();
        SubtitleDecoder subtitleDecoder2 = this.y0;
        subtitleDecoder2.getClass();
        subtitleDecoder2.release();
        this.y0 = null;
        this.x0 = 0;
        this.w0 = true;
        Format format2 = this.I0;
        format2.getClass();
        SubtitleDecoderFactory.AnonymousClass1 anonymousClass1 = (SubtitleDecoderFactory.AnonymousClass1) this.v0;
        anonymousClass1.getClass();
        String str = format2.m;
        if (str != null) {
            int i2 = format2.f5403F;
            switch (str.hashCode()) {
                case 930165504:
                    b2 = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b2 = -1;
                    }
                    break;
                case 1566016562:
                    b2 = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                case 1:
                    delegatingSubtitleDecoder = new Cea608Decoder(str, i2);
                    break;
                case 2:
                    delegatingSubtitleDecoder = new Cea708Decoder(i2, format2.f5414p);
                    break;
                default:
                    defaultSubtitleParserFactory = anonymousClass1.f6503b;
                    if (defaultSubtitleParserFactory.a(format2)) {
                        throw new IllegalArgumentException(android.support.v4.media.a.C("Attempted to create decoder for unsupported MIME type: ", str));
                    }
                    SubtitleParser subtitleParserC = defaultSubtitleParserFactory.c(format2);
                    delegatingSubtitleDecoder = new DelegatingSubtitleDecoder(subtitleParserC.getClass().getSimpleName().concat("Decoder"), subtitleParserC);
                    break;
                    break;
            }
        } else {
            defaultSubtitleParserFactory = anonymousClass1.f6503b;
            if (defaultSubtitleParserFactory.a(format2)) {
                throw new IllegalArgumentException(android.support.v4.media.a.C("Attempted to create decoder for unsupported MIME type: ", str));
            }
            SubtitleParser subtitleParserC2 = defaultSubtitleParserFactory.c(format2);
            delegatingSubtitleDecoder = new DelegatingSubtitleDecoder(subtitleParserC2.getClass().getSimpleName().concat("Decoder"), subtitleParserC2);
        }
        this.y0 = delegatingSubtitleDecoder;
        delegatingSubtitleDecoder.a(this.m0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x025d  */
    /* JADX WARN: Code duplicated, block: B:119:0x028f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0297  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:126:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:207:0x0446  */
    /* JADX WARN: Code duplicated, block: B:209:0x044e  */
    /* JADX WARN: Code duplicated, block: B:212:0x046d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0186  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01df  */
    @Override // androidx.media3.exoplayer.Renderer
    public final void render(long j, long j2) {
        boolean z2;
        String str;
        SubtitleDecoderFactory subtitleDecoderFactory;
        String str2;
        Object obj;
        byte b2;
        byte b3;
        DefaultSubtitleParserFactory defaultSubtitleParserFactory;
        SubtitleDecoder delegatingSubtitleDecoder;
        long eventTime;
        DefaultSubtitleParserFactory defaultSubtitleParserFactory2;
        SubtitleDecoder delegatingSubtitleDecoder2;
        DefaultSubtitleParserFactory defaultSubtitleParserFactory3;
        SubtitleDecoder delegatingSubtitleDecoder3;
        boolean zB = false;
        zB = false;
        zB = false;
        if (this.o0) {
            long j3 = this.L0;
            if (j3 != -9223372036854775807L && j >= j3) {
                C();
                this.H0 = true;
            }
        }
        if (this.H0) {
            return;
        }
        Format format = this.I0;
        format.getClass();
        boolean zEquals = Objects.equals(format.m, "application/x-media3-cues");
        TextOutput textOutput = this.E0;
        Handler handler = this.D0;
        FormatHolder formatHolder = this.F0;
        if (zEquals) {
            this.u0.getClass();
            if (!this.G0) {
                DecoderInputBuffer decoderInputBuffer = this.t0;
                if (x(formatHolder, decoderInputBuffer, 0) == -4) {
                    if (decoderInputBuffer.b(4)) {
                        this.G0 = true;
                    } else {
                        decoderInputBuffer.h();
                        ByteBuffer byteBuffer = decoderInputBuffer.e0;
                        byteBuffer.getClass();
                        long j4 = decoderInputBuffer.g0;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.s0.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        ImmutableList.Builder builderS = ImmutableList.s();
                        for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i2);
                            bundle2.getClass();
                            builderS.h(Cue.b(bundle2));
                        }
                        CuesWithTiming cuesWithTiming = new CuesWithTiming(builderS.j(), j4, bundle.getLong("d"));
                        decoderInputBuffer.d();
                        zB = this.u0.b(cuesWithTiming, j);
                    }
                }
            }
            long jD = this.u0.d(this.K0);
            if (jD == Long.MIN_VALUE && this.G0 && !zB) {
                this.H0 = true;
            }
            if (jD != Long.MIN_VALUE && jD <= j) {
                zB = true;
            }
            if (zB) {
                ImmutableList immutableListA = this.u0.a(j);
                long jC = this.u0.c(j);
                B(jC);
                CueGroup cueGroup = new CueGroup(immutableListA);
                if (handler != null) {
                    handler.obtainMessage(1, cueGroup).sendToTarget();
                } else {
                    textOutput.onCues(cueGroup.f5614a);
                    textOutput.onCues(cueGroup);
                }
                this.u0.e(jC);
            }
            this.K0 = j;
            return;
        }
        y();
        this.K0 = j;
        SubtitleOutputBuffer subtitleOutputBuffer = this.B0;
        SubtitleDecoderFactory subtitleDecoderFactory2 = this.v0;
        if (subtitleOutputBuffer == null) {
            SubtitleDecoder subtitleDecoder = this.y0;
            subtitleDecoder.getClass();
            subtitleDecoder.setPositionUs(j);
            try {
                SubtitleDecoder subtitleDecoder2 = this.y0;
                subtitleDecoder2.getClass();
                this.B0 = (SubtitleOutputBuffer) subtitleDecoder2.dequeueOutputBuffer();
            } catch (SubtitleDecoderException e2) {
                Log.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.I0, e2);
                z();
                C();
                SubtitleDecoder subtitleDecoder3 = this.y0;
                subtitleDecoder3.getClass();
                subtitleDecoder3.release();
                this.y0 = null;
                this.x0 = 0;
                this.w0 = true;
                Format format2 = this.I0;
                format2.getClass();
                SubtitleDecoderFactory.AnonymousClass1 anonymousClass1 = (SubtitleDecoderFactory.AnonymousClass1) subtitleDecoderFactory2;
                anonymousClass1.getClass();
                String str3 = format2.m;
                if (str3 != null) {
                    int i3 = format2.f5403F;
                    switch (str3) {
                        case "application/x-mp4-cea-608":
                        case "application/cea-608":
                            delegatingSubtitleDecoder3 = new Cea608Decoder(str3, i3);
                            break;
                        case "application/cea-708":
                            delegatingSubtitleDecoder3 = new Cea708Decoder(i3, format2.f5414p);
                            break;
                        default:
                            defaultSubtitleParserFactory3 = anonymousClass1.f6503b;
                            if (defaultSubtitleParserFactory3.a(format2)) {
                                throw new IllegalArgumentException(android.support.v4.media.a.C("Attempted to create decoder for unsupported MIME type: ", str3));
                            }
                            SubtitleParser subtitleParserC = defaultSubtitleParserFactory3.c(format2);
                            delegatingSubtitleDecoder3 = new DelegatingSubtitleDecoder(subtitleParserC.getClass().getSimpleName().concat("Decoder"), subtitleParserC);
                            break;
                            break;
                    }
                } else {
                    defaultSubtitleParserFactory3 = anonymousClass1.f6503b;
                    if (defaultSubtitleParserFactory3.a(format2)) {
                        throw new IllegalArgumentException(android.support.v4.media.a.C("Attempted to create decoder for unsupported MIME type: ", str3));
                    }
                    SubtitleParser subtitleParserC2 = defaultSubtitleParserFactory3.c(format2);
                    delegatingSubtitleDecoder3 = new DelegatingSubtitleDecoder(subtitleParserC2.getClass().getSimpleName().concat("Decoder"), subtitleParserC2);
                }
                this.y0 = delegatingSubtitleDecoder3;
                delegatingSubtitleDecoder3.a(this.m0);
                return;
            }
        }
        if (this.i0 != 2) {
            return;
        }
        if (this.A0 != null) {
            long jA = A();
            z2 = false;
            while (jA <= j) {
                this.C0++;
                jA = A();
                z2 = true;
            }
        } else {
            z2 = false;
        }
        SubtitleOutputBuffer subtitleOutputBuffer2 = this.B0;
        boolean z3 = z2;
        if (subtitleOutputBuffer2 == null) {
            str = "Decoder";
            subtitleDecoderFactory = subtitleDecoderFactory2;
            str2 = "TextRenderer";
            obj = "application/x-mp4-cea-608";
        } else if (!subtitleOutputBuffer2.b(4)) {
            str = "Decoder";
            subtitleDecoderFactory = subtitleDecoderFactory2;
            str2 = "TextRenderer";
            obj = "application/x-mp4-cea-608";
            if (subtitleOutputBuffer2.f5802Y <= j) {
                SubtitleOutputBuffer subtitleOutputBuffer3 = this.A0;
                if (subtitleOutputBuffer3 != null) {
                    subtitleOutputBuffer3.f();
                }
                this.C0 = subtitleOutputBuffer2.getNextEventTimeIndex(j);
                this.A0 = subtitleOutputBuffer2;
                this.B0 = null;
                z3 = true;
            }
        } else if (z3 || A() != Long.MAX_VALUE) {
            str = "Decoder";
            subtitleDecoderFactory = subtitleDecoderFactory2;
            str2 = "TextRenderer";
            obj = "application/x-mp4-cea-608";
        } else if (this.x0 == 2) {
            C();
            SubtitleDecoder subtitleDecoder4 = this.y0;
            subtitleDecoder4.getClass();
            subtitleDecoder4.release();
            this.y0 = null;
            this.x0 = 0;
            this.w0 = true;
            Format format3 = this.I0;
            format3.getClass();
            SubtitleDecoderFactory.AnonymousClass1 anonymousClass2 = (SubtitleDecoderFactory.AnonymousClass1) subtitleDecoderFactory2;
            anonymousClass2.getClass();
            subtitleDecoderFactory = subtitleDecoderFactory2;
            String str4 = format3.m;
            str2 = "TextRenderer";
            if (str4 != null) {
                int i4 = format3.f5403F;
                switch (str4) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        delegatingSubtitleDecoder2 = new Cea608Decoder(str4, i4);
                        break;
                    case "application/cea-708":
                        delegatingSubtitleDecoder2 = new Cea708Decoder(i4, format3.f5414p);
                        break;
                    default:
                        defaultSubtitleParserFactory2 = anonymousClass2.f6503b;
                        if (defaultSubtitleParserFactory2.a(format3)) {
                            throw new IllegalArgumentException(android.support.v4.media.a.C("Attempted to create decoder for unsupported MIME type: ", str4));
                        }
                        SubtitleParser subtitleParserC3 = defaultSubtitleParserFactory2.c(format3);
                        delegatingSubtitleDecoder2 = new DelegatingSubtitleDecoder(subtitleParserC3.getClass().getSimpleName().concat("Decoder"), subtitleParserC3);
                        break;
                        break;
                }
            } else {
                defaultSubtitleParserFactory2 = anonymousClass2.f6503b;
                if (defaultSubtitleParserFactory2.a(format3)) {
                    throw new IllegalArgumentException(android.support.v4.media.a.C("Attempted to create decoder for unsupported MIME type: ", str4));
                }
                SubtitleParser subtitleParserC4 = defaultSubtitleParserFactory2.c(format3);
                delegatingSubtitleDecoder2 = new DelegatingSubtitleDecoder(subtitleParserC4.getClass().getSimpleName().concat("Decoder"), subtitleParserC4);
            }
            this.y0 = delegatingSubtitleDecoder2;
            obj = "application/x-mp4-cea-608";
            str = "Decoder";
            delegatingSubtitleDecoder2.a(this.m0);
        } else {
            str = "Decoder";
            subtitleDecoderFactory = subtitleDecoderFactory2;
            str2 = "TextRenderer";
            obj = "application/x-mp4-cea-608";
            C();
            this.H0 = true;
        }
        if (z3) {
            this.A0.getClass();
            int nextEventTimeIndex = this.A0.getNextEventTimeIndex(j);
            if (nextEventTimeIndex == 0 || this.A0.getEventTimeCount() == 0) {
                b2 = -1;
                eventTime = this.A0.f5802Y;
            } else {
                b2 = -1;
                if (nextEventTimeIndex == -1) {
                    SubtitleOutputBuffer subtitleOutputBuffer4 = this.A0;
                    eventTime = subtitleOutputBuffer4.getEventTime(subtitleOutputBuffer4.getEventTimeCount() - 1);
                } else {
                    eventTime = this.A0.getEventTime(nextEventTimeIndex - 1);
                }
            }
            B(eventTime);
            CueGroup cueGroup2 = new CueGroup(this.A0.getCues(j));
            if (handler != null) {
                handler.obtainMessage(1, cueGroup2).sendToTarget();
            } else {
                textOutput.onCues(cueGroup2.f5614a);
                textOutput.onCues(cueGroup2);
            }
        } else {
            b2 = -1;
        }
        if (this.x0 == 2) {
            return;
        }
        while (!this.G0) {
            try {
                SubtitleInputBuffer subtitleInputBuffer = this.z0;
                if (subtitleInputBuffer == null) {
                    SubtitleDecoder subtitleDecoder5 = this.y0;
                    subtitleDecoder5.getClass();
                    subtitleInputBuffer = (SubtitleInputBuffer) subtitleDecoder5.dequeueInputBuffer();
                    if (subtitleInputBuffer == null) {
                        return;
                    } else {
                        this.z0 = subtitleInputBuffer;
                    }
                }
                b3 = 1;
                if (this.x0 == 1) {
                    subtitleInputBuffer.X = 4;
                    SubtitleDecoder subtitleDecoder6 = this.y0;
                    subtitleDecoder6.getClass();
                    subtitleDecoder6.queueInputBuffer(subtitleInputBuffer);
                    this.z0 = null;
                    b3 = 2;
                    this.x0 = 2;
                    return;
                }
                try {
                    int iX = x(formatHolder, subtitleInputBuffer, 0);
                    if (iX == -4) {
                        if (subtitleInputBuffer.b(4)) {
                            this.G0 = true;
                            this.w0 = false;
                        } else {
                            Format format4 = formatHolder.f5911b;
                            if (format4 == null) {
                                return;
                            }
                            subtitleInputBuffer.j0 = format4.r;
                            subtitleInputBuffer.h();
                            this.w0 &= !subtitleInputBuffer.b(1);
                        }
                        if (!this.w0) {
                            SubtitleDecoder subtitleDecoder7 = this.y0;
                            subtitleDecoder7.getClass();
                            subtitleDecoder7.queueInputBuffer(subtitleInputBuffer);
                            this.z0 = null;
                        }
                    } else if (iX == -3) {
                        return;
                    }
                } catch (SubtitleDecoderException e3) {
                    e = e3;
                }
                e = e3;
            } catch (SubtitleDecoderException e4) {
                e = e4;
                b3 = 2;
            }
            Log.d(str2, "Subtitle decoding failed. streamFormat=" + this.I0, e);
            z();
            C();
            SubtitleDecoder subtitleDecoder8 = this.y0;
            subtitleDecoder8.getClass();
            subtitleDecoder8.release();
            this.y0 = null;
            this.x0 = 0;
            this.w0 = true;
            Format format5 = this.I0;
            format5.getClass();
            SubtitleDecoderFactory.AnonymousClass1 anonymousClass3 = (SubtitleDecoderFactory.AnonymousClass1) subtitleDecoderFactory;
            anonymousClass3.getClass();
            String str5 = format5.m;
            if (str5 != null) {
                int i5 = format5.f5403F;
                switch (str5.hashCode()) {
                    case 930165504:
                        if (str5.equals(obj)) {
                            b2 = 0;
                        }
                        break;
                    case 1566015601:
                        if (str5.equals("application/cea-608")) {
                            b2 = 1;
                        }
                        break;
                    case 1566016562:
                        if (str5.equals("application/cea-708")) {
                            b2 = b3;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                    case 1:
                        delegatingSubtitleDecoder = new Cea608Decoder(str5, i5);
                        break;
                    case 2:
                        delegatingSubtitleDecoder = new Cea708Decoder(i5, format5.f5414p);
                        break;
                    default:
                        defaultSubtitleParserFactory = anonymousClass3.f6503b;
                        if (defaultSubtitleParserFactory.a(format5)) {
                            throw new IllegalArgumentException(android.support.v4.media.a.C("Attempted to create decoder for unsupported MIME type: ", str5));
                        }
                        SubtitleParser subtitleParserC5 = defaultSubtitleParserFactory.c(format5);
                        delegatingSubtitleDecoder = new DelegatingSubtitleDecoder(subtitleParserC5.getClass().getSimpleName().concat(str), subtitleParserC5);
                        break;
                        break;
                }
            } else {
                defaultSubtitleParserFactory = anonymousClass3.f6503b;
                if (defaultSubtitleParserFactory.a(format5)) {
                    throw new IllegalArgumentException(android.support.v4.media.a.C("Attempted to create decoder for unsupported MIME type: ", str5));
                }
                SubtitleParser subtitleParserC6 = defaultSubtitleParserFactory.c(format5);
                delegatingSubtitleDecoder = new DelegatingSubtitleDecoder(subtitleParserC6.getClass().getSimpleName().concat(str), subtitleParserC6);
            }
            this.y0 = delegatingSubtitleDecoder;
            delegatingSubtitleDecoder.a(this.m0);
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void w(Format[] formatArr, long j, long j2) {
        DefaultSubtitleParserFactory defaultSubtitleParserFactory;
        SubtitleDecoder delegatingSubtitleDecoder;
        byte b2 = 1;
        this.J0 = j2;
        Format format = formatArr[0];
        this.I0 = format;
        if (Objects.equals(format.m, "application/x-media3-cues")) {
            this.u0 = this.I0.G == 1 ? new MergingCuesResolver() : new ReplacingCuesResolver();
            return;
        }
        y();
        if (this.y0 != null) {
            this.x0 = 1;
            return;
        }
        this.w0 = true;
        Format format2 = this.I0;
        format2.getClass();
        SubtitleDecoderFactory.AnonymousClass1 anonymousClass1 = (SubtitleDecoderFactory.AnonymousClass1) this.v0;
        anonymousClass1.getClass();
        String str = format2.m;
        if (str != null) {
            int i2 = format2.f5403F;
            switch (str.hashCode()) {
                case 930165504:
                    b2 = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b2 = -1;
                    }
                    break;
                case 1566016562:
                    b2 = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                case 1:
                    delegatingSubtitleDecoder = new Cea608Decoder(str, i2);
                    break;
                case 2:
                    delegatingSubtitleDecoder = new Cea708Decoder(i2, format2.f5414p);
                    break;
                default:
                    defaultSubtitleParserFactory = anonymousClass1.f6503b;
                    if (defaultSubtitleParserFactory.a(format2)) {
                        throw new IllegalArgumentException(android.support.v4.media.a.C("Attempted to create decoder for unsupported MIME type: ", str));
                    }
                    SubtitleParser subtitleParserC = defaultSubtitleParserFactory.c(format2);
                    delegatingSubtitleDecoder = new DelegatingSubtitleDecoder(subtitleParserC.getClass().getSimpleName().concat("Decoder"), subtitleParserC);
                    break;
                    break;
            }
        } else {
            defaultSubtitleParserFactory = anonymousClass1.f6503b;
            if (defaultSubtitleParserFactory.a(format2)) {
                throw new IllegalArgumentException(android.support.v4.media.a.C("Attempted to create decoder for unsupported MIME type: ", str));
            }
            SubtitleParser subtitleParserC2 = defaultSubtitleParserFactory.c(format2);
            delegatingSubtitleDecoder = new DelegatingSubtitleDecoder(subtitleParserC2.getClass().getSimpleName().concat("Decoder"), subtitleParserC2);
        }
        this.y0 = delegatingSubtitleDecoder;
        delegatingSubtitleDecoder.a(this.m0);
    }

    public final void y() {
        Assertions.d("Legacy decoding is disabled, can't handle " + this.I0.m + " samples (expected application/x-media3-cues).", Objects.equals(this.I0.m, "application/cea-608") || Objects.equals(this.I0.m, "application/x-mp4-cea-608") || Objects.equals(this.I0.m, "application/cea-708"));
    }

    public final void z() {
        ImmutableList immutableListX = ImmutableList.x();
        B(this.K0);
        CueGroup cueGroup = new CueGroup(immutableListX);
        Handler handler = this.D0;
        if (handler != null) {
            handler.obtainMessage(1, cueGroup).sendToTarget();
            return;
        }
        TextOutput textOutput = this.E0;
        textOutput.onCues(cueGroup.f5614a);
        textOutput.onCues(cueGroup);
    }
}
