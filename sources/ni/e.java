package ni;

import android.content.Context;
import com.google.android.gms.internal.ads.sr0;
import com.ironsource.X3;
import io.flutter.plugin.platform.n;
import java.util.ArrayList;
import java.util.List;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46762a = new ArrayList();

    public e(Context context, String[] strArr) {
        ri.d dVar = (ri.d) v9.e.F().f52503b;
        if (dVar.f49600a) {
            return;
        }
        dVar.d(context.getApplicationContext());
        dVar.a(context.getApplicationContext(), strArr);
    }

    public final c a(sr0 sr0Var) {
        c cVar;
        Context context = (Context) sr0Var.f20039c;
        oi.a aVar = (oi.a) sr0Var.f20042f;
        String str = (String) sr0Var.f20040d;
        List<String> list = (List) sr0Var.f20041e;
        n nVar = new n();
        boolean z10 = sr0Var.f20037a;
        boolean z11 = sr0Var.f20038b;
        if (aVar == null) {
            ri.d dVar = (ri.d) v9.e.F().f52503b;
            if (!dVar.f49600a) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            aVar = new oi.a((String) dVar.f49603d.f5778c, X3.i.Z);
        }
        ArrayList arrayList = this.f46762a;
        if (arrayList.size() == 0) {
            cVar = new c(context, null, nVar, z10, z11);
            if (str != null) {
                ((p) cVar.f46745i.f49529b).a("setInitialRoute", str, null);
            }
            cVar.f46739c.d(aVar, list);
        } else {
            c cVar2 = (c) arrayList.get(0);
            if (!cVar2.f46737a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            cVar = new c(context, cVar2.f46737a.spawn(aVar.f47434c, aVar.f47433b, str, list, c.f46735y), nVar, z10, z11);
        }
        arrayList.add(cVar);
        cVar.f46757v.add(new d(this, cVar));
        return cVar;
    }
}
