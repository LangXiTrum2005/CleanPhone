package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7X extends AbstractC2420ik {
    public static String[] A02 = {"eAQfPHHoyWilLfBxOFaJj1G06pGOxPq", "94FVrmFRVghPmyms9ar5cFWRdDurlkVe", "0NqQX4CUu3LD8PHaDMvmRAbh4clEtoM7", "DpSRaNejvtQ52XA7I6oeLqqk6ldlwRKU", "AVeirdKHq7BiC91JmOFjEM59wAwHTkmS", "1THCMBeh6DIPctxeAaB65wntvUu4aFha", "yEsJBiLTEnojRHdtAiiv5fZXbmAhiMSc", "YuG6RWvr5fcVmyx3SnaQUPOafyGz2fG"};
    public C2411iZ A00;
    public final C2395iI A01;

    public C7X(C2395iI c2395iI, String str) {
        super(c2395iI.A0B, str, A00(c2395iI));
        this.A01 = c2395iI;
    }

    public static C2394iH A00(C2395iI c2395iI) {
        return new C2394iH(c2395iI);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2420ik
    public final void A08() {
        if (super.A01.A01) {
            this.A05.A5v();
        }
        if (this.A00 != null) {
            this.A00.destroy();
        }
        super.A00.AJM(OD.A03);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2420ik
    public final void A09() {
        this.A00 = new C2411iZ(this.A01, this, A04());
        this.A00.A0J(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2420ik
    public final void A0D(boolean z2) {
        this.A05.AJn(z2);
    }

    public final C2395iI A0E() {
        return this.A01;
    }

    public final void A0F(Ad ad, String str, AdExperienceType adExperienceType, boolean z2) {
        if (super.A00.A6U()) {
            return;
        }
        this.A01.A02(ad);
        if (this.A00 != null) {
            this.A00.A0J(str, adExperienceType, z2);
            return;
        }
        this.A01.A05 = str;
        this.A01.A02 = adExperienceType;
        this.A01.A08 = z2;
        if (AbstractC1753Us.A09(this.A02) && AbstractC1753Us.A0B(this.A02)) {
            if (AbstractC1753Us.A0M(str)) {
                A05();
                return;
            } else {
                A09();
                return;
            }
        }
        A09();
    }

    public final void A0G(RewardData rewardData) {
        this.A01.A03 = rewardData;
        if (super.A01.A01) {
            super.A01.A0F(2003, OY.A00(new Bundle(), rewardData));
        } else if (this.A00 != null) {
            this.A00.A0I(rewardData);
        }
    }

    public final boolean A0H() {
        if (this.A00 != null) {
            return this.A00.A0K();
        }
        return this.A01.A01 > 0 && Y1.A00() > this.A01.A01;
    }

    public final boolean A0I() {
        if (this.A00 != null) {
            return this.A00.A0L();
        }
        return super.A00.A6p() == OD.A05;
    }

    public final boolean A0J(Ad ad, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int iA00 = ((SJ) rewardedVideoShowAdConfig).A00();
        long jA01 = ((SJ) rewardedVideoShowAdConfig).A01();
        if (super.A00.A6V()) {
            return false;
        }
        this.A01.A02(ad);
        String[] strArr = A02;
        String str = strArr[7];
        String str2 = strArr[0];
        int length = str.length();
        int appOrientation = str2.length();
        if (length == appOrientation) {
            String[] strArr2 = A02;
            strArr2[5] = "m9KaRECdYgffkM0tCirP5ynC5R03VfN7";
            strArr2[6] = "WVyWW47u948M29zNqYDy5rdzHxlGG88k";
            if (super.A01.A01) {
                A0A(iA00);
                return true;
            }
            C2411iZ c2411iZ = this.A00;
            String[] strArr3 = A02;
            String str3 = strArr3[2];
            String str4 = strArr3[1];
            int iCharAt = str3.charAt(27);
            int appOrientation2 = str4.charAt(27);
            if (iCharAt != appOrientation2) {
                String[] strArr4 = A02;
                strArr4[7] = "SVQKcBS7FHKRAHC3EplGepZBNeGcwFJ";
                strArr4[0] = "IfCkczTPSOxE6DmqSLPQVuiWAstWVdL";
                if (c2411iZ != null) {
                    return this.A00.A0M(iA00, jA01);
                }
                this.A00 = new C2411iZ(this.A01, this, A04());
                this.A00.A0M(iA00, jA01);
                return false;
            }
        }
        throw new RuntimeException();
    }
}
