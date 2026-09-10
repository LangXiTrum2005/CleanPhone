package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes3.dex */
public final class CeaUtil {
    public static void a(long j, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int i2;
        int iU;
        while (true) {
            if (parsableByteArray.a() <= 1) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (parsableByteArray.a() == 0) {
                    i2 = -1;
                    break;
                }
                int iU2 = parsableByteArray.u();
                i3 += iU2;
                if (iU2 != 255) {
                    i2 = i3;
                    break;
                }
            }
            int i4 = 0;
            do {
                if (parsableByteArray.a() == 0) {
                    i4 = -1;
                    break;
                } else {
                    iU = parsableByteArray.u();
                    i4 += iU;
                }
            } while (iU == 255);
            int i5 = parsableByteArray.f18957b + i4;
            if (i4 == -1 || i4 > parsableByteArray.a()) {
                Log.g("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i5 = parsableByteArray.f18958c;
            } else if (i2 == 4 && i4 >= 8) {
                int iU3 = parsableByteArray.u();
                int iZ = parsableByteArray.z();
                int iG = iZ == 49 ? parsableByteArray.g() : 0;
                int iU4 = parsableByteArray.u();
                if (iZ == 47) {
                    parsableByteArray.G(1);
                }
                boolean z2 = iU3 == 181 && (iZ == 49 || iZ == 47) && iU4 == 3;
                if (iZ == 49) {
                    z2 &= iG == 1195456820;
                }
                if (z2) {
                    b(j, parsableByteArray, trackOutputArr);
                }
            }
            parsableByteArray.F(i5);
        }
    }

    public static void b(long j, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        long j2;
        int iU = parsableByteArray.u();
        if ((iU & 64) != 0) {
            parsableByteArray.G(1);
            int i2 = (iU & 31) * 3;
            int i3 = parsableByteArray.f18957b;
            int length = trackOutputArr.length;
            int i4 = 0;
            while (i4 < length) {
                TrackOutput trackOutput = trackOutputArr[i4];
                parsableByteArray.F(i3);
                trackOutput.e(i2, parsableByteArray);
                if (j != -9223372036854775807L) {
                    j2 = j;
                    trackOutput.f(j2, 1, i2, 0, null);
                } else {
                    j2 = j;
                }
                i4++;
                j = j2;
            }
        }
    }
}
