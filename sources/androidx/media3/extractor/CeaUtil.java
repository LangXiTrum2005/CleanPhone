package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;

/* JADX INFO: loaded from: classes.dex */
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
            int i5 = parsableByteArray.f5668b + i4;
            if (i4 == -1 || i4 > parsableByteArray.a()) {
                Log.g("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i5 = parsableByteArray.f5669c;
            } else if (i2 == 4 && i4 >= 8) {
                int iU3 = parsableByteArray.u();
                int iA = parsableByteArray.A();
                int iG = iA == 49 ? parsableByteArray.g() : 0;
                int iU4 = parsableByteArray.u();
                if (iA == 47) {
                    parsableByteArray.H(1);
                }
                boolean z2 = iU3 == 181 && (iA == 49 || iA == 47) && iU4 == 3;
                if (iA == 49) {
                    z2 &= iG == 1195456820;
                }
                if (z2) {
                    b(j, parsableByteArray, trackOutputArr);
                }
            }
            parsableByteArray.G(i5);
        }
    }

    public static void b(long j, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int iU = parsableByteArray.u();
        if ((iU & 64) != 0) {
            parsableByteArray.H(1);
            int i2 = (iU & 31) * 3;
            int i3 = parsableByteArray.f5668b;
            for (TrackOutput trackOutput : trackOutputArr) {
                parsableByteArray.G(i3);
                trackOutput.e(i2, parsableByteArray);
                Assertions.e(j != -9223372036854775807L);
                trackOutput.f(j, 1, i2, 0, null);
            }
        }
    }
}
