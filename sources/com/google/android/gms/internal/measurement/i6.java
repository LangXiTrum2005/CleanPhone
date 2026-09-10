package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i6 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p4 f23574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d8 f23575b;

    public i6(p4 p4Var, d8 d8Var) {
        this.f23574a = p4Var;
        this.f23575b = d8Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        b6 b6Var = (b6) obj;
        b6 b6Var2 = (b6) obj2;
        if (b6Var instanceof f6) {
            return !(b6Var2 instanceof f6) ? 1 : 0;
        }
        if (b6Var2 instanceof f6) {
            return -1;
        }
        p4 p4Var = this.f23574a;
        return p4Var == null ? b6Var.zzc().compareTo(b6Var2.zzc()) : (int) yg.l(p4Var.a(this.f23575b, Arrays.asList(b6Var, b6Var2)).zzd().doubleValue());
    }
}
