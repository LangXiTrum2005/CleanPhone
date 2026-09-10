package com.facebook.ads.redexgen.core;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2461mM implements InterfaceC1272Il {
    public static byte[] A07;
    public static String[] A08 = {"eVwUBMvHO9uBMhknAGNfZP2yr814WJyE", "k5ILRUABeDXqCwWpN", "hJjZHs3Q8zIp76bYyURn3XwI", "BeESTKEHKjvJbhVudlSNXwxkHuAjvLDZ", "rbeMFWTNNauR3FTC2xnHN2ozIe2oUtV0", "bbPaxRhv7ZvGWrZH", "Yl9CHZRrzKaSrdtxcFsBA9EFbwcoGK5g", "dqSnihCeyqEvBM16"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC1271Ik A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C1269Ii> A05 = new ArrayDeque<>();
    public final C1277Iq A04 = new C1277Iq();

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{98, -121, -113, 122, -123, -126, 125, 57, 126, -123, 126, -122, 126, -121, -115, 57, -115, -110, -119, 126, 57, 91, -128, -120, 115, 126, 123, 118, 50, 120, 126, -127, 115, -122, 50, -123, 123, -116, 119, 76, 50, -78, -41, -33, -54, -43, -46, -51, -119, -46, -41, -35, -50, -48, -50, -37, -119, -36, -46, -29, -50, -93, -119, -61, -28, -30, -39, -34, -41, -112, -43, -36, -43, -35, -43, -34, -28, -112, -29, -39, -22, -43, -86, -112};
        if (A08[6].charAt(2) != '9') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[0] = "OJtOaz7eyeuGy8JHYC7MsYj9KI0teM8x";
        strArr[4] = "Pthq8qREsbuOKTWUYG3bxj4Nb5ptFAt8";
    }

    static {
        A05();
    }

    private double A00(InterfaceC2482ms interfaceC2482ms, int i) throws IOException {
        long jA02 = A02(interfaceC2482ms, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) jA02);
        }
        return Double.longBitsToDouble(jA02);
    }

    @RequiresNonNull({"processor"})
    private long A01(InterfaceC2482ms interfaceC2482ms) throws IOException {
        interfaceC2482ms.AIl();
        while (true) {
            interfaceC2482ms.AGt(this.A06, 0, 4);
            int iA00 = C1277Iq.A00(this.A06[0]);
            if (iA00 != -1 && iA00 <= 4) {
                int iA01 = (int) C1277Iq.A01(this.A06, iA00, false);
                if (this.A03.AAW(iA01)) {
                    interfaceC2482ms.AK3(iA00);
                    return iA01;
                }
            }
            interfaceC2482ms.AK3(1);
        }
    }

    private long A02(InterfaceC2482ms interfaceC2482ms, int i) throws IOException {
        interfaceC2482ms.readFully(this.A06, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long value = this.A06[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            j = (j << 8) | value;
        }
        return j;
    }

    public static String A04(InterfaceC2482ms interfaceC2482ms, int i) throws IOException {
        if (i == 0) {
            return A03(0, 0, 32);
        }
        byte[] bArr = new byte[i];
        interfaceC2482ms.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1272Il
    public final void AAD(InterfaceC1271Ik interfaceC1271Ik) {
        this.A03 = interfaceC1271Ik;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011d, code lost:
    
        if (r0 <= 2147483647L) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011f, code lost:
    
        r12.A03.AKK(r12.A00, A04(r13, (int) r12.A02));
        r12.A01 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0137, code lost:
    
        if (r0 <= 2147483647L) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015b, code lost:
    
        throw com.facebook.ads.redexgen.core.C3K.A01(A03(63, 21, 97) + r12.A02, null);
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1272Il
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AHO(com.facebook.ads.redexgen.core.InterfaceC2482ms r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2461mM.AHO(com.facebook.ads.redexgen.X.ms):boolean");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1272Il
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
