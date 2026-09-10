package jh;

import fn.i0;
import fn.k;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements fn.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f43868b;

    public c(k kVar, int i10) {
        this.f43867a = i10;
        switch (i10) {
            case 1:
                this.f43868b = kVar;
                break;
            default:
                this.f43868b = kVar;
                break;
        }
    }

    @Override // fn.e
    public final Object collect(fn.f fVar, ak.f fVar2) {
        switch (this.f43867a) {
            case 0:
                Object objCollect = this.f43868b.collect(new i0(fVar, 1), fVar2);
                return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
            default:
                Object objCollect2 = this.f43868b.collect(new i0(fVar, 2), fVar2);
                return objCollect2 == bk.a.f5708a ? objCollect2 : r.f53297a;
        }
    }
}
