package jj;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements j, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f43940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wi.b f43941c;

    public /* synthetic */ f(ArrayList arrayList, wi.b bVar, int i10) {
        this.f43939a = i10;
        this.f43940b = arrayList;
        this.f43941c = bVar;
    }

    @Override // jj.j
    public void a(Object obj) {
        switch (this.f43939a) {
            case 0:
                ArrayList arrayList = this.f43940b;
                arrayList.add(0, (l) obj);
                this.f43941c.e(arrayList);
                break;
            default:
                ArrayList arrayList2 = this.f43940b;
                arrayList2.add(0, (String) obj);
                this.f43941c.e(arrayList2);
                break;
        }
    }

    @Override // jj.j, jj.m
    public void b(e eVar) {
        switch (this.f43939a) {
            case 0:
                this.f43941c.e(d0.c.U(eVar));
                break;
            case 1:
                this.f43941c.e(d0.c.U(eVar));
                break;
            default:
                this.f43941c.e(d0.c.U(eVar));
                break;
        }
    }

    @Override // jj.m
    public void c() {
        ArrayList arrayList = this.f43940b;
        arrayList.add(0, null);
        this.f43941c.e(arrayList);
    }

    public void d(mj.g gVar) {
        ArrayList arrayList = this.f43940b;
        arrayList.add(0, gVar);
        this.f43941c.e(arrayList);
    }
}
