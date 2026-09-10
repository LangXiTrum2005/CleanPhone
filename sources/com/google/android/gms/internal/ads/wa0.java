package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wa0 extends mu1 implements fq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f21477c;

    public wa0(Set set) {
        super(set);
        this.f21477c = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.fq
    public final synchronized void Q(Bundle bundle, String str) {
        this.f21477c.putAll(bundle);
        S0(jq.f16146q);
    }
}
