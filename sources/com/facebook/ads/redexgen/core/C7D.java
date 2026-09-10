package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.badlogic.gdx.Input;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7D, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7D implements RewardedVideoAdApi, Repairable {
    public static byte[] A04;
    public static String[] A05 = {"k8yEFjaDDmJNEMKVrce3vEWkKDhb9GrD", "5HJZEEaowyWiZ6x5JcW91LnqKILZK9iv", "JCdbC5zohUOjfclxz", "cbOkRGwJ0he66t85Zev39Ck1DLyP", "QnWh1EoQaEskbAIVlUx7Y0ywxM6b", "GMmjAnpO", "8CCIVLGxcMAoQXrfALv1hDyohO9DfryR", "UYxyoZ6BjjTfNK3ar4eEie7WMpDsFwCV"};
    public final Ad A00;
    public final C1929li A01;
    public final MW A02;
    public final C1828k1 A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{122, 42, 43, 120, 120, 112, 126, 123, 27, 23, 30, 23, 27, 27, 26, 28, 101, 55, 48, 104, 53, 100, 48, 104, 33, 117, 33, 47, 32, 35, 113, 116, 52, 19, 9, 24, cw.m, 19, 28, 17, 93, 24, cw.m, cw.m, 18, cw.m, 83, 119, 105, 94, 76, 90, 73, 95, 94, 95, 27, 77, 82, 95, 94, 84, 27, 90, 95, 27, 95, 94, 72, 79, 73, 84, 66, 94, 95, 59, 12, 30, 8, 27, cw.k, 12, cw.k, 73, 31, 0, cw.k, 12, 6, 73, 8, cw.k, 73, 5, 6, 8, cw.k, 73, 27, 12, 24, 28, 12, 26, 29, 12, cw.k, 33, 22, 4, 18, 1, 23, 22, 23, 83, 5, 26, 23, 22, 28, 83, 18, 23, 83, 0, 27, 28, 4, 83, cw.n, 18, 31, 31, 22, 23, 66, 67, 85, 82, 84, 73, 95, 73, 74, 68, 65, 100, 65, 22, cw.k, 10, 18};
    }

    static {
        A01();
    }

    public C7D(Context context, String str, Ad ad) {
        this.A00 = ad;
        String string = UUID.randomUUID().toString();
        this.A03 = C05056p.A07(context, string);
        InterfaceC03681f interfaceC03681fA0F = this.A03.A0F();
        String adId = AdPlacementType.REWARDED_VIDEO.toString();
        interfaceC03681fA0F.A3J(adId, str);
        this.A01 = new C1929li(this.A03, str, this.A00, new C1950m4());
        this.A03.A0O(this);
        this.A02 = new MW(this.A01, string);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C7E buildLoadAdConfig() {
        return new C7E(this);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final C7F buildShowAdConfig() {
        return new C7F();
    }

    public final void A04() {
        if (C05789m.A2D(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0F().A3K();
    }

    public final void A05(RewardData rewardData) {
        this.A02.A0F(rewardData);
    }

    public final void A06(RewardedVideoAdListener rewardedVideoAdListener) {
        this.A01.A04 = rewardedVideoAdListener;
        this.A03.A0F().A3C(rewardedVideoAdListener != null);
        String[] strArr = A05;
        if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
            throw new RuntimeException();
        }
        A05[6] = "1SRpemADNZd8xb9i9fuLSYNF0AwY2Tu2";
    }

    public final void A07(String str, AdExperienceType adExperienceType, boolean z) {
        if (str == null) {
            this.A03.A0F().A3G();
        } else {
            C1828k1 c1828k1 = this.A03;
            if (A05[6].charAt(25) == 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "67CWYk6q7caxeYWX3cgidRuGJDEH";
            strArr[4] = "JzT9b8y5FiDfchRrDecE58hhFV9F";
            c1828k1.A0F().A3F();
        }
        this.A02.A0E(this.A00, str, adExperienceType, z);
        this.A03.A0F().A3E();
    }

    public final boolean A08(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        this.A03.A0F().A3P();
        boolean zA0I = this.A02.A0I(this.A00, rewardedVideoShowAdConfig);
        this.A03.A0F().A3O(zA0I);
        return zA0I;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void destroy() {
        AbstractC0606Au.A05(A00(136, 7, 47), A00(48, 27, 50), A00(16, 8, 88));
        A04();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A01.A0D;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final int getVideoDuration() {
        return this.A01.A00;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean zA0G = this.A02.A0G();
        this.A03.A0F().A5V(zA0G);
        return zA0G;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0H();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        AbstractC0606Au.A05(A00(Input.Keys.NUM_LOCK, 6, 44), A00(75, 32, 96), A00(24, 8, 30));
        A07(null, null, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAd(RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        ((C7E) rewardedVideoLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        if (this.A01.A04 != null) {
            this.A01.A04.onError(this.A00, new AdError(2001, A00(32, 16, 116) + AbstractC0637Cl.A03(this.A01.A0B, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A06 = extraHints.getHints();
        this.A01.A07 = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        AbstractC0606Au.A05(A00(Input.Keys.NUMPAD_5, 4, 108), A00(107, 29, 122), A00(8, 8, 38));
        return A08(new C7F().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean show(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        AbstractC0606Au.A05(A00(Input.Keys.NUMPAD_5, 4, 108), A00(107, 29, 122), A00(0, 8, 64));
        return A08(rewardedVideoShowAdConfig);
    }
}
