package androidx.media3.extractor.metadata.id3;

import I.a;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6932b = new a(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FramePredicate f6933a;

    public interface FramePredicate {
        boolean evaluate(int i2, int i3, int i4, int i5, int i6);
    }

    public static final class Id3Header {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6936c;

        public Id3Header(int i2, boolean z2, int i3) {
            this.f6934a = i2;
            this.f6935b = z2;
            this.f6936c = i3;
        }
    }

    public Id3Decoder(FramePredicate framePredicate) {
        this.f6933a = framePredicate;
    }

    public static ApicFrame d(ParsableByteArray parsableByteArray, int i2, int i3) {
        int iV;
        String strConcat;
        int iU = parsableByteArray.u();
        Charset charsetS = s(iU);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        parsableByteArray.e(bArr, 0, i4);
        if (i3 == 2) {
            strConcat = "image/" + Ascii.b(new String(bArr, 0, 3, Charsets.f19704b));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iV = 2;
        } else {
            iV = v(bArr, 0);
            String strB = Ascii.b(new String(bArr, 0, iV, Charsets.f19704b));
            strConcat = strB.indexOf(47) == -1 ? "image/".concat(strB) : strB;
        }
        int i5 = bArr[iV + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i6 = iV + 2;
        int iU2 = u(i6, iU, bArr);
        String str = new String(bArr, i6, iU2 - i6, charsetS);
        int iR = r(iU) + iU2;
        return new ApicFrame(strConcat, str, i5, i4 <= iR ? Util.f : Arrays.copyOfRange(bArr, iR, i4));
    }

    public static ChapterFrame e(ParsableByteArray parsableByteArray, int i2, int i3, boolean z2, int i4, FramePredicate framePredicate) throws Throwable {
        int i5 = parsableByteArray.f5668b;
        int iV = v(parsableByteArray.f5667a, i5);
        String str = new String(parsableByteArray.f5667a, i5, iV - i5, Charsets.f19704b);
        parsableByteArray.G(iV + 1);
        int iG = parsableByteArray.g();
        int iG2 = parsableByteArray.g();
        long jW = parsableByteArray.w();
        if (jW == 4294967295L) {
            jW = -1;
        }
        long jW2 = parsableByteArray.w();
        long j = jW2 == 4294967295L ? -1L : jW2;
        ArrayList arrayList = new ArrayList();
        int i6 = i5 + i2;
        while (parsableByteArray.f5668b < i6) {
            Id3Frame id3FrameH = h(i3, parsableByteArray, z2, i4, framePredicate);
            if (id3FrameH != null) {
                arrayList.add(id3FrameH);
            }
        }
        return new ChapterFrame(str, iG, iG2, jW, j, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame f(ParsableByteArray parsableByteArray, int i2, int i3, boolean z2, int i4, FramePredicate framePredicate) throws Throwable {
        int i5 = parsableByteArray.f5668b;
        int iV = v(parsableByteArray.f5667a, i5);
        String str = new String(parsableByteArray.f5667a, i5, iV - i5, Charsets.f19704b);
        parsableByteArray.G(iV + 1);
        int iU = parsableByteArray.u();
        boolean z3 = (iU & 2) != 0;
        boolean z4 = (iU & 1) != 0;
        int iU2 = parsableByteArray.u();
        String[] strArr = new String[iU2];
        for (int i6 = 0; i6 < iU2; i6++) {
            int i7 = parsableByteArray.f5668b;
            int iV2 = v(parsableByteArray.f5667a, i7);
            strArr[i6] = new String(parsableByteArray.f5667a, i7, iV2 - i7, Charsets.f19704b);
            parsableByteArray.G(iV2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i8 = i5 + i2;
        while (parsableByteArray.f5668b < i8) {
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
        Charset charsetS = s(iU);
        byte[] bArr = new byte[3];
        parsableByteArray.e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        parsableByteArray.e(bArr2, 0, i3);
        int iU2 = u(0, iU, bArr2);
        String str2 = new String(bArr2, 0, iU2, charsetS);
        int iR = r(iU) + iU2;
        return new CommentFrame(str, str2, l(bArr2, iR, u(iR, iU, bArr2), charsetS));
    }

    /* JADX WARN: Code duplicated, block: B:145:0x01af  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:169:0x01f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x0210  */
    /* JADX WARN: Code duplicated, block: B:182:0x0218  */
    /* JADX WARN: Code duplicated, block: B:187:0x0225 A[Catch: all -> 0x020a, Exception -> 0x020c, OutOfMemoryError -> 0x020e, TRY_LEAVE, TryCatch #7 {Exception -> 0x020c, OutOfMemoryError -> 0x020e, all -> 0x020a, blocks: (B:173:0x0205, B:186:0x0220, B:187:0x0225), top: B:203:0x01f3 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x0247  */
    /* JADX WARN: Instruction removed from duplicated block: B:194:0x0247, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [androidx.media3.extractor.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20, types: [androidx.media3.common.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.media3.common.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.media3.common.util.ParsableByteArray] */
    public static Id3Frame h(int i2, ParsableByteArray parsableByteArray, boolean z2, int i3, FramePredicate framePredicate) throws Throwable {
        int iY;
        ?? r1;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Throwable th;
        ?? r2;
        ?? r10;
        ?? r3;
        ?? r12;
        ?? r11;
        ?? r13;
        ParsableByteArray parsableByteArray2;
        Object binaryFrame;
        Object objG;
        Object objK;
        int i4 = i2;
        int iU = parsableByteArray.u();
        int iU2 = parsableByteArray.u();
        int iU3 = parsableByteArray.u();
        int iU4 = i4 >= 3 ? parsableByteArray.u() : 0;
        if (i4 == 4) {
            iY = parsableByteArray.y();
            if (!z2) {
                iY = (((iY >> 24) & 255) << 21) | (iY & 255) | (((iY >> 8) & 255) << 7) | (((iY >> 16) & 255) << 14);
            }
        } else {
            iY = i4 == 3 ? parsableByteArray.y() : parsableByteArray.x();
        }
        int iW = iY;
        int iA = i4 >= 3 ? parsableByteArray.A() : 0;
        if (iU == 0 && iU2 == 0 && iU3 == 0 && iU4 == 0 && iW == 0 && iA == 0) {
            parsableByteArray.G(parsableByteArray.f5669c);
            return null;
        }
        int i5 = parsableByteArray.f5668b + iW;
        if (i5 > parsableByteArray.f5669c) {
            Log.g("Id3Decoder", "Frame size exceeds remaining tag data");
            parsableByteArray.G(parsableByteArray.f5669c);
            return null;
        }
        if (framePredicate != null) {
            boolean zEvaluate = framePredicate.evaluate(i4, iU, iU2, iU3, iU4);
            r1 = iU;
            iW = iU2;
            if (!zEvaluate) {
                i4 = i4;
                parsableByteArray.G(i5);
                return null;
            }
        } else {
            iW = iU2;
            r1 = iU;
        }
        i4 = i4;
        if (i4 == 3) {
            z3 = (iA & 128) != 0;
            z6 = (iA & 64) != 0;
            z7 = false;
            z5 = (iA & 32) != 0;
            z4 = z3;
        } else if (i4 == 4) {
            boolean z8 = (iA & 64) != 0;
            boolean z9 = (iA & 8) != 0;
            z6 = (iA & 4) != 0;
            z7 = (iA & 2) != 0;
            z4 = (iA & 1) != 0;
            boolean z10 = z9;
            z5 = z8;
            z3 = z10;
        } else {
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
            z7 = false;
        }
        if (z3 || z6) {
            Log.g("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            parsableByteArray.G(i5);
            return null;
        }
        if (z5) {
            iW--;
            parsableByteArray.H(1);
        }
        if (z4) {
            iW -= 4;
            parsableByteArray.H(4);
        }
        if (z7) {
            iW = w(iW, parsableByteArray);
        }
        try {
            try {
                if (r1 == 84 && iW == 88 && iU3 == 88 && (i4 == 2 || iU4 == 88)) {
                    objK = o(iW, parsableByteArray);
                } else if (r1 == 84) {
                    objK = m(iW, parsableByteArray, t(i4, r1, iW, iU3, iU4));
                } else if (r1 == 87 && iW == 88 && iU3 == 88 && (i4 == 2 || iU4 == 88)) {
                    objK = q(iW, parsableByteArray);
                } else {
                    if (r1 != 87) {
                        if (r1 == 80 && iW == 82 && iU3 == 73 && iU4 == 86) {
                            objK = k(iW, parsableByteArray);
                        } else {
                            th = null;
                            try {
                                if (r1 == 71 && iW == 69 && iU3 == 79 && (iU4 == 66 || i4 == 2)) {
                                    objG = i(iW, parsableByteArray);
                                } else if (i4 == 2) {
                                    if (r1 == 80 && iW == 73 && iU3 == 67) {
                                        objG = d(parsableByteArray, iW, i4);
                                    } else {
                                        if (r1 == 67 || iW != 79 || iU3 != 77 || (iU4 != 77 && i4 != 2)) {
                                            if (r1 != 67 && iW == 72 && iU3 == 65 && iU4 == 80) {
                                                iW = iW;
                                                iU3 = iU3;
                                                iU4 = iU4;
                                                iW = iW;
                                                r13 = r1;
                                                try {
                                                    binaryFrame = e(parsableByteArray, iW, i4, z2, i3, framePredicate);
                                                    i4 = i2;
                                                    r1 = parsableByteArray;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    i4 = i2;
                                                    r3 = parsableByteArray;
                                                    r10 = r13;
                                                    r3.G(i5);
                                                    r12 = th;
                                                    r11 = r10;
                                                } catch (OutOfMemoryError e3) {
                                                    e = e3;
                                                    i4 = i2;
                                                    r3 = parsableByteArray;
                                                    r10 = r13;
                                                    r3.G(i5);
                                                    r12 = th;
                                                    r11 = r10;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r2 = parsableByteArray;
                                                    r2.G(i5);
                                                    throw th;
                                                }
                                            } else {
                                                iW = iW;
                                                iU3 = iU3;
                                                iU4 = iU4;
                                                iW = iW;
                                                r13 = r1;
                                                try {
                                                    if (r13 != 67 && iW == 84 && iU3 == 79 && iU4 == 67) {
                                                        i4 = i2;
                                                        ParsableByteArray parsableByteArray3 = parsableByteArray;
                                                        binaryFrame = f(parsableByteArray3, iW, i4, z2, i3, framePredicate);
                                                        r1 = parsableByteArray3;
                                                    } else {
                                                        i4 = i2;
                                                        parsableByteArray2 = parsableByteArray;
                                                        if (r13 != 77 && iW == 76 && iU3 == 76 && iU4 == 84) {
                                                            binaryFrame = j(iW, parsableByteArray2);
                                                            r1 = parsableByteArray2;
                                                        } else {
                                                            String strT = t(i4, r13 == true ? 1 : 0, iW, iU3, iU4);
                                                            byte[] bArr = new byte[iW];
                                                            parsableByteArray2.e(bArr, 0, iW);
                                                            binaryFrame = new BinaryFrame(strT, bArr);
                                                            r1 = parsableByteArray2;
                                                        }
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    r3 = r1;
                                                    r10 = r13;
                                                    r3.G(i5);
                                                    r12 = th;
                                                    r11 = r10;
                                                } catch (OutOfMemoryError e5) {
                                                    e = e5;
                                                    r3 = r1;
                                                    r10 = r13;
                                                    r3.G(i5);
                                                    r12 = th;
                                                    r11 = r10;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r2 = r1;
                                                    r2.G(i5);
                                                    throw th;
                                                }
                                            }
                                            if (r12 == 0) {
                                                Log.h("Id3Decoder", "Failed to decode frame: id=" + t(i4, r11, iW, iU3, iU4) + ", frameSize=" + iW, e);
                                            }
                                            return r12;
                                        }
                                        objG = g(iW, parsableByteArray);
                                    }
                                } else {
                                    if (r1 != 65 || iW != 80 || iU3 != 73 || iU4 != 67) {
                                        if (r1 == 67) {
                                        }
                                        if (r1 != 67) {
                                            iW = iW;
                                            iU3 = iU3;
                                            iU4 = iU4;
                                            iW = iW;
                                            r13 = r1;
                                            if (r13 != 67) {
                                                i4 = i2;
                                                parsableByteArray2 = parsableByteArray;
                                                if (r13 != 77) {
                                                    String strT2 = t(i4, r13 == true ? 1 : 0, iW, iU3, iU4);
                                                    byte[] bArr2 = new byte[iW];
                                                    parsableByteArray2.e(bArr2, 0, iW);
                                                    binaryFrame = new BinaryFrame(strT2, bArr2);
                                                    r1 = parsableByteArray2;
                                                } else {
                                                    String strT3 = t(i4, r13 == true ? 1 : 0, iW, iU3, iU4);
                                                    byte[] bArr3 = new byte[iW];
                                                    parsableByteArray2.e(bArr3, 0, iW);
                                                    binaryFrame = new BinaryFrame(strT3, bArr3);
                                                    r1 = parsableByteArray2;
                                                }
                                            } else {
                                                i4 = i2;
                                                parsableByteArray2 = parsableByteArray;
                                                if (r13 != 77) {
                                                    String strT4 = t(i4, r13 == true ? 1 : 0, iW, iU3, iU4);
                                                    byte[] bArr4 = new byte[iW];
                                                    parsableByteArray2.e(bArr4, 0, iW);
                                                    binaryFrame = new BinaryFrame(strT4, bArr4);
                                                    r1 = parsableByteArray2;
                                                } else {
                                                    String strT5 = t(i4, r13 == true ? 1 : 0, iW, iU3, iU4);
                                                    byte[] bArr5 = new byte[iW];
                                                    parsableByteArray2.e(bArr5, 0, iW);
                                                    binaryFrame = new BinaryFrame(strT5, bArr5);
                                                    r1 = parsableByteArray2;
                                                }
                                            }
                                        } else {
                                            iW = iW;
                                            iU3 = iU3;
                                            iU4 = iU4;
                                            iW = iW;
                                            r13 = r1;
                                            if (r13 != 67) {
                                                i4 = i2;
                                                parsableByteArray2 = parsableByteArray;
                                                if (r13 != 77) {
                                                    String strT6 = t(i4, r13 == true ? 1 : 0, iW, iU3, iU4);
                                                    byte[] bArr6 = new byte[iW];
                                                    parsableByteArray2.e(bArr6, 0, iW);
                                                    binaryFrame = new BinaryFrame(strT6, bArr6);
                                                    r1 = parsableByteArray2;
                                                } else {
                                                    String strT7 = t(i4, r13 == true ? 1 : 0, iW, iU3, iU4);
                                                    byte[] bArr7 = new byte[iW];
                                                    parsableByteArray2.e(bArr7, 0, iW);
                                                    binaryFrame = new BinaryFrame(strT7, bArr7);
                                                    r1 = parsableByteArray2;
                                                }
                                            } else {
                                                i4 = i2;
                                                parsableByteArray2 = parsableByteArray;
                                                if (r13 != 77) {
                                                    String strT8 = t(i4, r13 == true ? 1 : 0, iW, iU3, iU4);
                                                    byte[] bArr8 = new byte[iW];
                                                    parsableByteArray2.e(bArr8, 0, iW);
                                                    binaryFrame = new BinaryFrame(strT8, bArr8);
                                                    r1 = parsableByteArray2;
                                                } else {
                                                    String strT9 = t(i4, r13 == true ? 1 : 0, iW, iU3, iU4);
                                                    byte[] bArr9 = new byte[iW];
                                                    parsableByteArray2.e(bArr9, 0, iW);
                                                    binaryFrame = new BinaryFrame(strT9, bArr9);
                                                    r1 = parsableByteArray2;
                                                }
                                            }
                                        }
                                        if (r12 == 0) {
                                            Log.h("Id3Decoder", "Failed to decode frame: id=" + t(i4, r11, iW, iU3, iU4) + ", frameSize=" + iW, e);
                                        }
                                        return r12;
                                    }
                                    objG = d(parsableByteArray, iW, i4);
                                }
                                iW = iW;
                                binaryFrame = objG;
                                r13 = r1;
                                r1 = parsableByteArray;
                            } catch (Exception e6) {
                                e = e6;
                                iW = iW;
                                r10 = r1;
                                r3 = parsableByteArray;
                                r3.G(i5);
                                r12 = th;
                                r11 = r10;
                                if (r12 == 0) {
                                    Log.h("Id3Decoder", "Failed to decode frame: id=" + t(i4, r11, iW, iU3, iU4) + ", frameSize=" + iW, e);
                                }
                                return r12;
                            } catch (OutOfMemoryError e7) {
                                e = e7;
                                iW = iW;
                                r10 = r1;
                                r3 = parsableByteArray;
                                r3.G(i5);
                                r12 = th;
                                r11 = r10;
                                if (r12 == 0) {
                                    Log.h("Id3Decoder", "Failed to decode frame: id=" + t(i4, r11, iW, iU3, iU4) + ", frameSize=" + iW, e);
                                }
                                return r12;
                            }
                        }
                        r1.G(i5);
                        r12 = binaryFrame;
                        e = th;
                        r11 = r13;
                        if (r12 == 0) {
                            Log.h("Id3Decoder", "Failed to decode frame: id=" + t(i4, r11, iW, iU3, iU4) + ", frameSize=" + iW, e);
                        }
                        return r12;
                    }
                    objK = p(iW, parsableByteArray, t(i4, r1, iW, iU3, iU4));
                }
                iW = iW;
                th = null;
                binaryFrame = objK;
                r13 = r1;
                r1 = parsableByteArray;
                r1.G(i5);
                r12 = binaryFrame;
                e = th;
                r11 = r13;
            } catch (Exception e8) {
                e = e8;
                iW = iW;
                th = null;
                r10 = r1;
                r3 = parsableByteArray;
                r3.G(i5);
                r12 = th;
                r11 = r10;
                if (r12 == 0) {
                    Log.h("Id3Decoder", "Failed to decode frame: id=" + t(i4, r11, iW, iU3, iU4) + ", frameSize=" + iW, e);
                }
                return r12;
            } catch (OutOfMemoryError e9) {
                e = e9;
                iW = iW;
                th = null;
                r10 = r1;
                r3 = parsableByteArray;
                r3.G(i5);
                r12 = th;
                r11 = r10;
                if (r12 == 0) {
                    Log.h("Id3Decoder", "Failed to decode frame: id=" + t(i4, r11, iW, iU3, iU4) + ", frameSize=" + iW, e);
                }
                return r12;
            }
            if (r12 == 0) {
                Log.h("Id3Decoder", "Failed to decode frame: id=" + t(i4, r11, iW, iU3, iU4) + ", frameSize=" + iW, e);
            }
            return r12;
        } catch (Throwable th4) {
            th = th4;
            r2 = parsableByteArray;
        }
    }

    public static GeobFrame i(int i2, ParsableByteArray parsableByteArray) {
        int iU = parsableByteArray.u();
        Charset charsetS = s(iU);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.e(bArr, 0, i3);
        int iV = v(bArr, 0);
        String strL = MimeTypes.l(new String(bArr, 0, iV, Charsets.f19704b));
        int i4 = iV + 1;
        int iU2 = u(i4, iU, bArr);
        String strL2 = l(bArr, i4, iU2, charsetS);
        int iR = r(iU) + iU2;
        int iU3 = u(iR, iU, bArr);
        String strL3 = l(bArr, iR, iU3, charsetS);
        int iR2 = r(iU) + iU3;
        return new GeobFrame(strL, strL2, strL3, i3 <= iR2 ? Util.f : Arrays.copyOfRange(bArr, iR2, i3));
    }

    public static MlltFrame j(int i2, ParsableByteArray parsableByteArray) {
        int iA = parsableByteArray.A();
        int iX = parsableByteArray.x();
        int iX2 = parsableByteArray.x();
        int iU = parsableByteArray.u();
        int iU2 = parsableByteArray.u();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.k(parsableByteArray);
        int i3 = ((i2 - 10) * 8) / (iU + iU2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int iG = parsableBitArray.g(iU);
            int iG2 = parsableBitArray.g(iU2);
            iArr[i4] = iG;
            iArr2[i4] = iG2;
        }
        return new MlltFrame(iA, iX, iX2, iArr, iArr2);
    }

    public static PrivFrame k(int i2, ParsableByteArray parsableByteArray) {
        byte[] bArr = new byte[i2];
        parsableByteArray.e(bArr, 0, i2);
        int iV = v(bArr, 0);
        String str = new String(bArr, 0, iV, Charsets.f19704b);
        int i3 = iV + 1;
        return new PrivFrame(str, i2 <= i3 ? Util.f : Arrays.copyOfRange(bArr, i3, i2));
    }

    public static String l(byte[] bArr, int i2, int i3, Charset charset) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, charset);
    }

    public static TextInformationFrame m(int i2, ParsableByteArray parsableByteArray, String str) {
        if (i2 < 1) {
            return null;
        }
        int iU = parsableByteArray.u();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.e(bArr, 0, i3);
        return new TextInformationFrame(str, null, n(iU, 0, bArr));
    }

    public static ImmutableList n(int i2, int i3, byte[] bArr) {
        if (i3 >= bArr.length) {
            return ImmutableList.z("");
        }
        ImmutableList.Builder builderS = ImmutableList.s();
        int iU = u(i3, i2, bArr);
        while (i3 < iU) {
            builderS.h(new String(bArr, i3, iU - i3, s(i2)));
            i3 = r(i2) + iU;
            iU = u(i3, i2, bArr);
        }
        ImmutableList immutableListJ = builderS.j();
        return immutableListJ.isEmpty() ? ImmutableList.z("") : immutableListJ;
    }

    public static TextInformationFrame o(int i2, ParsableByteArray parsableByteArray) {
        if (i2 < 1) {
            return null;
        }
        int iU = parsableByteArray.u();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.e(bArr, 0, i3);
        int iU2 = u(0, iU, bArr);
        return new TextInformationFrame("TXXX", new String(bArr, 0, iU2, s(iU)), n(iU, r(iU) + iU2, bArr));
    }

    public static UrlLinkFrame p(int i2, ParsableByteArray parsableByteArray, String str) {
        byte[] bArr = new byte[i2];
        parsableByteArray.e(bArr, 0, i2);
        return new UrlLinkFrame(str, null, new String(bArr, 0, v(bArr, 0), Charsets.f19704b));
    }

    public static UrlLinkFrame q(int i2, ParsableByteArray parsableByteArray) {
        if (i2 < 1) {
            return null;
        }
        int iU = parsableByteArray.u();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.e(bArr, 0, i3);
        int iU2 = u(0, iU, bArr);
        String str = new String(bArr, 0, iU2, s(iU));
        int iR = r(iU) + iU2;
        return new UrlLinkFrame("WXXX", str, l(bArr, iR, v(bArr, iR), Charsets.f19704b));
    }

    public static int r(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    public static Charset s(int i2) {
        if (i2 == 1) {
            return Charsets.f;
        }
        if (i2 != 2) {
            return i2 != 3 ? Charsets.f19704b : Charsets.f19705c;
        }
        return Charsets.d;
    }

    public static String t(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static int u(int i2, int i3, byte[] bArr) {
        int iV = v(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return iV;
        }
        while (iV < bArr.length - 1) {
            if ((iV - i2) % 2 == 0 && bArr[iV + 1] == 0) {
                return iV;
            }
            iV = v(bArr, iV + 1);
        }
        return bArr.length;
    }

    public static int v(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    public static int w(int i2, ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.f5667a;
        int i3 = parsableByteArray.f5668b;
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
    public static boolean x(ParsableByteArray parsableByteArray, int i2, int i3, boolean z2) {
        int iX;
        long jX;
        int iA;
        int i4;
        int i5 = parsableByteArray.f5668b;
        while (true) {
            try {
                boolean z3 = true;
                if (parsableByteArray.a() < i3) {
                    parsableByteArray.G(i5);
                    return true;
                }
                if (i2 >= 3) {
                    iX = parsableByteArray.g();
                    jX = parsableByteArray.w();
                    iA = parsableByteArray.A();
                } else {
                    iX = parsableByteArray.x();
                    jX = parsableByteArray.x();
                    iA = 0;
                }
                if (iX == 0 && jX == 0 && iA == 0) {
                    parsableByteArray.G(i5);
                    return true;
                }
                if (i2 == 4 && !z2) {
                    if ((8421504 & jX) != 0) {
                        parsableByteArray.G(i5);
                        return false;
                    }
                    jX = (((jX >> 24) & 255) << 21) | (jX & 255) | (((jX >> 8) & 255) << 7) | (((jX >> 16) & 255) << 14);
                }
                if (i2 == 4) {
                    i4 = (iA & 64) != 0 ? 1 : 0;
                    if ((iA & 1) == 0) {
                        z3 = false;
                    }
                } else if (i2 == 3) {
                    i4 = (iA & 32) != 0 ? 1 : 0;
                    if ((iA & 128) == 0) {
                        z3 = false;
                    }
                } else {
                    i4 = 0;
                    z3 = false;
                }
                if (z3) {
                    i4 += 4;
                }
                if (jX < i4) {
                    parsableByteArray.G(i5);
                    return false;
                }
                if (parsableByteArray.a() < jX) {
                    parsableByteArray.G(i5);
                    return false;
                }
                parsableByteArray.H((int) jX);
            } catch (Throwable th) {
                parsableByteArray.G(i5);
                throw th;
            }
        }
    }

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
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
        int iW;
        Id3Frame id3FrameH;
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i2);
        boolean z4 = false;
        if (parsableByteArray.a() < 10) {
            Log.g("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iX = parsableByteArray.x();
            if (iX == 4801587) {
                int iU = parsableByteArray.u();
                parsableByteArray.H(1);
                int iU2 = parsableByteArray.u();
                int iT = parsableByteArray.t();
                if (iU != 2) {
                    if (iU == 3) {
                        if ((iU2 & 64) != 0) {
                            int iG = parsableByteArray.g();
                            parsableByteArray.H(iG);
                            iT -= iG + 4;
                        }
                    } else if (iU == 4) {
                        if ((iU2 & 64) != 0) {
                            int iT2 = parsableByteArray.t();
                            parsableByteArray.H(iT2 - 4);
                            iT -= iT2;
                        }
                        if ((iU2 & 16) != 0) {
                            iT -= 10;
                        }
                    } else {
                        androidx.datastore.preferences.protobuf.a.C(iU, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
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
                int i5 = parsableByteArray.f5668b;
                i3 = id3Header.f6934a;
                i4 = i3 == 2 ? 6 : 10;
                z3 = id3Header.f6935b;
                iW = id3Header.f6936c;
                if (z3) {
                    iW = w(iW, parsableByteArray);
                }
                parsableByteArray.F(i5 + iW);
                if (!x(parsableByteArray, i3, i4, false)) {
                    if (i3 == 4 || !x(parsableByteArray, 4, i4, true)) {
                        androidx.datastore.preferences.protobuf.a.C(i3, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z4 = true;
                }
                while (parsableByteArray.a() >= i4) {
                    id3FrameH = h(i3, parsableByteArray, z4, i4, this.f6933a);
                    if (id3FrameH != null) {
                        arrayList.add(id3FrameH);
                    }
                }
                return new Metadata(arrayList);
            }
            Log.g("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iX))));
        }
        id3Header = null;
        if (id3Header == null) {
            return null;
        }
        int i6 = parsableByteArray.f5668b;
        i3 = id3Header.f6934a;
        if (i3 == 2) {
        }
        z3 = id3Header.f6935b;
        iW = id3Header.f6936c;
        if (z3) {
            iW = w(iW, parsableByteArray);
        }
        parsableByteArray.F(i6 + iW);
        if (!x(parsableByteArray, i3, i4, false)) {
            if (i3 == 4) {
            }
            androidx.datastore.preferences.protobuf.a.C(i3, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (parsableByteArray.a() >= i4) {
            id3FrameH = h(i3, parsableByteArray, z4, i4, this.f6933a);
            if (id3FrameH != null) {
                arrayList.add(id3FrameH);
            }
        }
        return new Metadata(arrayList);
    }
}
