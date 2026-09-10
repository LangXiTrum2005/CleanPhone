package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x22 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y22 f21717a;

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        HashMap map = z22.f22480a;
        y22 y22Var = this.f21717a;
        return y22Var.zza(obj2) - y22Var.zza(obj);
    }
}
