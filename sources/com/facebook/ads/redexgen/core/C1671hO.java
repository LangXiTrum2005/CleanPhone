package com.facebook.ads.redexgen.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1671hO implements CG {
    public static byte[] A01;
    public static String[] A02 = {"RKj", "", "UN15gotjq8", "ajoBiEUEQKFJNLqm", "ifgUnXqkKiJSPGKzKRtyUVwCV1ynqJ", "MgNPOwYKG3krpOkrgoqalUsb7GIlLECG", "4d5pH5OlBXd1RidH0kkNXmSukCNaNWUQ", "ZdfTYbLhRFsUmKvgir0oysIbzYx0fUOP"};
    public final /* synthetic */ C1669hM A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-31, -7, -21, -23, -7, -29};
    }

    static {
        A01();
    }

    public C1671hO(C1669hM c1669hM) {
        this.A00 = c1669hM;
    }

    public /* synthetic */ C1671hO(C1669hM c1669hM, C1677hU c1677hU) {
        this(c1669hM);
    }

    @Override // com.facebook.ads.redexgen.core.CG
    public final void ACi() {
        this.A00.A0a.setToolbarActionMessage(A00(0, 0, 19));
        this.A00.A0I();
        if (this.A00.A0X) {
            boolean zA0V = this.A00.A0V();
            String[] strArr = A02;
            if (strArr[5].charAt(0) == strArr[7].charAt(0)) {
                throw new RuntimeException();
            }
            A02[4] = "QDC88FCswtzFK8CArK72WEL9jXMBl5";
            if (zA0V) {
                this.A00.A0a.setToolbarActionMode(1);
                return;
            }
        }
        this.A00.A0a.setToolbarActionMode(0);
    }

    @Override // com.facebook.ads.redexgen.core.CG
    public final void AEg(float f) {
        float fA04;
        this.A00.A0O((int) f);
        if (this.A00.A0Y) {
            if (this.A00.A0E) {
                AbstractC1984md abstractC1984md = this.A00.A0I;
                if (A02[6].charAt(27) != 'a') {
                    throw new RuntimeException();
                }
                A02[4] = "3MuDy2E798EtOoHK0e0a3SiH1QgAy5";
                fA04 = 1.0f - (f / abstractC1984md.A1b().A0F().A03());
                if (this.A00.A0H || fA04 < 1.0f) {
                    this.A00.A0H = false;
                    this.A00.A0a.setToolbarActionMessage(this.A00.A0I.A1f().A02().replace(A00(0, 6, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE), String.valueOf((int) f)));
                } else {
                    this.A00.A0H = true;
                    DQ dq = this.A00.A0a;
                    String strA00 = A00(0, 0, 19);
                    if (A02[3].length() != 16) {
                        dq.setToolbarActionMessage(strA00);
                    } else {
                        String[] strArr = A02;
                        strArr[5] = "wpbUz5ctYXHuYyRf6fVCU3uRzsMt7dE8";
                        strArr[7] = "BBfRd69Z77LUH69GeqVAIKhho7h2fuMA";
                        dq.setToolbarActionMessage(strA00);
                    }
                }
            } else {
                fA04 = 1.0f - (f / this.A00.A0I.A1b().A0F().A04());
            }
            this.A00.A0a.setProgress(100.0f * fA04);
            float fA03 = this.A00.A0I.A1b().A0F().A03() - f;
            float percentageOfReward = this.A00.A0I.A1b().A0F().A04();
            boolean z = fA03 >= percentageOfReward;
            if (!this.A00.A0H && z) {
                this.A00.A0a.setToolbarActionMode(1);
                return;
            }
            return;
        }
        this.A00.A0a.setProgress(100.0f * (1.0f - (f / this.A00.A0J.A07())));
    }
}
