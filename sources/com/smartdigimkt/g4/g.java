package com.smartdigimkt.g4;

import android.util.Log;
import com.inmobi.commons.core.configs.AdConfig;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.p4.s;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements com.smartdigimkt.e4.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35421c = "Id3Decoder";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f35422e = 10;
    private static final int f = 128;
    private static final int g = 64;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f35423h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f35424i = 8;
    private static final int j = 4;
    private static final int k = 64;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f35425l = 2;
    private static final int m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f35426n = 0;
    private static final int o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f35427p = 2;
    private static final int q = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f35428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f35420b = new a();
    public static final int d = f0.d("ID3");

    public class a implements b {
        @Override // com.smartdigimkt.g4.g.b
        public boolean a(int i2, int i3, int i4, int i5, int i6) {
            return false;
        }
    }

    public interface b {
        boolean a(int i2, int i3, int i4, int i5, int i6);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f35429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f35430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f35431c;

        public c(int i2, boolean z2, int i3) {
            this.f35429a = i2;
            this.f35430b = z2;
            this.f35431c = i3;
        }
    }

    public g() {
        this(null);
    }

    private static int a(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    private static k b(s sVar, int i2, String str) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int iX = sVar.x();
        String strB = b(iX);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        sVar.a(bArr, 0, i3);
        return new k(str, null, new String(bArr, 0, b(bArr, 0, iX), strB));
    }

    private static l c(s sVar, int i2, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i2];
        sVar.a(bArr, 0, i2);
        return new l(str, null, new String(bArr, 0, b(bArr, 0), CharEncoding.ISO_8859_1));
    }

    private static k d(s sVar, int i2) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int iX = sVar.x();
        String strB = b(iX);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        sVar.a(bArr, 0, i3);
        int iB = b(bArr, 0, iX);
        String str = new String(bArr, 0, iB, strB);
        int iA = iB + a(iX);
        return new k("TXXX", str, a(bArr, iA, b(bArr, iA, iX), strB));
    }

    private static l e(s sVar, int i2) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int iX = sVar.x();
        String strB = b(iX);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        sVar.a(bArr, 0, i3);
        int iB = b(bArr, 0, iX);
        String str = new String(bArr, 0, iB, strB);
        int iA = iB + a(iX);
        return new l("WXXX", str, a(bArr, iA, b(bArr, iA), CharEncoding.ISO_8859_1));
    }

    private static int f(s sVar, int i2) {
        byte[] bArr = sVar.f37616a;
        int iC = sVar.c();
        while (true) {
            int i3 = iC + 1;
            if (i3 >= i2) {
                return i2;
            }
            if ((bArr[iC] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255 && bArr[i3] == 0) {
                System.arraycopy(bArr, iC + 2, bArr, i3, (i2 - iC) - 2);
                i2--;
            }
            iC = i3;
        }
    }

    public g(b bVar) {
        this.f35428a = bVar;
    }

    @Override // com.smartdigimkt.e4.b
    public com.smartdigimkt.e4.a a(com.smartdigimkt.e4.e eVar) {
        ByteBuffer byteBuffer = eVar.f40353c;
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    public com.smartdigimkt.e4.a a(byte[] bArr, int i2) throws Throwable {
        ArrayList arrayList = new ArrayList();
        s sVar = new s(bArr, i2);
        c cVarA = a(sVar);
        if (cVarA == null) {
            return null;
        }
        int iC = sVar.c();
        int i3 = cVarA.f35429a == 2 ? 6 : 10;
        int iF = cVarA.f35431c;
        if (cVarA.f35430b) {
            iF = f(sVar, cVarA.f35431c);
        }
        sVar.d(iC + iF);
        boolean z2 = false;
        if (!a(sVar, cVarA.f35429a, i3, false)) {
            if (cVarA.f35429a != 4 || !a(sVar, 4, i3, true)) {
                Log.w(f35421c, "Failed to validate ID3 tag with majorVersion=" + cVarA.f35429a);
                return null;
            }
            z2 = true;
        }
        while (sVar.a() >= i3) {
            h hVarA = a(cVarA.f35429a, sVar, z2, i3, this.f35428a);
            if (hVarA != null) {
                arrayList.add(hVarA);
            }
        }
        return new com.smartdigimkt.e4.a(arrayList);
    }

    private static j c(s sVar, int i2) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i2];
        sVar.a(bArr, 0, i2);
        int iB = b(bArr, 0);
        return new j(new String(bArr, 0, iB, CharEncoding.ISO_8859_1), a(bArr, iB + 1, i2));
    }

    private static f b(s sVar, int i2) throws UnsupportedEncodingException {
        int iX = sVar.x();
        String strB = b(iX);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        sVar.a(bArr, 0, i3);
        int iB = b(bArr, 0);
        String str = new String(bArr, 0, iB, CharEncoding.ISO_8859_1);
        int i4 = iB + 1;
        int iB2 = b(bArr, i4, iX);
        String strA = a(bArr, i4, iB2, strB);
        int iA = iB2 + a(iX);
        int iB3 = b(bArr, iA, iX);
        return new f(str, strA, a(bArr, iA, iB3, strB), a(bArr, iB3 + a(iX), i3));
    }

    private static c a(s sVar) {
        if (sVar.a() < 10) {
            Log.w(f35421c, "Data too short to be an ID3 tag");
            return null;
        }
        int iA = sVar.A();
        if (iA != d) {
            androidx.datastore.preferences.protobuf.a.u(iA, "Unexpected first three bytes of ID3 tag header: ", f35421c);
            return null;
        }
        int iX = sVar.x();
        sVar.f(1);
        int iX2 = sVar.x();
        int iW = sVar.w();
        if (iX == 2) {
            if ((iX2 & 64) != 0) {
                Log.w(f35421c, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iX == 3) {
            if ((iX2 & 64) != 0) {
                int i2 = sVar.i();
                sVar.f(i2);
                iW -= i2 + 4;
            }
        } else {
            if (iX != 4) {
                androidx.datastore.preferences.protobuf.a.u(iX, "Skipped ID3 tag with unsupported majorVersion=", f35421c);
                return null;
            }
            if ((iX2 & 64) != 0) {
                int iW2 = sVar.w();
                sVar.f(iW2 - 4);
                iW -= iW2;
            }
            if ((iX2 & 16) != 0) {
                iW -= 10;
            }
        }
        return new c(iX, iX < 4 && (iX2 & 128) != 0, iW);
    }

    private static d b(s sVar, int i2, int i3, boolean z2, int i4, b bVar) throws Throwable {
        int iC = sVar.c();
        int iB = b(sVar.f37616a, iC);
        String str = new String(sVar.f37616a, iC, iB - iC, CharEncoding.ISO_8859_1);
        sVar.e(iB + 1);
        int iX = sVar.x();
        boolean z3 = (iX & 2) != 0;
        boolean z4 = (iX & 1) != 0;
        int iX2 = sVar.x();
        String[] strArr = new String[iX2];
        for (int i5 = 0; i5 < iX2; i5++) {
            int iC2 = sVar.c();
            int iB2 = b(sVar.f37616a, iC2);
            strArr[i5] = new String(sVar.f37616a, iC2, iB2 - iC2, CharEncoding.ISO_8859_1);
            sVar.e(iB2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i6 = iC + i2;
        while (sVar.c() < i6) {
            h hVarA = a(i3, sVar, z2, i4, bVar);
            if (hVarA != null) {
                arrayList.add(hVarA);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new d(str, z3, z4, strArr, hVarArr);
    }

    private static String b(int i2) {
        if (i2 == 1) {
            return "UTF-16";
        }
        if (i2 == 2) {
            return CharEncoding.UTF_16BE;
        }
        if (i2 != 3) {
            return CharEncoding.ISO_8859_1;
        }
        return "UTF-8";
    }

    private static int b(byte[] bArr, int i2, int i3) {
        int iB = b(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return iB;
        }
        while (iB < bArr.length - 1) {
            if (iB % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(bArr, iB + 1);
        }
        return bArr.length;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008a A[PHI: r3
  0x008a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:41:0x0087, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean a(s sVar, int i2, int i3, boolean z2) {
        int iA;
        long jA;
        int iD;
        int i4;
        int iC = sVar.c();
        while (true) {
            try {
                boolean z3 = true;
                if (sVar.a() < i3) {
                    sVar.e(iC);
                    return true;
                }
                if (i2 >= 3) {
                    iA = sVar.i();
                    jA = sVar.z();
                    iD = sVar.D();
                } else {
                    iA = sVar.A();
                    jA = sVar.A();
                    iD = 0;
                }
                if (iA == 0 && jA == 0 && iD == 0) {
                    sVar.e(iC);
                    return true;
                }
                if (i2 == 4 && !z2) {
                    if ((8421504 & jA) != 0) {
                        sVar.e(iC);
                        return false;
                    }
                    jA = (((jA >> 24) & 255) << 21) | (jA & 255) | (((jA >> 8) & 255) << 7) | (((jA >> 16) & 255) << 14);
                }
                if (i2 == 4) {
                    i4 = (iD & 64) != 0 ? 1 : 0;
                    if ((iD & 1) == 0) {
                        z3 = false;
                    }
                } else if (i2 == 3) {
                    i4 = (iD & 32) != 0 ? 1 : 0;
                    if ((iD & 128) == 0) {
                        z3 = false;
                    }
                } else {
                    i4 = 0;
                    z3 = false;
                }
                if (z3) {
                    i4 += 4;
                }
                if (jA < i4) {
                    sVar.e(iC);
                    return false;
                }
                if (sVar.a() < jA) {
                    sVar.e(iC);
                    return false;
                }
                sVar.f((int) jA);
            } catch (Throwable th) {
                sVar.e(iC);
                throw th;
            }
        }
    }

    private static int b(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:167:0x0200 A[Catch: all -> 0x01fe, UnsupportedEncodingException -> 0x022d, TryCatch #5 {all -> 0x01fe, blocks: (B:169:0x020e, B:172:0x022d, B:164:0x01f9, B:167:0x0200), top: B:180:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x020e A[Catch: all -> 0x01fe, UnsupportedEncodingException -> 0x022d, TRY_LEAVE, TryCatch #5 {all -> 0x01fe, blocks: (B:169:0x020e, B:172:0x022d, B:164:0x01f9, B:167:0x0200), top: B:180:0x0115 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:169:0x020e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9, types: [com.smartdigimkt.g4.h] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.smartdigimkt.p4.s] */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.smartdigimkt.p4.s] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.smartdigimkt.p4.s] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r9v11, types: [int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v8, types: [int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    private static h a(int i2, s sVar, boolean z2, int i3, b bVar) throws Throwable {
        int iA;
        ?? r1;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r16;
        ?? r2;
        ?? r9;
        int i4;
        h hVarA;
        ?? r10;
        ?? r17;
        boolean zA;
        int i5 = i2;
        s sVar2 = sVar;
        int iX = sVar2.x();
        int iX2 = sVar2.x();
        int iX3 = sVar2.x();
        boolean z7 = false;
        int iX4 = i5 >= 3 ? sVar2.x() : 0;
        if (i5 == 4) {
            iA = sVar2.B();
            if (!z2) {
                iA = (((iA >> 24) & 255) << 21) | (iA & 255) | (((iA >> 8) & 255) << 7) | (((iA >> 16) & 255) << 14);
            }
        } else if (i5 == 3) {
            iA = sVar2.B();
        } else {
            iA = sVar2.A();
        }
        int iF = iA;
        int iD = i5 >= 3 ? sVar2.D() : 0;
        if (iX == 0 && iX2 == 0 && iX3 == 0 && iX4 == 0 && iF == 0 && iD == 0) {
            sVar2.e(sVar2.d());
            return null;
        }
        int iC = sVar2.c() + iF;
        if (iC > sVar2.d()) {
            Log.w(f35421c, "Frame size exceeds remaining tag data");
            sVar2.e(sVar2.d());
            return null;
        }
        if (bVar != null) {
            zA = bVar.a(i5, iX, iX2, iX3, iX4);
            r1 = iX2;
            if (!zA) {
                i5 = i5;
                sVar2.e(iC);
                return null;
            }
        } else {
            r1 = iX2;
        }
        i5 = i5;
        if (i5 == 3) {
            boolean z8 = (iD & 128) != 0;
            boolean z9 = (iD & 64) != 0;
            boolean z10 = (iD & 32) != 0;
            z6 = false;
            boolean z11 = z8;
            z5 = z9 ? 1 : 0;
            z3 = z10;
            z4 = z11 ? 1 : 0;
            z7 = z11;
            r16 = z9;
        } else if (i5 == 4) {
            boolean z12 = (iD & 64) != 0;
            boolean z13 = (iD & 8) != 0;
            boolean z14 = (iD & 4) != 0;
            boolean z15 = (iD & 2) != 0;
            boolean z16 = (iD & 1) != 0;
            z7 = z13 ? 1 : 0;
            z3 = z12;
            z4 = z16;
            r16 = z13;
            z5 = z14;
            z6 = z15;
        } else {
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (!z7 && !z5) {
            if (z3) {
                iF--;
                sVar2.f(1);
            }
            if (z4) {
                iF -= 4;
                sVar2.f(4);
            }
            if (z6) {
                iF = f(sVar2, iF);
            }
            try {
                try {
                    try {
                        try {
                            if (iX == 84 && r1 == 88 && iX3 == 88 && (i5 == 2 || iX4 == 88)) {
                                hVarA = d(sVar2, iF);
                            } else if (iX == 84) {
                                hVarA = b(sVar2, iF, a(i5, iX, (int) r1, iX3, iX4));
                            } else if (iX == 87 && r1 == 88 && iX3 == 88 && (i5 == 2 || iX4 == 88)) {
                                hVarA = e(sVar2, iF);
                            } else if (iX == 87) {
                                hVarA = c(sVar2, iF, a(i5, iX, (int) r1, iX3, iX4));
                            } else {
                                if (iX == 80 && r1 == 82 && iX3 == 73 && iX4 == 86) {
                                    hVarA = c(sVar2, iF);
                                } else {
                                    r16 = 0;
                                    try {
                                        if (iX == 71 && r1 == 69 && iX3 == 79 && (iX4 == 66 || i5 == 2)) {
                                            hVarA = b(sVar2, iF);
                                        } else {
                                            if (i5 == 2) {
                                                if (iX == 80 && r1 == 73 && iX3 == 67) {
                                                    hVarA = a(sVar2, iF, i5);
                                                } else if (iX != 67 && r1 == 79 && iX3 == 77 && (iX4 == 77 || i5 == 2)) {
                                                    hVarA = a(sVar2, iF);
                                                } else if (iX != 67 && r1 == 72 && iX3 == 65 && iX4 == 80) {
                                                    r10 = r1;
                                                    iX3 = iX3;
                                                    iF = iF;
                                                    i4 = iX4;
                                                    try {
                                                        hVarA = a(sVar2, iF, i5, z2, i3, bVar);
                                                        i5 = i2;
                                                        r1 = sVar;
                                                        r16 = r16;
                                                    } catch (UnsupportedEncodingException unused) {
                                                        r1 = sVar;
                                                        Log.w(f35421c, "Unsupported character encoding");
                                                        r1.e(iC);
                                                        return r16;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        r2 = sVar;
                                                        r2.e(iC);
                                                        throw th;
                                                    }
                                                } else {
                                                    r9 = r1;
                                                    iX3 = iX3;
                                                    iF = iF;
                                                    i4 = iX4;
                                                    if (iX != 67 && r9 == 84 && iX3 == 79 && i4 == 67) {
                                                        i5 = i2;
                                                        s sVar3 = sVar;
                                                        hVarA = b(sVar3, iF, i5, z2, i3, bVar);
                                                        r1 = sVar3;
                                                        r10 = r9;
                                                        r16 = r16;
                                                    } else {
                                                        i5 = i2;
                                                        s sVar4 = sVar;
                                                        hVarA = a(sVar4, iF, a(i5, iX, (int) r9, iX3, i4));
                                                        r1 = sVar4;
                                                        r10 = r9;
                                                        r16 = r16;
                                                    }
                                                }
                                            } else if (iX == 65 && r1 == 80 && iX3 == 73 && iX4 == 67) {
                                                hVarA = a(sVar2, iF, i5);
                                            } else {
                                                if (iX != 67) {
                                                }
                                                if (iX != 67) {
                                                    r9 = r1;
                                                    iX3 = iX3;
                                                    iF = iF;
                                                    i4 = iX4;
                                                    if (iX != 67) {
                                                        i5 = i2;
                                                        s sVar5 = sVar;
                                                        hVarA = a(sVar5, iF, a(i5, iX, (int) r9, iX3, i4));
                                                        r1 = sVar5;
                                                        r10 = r9;
                                                        r16 = r16;
                                                    } else {
                                                        i5 = i2;
                                                        s sVar6 = sVar;
                                                        hVarA = a(sVar6, iF, a(i5, iX, (int) r9, iX3, i4));
                                                        r1 = sVar6;
                                                        r10 = r9;
                                                        r16 = r16;
                                                    }
                                                } else {
                                                    r9 = r1;
                                                    iX3 = iX3;
                                                    iF = iF;
                                                    i4 = iX4;
                                                    if (iX != 67) {
                                                        i5 = i2;
                                                        s sVar7 = sVar;
                                                        hVarA = a(sVar7, iF, a(i5, iX, (int) r9, iX3, i4));
                                                        r1 = sVar7;
                                                        r10 = r9;
                                                        r16 = r16;
                                                    } else {
                                                        i5 = i2;
                                                        s sVar8 = sVar;
                                                        hVarA = a(sVar8, iF, a(i5, iX, (int) r9, iX3, i4));
                                                        r1 = sVar8;
                                                        r10 = r9;
                                                        r16 = r16;
                                                    }
                                                }
                                            }
                                            i4 = iX4;
                                            r1 = sVar2;
                                            r10 = r1;
                                            r16 = r17;
                                        }
                                        r17 = r16;
                                        i4 = iX4;
                                        r1 = sVar2;
                                        r10 = r1;
                                        r16 = r17;
                                    } catch (UnsupportedEncodingException unused2) {
                                        r1 = sVar2;
                                    }
                                }
                                if (hVarA == null) {
                                    Log.w(f35421c, "Failed to decode frame: id=" + a(i5, iX, (int) r10, iX3, i4) + ", frameSize=" + iF);
                                }
                                r1.e(iC);
                                return hVarA;
                            }
                            r17 = 0;
                            i4 = iX4;
                            r1 = sVar2;
                            r10 = r1;
                            r16 = r17;
                            if (hVarA == null) {
                                Log.w(f35421c, "Failed to decode frame: id=" + a(i5, iX, (int) r10, iX3, i4) + ", frameSize=" + iF);
                            }
                            r1.e(iC);
                            return hVarA;
                        } catch (UnsupportedEncodingException unused3) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r2 = r1;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r2 = sVar2;
                }
            } catch (UnsupportedEncodingException unused4) {
                r1 = sVar2;
                r16 = 0;
            }
        } else {
            r16 = zA;
            Log.w(f35421c, "Skipping unsupported compressed or encrypted frame");
            sVar2.e(iC);
            return null;
        }
    }

    private static com.smartdigimkt.g4.a a(s sVar, int i2, int i3) throws UnsupportedEncodingException {
        int iB;
        String strK;
        int iX = sVar.x();
        String strB = b(iX);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        sVar.a(bArr, 0, i4);
        if (i3 == 2) {
            strK = "image/" + f0.k(new String(bArr, 0, 3, CharEncoding.ISO_8859_1));
            if ("image/jpg".equals(strK)) {
                strK = "image/jpeg";
            }
            iB = 2;
        } else {
            iB = b(bArr, 0);
            strK = f0.k(new String(bArr, 0, iB, CharEncoding.ISO_8859_1));
            if (strK.indexOf(47) == -1) {
                strK = "image/".concat(strK);
            }
        }
        int i5 = bArr[iB + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i6 = iB + 2;
        int iB2 = b(bArr, i6, iX);
        return new com.smartdigimkt.g4.a(strK, new String(bArr, i6, iB2 - i6, strB), i5, a(bArr, iB2 + a(iX), i4));
    }

    private static e a(s sVar, int i2) throws UnsupportedEncodingException {
        if (i2 < 4) {
            return null;
        }
        int iX = sVar.x();
        String strB = b(iX);
        byte[] bArr = new byte[3];
        sVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        sVar.a(bArr2, 0, i3);
        int iB = b(bArr2, 0, iX);
        String str2 = new String(bArr2, 0, iB, strB);
        int iA = iB + a(iX);
        return new e(str, str2, a(bArr2, iA, b(bArr2, iA, iX), strB));
    }

    private static com.smartdigimkt.g4.c a(s sVar, int i2, int i3, boolean z2, int i4, b bVar) throws Throwable {
        int iC = sVar.c();
        int iB = b(sVar.f37616a, iC);
        String str = new String(sVar.f37616a, iC, iB - iC, CharEncoding.ISO_8859_1);
        sVar.e(iB + 1);
        int i5 = sVar.i();
        int i6 = sVar.i();
        long jZ = sVar.z();
        if (jZ == 4294967295L) {
            jZ = -1;
        }
        long jZ2 = sVar.z();
        long j2 = jZ2 == 4294967295L ? -1L : jZ2;
        ArrayList arrayList = new ArrayList();
        int i7 = iC + i2;
        while (sVar.c() < i7) {
            h hVarA = a(i3, sVar, z2, i4, bVar);
            if (hVarA != null) {
                arrayList.add(hVarA);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new com.smartdigimkt.g4.c(str, i5, i6, jZ, j2, hVarArr);
    }

    private static com.smartdigimkt.g4.b a(s sVar, int i2, String str) {
        byte[] bArr = new byte[i2];
        sVar.a(bArr, 0, i2);
        return new com.smartdigimkt.g4.b(str, bArr);
    }

    private static String a(int i2, int i3, int i4, int i5, int i6) {
        if (i2 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    private static byte[] a(byte[] bArr, int i2, int i3) {
        if (i3 <= i2) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i2, i3);
    }

    private static String a(byte[] bArr, int i2, int i3, String str) throws UnsupportedEncodingException {
        if (i3 > i2 && i3 <= bArr.length) {
            return new String(bArr, i2, i3 - i2, str);
        }
        return "";
    }
}
