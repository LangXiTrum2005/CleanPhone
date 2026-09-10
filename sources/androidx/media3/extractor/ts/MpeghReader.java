package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import com.google.common.collect.ImmutableList;
import com.google.common.math.LongMath;
import com.p004ironsource.mediationsdk.metadata.a;

/* JADX INFO: loaded from: classes.dex */
public final class MpeghReader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7575e;
    public TrackOutput f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7577i;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7578l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7579n;
    public int o;
    public int s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7581u;
    public int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f7572a = new ParsableByteArray(new byte[15], 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableBitArray f7573b = new ParsableBitArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f7574c = new ParsableByteArray();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MpeghUtil.MhasPacketHeader f7580p = new MpeghUtil.MhasPacketHeader();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f7576h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02da  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:189:0x03af  */
    /* JADX WARN: Code duplicated, block: B:202:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:212:0x0414  */
    /* JADX WARN: Code duplicated, block: B:214:0x041a  */
    /* JADX WARN: Code duplicated, block: B:216:0x0420  */
    /* JADX WARN: Code duplicated, block: B:218:0x0425 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x0427  */
    /* JADX WARN: Code duplicated, block: B:230:0x0451  */
    /* JADX WARN: Code duplicated, block: B:265:0x048c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x043c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0434 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x042c A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02bf, please report this as an issue */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) throws ParserException {
        int i2;
        int iG;
        int iG2;
        int i3;
        char c2;
        byte[] bArr;
        long j;
        long j2;
        ImmutableList immutableListA;
        char c3;
        int iG3;
        long jI;
        long j3;
        int iA;
        boolean z2;
        int i4;
        int i5;
        Assertions.f(this.f);
        while (parsableByteArray.a() > 0) {
            int i6 = this.d;
            int i7 = 8;
            int i8 = 1;
            if (i6 == 0) {
                int i9 = this.k;
                if ((i9 & 2) != 0) {
                    if ((i9 & 4) == 0) {
                        while (parsableByteArray.a() > 0) {
                            int i10 = this.f7578l << 8;
                            this.f7578l = i10;
                            int iU = i10 | parsableByteArray.u();
                            this.f7578l = iU;
                            if ((iU & 16777215) == 12583333) {
                                parsableByteArray.G(parsableByteArray.f5668b - 3);
                                this.f7578l = 0;
                            }
                        }
                    }
                    this.d = 1;
                    break;
                }
                parsableByteArray.G(parsableByteArray.f5669c);
            } else {
                MpeghUtil.MhasPacketHeader mhasPacketHeader = this.f7580p;
                ParsableByteArray parsableByteArray2 = this.f7574c;
                if (i6 == 1) {
                    int iA2 = parsableByteArray.a();
                    ParsableByteArray parsableByteArray3 = this.f7572a;
                    int iMin = Math.min(iA2, parsableByteArray3.a());
                    parsableByteArray.e(parsableByteArray3.f5667a, parsableByteArray3.f5668b, iMin);
                    parsableByteArray3.H(iMin);
                    if (parsableByteArray3.a() == 0) {
                        int i11 = parsableByteArray3.f5669c;
                        byte[] bArr2 = parsableByteArray3.f5667a;
                        ParsableBitArray parsableBitArray = this.f7573b;
                        parsableBitArray.l(bArr2, i11);
                        parsableBitArray.d();
                        int iA3 = MpeghUtil.a(parsableBitArray, 3, 8, 8);
                        mhasPacketHeader.f7582a = iA3;
                        if (iA3 != -1) {
                            Assertions.b(Math.max(Math.max(2, 8), 32) <= 63);
                            LongMath.a(LongMath.a(3L, 255L), 4294967296L);
                            if (parsableBitArray.b() < 2) {
                                jI = -1;
                            } else {
                                jI = parsableBitArray.i(2);
                                if (jI == 3) {
                                    j3 = -1;
                                    if (parsableBitArray.b() < 8) {
                                        jI = -1;
                                    } else {
                                        long jI2 = parsableBitArray.i(8);
                                        jI += jI2;
                                        if (jI2 == 255) {
                                            if (parsableBitArray.b() < 32) {
                                                jI = -1;
                                            } else {
                                                jI += parsableBitArray.i(32);
                                            }
                                        }
                                    }
                                }
                                mhasPacketHeader.f7583b = jI;
                                if (jI != j3) {
                                    z2 = false;
                                } else {
                                    if (jI <= 16) {
                                        throw ParserException.b("Contains sub-stream with an invalid packet label " + mhasPacketHeader.f7583b);
                                    }
                                    if (jI == 0) {
                                        i4 = mhasPacketHeader.f7582a;
                                        if (i4 != 1) {
                                            throw ParserException.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i4 != 2) {
                                            throw ParserException.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i4 == 17) {
                                            throw ParserException.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    iA = MpeghUtil.a(parsableBitArray, 11, 24, 24);
                                    mhasPacketHeader.f7584c = iA;
                                    if (iA != -1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                }
                            }
                            j3 = -1;
                            mhasPacketHeader.f7583b = jI;
                            if (jI != j3) {
                                z2 = false;
                            } else {
                                if (jI <= 16) {
                                    throw ParserException.b("Contains sub-stream with an invalid packet label " + mhasPacketHeader.f7583b);
                                }
                                if (jI == 0) {
                                    i4 = mhasPacketHeader.f7582a;
                                    if (i4 != 1) {
                                        throw ParserException.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i4 != 2) {
                                        throw ParserException.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i4 == 17) {
                                        throw ParserException.a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                iA = MpeghUtil.a(parsableBitArray, 11, 24, 24);
                                mhasPacketHeader.f7584c = iA;
                                if (iA != -1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            }
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            i5 = 0;
                            this.f7579n = 0;
                            this.o = mhasPacketHeader.f7584c + i11 + this.o;
                        } else {
                            i5 = 0;
                        }
                        if (z2) {
                            parsableByteArray3.G(i5);
                            this.f.e(parsableByteArray3.f5669c, parsableByteArray3);
                            parsableByteArray3.D(2);
                            parsableByteArray2.D(mhasPacketHeader.f7584c);
                            this.m = true;
                            this.d = 2;
                        } else {
                            int i12 = parsableByteArray3.f5669c;
                            if (i12 < 15) {
                                parsableByteArray3.F(i12 + 1);
                                this.m = false;
                            }
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (i6 != 2) {
                        throw new IllegalStateException();
                    }
                    int i13 = mhasPacketHeader.f7582a;
                    if (i13 == 1 || i13 == 17) {
                        int i14 = parsableByteArray.f5668b;
                        int iMin2 = Math.min(parsableByteArray.a(), parsableByteArray2.a());
                        parsableByteArray.e(parsableByteArray2.f5667a, parsableByteArray2.f5668b, iMin2);
                        parsableByteArray2.H(iMin2);
                        parsableByteArray.G(i14);
                    }
                    int iMin3 = Math.min(parsableByteArray.a(), mhasPacketHeader.f7584c - this.f7579n);
                    this.f.e(iMin3, parsableByteArray);
                    int i15 = this.f7579n + iMin3;
                    this.f7579n = i15;
                    if (i15 != mhasPacketHeader.f7584c) {
                        continue;
                    } else {
                        int i16 = mhasPacketHeader.f7582a;
                        if (i16 == 1) {
                            byte[] bArr3 = parsableByteArray2.f5667a;
                            ParsableBitArray parsableBitArray2 = new ParsableBitArray(bArr3, bArr3.length);
                            int iG4 = parsableBitArray2.g(8);
                            char c4 = 5;
                            int iG5 = parsableBitArray2.g(5);
                            if (iG5 != 31) {
                                switch (iG5) {
                                    case 0:
                                        iG2 = 96000;
                                        break;
                                    case 1:
                                        iG2 = 88200;
                                        break;
                                    case 2:
                                        iG2 = 64000;
                                        break;
                                    case 3:
                                        iG2 = 48000;
                                        break;
                                    case 4:
                                        iG2 = 44100;
                                        break;
                                    case 5:
                                        iG2 = 32000;
                                        break;
                                    case 6:
                                        iG2 = 24000;
                                        break;
                                    case 7:
                                        iG2 = 22050;
                                        break;
                                    case 8:
                                        iG2 = 16000;
                                        break;
                                    case 9:
                                        iG2 = 12000;
                                        break;
                                    case 10:
                                        iG2 = 11025;
                                        break;
                                    case 11:
                                        iG2 = 8000;
                                        break;
                                    case 12:
                                        iG2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw ParserException.b("Unsupported sampling rate index " + iG5);
                                    case 15:
                                        iG2 = 57600;
                                        break;
                                    case 16:
                                        iG2 = 51200;
                                        break;
                                    case 17:
                                        iG2 = 40000;
                                        break;
                                    case 18:
                                        iG2 = 38400;
                                        break;
                                    case 19:
                                        iG2 = 34150;
                                        break;
                                    case 20:
                                        iG2 = 28800;
                                        break;
                                    case 21:
                                        iG2 = 25600;
                                        break;
                                    case 22:
                                        iG2 = 20000;
                                        break;
                                    case 23:
                                        iG2 = 19200;
                                        break;
                                    case 24:
                                        iG2 = 17075;
                                        break;
                                    case 25:
                                        iG2 = 14400;
                                        break;
                                    case 26:
                                        iG2 = 12800;
                                        break;
                                    case 27:
                                        iG2 = 9600;
                                        break;
                                }
                            } else {
                                iG2 = parsableBitArray2.g(24);
                            }
                            int iG6 = parsableBitArray2.g(3);
                            if (iG6 == 0) {
                                i3 = 768;
                            } else if (iG6 == 1) {
                                i3 = 1024;
                            } else if (iG6 == 2 || iG6 == 3) {
                                i3 = a.f25965n;
                            } else {
                                if (iG6 != 4) {
                                    throw ParserException.b("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                i3 = 4096;
                            }
                            int i17 = i3;
                            if (iG6 == 0 || iG6 == 1) {
                                c2 = 0;
                            } else if (iG6 == 2) {
                                c2 = 2;
                            } else if (iG6 == 3) {
                                c2 = 3;
                            } else {
                                if (iG6 != 4) {
                                    throw ParserException.b("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                c2 = 1;
                            }
                            parsableBitArray2.o(2);
                            MpeghUtil.c(parsableBitArray2);
                            int iG7 = parsableBitArray2.g(5);
                            int i18 = 0;
                            int iA4 = 0;
                            while (true) {
                                int i19 = i8;
                                int i20 = 16;
                                if (i18 < iG7 + 1) {
                                    int iG8 = parsableBitArray2.g(3);
                                    iA4 = MpeghUtil.a(parsableBitArray2, 5, 8, 16) + 1 + iA4;
                                    if ((iG8 == 0 || iG8 == 2) && parsableBitArray2.f()) {
                                        MpeghUtil.c(parsableBitArray2);
                                    }
                                    i18++;
                                    i8 = i19;
                                } else {
                                    int iA5 = MpeghUtil.a(parsableBitArray2, 4, 8, 16) + 1;
                                    parsableBitArray2.n();
                                    int i21 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i21 < iA5) {
                                            int iG9 = parsableBitArray2.g(2);
                                            if (iG9 == 0) {
                                                c3 = c4;
                                                parsableBitArray2.o(3);
                                                if (parsableBitArray2.f()) {
                                                    parsableBitArray2.o(13);
                                                }
                                                if (c2 > 0) {
                                                    MpeghUtil.b(parsableBitArray2);
                                                }
                                            } else if (iG9 != i19) {
                                                if (iG9 == 3) {
                                                    MpeghUtil.a(parsableBitArray2, 4, i7, i20);
                                                    int iA6 = MpeghUtil.a(parsableBitArray2, 4, i7, i20);
                                                    if (parsableBitArray2.f()) {
                                                        MpeghUtil.a(parsableBitArray2, i7, i20, 0);
                                                    }
                                                    parsableBitArray2.n();
                                                    if (iA6 > 0) {
                                                        parsableBitArray2.o(iA6 * 8);
                                                    }
                                                }
                                                c3 = 5;
                                            } else {
                                                parsableBitArray2.o(3);
                                                boolean zF = parsableBitArray2.f();
                                                if (zF) {
                                                    parsableBitArray2.o(13);
                                                }
                                                if (zF) {
                                                    parsableBitArray2.n();
                                                }
                                                if (c2 > 0) {
                                                    MpeghUtil.b(parsableBitArray2);
                                                    iG3 = parsableBitArray2.g(2);
                                                } else {
                                                    iG3 = 0;
                                                }
                                                if (iG3 > 0) {
                                                    parsableBitArray2.o(6);
                                                    int iG10 = parsableBitArray2.g(2);
                                                    parsableBitArray2.o(4);
                                                    c3 = 5;
                                                    if (parsableBitArray2.f()) {
                                                        parsableBitArray2.o(5);
                                                    }
                                                    if (iG3 == 2 || iG3 == 3) {
                                                        parsableBitArray2.o(6);
                                                    }
                                                    if (iG10 == 2) {
                                                        parsableBitArray2.n();
                                                    }
                                                } else {
                                                    c3 = 5;
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iA4 - 1) / Math.log(2.0d))) + 1;
                                                int iG11 = parsableBitArray2.g(2);
                                                if (iG11 > 0 && parsableBitArray2.f()) {
                                                    parsableBitArray2.o(iFloor);
                                                }
                                                if (parsableBitArray2.f()) {
                                                    parsableBitArray2.o(iFloor);
                                                }
                                                if (c2 == 0 && iG11 == 0) {
                                                    parsableBitArray2.n();
                                                }
                                            }
                                            i21++;
                                            c4 = c3;
                                            i7 = 8;
                                            i20 = 16;
                                            i19 = 1;
                                        } else {
                                            if (parsableBitArray2.f()) {
                                                int i22 = 8;
                                                int iA7 = MpeghUtil.a(parsableBitArray2, 2, 4, 8) + 1;
                                                int i23 = 0;
                                                bArr = null;
                                                while (i23 < iA7) {
                                                    int iA8 = MpeghUtil.a(parsableBitArray2, 4, i22, 16);
                                                    int iA9 = MpeghUtil.a(parsableBitArray2, 4, i22, 16);
                                                    if (iA8 == 7) {
                                                        int iG12 = parsableBitArray2.g(4) + 1;
                                                        parsableBitArray2.o(4);
                                                        byte[] bArr4 = new byte[iG12];
                                                        for (int i24 = 0; i24 < iG12; i24++) {
                                                            bArr4[i24] = (byte) parsableBitArray2.g(i22);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        parsableBitArray2.o(iA9 * i22);
                                                    }
                                                    i23++;
                                                    i22 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iG2) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i17) * d);
                                                    j = this.t;
                                                    j2 = mhasPacketHeader.f7583b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        String strConcat = iG4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iG4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            immutableListA = null;
                                                        } else {
                                                            immutableListA = ImmutableList.A(Util.f, bArr);
                                                        }
                                                        Format.Builder builder = new Format.Builder();
                                                        builder.f5423a = this.f7575e;
                                                        builder.f5429l = MimeTypes.l("audio/mhm1");
                                                        builder.f5418A = this.q;
                                                        builder.f5428i = strConcat;
                                                        builder.o = immutableListA;
                                                        this.f.b(new Format(builder));
                                                    }
                                                    this.f7581u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i17) * d);
                                                    j = this.t;
                                                    j2 = mhasPacketHeader.f7583b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            immutableListA = null;
                                                        } else {
                                                            immutableListA = null;
                                                        }
                                                        Format.Builder builder2 = new Format.Builder();
                                                        builder2.f5423a = this.f7575e;
                                                        builder2.f5429l = MimeTypes.l("audio/mhm1");
                                                        builder2.f5418A = this.q;
                                                        builder2.f5428i = strConcat;
                                                        builder2.o = immutableListA;
                                                        this.f.b(new Format(builder2));
                                                    }
                                                    this.f7581u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i17) * d);
                                                    j = this.t;
                                                    j2 = mhasPacketHeader.f7583b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            immutableListA = null;
                                                        } else {
                                                            immutableListA = null;
                                                        }
                                                        Format.Builder builder3 = new Format.Builder();
                                                        builder3.f5423a = this.f7575e;
                                                        builder3.f5429l = MimeTypes.l("audio/mhm1");
                                                        builder3.f5418A = this.q;
                                                        builder3.f5428i = strConcat;
                                                        builder3.o = immutableListA;
                                                        this.f.b(new Format(builder3));
                                                    }
                                                    this.f7581u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i17) * d);
                                                    j = this.t;
                                                    j2 = mhasPacketHeader.f7583b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            immutableListA = null;
                                                        } else {
                                                            immutableListA = null;
                                                        }
                                                        Format.Builder builder4 = new Format.Builder();
                                                        builder4.f5423a = this.f7575e;
                                                        builder4.f5429l = MimeTypes.l("audio/mhm1");
                                                        builder4.f5418A = this.q;
                                                        builder4.f5428i = strConcat;
                                                        builder4.o = immutableListA;
                                                        this.f.b(new Format(builder4));
                                                    }
                                                    this.f7581u = true;
                                                    break;
                                                default:
                                                    throw ParserException.b("Unsupported sampling rate " + iG2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (i16 == 17) {
                            byte[] bArr5 = parsableByteArray2.f5667a;
                            ParsableBitArray parsableBitArray3 = new ParsableBitArray(bArr5, bArr5.length);
                            if (parsableBitArray3.f()) {
                                parsableBitArray3.o(2);
                                iG = parsableBitArray3.g(13);
                            } else {
                                iG = 0;
                            }
                            this.s = iG;
                        } else if (i16 == 2) {
                            if (this.f7581u) {
                                this.j = false;
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            double d2 = (((double) (this.r - this.s)) * 1000000.0d) / ((double) this.q);
                            long jRound = Math.round(this.g);
                            if (this.f7577i) {
                                this.f7577i = false;
                                this.g = this.f7576h;
                            } else {
                                this.g += d2;
                            }
                            this.f.f(jRound, i2, this.o, 0, null);
                            this.f7581u = false;
                            this.s = 0;
                            this.o = 0;
                        }
                        this.d = 1;
                    }
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        this.k = i2;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.f7577i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f7577i) {
                this.f7576h = j;
            } else {
                this.g = j;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(boolean z2) {
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f7575e = trackIdGenerator.f7653e;
        trackIdGenerator.b();
        this.f = extractorOutput.track(trackIdGenerator.d, 1);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.d = 0;
        this.f7578l = 0;
        this.f7572a.D(2);
        this.f7579n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.f7581u = false;
        this.f7577i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.f7576h = -9.223372036854776E18d;
    }
}
