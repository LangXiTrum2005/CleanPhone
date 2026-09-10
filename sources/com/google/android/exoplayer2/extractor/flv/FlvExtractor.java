package com.google.android.exoplayer2.extractor.flv;

import android.support.v4.media.a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.IndexSeekMap;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.video.AvcConfig;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class FlvExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f17632a = new ParsableByteArray(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f17633b = new ParsableByteArray(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f17634c = new ParsableByteArray(11);
    public final ParsableByteArray d = new ParsableByteArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScriptTagPayloadReader f17635e;
    public ExtractorOutput f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17637i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17638l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17639n;
    public AudioTagPayloadReader o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public VideoTagPayloadReader f17640p;

    public FlvExtractor() {
        ScriptTagPayloadReader scriptTagPayloadReader = new ScriptTagPayloadReader(new DummyTrackOutput());
        scriptTagPayloadReader.f17641b = -9223372036854775807L;
        scriptTagPayloadReader.f17642c = new long[0];
        scriptTagPayloadReader.d = new long[0];
        this.f17635e = scriptTagPayloadReader;
        this.g = 1;
    }

    public final ParsableByteArray a(DefaultExtractorInput defaultExtractorInput) throws EOFException, InterruptedIOException {
        int i2 = this.f17638l;
        ParsableByteArray parsableByteArray = this.d;
        byte[] bArr = parsableByteArray.f18956a;
        if (i2 > bArr.length) {
            parsableByteArray.D(new byte[Math.max(bArr.length * 2, i2)], 0);
        } else {
            parsableByteArray.F(0);
        }
        parsableByteArray.E(this.f17638l);
        defaultExtractorInput.readFully(parsableByteArray.f18956a, 0, this.f17638l, false);
        return parsableByteArray;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        ParsableByteArray parsableByteArray = this.f17632a;
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 3, false);
        parsableByteArray.F(0);
        if (parsableByteArray.w() == 4607062) {
            defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 2, false);
            parsableByteArray.F(0);
            if ((parsableByteArray.z() & 250) == 0) {
                defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 4, false);
                parsableByteArray.F(0);
                int iG = parsableByteArray.g();
                defaultExtractorInput.f = 0;
                defaultExtractorInput.c(iG, false);
                defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 4, false);
                parsableByteArray.F(0);
                if (parsableByteArray.g() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0282  */
    /* JADX WARN: Code duplicated, block: B:102:0x0288  */
    /* JADX WARN: Code duplicated, block: B:145:0x0382  */
    /* JADX WARN: Code duplicated, block: B:146:0x0386  */
    /* JADX WARN: Code duplicated, block: B:184:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x015d  */
    /* JADX WARN: Code duplicated, block: B:95:0x026d  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException, EOFException, InterruptedIOException {
        long j;
        long j2;
        int i2;
        long j3;
        boolean z2;
        boolean z3;
        long j4;
        Assertions.e(this.f);
        while (true) {
            int i3 = this.g;
            if (i3 == 1) {
                ParsableByteArray parsableByteArray = this.f17633b;
                if (!((DefaultExtractorInput) extractorInput).readFully(parsableByteArray.f18956a, 0, 9, true)) {
                    return -1;
                }
                parsableByteArray.F(0);
                parsableByteArray.G(4);
                int iU = parsableByteArray.u();
                boolean z4 = (iU & 4) != 0;
                boolean z5 = (iU & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new AudioTagPayloadReader(this.f.track(8, 1));
                }
                if (z5 && this.f17640p == null) {
                    this.f17640p = new VideoTagPayloadReader(this.f.track(9, 2));
                }
                this.f.endTracks();
                this.j = parsableByteArray.g() - 5;
                this.g = 2;
            } else if (i3 == 2) {
                ((DefaultExtractorInput) extractorInput).skipFully(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i3 == 3) {
                ParsableByteArray parsableByteArray2 = this.f17634c;
                if (!((DefaultExtractorInput) extractorInput).readFully(parsableByteArray2.f18956a, 0, 11, true)) {
                    return -1;
                }
                parsableByteArray2.F(0);
                this.k = parsableByteArray2.u();
                this.f17638l = parsableByteArray2.w();
                this.m = parsableByteArray2.w();
                this.m = (((long) (parsableByteArray2.u() << 24)) | this.m) * 1000;
                parsableByteArray2.G(3);
                this.g = 4;
            } else {
                if (i3 != 4) {
                    throw new IllegalStateException();
                }
                boolean z6 = this.f17636h;
                ScriptTagPayloadReader scriptTagPayloadReader = this.f17635e;
                if (z6) {
                    j = this.f17637i + this.m;
                } else {
                    if (scriptTagPayloadReader.f17641b == -9223372036854775807L) {
                        j2 = 0;
                    } else {
                        j = this.m;
                    }
                    i2 = this.k;
                    if (i2 == 8 || this.o == null) {
                        if (i2 == 9 || this.f17640p == null) {
                            j3 = -9223372036854775807L;
                            if (i2 == 18 || this.f17639n) {
                                ((DefaultExtractorInput) extractorInput).skipFully(this.f17638l);
                                z2 = false;
                                z3 = false;
                            } else {
                                ParsableByteArray parsableByteArrayA = a((DefaultExtractorInput) extractorInput);
                                scriptTagPayloadReader.getClass();
                                scriptTagPayloadReader.getClass();
                                if (parsableByteArrayA.u() == 2 && "onMetaData".equals(ScriptTagPayloadReader.c(parsableByteArrayA)) && parsableByteArrayA.a() != 0 && parsableByteArrayA.u() == 8) {
                                    HashMap mapB = ScriptTagPayloadReader.b(parsableByteArrayA);
                                    Object obj = mapB.get("duration");
                                    double d = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double dDoubleValue = ((Double) obj).doubleValue();
                                        if (dDoubleValue > 0.0d) {
                                            scriptTagPayloadReader.f17641b = (long) (dDoubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = mapB.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            scriptTagPayloadReader.f17642c = new long[size];
                                            scriptTagPayloadReader.d = new long[size];
                                            int i4 = 0;
                                            while (i4 < size) {
                                                Object obj5 = list.get(i4);
                                                Object obj6 = list2.get(i4);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    scriptTagPayloadReader.f17642c = new long[0];
                                                    scriptTagPayloadReader.d = new long[0];
                                                    break;
                                                }
                                                double d2 = d;
                                                scriptTagPayloadReader.f17642c[i4] = (long) (((Double) obj6).doubleValue() * d2);
                                                scriptTagPayloadReader.d[i4] = ((Double) obj5).longValue();
                                                i4++;
                                                d = d2;
                                            }
                                        }
                                    }
                                }
                                long j5 = scriptTagPayloadReader.f17641b;
                                if (j5 != -9223372036854775807L) {
                                    this.f.g(new IndexSeekMap(scriptTagPayloadReader.d, scriptTagPayloadReader.f17642c, j5));
                                    this.f17639n = true;
                                }
                            }
                        } else {
                            if (!this.f17639n) {
                                this.f.g(new SeekMap.Unseekable(-9223372036854775807L));
                                this.f17639n = true;
                            }
                            VideoTagPayloadReader videoTagPayloadReader = this.f17640p;
                            ParsableByteArray parsableByteArrayA2 = a((DefaultExtractorInput) extractorInput);
                            videoTagPayloadReader.getClass();
                            int iU2 = parsableByteArrayA2.u();
                            int i5 = (iU2 >> 4) & 15;
                            int i6 = iU2 & 15;
                            if (i6 != 7) {
                                throw new TagPayloadReader.UnsupportedFormatException(a.h(i6, "Video format not supported: "));
                            }
                            videoTagPayloadReader.g = i5;
                            if (i5 != 5) {
                                int iU3 = parsableByteArrayA2.u();
                                byte[] bArr = parsableByteArrayA2.f18956a;
                                int i7 = parsableByteArrayA2.f18957b;
                                int i8 = i7 + 1;
                                parsableByteArrayA2.f18957b = i8;
                                int i9 = ((bArr[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8;
                                j3 = -9223372036854775807L;
                                int i10 = i7 + 2;
                                parsableByteArrayA2.f18957b = i10;
                                int i11 = ((bArr[i8] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i9;
                                parsableByteArrayA2.f18957b = i7 + 3;
                                long j6 = (((long) ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i11)) * 1000) + j2;
                                boolean z7 = true;
                                TrackOutput trackOutput = videoTagPayloadReader.f17643a;
                                if (iU3 != 0 || videoTagPayloadReader.f17646e) {
                                    if (iU3 == 1 && videoTagPayloadReader.f17646e) {
                                        int i12 = videoTagPayloadReader.g == 1 ? 1 : 0;
                                        if (videoTagPayloadReader.f || i12 != 0) {
                                            ParsableByteArray parsableByteArray3 = videoTagPayloadReader.f17645c;
                                            byte[] bArr2 = parsableByteArray3.f18956a;
                                            bArr2[0] = 0;
                                            bArr2[1] = 0;
                                            bArr2[2] = 0;
                                            int i13 = 4 - videoTagPayloadReader.d;
                                            int i14 = 0;
                                            while (parsableByteArrayA2.a() > 0) {
                                                parsableByteArrayA2.e(parsableByteArray3.f18956a, i13, videoTagPayloadReader.d);
                                                parsableByteArray3.F(0);
                                                int iX = parsableByteArray3.x();
                                                ParsableByteArray parsableByteArray4 = videoTagPayloadReader.f17644b;
                                                parsableByteArray4.F(0);
                                                trackOutput.e(4, parsableByteArray4);
                                                trackOutput.e(iX, parsableByteArrayA2);
                                                i14 = i14 + 4 + iX;
                                            }
                                            videoTagPayloadReader.f17643a.f(j6, i12, i14, 0, null);
                                            videoTagPayloadReader.f = true;
                                        }
                                    }
                                    if (z7) {
                                        z3 = true;
                                    }
                                    z2 = true;
                                } else {
                                    byte[] bArr3 = new byte[parsableByteArrayA2.a()];
                                    ParsableByteArray parsableByteArray5 = new ParsableByteArray(bArr3);
                                    parsableByteArrayA2.e(bArr3, 0, parsableByteArrayA2.a());
                                    AvcConfig avcConfigA = AvcConfig.a(parsableByteArray5);
                                    videoTagPayloadReader.d = avcConfigA.f18988b;
                                    Format.Builder builder = new Format.Builder();
                                    builder.k = "video/avc";
                                    builder.f17085h = avcConfigA.f;
                                    builder.f17089p = avcConfigA.f18989c;
                                    builder.q = avcConfigA.d;
                                    builder.t = avcConfigA.f18990e;
                                    builder.m = avcConfigA.f18987a;
                                    trackOutput.c(new Format(builder));
                                    videoTagPayloadReader.f17646e = true;
                                }
                                z7 = false;
                                if (z7) {
                                    z3 = true;
                                }
                                z2 = true;
                            } else {
                                j3 = -9223372036854775807L;
                            }
                        }
                        z3 = false;
                        z2 = true;
                    } else {
                        if (!this.f17639n) {
                            this.f.g(new SeekMap.Unseekable(-9223372036854775807L));
                            this.f17639n = true;
                        }
                        AudioTagPayloadReader audioTagPayloadReader = this.o;
                        ParsableByteArray parsableByteArrayA3 = a((DefaultExtractorInput) extractorInput);
                        if (audioTagPayloadReader.f17630b) {
                            parsableByteArrayA3.G(1);
                        } else {
                            int iU4 = parsableByteArrayA3.u();
                            int i15 = (iU4 >> 4) & 15;
                            audioTagPayloadReader.d = i15;
                            TrackOutput trackOutput2 = audioTagPayloadReader.f17643a;
                            if (i15 == 2) {
                                int i16 = AudioTagPayloadReader.f17629e[(iU4 >> 2) & 3];
                                Format.Builder builder2 = new Format.Builder();
                                builder2.k = "audio/mpeg";
                                builder2.x = 1;
                                builder2.y = i16;
                                trackOutput2.c(new Format(builder2));
                                audioTagPayloadReader.f17631c = true;
                            } else if (i15 == 7 || i15 == 8) {
                                String str = i15 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                Format.Builder builder3 = new Format.Builder();
                                builder3.k = str;
                                builder3.x = 1;
                                builder3.y = 8000;
                                trackOutput2.c(new Format(builder3));
                                audioTagPayloadReader.f17631c = true;
                            } else if (i15 != 10) {
                                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + audioTagPayloadReader.d);
                            }
                            audioTagPayloadReader.f17630b = true;
                        }
                        int i17 = audioTagPayloadReader.d;
                        TrackOutput trackOutput3 = audioTagPayloadReader.f17643a;
                        z3 = true;
                        if (i17 == 2) {
                            int iA = parsableByteArrayA3.a();
                            trackOutput3.e(iA, parsableByteArrayA3);
                            audioTagPayloadReader.f17643a.f(j2, 1, iA, 0, null);
                        } else {
                            int iU5 = parsableByteArrayA3.u();
                            if (iU5 == 0 && !audioTagPayloadReader.f17631c) {
                                int iA2 = parsableByteArrayA3.a();
                                byte[] bArr4 = new byte[iA2];
                                parsableByteArrayA3.e(bArr4, 0, iA2);
                                AacUtil.Config configB = AacUtil.b(new ParsableBitArray(bArr4, iA2), false);
                                Format.Builder builder4 = new Format.Builder();
                                builder4.k = "audio/mp4a-latm";
                                builder4.f17085h = configB.f17270c;
                                builder4.x = configB.f17269b;
                                builder4.y = configB.f17268a;
                                builder4.m = Collections.singletonList(bArr4);
                                trackOutput3.c(new Format(builder4));
                                audioTagPayloadReader.f17631c = true;
                            } else if (audioTagPayloadReader.d != 10 || iU5 == 1) {
                                int iA3 = parsableByteArrayA3.a();
                                trackOutput3.e(iA3, parsableByteArrayA3);
                                audioTagPayloadReader.f17643a.f(j2, 1, iA3, 0, null);
                            }
                            z3 = false;
                        }
                        z2 = true;
                        j3 = -9223372036854775807L;
                    }
                    if (!this.f17636h && z3) {
                        this.f17636h = true;
                        if (scriptTagPayloadReader.f17641b == j3) {
                            j4 = -this.m;
                        } else {
                            j4 = 0;
                        }
                        this.f17637i = j4;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z2) {
                        return 0;
                    }
                }
                j2 = j;
                i2 = this.k;
                if (i2 == 8) {
                    if (i2 == 9) {
                        j3 = -9223372036854775807L;
                        if (i2 == 18) {
                        }
                        ((DefaultExtractorInput) extractorInput).skipFully(this.f17638l);
                        z2 = false;
                        z3 = false;
                    } else {
                        j3 = -9223372036854775807L;
                        if (i2 == 18) {
                        }
                        ((DefaultExtractorInput) extractorInput).skipFully(this.f17638l);
                        z2 = false;
                        z3 = false;
                    }
                } else if (i2 == 9) {
                    j3 = -9223372036854775807L;
                    if (i2 == 18) {
                    }
                    ((DefaultExtractorInput) extractorInput).skipFully(this.f17638l);
                    z2 = false;
                    z3 = false;
                } else {
                    j3 = -9223372036854775807L;
                    if (i2 == 18) {
                    }
                    ((DefaultExtractorInput) extractorInput).skipFully(this.f17638l);
                    z2 = false;
                    z3 = false;
                }
                if (!this.f17636h) {
                    this.f17636h = true;
                    if (scriptTagPayloadReader.f17641b == j3) {
                        j4 = -this.m;
                    } else {
                        j4 = 0;
                    }
                    this.f17637i = j4;
                }
                this.j = 4;
                this.g = 2;
                if (z2) {
                    return 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.f17636h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }
}
