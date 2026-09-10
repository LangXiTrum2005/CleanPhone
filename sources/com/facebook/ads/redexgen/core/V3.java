package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class V3 implements AudienceNetworkExportedActivityApi {
    public static byte[] A01;
    public static String[] A02 = {"mk4JADweKGMdEipgs7lqzWCmp9MhwBVd", "7Ny", "iKbrrxCAW5LmmXQLv4pN0A2xOojW5LEh", "hTGooAwgeIivj8mmjwzyxJz5o5QVTAJv", "t2q", "TYEvFDV2ICGQhAA5rVoFfbgoEst1cigG", "6Z5Mtc9AK5a0redP3ZVrPDgigSlCVve8", "dEPXAz2Hd7rZMNq86xusU7gw49uZCQrL"};
    public final Activity A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -12, -6, 5, -8, -4, 5, -25, -10, -10, 5, -11, -8, -17, -21, -12, -6, -25, -6, -17, -11, -12, 5, -15, -21, -1, -44, -43, -45, -32, -62, -59, -32, -54, -59, -32, -52, -58, -38};
    }

    static {
        A01();
    }

    public V3(Activity activity) {
        this.A00 = activity;
    }

    private void A02(int i2) {
        this.A00.setResult(i2);
        this.A00.finish();
    }

    private boolean A03(V2 v2) {
        String callingPackage = this.A00.getCallingPackage();
        if (callingPackage != null) {
            String callingPackage2 = v2.A04;
            if (callingPackage.equals(callingPackage2)) {
                if (A02[6].charAt(24) != 'N') {
                    String[] strArr = A02;
                    strArr[3] = "K8elIBMg7jYz2h1Vp3N7ST3gxgb7rcrL";
                    strArr[2] = "atbN7xR2A34bPDsarDq1XfYhUcdmo37f";
                    return true;
                }
                String[] strArr2 = A02;
                strArr2[3] = "WL8DJ1n8qMW41xfoDndW3QEL4VTWFS4X";
                strArr2[2] = "L472DFJOuggr64sYy3SVVGT8Lyt3cNtD";
                return true;
            }
        }
        A02(12);
        if (v2.A00 instanceof C2414id) {
            ((C2414id) v2.A00).A0F().A0F().AHu();
        }
        if (v2.A00 instanceof C2411iZ) {
            InterfaceC1526Lt interfaceC1526LtA0F = ((C2411iZ) v2.A00).A0H().A0F();
            if (A02[6].charAt(24) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr3 = A02;
            strArr3[3] = "KnmB7vQIkrX7k7dgjGlnkXpo8slRCHvd";
            strArr3[2] = "L31mVvLUBUTWDHfS0xNAbfc4Adshav9b";
            interfaceC1526LtA0F.AHu();
            return false;
        }
        return false;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi
    public final void onCreate(Bundle bundle) {
        C2300gi c2300giA05 = C1673Rp.A05(this.A00, UUID.randomUUID().toString());
        if (this.A00.isTaskRoot()) {
            c2300giA05.A0F().AHm();
            A02(10);
            return;
        }
        String stringExtra = this.A00.getIntent().getStringExtra(A00(26, 13, 64));
        if (stringExtra == null) {
            c2300giA05.A0F().AHq();
            A02(11);
            return;
        }
        X9 x9A00 = X9.A00();
        String[] strArr = A02;
        String adId = strArr[3];
        if (adId.charAt(2) == strArr[2].charAt(2)) {
            throw new RuntimeException();
        }
        A02[6] = "lksFSMsleDiju0zPRojKCtBItYjbAveN";
        V2 v2A04 = x9A00.A04(stringExtra);
        OG og = v2A04 != null ? v2A04.A00 : null;
        if (v2A04 != null && (og instanceof C2411iZ)) {
            boolean zA03 = A03(v2A04);
            String[] strArr2 = A02;
            String adId2 = strArr2[3];
            if (adId2.charAt(2) == strArr2[2].charAt(2)) {
                throw new RuntimeException();
            }
            A02[6] = "e1bxVkSqO5M4Y9q0gpYlqAB3DYjxjVYF";
            if (!zA03) {
                return;
            }
            C2411iZ c2411iZ = (C2411iZ) og;
            c2411iZ.A0G().A01().A0J(this.A00);
            c2411iZ.A0M(this.A00.getIntent().getIntExtra(A00(0, 26, 101), -1), 0L);
        } else if (v2A04 != null && (og instanceof C2414id)) {
            if (!A03(v2A04)) {
                return;
            }
            C2414id c2414id = (C2414id) og;
            c2414id.A0E().A05().A0J(this.A00);
            c2414id.A0J();
        } else {
            c2300giA05.A0F().AII();
            A02(13);
            return;
        }
        this.A00.setResult(-1);
        this.A00.finish();
    }
}
