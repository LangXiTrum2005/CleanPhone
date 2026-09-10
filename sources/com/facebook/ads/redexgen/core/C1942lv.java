package com.facebook.ads.redexgen.core;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.protocol.AdPlacementType;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1942lv implements C3G {
    public static byte[] A0A;
    public static final String A0B;
    public long A02;
    public RewardedVideoAd A03;
    public C2S A04;
    public C0885Ma A05;
    public final C1828k1 A07;
    public final S2SRewardedVideoAdExtendedListener A08;
    public final C1929li A09;
    public int A00 = 0;
    public boolean A06 = false;
    public long A01 = -1;

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0A = new byte[]{116, -95, 83, -108, -105, 83, -97, -94, -108, -105, 83, -100, -90, 83, -108, -97, -91, -104, -108, -105, -84, 83, -100, -95, 83, -93, -91, -94, -102, -91, -104, -90, -90, 97, 83, -116, -94, -88, 83, -90, -101, -94, -88, -97, -105, 83, -86, -108, -100, -89, 83, -103, -94, -91, 83, -108, -105, 127, -94, -108, -105, -104, -105, 91, 92, 83, -89, -94, 83, -107, -104, 83, -106, -108, -97, -97, -104, -105, -60, -15, -15, -18, -15, -97, -21, -18, -32, -29, -24, -19, -26, -97, -15, -28, -10, -32, -15, -29, -28, -29, -97, -11, -24, -29, -28, -18, -97, -32, -29, -19, -4, -11};
    }

    static {
        A0A();
        A0B = C1942lv.class.getSimpleName();
    }

    public C1942lv(C1929li c1929li, C3W c3w, String str) {
        this.A09 = c1929li;
        this.A07 = c1929li.A0B;
        this.A08 = new C1926lf(str, c3w, this, c1929li);
    }

    private void A0C(String str, AdExperienceType adExperienceType, boolean z) {
        String extraHints;
        if (!this.A06 && this.A05 != null) {
            Log.w(A0B, A09(0, 78, 37));
        }
        A0D(false);
        this.A06 = false;
        AnonymousClass37 anonymousClass37 = new AnonymousClass37(this.A09.A0D, EnumC0601Al.A07, AdPlacementType.REWARDED_VIDEO, EnumC0599Aj.A08, 1, this.A09.A0C);
        anonymousClass37.A08(z);
        if (C05789m.A2W(this.A07) && (extraHints = C6.A02(this.A07, this.A09.A06)) != null) {
            this.A09.A06 = extraHints;
        }
        anonymousClass37.A06(this.A09.A06);
        anonymousClass37.A07(this.A09.A07);
        this.A05 = new C0885Ma(this.A09.A0B, anonymousClass37);
        this.A05.A0S(new C1944lx(this));
        this.A05.A0X(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z) {
        if (this.A05 != null) {
            this.A05.A0S(new C1943lw(this));
            this.A05.A0Y(z);
            this.A05.A0K();
            this.A05 = null;
        }
    }

    public final long A0F() {
        if (this.A05 != null) {
            return this.A05.A0G();
        }
        return -1L;
    }

    public final C1929li A0G() {
        return this.A09;
    }

    public final C1828k1 A0H() {
        return this.A07;
    }

    public final void A0I(RewardData rewardData) {
        this.A09.A03 = rewardData;
        if (this.A06 && this.A05 != null) {
            this.A05.A0a(rewardData);
        }
    }

    public final void A0J(String str, AdExperienceType adExperienceType, boolean z) {
        this.A01 = System.currentTimeMillis();
        try {
            A0C(str, adExperienceType, z);
        } catch (Exception e) {
            Log.e(A0B, A09(78, 31, 113), e);
            this.A09.A0B.A08().AAu(A09(109, 3, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), AbstractC05418a.A0b, new C05428b(e));
            AdError adErrorInternalError = AdError.internalError(2004);
            this.A09.A0B.A0F().A3D(C0646Cu.A01(this.A01), adErrorInternalError.getErrorCode(), adErrorInternalError.getErrorMessage());
            this.A08.onError(this.A09.A6a(), adErrorInternalError);
        }
    }

    public final boolean A0K() {
        return this.A05 == null || this.A05.A0Z();
    }

    public final boolean A0L() {
        return this.A06;
    }

    public final boolean A0M(int i, long j) {
        if (!this.A06) {
            this.A08.onError(this.A09.A6a(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        }
        if (this.A05 != null) {
            this.A02 = System.currentTimeMillis();
            this.A05.A08.A02(i);
            this.A05.A08.A03(j);
            this.A05.A0M();
            this.A06 = false;
            return true;
        }
        this.A06 = false;
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.C3G
    public final void destroy() {
        A0D(true);
    }
}
