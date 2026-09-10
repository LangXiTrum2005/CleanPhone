package h3;

import b2.w;
import com.google.android.gms.internal.ads.b6;
import com.google.android.gms.internal.ads.z01;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import d5.u;
import i1.b0;
import i1.c0;
import i1.d0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import n2.x;
import oa.e0;
import oa.f0;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f42180a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static String b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((r) it.next()).f42197a.f42187g.f42643n;
            if (d0.m(str2)) {
                return MimeTypes.VIDEO_MP4;
            }
            if (d0.i(str2)) {
                z10 = true;
            } else if (d0.k(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z10) {
            return MimeTypes.AUDIO_MP4;
        }
        return str != null ? str : MimeTypes.APPLICATION_MP4;
    }

    public static boolean c(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 = 0; i11 < 29; i11++) {
            if (f42180a[i11] == i10) {
                return true;
            }
        }
        return false;
    }

    public static b3.e d(int i10, l1.q qVar) {
        int iM = qVar.m();
        if (qVar.m() == 1684108385) {
            qVar.N(8);
            String strV = qVar.v(iM - 16);
            return new b3.e(C.LANGUAGE_UNDETERMINED, strV, strV);
        }
        l1.a.s("MetadataUtil", "Failed to parse comment attribute: " + z01.b(i10));
        return null;
    }

    public static b3.a e(l1.q qVar) {
        String str;
        int iM = qVar.m();
        if (qVar.m() != 1684108385) {
            l1.a.s("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM2 = qVar.m();
        byte[] bArr = b.f42089a;
        int i10 = iM2 & 16777215;
        if (i10 == 13) {
            str = "image/jpeg";
        } else {
            str = i10 == 14 ? "image/png" : null;
        }
        if (str == null) {
            u.v(i10, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        qVar.N(4);
        int i11 = iM - 16;
        byte[] bArr2 = new byte[i11];
        qVar.k(bArr2, 0, i11);
        return new b3.a(str, null, 3, bArr2);
    }

    public static b3.o f(int i10, String str, l1.q qVar) {
        int iM = qVar.m();
        if (qVar.m() == 1684108385 && iM >= 22) {
            qVar.N(10);
            int iG = qVar.G();
            if (iG > 0) {
                String strE = l1.d.e(iG, "");
                int iG2 = qVar.G();
                if (iG2 > 0) {
                    strE = strE + "/" + iG2;
                }
                return new b3.o(str, null, j0.B(strE));
            }
        }
        l1.a.s("MetadataUtil", "Failed to parse index/count attribute: " + z01.b(i10));
        return null;
    }

    public static int g(l1.q qVar) {
        int iM = qVar.m();
        if (qVar.m() == 1684108385) {
            qVar.N(8);
            int i10 = iM - 16;
            if (i10 == 1) {
                return qVar.z();
            }
            if (i10 == 2) {
                return qVar.G();
            }
            if (i10 == 3) {
                return qVar.C();
            }
            if (i10 == 4 && (qVar.j() & 128) == 0) {
                return qVar.D();
            }
        }
        l1.a.s("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static b3.j h(int i10, String str, l1.q qVar, boolean z10, boolean z11) {
        int iG = g(qVar);
        if (z11) {
            iG = Math.min(1, iG);
        }
        if (iG >= 0) {
            return z10 ? new b3.o(str, null, j0.B(Integer.toString(iG))) : new b3.e(C.LANGUAGE_UNDETERMINED, str, Integer.toString(iG));
        }
        l1.a.s("MetadataUtil", "Failed to parse uint8 attribute: " + z01.b(i10));
        return null;
    }

    public static od.c i(byte[] bArr) {
        UUID[] uuidArr;
        l1.q qVar = new l1.q(bArr);
        if (qVar.f44815c < 32) {
            return null;
        }
        qVar.M(0);
        int iA = qVar.a();
        int iM = qVar.m();
        if (iM != iA) {
            l1.a.s("PsshAtomUtil", "Advertised atom size (" + iM + ") does not match buffer size: " + iA);
            return null;
        }
        int iM2 = qVar.m();
        if (iM2 != 1886614376) {
            u.v(iM2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iE = b.e(qVar.m());
        if (iE > 1) {
            u.v(iE, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(qVar.t(), qVar.t());
        if (iE == 1) {
            int iD = qVar.D();
            uuidArr = new UUID[iD];
            for (int i10 = 0; i10 < iD; i10++) {
                uuidArr[i10] = new UUID(qVar.t(), qVar.t());
            }
        } else {
            uuidArr = null;
        }
        int iD2 = qVar.D();
        int iA2 = qVar.a();
        if (iD2 == iA2) {
            byte[] bArr2 = new byte[iD2];
            qVar.k(bArr2, 0, iD2);
            return new od.c(uuid, iE, bArr2, uuidArr);
        }
        l1.a.s("PsshAtomUtil", "Atom data size (" + iD2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static b3.o j(int i10, String str, l1.q qVar) {
        int iM = qVar.m();
        if (qVar.m() == 1684108385) {
            qVar.N(8);
            return new b3.o(str, null, j0.B(qVar.v(iM - 16)));
        }
        l1.a.s("MetadataUtil", "Failed to parse text attribute: " + z01.b(i10));
        return null;
    }

    public static void k(int i10, c0 c0Var, i1.o oVar, c0 c0Var2, c0... c0VarArr) {
        if (c0Var2 == null) {
            c0Var2 = new c0(new b0[0]);
        }
        if (c0Var != null) {
            e0 e0VarU = j0.u();
            for (b0 b0Var : c0Var.f42527a) {
                if (m1.a.class.isAssignableFrom(b0Var.getClass())) {
                    e0VarU.b((b0) m1.a.class.cast(b0Var));
                }
            }
            f0 f0VarListIterator = e0VarU.g().listIterator(0);
            while (f0VarListIterator.hasNext()) {
                m1.a aVar = (m1.a) f0VarListIterator.next();
                if (!aVar.f45768a.equals("com.android.capture.fps") || i10 == 2) {
                    c0Var2 = c0Var2.a(aVar);
                }
            }
        }
        for (c0 c0Var3 : c0VarArr) {
            c0Var2 = c0Var2.b(c0Var3);
        }
        if (c0Var2.f42527a.length > 0) {
            oVar.f42599k = c0Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0172  */
    /* JADX WARN: Code duplicated, block: B:102:0x0175  */
    /* JADX WARN: Code duplicated, block: B:104:0x0178 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code duplicated, block: B:95:0x0169  */
    /* JADX WARN: Code duplicated, block: B:97:0x016c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0170 A[DONT_INVERT] */
    public static x l(n2.l lVar, boolean z10, boolean z11) {
        x xVar;
        int i10;
        int i11;
        long j10;
        long j11;
        int i12;
        boolean z12;
        int[] iArr;
        long length = lVar.getLength();
        long j12 = -1;
        int i13 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j13 = 4096;
        if (i13 != 0 && length <= 4096) {
            j13 = length;
        }
        int i14 = (int) j13;
        l1.q qVar = new l1.q(64);
        int i15 = 0;
        int i16 = 0;
        boolean z13 = false;
        while (true) {
            if (i16 < i14) {
                int i17 = 8;
                qVar.J(8);
                if (lVar.peekFully(qVar.f44813a, i15, 8, true)) {
                    long jB = qVar.B();
                    int iM = qVar.m();
                    if (jB == 1) {
                        j12 = j12;
                        lVar.peekFully(qVar.f44813a, 8, 8);
                        i11 = 16;
                        qVar.L(16);
                        jB = qVar.t();
                        i16 = i16;
                    } else {
                        j12 = j12;
                        if (jB == 0) {
                            long length2 = lVar.getLength();
                            if (length2 != j12) {
                                jB = (length2 - lVar.getPeekPosition()) + ((long) 8);
                            }
                        }
                        i11 = 8;
                    }
                    long j14 = jB;
                    long j15 = i11;
                    if (j14 >= j15) {
                        j10 = j14;
                    } else {
                        if (iM != 1718773093 || i11 != 8) {
                            return new b6(iM, i11, 2, j14);
                        }
                        j10 = j15;
                    }
                    int i18 = i16 + i11;
                    xVar = null;
                    if (iM == 1836019574) {
                        i14 += (int) j10;
                        if (i13 != 0 && i14 > length) {
                            i14 = (int) length;
                        }
                        i16 = i18;
                        i15 = 0;
                    } else {
                        if (iM == 1953653099 || iM == 1835297121 || iM == 1835626086) {
                            j11 = length;
                            i12 = 0;
                            i16 = i18;
                        } else if (iM == 1836019558 || iM == 1836475768) {
                            i10 = 1;
                        } else {
                            if (iM == 1835295092) {
                                z13 = true;
                            }
                            if (iM != 1937007212 || j10 <= 1000000) {
                                j11 = length;
                                if ((((long) i18) + j10) - j15 < i14) {
                                    int i19 = (int) (j10 - j15);
                                    i16 = i18 + i19;
                                    if (iM != 1718909296) {
                                        i12 = 0;
                                        if (i19 != 0) {
                                            lVar.advancePeekPosition(i19);
                                        }
                                    } else {
                                        if (i19 < 8) {
                                            return new b6(iM, i17, 2, i19);
                                        }
                                        qVar.J(i19);
                                        i12 = 0;
                                        lVar.peekFully(qVar.f44813a, 0, i19);
                                        int iM2 = qVar.m();
                                        if (c(iM2, z11)) {
                                            z13 = true;
                                        }
                                        qVar.N(4);
                                        int iA = qVar.a() / 4;
                                        if (!z13 && iA > 0) {
                                            iArr = new int[iA];
                                            int i20 = 0;
                                            while (true) {
                                                if (i20 >= iA) {
                                                    z12 = z13;
                                                    break;
                                                }
                                                int iM3 = qVar.m();
                                                iArr[i20] = iM3;
                                                if (c(iM3, z11)) {
                                                    z12 = true;
                                                    break;
                                                }
                                                i20++;
                                            }
                                        } else {
                                            z12 = z13;
                                            iArr = null;
                                        }
                                        if (!z12) {
                                            return new w(iM2, 13, iArr);
                                        }
                                        z13 = z12;
                                    }
                                }
                            }
                            i10 = 0;
                        }
                        i15 = i12;
                        length = j11;
                    }
                }
                if (!z13) {
                    return l.f42172a;
                }
                if (z10 != i10) {
                    return i10 != 0 ? h.f42135b : h.f42136c;
                }
                return xVar;
            }
            xVar = null;
            i10 = i15;
            if (!z13) {
                return l.f42172a;
            }
            if (z10 != i10) {
                if (i10 != 0) {
                }
            }
            return xVar;
        }
    }
}
