package fm;

import cl.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import xj.p;
import xj.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ym.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f41013b = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41014a;

    public /* synthetic */ a(int i10) {
        this.f41014a = i10;
    }

    @Override // ym.a
    public final Iterable r(Object obj) {
        switch (this.f41014a) {
            case 0:
                int i10 = e.f41020a;
                Collection collectionF = ((x0) obj).f();
                ArrayList arrayList = new ArrayList(p.W(collectionF, 10));
                Iterator it = ((ArrayList) collectionF).iterator();
                while (it.hasNext()) {
                    arrayList.add(((x0) it.next()).a());
                }
                return arrayList;
            default:
                zk.c cVar = (zk.c) obj;
                Collection collectionF2 = cVar != null ? cVar.f() : null;
                return collectionF2 == null ? v.f53866a : collectionF2;
        }
    }
}
