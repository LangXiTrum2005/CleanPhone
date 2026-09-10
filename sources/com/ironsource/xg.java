package com.ironsource;

import com.ironsource.AbstractC0401j3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Xg<Smash extends AbstractC0401j3<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ch<Smash> f27949a;

    public Xg(ch<Smash> smashPicker) {
        kotlin.jvm.internal.n.f(smashPicker, "smashPicker");
        this.f27949a = smashPicker;
    }

    public final List<Smash> a() {
        return this.f27949a.c();
    }

    public final boolean b() {
        return this.f27949a.c().isEmpty() && this.f27949a.a().isEmpty();
    }

    public final boolean c() {
        return this.f27949a.d() == 0;
    }
}
