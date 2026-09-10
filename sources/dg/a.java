package dg;

import com.google.android.gms.internal.ads.j30;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.n;
import tn.g;
import wf.h;
import wf.i;
import xj.b0;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements jk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38850c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f38848a = i10;
        this.f38849b = obj;
        this.f38850c = obj2;
    }

    @Override // jk.a
    public final Object invoke() {
        String[] strArrNames;
        switch (this.f38848a) {
            case 0:
                d this$0 = (d) this.f38849b;
                vf.c cVar = (vf.c) this.f38850c;
                n.f(this$0, "this$0");
                j30 j30Var = this$0.f38863i;
                return Boolean.valueOf(((Number) ((i) j30Var.f15951e).l(cVar)).longValue() > j30Var.a() + 100);
            case 1:
                pn.d dVar = (pn.d) this.f38849b;
                sn.b bVar = (sn.b) this.f38850c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                bVar.f50283a.getClass();
                g.e(dVar, bVar);
                int iD = dVar.d();
                for (int i10 = 0; i10 < iD; i10++) {
                    List listF = dVar.f(i10);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listF) {
                        if (obj instanceof sn.d) {
                            arrayList.add(obj);
                        }
                    }
                    sn.d dVar2 = (sn.d) xj.n.H0(arrayList);
                    if (dVar2 != null && (strArrNames = dVar2.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = n.a(dVar.getKind(), pn.e.f48502f) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                String message = "The suggested name '" + str + "' for " + str2 + ' ' + dVar.e(i10) + " is already one of the names for " + str2 + ' ' + dVar.e(((Number) b0.M(str, linkedHashMap)).intValue()) + " in " + dVar;
                                n.f(message, "message");
                                throw new nn.d(message);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i10));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? w.f53867a : linkedHashMap;
            default:
                h hVar = (h) this.f38849b;
                h hVar2 = (h) this.f38850c;
                long j10 = hVar == null ? 0L : hVar.f53204e + 1;
                hVar2.f53200a.a("Found output base timestamp: " + j10);
                return Long.valueOf(j10);
        }
    }
}
