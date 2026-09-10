package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC04695e implements Q7 {
    public static String[] A04 = {"fLYU2h24", "9T4qb1qE9o6dnVNtHPl", "zY5ZDb2sbw0139lkg7uH6SCOm1GEdGJk", "SQmgC0k", "PIGC6h1HUYcT20GPRTJ9YIzsPGu64fVc", "dGx6LmnB", "p3Z2jT6dJCg95M7HEtd", "pxFVIGI1dYV2V3Xr7fehvfwfTSh7RjKF"};
    public int A00;
    public C1447dj A01;
    public final ArrayList<InterfaceC1486eN> A02 = new ArrayList<>(1);
    public final boolean A03;

    @Override // com.facebook.ads.redexgen.core.Q7
    public /* synthetic */ Map A8j() {
        return AbstractC1436dY.A00(this);
    }

    public AbstractC04695e(boolean z) {
        this.A03 = z;
    }

    @MetaExoPlayerCustomization
    private final void A0D(C1447dj c1447dj, boolean z) {
        this.A01 = c1447dj;
        for (int i = 0; i < i; i++) {
            this.A02.get(i).AFP(this, c1447dj, this.A03, z);
        }
    }

    public final void A0E() {
        C1447dj c1447dj = (C1447dj) AbstractC1600gE.A0f(this.A01);
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i).AFO(this, c1447dj, this.A03);
        }
        this.A01 = null;
        if (A04[3].length() != 7) {
            throw new RuntimeException();
        }
        A04[4] = "n18HKcosmY2oFn2TeOIyDIR1JJ5fEniA";
    }

    public final void A0F(int i) {
        C1447dj c1447dj = (C1447dj) AbstractC1600gE.A0f(this.A01);
        for (int i2 = 0; i2 < this.A00; i2++) {
            this.A02.get(i2).ACZ(this, c1447dj, this.A03, i);
        }
    }

    public final void A0G(C1447dj c1447dj) {
        for (int i = 0; i < i; i++) {
            this.A02.get(i);
        }
    }

    public final void A0H(C1447dj c1447dj) {
        A0D(c1447dj, false);
    }

    @Override // com.facebook.ads.redexgen.core.Q7
    public final void A3t(InterfaceC1486eN interfaceC1486eN) {
        AbstractC1517es.A01(interfaceC1486eN);
        if (!this.A02.contains(interfaceC1486eN)) {
            this.A02.add(interfaceC1486eN);
            this.A00++;
        }
    }
}
