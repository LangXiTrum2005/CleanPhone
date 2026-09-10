package o4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f47128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f47129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f47131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f47132e;

    public l(n nVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f47132e = nVar;
        this.f47128a = obj;
        this.f47129b = arrayList;
        this.f47130c = obj2;
        this.f47131d = arrayList2;
    }

    @Override // o4.q
    public final void c(r rVar) {
        rVar.v(this);
    }

    @Override // o4.s, o4.q
    public final void e(r rVar) {
        n nVar = this.f47132e;
        Object obj = this.f47128a;
        if (obj != null) {
            nVar.t(obj, this.f47129b, null);
        }
        Object obj2 = this.f47130c;
        if (obj2 != null) {
            nVar.t(obj2, this.f47131d, null);
        }
    }
}
