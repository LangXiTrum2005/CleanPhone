package com.smartdigimkt.c4;

import android.support.v4.media.session.PlaybackStateCompat;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.p4.s;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f34270a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f34271b = {f0.d("isom"), f0.d("iso2"), f0.d("iso3"), f0.d("iso4"), f0.d("iso5"), f0.d("iso6"), f0.d("avc1"), f0.d("hvc1"), f0.d("hev1"), f0.d("mp41"), f0.d("mp42"), f0.d("3g2a"), f0.d("3g2b"), f0.d("3gr6"), f0.d("3gs6"), f0.d("3ge6"), f0.d("3gg6"), f0.d("M4V "), f0.d("M4A "), f0.d("f4v "), f0.d("kddi"), f0.d("M4VP"), f0.d("qt  "), f0.d("MSNV")};

    private i() {
    }

    public static boolean a(com.smartdigimkt.b4.f fVar) throws InterruptedException, IOException {
        return a(fVar, true);
    }

    public static boolean b(com.smartdigimkt.b4.f fVar) throws InterruptedException, IOException {
        return a(fVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(com.smartdigimkt.b4.f fVar, boolean z2) throws InterruptedException, IOException {
        boolean z3;
        int i2;
        long jA = fVar.a();
        long j = -1;
        if (jA == -1 || jA > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            jA = 4096;
        }
        int i3 = (int) jA;
        s sVar = new s(64);
        boolean z4 = false;
        int i4 = 0;
        byte b2 = false;
        while (true) {
            if (i4 < i3) {
                sVar.c(8);
                fVar.b(sVar.f37616a, z4 ? 1 : 0, 8);
                long jZ = sVar.z();
                int i5 = sVar.i();
                if (jZ == 1) {
                    fVar.b(sVar.f37616a, 8, 8);
                    sVar.d(16);
                    i2 = 16;
                    jZ = sVar.C();
                } else {
                    if (jZ == 0) {
                        long jA2 = fVar.a();
                        if (jA2 != j) {
                            jZ = ((long) 8) + (jA2 - fVar.d());
                        }
                    }
                    i2 = 8;
                }
                long j2 = i2;
                if (jZ < j2) {
                    return z4;
                }
                i4 += i2;
                if (i5 != a.H) {
                    if (i5 == a.f34152Q || i5 == a.S) {
                        z3 = true;
                        return b2 == true && z2 == z3;
                    }
                    long j3 = (((long) i4) + jZ) - j2;
                    boolean z5 = z4 ? 1 : 0;
                    if (j3 < i3) {
                        int i6 = (int) (jZ - j2);
                        i4 += i6;
                        if (i5 == a.g) {
                            if (i6 < 8) {
                                return z5;
                            }
                            sVar.c(i6);
                            fVar.b(sVar.f37616a, z5 ? 1 : 0, i6);
                            int i7 = i6 / 4;
                            for (int i8 = 0; i8 < i7; i8++) {
                                if (i8 != 1) {
                                    if (a(sVar.i())) {
                                        b2 = true;
                                        break;
                                    }
                                } else {
                                    sVar.f(4);
                                }
                            }
                            if (b2 == false) {
                                return false;
                            }
                        } else if (i6 != 0) {
                            fVar.c(i6);
                        }
                        j = -1;
                        z4 = false;
                    }
                }
            }
            z3 = false;
            if (b2 == true) {
                return false;
            }
        }
    }

    private static boolean a(int i2) {
        if ((i2 >>> 8) == f0.d("3gp")) {
            return true;
        }
        for (int i3 : f34271b) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }
}
