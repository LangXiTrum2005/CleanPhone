package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1129Wh {
    public static String[] A05 = {"hdKuQdViiIHud4OmoPe4Dj9qyWbewbpT", "rDms12NfBU9Z8q0mYtQ", "gfM16iqYHAaBqaGjGMmxvEl16SZ7cvpi", "", "", "aAkklFGSRz6SkEnfAz5", "x7V4WWKW1IGT7GqNA3", "F4Kv4buGX3weJQTN3fM0PKSXdxJIAKrE"};
    public int A01;
    public boolean A02;
    public final C1130Wi A03 = new C1130Wi();
    public final C1576fq A04 = new C1576fq(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    public int A00 = -1;

    private int A00(int i) {
        this.A01 = 0;
        int i2 = 0;
        while (i < size) {
            int[] iArr = this.A03.A09;
            int i3 = this.A01;
            int size = i3 + 1;
            this.A01 = size;
            int segmentLength = iArr[i3 + i];
            i2 += segmentLength;
            if (segmentLength != 255) {
                break;
            }
        }
        return i2;
    }

    public final C1130Wi A01() {
        return this.A03;
    }

    public final C1576fq A02() {
        return this.A04;
    }

    public final void A03() {
        this.A03.A02();
        this.A04.A0d(0);
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A04() {
        if (this.A04.A0l().length == 65025) {
            return;
        }
        this.A04.A0j(Arrays.copyOf(this.A04.A0l(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.A04.A0A())), this.A04.A0A());
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f0  */
    public final boolean A05(WJ wj) throws IOException {
        AbstractC1517es.A08(wj != null);
        String[] strArr = A05;
        if (strArr[4].length() == strArr[3].length()) {
            A05[2] = "QmmKR1KiuqmmjHoOMJtRqedzRIt4yPCw";
            if (this.A02) {
                this.A02 = false;
                this.A04.A0d(0);
            }
            while (!this.A02) {
                if (this.A00 < 0) {
                    boolean zA03 = this.A03.A03(wj);
                    String[] strArr2 = A05;
                    if (strArr2[4].length() == strArr2[3].length()) {
                        A05[2] = "LfbudlwWIL08hgc9komVcBDJO809cLCo";
                        if (!zA03 || !this.A03.A05(wj, true)) {
                            return false;
                        }
                        int segmentIndex = 0;
                        int iA00 = this.A03.A01;
                        if ((this.A03.A04 & 1) == 1 && this.A04.A0A() == 0) {
                            iA00 += A00(0);
                            segmentIndex = 0 + this.A01;
                        }
                        if (!UM.A02(wj, iA00)) {
                            return false;
                        }
                        this.A00 = segmentIndex;
                    }
                }
                int segmentIndex2 = A00(this.A00);
                int i = this.A00 + this.A01;
                if (segmentIndex2 > 0) {
                    this.A04.A0c(this.A04.A0A() + segmentIndex2);
                    if (!UM.A03(wj, this.A04.A0l(), this.A04.A0A(), segmentIndex2)) {
                        return false;
                    }
                    this.A04.A0e(this.A04.A0A() + segmentIndex2);
                    this.A02 = this.A03.A09[i + (-1)] != 255;
                }
                C1130Wi c1130Wi = this.A03;
                String[] strArr3 = A05;
                if (strArr3[4].length() != strArr3[3].length()) {
                    A05[6] = "FjMQGWsGrZtNHX8u3H";
                    if (i == c1130Wi.A02) {
                        i = -1;
                    }
                } else {
                    String[] strArr4 = A05;
                    strArr4[0] = "d8Kfa1E2AvWc53a0c0Qu5LdiheOvBUkg";
                    strArr4[7] = "WSKbA7oc8OhkrTaCXWowoNLXvPrDD8oU";
                    if (i == c1130Wi.A02) {
                        i = -1;
                    }
                }
                this.A00 = i;
            }
            return true;
        }
        throw new RuntimeException();
    }
}
