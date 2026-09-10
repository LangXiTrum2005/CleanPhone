package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;
import androidx.core.internal.view.SupportMenu;
import androidx.work.WorkRequest;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class R6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f3644a;

    static {
        int i = Ug0.f3833a;
        f3644a = "OpusHead".getBytes(AbstractC2333Ce.c);
    }

    public static P6 a(int i, JT jt) {
        jt.E(i + 12);
        jt.F(1);
        b(jt);
        jt.F(2);
        int iT = jt.t();
        if ((iT & 128) != 0) {
            jt.F(2);
        }
        if ((iT & 64) != 0) {
            jt.F(jt.t());
        }
        if ((iT & 32) != 0) {
            jt.F(2);
        }
        jt.F(1);
        b(jt);
        String strF = AbstractC5011xP.f(jt.t());
        if (MimeTypes.AUDIO_MPEG.equals(strF) || MimeTypes.AUDIO_DTS.equals(strF) || MimeTypes.AUDIO_DTS_HD.equals(strF)) {
            return new P6(strF, null, -1L, -1L);
        }
        jt.F(4);
        long jU = jt.u();
        long jU2 = jt.u();
        jt.F(1);
        int iB = b(jt);
        byte[] bArr = new byte[iB];
        jt.d(bArr, 0, iB);
        return new P6(strF, bArr, jU2 > 0 ? jU2 : -1L, jU > 0 ? jU : -1L);
    }

    public static int b(JT jt) {
        int iT = jt.t();
        int i = iT & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        while ((iT & 128) == 128) {
            iT = jt.t();
            i = (i << 7) | (iT & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        return i;
    }

    public static Pair c(int i, int i2, JT jt) throws KT {
        C3798jd0 c3798jd0;
        Pair pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = jt.b;
        while (i5 - i < i2) {
            jt.E(i5);
            int iF = jt.f();
            AbstractC2871Wx.T("childAtomSize must be positive", iF > 0);
            if (jt.f() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = -1;
                int i8 = 0;
                String strR = null;
                Integer numValueOf = null;
                while (i6 - i5 < iF) {
                    jt.E(i6);
                    int iF2 = jt.f();
                    int iF3 = jt.f();
                    if (iF3 == 1718775137) {
                        numValueOf = Integer.valueOf(jt.f());
                    } else if (iF3 == 1935894637) {
                        jt.F(4);
                        strR = jt.r(4, AbstractC2333Ce.c);
                    } else if (iF3 == 1935894633) {
                        i7 = i6;
                        i8 = iF2;
                    }
                    i6 += iF2;
                }
                if (com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cenc.equals(strR) || com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cbc1.equals(strR) || com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cens.equals(strR) || com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cbcs.equals(strR)) {
                    AbstractC2871Wx.T("frma atom is mandatory", numValueOf != null);
                    AbstractC2871Wx.T("schi atom is mandatory", i7 != -1);
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            c3798jd0 = null;
                            break;
                        }
                        jt.E(i9);
                        int iF4 = jt.f();
                        if (jt.f() == 1952804451) {
                            int iD = AbstractC4936wb.d(jt.f());
                            jt.F(1);
                            if (iD == 0) {
                                jt.F(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iT = jt.t();
                                int i10 = (iT & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                i3 = iT & 15;
                                i4 = i10;
                            }
                            boolean z = jt.t() == 1;
                            int iT2 = jt.t();
                            byte[] bArr2 = new byte[16];
                            jt.d(bArr2, 0, 16);
                            if (z && iT2 == 0) {
                                int iT3 = jt.t();
                                byte[] bArr3 = new byte[iT3];
                                jt.d(bArr3, 0, iT3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            c3798jd0 = new C3798jd0(z, strR, iT2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i9 += iF4;
                    }
                    AbstractC2871Wx.T("tenc atom is mandatory", c3798jd0 != null);
                    int i11 = Ug0.f3833a;
                    pairCreate = Pair.create(numValueOf, c3798jd0);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iF;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0289 A[DONT_INVERT, LOOP:12: B:101:0x0289->B:105:0x0293, LOOP_START, PHI: r16
  0x0289: PHI (r16v3 int) = (r16v2 int), (r16v4 int) binds: [B:100:0x0287, B:105:0x0293] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x028b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0293 A[LOOP:12: B:101:0x0289->B:105:0x0293, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0299 A[EDGE_INSN: B:106:0x0299->B:107:0x029a BREAK  A[LOOP:12: B:101:0x0289->B:105:0x0293]] */
    /* JADX WARN: Code duplicated, block: B:113:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:119:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:142:0x037b  */
    /* JADX WARN: Code duplicated, block: B:146:0x038a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0393  */
    /* JADX WARN: Code duplicated, block: B:151:0x039c A[LOOP:4: B:149:0x0399->B:151:0x039c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:155:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:157:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:158:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:167:0x0415  */
    /* JADX WARN: Code duplicated, block: B:172:0x0427  */
    /* JADX WARN: Code duplicated, block: B:173:0x0429  */
    /* JADX WARN: Code duplicated, block: B:175:0x0432  */
    /* JADX WARN: Code duplicated, block: B:180:0x0446  */
    /* JADX WARN: Code duplicated, block: B:183:0x044b  */
    /* JADX WARN: Code duplicated, block: B:184:0x044e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0451  */
    /* JADX WARN: Code duplicated, block: B:187:0x0454  */
    /* JADX WARN: Code duplicated, block: B:189:0x0458  */
    /* JADX WARN: Code duplicated, block: B:191:0x045c  */
    /* JADX WARN: Code duplicated, block: B:192:0x045f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0468  */
    /* JADX WARN: Code duplicated, block: B:198:0x0472  */
    /* JADX WARN: Code duplicated, block: B:199:0x0482  */
    /* JADX WARN: Code duplicated, block: B:202:0x048b  */
    /* JADX WARN: Code duplicated, block: B:204:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:221:0x041f A[ADDED_TO_REGION, EDGE_INSN: B:221:0x041f->B:170:0x041f BREAK  A[LOOP:6: B:165:0x040f->B:169:0x041a], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x04ca A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x01e9 A[EDGE_INSN: B:232:0x01e9->B:71:0x01e9 BREAK  A[LOOP:10: B:67:0x01cc->B:70:0x01d4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x01e9 A[EDGE_INSN: B:233:0x01e9->B:71:0x01e9 BREAK  A[LOOP:10: B:67:0x01cc->B:70:0x01d4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x010e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f A[LOOP:0: B:51:0x0119->B:53:0x011f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0132 A[LOOP:1: B:55:0x0130->B:56:0x0132, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x014c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160 A[LOOP:3: B:60:0x015e->B:61:0x0160, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d4 A[LOOP:10: B:67:0x01cc->B:70:0x01d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0209 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x020b A[ADDED_TO_REGION, LOOP:11: B:76:0x020b->B:78:0x020f, LOOP_START, PHI: r16 r23 r27
  0x020b: PHI (r16v6 int) = (r16v2 int), (r16v7 int) binds: [B:75:0x0209, B:78:0x020f] A[DONT_GENERATE, DONT_INLINE]
  0x020b: PHI (r23v3 int) = (r23v1 int), (r23v5 int) binds: [B:75:0x0209, B:78:0x020f] A[DONT_GENERATE, DONT_INLINE]
  0x020b: PHI (r27v4 int) = (r27v1 int), (r27v5 int) binds: [B:75:0x0209, B:78:0x020f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0228  */
    /* JADX WARN: Code duplicated, block: B:85:0x0230  */
    /* JADX WARN: Code duplicated, block: B:86:0x0232  */
    /* JADX WARN: Code duplicated, block: B:89:0x0237  */
    /* JADX WARN: Code duplicated, block: B:91:0x023e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0262  */
    public static C4414qd0 d(C3712id0 c3712id0, M6 m6, C4884vx c4884vx) throws KT {
        Q6 c3003ac;
        boolean z;
        int iW;
        int iW2;
        int iW3;
        int iA;
        boolean z2;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int i;
        int iW4;
        int i2;
        int i3;
        int i4;
        int iW5;
        long j;
        int iF;
        long j2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int[] iArr;
        long[] jArr;
        int i8;
        int[] iArr2;
        long j3;
        long j4;
        boolean zA;
        int i9;
        int nextSampleSize;
        int i10;
        long jR;
        long j5;
        long[] jArr2;
        int length;
        int i11;
        long[] jArr3;
        int i12;
        int[] iArr3;
        int i13;
        int i14;
        long[] jArr4;
        long j6;
        int i15;
        int i16;
        boolean z4;
        int[] iArr4;
        int[] iArr5;
        int i17;
        boolean z5;
        int i18;
        int i19;
        long[] jArr5;
        boolean z6;
        long[] jArr6;
        int[] iArr6;
        int[] iArr7;
        long[] jArr7;
        int i20;
        long j7;
        long j8;
        int i21;
        int i22;
        int[] iArr8;
        int i23;
        int i24;
        long j9;
        int i25;
        int i26;
        int i27;
        boolean z7;
        long j10;
        int i28;
        int i29;
        long[] jArr8;
        int[] iArr9;
        long j11;
        int i30;
        int i31;
        int iG;
        long[] jArr9;
        int[] iArr10;
        long[] jArr10;
        int[] iArr11;
        int i32;
        int i33;
        int i34;
        int i35;
        long j12;
        int iMax;
        int i36;
        int i37;
        N6 n6F = m6.f(1937011578);
        C4619sw c4619sw = c3712id0.f;
        if (n6F != null) {
            c3003ac = new C3003ac(n6F, c4619sw);
        } else {
            N6 n6F2 = m6.f(1937013298);
            if (n6F2 == null) {
                throw KT.a("Track has no sample table size information", null);
            }
            C4633t40 c4633t40 = new C4633t40();
            JT jt = n6F2.c;
            c4633t40.e = jt;
            jt.E(12);
            c4633t40.b = ((JT) c4633t40.e).w() & 255;
            c4633t40.f5014a = ((JT) c4633t40.e).w();
            c3003ac = c4633t40;
        }
        int sampleCount = c3003ac.getSampleCount();
        if (sampleCount == 0) {
            return new C4414qd0(c3712id0, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        N6 n6F3 = m6.f(1937007471);
        if (n6F3 == null) {
            n6F3 = m6.f(1668232756);
            n6F3.getClass();
            z = true;
        } else {
            z = false;
        }
        N6 n6F4 = m6.f(1937011555);
        n6F4.getClass();
        N6 n6F5 = m6.f(1937011827);
        n6F5.getClass();
        N6 n6F6 = m6.f(1937011571);
        JT jt2 = n6F6 != null ? n6F6.c : null;
        N6 n6F7 = m6.f(1668576371);
        JT jt3 = n6F7 != null ? n6F7.c : null;
        O6 o6 = new O6(n6F4.c, n6F3.c, z);
        JT jt4 = n6F5.c;
        jt4.E(12);
        int iW6 = jt4.w() - 1;
        int iW7 = jt4.w();
        int iW8 = jt4.w();
        if (jt3 != null) {
            jt3.E(12);
            iW = jt3.w();
        } else {
            iW = 0;
        }
        if (jt2 != null) {
            jt2.E(12);
            iW2 = jt2.w();
            if (iW2 > 0) {
                iW3 = jt2.w() - 1;
            } else {
                jt2 = null;
            }
            iA = c3003ac.a();
            String str = c4619sw.l;
            if (iA == -1 && ((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && iW6 == 0 && iW == 0 && iW2 == 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i29 = o6.f3492a;
                jArr8 = new long[i29];
                iArr9 = new int[i29];
                while (o6.a()) {
                    int i38 = o6.b;
                    jArr8[i38] = o6.d;
                    iArr9[i38] = o6.c;
                }
                j11 = iW8;
                i30 = 8192 / iA;
                iG = 0;
                for (i31 = 0; i31 < i29; i31++) {
                    iG += Ug0.g(iArr9[i31], i30);
                }
                jArr9 = new long[iG];
                iArr10 = new int[iG];
                jArr10 = new long[iG];
                iArr11 = new int[iG];
                i32 = 0;
                i33 = 0;
                i34 = 0;
                i35 = 0;
                while (i33 < i29) {
                    int i39 = iArr9[i33];
                    j12 = jArr8[i33];
                    int i40 = i35;
                    int i41 = i29;
                    iMax = i34;
                    i36 = i40;
                    long[] jArr11 = jArr8;
                    i37 = i39;
                    while (i37 > 0) {
                        int iMin = Math.min(i30, i37);
                        jArr9[i36] = j12;
                        int[] iArr12 = iArr9;
                        int i42 = iA * iMin;
                        iArr10[i36] = i42;
                        iMax = Math.max(iMax, i42);
                        jArr10[i36] = ((long) i32) * j11;
                        iArr11[i36] = 1;
                        j12 += (long) iArr10[i36];
                        i32 += iMin;
                        i37 -= iMin;
                        i36++;
                        iArr9 = iArr12;
                        i30 = i30;
                    }
                    i33++;
                    jArr8 = jArr11;
                    int i43 = i36;
                    i34 = iMax;
                    i29 = i41;
                    i35 = i43;
                }
                long j13 = j11 * ((long) i32);
                i7 = sampleCount;
                jArrCopyOf = jArr9;
                iArr2 = iArr11;
                iArr = iArr10;
                jArr = jArr10;
                i8 = i34;
                j3 = j13;
            } else {
                jArrCopyOf = new long[sampleCount];
                iArrCopyOf = new int[sampleCount];
                jArrCopyOf2 = new long[sampleCount];
                iArrCopyOf2 = new int[sampleCount];
                iW4 = iW3;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                iW5 = 0;
                j = 0;
                iF = 0;
                j2 = 0;
                while (true) {
                    if (i2 < sampleCount) {
                        i = iW6;
                        i5 = i;
                        i6 = iW7;
                        break;
                    }
                    j4 = j2;
                    zA = true;
                    while (true) {
                        if (i4 != 0) {
                            i = iW6;
                            break;
                        }
                        zA = o6.a();
                        if (zA) {
                            i = iW6;
                            break;
                        }
                        i = iW6;
                        int i44 = i;
                        long j14 = o6.d;
                        i4 = o6.c;
                        j4 = j14;
                        iW7 = iW7;
                        sampleCount = sampleCount;
                        i = i44;
                    }
                    i9 = sampleCount;
                    i5 = i;
                    i6 = iW7;
                    if (!zA) {
                        AbstractC4038mJ.f();
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i2);
                        sampleCount = i2;
                        break;
                    }
                    if (jt3 != null) {
                        while (iW5 == 0 && iW > 0) {
                            iW5 = jt3.w();
                            iF = jt3.f();
                            iW--;
                        }
                        iW5--;
                    }
                    int i45 = iF;
                    jArrCopyOf[i2] = j4;
                    nextSampleSize = c3003ac.readNextSampleSize();
                    iArrCopyOf[i2] = nextSampleSize;
                    if (nextSampleSize > i3) {
                        i3 = nextSampleSize;
                    }
                    jArrCopyOf2[i2] = j + ((long) i45);
                    if (jt2 == null) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    iArrCopyOf2[i2] = i10;
                    if (i2 == iW4) {
                        iArrCopyOf2[i2] = 1;
                        iW2--;
                        if (iW2 > 0) {
                            jt2.getClass();
                            iW4 = jt2.w() - 1;
                        }
                    }
                    j += (long) iW8;
                    iW7 = i6 - 1;
                    if (iW7 == 0 || i5 <= 0) {
                        i = i5;
                    } else {
                        iW7 = jt4.w();
                        i = i5 - 1;
                        iW8 = jt4.f();
                    }
                    iF = i45;
                    long j15 = j4 + ((long) iArrCopyOf[i2]);
                    i4--;
                    i2++;
                    jArrCopyOf = jArrCopyOf;
                    j2 = j15;
                    sampleCount = i9;
                }
                long j16 = j + ((long) iF);
                if (jt3 != null) {
                    z3 = true;
                    break;
                }
                while (true) {
                    if (iW > 0) {
                        z3 = true;
                        break;
                    }
                    if (jt3.w() != 0) {
                        z3 = false;
                        break;
                    }
                    jt3.f();
                    iW--;
                }
                if (iW2 == 0 || i6 != 0 || i4 != 0 || i5 != 0 || iW5 != 0 || !z3) {
                    AbstractC4038mJ.f();
                }
                i7 = sampleCount;
                iArr = iArrCopyOf;
                jArr = jArrCopyOf2;
                i8 = i3;
                iArr2 = iArrCopyOf2;
                j3 = j16;
            }
            jR = Ug0.R(j3, 1000000L, c3712id0.c);
            j5 = c3712id0.c;
            jArr2 = c3712id0.h;
            if (jArr2 == null) {
                Ug0.S(jArr, j5);
                return new C4414qd0(c3712id0, jArrCopyOf, iArr, i8, jArr, iArr2, jR);
            }
            length = jArr2.length;
            i11 = c3712id0.b;
            jArr3 = c3712id0.i;
            if (length != 1 && i11 == 1 && jArr.length >= 2) {
                jArr3.getClass();
                long j17 = jArr3[0];
                i14 = i11;
                iArr3 = iArr;
                i13 = i8;
                long jR2 = Ug0.R(jArr2[0], c3712id0.c, c3712id0.d) + j17;
                int length2 = jArr.length - 1;
                i12 = i7;
                int iJ = Ug0.j(4, 0, length2);
                jArr4 = jArr3;
                int iJ2 = Ug0.j(jArr.length - 4, 0, length2);
                long j18 = jArr[0];
                if (j18 <= j17 && j17 < jArr[iJ] && jArr[iJ2] < jR2 && jR2 <= j3) {
                    long j19 = j3 - jR2;
                    long jR3 = Ug0.R(j17 - j18, c4619sw.z, c3712id0.c);
                    j6 = j3;
                    long jR4 = Ug0.R(j19, c4619sw.z, c3712id0.c);
                    if ((jR3 != 0 || jR4 != 0) && jR3 <= 2147483647L && jR4 <= 2147483647L) {
                        c4884vx.f5162a = (int) jR3;
                        c4884vx.b = (int) jR4;
                        Ug0.S(jArr, j5);
                        return new C4414qd0(c3712id0, jArrCopyOf, iArr3, i13, jArr, iArr2, Ug0.R(jArr2[0], 1000000L, c3712id0.d));
                    }
                }
                i15 = 1;
                if (jArr2.length == 1) {
                    i16 = 0;
                    if (jArr2[0] == 0) {
                        jArr4.getClass();
                        j10 = jArr4[0];
                        for (i28 = 0; i28 < jArr.length; i28++) {
                            jArr[i28] = Ug0.R(jArr[i28] - j10, 1000000L, c3712id0.c);
                        }
                        return new C4414qd0(c3712id0, jArrCopyOf, iArr3, i13, jArr, iArr2, Ug0.R(j6 - j10, 1000000L, c3712id0.c));
                    }
                    i15 = 1;
                } else {
                    i16 = 0;
                }
                if (i14 == i15) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                iArr4 = new int[jArr2.length];
                iArr5 = new int[jArr2.length];
                jArr4.getClass();
                i17 = 0;
                z5 = false;
                i18 = 0;
                i19 = 0;
                while (i17 < jArr2.length) {
                    j9 = jArr4[i17];
                    if (j9 != -1) {
                        i25 = i19;
                        boolean z8 = z5;
                        int i46 = i18;
                        long jR5 = Ug0.R(jArr2[i17], c3712id0.c, c3712id0.d);
                        iArr4[i17] = Ug0.f(jArr, j9, true);
                        iArr5[i17] = Ug0.b(jArr, j9 + jR5, z4);
                        while (true) {
                            i26 = iArr4[i17];
                            i27 = iArr5[i17];
                            if (i26 < i27 || (iArr2[i26] & 1) != 0) {
                                break;
                            }
                            iArr4[i17] = i26 + 1;
                        }
                        int i47 = (i27 - i26) + i46;
                        if (i25 != i26) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z5 = z8 | z7;
                        i19 = i27;
                        i18 = i47;
                    }
                    i17++;
                    jArr2 = jArr2;
                }
                jArr5 = jArr2;
                z6 = z5 | (i18 != i12);
                if (z6) {
                    jArr6 = new long[i18];
                } else {
                    jArr6 = jArrCopyOf;
                }
                if (z6) {
                    iArr6 = new int[i18];
                } else {
                    iArr6 = iArr3;
                }
                if (z6) {
                    i13 = 0;
                }
                if (z6) {
                    iArr7 = new int[i18];
                } else {
                    iArr7 = iArr2;
                }
                jArr7 = new long[i18];
                i20 = 0;
                j7 = 0;
                while (i16 < jArr5.length) {
                    j8 = jArr4[i16];
                    i21 = iArr4[i16];
                    i22 = iArr5[i16];
                    int[] iArr13 = iArr4;
                    if (z6) {
                        int i48 = i22 - i21;
                        System.arraycopy(jArrCopyOf, i21, jArr6, i20, i48);
                        iArr8 = iArr3;
                        System.arraycopy(iArr8, i21, iArr6, i20, i48);
                        System.arraycopy(iArr2, i21, iArr7, i20, i48);
                    } else {
                        iArr8 = iArr3;
                    }
                    i23 = i21;
                    i24 = i13;
                    while (i23 < i22) {
                        int[] iArr14 = iArr2;
                        int[] iArr15 = iArr5;
                        long[] jArr12 = jArrCopyOf;
                        int i49 = i24;
                        int i50 = i22;
                        int[] iArr16 = iArr8;
                        long[] jArr13 = jArr5;
                        int i51 = i23;
                        long[] jArr14 = jArr;
                        jArr7[i20] = Ug0.R(j7, 1000000L, c3712id0.d) + Ug0.R(Math.max(0L, jArr[i23] - j8), 1000000L, c3712id0.c);
                        if (!z6 && iArr6[i20] > i49) {
                            i49 = iArr16[i51];
                        }
                        i24 = i49;
                        i20++;
                        iArr2 = iArr14;
                        i23 = i51 + 1;
                        jArr = jArr14;
                        iArr5 = iArr15;
                        i22 = i50;
                        jArrCopyOf = jArr12;
                        iArr8 = iArr16;
                        jArr5 = jArr13;
                    }
                    long[] jArr15 = jArr5;
                    j7 += jArr15[i16];
                    i16++;
                    iArr2 = iArr2;
                    i13 = i24;
                    jArr = jArr;
                    iArr4 = iArr13;
                    iArr5 = iArr5;
                    jArrCopyOf = jArrCopyOf;
                    iArr3 = iArr8;
                    jArr5 = jArr15;
                }
                return new C4414qd0(c3712id0, jArr6, iArr6, i13, jArr7, iArr7, Ug0.R(j7, 1000000L, c3712id0.d));
            }
            i12 = i7;
            iArr3 = iArr;
            i13 = i8;
            i14 = i11;
            jArr4 = jArr3;
            j6 = j3;
            i15 = 1;
            if (jArr2.length == 1) {
                i16 = 0;
                if (jArr2[0] == 0) {
                    jArr4.getClass();
                    j10 = jArr4[0];
                    while (i28 < jArr.length) {
                        jArr[i28] = Ug0.R(jArr[i28] - j10, 1000000L, c3712id0.c);
                    }
                    return new C4414qd0(c3712id0, jArrCopyOf, iArr3, i13, jArr, iArr2, Ug0.R(j6 - j10, 1000000L, c3712id0.c));
                }
                i15 = 1;
            } else {
                i16 = 0;
            }
            if (i14 == i15) {
                z4 = true;
            } else {
                z4 = false;
            }
            iArr4 = new int[jArr2.length];
            iArr5 = new int[jArr2.length];
            jArr4.getClass();
            i17 = 0;
            z5 = false;
            i18 = 0;
            i19 = 0;
            while (i17 < jArr2.length) {
                j9 = jArr4[i17];
                if (j9 != -1) {
                    i25 = i19;
                    boolean z9 = z5;
                    int i410 = i18;
                    long jR6 = Ug0.R(jArr2[i17], c3712id0.c, c3712id0.d);
                    iArr4[i17] = Ug0.f(jArr, j9, true);
                    iArr5[i17] = Ug0.b(jArr, j9 + jR6, z4);
                    while (true) {
                        i26 = iArr4[i17];
                        i27 = iArr5[i17];
                        if (i26 < i27) {
                            break;
                        }
                        break;
                        break;
                        iArr4[i17] = i26 + 1;
                    }
                    int i411 = (i27 - i26) + i410;
                    if (i25 != i26) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z5 = z9 | z7;
                    i19 = i27;
                    i18 = i411;
                }
                i17++;
                jArr2 = jArr2;
            }
            jArr5 = jArr2;
            z6 = z5 | (i18 != i12);
            if (z6) {
                jArr6 = new long[i18];
            } else {
                jArr6 = jArrCopyOf;
            }
            if (z6) {
                iArr6 = new int[i18];
            } else {
                iArr6 = iArr3;
            }
            if (z6) {
                i13 = 0;
            }
            if (z6) {
                iArr7 = new int[i18];
            } else {
                iArr7 = iArr2;
            }
            jArr7 = new long[i18];
            i20 = 0;
            j7 = 0;
            while (i16 < jArr5.length) {
                j8 = jArr4[i16];
                i21 = iArr4[i16];
                i22 = iArr5[i16];
                int[] iArr17 = iArr4;
                if (z6) {
                    int i412 = i22 - i21;
                    System.arraycopy(jArrCopyOf, i21, jArr6, i20, i412);
                    iArr8 = iArr3;
                    System.arraycopy(iArr8, i21, iArr6, i20, i412);
                    System.arraycopy(iArr2, i21, iArr7, i20, i412);
                } else {
                    iArr8 = iArr3;
                }
                i23 = i21;
                i24 = i13;
                while (i23 < i22) {
                    int[] iArr18 = iArr2;
                    int[] iArr19 = iArr5;
                    long[] jArr16 = jArrCopyOf;
                    int i413 = i24;
                    int i52 = i22;
                    int[] iArr110 = iArr8;
                    long[] jArr17 = jArr5;
                    int i53 = i23;
                    long[] jArr18 = jArr;
                    jArr7[i20] = Ug0.R(j7, 1000000L, c3712id0.d) + Ug0.R(Math.max(0L, jArr[i23] - j8), 1000000L, c3712id0.c);
                    if (!z6) {
                    }
                    i24 = i413;
                    i20++;
                    iArr2 = iArr18;
                    i23 = i53 + 1;
                    jArr = jArr18;
                    iArr5 = iArr19;
                    i22 = i52;
                    jArrCopyOf = jArr16;
                    iArr8 = iArr110;
                    jArr5 = jArr17;
                }
                long[] jArr19 = jArr5;
                j7 += jArr19[i16];
                i16++;
                iArr2 = iArr2;
                i13 = i24;
                jArr = jArr;
                iArr4 = iArr17;
                iArr5 = iArr5;
                jArrCopyOf = jArrCopyOf;
                iArr3 = iArr8;
                jArr5 = jArr19;
            }
            return new C4414qd0(c3712id0, jArr6, iArr6, i13, jArr7, iArr7, Ug0.R(j7, 1000000L, c3712id0.d));
        }
        iW2 = 0;
        iW3 = -1;
        iA = c3003ac.a();
        String str2 = c4619sw.l;
        if (iA == -1) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (z2) {
            i29 = o6.f3492a;
            jArr8 = new long[i29];
            iArr9 = new int[i29];
            while (o6.a()) {
                int i310 = o6.b;
                jArr8[i310] = o6.d;
                iArr9[i310] = o6.c;
            }
            j11 = iW8;
            i30 = 8192 / iA;
            iG = 0;
            while (i31 < i29) {
                iG += Ug0.g(iArr9[i31], i30);
            }
            jArr9 = new long[iG];
            iArr10 = new int[iG];
            jArr10 = new long[iG];
            iArr11 = new int[iG];
            i32 = 0;
            i33 = 0;
            i34 = 0;
            i35 = 0;
            while (i33 < i29) {
                int i311 = iArr9[i33];
                j12 = jArr8[i33];
                int i414 = i35;
                int i415 = i29;
                iMax = i34;
                i36 = i414;
                long[] jArr110 = jArr8;
                i37 = i311;
                while (i37 > 0) {
                    int iMin2 = Math.min(i30, i37);
                    jArr9[i36] = j12;
                    int[] iArr111 = iArr9;
                    int i416 = iA * iMin2;
                    iArr10[i36] = i416;
                    iMax = Math.max(iMax, i416);
                    jArr10[i36] = ((long) i32) * j11;
                    iArr11[i36] = 1;
                    j12 += (long) iArr10[i36];
                    i32 += iMin2;
                    i37 -= iMin2;
                    i36++;
                    iArr9 = iArr111;
                    i30 = i30;
                }
                i33++;
                jArr8 = jArr110;
                int i417 = i36;
                i34 = iMax;
                i29 = i415;
                i35 = i417;
            }
            long j110 = j11 * ((long) i32);
            i7 = sampleCount;
            jArrCopyOf = jArr9;
            iArr2 = iArr11;
            iArr = iArr10;
            jArr = jArr10;
            i8 = i34;
            j3 = j110;
        } else {
            jArrCopyOf = new long[sampleCount];
            iArrCopyOf = new int[sampleCount];
            jArrCopyOf2 = new long[sampleCount];
            iArrCopyOf2 = new int[sampleCount];
            iW4 = iW3;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            iW5 = 0;
            j = 0;
            iF = 0;
            j2 = 0;
            while (true) {
                if (i2 < sampleCount) {
                    i = iW6;
                    i5 = i;
                    i6 = iW7;
                    break;
                }
                j4 = j2;
                zA = true;
                while (true) {
                    if (i4 != 0) {
                        i = iW6;
                        break;
                    }
                    zA = o6.a();
                    if (zA) {
                        i = iW6;
                        break;
                    }
                    i = iW6;
                    int i418 = i;
                    long j111 = o6.d;
                    i4 = o6.c;
                    j4 = j111;
                    iW7 = iW7;
                    sampleCount = sampleCount;
                    i = i418;
                }
                i9 = sampleCount;
                i5 = i;
                i6 = iW7;
                if (!zA) {
                    AbstractC4038mJ.f();
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i2);
                    sampleCount = i2;
                    break;
                }
                if (jt3 != null) {
                    while (iW5 == 0) {
                        iW5 = jt3.w();
                        iF = jt3.f();
                        iW--;
                    }
                    iW5--;
                }
                int i419 = iF;
                jArrCopyOf[i2] = j4;
                nextSampleSize = c3003ac.readNextSampleSize();
                iArrCopyOf[i2] = nextSampleSize;
                if (nextSampleSize > i3) {
                    i3 = nextSampleSize;
                }
                jArrCopyOf2[i2] = j + ((long) i419);
                if (jt2 == null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                iArrCopyOf2[i2] = i10;
                if (i2 == iW4) {
                    iArrCopyOf2[i2] = 1;
                    iW2--;
                    if (iW2 > 0) {
                        jt2.getClass();
                        iW4 = jt2.w() - 1;
                    }
                }
                j += (long) iW8;
                iW7 = i6 - 1;
                if (iW7 == 0) {
                    i = i5;
                } else {
                    i = i5;
                }
                iF = i419;
                long j112 = j4 + ((long) iArrCopyOf[i2]);
                i4--;
                i2++;
                jArrCopyOf = jArrCopyOf;
                j2 = j112;
                sampleCount = i9;
            }
            long j113 = j + ((long) iF);
            if (jt3 != null) {
                z3 = true;
                break;
            }
            while (true) {
                if (iW > 0) {
                    z3 = true;
                    break;
                }
                if (jt3.w() != 0) {
                    z3 = false;
                    break;
                }
                jt3.f();
                iW--;
            }
            if (iW2 == 0) {
                AbstractC4038mJ.f();
            } else {
                AbstractC4038mJ.f();
            }
            i7 = sampleCount;
            iArr = iArrCopyOf;
            jArr = jArrCopyOf2;
            i8 = i3;
            iArr2 = iArrCopyOf2;
            j3 = j113;
        }
        jR = Ug0.R(j3, 1000000L, c3712id0.c);
        j5 = c3712id0.c;
        jArr2 = c3712id0.h;
        if (jArr2 == null) {
            Ug0.S(jArr, j5);
            return new C4414qd0(c3712id0, jArrCopyOf, iArr, i8, jArr, iArr2, jR);
        }
        length = jArr2.length;
        i11 = c3712id0.b;
        jArr3 = c3712id0.i;
        if (length != 1) {
            i12 = i7;
            iArr3 = iArr;
            i13 = i8;
            i14 = i11;
            jArr4 = jArr3;
            j6 = j3;
        } else {
            i12 = i7;
            iArr3 = iArr;
            i13 = i8;
            i14 = i11;
            jArr4 = jArr3;
            j6 = j3;
        }
        i15 = 1;
        if (jArr2.length == 1) {
            i16 = 0;
            if (jArr2[0] == 0) {
                jArr4.getClass();
                j10 = jArr4[0];
                while (i28 < jArr.length) {
                    jArr[i28] = Ug0.R(jArr[i28] - j10, 1000000L, c3712id0.c);
                }
                return new C4414qd0(c3712id0, jArrCopyOf, iArr3, i13, jArr, iArr2, Ug0.R(j6 - j10, 1000000L, c3712id0.c));
            }
            i15 = 1;
        } else {
            i16 = 0;
        }
        if (i14 == i15) {
            z4 = true;
        } else {
            z4 = false;
        }
        iArr4 = new int[jArr2.length];
        iArr5 = new int[jArr2.length];
        jArr4.getClass();
        i17 = 0;
        z5 = false;
        i18 = 0;
        i19 = 0;
        while (i17 < jArr2.length) {
            j9 = jArr4[i17];
            if (j9 != -1) {
                i25 = i19;
                boolean z10 = z5;
                int i4110 = i18;
                long jR7 = Ug0.R(jArr2[i17], c3712id0.c, c3712id0.d);
                iArr4[i17] = Ug0.f(jArr, j9, true);
                iArr5[i17] = Ug0.b(jArr, j9 + jR7, z4);
                while (true) {
                    i26 = iArr4[i17];
                    i27 = iArr5[i17];
                    if (i26 < i27) {
                        break;
                        break;
                    }
                    break;
                    break;
                    iArr4[i17] = i26 + 1;
                }
                int i4111 = (i27 - i26) + i4110;
                if (i25 != i26) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z5 = z10 | z7;
                i19 = i27;
                i18 = i4111;
            }
            i17++;
            jArr2 = jArr2;
        }
        jArr5 = jArr2;
        z6 = z5 | (i18 != i12);
        if (z6) {
            jArr6 = new long[i18];
        } else {
            jArr6 = jArrCopyOf;
        }
        if (z6) {
            iArr6 = new int[i18];
        } else {
            iArr6 = iArr3;
        }
        if (z6) {
            i13 = 0;
        }
        if (z6) {
            iArr7 = new int[i18];
        } else {
            iArr7 = iArr2;
        }
        jArr7 = new long[i18];
        i20 = 0;
        j7 = 0;
        while (i16 < jArr5.length) {
            j8 = jArr4[i16];
            i21 = iArr4[i16];
            i22 = iArr5[i16];
            int[] iArr112 = iArr4;
            if (z6) {
                int i4112 = i22 - i21;
                System.arraycopy(jArrCopyOf, i21, jArr6, i20, i4112);
                iArr8 = iArr3;
                System.arraycopy(iArr8, i21, iArr6, i20, i4112);
                System.arraycopy(iArr2, i21, iArr7, i20, i4112);
            } else {
                iArr8 = iArr3;
            }
            i23 = i21;
            i24 = i13;
            while (i23 < i22) {
                int[] iArr113 = iArr2;
                int[] iArr114 = iArr5;
                long[] jArr111 = jArrCopyOf;
                int i4113 = i24;
                int i54 = i22;
                int[] iArr115 = iArr8;
                long[] jArr112 = jArr5;
                int i55 = i23;
                long[] jArr113 = jArr;
                jArr7[i20] = Ug0.R(j7, 1000000L, c3712id0.d) + Ug0.R(Math.max(0L, jArr[i23] - j8), 1000000L, c3712id0.c);
                if (!z6) {
                }
                i24 = i4113;
                i20++;
                iArr2 = iArr113;
                i23 = i55 + 1;
                jArr = jArr113;
                iArr5 = iArr114;
                i22 = i54;
                jArrCopyOf = jArr111;
                iArr8 = iArr115;
                jArr5 = jArr112;
            }
            long[] jArr114 = jArr5;
            j7 += jArr114[i16];
            i16++;
            iArr2 = iArr2;
            i13 = i24;
            jArr = jArr;
            iArr4 = iArr112;
            iArr5 = iArr5;
            jArrCopyOf = jArrCopyOf;
            iArr3 = iArr8;
            jArr5 = jArr114;
        }
        return new C4414qd0(c3712id0, jArr6, iArr6, i13, jArr7, iArr7, Ug0.R(j7, 1000000L, c3712id0.d));
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0267  */
    /* JADX WARN: Code duplicated, block: B:326:0x0583  */
    /* JADX WARN: Code duplicated, block: B:328:0x0592  */
    /* JADX WARN: Code duplicated, block: B:329:0x0594  */
    /* JADX WARN: Code duplicated, block: B:332:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:334:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:366:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:397:0x0830  */
    /* JADX WARN: Code duplicated, block: B:399:0x0837  */
    /* JADX WARN: Code duplicated, block: B:401:0x083c  */
    /* JADX WARN: Code duplicated, block: B:402:0x083e  */
    /* JADX WARN: Code duplicated, block: B:406:0x0848  */
    /* JADX WARN: Code duplicated, block: B:408:0x0853  */
    /* JADX WARN: Code duplicated, block: B:409:0x0855  */
    /* JADX WARN: Code duplicated, block: B:413:0x0863 A[LOOP:4: B:404:0x0842->B:413:0x0863, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:416:0x0873  */
    /* JADX WARN: Code duplicated, block: B:418:0x087d  */
    /* JADX WARN: Code duplicated, block: B:420:0x0885  */
    /* JADX WARN: Code duplicated, block: B:421:0x0898  */
    /* JADX WARN: Code duplicated, block: B:423:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:425:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:435:0x0915  */
    /* JADX WARN: Code duplicated, block: B:439:0x093f  */
    /* JADX WARN: Code duplicated, block: B:441:0x0949  */
    /* JADX WARN: Code duplicated, block: B:443:0x0955  */
    /* JADX WARN: Code duplicated, block: B:444:0x0957  */
    /* JADX WARN: Code duplicated, block: B:446:0x0968  */
    /* JADX WARN: Code duplicated, block: B:448:0x096f  */
    /* JADX WARN: Code duplicated, block: B:451:0x097d  */
    /* JADX WARN: Code duplicated, block: B:452:0x0980  */
    /* JADX WARN: Code duplicated, block: B:454:0x0985  */
    /* JADX WARN: Code duplicated, block: B:455:0x0987  */
    /* JADX WARN: Code duplicated, block: B:459:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:461:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:466:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:467:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:470:0x09e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:471:0x09e4  */
    /* JADX WARN: Code duplicated, block: B:473:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:476:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:479:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:481:0x0a21 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:482:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:484:0x0a26  */
    /* JADX WARN: Code duplicated, block: B:487:0x0a36  */
    /* JADX WARN: Code duplicated, block: B:489:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:491:0x0a46  */
    /* JADX WARN: Code duplicated, block: B:493:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:613:0x0c91  */
    /* JADX WARN: Code duplicated, block: B:617:0x0cb7  */
    /* JADX WARN: Code duplicated, block: B:618:0x0cbe  */
    /* JADX WARN: Code duplicated, block: B:620:0x0cf2  */
    /* JADX WARN: Code duplicated, block: B:622:0x0cf8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:626:0x0d00  */
    /* JADX WARN: Code duplicated, block: B:629:0x0d08  */
    /* JADX WARN: Code duplicated, block: B:630:0x0d0d  */
    /* JADX WARN: Code duplicated, block: B:633:0x0d16  */
    /* JADX WARN: Code duplicated, block: B:639:0x0d5c  */
    /* JADX WARN: Code duplicated, block: B:641:0x0d67  */
    /* JADX WARN: Code duplicated, block: B:643:0x0d70  */
    /* JADX WARN: Code duplicated, block: B:644:0x0d72  */
    /* JADX WARN: Code duplicated, block: B:646:0x0d8c  */
    /* JADX WARN: Code duplicated, block: B:648:0x0d8f  */
    /* JADX WARN: Code duplicated, block: B:649:0x0d94  */
    /* JADX WARN: Code duplicated, block: B:652:0x0d9c  */
    /* JADX WARN: Code duplicated, block: B:653:0x0da1  */
    /* JADX WARN: Code duplicated, block: B:656:0x0dae A[LOOP:7: B:645:0x0d8a->B:656:0x0dae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:661:0x0dc3  */
    /* JADX WARN: Code duplicated, block: B:662:0x0dcc  */
    /* JADX WARN: Code duplicated, block: B:665:0x0dd2  */
    /* JADX WARN: Code duplicated, block: B:666:0x0dd4  */
    /* JADX WARN: Code duplicated, block: B:677:0x0e39 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x0db5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x086d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x0835 A[EDGE_INSN: B:693:0x0835->B:398:0x0835 BREAK  A[LOOP:4: B:404:0x0842->B:413:0x0863], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x0ca7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0132  */
    /* JADX WARN: Code duplicated, block: B:78:0x0145  */
    /* JADX WARN: Code duplicated, block: B:79:0x0148  */
    /* JADX WARN: Code duplicated, block: B:83:0x0159  */
    /* JADX WARN: Code duplicated, block: B:86:0x0191  */
    /* JADX WARN: Code duplicated, block: B:87:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x019f  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:98:0x020b  */
    /* JADX WARN: Code duplicated, block: B:99:0x020d  */
    public static ArrayList e(M6 m6, C4884vx c4884vx, long j, DrmInitData drmInitData, boolean z, boolean z2, InterfaceC4269ox interfaceC4269ox) {
        int i;
        long jR;
        long jU;
        int i2;
        int i3;
        long j2;
        JT jt;
        int i4;
        long jU2;
        int iD;
        int i5;
        int i6;
        Pair pairCreate;
        N6 n6F;
        String str;
        JT jt2;
        int iF;
        C3798jd0[] c3798jd0Arr;
        int i7;
        C4619sw c4619sw;
        int i8;
        int i9;
        ArrayList arrayList;
        int i10;
        M6 m7;
        Pair pair;
        int i11;
        long j3;
        C3798jd0[] c3798jd0Arr2;
        C4619sw c4619sw2;
        long[] jArr;
        long[] jArr2;
        C3712id0 c3712id0;
        M6 m6E;
        N6 n6F2;
        JT jt3;
        int iD2;
        int iW;
        long[] jArr3;
        long[] jArr4;
        int i12;
        Pair pairCreate2;
        long jU3;
        long jF;
        int i13;
        int iF2;
        boolean z3;
        int iF3;
        int i14;
        C3798jd0[] c3798jd0Arr3;
        C4619sw c4619sw3;
        String str2;
        int iY;
        int iY2;
        int i15;
        int i16;
        DrmInitData drmInitDataB;
        String str3;
        int i17;
        DrmInitData drmInitData2;
        String str4;
        int i18;
        int i19;
        List list;
        String str5;
        byte[] bArr;
        float fW;
        ByteBuffer byteBufferOrder;
        int i20;
        boolean z4;
        int i21;
        int i22;
        P6 p6;
        List listP;
        byte[] bArr2;
        float f;
        C4531rw c4531rw;
        int i23;
        int i24;
        int i25;
        int i26;
        byte[] bArrArray;
        P6 p7;
        int i27;
        int iF4;
        boolean z5;
        int iF5;
        int i28;
        int i29;
        byte[] bArr3;
        float f2;
        C3129c c3129cA;
        int i30;
        byte[] bArrCopyOfRange;
        String str6;
        boolean z6;
        C4464r8 c4464r8B;
        int i31;
        String str7;
        List list2;
        String str8;
        boolean z7;
        C4464r8 c4464r8A;
        Pair pairC;
        int iY3;
        String str9;
        int iRound;
        int i32;
        int iW2;
        int i33;
        int i34;
        int i35;
        DrmInitData drmInitData3;
        String str10;
        int i36;
        int i37;
        int iIntValue;
        int i38;
        String str11;
        P6 p8;
        List listP2;
        int iF6;
        String str12;
        boolean z8;
        int iF7;
        String str13;
        String str14;
        int i39;
        int i40;
        boolean z9;
        int i41;
        int iF8;
        boolean z10;
        P6 p9;
        P6 p6A;
        byte[] bArr4;
        int i42;
        String str15;
        int i43;
        List listP3;
        String str16;
        long j4;
        C3965lY c3965lYP;
        ArrayList arrayList2 = new ArrayList();
        int i44 = 0;
        while (true) {
            ArrayList arrayList3 = m6.e;
            if (i44 >= arrayList3.size()) {
                return arrayList2;
            }
            M6 m8 = (M6) arrayList3.get(i44);
            if (m8.b != 1953653099) {
                i10 = i44;
            } else {
                N6 n6F3 = m6.f(1836476516);
                n6F3.getClass();
                M6 m6E2 = m8.e(1835297121);
                m6E2.getClass();
                N6 n6F4 = m6E2.f(1751411826);
                n6F4.getClass();
                JT jt4 = n6F4.c;
                jt4.E(16);
                int iF9 = jt4.f();
                if (iF9 == 1936684398) {
                    i = 1;
                } else if (iF9 == 1986618469) {
                    i = 2;
                } else if (iF9 == 1952807028 || iF9 == 1935832172 || iF9 == 1937072756 || iF9 == 1668047728) {
                    i = 3;
                } else {
                    i = iF9 == 1835365473 ? 5 : -1;
                }
                if (i == -1) {
                    arrayList = arrayList2;
                    i10 = i44;
                    c3712id0 = null;
                } else {
                    N6 n6F5 = m8.f(1953196132);
                    n6F5.getClass();
                    JT jt5 = n6F5.c;
                    jt5.E(8);
                    int iD3 = AbstractC4936wb.d(jt5.f());
                    jt5.F(iD3 == 0 ? 8 : 16);
                    int iF10 = jt5.f();
                    jt5.F(4);
                    int i45 = jt5.b;
                    int i46 = iD3 == 0 ? 4 : 8;
                    int i47 = 0;
                    while (true) {
                        jR = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                        if (i47 >= i46) {
                            jt5.F(i46);
                        } else {
                            if (jt5.f3266a[i45 + i47] != -1) {
                                jU = iD3 == 0 ? jt5.u() : jt5.x();
                                if (jU != 0) {
                                    break;
                                }
                                break;
                            }
                            i47++;
                        }
                        jU = -9223372036854775807L;
                        break;
                    }
                    jt5.F(16);
                    int iF11 = jt5.f();
                    int iF12 = jt5.f();
                    jt5.F(4);
                    int iF13 = jt5.f();
                    int iF14 = jt5.f();
                    if (iF11 == 0 && iF12 == 65536) {
                        i2 = SupportMenu.CATEGORY_MASK;
                        if (iF13 == -65536 && iF14 == 0) {
                            i3 = 90;
                        }
                        if (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            j2 = jU;
                        } else {
                            j2 = j;
                        }
                        jt = n6F3.c;
                        jt.E(8);
                        if (AbstractC4936wb.d(jt.f()) == 0) {
                            i4 = 8;
                        } else {
                            i4 = 16;
                        }
                        jt.F(i4);
                        jU2 = jt.u();
                        if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            jR = Ug0.R(j2, 1000000L, jU2);
                        }
                        M6 m6E3 = m6E2.e(1835626086);
                        m6E3.getClass();
                        M6 m6E4 = m6E3.e(1937007212);
                        m6E4.getClass();
                        N6 n6F6 = m6E2.f(1835296868);
                        n6F6.getClass();
                        JT jt6 = n6F6.c;
                        jt6.E(8);
                        iD = AbstractC4936wb.d(jt6.f());
                        if (iD == 0) {
                            i5 = 8;
                        } else {
                            i5 = 16;
                        }
                        jt6.F(i5);
                        long jU4 = jt6.u();
                        if (iD == 0) {
                            i6 = 4;
                        } else {
                            i6 = 8;
                        }
                        jt6.F(i6);
                        int iY4 = jt6.y();
                        pairCreate = Pair.create(Long.valueOf(jU4), "" + ((char) (((iY4 >> 10) & 31) + 96)) + ((char) (((iY4 >> 5) & 31) + 96)) + ((char) ((iY4 & 31) + 96)));
                        n6F = m6E4.f(1937011556);
                        if (n6F != null) {
                            throw KT.a("Malformed sample table (stbl) missing sample description (stsd)", null);
                        }
                        str = (String) pairCreate.second;
                        jt2 = n6F.c;
                        jt2.E(12);
                        iF = jt2.f();
                        c3798jd0Arr = new C3798jd0[iF];
                        i7 = 0;
                        c4619sw = null;
                        i8 = 0;
                        i9 = 0;
                        while (i7 < iF) {
                            int i48 = iF;
                            i13 = jt2.b;
                            int i49 = i44;
                            iF2 = jt2.f();
                            ArrayList arrayList4 = arrayList2;
                            long j5 = jU2;
                            if (iF2 > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            AbstractC2871Wx.T("childAtomSize must be positive", z3);
                            iF3 = jt2.f();
                            if (iF3 != 1635148593 || iF3 == 1635148595 || iF3 == 1701733238 || iF3 == 1831958048 || iF3 == 1836070006 || iF3 == 1752589105 || iF3 == 1751479857 || iF3 == 1932670515 || iF3 == 1211250227 || iF3 == 1987063864 || iF3 == 1987063865 || iF3 == 1635135537 || iF3 == 1685479798 || iF3 == 1685479729 || iF3 == 1685481573 || iF3 == 1685481521) {
                                i7 = i7;
                                i14 = i3;
                                m8 = m8;
                                pairCreate = pairCreate;
                                c3798jd0Arr3 = c3798jd0Arr;
                                c4619sw3 = c4619sw;
                                str2 = "childAtomSize must be positive";
                                jt2.E(i13 + 16);
                                jt2.F(16);
                                iY = jt2.y();
                                iY2 = jt2.y();
                                jt2.F(50);
                                i15 = jt2.b;
                                if (iF3 == 1701733238) {
                                    iF2 = iF2;
                                    i16 = i13;
                                    pairC = c(i16, iF2, jt2);
                                    if (pairC != null) {
                                        iF3 = ((Integer) pairC.first).intValue();
                                        if (drmInitData == null) {
                                            drmInitDataB = null;
                                        } else {
                                            drmInitDataB = drmInitData.b(((C3798jd0) pairC.second).b);
                                        }
                                        c3798jd0Arr3[i7] = (C3798jd0) pairC.second;
                                    } else {
                                        drmInitDataB = drmInitData;
                                    }
                                    jt2.E(i15);
                                } else {
                                    iF2 = iF2;
                                    i16 = i13;
                                    drmInitDataB = drmInitData;
                                }
                                if (iF3 == 1831958048) {
                                    str3 = MimeTypes.VIDEO_MPEG;
                                } else if (iF3 == 1211250227) {
                                    str3 = MimeTypes.VIDEO_H263;
                                } else {
                                    str3 = null;
                                }
                                i17 = i15;
                                drmInitData2 = drmInitDataB;
                                str = str;
                                str4 = str3;
                                i18 = i9;
                                i19 = -1;
                                list = null;
                                str5 = null;
                                bArr = null;
                                fW = 1.0f;
                                byteBufferOrder = null;
                                i20 = -1;
                                z4 = false;
                                i21 = -1;
                                i22 = -1;
                                p6 = null;
                                while (true) {
                                    if (i17 - i16 >= iF2) {
                                        i19 = i19;
                                        listP = list;
                                        break;
                                    }
                                    jt2.E(i17);
                                    i27 = jt2.b;
                                    listP = list;
                                    iF4 = jt2.f();
                                    i19 = i19;
                                    if (iF4 != 0 && jt2.b - i16 == iF2) {
                                        break;
                                    }
                                    if (iF4 > 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    AbstractC2871Wx.T(str2, z5);
                                    iF5 = jt2.f();
                                    String str17 = str2;
                                    if (iF5 == 1635148611) {
                                        if (str4 == null) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        AbstractC2871Wx.T(null, z7);
                                        jt2.E(i27 + 8);
                                        c4464r8A = C4464r8.a(jt2);
                                        if (!z4) {
                                            fW = c4464r8A.e;
                                        }
                                        i31 = c4464r8A.b;
                                        str7 = "video/avc";
                                        list2 = c4464r8A.f4918a;
                                        str8 = c4464r8A.f;
                                    } else {
                                        if (iF5 == 1752589123) {
                                            if (str4 == null) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            AbstractC2871Wx.T(null, z6);
                                            jt2.E(i27 + 8);
                                            c4464r8B = C4464r8.b(jt2);
                                            if (!z4) {
                                                fW = c4464r8B.e;
                                            }
                                            i31 = c4464r8B.b;
                                            str7 = "video/hevc";
                                            list2 = c4464r8B.f4918a;
                                            str8 = c4464r8B.f;
                                        } else {
                                            if (iF5 != 1685480259 || iF5 == 1685485123) {
                                                iY = iY;
                                                iY2 = iY2;
                                                iF3 = iF3;
                                                i28 = i16;
                                                i29 = iF2;
                                                bArr3 = bArr;
                                                f2 = fW;
                                                c3129cA = C3129c.a(jt2);
                                                if (c3129cA != null) {
                                                    str5 = c3129cA.f4197a;
                                                    str4 = "video/dolby-vision";
                                                }
                                            } else {
                                                if (iF5 == 1987076931) {
                                                    AbstractC2871Wx.T(null, str4 == null);
                                                    str6 = iF3 == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                                                } else if (iF5 == 1635135811) {
                                                    AbstractC2871Wx.T(null, str4 == null);
                                                    str6 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                                } else if (iF5 == 1668050025) {
                                                    if (byteBufferOrder == null) {
                                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer = byteBufferOrder;
                                                    byteBuffer.position(21);
                                                    byteBuffer.putShort(jt2.q());
                                                    byteBuffer.putShort(jt2.q());
                                                    byteBufferOrder = byteBuffer;
                                                    i28 = i16;
                                                    i29 = iF2;
                                                } else {
                                                    if (iF5 == 1835295606) {
                                                        if (byteBufferOrder == null) {
                                                            byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                        }
                                                        ByteBuffer byteBuffer2 = byteBufferOrder;
                                                        short sQ = jt2.q();
                                                        short sQ2 = jt2.q();
                                                        iF3 = iF3;
                                                        short sQ3 = jt2.q();
                                                        i28 = i16;
                                                        short sQ4 = jt2.q();
                                                        i29 = iF2;
                                                        short sQ5 = jt2.q();
                                                        bArr3 = bArr;
                                                        short sQ6 = jt2.q();
                                                        f2 = fW;
                                                        short sQ7 = jt2.q();
                                                        iY2 = iY2;
                                                        short sQ8 = jt2.q();
                                                        long jU5 = jt2.u();
                                                        long jU6 = jt2.u();
                                                        iY = iY;
                                                        byteBuffer2.position(1);
                                                        byteBuffer2.putShort(sQ5);
                                                        byteBuffer2.putShort(sQ6);
                                                        byteBuffer2.putShort(sQ);
                                                        byteBuffer2.putShort(sQ2);
                                                        byteBuffer2.putShort(sQ3);
                                                        byteBuffer2.putShort(sQ4);
                                                        byteBuffer2.putShort(sQ7);
                                                        byteBuffer2.putShort(sQ8);
                                                        byteBuffer2.putShort((short) (jU5 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                        byteBuffer2.putShort((short) (jU6 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                        byteBufferOrder = byteBuffer2;
                                                    } else {
                                                        iY = iY;
                                                        iY2 = iY2;
                                                        iF3 = iF3;
                                                        i28 = i16;
                                                        i29 = iF2;
                                                        bArr3 = bArr;
                                                        f2 = fW;
                                                        if (iF5 == 1681012275) {
                                                            AbstractC2871Wx.T(null, str4 == null);
                                                            str4 = MimeTypes.VIDEO_H263;
                                                        } else {
                                                            if (iF5 == 1702061171) {
                                                                AbstractC2871Wx.T(null, str4 == null);
                                                                P6 p6A2 = a(i27, jt2);
                                                                byte[] bArr5 = p6A2.b;
                                                                p6 = p6A2;
                                                                listP = bArr5 != null ? AC.p(bArr5) : listP;
                                                                str4 = p6A2.f3538a;
                                                                bArr = bArr3;
                                                            } else if (iF5 == 1885434736) {
                                                                jt2.E(i27 + 8);
                                                                fW = jt2.w() / jt2.w();
                                                                i19 = i19;
                                                                bArr = bArr3;
                                                                z4 = true;
                                                            } else if (iF5 == 1937126244) {
                                                                int i50 = i27 + 8;
                                                                while (true) {
                                                                    if (i50 - i27 >= iF4) {
                                                                        bArrCopyOfRange = null;
                                                                        break;
                                                                    }
                                                                    jt2.E(i50);
                                                                    int iF15 = jt2.f();
                                                                    if (jt2.f() == 1886547818) {
                                                                        bArrCopyOfRange = Arrays.copyOfRange(jt2.f3266a, i50, iF15 + i50);
                                                                        break;
                                                                    }
                                                                    i50 += iF15;
                                                                }
                                                                bArr = bArrCopyOfRange;
                                                            } else if (iF5 == 1936995172) {
                                                                int iT = jt2.t();
                                                                jt2.F(3);
                                                                if (iT == 0) {
                                                                    int iT2 = jt2.t();
                                                                    if (iT2 == 0) {
                                                                        i19 = 0;
                                                                    } else if (iT2 == 1) {
                                                                        i19 = 1;
                                                                    } else if (iT2 == 2) {
                                                                        i19 = 2;
                                                                    } else if (iT2 == 3) {
                                                                        i19 = 3;
                                                                    }
                                                                }
                                                                i19 = i19;
                                                                bArr = bArr3;
                                                                fW = f2;
                                                            } else if (iF5 == 1668246642) {
                                                                int iF16 = jt2.f();
                                                                if (iF16 == 1852009592 || iF16 == 1852009571) {
                                                                    int iY5 = jt2.y();
                                                                    int iY6 = jt2.y();
                                                                    jt2.F(2);
                                                                    boolean z11 = iF4 == 19 && (jt2.t() & 128) != 0;
                                                                    int iA = C2879Xf.a(iY5);
                                                                    int i51 = z11 ? 1 : 2;
                                                                    if (iY6 != 1) {
                                                                        if (iY6 != 16) {
                                                                            i30 = 7;
                                                                            if (iY6 != 18) {
                                                                                if (iY6 != 6 && iY6 != 7) {
                                                                                    i30 = -1;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i30 = 6;
                                                                        }
                                                                        i22 = iA;
                                                                        i21 = i51;
                                                                        i20 = i30;
                                                                    }
                                                                    i30 = 3;
                                                                    i22 = iA;
                                                                    i21 = i51;
                                                                    i20 = i30;
                                                                } else {
                                                                    AbstractC4936wb.b(iF16);
                                                                    AbstractC4038mJ.f();
                                                                }
                                                            }
                                                            fW = f2;
                                                        }
                                                    }
                                                    bArr = bArr3;
                                                    fW = f2;
                                                }
                                                str4 = str6;
                                                i28 = i16;
                                                i29 = iF2;
                                            }
                                            i19 = i19;
                                            bArr = bArr3;
                                            fW = f2;
                                        }
                                        i17 += iF4;
                                        list = listP;
                                        iF3 = iF3;
                                        i16 = i28;
                                        iF2 = i29;
                                        iY2 = iY2;
                                        iY = iY;
                                        str2 = str17;
                                    }
                                    iY = iY;
                                    iY2 = iY2;
                                    iF3 = iF3;
                                    i28 = i16;
                                    i29 = iF2;
                                    i18 = i31;
                                    str4 = str7;
                                    listP = list2;
                                    str5 = str8;
                                    i19 = i19;
                                    i17 += iF4;
                                    list = listP;
                                    iF3 = iF3;
                                    i16 = i28;
                                    iF2 = i29;
                                    iY2 = iY2;
                                    iY = iY;
                                    str2 = str17;
                                }
                                bArr2 = bArr;
                                f = fW;
                                if (str4 == null) {
                                    i3 = i14;
                                    c4619sw = c4619sw3;
                                } else {
                                    c4531rw = new C4531rw();
                                    c4531rw.f4954a = Integer.toString(iF10);
                                    c4531rw.k = str4;
                                    c4531rw.h = str5;
                                    c4531rw.p = iY;
                                    c4531rw.q = i23;
                                    c4531rw.t = f;
                                    i3 = i14;
                                    c4531rw.s = i3;
                                    c4531rw.u = bArr2;
                                    c4531rw.v = i19;
                                    c4531rw.m = listP;
                                    c4531rw.n = drmInitData2;
                                    i24 = i22;
                                    if (i24 == -1) {
                                        i26 = i21;
                                        i25 = i20;
                                        if (i26 == -1 || i25 != -1 || byteBufferOrder != null) {
                                        }
                                        p7 = p6;
                                        if (p7 != null) {
                                            c4531rw.f = AbstractC2995aW.n0(p7.c);
                                            c4531rw.g = AbstractC2995aW.n0(p7.d);
                                        }
                                        c4619sw = new C4619sw(c4531rw);
                                    } else {
                                        i23 = iY2;
                                        i25 = i20;
                                        i26 = i21;
                                    }
                                    i23 = iY2;
                                    if (byteBufferOrder != null) {
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    c4531rw.w = new C2879Xf(i24, i26, i25, bArrArray);
                                    p7 = p6;
                                    if (p7 != null) {
                                        c4531rw.f = AbstractC2995aW.n0(p7.c);
                                        c4531rw.g = AbstractC2995aW.n0(p7.d);
                                    }
                                    c4619sw = new C4619sw(c4531rw);
                                }
                                i9 = i18;
                            } else if (iF3 == 1836069985 || iF3 == 1701733217 || iF3 == 1633889587 || iF3 == 1700998451 || iF3 == 1633889588 || iF3 == 1835823201 || iF3 == 1685353315 || iF3 == 1685353317 || iF3 == 1685353320 || iF3 == 1685353324 || iF3 == 1685353336 || iF3 == 1935764850 || iF3 == 1935767394 || iF3 == 1819304813 || iF3 == 1936684916 || iF3 == 1953984371 || iF3 == 778924082 || iF3 == 778924083 || iF3 == 1835557169 || iF3 == 1835560241 || iF3 == 1634492771 || iF3 == 1634492791 || iF3 == 1970037111 || iF3 == 1332770163 || iF3 == 1716281667) {
                                pairCreate = pairCreate;
                                jt2.E(i13 + 16);
                                if (z2) {
                                    iY3 = jt2.y();
                                    jt2.F(6);
                                } else {
                                    jt2.F(8);
                                    iY3 = 0;
                                }
                                if (iY3 == 0 || iY3 == 1) {
                                    int iY7 = jt2.y();
                                    jt2.F(6);
                                    byte[] bArr6 = jt2.f3266a;
                                    int i52 = jt2.b;
                                    str9 = "childAtomSize must be positive";
                                    int i53 = (bArr6[i52 + 1] & 255) | ((bArr6[i52] & 255) << 8);
                                    jt2.b = i52 + 4;
                                    jt2.E(i52);
                                    int iF17 = jt2.f();
                                    if (iY3 == 1) {
                                        jt2.F(16);
                                    }
                                    iRound = i53;
                                    i32 = iF17;
                                    iW2 = iY7;
                                } else {
                                    if (iY3 == 2) {
                                        jt2.F(16);
                                        iRound = (int) Math.round(Double.longBitsToDouble(jt2.n()));
                                        iW2 = jt2.w();
                                        jt2.F(20);
                                        str9 = "childAtomSize must be positive";
                                        i32 = 0;
                                    } else {
                                        i7 = i7;
                                        i35 = i3;
                                        i34 = iF2;
                                        m8 = m8;
                                        i33 = i13;
                                        c3798jd0Arr3 = c3798jd0Arr;
                                    }
                                    i3 = i35;
                                    iF2 = i34;
                                    i16 = i33;
                                }
                                int i54 = jt2.b;
                                int i55 = iRound;
                                if (iF3 == 1701733217) {
                                    Pair pairC2 = c(i13, iF2, jt2);
                                    if (pairC2 != null) {
                                        int iIntValue2 = ((Integer) pairC2.first).intValue();
                                        DrmInitData drmInitDataB2 = drmInitData == null ? null : drmInitData.b(((C3798jd0) pairC2.second).b);
                                        c3798jd0Arr[i7] = (C3798jd0) pairC2.second;
                                        drmInitData3 = drmInitDataB2;
                                        iF3 = iIntValue2;
                                    } else {
                                        drmInitData3 = drmInitData;
                                    }
                                    jt2.E(i54);
                                } else {
                                    drmInitData3 = drmInitData;
                                }
                                int i56 = iW2;
                                String str18 = MimeTypes.AUDIO_AC3;
                                C4619sw c4619sw4 = c4619sw;
                                if (iF3 == 1633889587) {
                                    str10 = MimeTypes.AUDIO_AC3;
                                } else if (iF3 == 1700998451) {
                                    str10 = MimeTypes.AUDIO_E_AC3;
                                } else if (iF3 == 1633889588) {
                                    str10 = "audio/ac4";
                                } else if (iF3 == 1685353315) {
                                    str10 = MimeTypes.AUDIO_DTS;
                                } else if (iF3 == 1685353320 || iF3 == 1685353324) {
                                    str10 = MimeTypes.AUDIO_DTS_HD;
                                } else if (iF3 == 1685353317) {
                                    str10 = MimeTypes.AUDIO_DTS_EXPRESS;
                                } else if (iF3 == 1685353336) {
                                    str10 = "audio/vnd.dts.uhd;profile=p2";
                                } else if (iF3 == 1935764850) {
                                    str10 = MimeTypes.AUDIO_AMR_NB;
                                } else if (iF3 == 1935767394) {
                                    str10 = MimeTypes.AUDIO_AMR_WB;
                                } else {
                                    if (iF3 == 1819304813 || iF3 == 1936684916) {
                                        str10 = MimeTypes.AUDIO_RAW;
                                        i36 = 2;
                                    } else if (iF3 == 1953984371) {
                                        str10 = MimeTypes.AUDIO_RAW;
                                        i36 = 268435456;
                                    } else if (iF3 == 778924082 || iF3 == 778924083) {
                                        str10 = MimeTypes.AUDIO_MPEG;
                                    } else if (iF3 == 1835557169) {
                                        str10 = "audio/mha1";
                                    } else if (iF3 == 1835560241) {
                                        str10 = "audio/mhm1";
                                    } else if (iF3 == 1634492771) {
                                        str10 = MimeTypes.AUDIO_ALAC;
                                    } else if (iF3 == 1634492791) {
                                        str10 = MimeTypes.AUDIO_ALAW;
                                    } else if (iF3 == 1970037111) {
                                        str10 = MimeTypes.AUDIO_MLAW;
                                    } else if (iF3 == 1332770163) {
                                        str10 = MimeTypes.AUDIO_OPUS;
                                    } else if (iF3 == 1716281667) {
                                        str10 = MimeTypes.AUDIO_FLAC;
                                    } else {
                                        str10 = iF3 == 1835823201 ? MimeTypes.AUDIO_TRUEHD : null;
                                    }
                                    i7 = i7;
                                    i35 = i3;
                                    m8 = m8;
                                    c3798jd0Arr3 = c3798jd0Arr;
                                    i37 = i56;
                                    iIntValue = i55;
                                    i38 = i54;
                                    str11 = null;
                                    p8 = null;
                                    listP2 = null;
                                    while (i38 - i13 < iF2) {
                                        jt2.E(i38);
                                        iF6 = jt2.f();
                                        int i57 = iF2;
                                        int i58 = i13;
                                        str12 = str9;
                                        if (iF6 > 0) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        AbstractC2871Wx.T(str12, z8);
                                        iF7 = jt2.f();
                                        int i59 = i36;
                                        if (iF7 == 1835557187) {
                                            int i60 = iF6 - 13;
                                            byte[] bArr7 = new byte[i60];
                                            jt2.E(i38 + 13);
                                            jt2.d(bArr7, 0, i60);
                                            listP2 = AC.p(bArr7);
                                            str18 = str18;
                                            i41 = iF6;
                                            str11 = str11;
                                        } else {
                                            str13 = str11;
                                            if (iF7 != 1702061171 || (z2 && iF7 == 2002876005)) {
                                                str18 = str18;
                                                str14 = str12;
                                                i39 = iF6;
                                                if (iF7 == 1702061171) {
                                                    i40 = jt2.b;
                                                    if (i40 >= i38) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    AbstractC2871Wx.T(null, z9);
                                                    while (true) {
                                                        i41 = i39;
                                                        if (i40 - i38 < i41) {
                                                            str12 = str14;
                                                            i40 = -1;
                                                            break;
                                                        }
                                                        jt2.E(i40);
                                                        iF8 = jt2.f();
                                                        str12 = str14;
                                                        if (iF8 > 0) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        AbstractC2871Wx.T(str12, z10);
                                                        if (jt2.f() == 1702061171) {
                                                            break;
                                                        }
                                                        i40 += iF8;
                                                        str14 = str12;
                                                        i39 = i41;
                                                    }
                                                } else {
                                                    i40 = i38;
                                                    i41 = i39;
                                                    str12 = str14;
                                                }
                                                if (i40 != -1) {
                                                    p6A = a(i40, jt2);
                                                    str10 = p6A.f3538a;
                                                    bArr4 = p6A.b;
                                                    if (bArr4 != null) {
                                                        if (MimeTypes.AUDIO_AAC.equals(str10)) {
                                                            C3129c c3129cA0 = AbstractC2845Vx.a0(new Uh0(bArr4, 2, (Object) null), false);
                                                            iIntValue = c3129cA0.b;
                                                            i42 = c3129cA0.c;
                                                            str15 = c3129cA0.f4197a;
                                                        } else {
                                                            i42 = i37;
                                                            str15 = str13;
                                                        }
                                                        String str19 = str15;
                                                        p9 = p6A;
                                                        str11 = str19;
                                                        int i61 = i42;
                                                        listP2 = AC.p(bArr4);
                                                        i37 = i61;
                                                    } else {
                                                        p9 = p6A;
                                                    }
                                                    p8 = p9;
                                                    i37 = i37;
                                                    listP2 = listP2;
                                                } else {
                                                    p9 = p8;
                                                }
                                                str11 = str13;
                                                p8 = p9;
                                                i37 = i37;
                                                listP2 = listP2;
                                            } else {
                                                int[] iArr = WD.d;
                                                int[] iArr2 = WD.b;
                                                if (iF7 == 1684103987) {
                                                    jt2.E(i38 + 8);
                                                    String string = Integer.toString(iF10);
                                                    Uh0 uh0 = new Uh0();
                                                    uh0.n(jt2);
                                                    i43 = iF6;
                                                    int i62 = iArr2[uh0.i(2)];
                                                    uh0.s(8);
                                                    int i63 = iArr[uh0.i(3)];
                                                    if (uh0.i(1) != 0) {
                                                        i63++;
                                                    }
                                                    int i64 = WD.e[uh0.i(5)] * 1000;
                                                    uh0.c();
                                                    jt2.E(uh0.f());
                                                    C4531rw c4531rw2 = new C4531rw();
                                                    c4531rw2.f4954a = string;
                                                    c4531rw2.k = str18;
                                                    c4531rw2.x = i63;
                                                    c4531rw2.y = i62;
                                                    c4531rw2.n = drmInitData3;
                                                    c4531rw2.c = str;
                                                    c4531rw2.f = i64;
                                                    c4531rw2.g = i64;
                                                    c4619sw4 = new C4619sw(c4531rw2);
                                                } else {
                                                    i43 = iF6;
                                                    if (iF7 == 1684366131) {
                                                        jt2.E(i38 + 8);
                                                        String string2 = Integer.toString(iF10);
                                                        Uh0 uh1 = new Uh0();
                                                        uh1.n(jt2);
                                                        int i65 = uh1.i(13) * 1000;
                                                        uh1.s(3);
                                                        int i66 = iArr2[uh1.i(2)];
                                                        uh1.s(10);
                                                        int i67 = iArr[uh1.i(3)];
                                                        if (uh1.i(1) != 0) {
                                                            i67++;
                                                        }
                                                        uh1.s(3);
                                                        int i68 = uh1.i(4);
                                                        uh1.s(1);
                                                        if (i68 > 0) {
                                                            uh1.t(6);
                                                            if (uh1.i(1) != 0) {
                                                                i67 += 2;
                                                            }
                                                            uh1.s(1);
                                                        }
                                                        if (uh1.b() > 7) {
                                                            uh1.s(7);
                                                            if (uh1.i(1) != 0) {
                                                                str16 = MimeTypes.AUDIO_E_AC3_JOC;
                                                            } else {
                                                                str16 = MimeTypes.AUDIO_E_AC3;
                                                            }
                                                        } else {
                                                            str16 = MimeTypes.AUDIO_E_AC3;
                                                        }
                                                        uh1.c();
                                                        jt2.E(uh1.f());
                                                        C4531rw c4531rw3 = new C4531rw();
                                                        c4531rw3.f4954a = string2;
                                                        c4531rw3.k = str16;
                                                        c4531rw3.x = i67;
                                                        c4531rw3.y = i66;
                                                        c4531rw3.n = drmInitData3;
                                                        c4531rw3.c = str;
                                                        c4531rw3.g = i65;
                                                        c4619sw4 = new C4619sw(c4531rw3);
                                                        iIntValue = iIntValue;
                                                    } else {
                                                        int i69 = iIntValue;
                                                        str18 = str18;
                                                        if (iF7 == 1684103988) {
                                                            jt2.E(i38 + 8);
                                                            String string3 = Integer.toString(iF10);
                                                            jt2.F(1);
                                                            int i70 = ((jt2.t() & 32) >> 5) == 1 ? 48000 : 44100;
                                                            C4531rw c4531rw4 = new C4531rw();
                                                            c4531rw4.f4954a = string3;
                                                            c4531rw4.k = "audio/ac4";
                                                            c4531rw4.x = 2;
                                                            c4531rw4.y = i70;
                                                            c4531rw4.n = drmInitData3;
                                                            c4531rw4.c = str;
                                                            c4619sw4 = new C4619sw(c4531rw4);
                                                            iIntValue = i69;
                                                        } else if (iF7 != 1684892784) {
                                                            if (iF7 == 1684305011) {
                                                                C4531rw c4531rw5 = new C4531rw();
                                                                c4531rw5.f4954a = Integer.toString(iF10);
                                                                c4531rw5.k = str10;
                                                                c4531rw5.x = i37;
                                                                iIntValue = i69;
                                                                c4531rw5.y = iIntValue;
                                                                c4531rw5.n = drmInitData3;
                                                                c4531rw5.c = str;
                                                                c4619sw4 = new C4619sw(c4531rw5);
                                                            } else {
                                                                iIntValue = i69;
                                                                if (iF7 == 1682927731) {
                                                                    int i71 = i43 - 8;
                                                                    byte[] bArr8 = f3644a;
                                                                    byte[] bArrCopyOf = Arrays.copyOf(bArr8, bArr8.length + i71);
                                                                    jt2.E(i38 + 8);
                                                                    jt2.d(bArrCopyOf, bArr8.length, i71);
                                                                    listP3 = AbstractC2340Cl.l(bArrCopyOf);
                                                                } else if (iF7 == 1684425825) {
                                                                    byte[] bArr9 = new byte[i43 - 8];
                                                                    bArr9[0] = 102;
                                                                    bArr9[1] = 76;
                                                                    bArr9[2] = 97;
                                                                    bArr9[3] = 67;
                                                                    jt2.E(i38 + 12);
                                                                    jt2.d(bArr9, 4, i43 - 12);
                                                                    listP3 = AC.p(bArr9);
                                                                } else if (iF7 == 1634492771) {
                                                                    int i72 = i43 - 12;
                                                                    byte[] bArr10 = new byte[i72];
                                                                    jt2.E(i38 + 12);
                                                                    jt2.d(bArr10, 0, i72);
                                                                    JT jt7 = new JT(bArr10);
                                                                    jt7.E(9);
                                                                    int iT3 = jt7.t();
                                                                    jt7.E(20);
                                                                    Pair pairCreate3 = Pair.create(Integer.valueOf(jt7.w()), Integer.valueOf(iT3));
                                                                    iIntValue = ((Integer) pairCreate3.first).intValue();
                                                                    int iIntValue3 = ((Integer) pairCreate3.second).intValue();
                                                                    listP2 = AC.p(bArr10);
                                                                    i37 = iIntValue3;
                                                                }
                                                                listP2 = listP3;
                                                            }
                                                            str11 = str13;
                                                            i41 = i43;
                                                            str12 = str12;
                                                        } else {
                                                            if (i32 <= 0) {
                                                                throw KT.a("Invalid sample rate for Dolby TrueHD MLP stream: " + i32, null);
                                                            }
                                                            iIntValue = i32;
                                                            str11 = str13;
                                                            i41 = i43;
                                                            str12 = str12;
                                                            i37 = 2;
                                                        }
                                                        str11 = str13;
                                                        i41 = i43;
                                                        str12 = str12;
                                                    }
                                                }
                                                str11 = str13;
                                                i41 = i43;
                                                str12 = str12;
                                            }
                                            i38 += i41;
                                            str9 = str12;
                                            i36 = i59;
                                            iF2 = i57;
                                            i13 = i58;
                                            str18 = str18;
                                        }
                                        i38 += i41;
                                        str9 = str12;
                                        i36 = i59;
                                        iF2 = i57;
                                        i13 = i58;
                                        str18 = str18;
                                    }
                                    String str20 = str11;
                                    i34 = iF2;
                                    i33 = i13;
                                    int i73 = i36;
                                    if (c4619sw4 == null || str10 == null) {
                                        c4619sw = c4619sw4;
                                    } else {
                                        C4531rw c4531rw6 = new C4531rw();
                                        c4531rw6.f4954a = Integer.toString(iF10);
                                        c4531rw6.k = str10;
                                        c4531rw6.h = str20;
                                        c4531rw6.x = i37;
                                        c4531rw6.y = iIntValue;
                                        c4531rw6.z = i73;
                                        c4531rw6.m = listP2;
                                        c4531rw6.n = drmInitData3;
                                        c4531rw6.c = str;
                                        if (p8 != null) {
                                            P6 p10 = p8;
                                            c4531rw6.f = AbstractC2995aW.n0(p10.c);
                                            c4531rw6.g = AbstractC2995aW.n0(p10.d);
                                        }
                                        c4619sw = new C4619sw(c4531rw6);
                                    }
                                    i3 = i35;
                                    iF2 = i34;
                                    i16 = i33;
                                }
                                i36 = -1;
                                i7 = i7;
                                i35 = i3;
                                m8 = m8;
                                c3798jd0Arr3 = c3798jd0Arr;
                                i37 = i56;
                                iIntValue = i55;
                                i38 = i54;
                                str11 = null;
                                p8 = null;
                                listP2 = null;
                                while (i38 - i13 < iF2) {
                                    jt2.E(i38);
                                    iF6 = jt2.f();
                                    int i510 = iF2;
                                    int i511 = i13;
                                    str12 = str9;
                                    if (iF6 > 0) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    AbstractC2871Wx.T(str12, z8);
                                    iF7 = jt2.f();
                                    int i512 = i36;
                                    if (iF7 == 1835557187) {
                                        int i610 = iF6 - 13;
                                        byte[] bArr11 = new byte[i610];
                                        jt2.E(i38 + 13);
                                        jt2.d(bArr11, 0, i610);
                                        listP2 = AC.p(bArr11);
                                        str18 = str18;
                                        i41 = iF6;
                                        str11 = str11;
                                    } else {
                                        str13 = str11;
                                        if (iF7 != 1702061171) {
                                        }
                                        str18 = str18;
                                        str14 = str12;
                                        i39 = iF6;
                                        if (iF7 == 1702061171) {
                                            i40 = jt2.b;
                                            if (i40 >= i38) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            AbstractC2871Wx.T(null, z9);
                                            while (true) {
                                                i41 = i39;
                                                if (i40 - i38 < i41) {
                                                    str12 = str14;
                                                    i40 = -1;
                                                    break;
                                                }
                                                jt2.E(i40);
                                                iF8 = jt2.f();
                                                str12 = str14;
                                                if (iF8 > 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                AbstractC2871Wx.T(str12, z10);
                                                if (jt2.f() == 1702061171) {
                                                    break;
                                                    break;
                                                }
                                                i40 += iF8;
                                                str14 = str12;
                                                i39 = i41;
                                            }
                                        } else {
                                            i40 = i38;
                                            i41 = i39;
                                            str12 = str14;
                                        }
                                        if (i40 != -1) {
                                            p6A = a(i40, jt2);
                                            str10 = p6A.f3538a;
                                            bArr4 = p6A.b;
                                            if (bArr4 != null) {
                                                if (MimeTypes.AUDIO_AAC.equals(str10)) {
                                                    C3129c c3129cA1 = AbstractC2845Vx.a0(new Uh0(bArr4, 2, (Object) null), false);
                                                    iIntValue = c3129cA1.b;
                                                    i42 = c3129cA1.c;
                                                    str15 = c3129cA1.f4197a;
                                                } else {
                                                    i42 = i37;
                                                    str15 = str13;
                                                }
                                                String str110 = str15;
                                                p9 = p6A;
                                                str11 = str110;
                                                int i611 = i42;
                                                listP2 = AC.p(bArr4);
                                                i37 = i611;
                                            } else {
                                                p9 = p6A;
                                            }
                                            p8 = p9;
                                            i37 = i37;
                                            listP2 = listP2;
                                            i38 += i41;
                                            str9 = str12;
                                            i36 = i512;
                                            iF2 = i510;
                                            i13 = i511;
                                            str18 = str18;
                                        } else {
                                            p9 = p8;
                                        }
                                        str11 = str13;
                                        p8 = p9;
                                        i37 = i37;
                                        listP2 = listP2;
                                        i38 += i41;
                                        str9 = str12;
                                        i36 = i512;
                                        iF2 = i510;
                                        i13 = i511;
                                        str18 = str18;
                                    }
                                    i38 += i41;
                                    str9 = str12;
                                    i36 = i512;
                                    iF2 = i510;
                                    i13 = i511;
                                    str18 = str18;
                                }
                                String str21 = str11;
                                i34 = iF2;
                                i33 = i13;
                                int i74 = i36;
                                if (c4619sw4 == null) {
                                    c4619sw = c4619sw4;
                                } else {
                                    c4619sw = c4619sw4;
                                }
                                i3 = i35;
                                iF2 = i34;
                                i16 = i33;
                            } else {
                                if (iF3 == 1414810956 || iF3 == 1954034535 || iF3 == 2004251764 || iF3 == 1937010800 || iF3 == 1664495672) {
                                    jt2.E(i13 + 16);
                                    String str22 = MimeTypes.APPLICATION_TTML;
                                    if (iF3 == 1414810956) {
                                        j4 = Long.MAX_VALUE;
                                        c3965lYP = null;
                                    } else if (iF3 == 1954034535) {
                                        int i75 = iF2 - 16;
                                        byte[] bArr12 = new byte[i75];
                                        jt2.d(bArr12, 0, i75);
                                        c3965lYP = AC.p(bArr12);
                                        str22 = MimeTypes.APPLICATION_TX3G;
                                        j4 = Long.MAX_VALUE;
                                    } else if (iF3 == 2004251764) {
                                        str22 = MimeTypes.APPLICATION_MP4VTT;
                                        j4 = Long.MAX_VALUE;
                                        c3965lYP = null;
                                    } else if (iF3 == 1937010800) {
                                        j4 = 0;
                                        c3965lYP = null;
                                    } else {
                                        if (iF3 != 1664495672) {
                                            throw new IllegalStateException();
                                        }
                                        str22 = MimeTypes.APPLICATION_MP4CEA608;
                                        j4 = Long.MAX_VALUE;
                                        c3965lYP = null;
                                        i8 = 1;
                                    }
                                    C4531rw c4531rw7 = new C4531rw();
                                    c4531rw7.f4954a = Integer.toString(iF10);
                                    c4531rw7.k = str22;
                                    c4531rw7.c = str;
                                    c4531rw7.o = j4;
                                    c4531rw7.m = c3965lYP;
                                    c4619sw = new C4619sw(c4531rw7);
                                } else if (iF3 == 1835365492) {
                                    jt2.E(i13 + 16);
                                    if (iF3 == 1835365492) {
                                        jt2.o();
                                        String strO = jt2.o();
                                        if (strO != null) {
                                            C4531rw c4531rw8 = new C4531rw();
                                            c4531rw8.f4954a = Integer.toString(iF10);
                                            c4531rw8.k = strO;
                                            c4619sw = new C4619sw(c4531rw8);
                                        }
                                    }
                                } else if (iF3 == 1667329389) {
                                    C4531rw c4531rw9 = new C4531rw();
                                    c4531rw9.f4954a = Integer.toString(iF10);
                                    c4531rw9.k = MimeTypes.APPLICATION_CAMERA_MOTION;
                                    c4619sw = new C4619sw(c4531rw9);
                                }
                                i16 = i13;
                                c3798jd0Arr3 = c3798jd0Arr;
                            }
                            jt2.E(i16 + iF2);
                            i7++;
                            drmInitData = drmInitData;
                            iF = i48;
                            i44 = i49;
                            arrayList2 = arrayList4;
                            jU2 = j5;
                            m8 = m8;
                            str = str;
                            c3798jd0Arr = c3798jd0Arr3;
                            pairCreate = pairCreate;
                            i = i;
                        }
                        arrayList = arrayList2;
                        i10 = i44;
                        m7 = m8;
                        pair = pairCreate;
                        i11 = i;
                        j3 = jU2;
                        c3798jd0Arr2 = c3798jd0Arr;
                        c4619sw2 = c4619sw;
                        if (z) {
                            m8 = m7;
                        } else {
                            m8 = m7;
                            m6E = m8.e(1701082227);
                            if (m6E == null) {
                                n6F2 = m6E.f(1701606260);
                                if (n6F2 == null) {
                                    pairCreate2 = null;
                                } else {
                                    jt3 = n6F2.c;
                                    jt3.E(8);
                                    iD2 = AbstractC4936wb.d(jt3.f());
                                    iW = jt3.w();
                                    jArr3 = new long[iW];
                                    jArr4 = new long[iW];
                                    for (i12 = 0; i12 < iW; i12++) {
                                        if (iD2 == 1) {
                                            jU3 = jt3.x();
                                        } else {
                                            jU3 = jt3.u();
                                        }
                                        jArr3[i12] = jU3;
                                        if (iD2 == 1) {
                                            jF = jt3.n();
                                        } else {
                                            jF = jt3.f();
                                        }
                                        jArr4[i12] = jF;
                                        if (jt3.q() == 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        jt3.F(2);
                                    }
                                    pairCreate2 = Pair.create(jArr3, jArr4);
                                }
                                if (pairCreate2 != null) {
                                    jArr = (long[]) pairCreate2.first;
                                    jArr2 = (long[]) pairCreate2.second;
                                }
                            }
                            if (c4619sw2 == null) {
                                c3712id0 = null;
                            } else {
                                c3712id0 = new C3712id0(iF10, i11, ((Long) pair.first).longValue(), j3, jR, c4619sw2, i8, c3798jd0Arr2, i9, jArr, jArr2);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        if (c4619sw2 == null) {
                            c3712id0 = null;
                        } else {
                            c3712id0 = new C3712id0(iF10, i11, ((Long) pair.first).longValue(), j3, jR, c4619sw2, i8, c3798jd0Arr2, i9, jArr, jArr2);
                        }
                    } else {
                        i2 = SupportMenu.CATEGORY_MASK;
                    }
                    if (iF11 == 0 && iF12 == i2) {
                        if (iF13 == 65536 && iF14 == 0) {
                            i3 = 270;
                        } else {
                            i2 = SupportMenu.CATEGORY_MASK;
                            if (iF11 != i2) {
                                i3 = 0;
                            } else {
                                i3 = 0;
                            }
                        }
                    } else if (iF11 != i2 && iF12 == 0 && iF13 == 0 && iF14 == i2) {
                        i3 = 180;
                    } else {
                        i3 = 0;
                    }
                    if (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        j2 = jU;
                    } else {
                        j2 = j;
                    }
                    jt = n6F3.c;
                    jt.E(8);
                    if (AbstractC4936wb.d(jt.f()) == 0) {
                        i4 = 8;
                    } else {
                        i4 = 16;
                    }
                    jt.F(i4);
                    jU2 = jt.u();
                    if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        jR = Ug0.R(j2, 1000000L, jU2);
                    }
                    M6 m6E5 = m6E2.e(1835626086);
                    m6E5.getClass();
                    M6 m6E6 = m6E5.e(1937007212);
                    m6E6.getClass();
                    N6 n6F7 = m6E2.f(1835296868);
                    n6F7.getClass();
                    JT jt8 = n6F7.c;
                    jt8.E(8);
                    iD = AbstractC4936wb.d(jt8.f());
                    if (iD == 0) {
                        i5 = 8;
                    } else {
                        i5 = 16;
                    }
                    jt8.F(i5);
                    long jU7 = jt8.u();
                    if (iD == 0) {
                        i6 = 4;
                    } else {
                        i6 = 8;
                    }
                    jt8.F(i6);
                    int iY8 = jt8.y();
                    pairCreate = Pair.create(Long.valueOf(jU7), "" + ((char) (((iY8 >> 10) & 31) + 96)) + ((char) (((iY8 >> 5) & 31) + 96)) + ((char) ((iY8 & 31) + 96)));
                    n6F = m6E6.f(1937011556);
                    if (n6F != null) {
                        throw KT.a("Malformed sample table (stbl) missing sample description (stsd)", null);
                    }
                    str = (String) pairCreate.second;
                    jt2 = n6F.c;
                    jt2.E(12);
                    iF = jt2.f();
                    c3798jd0Arr = new C3798jd0[iF];
                    i7 = 0;
                    c4619sw = null;
                    i8 = 0;
                    i9 = 0;
                    while (i7 < iF) {
                        int i410 = iF;
                        i13 = jt2.b;
                        int i411 = i44;
                        iF2 = jt2.f();
                        ArrayList arrayList5 = arrayList2;
                        long j6 = jU2;
                        if (iF2 > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        AbstractC2871Wx.T("childAtomSize must be positive", z3);
                        iF3 = jt2.f();
                        if (iF3 != 1635148593) {
                            i7 = i7;
                            i14 = i3;
                            m8 = m8;
                            pairCreate = pairCreate;
                            c3798jd0Arr3 = c3798jd0Arr;
                            c4619sw3 = c4619sw;
                            str2 = "childAtomSize must be positive";
                            jt2.E(i13 + 16);
                            jt2.F(16);
                            iY = jt2.y();
                            iY2 = jt2.y();
                            jt2.F(50);
                            i15 = jt2.b;
                            if (iF3 == 1701733238) {
                                iF2 = iF2;
                                i16 = i13;
                                pairC = c(i16, iF2, jt2);
                                if (pairC != null) {
                                    iF3 = ((Integer) pairC.first).intValue();
                                    if (drmInitData == null) {
                                        drmInitDataB = null;
                                    } else {
                                        drmInitDataB = drmInitData.b(((C3798jd0) pairC.second).b);
                                    }
                                    c3798jd0Arr3[i7] = (C3798jd0) pairC.second;
                                } else {
                                    drmInitDataB = drmInitData;
                                }
                                jt2.E(i15);
                            } else {
                                iF2 = iF2;
                                i16 = i13;
                                drmInitDataB = drmInitData;
                            }
                            if (iF3 == 1831958048) {
                                str3 = MimeTypes.VIDEO_MPEG;
                            } else if (iF3 == 1211250227) {
                                str3 = MimeTypes.VIDEO_H263;
                            } else {
                                str3 = null;
                            }
                            i17 = i15;
                            drmInitData2 = drmInitDataB;
                            str = str;
                            str4 = str3;
                            i18 = i9;
                            i19 = -1;
                            list = null;
                            str5 = null;
                            bArr = null;
                            fW = 1.0f;
                            byteBufferOrder = null;
                            i20 = -1;
                            z4 = false;
                            i21 = -1;
                            i22 = -1;
                            p6 = null;
                            while (true) {
                                if (i17 - i16 >= iF2) {
                                    i19 = i19;
                                    listP = list;
                                    break;
                                }
                                jt2.E(i17);
                                i27 = jt2.b;
                                listP = list;
                                iF4 = jt2.f();
                                i19 = i19;
                                if (iF4 != 0) {
                                }
                                if (iF4 > 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                AbstractC2871Wx.T(str2, z5);
                                iF5 = jt2.f();
                                String str111 = str2;
                                if (iF5 == 1635148611) {
                                    if (str4 == null) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    AbstractC2871Wx.T(null, z7);
                                    jt2.E(i27 + 8);
                                    c4464r8A = C4464r8.a(jt2);
                                    if (!z4) {
                                        fW = c4464r8A.e;
                                    }
                                    i31 = c4464r8A.b;
                                    str7 = "video/avc";
                                    list2 = c4464r8A.f4918a;
                                    str8 = c4464r8A.f;
                                } else {
                                    if (iF5 == 1752589123) {
                                        if (str4 == null) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        AbstractC2871Wx.T(null, z6);
                                        jt2.E(i27 + 8);
                                        c4464r8B = C4464r8.b(jt2);
                                        if (!z4) {
                                            fW = c4464r8B.e;
                                        }
                                        i31 = c4464r8B.b;
                                        str7 = "video/hevc";
                                        list2 = c4464r8B.f4918a;
                                        str8 = c4464r8B.f;
                                    } else if (iF5 != 1685480259) {
                                        iY = iY;
                                        iY2 = iY2;
                                        iF3 = iF3;
                                        i28 = i16;
                                        i29 = iF2;
                                        bArr3 = bArr;
                                        f2 = fW;
                                        c3129cA = C3129c.a(jt2);
                                        if (c3129cA != null) {
                                            str5 = c3129cA.f4197a;
                                            str4 = "video/dolby-vision";
                                        }
                                        i19 = i19;
                                        bArr = bArr3;
                                        fW = f2;
                                    } else {
                                        iY = iY;
                                        iY2 = iY2;
                                        iF3 = iF3;
                                        i28 = i16;
                                        i29 = iF2;
                                        bArr3 = bArr;
                                        f2 = fW;
                                        c3129cA = C3129c.a(jt2);
                                        if (c3129cA != null) {
                                            str5 = c3129cA.f4197a;
                                            str4 = "video/dolby-vision";
                                        }
                                        i19 = i19;
                                        bArr = bArr3;
                                        fW = f2;
                                    }
                                    i17 += iF4;
                                    list = listP;
                                    iF3 = iF3;
                                    i16 = i28;
                                    iF2 = i29;
                                    iY2 = iY2;
                                    iY = iY;
                                    str2 = str111;
                                }
                                iY = iY;
                                iY2 = iY2;
                                iF3 = iF3;
                                i28 = i16;
                                i29 = iF2;
                                i18 = i31;
                                str4 = str7;
                                listP = list2;
                                str5 = str8;
                                i19 = i19;
                                i17 += iF4;
                                list = listP;
                                iF3 = iF3;
                                i16 = i28;
                                iF2 = i29;
                                iY2 = iY2;
                                iY = iY;
                                str2 = str111;
                            }
                            bArr2 = bArr;
                            f = fW;
                            if (str4 == null) {
                                i3 = i14;
                                c4619sw = c4619sw3;
                            } else {
                                c4531rw = new C4531rw();
                                c4531rw.f4954a = Integer.toString(iF10);
                                c4531rw.k = str4;
                                c4531rw.h = str5;
                                c4531rw.p = iY;
                                c4531rw.q = i23;
                                c4531rw.t = f;
                                i3 = i14;
                                c4531rw.s = i3;
                                c4531rw.u = bArr2;
                                c4531rw.v = i19;
                                c4531rw.m = listP;
                                c4531rw.n = drmInitData2;
                                i24 = i22;
                                if (i24 == -1) {
                                    i26 = i21;
                                    i25 = i20;
                                    if (i26 == -1) {
                                    }
                                    p7 = p6;
                                    if (p7 != null) {
                                        c4531rw.f = AbstractC2995aW.n0(p7.c);
                                        c4531rw.g = AbstractC2995aW.n0(p7.d);
                                    }
                                    c4619sw = new C4619sw(c4531rw);
                                } else {
                                    i23 = iY2;
                                    i25 = i20;
                                    i26 = i21;
                                }
                                i23 = iY2;
                                if (byteBufferOrder != null) {
                                    bArrArray = byteBufferOrder.array();
                                } else {
                                    bArrArray = null;
                                }
                                c4531rw.w = new C2879Xf(i24, i26, i25, bArrArray);
                                p7 = p6;
                                if (p7 != null) {
                                    c4531rw.f = AbstractC2995aW.n0(p7.c);
                                    c4531rw.g = AbstractC2995aW.n0(p7.d);
                                }
                                c4619sw = new C4619sw(c4531rw);
                            }
                            i9 = i18;
                        } else {
                            i7 = i7;
                            i14 = i3;
                            m8 = m8;
                            pairCreate = pairCreate;
                            c3798jd0Arr3 = c3798jd0Arr;
                            c4619sw3 = c4619sw;
                            str2 = "childAtomSize must be positive";
                            jt2.E(i13 + 16);
                            jt2.F(16);
                            iY = jt2.y();
                            iY2 = jt2.y();
                            jt2.F(50);
                            i15 = jt2.b;
                            if (iF3 == 1701733238) {
                                iF2 = iF2;
                                i16 = i13;
                                pairC = c(i16, iF2, jt2);
                                if (pairC != null) {
                                    iF3 = ((Integer) pairC.first).intValue();
                                    if (drmInitData == null) {
                                        drmInitDataB = null;
                                    } else {
                                        drmInitDataB = drmInitData.b(((C3798jd0) pairC.second).b);
                                    }
                                    c3798jd0Arr3[i7] = (C3798jd0) pairC.second;
                                } else {
                                    drmInitDataB = drmInitData;
                                }
                                jt2.E(i15);
                            } else {
                                iF2 = iF2;
                                i16 = i13;
                                drmInitDataB = drmInitData;
                            }
                            if (iF3 == 1831958048) {
                                str3 = MimeTypes.VIDEO_MPEG;
                            } else if (iF3 == 1211250227) {
                                str3 = MimeTypes.VIDEO_H263;
                            } else {
                                str3 = null;
                            }
                            i17 = i15;
                            drmInitData2 = drmInitDataB;
                            str = str;
                            str4 = str3;
                            i18 = i9;
                            i19 = -1;
                            list = null;
                            str5 = null;
                            bArr = null;
                            fW = 1.0f;
                            byteBufferOrder = null;
                            i20 = -1;
                            z4 = false;
                            i21 = -1;
                            i22 = -1;
                            p6 = null;
                            while (true) {
                                if (i17 - i16 >= iF2) {
                                    i19 = i19;
                                    listP = list;
                                    break;
                                }
                                jt2.E(i17);
                                i27 = jt2.b;
                                listP = list;
                                iF4 = jt2.f();
                                i19 = i19;
                                if (iF4 != 0) {
                                }
                                if (iF4 > 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                AbstractC2871Wx.T(str2, z5);
                                iF5 = jt2.f();
                                String str112 = str2;
                                if (iF5 == 1635148611) {
                                    if (str4 == null) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    AbstractC2871Wx.T(null, z7);
                                    jt2.E(i27 + 8);
                                    c4464r8A = C4464r8.a(jt2);
                                    if (!z4) {
                                        fW = c4464r8A.e;
                                    }
                                    i31 = c4464r8A.b;
                                    str7 = "video/avc";
                                    list2 = c4464r8A.f4918a;
                                    str8 = c4464r8A.f;
                                } else {
                                    if (iF5 == 1752589123) {
                                        if (str4 == null) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        AbstractC2871Wx.T(null, z6);
                                        jt2.E(i27 + 8);
                                        c4464r8B = C4464r8.b(jt2);
                                        if (!z4) {
                                            fW = c4464r8B.e;
                                        }
                                        i31 = c4464r8B.b;
                                        str7 = "video/hevc";
                                        list2 = c4464r8B.f4918a;
                                        str8 = c4464r8B.f;
                                    } else if (iF5 != 1685480259) {
                                        iY = iY;
                                        iY2 = iY2;
                                        iF3 = iF3;
                                        i28 = i16;
                                        i29 = iF2;
                                        bArr3 = bArr;
                                        f2 = fW;
                                        c3129cA = C3129c.a(jt2);
                                        if (c3129cA != null) {
                                            str5 = c3129cA.f4197a;
                                            str4 = "video/dolby-vision";
                                        }
                                        i19 = i19;
                                        bArr = bArr3;
                                        fW = f2;
                                    } else {
                                        iY = iY;
                                        iY2 = iY2;
                                        iF3 = iF3;
                                        i28 = i16;
                                        i29 = iF2;
                                        bArr3 = bArr;
                                        f2 = fW;
                                        c3129cA = C3129c.a(jt2);
                                        if (c3129cA != null) {
                                            str5 = c3129cA.f4197a;
                                            str4 = "video/dolby-vision";
                                        }
                                        i19 = i19;
                                        bArr = bArr3;
                                        fW = f2;
                                    }
                                    i17 += iF4;
                                    list = listP;
                                    iF3 = iF3;
                                    i16 = i28;
                                    iF2 = i29;
                                    iY2 = iY2;
                                    iY = iY;
                                    str2 = str112;
                                }
                                iY = iY;
                                iY2 = iY2;
                                iF3 = iF3;
                                i28 = i16;
                                i29 = iF2;
                                i18 = i31;
                                str4 = str7;
                                listP = list2;
                                str5 = str8;
                                i19 = i19;
                                i17 += iF4;
                                list = listP;
                                iF3 = iF3;
                                i16 = i28;
                                iF2 = i29;
                                iY2 = iY2;
                                iY = iY;
                                str2 = str112;
                            }
                            bArr2 = bArr;
                            f = fW;
                            if (str4 == null) {
                                i3 = i14;
                                c4619sw = c4619sw3;
                            } else {
                                c4531rw = new C4531rw();
                                c4531rw.f4954a = Integer.toString(iF10);
                                c4531rw.k = str4;
                                c4531rw.h = str5;
                                c4531rw.p = iY;
                                c4531rw.q = i23;
                                c4531rw.t = f;
                                i3 = i14;
                                c4531rw.s = i3;
                                c4531rw.u = bArr2;
                                c4531rw.v = i19;
                                c4531rw.m = listP;
                                c4531rw.n = drmInitData2;
                                i24 = i22;
                                if (i24 == -1) {
                                    i26 = i21;
                                    i25 = i20;
                                    if (i26 == -1) {
                                    }
                                    p7 = p6;
                                    if (p7 != null) {
                                        c4531rw.f = AbstractC2995aW.n0(p7.c);
                                        c4531rw.g = AbstractC2995aW.n0(p7.d);
                                    }
                                    c4619sw = new C4619sw(c4531rw);
                                } else {
                                    i23 = iY2;
                                    i25 = i20;
                                    i26 = i21;
                                }
                                i23 = iY2;
                                if (byteBufferOrder != null) {
                                    bArrArray = byteBufferOrder.array();
                                } else {
                                    bArrArray = null;
                                }
                                c4531rw.w = new C2879Xf(i24, i26, i25, bArrArray);
                                p7 = p6;
                                if (p7 != null) {
                                    c4531rw.f = AbstractC2995aW.n0(p7.c);
                                    c4531rw.g = AbstractC2995aW.n0(p7.d);
                                }
                                c4619sw = new C4619sw(c4531rw);
                            }
                            i9 = i18;
                        }
                        jt2.E(i16 + iF2);
                        i7++;
                        drmInitData = drmInitData;
                        iF = i410;
                        i44 = i411;
                        arrayList2 = arrayList5;
                        jU2 = j6;
                        m8 = m8;
                        str = str;
                        c3798jd0Arr = c3798jd0Arr3;
                        pairCreate = pairCreate;
                        i = i;
                    }
                    arrayList = arrayList2;
                    i10 = i44;
                    m7 = m8;
                    pair = pairCreate;
                    i11 = i;
                    j3 = jU2;
                    c3798jd0Arr2 = c3798jd0Arr;
                    c4619sw2 = c4619sw;
                    if (z) {
                        m8 = m7;
                        m6E = m8.e(1701082227);
                        if (m6E == null) {
                            n6F2 = m6E.f(1701606260);
                            if (n6F2 == null) {
                                pairCreate2 = null;
                            } else {
                                jt3 = n6F2.c;
                                jt3.E(8);
                                iD2 = AbstractC4936wb.d(jt3.f());
                                iW = jt3.w();
                                jArr3 = new long[iW];
                                jArr4 = new long[iW];
                                while (i12 < iW) {
                                    if (iD2 == 1) {
                                        jU3 = jt3.x();
                                    } else {
                                        jU3 = jt3.u();
                                    }
                                    jArr3[i12] = jU3;
                                    if (iD2 == 1) {
                                        jF = jt3.n();
                                    } else {
                                        jF = jt3.f();
                                    }
                                    jArr4[i12] = jF;
                                    if (jt3.q() == 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    jt3.F(2);
                                }
                                pairCreate2 = Pair.create(jArr3, jArr4);
                            }
                            if (pairCreate2 != null) {
                                jArr = (long[]) pairCreate2.first;
                                jArr2 = (long[]) pairCreate2.second;
                            }
                        }
                        if (c4619sw2 == null) {
                            c3712id0 = null;
                        } else {
                            c3712id0 = new C3712id0(iF10, i11, ((Long) pair.first).longValue(), j3, jR, c4619sw2, i8, c3798jd0Arr2, i9, jArr, jArr2);
                        }
                    } else {
                        m8 = m7;
                    }
                    jArr = null;
                    jArr2 = null;
                    if (c4619sw2 == null) {
                        c3712id0 = null;
                    } else {
                        c3712id0 = new C3712id0(iF10, i11, ((Long) pair.first).longValue(), j3, jR, c4619sw2, i8, c3798jd0Arr2, i9, jArr, jArr2);
                    }
                }
                C3712id0 c3712id1 = (C3712id0) interfaceC4269ox.apply(c3712id0);
                if (c3712id1 == null) {
                    arrayList2 = arrayList;
                } else {
                    M6 m6E7 = m8.e(1835297121);
                    m6E7.getClass();
                    M6 m6E8 = m6E7.e(1835626086);
                    m6E8.getClass();
                    M6 m6E9 = m6E8.e(1937007212);
                    m6E9.getClass();
                    C4414qd0 c4414qd0D = d(c3712id1, m6E9, c4884vx);
                    arrayList2 = arrayList;
                    arrayList2.add(c4414qd0D);
                }
            }
            i44 = i10 + 1;
        }
    }
}
