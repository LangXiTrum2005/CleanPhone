package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qc extends p4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc(String str, int i10) {
        super(str);
        this.f23895c = i10;
    }

    @Override // com.google.android.gms.internal.measurement.p4
    public final b6 a(d8 d8Var, List list) {
        switch (this.f23895c) {
            case 0:
                return b6.S8;
            case 1:
            case 2:
                return this;
            case 3:
                return new o3(Double.valueOf(0.0d));
            default:
                return b6.S8;
        }
    }
}
