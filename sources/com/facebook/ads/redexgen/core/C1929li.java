package com.facebook.ads.redexgen.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1929li implements AnonymousClass81 {
    public int A00 = -1;
    public long A01 = -1;
    public AdExperienceType A02;
    public RewardData A03;
    public RewardedVideoAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public Ad A09;
    public WeakReference<Ad> A0A;
    public final C1828k1 A0B;
    public final AnonymousClass90 A0C;
    public final String A0D;

    public C1929li(C1828k1 c1828k1, String str, Ad ad, AnonymousClass90 anonymousClass90) {
        this.A0B = c1828k1;
        this.A0D = str;
        this.A09 = ad;
        this.A0A = new WeakReference<>(ad);
        this.A0C = anonymousClass90;
        c1828k1.A0N(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass81
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final RewardedVideoAdListener A6e() {
        return this.A04;
    }

    public final C1828k1 A01() {
        return this.A0B;
    }

    public final void A02(Ad ad) {
        if (ad == null && !C05789m.A0t(this.A0B)) {
            return;
        }
        this.A09 = ad;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass81
    public final Ad A6a() {
        return this.A09 != null ? this.A09 : this.A0A.get();
    }
}
