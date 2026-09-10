package vg;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52595c;

    public /* synthetic */ e(int i10, int i11, int i12) {
        this.f52593a = i12;
        this.f52594b = i10;
        this.f52595c = i11;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x017f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // com.bumptech.glide.c
    public final Object I(ck.c cVar) {
        d dVar;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        h hVar;
        String str2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str3;
        i iVar;
        String str4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        switch (this.f52593a) {
            case 0:
                if (cVar instanceof d) {
                    dVar = (d) cVar;
                    int i10 = dVar.f52592k;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        dVar.f52592k = i10 - Integer.MIN_VALUE;
                    } else {
                        dVar = new d(this, cVar);
                    }
                } else {
                    dVar = new d(this, cVar);
                }
                Object obj = dVar.f52590i;
                int i11 = dVar.f52592k;
                if (i11 == 0) {
                    t9.e.z(obj);
                    ArrayList arrayList7 = new ArrayList();
                    dVar.f52587f = arrayList7;
                    dVar.f52588g = arrayList7;
                    str = "session_count";
                    dVar.f52589h = "session_count";
                    dVar.f52592k = 1;
                    Object objB = jh.h.b(dVar);
                    bk.a aVar = bk.a.f5708a;
                    if (objB == aVar) {
                        return aVar;
                    }
                    arrayList = arrayList7;
                    obj = objB;
                    arrayList2 = arrayList;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = dVar.f52589h;
                    arrayList = dVar.f52588g;
                    arrayList2 = dVar.f52587f;
                    t9.e.z(obj);
                }
                arrayList.add(new b(str, new c((Integer) obj, null, 6)));
                arrayList2.add(new b("assetCount", new c(new Integer(this.f52594b), null, 6)));
                arrayList2.add(new b("groupCount", new c(new Integer(this.f52595c), null, 6)));
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                return new a("duplicate_count", arrayList2);
            case 1:
                if (cVar instanceof h) {
                    hVar = (h) cVar;
                    int i12 = hVar.f52608k;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        hVar.f52608k = i12 - Integer.MIN_VALUE;
                    } else {
                        hVar = new h(this, cVar);
                    }
                } else {
                    hVar = new h(this, cVar);
                }
                Object obj2 = hVar.f52606i;
                int i13 = hVar.f52608k;
                if (i13 == 0) {
                    t9.e.z(obj2);
                    ArrayList arrayList8 = new ArrayList();
                    hVar.f52603f = arrayList8;
                    hVar.f52604g = arrayList8;
                    str2 = "session_count";
                    hVar.f52605h = "session_count";
                    hVar.f52608k = 1;
                    Object objB2 = jh.h.b(hVar);
                    bk.a aVar2 = bk.a.f5708a;
                    if (objB2 == aVar2) {
                        return aVar2;
                    }
                    arrayList3 = arrayList8;
                    obj2 = objB2;
                    arrayList4 = arrayList3;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = hVar.f52605h;
                    arrayList3 = hVar.f52604g;
                    arrayList4 = hVar.f52603f;
                    t9.e.z(obj2);
                }
                arrayList3.add(new b(str2, new c((Integer) obj2, null, 6)));
                int i14 = this.f52594b;
                arrayList4.add(new b("assetCount", new c(new Integer(i14), null, 6)));
                arrayList4.add(new b("groupCount", new c(new Integer(this.f52595c), null, 6)));
                if (i14 <= 100) {
                    str3 = "similar_count_100";
                } else if (i14 <= 500) {
                    str3 = "similar_count_500";
                } else if (i14 <= 750) {
                    str3 = "similar_count_750";
                } else if (i14 <= 1000) {
                    str3 = "similar_count_1000";
                } else if (i14 <= 2000) {
                    str3 = "similar_count_2000";
                } else {
                    str3 = i14 <= 5000 ? "similar_count_5000" : "similar_count_5000+";
                }
                if (arrayList4.isEmpty()) {
                    arrayList4 = null;
                }
                return new a(str3, arrayList4);
            default:
                if (cVar instanceof i) {
                    iVar = (i) cVar;
                    int i15 = iVar.f52614k;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        iVar.f52614k = i15 - Integer.MIN_VALUE;
                    } else {
                        iVar = new i(this, cVar);
                    }
                } else {
                    iVar = new i(this, cVar);
                }
                Object obj3 = iVar.f52612i;
                int i16 = iVar.f52614k;
                if (i16 == 0) {
                    t9.e.z(obj3);
                    ArrayList arrayList9 = new ArrayList();
                    iVar.f52609f = arrayList9;
                    iVar.f52610g = arrayList9;
                    str4 = "session_count";
                    iVar.f52611h = "session_count";
                    iVar.f52614k = 1;
                    Object objB3 = jh.h.b(iVar);
                    bk.a aVar3 = bk.a.f5708a;
                    if (objB3 == aVar3) {
                        return aVar3;
                    }
                    arrayList5 = arrayList9;
                    obj3 = objB3;
                    arrayList6 = arrayList5;
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = iVar.f52611h;
                    arrayList5 = iVar.f52610g;
                    arrayList6 = iVar.f52609f;
                    t9.e.z(obj3);
                }
                arrayList5.add(new b(str4, new c((Integer) obj3, null, 6)));
                arrayList6.add(new b("assetCount", new c(new Integer(this.f52594b), null, 6)));
                arrayList6.add(new b("groupCount", new c(new Integer(this.f52595c), null, 6)));
                if (arrayList6.isEmpty()) {
                    arrayList6 = null;
                }
                return new a("similar_count", arrayList6);
        }
    }
}
