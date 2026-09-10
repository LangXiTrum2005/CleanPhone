package b3;

import com.google.android.gms.internal.ads.xd1;
import com.google.android.gms.internal.play_billing.q1;
import d5.u;
import i1.c0;
import i1.d0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import l1.q;
import l1.y;
import oa.e0;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends no.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ae.b f5460c = new ae.b(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f5461b;

    public i(g gVar) {
        this.f5461b = gVar;
    }

    public static a N(q qVar, int i10, int i11) {
        int iF0;
        String strConcat;
        int iZ = qVar.z();
        Charset charsetC0 = c0(iZ);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        qVar.k(bArr, 0, i12);
        if (i11 == 2) {
            strConcat = "image/" + q1.F(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iF0 = 2;
        } else {
            iF0 = f0(bArr, 0);
            String strF = q1.F(new String(bArr, 0, iF0, StandardCharsets.ISO_8859_1));
            strConcat = strF.indexOf(47) == -1 ? "image/".concat(strF) : strF;
        }
        int i13 = bArr[iF0 + 1] & 255;
        int i14 = iF0 + 2;
        int iE0 = e0(bArr, i14, iZ);
        String str = new String(bArr, i14, iE0 - i14, charsetC0);
        int iB0 = b0(iZ) + iE0;
        return new a(strConcat, str, i13, i12 <= iB0 ? y.f44831b : Arrays.copyOfRange(bArr, iB0, i12));
    }

    public static c O(q qVar, int i10, int i11, boolean z10, int i12, g gVar) throws Throwable {
        int i13 = qVar.f44814b;
        int iF0 = f0(qVar.f44813a, i13);
        String str = new String(qVar.f44813a, i13, iF0 - i13, StandardCharsets.ISO_8859_1);
        qVar.M(iF0 + 1);
        int iM = qVar.m();
        int iM2 = qVar.m();
        long jB = qVar.B();
        if (jB == 4294967295L) {
            jB = -1;
        }
        long jB2 = qVar.B();
        long j10 = jB2 == 4294967295L ? -1L : jB2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (qVar.f44814b < i14) {
            j jVarR = R(i11, qVar, z10, i12, gVar);
            if (jVarR != null) {
                arrayList.add(jVarR);
            }
        }
        return new c(str, iM, iM2, jB, j10, (j[]) arrayList.toArray(new j[0]));
    }

    public static d P(q qVar, int i10, int i11, boolean z10, int i12, g gVar) throws Throwable {
        int i13 = qVar.f44814b;
        int iF0 = f0(qVar.f44813a, i13);
        String str = new String(qVar.f44813a, i13, iF0 - i13, StandardCharsets.ISO_8859_1);
        qVar.M(iF0 + 1);
        int iZ = qVar.z();
        boolean z11 = (iZ & 2) != 0;
        boolean z12 = (iZ & 1) != 0;
        int iZ2 = qVar.z();
        String[] strArr = new String[iZ2];
        for (int i14 = 0; i14 < iZ2; i14++) {
            int i15 = qVar.f44814b;
            int iF1 = f0(qVar.f44813a, i15);
            strArr[i14] = new String(qVar.f44813a, i15, iF1 - i15, StandardCharsets.ISO_8859_1);
            qVar.M(iF1 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (qVar.f44814b < i16) {
            j jVarR = R(i11, qVar, z10, i12, gVar);
            if (jVarR != null) {
                arrayList.add(jVarR);
            }
        }
        return new d(str, z11, z12, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e Q(int i10, q qVar) {
        if (i10 < 4) {
            return null;
        }
        int iZ = qVar.z();
        Charset charsetC0 = c0(iZ);
        byte[] bArr = new byte[3];
        qVar.k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        qVar.k(bArr2, 0, i11);
        int iE0 = e0(bArr2, 0, iZ);
        String str2 = new String(bArr2, 0, iE0, charsetC0);
        int iB0 = b0(iZ) + iE0;
        return new e(str, str2, V(bArr2, iB0, e0(bArr2, iB0, iZ), charsetC0));
    }

    /* JADX WARN: Code duplicated, block: B:139:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x0212  */
    /* JADX WARN: Code duplicated, block: B:172:0x0218  */
    /* JADX WARN: Code duplicated, block: B:177:0x0225 A[Catch: all -> 0x020e, Exception | OutOfMemoryError -> 0x0210, TRY_LEAVE, TryCatch #7 {Exception | OutOfMemoryError -> 0x0210, all -> 0x020e, blocks: (B:165:0x0209, B:176:0x0220, B:177:0x0225), top: B:193:0x01f7 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0247  */
    /* JADX WARN: Instruction removed from duplicated block: B:184:0x0247, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [b3.j] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [l1.q] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [l1.q] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l1.q] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static j R(int i10, q qVar, boolean z10, int i11, g gVar) throws Throwable {
        int iD;
        int i12;
        ?? r2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r10;
        int i13;
        int i14;
        ?? r3;
        Throwable th2;
        ?? r11;
        ?? r12;
        ?? r13;
        ?? r14;
        q qVar2;
        Object bVar;
        int i15 = i10;
        int iZ = qVar.z();
        int iZ2 = qVar.z();
        int iZ3 = qVar.z();
        int iZ4 = i15 >= 3 ? qVar.z() : 0;
        if (i15 == 4) {
            iD = qVar.D();
            if (!z10) {
                iD = (((iD >> 24) & 255) << 21) | (iD & 255) | (((iD >> 8) & 255) << 7) | (((iD >> 16) & 255) << 14);
            }
        } else {
            iD = i15 == 3 ? qVar.D() : qVar.C();
        }
        int iG0 = iD;
        int iG = i15 >= 3 ? qVar.G() : 0;
        if (iZ == 0 && iZ2 == 0 && iZ3 == 0 && iZ4 == 0 && iG0 == 0 && iG == 0) {
            qVar.M(qVar.f44815c);
            return null;
        }
        int i16 = qVar.f44814b + iG0;
        if (i16 > qVar.f44815c) {
            l1.a.s("Id3Decoder", "Frame size exceeds remaining tag data");
            qVar.M(qVar.f44815c);
            return null;
        }
        if (gVar != null) {
            boolean zEvaluate = gVar.evaluate(i15, iZ, iZ2, iZ3, iZ4);
            r2 = iZ;
            i12 = iZ2;
            if (!zEvaluate) {
                i15 = i15;
                qVar.M(i16);
                return null;
            }
        } else {
            i12 = iZ2;
            r2 = iZ;
        }
        i15 = i15;
        if (i15 == 3) {
            z11 = (iG & 128) != 0;
            z14 = (iG & 64) != 0;
            z15 = false;
            z13 = (iG & 32) != 0;
            z12 = z11;
        } else if (i15 == 4) {
            boolean z16 = (iG & 64) != 0;
            boolean z17 = (iG & 8) != 0;
            z14 = (iG & 4) != 0;
            z15 = (iG & 2) != 0;
            z12 = (iG & 1) != 0;
            boolean z18 = z17;
            z13 = z16;
            z11 = z18;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if (z11 || z14) {
            l1.a.s("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            qVar.M(i16);
            return null;
        }
        if (z13) {
            iG0--;
            qVar.N(1);
        }
        if (z12) {
            iG0 -= 4;
            qVar.N(4);
        }
        if (z15) {
            iG0 = g0(iG0, qVar);
        }
        try {
            try {
                if (r2 == 84 && i12 == 88 && iZ3 == 88 && (i15 == 2 || iZ4 == 88)) {
                    bVar = Y(iG0, qVar);
                } else if (r2 == 84) {
                    bVar = W(iG0, d0(i15, r2, i12, iZ3, iZ4), qVar);
                } else if (r2 == 87 && i12 == 88 && iZ3 == 88 && (i15 == 2 || iZ4 == 88)) {
                    bVar = a0(iG0, qVar);
                } else {
                    if (r2 != 87) {
                        if (r2 == 80 && i12 == 82 && iZ3 == 73 && iZ4 == 86) {
                            bVar = U(iG0, qVar);
                        } else {
                            th2 = null;
                            try {
                                if (r2 != 71 || i12 != 69 || iZ3 != 79 || (iZ4 != 66 && i15 != 2)) {
                                    if (i15 == 2) {
                                        if (r2 == 80 && i12 == 73 && iZ3 == 67) {
                                            bVar = N(qVar, iG0, i15);
                                        } else if (r2 != 67 && i12 == 79 && iZ3 == 77 && (iZ4 == 77 || i15 == 2)) {
                                            bVar = Q(iG0, qVar);
                                        } else if (r2 != 67 && i12 == 72 && iZ3 == 65 && iZ4 == 80) {
                                            int i17 = iG0;
                                            iG0 = i12;
                                            i12 = i17;
                                            r14 = r2;
                                            i13 = iZ3;
                                            i14 = iZ4;
                                            try {
                                                bVar = O(qVar, i12, i15, z10, i11, gVar);
                                                i15 = i10;
                                                r2 = qVar;
                                            } catch (Exception | OutOfMemoryError e10) {
                                                e = e10;
                                                i15 = i10;
                                                r3 = qVar;
                                                r10 = r14;
                                                r3.M(i16);
                                                r12 = th2;
                                                r13 = r10;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r11 = qVar;
                                                r11.M(i16);
                                                throw th;
                                            }
                                        } else {
                                            int i18 = iG0;
                                            iG0 = i12;
                                            i12 = i18;
                                            r14 = r2;
                                            i13 = iZ3;
                                            i14 = iZ4;
                                            try {
                                                if (r14 != 67 && iG0 == 84 && i13 == 79 && i14 == 67) {
                                                    i15 = i10;
                                                    q qVar3 = qVar;
                                                    bVar = P(qVar3, i12, i15, z10, i11, gVar);
                                                    r2 = qVar3;
                                                } else {
                                                    i15 = i10;
                                                    qVar2 = qVar;
                                                    if (r14 != 77 && iG0 == 76 && i13 == 76 && i14 == 84) {
                                                        bVar = T(i12, qVar2);
                                                        r2 = qVar2;
                                                    } else {
                                                        String strD0 = d0(i15, r14 == true ? 1 : 0, iG0, i13, i14);
                                                        byte[] bArr = new byte[i12];
                                                        qVar2.k(bArr, 0, i12);
                                                        bVar = new b(strD0, bArr);
                                                        r2 = qVar2;
                                                    }
                                                }
                                            } catch (Exception | OutOfMemoryError e11) {
                                                e = e11;
                                                r3 = r2;
                                                r10 = r14;
                                                r3.M(i16);
                                                r12 = th2;
                                                r13 = r10;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r11 = r2;
                                                r11.M(i16);
                                                throw th;
                                            }
                                        }
                                    } else if (r2 == 65 && i12 == 80 && iZ3 == 73 && iZ4 == 67) {
                                        bVar = N(qVar, iG0, i15);
                                    } else {
                                        if (r2 != 67) {
                                        }
                                        if (r2 != 67) {
                                            int i19 = iG0;
                                            iG0 = i12;
                                            i12 = i19;
                                            r14 = r2;
                                            i13 = iZ3;
                                            i14 = iZ4;
                                            if (r14 != 67) {
                                                i15 = i10;
                                                qVar2 = qVar;
                                                if (r14 != 77) {
                                                    String strD1 = d0(i15, r14 == true ? 1 : 0, iG0, i13, i14);
                                                    byte[] bArr2 = new byte[i12];
                                                    qVar2.k(bArr2, 0, i12);
                                                    bVar = new b(strD1, bArr2);
                                                    r2 = qVar2;
                                                } else {
                                                    String strD2 = d0(i15, r14 == true ? 1 : 0, iG0, i13, i14);
                                                    byte[] bArr3 = new byte[i12];
                                                    qVar2.k(bArr3, 0, i12);
                                                    bVar = new b(strD2, bArr3);
                                                    r2 = qVar2;
                                                }
                                            } else {
                                                i15 = i10;
                                                qVar2 = qVar;
                                                if (r14 != 77) {
                                                    String strD3 = d0(i15, r14 == true ? 1 : 0, iG0, i13, i14);
                                                    byte[] bArr4 = new byte[i12];
                                                    qVar2.k(bArr4, 0, i12);
                                                    bVar = new b(strD3, bArr4);
                                                    r2 = qVar2;
                                                } else {
                                                    String strD4 = d0(i15, r14 == true ? 1 : 0, iG0, i13, i14);
                                                    byte[] bArr5 = new byte[i12];
                                                    qVar2.k(bArr5, 0, i12);
                                                    bVar = new b(strD4, bArr5);
                                                    r2 = qVar2;
                                                }
                                            }
                                        } else {
                                            int i110 = iG0;
                                            iG0 = i12;
                                            i12 = i110;
                                            r14 = r2;
                                            i13 = iZ3;
                                            i14 = iZ4;
                                            if (r14 != 67) {
                                                i15 = i10;
                                                qVar2 = qVar;
                                                if (r14 != 77) {
                                                    String strD5 = d0(i15, r14 == true ? 1 : 0, iG0, i13, i14);
                                                    byte[] bArr6 = new byte[i12];
                                                    qVar2.k(bArr6, 0, i12);
                                                    bVar = new b(strD5, bArr6);
                                                    r2 = qVar2;
                                                } else {
                                                    String strD6 = d0(i15, r14 == true ? 1 : 0, iG0, i13, i14);
                                                    byte[] bArr7 = new byte[i12];
                                                    qVar2.k(bArr7, 0, i12);
                                                    bVar = new b(strD6, bArr7);
                                                    r2 = qVar2;
                                                }
                                            } else {
                                                i15 = i10;
                                                qVar2 = qVar;
                                                if (r14 != 77) {
                                                    String strD7 = d0(i15, r14 == true ? 1 : 0, iG0, i13, i14);
                                                    byte[] bArr8 = new byte[i12];
                                                    qVar2.k(bArr8, 0, i12);
                                                    bVar = new b(strD7, bArr8);
                                                    r2 = qVar2;
                                                } else {
                                                    String strD8 = d0(i15, r14 == true ? 1 : 0, iG0, i13, i14);
                                                    byte[] bArr9 = new byte[i12];
                                                    qVar2.k(bArr9, 0, i12);
                                                    bVar = new b(strD8, bArr9);
                                                    r2 = qVar2;
                                                }
                                            }
                                        }
                                    }
                                    if (r12 == 0) {
                                        l1.a.t("Id3Decoder", "Failed to decode frame: id=" + d0(i15, r13, iG0, i13, i14) + ", frameSize=" + i12, e);
                                    }
                                    return r12;
                                }
                                bVar = S(iG0, qVar);
                                int i20 = iG0;
                                iG0 = i12;
                                i12 = i20;
                                r14 = r2;
                                i13 = iZ3;
                                i14 = iZ4;
                                r2 = qVar;
                            } catch (Exception | OutOfMemoryError e12) {
                                e = e12;
                                int i21 = iG0;
                                iG0 = i12;
                                i12 = i21;
                                r10 = r2;
                                i13 = iZ3;
                                i14 = iZ4;
                                r3 = qVar;
                            }
                        }
                        r2.M(i16);
                        r12 = bVar;
                        e = th2;
                        r13 = r14;
                        if (r12 == 0) {
                            l1.a.t("Id3Decoder", "Failed to decode frame: id=" + d0(i15, r13, iG0, i13, i14) + ", frameSize=" + i12, e);
                        }
                        return r12;
                    }
                    bVar = Z(iG0, d0(i15, r2, i12, iZ3, iZ4), qVar);
                }
                int i22 = iG0;
                iG0 = i12;
                i12 = i22;
                r14 = r2;
                i13 = iZ3;
                i14 = iZ4;
                r2 = qVar;
                th2 = null;
                r2.M(i16);
                r12 = bVar;
                e = th2;
                r13 = r14;
            } catch (Exception | OutOfMemoryError e13) {
                e = e13;
                int i23 = iG0;
                iG0 = i12;
                i12 = i23;
                r10 = r2;
                i13 = iZ3;
                i14 = iZ4;
                r3 = qVar;
                th2 = null;
            }
            if (r12 == 0) {
                l1.a.t("Id3Decoder", "Failed to decode frame: id=" + d0(i15, r13, iG0, i13, i14) + ", frameSize=" + i12, e);
            }
            return r12;
        } catch (Throwable th5) {
            th = th5;
            r11 = qVar;
        }
    }

    public static f S(int i10, q qVar) {
        int iZ = qVar.z();
        Charset charsetC0 = c0(iZ);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        qVar.k(bArr, 0, i11);
        int iF0 = f0(bArr, 0);
        String strN = d0.n(new String(bArr, 0, iF0, StandardCharsets.ISO_8859_1));
        int i12 = iF0 + 1;
        int iE0 = e0(bArr, i12, iZ);
        String strV = V(bArr, i12, iE0, charsetC0);
        int iB0 = b0(iZ) + iE0;
        int iE1 = e0(bArr, iB0, iZ);
        String strV2 = V(bArr, iB0, iE1, charsetC0);
        int iB1 = b0(iZ) + iE1;
        return new f(strN, strV, strV2, i11 <= iB1 ? y.f44831b : Arrays.copyOfRange(bArr, iB1, i11));
    }

    public static m T(int i10, q qVar) {
        int iG = qVar.G();
        int iC = qVar.C();
        int iC2 = qVar.C();
        int iZ = qVar.z();
        int iZ2 = qVar.z();
        xd1 xd1Var = new xd1();
        xd1Var.o(qVar);
        int i11 = ((i10 - 10) * 8) / (iZ + iZ2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = xd1Var.i(iZ);
            int i14 = xd1Var.i(iZ2);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new m(iG, iC, iArr, iArr2, iC2);
    }

    public static n U(int i10, q qVar) {
        byte[] bArr = new byte[i10];
        qVar.k(bArr, 0, i10);
        int iF0 = f0(bArr, 0);
        String str = new String(bArr, 0, iF0, StandardCharsets.ISO_8859_1);
        int i11 = iF0 + 1;
        return new n(str, i10 <= i11 ? y.f44831b : Arrays.copyOfRange(bArr, i11, i10));
    }

    public static String V(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static o W(int i10, String str, q qVar) {
        if (i10 < 1) {
            return null;
        }
        int iZ = qVar.z();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        qVar.k(bArr, 0, i11);
        return new o(str, null, X(bArr, iZ, 0));
    }

    public static n1 X(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return j0.B("");
        }
        e0 e0VarU = j0.u();
        int iE0 = e0(bArr, i11, i10);
        while (i11 < iE0) {
            e0VarU.b(new String(bArr, i11, iE0 - i11, c0(i10)));
            i11 = b0(i10) + iE0;
            iE0 = e0(bArr, i11, i10);
        }
        n1 n1VarG = e0VarU.g();
        return n1VarG.isEmpty() ? j0.B("") : n1VarG;
    }

    public static o Y(int i10, q qVar) {
        if (i10 < 1) {
            return null;
        }
        int iZ = qVar.z();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        qVar.k(bArr, 0, i11);
        int iE0 = e0(bArr, 0, iZ);
        return new o("TXXX", new String(bArr, 0, iE0, c0(iZ)), X(bArr, iZ, b0(iZ) + iE0));
    }

    public static p Z(int i10, String str, q qVar) {
        byte[] bArr = new byte[i10];
        qVar.k(bArr, 0, i10);
        return new p(str, null, new String(bArr, 0, f0(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static p a0(int i10, q qVar) {
        if (i10 < 1) {
            return null;
        }
        int iZ = qVar.z();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        qVar.k(bArr, 0, i11);
        int iE0 = e0(bArr, 0, iZ);
        String str = new String(bArr, 0, iE0, c0(iZ));
        int iB0 = b0(iZ) + iE0;
        return new p("WXXX", str, V(bArr, iB0, f0(bArr, iB0), StandardCharsets.ISO_8859_1));
    }

    public static int b0(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset c0(int i10) {
        if (i10 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i10 != 2) {
            return i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static String d0(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int e0(byte[] bArr, int i10, int i11) {
        int iF0 = f0(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iF0;
        }
        while (iF0 < bArr.length - 1) {
            if ((iF0 - i10) % 2 == 0 && bArr[iF0 + 1] == 0) {
                return iF0;
            }
            iF0 = f0(bArr, iF0 + 1);
        }
        return bArr.length;
    }

    public static int f0(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int g0(int i10, q qVar) {
        byte[] bArr = qVar.f44813a;
        int i11 = qVar.f44814b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean h0(q qVar, int i10, int i11, boolean z10) {
        int iC;
        long jC;
        int iG;
        int i12;
        int i13 = qVar.f44814b;
        while (true) {
            try {
                boolean z11 = true;
                if (qVar.a() < i11) {
                    qVar.M(i13);
                    return true;
                }
                if (i10 >= 3) {
                    iC = qVar.m();
                    jC = qVar.B();
                    iG = qVar.G();
                } else {
                    iC = qVar.C();
                    jC = qVar.C();
                    iG = 0;
                }
                if (iC == 0 && jC == 0 && iG == 0) {
                    qVar.M(i13);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jC) != 0) {
                        qVar.M(i13);
                        return false;
                    }
                    jC = (((jC >> 24) & 255) << 21) | (jC & 255) | (((jC >> 8) & 255) << 7) | (((jC >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iG & 64) != 0 ? 1 : 0;
                    if ((iG & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (iG & 32) != 0 ? 1 : 0;
                    if ((iG & 128) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (jC < i12) {
                    qVar.M(i13);
                    return false;
                }
                if (qVar.a() < jC) {
                    qVar.M(i13);
                    return false;
                }
                qVar.N((int) jC);
            } catch (Throwable th2) {
                qVar.M(i13);
                throw th2;
            }
        }
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
    public final c0 M(int i10, byte[] bArr) {
        boolean z10;
        h hVar;
        int i11;
        int i12;
        int iG0;
        j jVarR;
        ArrayList arrayList = new ArrayList();
        q qVar = new q(bArr, i10);
        boolean z11 = false;
        if (qVar.a() < 10) {
            l1.a.s("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iC = qVar.C();
            if (iC == 4801587) {
                int iZ = qVar.z();
                qVar.N(1);
                int iZ2 = qVar.z();
                int iY = qVar.y();
                if (iZ != 2) {
                    if (iZ == 3) {
                        if ((iZ2 & 64) != 0) {
                            int iM = qVar.m();
                            qVar.N(iM);
                            iY -= iM + 4;
                        }
                    } else if (iZ == 4) {
                        if ((iZ2 & 64) != 0) {
                            int iY2 = qVar.y();
                            qVar.N(iY2 - 4);
                            iY -= iY2;
                        }
                        if ((iZ2 & 16) != 0) {
                            iY -= 10;
                        }
                    } else {
                        u.v(iZ, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iZ < 4) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    hVar = new h(iZ, z10, iY);
                } else if ((iZ2 & 64) != 0) {
                    l1.a.s("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iZ < 4 || (iZ2 & 128) == 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    hVar = new h(iZ, z10, iY);
                }
                if (hVar == null) {
                    return null;
                }
                i11 = hVar.f5457a;
                int i13 = qVar.f44814b;
                i12 = i11 == 2 ? 6 : 10;
                iG0 = hVar.f5459c;
                if (hVar.f5458b) {
                    iG0 = g0(iG0, qVar);
                }
                qVar.L(i13 + iG0);
                if (!h0(qVar, i11, i12, false)) {
                    if (i11 == 4 || !h0(qVar, 4, i12, true)) {
                        u.v(i11, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z11 = true;
                }
                while (qVar.a() >= i12) {
                    jVarR = R(i11, qVar, z11, i12, this.f5461b);
                    if (jVarR != null) {
                        arrayList.add(jVarR);
                    }
                }
                return new c0(arrayList);
            }
            l1.a.s("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iC))));
        }
        hVar = null;
        if (hVar == null) {
            return null;
        }
        i11 = hVar.f5457a;
        int i14 = qVar.f44814b;
        if (i11 == 2) {
        }
        iG0 = hVar.f5459c;
        if (hVar.f5458b) {
            iG0 = g0(iG0, qVar);
        }
        qVar.L(i14 + iG0);
        if (!h0(qVar, i11, i12, false)) {
            if (i11 == 4) {
            }
            u.v(i11, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (qVar.a() >= i12) {
            jVarR = R(i11, qVar, z11, i12, this.f5461b);
            if (jVarR != null) {
                arrayList.add(jVarR);
            }
        }
        return new c0(arrayList);
    }

    @Override // no.b
    public final c0 o(w2.a aVar, ByteBuffer byteBuffer) {
        return M(byteBuffer.limit(), byteBuffer.array());
    }
}
