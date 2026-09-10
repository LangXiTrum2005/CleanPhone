package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3241dC extends FW {
    public static final C2911Yl h = new C2911Yl(9);
    public final InterfaceC3064bC g;

    public C3241dC(InterfaceC3064bC interfaceC3064bC) {
        this.g = interfaceC3064bC;
    }

    public static boolean A0(JT jt, int i, int i2, boolean z) {
        int iV;
        long jV;
        int iY;
        int i3;
        int i4 = jt.b;
        while (true) {
            try {
                boolean z2 = true;
                if (jt.a() < i2) {
                    jt.E(i4);
                    return true;
                }
                if (i >= 3) {
                    iV = jt.f();
                    jV = jt.u();
                    iY = jt.y();
                } else {
                    iV = jt.v();
                    jV = jt.v();
                    iY = 0;
                }
                if (iV == 0 && jV == 0 && iY == 0) {
                    jt.E(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jV) != 0) {
                        jt.E(i4);
                        return false;
                    }
                    jV = (((jV >> 24) & 255) << 21) | (jV & 255) | (((jV >> 8) & 255) << 7) | (((jV >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iY & 64) != 0 ? 1 : 0;
                    if ((iY & 1) == 0) {
                        z2 = false;
                    }
                } else {
                    if (i == 3) {
                        i3 = (iY & 32) != 0 ? 1 : 0;
                        if ((iY & 128) == 0) {
                        }
                    } else {
                        i3 = 0;
                    }
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jV < i3) {
                    jt.E(i4);
                    return false;
                }
                if (jt.a() < jV) {
                    jt.E(i4);
                    return false;
                }
                jt.F((int) jV);
            } catch (Throwable th) {
                jt.E(i4);
                throw th;
            }
        }
    }

    public static ApicFrame l0(int i, int i2, JT jt) {
        int iY0;
        String strConcat;
        int iT = jt.t();
        Charset charsetV0 = v0(iT);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        jt.d(bArr, 0, i3);
        if (i2 == 2) {
            String str = "image/" + FW.h0(new String(bArr, 0, 3, AbstractC2333Ce.b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            strConcat = str;
            iY0 = 2;
        } else {
            iY0 = y0(bArr, 0);
            String strH0 = FW.h0(new String(bArr, 0, iY0, AbstractC2333Ce.b));
            strConcat = strH0.indexOf(47) == -1 ? "image/".concat(strH0) : strH0;
        }
        int i4 = bArr[iY0 + 1] & 255;
        int i5 = iY0 + 2;
        int iX0 = x0(bArr, i5, iT);
        String str2 = new String(bArr, i5, iX0 - i5, charsetV0);
        int iU0 = u0(iT) + iX0;
        return new ApicFrame(strConcat, str2, i4, i3 <= iU0 ? Ug0.e : Arrays.copyOfRange(bArr, iU0, i3));
    }

    public static ChapterFrame m0(JT jt, int i, int i2, boolean z, int i3, InterfaceC3064bC interfaceC3064bC) {
        int i4 = jt.b;
        int iY0 = y0(jt.f3266a, i4);
        String str = new String(jt.f3266a, i4, iY0 - i4, AbstractC2333Ce.b);
        jt.E(iY0 + 1);
        int iF = jt.f();
        int iF2 = jt.f();
        long jU = jt.u();
        long j = jU == 4294967295L ? -1L : jU;
        long jU2 = jt.u();
        long j2 = jU2 == 4294967295L ? -1L : jU2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (jt.b < i5) {
            Id3Frame id3FrameP0 = p0(i2, jt, z, i3, interfaceC3064bC);
            if (id3FrameP0 != null) {
                arrayList.add(id3FrameP0);
            }
        }
        return new ChapterFrame(str, iF, iF2, j, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame n0(JT jt, int i, int i2, boolean z, int i3, InterfaceC3064bC interfaceC3064bC) {
        int i4 = jt.b;
        int iY0 = y0(jt.f3266a, i4);
        String str = new String(jt.f3266a, i4, iY0 - i4, AbstractC2333Ce.b);
        jt.E(iY0 + 1);
        int iT = jt.t();
        boolean z2 = (iT & 2) != 0;
        boolean z3 = (iT & 1) != 0;
        int iT2 = jt.t();
        String[] strArr = new String[iT2];
        for (int i5 = 0; i5 < iT2; i5++) {
            int i6 = jt.b;
            int iY1 = y0(jt.f3266a, i6);
            strArr[i5] = new String(jt.f3266a, i6, iY1 - i6, AbstractC2333Ce.b);
            jt.E(iY1 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (jt.b < i7) {
            Id3Frame id3FrameP0 = p0(i2, jt, z, i3, interfaceC3064bC);
            if (id3FrameP0 != null) {
                arrayList.add(id3FrameP0);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame o0(int i, JT jt) {
        if (i < 4) {
            return null;
        }
        int iT = jt.t();
        Charset charsetV0 = v0(iT);
        byte[] bArr = new byte[3];
        jt.d(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        jt.d(bArr2, 0, i2);
        int iX0 = x0(bArr2, 0, iT);
        String str2 = new String(bArr2, 0, iX0, charsetV0);
        int iU0 = u0(iT) + iX0;
        return new CommentFrame(str, str2, s0(bArr2, iU0, x0(bArr2, iU0, iT), charsetV0));
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0221  */
    /* JADX WARN: Code duplicated, block: B:154:0x0232 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x0234  */
    /* JADX WARN: Code duplicated, block: B:160:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x024d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x0262 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x0264  */
    /* JADX WARN: Code duplicated, block: B:171:0x0271 A[Catch: all -> 0x015c, TryCatch #0 {all -> 0x015c, blocks: (B:173:0x0282, B:95:0x0113, B:97:0x013f, B:100:0x0146, B:111:0x016e, B:113:0x019f, B:122:0x01cc, B:124:0x01e0, B:126:0x01e7, B:125:0x01e3, B:135:0x0200, B:146:0x021b, B:153:0x022d, B:159:0x023c, B:164:0x0253, B:170:0x026c, B:171:0x0271), top: B:180:0x0104 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.google.android.exoplayer2.metadata.id3.Id3Frame, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [com.google.android.exoplayer2.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    public static Id3Frame p0(int i, JT jt, boolean z, int i2, InterfaceC3064bC interfaceC3064bC) {
        int iW;
        int i3;
        ?? r14;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        MlltFrame mlltFrameR0;
        ChapterTocFrame chapterTocFrameN0;
        ChapterFrame chapterFrameM0;
        Id3Frame urlLinkFrame;
        TextInformationFrame textInformationFrame;
        ?? binaryFrame;
        int iT = jt.t();
        int iT2 = jt.t();
        int iT3 = jt.t();
        int iT4 = i >= 3 ? jt.t() : 0;
        if (i == 4) {
            iW = jt.w();
            if (!z) {
                iW = (((iW >> 24) & 255) << 21) | (iW & 255) | (((iW >> 8) & 255) << 7) | (((iW >> 16) & 255) << 14);
            }
        } else {
            iW = i == 3 ? jt.w() : jt.v();
        }
        int i4 = iW;
        int iY = i >= 3 ? jt.y() : 0;
        if (iT == 0 && iT2 == 0 && iT3 == 0 && iT4 == 0 && i4 == 0 && iY == 0) {
            jt.E(jt.c);
            return null;
        }
        int i5 = jt.b + i4;
        if (i5 > jt.c) {
            AbstractC4038mJ.f();
            jt.E(jt.c);
            return null;
        }
        if (interfaceC3064bC != null) {
            i3 = i5;
            r14 = 0;
            if (!interfaceC3064bC.evaluate(i, iT, iT2, iT3, iT4)) {
                jt.E(i3);
                return null;
            }
        } else {
            i3 = i5;
            r14 = 0;
        }
        if (i != 3) {
            int i6 = iY;
            if (i == 4) {
                boolean z7 = (i6 & 64) != 0;
                boolean z8 = (i6 & 8) != 0;
                boolean z9 = (i6 & 4) != 0;
                z6 = (i6 & 2) != 0;
                boolean z10 = z9;
                z5 = (i6 & 1) != 0;
                z2 = z7;
                z3 = z8;
                z4 = z10;
            } else {
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            if (!z3 || z4) {
                AbstractC4038mJ.f();
                jt.E(i3);
                return r14;
            }
            if (z2) {
                i4--;
                jt.F(1);
            }
            if (z5) {
                i4 -= 4;
                jt.F(4);
            }
            int iZ0 = z6 ? z0(i4, jt) : i4;
            try {
                if (iT == 84 && iT2 == 88 && iT3 == 88 && (i == 2 || iT4 == 88)) {
                    if (iZ0 < 1) {
                        binaryFrame = r14;
                    } else {
                        int iT5 = jt.t();
                        int i7 = iZ0 - 1;
                        byte[] bArr = new byte[i7];
                        jt.d(bArr, 0, i7);
                        int iX0 = x0(bArr, 0, iT5);
                        urlLinkFrame = new TextInformationFrame("TXXX", new String(bArr, 0, iX0, v0(iT5)), t0(bArr, iT5, u0(iT5) + iX0));
                        binaryFrame = urlLinkFrame;
                    }
                } else if (iT == 84) {
                    String strW0 = w0(i, iT, iT2, iT3, iT4);
                    if (iZ0 < 1) {
                        binaryFrame = r14;
                    } else {
                        int iT6 = jt.t();
                        int i8 = iZ0 - 1;
                        byte[] bArr2 = new byte[i8];
                        jt.d(bArr2, 0, i8);
                        textInformationFrame = new TextInformationFrame(strW0, (String) r14, t0(bArr2, iT6, 0));
                    }
                } else {
                    if (iT == 87 && iT2 == 88 && iT3 == 88 && (i == 2 || iT4 == 88)) {
                        if (iZ0 < 1) {
                            binaryFrame = r14;
                        } else {
                            int iT7 = jt.t();
                            int i9 = iZ0 - 1;
                            byte[] bArr3 = new byte[i9];
                            jt.d(bArr3, 0, i9);
                            int iX1 = x0(bArr3, 0, iT7);
                            String str = new String(bArr3, 0, iX1, v0(iT7));
                            int iU0 = u0(iT7) + iX1;
                            urlLinkFrame = new UrlLinkFrame("WXXX", str, s0(bArr3, iU0, y0(bArr3, iU0), AbstractC2333Ce.b));
                        }
                    } else if (iT == 87) {
                        String strW1 = w0(i, iT, iT2, iT3, iT4);
                        byte[] bArr4 = new byte[iZ0];
                        jt.d(bArr4, 0, iZ0);
                        urlLinkFrame = new UrlLinkFrame(strW1, r14, new String(bArr4, 0, y0(bArr4, 0), AbstractC2333Ce.b));
                    } else if (iT == 80 && iT2 == 82 && iT3 == 73 && iT4 == 86) {
                        byte[] bArr5 = new byte[iZ0];
                        jt.d(bArr5, 0, iZ0);
                        int iY0 = y0(bArr5, 0);
                        String str2 = new String(bArr5, 0, iY0, AbstractC2333Ce.b);
                        int i10 = iY0 + 1;
                        binaryFrame = new PrivFrame(str2, iZ0 <= i10 ? Ug0.e : Arrays.copyOfRange(bArr5, i10, iZ0));
                    } else if (iT == 71 && iT2 == 69 && iT3 == 79 && (iT4 == 66 || i == 2)) {
                        binaryFrame = q0(iZ0, jt);
                    } else if (i == 2) {
                        if (iT == 80 && iT2 == 73 && iT3 == 67) {
                            binaryFrame = l0(iZ0, i, jt);
                        } else if (iT != 67 && iT2 == 79 && iT3 == 77 && (iT4 == 77 || i == 2)) {
                            binaryFrame = o0(iZ0, jt);
                        } else if (iT != 67 && iT2 == 72 && iT3 == 65 && iT4 == 80) {
                            chapterFrameM0 = m0(jt, iZ0, i, z, i2, interfaceC3064bC);
                        } else if (iT != 67 && iT2 == 84 && iT3 == 79 && iT4 == 67) {
                            chapterTocFrameN0 = n0(jt, iZ0, i, z, i2, interfaceC3064bC);
                        } else if (iT != 77 && iT2 == 76 && iT3 == 76 && iT4 == 84) {
                            mlltFrameR0 = r0(iZ0, jt);
                        } else {
                            String strW2 = w0(i, iT, iT2, iT3, iT4);
                            byte[] bArr6 = new byte[iZ0];
                            jt.d(bArr6, 0, iZ0);
                            binaryFrame = new BinaryFrame(strW2, bArr6);
                        }
                    } else if (iT == 65 && iT2 == 80 && iT3 == 73 && iT4 == 67) {
                        binaryFrame = l0(iZ0, i, jt);
                    } else if (iT != 67) {
                        if (iT != 67) {
                            if (iT != 67) {
                                if (iT != 77) {
                                    String strW3 = w0(i, iT, iT2, iT3, iT4);
                                    byte[] bArr7 = new byte[iZ0];
                                    jt.d(bArr7, 0, iZ0);
                                    binaryFrame = new BinaryFrame(strW3, bArr7);
                                } else {
                                    String strW4 = w0(i, iT, iT2, iT3, iT4);
                                    byte[] bArr8 = new byte[iZ0];
                                    jt.d(bArr8, 0, iZ0);
                                    binaryFrame = new BinaryFrame(strW4, bArr8);
                                }
                            } else if (iT != 77) {
                                String strW5 = w0(i, iT, iT2, iT3, iT4);
                                byte[] bArr9 = new byte[iZ0];
                                jt.d(bArr9, 0, iZ0);
                                binaryFrame = new BinaryFrame(strW5, bArr9);
                            } else {
                                String strW6 = w0(i, iT, iT2, iT3, iT4);
                                byte[] bArr10 = new byte[iZ0];
                                jt.d(bArr10, 0, iZ0);
                                binaryFrame = new BinaryFrame(strW6, bArr10);
                            }
                        } else if (iT != 67) {
                            if (iT != 77) {
                                String strW7 = w0(i, iT, iT2, iT3, iT4);
                                byte[] bArr11 = new byte[iZ0];
                                jt.d(bArr11, 0, iZ0);
                                binaryFrame = new BinaryFrame(strW7, bArr11);
                            } else {
                                String strW8 = w0(i, iT, iT2, iT3, iT4);
                                byte[] bArr12 = new byte[iZ0];
                                jt.d(bArr12, 0, iZ0);
                                binaryFrame = new BinaryFrame(strW8, bArr12);
                            }
                        } else if (iT != 77) {
                            String strW9 = w0(i, iT, iT2, iT3, iT4);
                            byte[] bArr13 = new byte[iZ0];
                            jt.d(bArr13, 0, iZ0);
                            binaryFrame = new BinaryFrame(strW9, bArr13);
                        } else {
                            String strW10 = w0(i, iT, iT2, iT3, iT4);
                            byte[] bArr14 = new byte[iZ0];
                            jt.d(bArr14, 0, iZ0);
                            binaryFrame = new BinaryFrame(strW10, bArr14);
                        }
                    } else if (iT != 67) {
                        if (iT != 67) {
                            if (iT != 77) {
                                String strW11 = w0(i, iT, iT2, iT3, iT4);
                                byte[] bArr15 = new byte[iZ0];
                                jt.d(bArr15, 0, iZ0);
                                binaryFrame = new BinaryFrame(strW11, bArr15);
                            } else {
                                String strW12 = w0(i, iT, iT2, iT3, iT4);
                                byte[] bArr16 = new byte[iZ0];
                                jt.d(bArr16, 0, iZ0);
                                binaryFrame = new BinaryFrame(strW12, bArr16);
                            }
                        } else if (iT != 77) {
                            String strW13 = w0(i, iT, iT2, iT3, iT4);
                            byte[] bArr17 = new byte[iZ0];
                            jt.d(bArr17, 0, iZ0);
                            binaryFrame = new BinaryFrame(strW13, bArr17);
                        } else {
                            String strW14 = w0(i, iT, iT2, iT3, iT4);
                            byte[] bArr18 = new byte[iZ0];
                            jt.d(bArr18, 0, iZ0);
                            binaryFrame = new BinaryFrame(strW14, bArr18);
                        }
                    } else if (iT != 67) {
                        if (iT != 77) {
                            String strW15 = w0(i, iT, iT2, iT3, iT4);
                            byte[] bArr19 = new byte[iZ0];
                            jt.d(bArr19, 0, iZ0);
                            binaryFrame = new BinaryFrame(strW15, bArr19);
                        } else {
                            String strW16 = w0(i, iT, iT2, iT3, iT4);
                            byte[] bArr110 = new byte[iZ0];
                            jt.d(bArr110, 0, iZ0);
                            binaryFrame = new BinaryFrame(strW16, bArr110);
                        }
                    } else if (iT != 77) {
                        String strW17 = w0(i, iT, iT2, iT3, iT4);
                        byte[] bArr111 = new byte[iZ0];
                        jt.d(bArr111, 0, iZ0);
                        binaryFrame = new BinaryFrame(strW17, bArr111);
                    } else {
                        String strW18 = w0(i, iT, iT2, iT3, iT4);
                        byte[] bArr112 = new byte[iZ0];
                        jt.d(bArr112, 0, iZ0);
                        binaryFrame = new BinaryFrame(strW18, bArr112);
                    }
                    binaryFrame = urlLinkFrame;
                }
                if (binaryFrame == 0) {
                    binaryFrame = mlltFrameR0;
                    binaryFrame = chapterTocFrameN0;
                    binaryFrame = chapterFrameM0;
                    binaryFrame = textInformationFrame;
                    w0(i, iT, iT2, iT3, iT4);
                    AbstractC4038mJ.f();
                }
                binaryFrame = mlltFrameR0;
                binaryFrame = chapterTocFrameN0;
                binaryFrame = chapterFrameM0;
                binaryFrame = textInformationFrame;
                jt.E(i3);
                return binaryFrame;
            } catch (Throwable th) {
                jt.E(i3);
                throw th;
            }
        }
        int i11 = iY;
        z3 = (i11 & 128) != 0;
        z4 = (i11 & 64) != 0;
        z2 = (i11 & 32) != 0;
        z5 = z3;
        z6 = false;
        if (z3) {
        }
        AbstractC4038mJ.f();
        jt.E(i3);
        return r14;
    }

    public static GeobFrame q0(int i, JT jt) {
        int iT = jt.t();
        Charset charsetV0 = v0(iT);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        jt.d(bArr, 0, i2);
        int iY0 = y0(bArr, 0);
        String str = new String(bArr, 0, iY0, AbstractC2333Ce.b);
        int i3 = iY0 + 1;
        int iX0 = x0(bArr, i3, iT);
        String strS0 = s0(bArr, i3, iX0, charsetV0);
        int iU0 = u0(iT) + iX0;
        int iX1 = x0(bArr, iU0, iT);
        String strS1 = s0(bArr, iU0, iX1, charsetV0);
        int iU1 = u0(iT) + iX1;
        return new GeobFrame(str, strS0, strS1, i2 <= iU1 ? Ug0.e : Arrays.copyOfRange(bArr, iU1, i2));
    }

    public static MlltFrame r0(int i, JT jt) {
        int iY = jt.y();
        int iV = jt.v();
        int iV2 = jt.v();
        int iT = jt.t();
        int iT2 = jt.t();
        Uh0 uh0 = new Uh0();
        uh0.n(jt);
        int i2 = ((i - 10) * 8) / (iT + iT2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = uh0.i(iT);
            int i5 = uh0.i(iT2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new MlltFrame(iY, iV, iV2, iArr, iArr2);
    }

    public static String s0(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static C3965lY t0(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return AC.p("");
        }
        C5086yC c5086yC = AC.b;
        FW.n(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int iX0 = x0(bArr, i2, i);
        int i3 = 0;
        while (i2 < iX0) {
            String str = new String(bArr, i2, iX0 - i2, v0(i));
            int i4 = i3 + 1;
            if (objArrCopyOf.length < i4) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC2995aW.y(objArrCopyOf.length, i4));
            }
            objArrCopyOf[i3] = str;
            int iU0 = iX0 + u0(i);
            i3 = i4;
            i2 = iU0;
            iX0 = x0(bArr, iU0, i);
        }
        C3965lY c3965lYH = AC.h(i3, objArrCopyOf);
        return c3965lYH.isEmpty() ? AC.p("") : c3965lYH;
    }

    public static int u0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset v0(int i) {
        if (i == 1) {
            return AbstractC2333Ce.f;
        }
        if (i != 2) {
            return i != 3 ? AbstractC2333Ce.b : AbstractC2333Ce.c;
        }
        return AbstractC2333Ce.d;
    }

    public static String w0(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int x0(byte[] bArr, int i, int i2) {
        int iY0 = y0(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iY0;
        }
        while (iY0 < bArr.length - 1) {
            if ((iY0 - i) % 2 == 0 && bArr[iY0 + 1] == 0) {
                return iY0;
            }
            iY0 = y0(bArr, iY0 + 1);
        }
        return bArr.length;
    }

    public static int y0(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int z0(int i, JT jt) {
        byte[] bArr = jt.f3266a;
        int i2 = jt.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc A[SYNTHETIC] */
    public final Metadata k0(int i, byte[] bArr) {
        boolean z;
        C3152cC c3152cC;
        int i2;
        int i3;
        boolean z2;
        int iZ0;
        Id3Frame id3FrameP0;
        boolean z3 = true;
        ArrayList arrayList = new ArrayList();
        JT jt = new JT(bArr, i);
        if (jt.a() < 10) {
            AbstractC4038mJ.f();
        } else {
            int iV = jt.v();
            if (iV == 4801587) {
                int iT = jt.t();
                jt.F(1);
                int iT2 = jt.t();
                int iS = jt.s();
                if (iT != 2) {
                    if (iT == 3) {
                        if ((iT2 & 64) != 0) {
                            int iF = jt.f();
                            jt.F(iF);
                            iS -= iF + 4;
                        }
                    } else if (iT == 4) {
                        if ((iT2 & 64) != 0) {
                            int iS2 = jt.s();
                            jt.F(iS2 - 4);
                            iS -= iS2;
                        }
                        if ((iT2 & 16) != 0) {
                            iS -= 10;
                        }
                    } else {
                        AbstractC4038mJ.f();
                    }
                    if (iT < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    c3152cC = new C3152cC(iT, z, iS);
                } else if ((iT2 & 64) != 0) {
                    AbstractC4038mJ.f();
                } else {
                    if (iT < 4 || (iT2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c3152cC = new C3152cC(iT, z, iS);
                }
                if (c3152cC == null) {
                    return null;
                }
                int i4 = jt.b;
                i2 = c3152cC.f4211a;
                i3 = i2 == 2 ? 6 : 10;
                z2 = c3152cC.b;
                iZ0 = c3152cC.c;
                if (z2) {
                    iZ0 = z0(iZ0, jt);
                }
                jt.D(i4 + iZ0);
                if (A0(jt, i2, i3, false)) {
                    z3 = false;
                } else if (i2 == 4 || !A0(jt, 4, i3, true)) {
                    AbstractC4038mJ.f();
                    return null;
                }
                while (jt.a() >= i3) {
                    id3FrameP0 = p0(i2, jt, z3, i3, this.g);
                    if (id3FrameP0 != null) {
                        arrayList.add(id3FrameP0);
                    }
                }
                return new Metadata(arrayList);
            }
            "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iV)));
            AbstractC4038mJ.f();
        }
        c3152cC = null;
        if (c3152cC == null) {
            return null;
        }
        int i5 = jt.b;
        i2 = c3152cC.f4211a;
        if (i2 == 2) {
        }
        z2 = c3152cC.b;
        iZ0 = c3152cC.c;
        if (z2) {
            iZ0 = z0(iZ0, jt);
        }
        jt.D(i5 + iZ0);
        if (A0(jt, i2, i3, false)) {
            if (i2 == 4) {
            }
            AbstractC4038mJ.f();
            return null;
        }
        z3 = false;
        while (jt.a() >= i3) {
            id3FrameP0 = p0(i2, jt, z3, i3, this.g);
            if (id3FrameP0 != null) {
                arrayList.add(id3FrameP0);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW
    public final Metadata z(C4747uP c4747uP, ByteBuffer byteBuffer) {
        return k0(byteBuffer.limit(), byteBuffer.array());
    }
}
