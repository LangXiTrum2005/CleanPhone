package e2;

import i1.l0;
import i1.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f39042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b[] f39043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f39044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f39045h;

    public c(int i10, int i11, long j10, long j11, int i12, boolean z10, a aVar, b[] bVarArr) {
        this.f39038a = i10;
        this.f39039b = i11;
        this.f39044g = j10;
        this.f39045h = j11;
        this.f39040c = i12;
        this.f39041d = z10;
        this.f39042e = aVar;
        this.f39043f = bVarArr;
    }

    @Override // a2.a
    public final Object copy(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            l0 l0Var = (l0) arrayList.get(i10);
            b bVar2 = this.f39043f[l0Var.f42575b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.a((p[]) arrayList3.toArray(new p[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f39032j[l0Var.f42576c]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((p[]) arrayList3.toArray(new p[0])));
        }
        return new c(this.f39038a, this.f39039b, this.f39044g, this.f39045h, this.f39040c, this.f39041d, this.f39042e, (b[]) arrayList2.toArray(new b[0]));
    }
}
