package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wg0 extends lj1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg0(gd0 gd0Var, b30 b30Var, int i10) {
        super((Object) gd0Var, false, (Object) b30Var, 17);
        this.f21511d = i10;
    }

    @Override // com.google.android.gms.internal.ads.lj1
    public Set o(m90 m90Var) {
        switch (this.f21511d) {
            case 1:
                return Collections.EMPTY_SET;
            default:
                return super.o(m90Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.lj1
    public Set p(m90 m90Var) {
        switch (this.f21511d) {
            case 1:
                return Collections.EMPTY_SET;
            default:
                return super.p(m90Var);
        }
    }
}
