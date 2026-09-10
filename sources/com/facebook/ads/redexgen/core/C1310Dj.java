package com.facebook.ads.redexgen.core;

import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1310Dj extends TextView implements InterfaceC2188eu {
    public static byte[] A02;
    public static String[] A03 = {"KyDK4ozsSQOI8CeBEp6vN7GPAMaKi3Lj", "3K3dE7OkNcMTAukVEMEsyydi1KZJfoYe", "AKsSDy", "td2HYxymrySRBlk8LVzv2Nj", "9YKsZJjoWB8K3TGCGylWNfB", "C67xSy", "ZVZacBuH1Jrb8cRz3UZ99yjmQBL5sCV1", "zO36dBYDIleQnJstGNGNdS3bkLsuKmlY"};
    public static final int A04;
    public C1337Ek A00;
    public final UN<C4A> A01;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[0].charAt(28) == strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[0] = "iGxWfyiSQAQNOwaGoqCiMbtpxtO5GMjZ";
            strArr2[1] = "gQ1pvXOTKlX7L3B8LOaiCsG8OhRO9Yk5";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 61);
            i5++;
        }
    }

    public static void A04() {
        A02 = new byte[]{15, 26, 24, 78, 16, 15, 26, 24, 78, 18, 18, 24, 18, 18};
    }

    static {
        A04();
        A04 = (int) (XX.A02 * 6.0f);
    }

    public C1310Dj(C2300gi c2300gi) {
        super(c2300gi);
        this.A01 = new C1311Dk(this);
        YB.A0V(this, YB.A06(855638016, A04));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A02(long j) {
        if (j <= 0) {
            return A01(9, 5, 31);
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j);
        long minutes2 = TimeUnit.MILLISECONDS.toSeconds(j % ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        return String.format(Locale.US, A01(0, 9, 23), Long.valueOf(minutes), Long.valueOf(minutes2));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2188eu
    public final void AAv(C1337Ek c1337Ek) {
        this.A00 = c1337Ek;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2188eu
    public final void AKV(C1337Ek c1337Ek) {
        this.A00 = c1337Ek;
        if (this.A00 != null) {
            this.A00.getEventBus().A06(this.A01);
        }
    }
}
