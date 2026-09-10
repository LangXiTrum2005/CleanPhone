package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2537nm implements DT, DU {
    public final int A00;
    public final /* synthetic */ C10549p A01;

    public C2537nm(C10549p c10549p, int i) {
        this.A01 = c10549p;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.DU
    @MetaExoPlayerCustomization("Added in D21840558 for FBVP")
    public final long A89() {
        return this.A01.A0L[this.A00].A0S();
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final boolean AAe() {
        return this.A01.A0f(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final void ACR() throws IOException {
        this.A01.A0d(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final int AHP(C09946z c09946z, C2612p0 c2612p0, int i) {
        return this.A01.A0Y(this.A00, c09946z, c2612p0, i);
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final int AK2(long j) {
        return this.A01.A0X(this.A00, j);
    }
}
