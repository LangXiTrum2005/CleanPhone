package com.smartdigimkt.o4;

import android.net.Uri;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.p4.v;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f37426a = 131072;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f37427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile long f37428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile long f37429c = -1;

        public long a() {
            return this.f37427a + this.f37428b;
        }
    }

    private f() {
    }

    public static String a(Uri uri) {
        return uri.toString();
    }

    public static String a(com.smartdigimkt.n4.k kVar) {
        String str = kVar.f;
        return str != null ? str : a(kVar.f37004a);
    }

    public static void a(com.smartdigimkt.n4.k kVar, com.smartdigimkt.o4.a aVar, a aVar2) {
        String strA = a(kVar);
        long j = kVar.f37006c;
        long jB = kVar.f37007e;
        com.smartdigimkt.o4.a aVar3 = aVar;
        if (jB == -1) {
            jB = aVar3.b(strA);
        }
        aVar2.f37429c = jB;
        aVar2.f37427a = 0L;
        aVar2.f37428b = 0L;
        long j2 = jB;
        while (j2 != 0) {
            long jC = aVar3.c(strA, j, j2 != -1 ? j2 : Long.MAX_VALUE);
            if (jC > 0) {
                aVar2.f37427a += jC;
            } else {
                jC = -jC;
                if (jC == Long.MAX_VALUE) {
                    return;
                }
            }
            j += jC;
            if (j2 == -1) {
                jC = 0;
            }
            j2 -= jC;
            aVar3 = aVar;
        }
    }

    public static void a(com.smartdigimkt.n4.k kVar, com.smartdigimkt.o4.a aVar, com.smartdigimkt.n4.h hVar, a aVar2, AtomicBoolean atomicBoolean) throws InterruptedException, IOException {
        a(kVar, aVar, new c(aVar, hVar), new byte[131072], null, 0, aVar2, atomicBoolean, false);
    }

    public static void a(com.smartdigimkt.n4.k kVar, com.smartdigimkt.o4.a aVar, c cVar, byte[] bArr, v vVar, int i2, a aVar2, AtomicBoolean atomicBoolean, boolean z2) throws InterruptedException, IOException {
        com.smartdigimkt.n4.k kVar2 = kVar;
        com.smartdigimkt.o4.a aVar3 = aVar;
        a aVar4 = aVar2;
        com.smartdigimkt.p4.a.a(cVar);
        com.smartdigimkt.p4.a.a(bArr);
        if (aVar4 != null) {
            a(kVar2, aVar3, aVar4);
        } else {
            aVar4 = new a();
        }
        a aVar5 = aVar4;
        String strA = a(kVar2);
        long j = kVar2.f37006c;
        long jB = kVar2.f37007e;
        if (jB == -1) {
            jB = aVar3.b(strA);
        }
        long j2 = jB;
        while (true) {
            long j3 = 0;
            if (j2 == 0) {
                return;
            }
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            long jC = aVar3.c(strA, j, j2 != -1 ? j2 : Long.MAX_VALUE);
            String str = strA;
            long j4 = j;
            if (jC <= 0) {
                long j5 = -jC;
                if (a(kVar2, j4, j5, cVar, bArr, vVar, i2, aVar5) < j5) {
                    if (z2 && j2 != -1) {
                        throw new EOFException();
                    }
                    return;
                }
                jC = j5;
            }
            j = j4 + jC;
            if (j2 != -1) {
                j3 = jC;
            }
            j2 -= j3;
            kVar2 = kVar;
            aVar3 = aVar;
            strA = str;
        }
    }

    private static long a(com.smartdigimkt.n4.k kVar, long j, long j2, com.smartdigimkt.n4.h hVar, byte[] bArr, v vVar, int i2, a aVar) throws InterruptedException, IOException {
        int length;
        com.smartdigimkt.n4.k kVar2 = kVar;
        while (true) {
            if (vVar != null) {
                vVar.b(i2);
            }
            try {
                try {
                    if (!Thread.interrupted()) {
                        com.smartdigimkt.n4.k kVar3 = new com.smartdigimkt.n4.k(kVar2.f37004a, kVar2.f37005b, j, (kVar2.d + j) - kVar2.f37006c, -1L, kVar2.f, kVar2.g | 2);
                        try {
                            long jA = hVar.a(kVar3);
                            if (aVar.f37429c == -1 && jA != -1) {
                                aVar.f37429c = kVar3.f37006c + jA;
                            }
                            long j3 = 0;
                            while (j3 != j2) {
                                if (!Thread.interrupted()) {
                                    if (j2 != -1) {
                                        length = (int) Math.min(bArr.length, j2 - j3);
                                    } else {
                                        length = bArr.length;
                                    }
                                    int iA = hVar.a(bArr, 0, length);
                                    if (iA == -1) {
                                        if (aVar.f37429c != -1) {
                                            break;
                                        }
                                        aVar.f37429c = kVar3.f37006c + j3;
                                        break;
                                    }
                                    long j4 = iA;
                                    j3 += j4;
                                    aVar.f37428b += j4;
                                } else {
                                    throw new InterruptedException();
                                }
                            }
                            f0.a(hVar);
                            return j3;
                        } catch (v.a unused) {
                            kVar2 = kVar3;
                        }
                    } else {
                        throw new InterruptedException();
                    }
                } catch (v.a unused2) {
                }
            } catch (Throwable th) {
                f0.a(hVar);
                throw th;
            }
            f0.a(hVar);
        }
    }

    public static void a(com.smartdigimkt.o4.a aVar, String str) {
        Iterator<e> it = aVar.c(str).iterator();
        while (it.hasNext()) {
            try {
                aVar.a(it.next());
            } catch (com.smartdigimkt.o4.a.C0559a unused) {
            }
        }
    }
}
