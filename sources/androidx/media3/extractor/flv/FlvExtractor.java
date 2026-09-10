package androidx.media3.extractor.flv;

import android.support.v4.media.a;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class FlvExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f6879a = new ParsableByteArray(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f6880b = new ParsableByteArray(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f6881c = new ParsableByteArray(11);
    public final ParsableByteArray d = new ParsableByteArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScriptTagPayloadReader f6882e;
    public ExtractorOutput f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6884i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6885l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6886n;
    public AudioTagPayloadReader o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public VideoTagPayloadReader f6887p;

    public FlvExtractor() {
        ScriptTagPayloadReader scriptTagPayloadReader = new ScriptTagPayloadReader(new DiscardingTrackOutput());
        scriptTagPayloadReader.f6888b = -9223372036854775807L;
        scriptTagPayloadReader.f6889c = new long[0];
        scriptTagPayloadReader.d = new long[0];
        this.f6882e = scriptTagPayloadReader;
        this.g = 1;
    }

    public final ParsableByteArray a(DefaultExtractorInput defaultExtractorInput) throws EOFException, InterruptedIOException {
        int i2 = this.f6885l;
        ParsableByteArray parsableByteArray = this.d;
        byte[] bArr = parsableByteArray.f5667a;
        if (i2 > bArr.length) {
            parsableByteArray.E(new byte[Math.max(bArr.length * 2, i2)], 0);
        } else {
            parsableByteArray.G(0);
        }
        parsableByteArray.F(this.f6885l);
        defaultExtractorInput.readFully(parsableByteArray.f5667a, 0, this.f6885l, false);
        return parsableByteArray;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        ParsableByteArray parsableByteArray = this.f6879a;
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 3, false);
        parsableByteArray.G(0);
        if (parsableByteArray.x() == 4607062) {
            defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 2, false);
            parsableByteArray.G(0);
            if ((parsableByteArray.A() & 250) == 0) {
                defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 4, false);
                parsableByteArray.G(0);
                int iG = parsableByteArray.g();
                defaultExtractorInput.f = 0;
                defaultExtractorInput.c(iG, false);
                defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 4, false);
                parsableByteArray.G(0);
                if (parsableByteArray.g() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f = extractorOutput;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0292  */
    /* JADX WARN: Code duplicated, block: B:102:0x0298  */
    /* JADX WARN: Code duplicated, block: B:145:0x0392  */
    /* JADX WARN: Code duplicated, block: B:146:0x0396  */
    /* JADX WARN: Code duplicated, block: B:184:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0169  */
    /* JADX WARN: Code duplicated, block: B:95:0x027d  */
    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException, EOFException, InterruptedIOException {
        long j;
        long j2;
        int i2;
        long j3;
        boolean z2;
        boolean z3;
        long j4;
        Assertions.f(this.f);
        while (true) {
            int i3 = this.g;
            if (i3 == 1) {
                ParsableByteArray parsableByteArray = this.f6880b;
                if (!((DefaultExtractorInput) extractorInput).readFully(parsableByteArray.f5667a, 0, 9, true)) {
                    return -1;
                }
                parsableByteArray.G(0);
                parsableByteArray.H(4);
                int iU = parsableByteArray.u();
                boolean z4 = (iU & 4) != 0;
                boolean z5 = (iU & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new AudioTagPayloadReader(this.f.track(8, 1));
                }
                if (z5 && this.f6887p == null) {
                    this.f6887p = new VideoTagPayloadReader(this.f.track(9, 2));
                }
                this.f.endTracks();
                this.j = parsableByteArray.g() - 5;
                this.g = 2;
            } else if (i3 == 2) {
                ((DefaultExtractorInput) extractorInput).skipFully(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i3 == 3) {
                ParsableByteArray parsableByteArray2 = this.f6881c;
                if (!((DefaultExtractorInput) extractorInput).readFully(parsableByteArray2.f5667a, 0, 11, true)) {
                    return -1;
                }
                parsableByteArray2.G(0);
                this.k = parsableByteArray2.u();
                this.f6885l = parsableByteArray2.x();
                this.m = parsableByteArray2.x();
                this.m = (((long) (parsableByteArray2.u() << 24)) | this.m) * 1000;
                parsableByteArray2.H(3);
                this.g = 4;
            } else {
                if (i3 != 4) {
                    throw new IllegalStateException();
                }
                boolean z6 = this.f6883h;
                ScriptTagPayloadReader scriptTagPayloadReader = this.f6882e;
                if (z6) {
                    j = this.f6884i + this.m;
                } else {
                    if (scriptTagPayloadReader.f6888b == -9223372036854775807L) {
                        j2 = 0;
                    } else {
                        j = this.m;
                    }
                    i2 = this.k;
                    if (i2 == 8 || this.o == null) {
                        if (i2 == 9 || this.f6887p == null) {
                            j3 = -9223372036854775807L;
                            if (i2 == 18 || this.f6886n) {
                                ((DefaultExtractorInput) extractorInput).skipFully(this.f6885l);
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
                                            scriptTagPayloadReader.f6888b = (long) (dDoubleValue * 1000000.0d);
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
                                            scriptTagPayloadReader.f6889c = new long[size];
                                            scriptTagPayloadReader.d = new long[size];
                                            int i4 = 0;
                                            while (i4 < size) {
                                                Object obj5 = list.get(i4);
                                                Object obj6 = list2.get(i4);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    scriptTagPayloadReader.f6889c = new long[0];
                                                    scriptTagPayloadReader.d = new long[0];
                                                    break;
                                                }
                                                double d2 = d;
                                                scriptTagPayloadReader.f6889c[i4] = (long) (((Double) obj6).doubleValue() * d2);
                                                scriptTagPayloadReader.d[i4] = ((Double) obj5).longValue();
                                                i4++;
                                                d = d2;
                                            }
                                        }
                                    }
                                }
                                long j5 = scriptTagPayloadReader.f6888b;
                                if (j5 != -9223372036854775807L) {
                                    this.f.e(new IndexSeekMap(scriptTagPayloadReader.d, scriptTagPayloadReader.f6889c, j5));
                                    this.f6886n = true;
                                }
                            }
                        } else {
                            if (!this.f6886n) {
                                this.f.e(new SeekMap.Unseekable(-9223372036854775807L));
                                this.f6886n = true;
                            }
                            VideoTagPayloadReader videoTagPayloadReader = this.f6887p;
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
                                byte[] bArr = parsableByteArrayA2.f5667a;
                                int i7 = parsableByteArrayA2.f5668b;
                                int i8 = i7 + 1;
                                parsableByteArrayA2.f5668b = i8;
                                int i9 = ((bArr[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8;
                                j3 = -9223372036854775807L;
                                int i10 = i7 + 2;
                                parsableByteArrayA2.f5668b = i10;
                                int i11 = ((bArr[i8] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i9;
                                parsableByteArrayA2.f5668b = i7 + 3;
                                long j6 = (((long) ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i11)) * 1000) + j2;
                                boolean z7 = true;
                                TrackOutput trackOutput = videoTagPayloadReader.f6890a;
                                if (iU3 != 0 || videoTagPayloadReader.f6893e) {
                                    if (iU3 == 1 && videoTagPayloadReader.f6893e) {
                                        int i12 = videoTagPayloadReader.g == 1 ? 1 : 0;
                                        if (videoTagPayloadReader.f || i12 != 0) {
                                            ParsableByteArray parsableByteArray3 = videoTagPayloadReader.f6892c;
                                            byte[] bArr2 = parsableByteArray3.f5667a;
                                            bArr2[0] = 0;
                                            bArr2[1] = 0;
                                            bArr2[2] = 0;
                                            int i13 = 4 - videoTagPayloadReader.d;
                                            int i14 = 0;
                                            while (parsableByteArrayA2.a() > 0) {
                                                parsableByteArrayA2.e(parsableByteArray3.f5667a, i13, videoTagPayloadReader.d);
                                                parsableByteArray3.G(0);
                                                int iY = parsableByteArray3.y();
                                                ParsableByteArray parsableByteArray4 = videoTagPayloadReader.f6891b;
                                                parsableByteArray4.G(0);
                                                trackOutput.e(4, parsableByteArray4);
                                                trackOutput.e(iY, parsableByteArrayA2);
                                                i14 = i14 + 4 + iY;
                                            }
                                            videoTagPayloadReader.f6890a.f(j6, i12, i14, 0, null);
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
                                    videoTagPayloadReader.d = avcConfigA.f6710b;
                                    Format.Builder builder = new Format.Builder();
                                    builder.f5429l = MimeTypes.l("video/avc");
                                    builder.f5428i = avcConfigA.f6715l;
                                    builder.r = avcConfigA.f6711c;
                                    builder.s = avcConfigA.d;
                                    builder.v = avcConfigA.k;
                                    builder.o = avcConfigA.f6709a;
                                    trackOutput.b(new Format(builder));
                                    videoTagPayloadReader.f6893e = true;
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
                        if (!this.f6886n) {
                            this.f.e(new SeekMap.Unseekable(-9223372036854775807L));
                            this.f6886n = true;
                        }
                        AudioTagPayloadReader audioTagPayloadReader = this.o;
                        ParsableByteArray parsableByteArrayA3 = a((DefaultExtractorInput) extractorInput);
                        if (audioTagPayloadReader.f6877b) {
                            parsableByteArrayA3.H(1);
                        } else {
                            int iU4 = parsableByteArrayA3.u();
                            int i15 = (iU4 >> 4) & 15;
                            audioTagPayloadReader.d = i15;
                            TrackOutput trackOutput2 = audioTagPayloadReader.f6890a;
                            if (i15 == 2) {
                                int i16 = AudioTagPayloadReader.f6876e[(iU4 >> 2) & 3];
                                Format.Builder builder2 = new Format.Builder();
                                builder2.f5429l = MimeTypes.l("audio/mpeg");
                                builder2.f5434z = 1;
                                builder2.f5418A = i16;
                                trackOutput2.b(new Format(builder2));
                                audioTagPayloadReader.f6878c = true;
                            } else if (i15 == 7 || i15 == 8) {
                                String str = i15 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                Format.Builder builder3 = new Format.Builder();
                                builder3.f5429l = MimeTypes.l(str);
                                builder3.f5434z = 1;
                                builder3.f5418A = 8000;
                                trackOutput2.b(new Format(builder3));
                                audioTagPayloadReader.f6878c = true;
                            } else if (i15 != 10) {
                                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + audioTagPayloadReader.d);
                            }
                            audioTagPayloadReader.f6877b = true;
                        }
                        int i17 = audioTagPayloadReader.d;
                        TrackOutput trackOutput3 = audioTagPayloadReader.f6890a;
                        z3 = true;
                        if (i17 == 2) {
                            int iA = parsableByteArrayA3.a();
                            trackOutput3.e(iA, parsableByteArrayA3);
                            audioTagPayloadReader.f6890a.f(j2, 1, iA, 0, null);
                        } else {
                            int iU5 = parsableByteArrayA3.u();
                            if (iU5 == 0 && !audioTagPayloadReader.f6878c) {
                                int iA2 = parsableByteArrayA3.a();
                                byte[] bArr4 = new byte[iA2];
                                parsableByteArrayA3.e(bArr4, 0, iA2);
                                AacUtil.Config configB = AacUtil.b(new ParsableBitArray(bArr4, iA2), false);
                                Format.Builder builder4 = new Format.Builder();
                                builder4.f5429l = MimeTypes.l("audio/mp4a-latm");
                                builder4.f5428i = configB.f6700c;
                                builder4.f5434z = configB.f6699b;
                                builder4.f5418A = configB.f6698a;
                                builder4.o = Collections.singletonList(bArr4);
                                trackOutput3.b(new Format(builder4));
                                audioTagPayloadReader.f6878c = true;
                            } else if (audioTagPayloadReader.d != 10 || iU5 == 1) {
                                int iA3 = parsableByteArrayA3.a();
                                trackOutput3.e(iA3, parsableByteArrayA3);
                                audioTagPayloadReader.f6890a.f(j2, 1, iA3, 0, null);
                            }
                            z3 = false;
                        }
                        z2 = true;
                        j3 = -9223372036854775807L;
                    }
                    if (!this.f6883h && z3) {
                        this.f6883h = true;
                        if (scriptTagPayloadReader.f6888b == j3) {
                            j4 = -this.m;
                        } else {
                            j4 = 0;
                        }
                        this.f6884i = j4;
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
                        ((DefaultExtractorInput) extractorInput).skipFully(this.f6885l);
                        z2 = false;
                        z3 = false;
                    } else {
                        j3 = -9223372036854775807L;
                        if (i2 == 18) {
                        }
                        ((DefaultExtractorInput) extractorInput).skipFully(this.f6885l);
                        z2 = false;
                        z3 = false;
                    }
                } else if (i2 == 9) {
                    j3 = -9223372036854775807L;
                    if (i2 == 18) {
                    }
                    ((DefaultExtractorInput) extractorInput).skipFully(this.f6885l);
                    z2 = false;
                    z3 = false;
                } else {
                    j3 = -9223372036854775807L;
                    if (i2 == 18) {
                    }
                    ((DefaultExtractorInput) extractorInput).skipFully(this.f6885l);
                    z2 = false;
                    z3 = false;
                }
                if (!this.f6883h) {
                    this.f6883h = true;
                    if (scriptTagPayloadReader.f6888b == j3) {
                        j4 = -this.m;
                    } else {
                        j4 = 0;
                    }
                    this.f6884i = j4;
                }
                this.j = 4;
                this.g = 2;
                if (z2) {
                    return 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.f6883h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }
}
