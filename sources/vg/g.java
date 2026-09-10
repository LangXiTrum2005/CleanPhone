package vg;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f52602a;

    public g(boolean z10) {
        this.f52602a = z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bumptech.glide.c
    public final Object I(ck.c cVar) {
        f fVar;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f52601k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f52601k = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.f52599i;
        int i11 = fVar.f52601k;
        if (i11 == 0) {
            t9.e.z(obj);
            ArrayList arrayList3 = new ArrayList();
            fVar.f52596f = arrayList3;
            fVar.f52597g = arrayList3;
            str = "session_count";
            fVar.f52598h = "session_count";
            fVar.f52601k = 1;
            Object objB = jh.h.b(fVar);
            bk.a aVar = bk.a.f5708a;
            if (objB == aVar) {
                return aVar;
            }
            arrayList = arrayList3;
            obj = objB;
            arrayList2 = arrayList;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = fVar.f52598h;
            arrayList = fVar.f52597g;
            arrayList2 = fVar.f52596f;
            t9.e.z(obj);
        }
        arrayList.add(new b(str, new c((Integer) obj, null, 6)));
        arrayList2.add(new b("is_starts_from_zero", new c(null, this.f52602a ? com.ironsource.mediationsdk.metadata.a.f29610g : "false", 5)));
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        return new a("scan_start", arrayList2);
    }
}
