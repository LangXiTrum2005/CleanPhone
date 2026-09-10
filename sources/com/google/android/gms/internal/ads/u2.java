package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u2 implements h81 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ u2 f20596b = new u2(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u2 f20597c = new u2(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u2 f20598d = new u2(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u2 f20599e = new u2(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u2 f20600f = new u2(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20601a;

    public /* synthetic */ u2(int i10) {
        this.f20601a = i10;
    }

    @Override // com.google.android.gms.internal.ads.h81
    public final /* synthetic */ boolean zza(Object obj) {
        switch (this.f20601a) {
            case 0:
                z4 z4Var = (z4) obj;
                return z4Var.f22488b.equals("com.apple.iTunes") && z4Var.f22489c.equals("iTunSMPB");
            case 1:
                return ((v4) obj).f21018c.equals("iTunSMPB");
            case 2:
                int i10 = r6.G;
                return !(((v7) obj) instanceof k4);
            case 3:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
