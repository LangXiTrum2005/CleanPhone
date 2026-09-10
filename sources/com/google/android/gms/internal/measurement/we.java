package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class we extends p4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ab f24123e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(ab abVar, boolean z10, boolean z11) {
        super("log");
        this.f24123e = abVar;
        this.f24121c = z10;
        this.f24122d = z11;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1 A[LOOP:0: B:23:0x0097->B:25:0x00a1, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.p4
    public final b6 a(d8 d8Var, List list) {
        int i10;
        int i11;
        String strZzc;
        ArrayList arrayList;
        yg.f(1, "log", list);
        int size = list.size();
        f6 f6Var = b6.S8;
        ab abVar = this.f24123e;
        if (size == 1) {
            ((n5.f) abVar.f23300d).B(3, ((h6) d8Var.f23388c).e(d8Var, (b6) list.get(0)).zzc(), Collections.EMPTY_LIST, this.f24121c, this.f24122d);
            return f6Var;
        }
        b6 b6Var = (b6) list.get(0);
        h6 h6Var = (h6) d8Var.f23388c;
        h6 h6Var2 = (h6) d8Var.f23388c;
        int iK = yg.k(h6Var.e(d8Var, b6Var).zzd().doubleValue());
        if (iK != 2) {
            i10 = 3;
            if (iK == 3) {
                i11 = 1;
            } else if (iK == 5) {
                i11 = 5;
            } else if (iK == 6) {
                i11 = 2;
            }
            strZzc = h6Var2.e(d8Var, (b6) list.get(1)).zzc();
            if (list.size() == 2) {
                ((n5.f) abVar.f23300d).B(i11, strZzc, Collections.EMPTY_LIST, this.f24121c, this.f24122d);
                return f6Var;
            }
            arrayList = new ArrayList();
            for (int i12 = 2; i12 < Math.min(list.size(), 5); i12++) {
                arrayList.add(h6Var2.e(d8Var, (b6) list.get(i12)).zzc());
            }
            ((n5.f) abVar.f23300d).B(i11, strZzc, arrayList, this.f24121c, this.f24122d);
            return f6Var;
        }
        i10 = 4;
        i11 = i10;
        strZzc = h6Var2.e(d8Var, (b6) list.get(1)).zzc();
        if (list.size() == 2) {
            ((n5.f) abVar.f23300d).B(i11, strZzc, Collections.EMPTY_LIST, this.f24121c, this.f24122d);
            return f6Var;
        }
        arrayList = new ArrayList();
        while (i12 < Math.min(list.size(), 5)) {
            arrayList.add(h6Var2.e(d8Var, (b6) list.get(i12)).zzc());
        }
        ((n5.f) abVar.f23300d).B(i11, strZzc, arrayList, this.f24121c, this.f24122d);
        return f6Var;
    }
}
