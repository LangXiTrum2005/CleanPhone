package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.VorbisUtil;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class VorbisReader extends StreamReader {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public VorbisSetup f7197n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7198p;
    public VorbisUtil.VorbisIdHeader q;
    public VorbisUtil.CommentHeader r;

    public static final class VorbisSetup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VorbisUtil.VorbisIdHeader f7199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final VorbisUtil.CommentHeader f7200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f7201c;
        public final VorbisUtil.Mode[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7202e;

        public VorbisSetup(VorbisUtil.VorbisIdHeader vorbisIdHeader, VorbisUtil.CommentHeader commentHeader, byte[] bArr, VorbisUtil.Mode[] modeArr, int i2) {
            this.f7199a = vorbisIdHeader;
            this.f7200b = commentHeader;
            this.f7201c = bArr;
            this.d = modeArr;
            this.f7202e = i2;
        }
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final void a(long j) {
        this.g = j;
        this.f7198p = j != 0;
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.q;
        this.o = vorbisIdHeader != null ? vorbisIdHeader.f6820e : 0;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final long b(ParsableByteArray parsableByteArray) {
        byte b2 = parsableByteArray.f5667a[0];
        if ((b2 & 1) == 1) {
            return -1L;
        }
        VorbisSetup vorbisSetup = this.f7197n;
        Assertions.f(vorbisSetup);
        boolean z2 = vorbisSetup.d[(b2 >> 1) & (255 >>> (8 - vorbisSetup.f7202e))].f6816a;
        VorbisUtil.VorbisIdHeader vorbisIdHeader = vorbisSetup.f7199a;
        int i2 = !z2 ? vorbisIdHeader.f6820e : vorbisIdHeader.f;
        long j = this.f7198p ? (this.o + i2) / 4 : 0;
        byte[] bArr = parsableByteArray.f5667a;
        int length = bArr.length;
        int i3 = parsableByteArray.f5669c + 4;
        if (length < i3) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i3);
            parsableByteArray.E(bArrCopyOf, bArrCopyOf.length);
        } else {
            parsableByteArray.F(i3);
        }
        byte[] bArr2 = parsableByteArray.f5667a;
        int i4 = parsableByteArray.f5669c;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.f7198p = true;
        this.o = i2;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0376 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:156:0x0379  */
    @Override // androidx.media3.extractor.ogg.StreamReader
    public final boolean c(ParsableByteArray parsableByteArray, long j, StreamReader.SetupData setupData) throws ParserException {
        VorbisSetup vorbisSetup;
        int i2;
        if (this.f7197n != null) {
            setupData.f7195a.getClass();
            return false;
        }
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.q;
        int i3 = 1;
        int i4 = 4;
        if (vorbisIdHeader != null) {
            VorbisUtil.CommentHeader commentHeader = this.r;
            if (commentHeader == null) {
                this.r = VorbisUtil.c(parsableByteArray, true, true);
            } else {
                int i5 = parsableByteArray.f5669c;
                byte[] bArr = new byte[i5];
                System.arraycopy(parsableByteArray.f5667a, 0, bArr, 0, i5);
                int i6 = 5;
                VorbisUtil.d(5, parsableByteArray, false);
                int iU = parsableByteArray.u() + 1;
                VorbisBitArray vorbisBitArray = new VorbisBitArray(parsableByteArray.f5667a);
                int i7 = 8;
                vorbisBitArray.c(parsableByteArray.f5668b * 8);
                int i8 = 0;
                while (true) {
                    int i9 = 2;
                    int i10 = 16;
                    if (i8 < iU) {
                        int i11 = i7;
                        if (vorbisBitArray.b(24) != 5653314) {
                            throw ParserException.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((vorbisBitArray.f6814c * 8) + vorbisBitArray.d));
                        }
                        int iB = vorbisBitArray.b(16);
                        int iB2 = vorbisBitArray.b(24);
                        if (vorbisBitArray.a()) {
                            vorbisBitArray.c(5);
                            for (int iB3 = 0; iB3 < iB2; iB3 += vorbisBitArray.b(VorbisUtil.a(iB2 - iB3))) {
                            }
                        } else {
                            boolean zA = vorbisBitArray.a();
                            for (int i12 = 0; i12 < iB2; i12++) {
                                if (!zA) {
                                    vorbisBitArray.c(5);
                                } else if (vorbisBitArray.a()) {
                                    vorbisBitArray.c(5);
                                }
                            }
                        }
                        int iB4 = vorbisBitArray.b(4);
                        if (iB4 > 2) {
                            throw ParserException.a(null, "lookup type greater than 2 not decodable: " + iB4);
                        }
                        if (iB4 == 1 || iB4 == 2) {
                            vorbisBitArray.c(32);
                            vorbisBitArray.c(32);
                            int iB5 = vorbisBitArray.b(4) + 1;
                            vorbisBitArray.c(1);
                            vorbisBitArray.c((int) ((iB4 == 1 ? iB != 0 ? (long) Math.floor(Math.pow(iB2, 1.0d / ((double) iB))) : 0L : ((long) iB) * ((long) iB2)) * ((long) iB5)));
                        }
                        i8++;
                        i7 = i11;
                    } else {
                        int i13 = i7;
                        int i14 = 6;
                        int iB6 = vorbisBitArray.b(6) + 1;
                        for (int i15 = 0; i15 < iB6; i15++) {
                            if (vorbisBitArray.b(16) != 0) {
                                throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int iB7 = vorbisBitArray.b(6) + 1;
                        int i16 = 0;
                        while (true) {
                            int i17 = 3;
                            if (i16 >= iB7) {
                                int i18 = i3;
                                int iB8 = vorbisBitArray.b(i14) + 1;
                                int i19 = 0;
                                while (i19 < iB8) {
                                    if (vorbisBitArray.b(16) > 2) {
                                        throw ParserException.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    vorbisBitArray.c(24);
                                    vorbisBitArray.c(24);
                                    vorbisBitArray.c(24);
                                    int iB9 = vorbisBitArray.b(i14) + 1;
                                    int i20 = 8;
                                    vorbisBitArray.c(8);
                                    int[] iArr = new int[iB9];
                                    for (int i21 = 0; i21 < iB9; i21++) {
                                        iArr[i21] = ((vorbisBitArray.a() ? vorbisBitArray.b(5) : 0) * 8) + vorbisBitArray.b(3);
                                    }
                                    int i22 = 0;
                                    while (i22 < iB9) {
                                        int i23 = 0;
                                        while (i23 < i20) {
                                            if ((iArr[i22] & (i18 << i23)) != 0) {
                                                vorbisBitArray.c(i20);
                                            }
                                            i23++;
                                            i20 = 8;
                                        }
                                        i22++;
                                        i20 = 8;
                                    }
                                    i19++;
                                    i14 = 6;
                                }
                                int iB10 = vorbisBitArray.b(i14) + 1;
                                int i24 = 0;
                                while (i24 < iB10) {
                                    int iB11 = vorbisBitArray.b(16);
                                    if (iB11 != 0) {
                                        Log.c("VorbisUtil", "mapping type other than 0 not supported: " + iB11);
                                    } else {
                                        int iB12 = vorbisBitArray.a() ? vorbisBitArray.b(4) + 1 : i18;
                                        boolean zA2 = vorbisBitArray.a();
                                        int i25 = vorbisIdHeader.f6817a;
                                        if (zA2) {
                                            int iB13 = vorbisBitArray.b(8) + 1;
                                            for (int i26 = 0; i26 < iB13; i26++) {
                                                int i27 = i25 - 1;
                                                vorbisBitArray.c(VorbisUtil.a(i27));
                                                vorbisBitArray.c(VorbisUtil.a(i27));
                                            }
                                        }
                                        if (vorbisBitArray.b(2) != 0) {
                                            throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iB12 > i18) {
                                            for (int i28 = 0; i28 < i25; i28++) {
                                                vorbisBitArray.c(4);
                                            }
                                        }
                                        for (int i29 = 0; i29 < iB12; i29++) {
                                            vorbisBitArray.c(8);
                                            vorbisBitArray.c(8);
                                            vorbisBitArray.c(8);
                                        }
                                    }
                                    i24++;
                                    i18 = 1;
                                }
                                int iB14 = vorbisBitArray.b(6);
                                int i30 = iB14 + 1;
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
                                vorbisSetup = new VorbisSetup(vorbisIdHeader, commentHeader, bArr, modeArr, VorbisUtil.a(iB14));
                                break;
                            }
                            int iB15 = vorbisBitArray.b(i10);
                            if (iB15 == 0) {
                                int i32 = i13;
                                i2 = i3;
                                vorbisBitArray.c(i32);
                                vorbisBitArray.c(16);
                                vorbisBitArray.c(16);
                                vorbisBitArray.c(6);
                                vorbisBitArray.c(i32);
                                int iB16 = vorbisBitArray.b(4) + 1;
                                int i33 = 0;
                                while (i33 < iB16) {
                                    vorbisBitArray.c(i32);
                                    i33++;
                                    i32 = 8;
                                }
                            } else {
                                if (iB15 != i3) {
                                    throw ParserException.a(null, "floor type greater than 1 not decodable: " + iB15);
                                }
                                int iB17 = vorbisBitArray.b(i6);
                                i2 = i3;
                                int[] iArr2 = new int[iB17];
                                int i34 = -1;
                                for (int i35 = 0; i35 < iB17; i35++) {
                                    int iB18 = vorbisBitArray.b(i4);
                                    iArr2[i35] = iB18;
                                    if (iB18 > i34) {
                                        i34 = iB18;
                                    }
                                }
                                int i36 = i34 + 1;
                                int[] iArr3 = new int[i36];
                                int i37 = 0;
                                while (i37 < i36) {
                                    iArr3[i37] = vorbisBitArray.b(i17) + 1;
                                    int iB19 = vorbisBitArray.b(i9);
                                    int i38 = i13;
                                    if (iB19 > 0) {
                                        vorbisBitArray.c(i38);
                                    }
                                    int i39 = 0;
                                    while (i39 < (i2 << iB19)) {
                                        vorbisBitArray.c(i38);
                                        i39++;
                                        i38 = 8;
                                    }
                                    i37++;
                                    i13 = 8;
                                    i9 = 2;
                                    i17 = 3;
                                }
                                vorbisBitArray.c(i9);
                                int iB20 = vorbisBitArray.b(4);
                                int i40 = 0;
                                int i41 = 0;
                                for (int i42 = 0; i42 < iB17; i42++) {
                                    i40 += iArr3[iArr2[i42]];
                                    while (i41 < i40) {
                                        vorbisBitArray.c(iB20);
                                        i41++;
                                    }
                                }
                            }
                            i16++;
                            i3 = i2;
                            i13 = 8;
                            i14 = 6;
                            i9 = 2;
                            i4 = 4;
                            i10 = 16;
                            i6 = 5;
                        }
                    }
                }
            }
            this.f7197n = vorbisSetup;
            if (vorbisSetup == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            VorbisUtil.VorbisIdHeader vorbisIdHeader2 = vorbisSetup.f7199a;
            arrayList.add(vorbisIdHeader2.g);
            arrayList.add(vorbisSetup.f7201c);
            Metadata metadataB = VorbisUtil.b(ImmutableList.v(vorbisSetup.f7200b.f6815a));
            Format.Builder builder = new Format.Builder();
            builder.f5429l = MimeTypes.l("audio/vorbis");
            builder.g = vorbisIdHeader2.d;
            builder.f5427h = vorbisIdHeader2.f6819c;
            builder.f5434z = vorbisIdHeader2.f6817a;
            builder.f5418A = vorbisIdHeader2.f6818b;
            builder.o = arrayList;
            builder.j = metadataB;
            setupData.f7195a = new Format(builder);
            return true;
        }
        VorbisUtil.d(1, parsableByteArray, false);
        parsableByteArray.m();
        int iU2 = parsableByteArray.u();
        int iM = parsableByteArray.m();
        int i43 = parsableByteArray.i();
        int i44 = i43 <= 0 ? -1 : i43;
        int i45 = parsableByteArray.i();
        int i46 = i45 <= 0 ? -1 : i45;
        parsableByteArray.i();
        int iU3 = parsableByteArray.u();
        int iPow = (int) Math.pow(2.0d, iU3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iU3 & PsExtractor.VIDEO_STREAM_MASK) >> 4);
        parsableByteArray.u();
        this.q = new VorbisUtil.VorbisIdHeader(iU2, iM, i44, i46, iPow, iPow2, Arrays.copyOf(parsableByteArray.f5667a, parsableByteArray.f5669c));
        vorbisSetup = null;
        this.f7197n = vorbisSetup;
        if (vorbisSetup == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        VorbisUtil.VorbisIdHeader vorbisIdHeader3 = vorbisSetup.f7199a;
        arrayList2.add(vorbisIdHeader3.g);
        arrayList2.add(vorbisSetup.f7201c);
        Metadata metadataB2 = VorbisUtil.b(ImmutableList.v(vorbisSetup.f7200b.f6815a));
        Format.Builder builder2 = new Format.Builder();
        builder2.f5429l = MimeTypes.l("audio/vorbis");
        builder2.g = vorbisIdHeader3.d;
        builder2.f5427h = vorbisIdHeader3.f6819c;
        builder2.f5434z = vorbisIdHeader3.f6817a;
        builder2.f5418A = vorbisIdHeader3.f6818b;
        builder2.o = arrayList2;
        builder2.j = metadataB2;
        setupData.f7195a = new Format(builder2);
        return true;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final void d(boolean z2) {
        super.d(z2);
        if (z2) {
            this.f7197n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.f7198p = false;
    }
}
