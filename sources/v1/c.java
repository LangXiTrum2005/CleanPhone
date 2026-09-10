package v1;

import i1.d0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f52300c = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j2.n f52301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f52302b;

    public static void a(ArrayList arrayList, int i10) {
        if (com.bumptech.glide.c.v(f52300c, i10, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(Integer.valueOf(i10));
    }

    public final i1.p b(i1.p pVar) {
        if (!this.f52302b || !this.f52301a.a(pVar)) {
            return pVar;
        }
        i1.o oVarA = pVar.a();
        String str = pVar.f42641k;
        oVarA.f42600m = d0.n("application/x-media3-cues");
        oVarA.K = this.f52301a.h(pVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(pVar.f42643n);
        sb2.append(str != null ? " ".concat(str) : "");
        oVarA.f42598j = sb2.toString();
        oVarA.f42605r = Long.MAX_VALUE;
        return new i1.p(oVarA);
    }
}
