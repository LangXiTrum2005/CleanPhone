package com.google.android.exoplayer2.metadata.id3;

import com.applovin.impl.Z;
import com.google.android.exoplayer2.analytics.f;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f18216b = new f(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FramePredicate f18217a;

    public interface FramePredicate {
        boolean evaluate(int i2, int i3, int i4, int i5, int i6);
    }

    public static final class Id3Header {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18220c;

        public Id3Header(int i2, boolean z2, int i3) {
            this.f18218a = i2;
            this.f18219b = z2;
            this.f18220c = i3;
        }
    }

    public Id3Decoder(FramePredicate framePredicate) {
        this.f18217a = framePredicate;
    }

    public static ApicFrame d(ParsableByteArray parsableByteArray, int i2, int i3) {
        int iQ;
        String strConcat;
        int iU = parsableByteArray.u();
        Charset charsetN = n(iU);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        parsableByteArray.e(bArr, 0, i4);
        if (i3 == 2) {
            strConcat = "image/" + Ascii.b(new String(bArr, 0, 3, Charsets.f19704b));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iQ = 2;
        } else {
            iQ = q(bArr, 0);
            String strB = Ascii.b(new String(bArr, 0, iQ, Charsets.f19704b));
            strConcat = strB.indexOf(47) == -1 ? "image/".concat(strB) : strB;
        }
        int i5 = bArr[iQ + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i6 = iQ + 2;
        int iP = p(i6, iU, bArr);
        String str = new String(bArr, i6, iP - i6, charsetN);
        int iM = m(iU) + iP;
        return new ApicFrame(strConcat, str, i5, i4 <= iM ? Util.f : Arrays.copyOfRange(bArr, iM, i4));
    }

    public static ChapterFrame e(ParsableByteArray parsableByteArray, int i2, int i3, boolean z2, int i4, FramePredicate framePredicate) throws Throwable {
        int i5 = parsableByteArray.f18957b;
        int iQ = q(parsableByteArray.f18956a, i5);
        String str = new String(parsableByteArray.f18956a, i5, iQ - i5, Charsets.f19704b);
        parsableByteArray.F(iQ + 1);
        int iG = parsableByteArray.g();
        int iG2 = parsableByteArray.g();
        long jV = parsableByteArray.v();
        if (jV == 4294967295L) {
            jV = -1;
        }
        long jV2 = parsableByteArray.v();
        long j = jV2 == 4294967295L ? -1L : jV2;
        ArrayList arrayList = new ArrayList();
        int i6 = i5 + i2;
        while (parsableByteArray.f18957b < i6) {
            Id3Frame id3FrameH = h(i3, parsableByteArray, z2, i4, framePredicate);
            if (id3FrameH != null) {
                arrayList.add(id3FrameH);
            }
        }
        return new ChapterFrame(str, iG, iG2, jV, j, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame f(ParsableByteArray parsableByteArray, int i2, int i3, boolean z2, int i4, FramePredicate framePredicate) throws Throwable {
        int i5 = parsableByteArray.f18957b;
        int iQ = q(parsableByteArray.f18956a, i5);
        String str = new String(parsableByteArray.f18956a, i5, iQ - i5, Charsets.f19704b);
        parsableByteArray.F(iQ + 1);
        int iU = parsableByteArray.u();
        boolean z3 = (iU & 2) != 0;
        boolean z4 = (iU & 1) != 0;
        int iU2 = parsableByteArray.u();
        String[] strArr = new String[iU2];
        for (int i6 = 0; i6 < iU2; i6++) {
            int i7 = parsableByteArray.f18957b;
            int iQ2 = q(parsableByteArray.f18956a, i7);
            strArr[i6] = new String(parsableByteArray.f18956a, i7, iQ2 - i7, Charsets.f19704b);
            parsableByteArray.F(iQ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i8 = i5 + i2;
        while (parsableByteArray.f18957b < i8) {
            Id3Frame id3FrameH = h(i3, parsableByteArray, z2, i4, framePredicate);
            if (id3FrameH != null) {
                arrayList.add(id3FrameH);
            }
        }
        return new ChapterTocFrame(str, z3, z4, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame g(int i2, ParsableByteArray parsableByteArray) {
        if (i2 < 4) {
            return null;
        }
        int iU = parsableByteArray.u();
        Charset charsetN = n(iU);
        byte[] bArr = new byte[3];
        parsableByteArray.e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        parsableByteArray.e(bArr2, 0, i3);
        int iP = p(0, iU, bArr2);
        String str2 = new String(bArr2, 0, iP, charsetN);
        int iM = m(iU) + iP;
        return new CommentFrame(str, str2, k(bArr2, iM, p(iM, iU, bArr2), charsetN));
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0232  */
    /* JADX WARN: Code duplicated, block: B:163:0x0268  */
    /* JADX WARN: Code duplicated, block: B:165:0x026f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0288  */
    /* JADX WARN: Code duplicated, block: B:175:0x028e  */
    /* JADX WARN: Code duplicated, block: B:181:0x029d A[Catch: all -> 0x0286, TryCatch #2 {all -> 0x0286, blocks: (B:183:0x02ae, B:170:0x0281, B:180:0x0298, B:181:0x029d), top: B:190:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x02ae A[Catch: all -> 0x0286, TRY_LEAVE, TryCatch #2 {all -> 0x0286, blocks: (B:183:0x02ae, B:170:0x0281, B:180:0x0298, B:181:0x029d), top: B:190:0x0111 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:183:0x02ae, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.google.android.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.google.android.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v19, types: [int] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    public static Id3Frame h(int i2, ParsableByteArray parsableByteArray, boolean z2, int i3, FramePredicate framePredicate) throws Throwable {
        int iX;
        ?? r1;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ?? r2;
        int i4;
        int i5;
        ?? r9;
        int i6;
        ParsableByteArray parsableByteArray2;
        ?? r10;
        int i7 = i2;
        int iU = parsableByteArray.u();
        int iU2 = parsableByteArray.u();
        int iU3 = parsableByteArray.u();
        int iU4 = i7 >= 3 ? parsableByteArray.u() : 0;
        if (i7 == 4) {
            iX = parsableByteArray.x();
            if (!z2) {
                iX = (((iX >> 24) & 255) << 21) | (iX & 255) | (((iX >> 8) & 255) << 7) | (((iX >> 16) & 255) << 14);
            }
        } else {
            iX = i7 == 3 ? parsableByteArray.x() : parsableByteArray.w();
        }
        int iR = iX;
        int iZ = i7 >= 3 ? parsableByteArray.z() : 0;
        Id3Frame binaryFrame = null;
        if (iU == 0 && iU2 == 0 && iU3 == 0 && iU4 == 0 && iR == 0 && iZ == 0) {
            parsableByteArray.F(parsableByteArray.f18958c);
            return null;
        }
        int i8 = parsableByteArray.f18957b + iR;
        if (i8 > parsableByteArray.f18958c) {
            Log.g("Id3Decoder", "Frame size exceeds remaining tag data");
            parsableByteArray.F(parsableByteArray.f18958c);
            return null;
        }
        if (framePredicate != null) {
            r1 = iU2;
            if (!framePredicate.evaluate(i7, iU, iU2, iU3, iU4)) {
                i7 = i7;
                parsableByteArray.F(i8);
                return null;
            }
        } else {
            r1 = iU2;
        }
        i7 = i7;
        if (i7 == 3) {
            boolean z8 = (iZ & 128) != 0;
            z7 = false;
            z6 = (iZ & 64) != 0;
            z5 = (iZ & 32) != 0;
            z4 = z8;
            z3 = z8;
        } else if (i7 == 4) {
            boolean z9 = (iZ & 64) != 0;
            boolean z10 = (iZ & 8) != 0;
            boolean z11 = (iZ & 4) != 0;
            boolean z12 = (iZ & 2) != 0;
            boolean z13 = z10;
            z5 = z9;
            z3 = z13;
            z4 = (iZ & 1) != 0;
            z6 = z11;
            z7 = z12;
        } else {
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
            z7 = false;
        }
        if (z3 || z6) {
            Log.g("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            parsableByteArray.F(i8);
            return null;
        }
        if (z5) {
            iR--;
            parsableByteArray.G(1);
        }
        if (z4) {
            iR -= 4;
            parsableByteArray.G(4);
        }
        if (z7) {
            iR = r(iR, parsableByteArray);
        }
        try {
            try {
                if (iU == 84 && r1 == 88 && iU3 == 88 && (i7 == 2 || iU4 == 88)) {
                    if (iR >= 1) {
                        int iU5 = parsableByteArray.u();
                        int i9 = iR - 1;
                        byte[] bArr = new byte[i9];
                        parsableByteArray.e(bArr, 0, i9);
                        int iP = p(0, iU5, bArr);
                        binaryFrame = new TextInformationFrame("TXXX", new String(bArr, 0, iP, n(iU5)), l(iU5, m(iU5) + iP, bArr));
                    }
                } else if (iU == 84) {
                    String strO = o(i7, iU, r1, iU3, iU4);
                    if (iR >= 1) {
                        int iU6 = parsableByteArray.u();
                        int i10 = iR - 1;
                        byte[] bArr2 = new byte[i10];
                        parsableByteArray.e(bArr2, 0, i10);
                        binaryFrame = new TextInformationFrame(strO, null, l(iU6, 0, bArr2));
                    }
                } else if (iU == 87 && r1 == 88 && iU3 == 88 && (i7 == 2 || iU4 == 88)) {
                    if (iR >= 1) {
                        int iU7 = parsableByteArray.u();
                        int i11 = iR - 1;
                        byte[] bArr3 = new byte[i11];
                        parsableByteArray.e(bArr3, 0, i11);
                        int iP2 = p(0, iU7, bArr3);
                        String str = new String(bArr3, 0, iP2, n(iU7));
                        int iM = m(iU7) + iP2;
                        binaryFrame = new UrlLinkFrame("WXXX", str, k(bArr3, iM, q(bArr3, iM), Charsets.f19704b));
                    }
                } else if (iU == 87) {
                    String strO2 = o(i7, iU, r1, iU3, iU4);
                    byte[] bArr4 = new byte[iR];
                    parsableByteArray.e(bArr4, 0, iR);
                    binaryFrame = new UrlLinkFrame(strO2, null, new String(bArr4, 0, q(bArr4, 0), Charsets.f19704b));
                } else if (iU == 80 && r1 == 82 && iU3 == 73 && iU4 == 86) {
                    byte[] bArr5 = new byte[iR];
                    parsableByteArray.e(bArr5, 0, iR);
                    int iQ = q(bArr5, 0);
                    String str2 = new String(bArr5, 0, iQ, Charsets.f19704b);
                    int i12 = iQ + 1;
                    binaryFrame = new PrivFrame(str2, iR <= i12 ? Util.f : Arrays.copyOfRange(bArr5, i12, iR));
                } else {
                    if (iU != 71 || r1 != 69 || iU3 != 79 || (iU4 != 66 && i7 != 2)) {
                        if (i7 == 2) {
                            if (iU == 80 && r1 == 73 && iU3 == 67) {
                                binaryFrame = d(parsableByteArray, iR, i7);
                            } else if (iU != 67 && r1 == 79 && iU3 == 77 && (iU4 == 77 || i7 == 2)) {
                                binaryFrame = g(iR, parsableByteArray);
                            } else if (iU != 67 && r1 == 72 && iU3 == 65 && iU4 == 80) {
                                int i13 = iR;
                                i4 = iU3;
                                i5 = i13;
                                r10 = r1;
                                i6 = iU4;
                                try {
                                    binaryFrame = e(parsableByteArray, i5, i7, z2, i3, framePredicate);
                                    i7 = i2;
                                    r1 = parsableByteArray;
                                } catch (Throwable th) {
                                    th = th;
                                    r2 = parsableByteArray;
                                    r2.F(i8);
                                    throw th;
                                }
                            } else {
                                int i14 = iR;
                                i4 = iU3;
                                i5 = i14;
                                r9 = r1;
                                i6 = iU4;
                                if (iU != 67 && r9 == 84 && i4 == 79 && i6 == 67) {
                                    i7 = i2;
                                    ParsableByteArray parsableByteArray3 = parsableByteArray;
                                    binaryFrame = f(parsableByteArray3, i5, i7, z2, i3, framePredicate);
                                    r1 = parsableByteArray3;
                                    r10 = r9;
                                } else {
                                    i7 = i2;
                                    parsableByteArray2 = parsableByteArray;
                                    if (iU != 77 && r9 == 76 && i4 == 76 && i6 == 84) {
                                        binaryFrame = j(i5, parsableByteArray2);
                                    } else {
                                        String strO3 = o(i7, iU, r9 == true ? 1 : 0, i4, i6);
                                        byte[] bArr6 = new byte[i5];
                                        parsableByteArray2.e(bArr6, 0, i5);
                                        binaryFrame = new BinaryFrame(strO3, bArr6);
                                        r1 = parsableByteArray2;
                                        r10 = r9;
                                    }
                                }
                            }
                        } else if (iU == 65 && r1 == 80 && iU3 == 73 && iU4 == 67) {
                            binaryFrame = d(parsableByteArray, iR, i7);
                        } else {
                            if (iU != 67) {
                            }
                            if (iU != 67) {
                                int i15 = iR;
                                i4 = iU3;
                                i5 = i15;
                                r9 = r1;
                                i6 = iU4;
                                if (iU != 67) {
                                    i7 = i2;
                                    parsableByteArray2 = parsableByteArray;
                                    if (iU != 77) {
                                        String strO4 = o(i7, iU, r9 == true ? 1 : 0, i4, i6);
                                        byte[] bArr7 = new byte[i5];
                                        parsableByteArray2.e(bArr7, 0, i5);
                                        binaryFrame = new BinaryFrame(strO4, bArr7);
                                        r1 = parsableByteArray2;
                                        r10 = r9;
                                    } else {
                                        String strO5 = o(i7, iU, r9 == true ? 1 : 0, i4, i6);
                                        byte[] bArr8 = new byte[i5];
                                        parsableByteArray2.e(bArr8, 0, i5);
                                        binaryFrame = new BinaryFrame(strO5, bArr8);
                                        r1 = parsableByteArray2;
                                        r10 = r9;
                                    }
                                } else {
                                    i7 = i2;
                                    parsableByteArray2 = parsableByteArray;
                                    if (iU != 77) {
                                        String strO6 = o(i7, iU, r9 == true ? 1 : 0, i4, i6);
                                        byte[] bArr9 = new byte[i5];
                                        parsableByteArray2.e(bArr9, 0, i5);
                                        binaryFrame = new BinaryFrame(strO6, bArr9);
                                        r1 = parsableByteArray2;
                                        r10 = r9;
                                    } else {
                                        String strO7 = o(i7, iU, r9 == true ? 1 : 0, i4, i6);
                                        byte[] bArr10 = new byte[i5];
                                        parsableByteArray2.e(bArr10, 0, i5);
                                        binaryFrame = new BinaryFrame(strO7, bArr10);
                                        r1 = parsableByteArray2;
                                        r10 = r9;
                                    }
                                }
                            } else {
                                int i16 = iR;
                                i4 = iU3;
                                i5 = i16;
                                r9 = r1;
                                i6 = iU4;
                                if (iU != 67) {
                                    i7 = i2;
                                    parsableByteArray2 = parsableByteArray;
                                    if (iU != 77) {
                                        String strO8 = o(i7, iU, r9 == true ? 1 : 0, i4, i6);
                                        byte[] bArr11 = new byte[i5];
                                        parsableByteArray2.e(bArr11, 0, i5);
                                        binaryFrame = new BinaryFrame(strO8, bArr11);
                                        r1 = parsableByteArray2;
                                        r10 = r9;
                                    } else {
                                        String strO9 = o(i7, iU, r9 == true ? 1 : 0, i4, i6);
                                        byte[] bArr12 = new byte[i5];
                                        parsableByteArray2.e(bArr12, 0, i5);
                                        binaryFrame = new BinaryFrame(strO9, bArr12);
                                        r1 = parsableByteArray2;
                                        r10 = r9;
                                    }
                                } else {
                                    i7 = i2;
                                    parsableByteArray2 = parsableByteArray;
                                    if (iU != 77) {
                                        String strO10 = o(i7, iU, r9 == true ? 1 : 0, i4, i6);
                                        byte[] bArr13 = new byte[i5];
                                        parsableByteArray2.e(bArr13, 0, i5);
                                        binaryFrame = new BinaryFrame(strO10, bArr13);
                                        r1 = parsableByteArray2;
                                        r10 = r9;
                                    } else {
                                        String strO11 = o(i7, iU, r9 == true ? 1 : 0, i4, i6);
                                        byte[] bArr14 = new byte[i5];
                                        parsableByteArray2.e(bArr14, 0, i5);
                                        binaryFrame = new BinaryFrame(strO11, bArr14);
                                        r1 = parsableByteArray2;
                                        r10 = r9;
                                    }
                                }
                            }
                        }
                        if (binaryFrame == null) {
                            r1 = parsableByteArray2;
                            r10 = r9;
                            Log.g("Id3Decoder", "Failed to decode frame: id=" + o(i7, iU, r10, i4, i6) + ", frameSize=" + i5);
                        }
                        r1 = parsableByteArray2;
                        r10 = r9;
                        r1.F(i8);
                        return binaryFrame;
                    }
                    binaryFrame = i(iR, parsableByteArray);
                }
                int i17 = iR;
                i4 = iU3;
                i5 = i17;
                r10 = r1;
                i6 = iU4;
                r1 = parsableByteArray;
                if (binaryFrame == null) {
                    r1 = parsableByteArray2;
                    r10 = r9;
                    Log.g("Id3Decoder", "Failed to decode frame: id=" + o(i7, iU, r10, i4, i6) + ", frameSize=" + i5);
                }
                r1 = parsableByteArray2;
                r10 = r9;
                r1.F(i8);
                return binaryFrame;
            } catch (Throwable th2) {
                th = th2;
                r2 = r1;
            }
        } catch (Throwable th3) {
            th = th3;
            r2 = parsableByteArray;
        }
    }

    public static GeobFrame i(int i2, ParsableByteArray parsableByteArray) {
        int iU = parsableByteArray.u();
        Charset charsetN = n(iU);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.e(bArr, 0, i3);
        int iQ = q(bArr, 0);
        String str = new String(bArr, 0, iQ, Charsets.f19704b);
        int i4 = iQ + 1;
        int iP = p(i4, iU, bArr);
        String strK = k(bArr, i4, iP, charsetN);
        int iM = m(iU) + iP;
        int iP2 = p(iM, iU, bArr);
        String strK2 = k(bArr, iM, iP2, charsetN);
        int iM2 = m(iU) + iP2;
        return new GeobFrame(str, strK, strK2, i3 <= iM2 ? Util.f : Arrays.copyOfRange(bArr, iM2, i3));
    }

    public static MlltFrame j(int i2, ParsableByteArray parsableByteArray) {
        int iZ = parsableByteArray.z();
        int iW = parsableByteArray.w();
        int iW2 = parsableByteArray.w();
        int iU = parsableByteArray.u();
        int iU2 = parsableByteArray.u();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.j(parsableByteArray);
        int i3 = ((i2 - 10) * 8) / (iU + iU2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int iG = parsableBitArray.g(iU);
            int iG2 = parsableBitArray.g(iU2);
            iArr[i4] = iG;
            iArr2[i4] = iG2;
        }
        return new MlltFrame(iZ, iW, iW2, iArr, iArr2);
    }

    public static String k(byte[] bArr, int i2, int i3, Charset charset) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, charset);
    }

    public static ImmutableList l(int i2, int i3, byte[] bArr) {
        if (i3 >= bArr.length) {
            return ImmutableList.z("");
        }
        ImmutableList.Builder builderS = ImmutableList.s();
        int iP = p(i3, i2, bArr);
        while (i3 < iP) {
            builderS.h(new String(bArr, i3, iP - i3, n(i2)));
            i3 = m(i2) + iP;
            iP = p(i3, i2, bArr);
        }
        ImmutableList immutableListJ = builderS.j();
        return immutableListJ.isEmpty() ? ImmutableList.z("") : immutableListJ;
    }

    public static int m(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    public static Charset n(int i2) {
        if (i2 == 1) {
            return Charsets.f;
        }
        if (i2 != 2) {
            return i2 != 3 ? Charsets.f19704b : Charsets.f19705c;
        }
        return Charsets.d;
    }

    public static String o(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static int p(int i2, int i3, byte[] bArr) {
        int iQ = q(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return iQ;
        }
        while (iQ < bArr.length - 1) {
            if ((iQ - i2) % 2 == 0 && bArr[iQ + 1] == 0) {
                return iQ;
            }
            iQ = q(bArr, iQ + 1);
        }
        return bArr.length;
    }

    public static int q(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    public static int r(int i2, ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.f18956a;
        int i3 = parsableByteArray.f18957b;
        int i4 = i3;
        while (true) {
            int i5 = i4 + 1;
            if (i5 >= i3 + i2) {
                return i2;
            }
            if ((bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255 && bArr[i5] == 0) {
                System.arraycopy(bArr, i4 + 2, bArr, i5, (i2 - (i4 - i3)) - 2);
                i2--;
            }
            i4 = i5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean s(ParsableByteArray parsableByteArray, int i2, int i3, boolean z2) {
        int iW;
        long jW;
        int iZ;
        int i4;
        int i5 = parsableByteArray.f18957b;
        while (true) {
            try {
                boolean z3 = true;
                if (parsableByteArray.a() < i3) {
                    parsableByteArray.F(i5);
                    return true;
                }
                if (i2 >= 3) {
                    iW = parsableByteArray.g();
                    jW = parsableByteArray.v();
                    iZ = parsableByteArray.z();
                } else {
                    iW = parsableByteArray.w();
                    jW = parsableByteArray.w();
                    iZ = 0;
                }
                if (iW == 0 && jW == 0 && iZ == 0) {
                    parsableByteArray.F(i5);
                    return true;
                }
                if (i2 == 4 && !z2) {
                    if ((8421504 & jW) != 0) {
                        parsableByteArray.F(i5);
                        return false;
                    }
                    jW = (((jW >> 24) & 255) << 21) | (jW & 255) | (((jW >> 8) & 255) << 7) | (((jW >> 16) & 255) << 14);
                }
                if (i2 == 4) {
                    i4 = (iZ & 64) != 0 ? 1 : 0;
                    if ((iZ & 1) == 0) {
                        z3 = false;
                    }
                } else if (i2 == 3) {
                    i4 = (iZ & 32) != 0 ? 1 : 0;
                    if ((iZ & 128) == 0) {
                        z3 = false;
                    }
                } else {
                    i4 = 0;
                    z3 = false;
                }
                if (z3) {
                    i4 += 4;
                }
                if (jW < i4) {
                    parsableByteArray.F(i5);
                    return false;
                }
                if (parsableByteArray.a() < jW) {
                    parsableByteArray.F(i5);
                    return false;
                }
                parsableByteArray.G((int) jW);
            } catch (Throwable th) {
                parsableByteArray.F(i5);
                throw th;
            }
        }
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    public final Metadata b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7 A[SYNTHETIC] */
    public final Metadata c(int i2, byte[] bArr) throws Throwable {
        boolean z2;
        Id3Header id3Header;
        int i3;
        int i4;
        boolean z3;
        int iR;
        Id3Frame id3FrameH;
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i2);
        boolean z4 = false;
        if (parsableByteArray.a() < 10) {
            Log.g("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iW = parsableByteArray.w();
            if (iW == 4801587) {
                int iU = parsableByteArray.u();
                parsableByteArray.G(1);
                int iU2 = parsableByteArray.u();
                int iT = parsableByteArray.t();
                if (iU != 2) {
                    if (iU == 3) {
                        if ((iU2 & 64) != 0) {
                            int iG = parsableByteArray.g();
                            parsableByteArray.G(iG);
                            iT -= iG + 4;
                        }
                    } else if (iU == 4) {
                        if ((iU2 & 64) != 0) {
                            int iT2 = parsableByteArray.t();
                            parsableByteArray.G(iT2 - 4);
                            iT -= iT2;
                        }
                        if ((iU2 & 16) != 0) {
                            iT -= 10;
                        }
                    } else {
                        Z.s(iU, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iU < 4) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    id3Header = new Id3Header(iU, z2, iT);
                } else if ((iU2 & 64) != 0) {
                    Log.g("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iU < 4 || (iU2 & 128) == 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    id3Header = new Id3Header(iU, z2, iT);
                }
                if (id3Header == null) {
                    return null;
                }
                int i5 = parsableByteArray.f18957b;
                i3 = id3Header.f18218a;
                i4 = i3 == 2 ? 6 : 10;
                z3 = id3Header.f18219b;
                iR = id3Header.f18220c;
                if (z3) {
                    iR = r(iR, parsableByteArray);
                }
                parsableByteArray.E(i5 + iR);
                if (!s(parsableByteArray, i3, i4, false)) {
                    if (i3 == 4 || !s(parsableByteArray, 4, i4, true)) {
                        Z.s(i3, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z4 = true;
                }
                while (parsableByteArray.a() >= i4) {
                    id3FrameH = h(i3, parsableByteArray, z4, i4, this.f18217a);
                    if (id3FrameH != null) {
                        arrayList.add(id3FrameH);
                    }
                }
                return new Metadata(arrayList);
            }
            Log.g("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iW))));
        }
        id3Header = null;
        if (id3Header == null) {
            return null;
        }
        int i6 = parsableByteArray.f18957b;
        i3 = id3Header.f18218a;
        if (i3 == 2) {
        }
        z3 = id3Header.f18219b;
        iR = id3Header.f18220c;
        if (z3) {
            iR = r(iR, parsableByteArray);
        }
        parsableByteArray.E(i6 + iR);
        if (!s(parsableByteArray, i3, i4, false)) {
            if (i3 == 4) {
            }
            Z.s(i3, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (parsableByteArray.a() >= i4) {
            id3FrameH = h(i3, parsableByteArray, z4, i4, this.f18217a);
            if (id3FrameH != null) {
                arrayList.add(id3FrameH);
            }
        }
        return new Metadata(arrayList);
    }
}
