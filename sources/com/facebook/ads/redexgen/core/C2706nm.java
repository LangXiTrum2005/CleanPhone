package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2706nm implements DT, DU {
    public final int A00;
    public final /* synthetic */ C12239p A01;

    public C2706nm(C12239p c12239p, int i2) {
        this.A01 = c12239p;
        this.A00 = i2;
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
    public final int AHP(C11636z c11636z, C2781p0 c2781p0, int i2) {
        return this.A01.A0Y(this.A00, c11636z, c2781p0, i2);
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final int AK2(long j) {
        return this.A01.A0X(this.A00, j);
    }
}
