package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.VorbisBitArray;
import com.google.android.exoplayer2.extractor.VorbisUtil;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class VorbisReader extends StreamReader {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public VorbisSetup f17888n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17889p;
    public VorbisUtil.VorbisIdHeader q;
    public VorbisUtil.CommentHeader r;

    public static final class VorbisSetup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VorbisUtil.VorbisIdHeader f17890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final VorbisUtil.CommentHeader f17891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f17892c;
        public final VorbisUtil.Mode[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f17893e;

        public VorbisSetup(VorbisUtil.VorbisIdHeader vorbisIdHeader, VorbisUtil.CommentHeader commentHeader, byte[] bArr, VorbisUtil.Mode[] modeArr, int i2) {
            this.f17890a = vorbisIdHeader;
            this.f17891b = commentHeader;
            this.f17892c = bArr;
            this.d = modeArr;
            this.f17893e = i2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final void a(long j) {
        this.g = j;
        this.f17889p = j != 0;
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.q;
        this.o = vorbisIdHeader != null ? vorbisIdHeader.f17577e : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final long b(ParsableByteArray parsableByteArray) {
        byte b2 = parsableByteArray.f18956a[0];
        if ((b2 & 1) == 1) {
            return -1L;
        }
        VorbisSetup vorbisSetup = this.f17888n;
        Assertions.e(vorbisSetup);
        boolean z2 = vorbisSetup.d[(b2 >> 1) & (255 >>> (8 - vorbisSetup.f17893e))].f17573a;
        VorbisUtil.VorbisIdHeader vorbisIdHeader = vorbisSetup.f17890a;
        int i2 = !z2 ? vorbisIdHeader.f17577e : vorbisIdHeader.f;
        long j = this.f17889p ? (this.o + i2) / 4 : 0;
        byte[] bArr = parsableByteArray.f18956a;
        int length = bArr.length;
        int i3 = parsableByteArray.f18958c + 4;
        if (length < i3) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i3);
            parsableByteArray.D(bArrCopyOf, bArrCopyOf.length);
        } else {
            parsableByteArray.E(i3);
        }
        byte[] bArr2 = parsableByteArray.f18956a;
        int i4 = parsableByteArray.f18958c;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.f17889p = true;
        this.o = i2;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x03d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:164:0x03d3  */
    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final boolean c(ParsableByteArray parsableByteArray, long j, StreamReader.SetupData setupData) throws ParserException {
        VorbisSetup vorbisSetup;
        VorbisUtil.VorbisIdHeader vorbisIdHeader;
        VorbisUtil.VorbisIdHeader vorbisIdHeader2;
        int i2;
        if (this.f17888n != null) {
            setupData.f17886a.getClass();
            return false;
        }
        VorbisUtil.VorbisIdHeader vorbisIdHeader3 = this.q;
        int i3 = 1;
        int i4 = 4;
        if (vorbisIdHeader3 != null) {
            VorbisUtil.CommentHeader commentHeader = this.r;
            if (commentHeader == null) {
                this.r = VorbisUtil.c(parsableByteArray, true, true);
            } else {
                int i5 = parsableByteArray.f18958c;
                byte[] bArr = new byte[i5];
                System.arraycopy(parsableByteArray.f18956a, 0, bArr, 0, i5);
                int i6 = 5;
                VorbisUtil.d(5, parsableByteArray, false);
                int iU = parsableByteArray.u() + 1;
                VorbisBitArray vorbisBitArray = new VorbisBitArray(parsableByteArray.f18956a);
                int i7 = 8;
                vorbisBitArray.c(parsableByteArray.f18957b * 8);
                int i8 = 0;
                while (i8 < iU) {
                    int i9 = i7;
                    if (vorbisBitArray.b(24) != 5653314) {
                        throw ParserException.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((vorbisBitArray.f17571c * 8) + vorbisBitArray.d));
                    }
                    int iB = vorbisBitArray.b(16);
                    int iB2 = vorbisBitArray.b(24);
                    long[] jArr = new long[iB2];
                    long jFloor = 0;
                    if (vorbisBitArray.a()) {
                        vorbisIdHeader2 = vorbisIdHeader3;
                        int iB3 = vorbisBitArray.b(i6) + 1;
                        int i10 = 0;
                        while (i10 < iB2) {
                            int iB4 = vorbisBitArray.b(VorbisUtil.a(iB2 - i10));
                            int i11 = 0;
                            while (i11 < iB4 && i10 < iB2) {
                                jArr[i10] = iB3;
                                i10++;
                                i11++;
                                bArr = bArr;
                            }
                            iB3++;
                            bArr = bArr;
                        }
                        i2 = 4;
                    } else {
                        boolean zA = vorbisBitArray.a();
                        int i12 = 0;
                        while (i12 < iB2) {
                            if (!zA) {
                                jArr[i12] = vorbisBitArray.b(i6) + 1;
                            } else if (vorbisBitArray.a()) {
                                jArr[i12] = vorbisBitArray.b(i6) + 1;
                            } else {
                                jArr[i12] = 0;
                            }
                            i12++;
                            vorbisIdHeader3 = vorbisIdHeader3;
                            i4 = 4;
                        }
                        vorbisIdHeader2 = vorbisIdHeader3;
                        i2 = i4;
                    }
                    byte[] bArr2 = bArr;
                    int iB5 = vorbisBitArray.b(i2);
                    if (iB5 > 2) {
                        throw ParserException.a(null, "lookup type greater than 2 not decodable: " + iB5);
                    }
                    int i13 = i3;
                    if (iB5 == i13 || iB5 == 2) {
                        vorbisBitArray.c(32);
                        vorbisBitArray.c(32);
                        int iB6 = vorbisBitArray.b(i2) + i13;
                        vorbisBitArray.c(i13);
                        if (iB5 != i13) {
                            jFloor = ((long) iB2) * ((long) iB);
                        } else if (iB != 0) {
                            jFloor = (long) Math.floor(Math.pow(iB2, 1.0d / ((double) iB)));
                        }
                        vorbisBitArray.c((int) (((long) iB6) * jFloor));
                    }
                    i8++;
                    i7 = i9;
                    vorbisIdHeader3 = vorbisIdHeader2;
                    bArr = bArr2;
                    i3 = 1;
                    i4 = 4;
                    i6 = 5;
                }
                VorbisUtil.VorbisIdHeader vorbisIdHeader4 = vorbisIdHeader3;
                byte[] bArr3 = bArr;
                int i14 = i7;
                int iB7 = vorbisBitArray.b(6) + 1;
                for (int i15 = 0; i15 < iB7; i15++) {
                    if (vorbisBitArray.b(16) != 0) {
                        throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                    }
                }
                int i16 = 1;
                int iB8 = vorbisBitArray.b(6) + 1;
                int i17 = 0;
                while (true) {
                    int i18 = 3;
                    if (i17 >= iB8) {
                        int iB9 = vorbisBitArray.b(6) + 1;
                        for (int i19 = 0; i19 < iB9; i19++) {
                            if (vorbisBitArray.b(16) > 2) {
                                throw ParserException.a(null, "residueType greater than 2 is not decodable");
                            }
                            vorbisBitArray.c(24);
                            vorbisBitArray.c(24);
                            vorbisBitArray.c(24);
                            int iB10 = vorbisBitArray.b(6) + 1;
                            int i20 = 8;
                            vorbisBitArray.c(8);
                            int[] iArr = new int[iB10];
                            for (int i21 = 0; i21 < iB10; i21++) {
                                iArr[i21] = ((vorbisBitArray.a() ? vorbisBitArray.b(5) : 0) * 8) + vorbisBitArray.b(3);
                            }
                            int i22 = 0;
                            while (i22 < iB10) {
                                int i23 = 0;
                                while (i23 < i20) {
                                    if ((iArr[i22] & (1 << i23)) != 0) {
                                        vorbisBitArray.c(i20);
                                    }
                                    i23++;
                                    i20 = 8;
                                }
                                i22++;
                                i20 = 8;
                            }
                        }
                        int iB11 = vorbisBitArray.b(6) + 1;
                        int i24 = 0;
                        while (i24 < iB11) {
                            int iB12 = vorbisBitArray.b(16);
                            if (iB12 != 0) {
                                Log.c("VorbisUtil", "mapping type other than 0 not supported: " + iB12);
                                vorbisIdHeader = vorbisIdHeader4;
                            } else {
                                int iB13 = vorbisBitArray.a() ? vorbisBitArray.b(4) + 1 : 1;
                                boolean zA2 = vorbisBitArray.a();
                                vorbisIdHeader = vorbisIdHeader4;
                                int i25 = vorbisIdHeader.f17574a;
                                if (zA2) {
                                    int iB14 = vorbisBitArray.b(8) + 1;
                                    for (int i26 = 0; i26 < iB14; i26++) {
                                        int i27 = i25 - 1;
                                        vorbisBitArray.c(VorbisUtil.a(i27));
                                        vorbisBitArray.c(VorbisUtil.a(i27));
                                    }
                                }
                                if (vorbisBitArray.b(2) != 0) {
                                    throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                }
                                if (iB13 > 1) {
                                    for (int i28 = 0; i28 < i25; i28++) {
                                        vorbisBitArray.c(4);
                                    }
                                }
                                for (int i29 = 0; i29 < iB13; i29++) {
                                    vorbisBitArray.c(8);
                                    vorbisBitArray.c(8);
                                    vorbisBitArray.c(8);
                                }
                            }
                            i24++;
                            vorbisIdHeader4 = vorbisIdHeader;
                        }
                        VorbisUtil.VorbisIdHeader vorbisIdHeader5 = vorbisIdHeader4;
                        int iB15 = vorbisBitArray.b(6);
                        int i30 = iB15 + 1;
                        VorbisUtil.Mode[] modeArr = new VorbisUtil.Mode[i30];
                        for (int i31 = 0; i31 < i30; i31++) {
                            boolean zA3 = vorbisBitArray.a();
                            vorbisBitArray.b(16);
                            vorbisBitArray.b(16);
                            vorbisBitArray.b(8);
                            modeArr[i31] = new VorbisUtil.Mode(zA3);
                        }
                        if (!vorbisBitArray.a()) {
                            throw ParserException.a(null, "framing bit after modes not set as expected");
                        }
                        vorbisSetup = new VorbisSetup(vorbisIdHeader5, commentHeader, bArr3, modeArr, VorbisUtil.a(iB15));
                        break;
                    }
                    int iB16 = vorbisBitArray.b(16);
                    if (iB16 == 0) {
                        int i32 = i14;
                        vorbisBitArray.c(i32);
                        vorbisBitArray.c(16);
                        vorbisBitArray.c(16);
                        vorbisBitArray.c(6);
                        vorbisBitArray.c(i32);
                        int iB17 = vorbisBitArray.b(4) + 1;
                        int i33 = 0;
                        while (i33 < iB17) {
                            vorbisBitArray.c(i32);
                            i33++;
                            i32 = 8;
                        }
                    } else {
                        if (iB16 != i16) {
                            throw ParserException.a(null, "floor type greater than 1 not decodable: " + iB16);
                        }
                        int iB18 = vorbisBitArray.b(5);
                        int[] iArr2 = new int[iB18];
                        int i34 = -1;
                        for (int i35 = 0; i35 < iB18; i35++) {
                            int iB19 = vorbisBitArray.b(4);
                            iArr2[i35] = iB19;
                            if (iB19 > i34) {
                                i34 = iB19;
                            }
                        }
                        int i36 = i34 + 1;
                        int[] iArr3 = new int[i36];
                        int i37 = 0;
                        while (i37 < i36) {
                            iArr3[i37] = vorbisBitArray.b(i18) + 1;
                            int iB20 = vorbisBitArray.b(2);
                            int i38 = i14;
                            if (iB20 > 0) {
                                vorbisBitArray.c(i38);
                            }
                            int i39 = 0;
                            for (int i40 = 1; i39 < (i40 << iB20); i40 = 1) {
                                vorbisBitArray.c(i38);
                                i39++;
                                i38 = 8;
                            }
                            i37++;
                            i14 = 8;
                            i18 = 3;
                        }
                        vorbisBitArray.c(2);
                        int iB21 = vorbisBitArray.b(4);
                        int i41 = 0;
                        int i42 = 0;
                        for (int i43 = 0; i43 < iB18; i43++) {
                            i41 += iArr3[iArr2[i43]];
                            while (i42 < i41) {
                                vorbisBitArray.c(iB21);
                                i42++;
                            }
                        }
                    }
                    i17++;
                    i14 = 8;
                    i16 = 1;
                }
            }
            this.f17888n = vorbisSetup;
            if (vorbisSetup == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            VorbisUtil.VorbisIdHeader vorbisIdHeader6 = vorbisSetup.f17890a;
            arrayList.add(vorbisIdHeader6.g);
            arrayList.add(vorbisSetup.f17892c);
            Metadata metadataB = VorbisUtil.b(ImmutableList.v(vorbisSetup.f17891b.f17572a));
            Format.Builder builder = new Format.Builder();
            builder.k = "audio/vorbis";
            builder.f = vorbisIdHeader6.d;
            builder.g = vorbisIdHeader6.f17576c;
            builder.x = vorbisIdHeader6.f17574a;
            builder.y = vorbisIdHeader6.f17575b;
            builder.m = arrayList;
            builder.f17086i = metadataB;
            setupData.f17886a = new Format(builder);
            return true;
        }
        VorbisUtil.d(1, parsableByteArray, false);
        parsableByteArray.m();
        int iU2 = parsableByteArray.u();
        int iM = parsableByteArray.m();
        int i44 = parsableByteArray.i();
        int i45 = i44 <= 0 ? -1 : i44;
        int i46 = parsableByteArray.i();
        int i47 = i46 <= 0 ? -1 : i46;
        parsableByteArray.i();
        int iU3 = parsableByteArray.u();
        int iPow = (int) Math.pow(2.0d, iU3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iU3 & PsExtractor.VIDEO_STREAM_MASK) >> 4);
        parsableByteArray.u();
        this.q = new VorbisUtil.VorbisIdHeader(iU2, iM, i45, i47, iPow, iPow2, Arrays.copyOf(parsableByteArray.f18956a, parsableByteArray.f18958c));
        vorbisSetup = null;
        this.f17888n = vorbisSetup;
        if (vorbisSetup == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        VorbisUtil.VorbisIdHeader vorbisIdHeader7 = vorbisSetup.f17890a;
        arrayList2.add(vorbisIdHeader7.g);
        arrayList2.add(vorbisSetup.f17892c);
        Metadata metadataB2 = VorbisUtil.b(ImmutableList.v(vorbisSetup.f17891b.f17572a));
        Format.Builder builder2 = new Format.Builder();
        builder2.k = "audio/vorbis";
        builder2.f = vorbisIdHeader7.d;
        builder2.g = vorbisIdHeader7.f17576c;
        builder2.x = vorbisIdHeader7.f17574a;
        builder2.y = vorbisIdHeader7.f17575b;
        builder2.m = arrayList2;
        builder2.f17086i = metadataB2;
        setupData.f17886a = new Format(builder2);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final void d(boolean z2) {
        super.d(z2);
        if (z2) {
            this.f17888n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.f17889p = false;
    }
}
