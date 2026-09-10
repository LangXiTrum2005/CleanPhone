package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9t, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class C9t extends Timeline {
    public final Timeline A00;

    public C9t(Timeline timeline) {
        this.A00 = timeline;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return this.A00.A06();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return this.A00.A07();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A08(int i2, int i3, boolean z2) {
        return this.A00.A08(i2, i3, z2);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A0A(Object obj) {
        return this.A00.A0A(obj);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z2) {
        return this.A00.A0B(z2);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0C(boolean z2) {
        return this.A00.A0C(z2);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C2827pl A0I(int i2, C2827pl c2827pl, boolean z2) {
        return this.A00.A0I(i2, c2827pl, z2);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C2825pj A0L(int i2, C2825pj c2825pj, long j) {
        return this.A00.A0L(i2, c2825pj, j);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public Object A0M(int i2) {
        return this.A00.A0M(i2);
    }
}
