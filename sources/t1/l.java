package t1;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import oa.j0;
import qj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f50386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x f50387i;

    public l(i1.p pVar, j0 j0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(pVar, j0Var, rVar, arrayList, list, list2);
        Uri.parse(((b) j0Var.get(0)).f50335a);
        long j10 = rVar.f50407e;
        j jVar = j10 <= 0 ? null : new j(null, rVar.f50406d, j10);
        this.f50386h = jVar;
        this.f50387i = jVar == null ? new x(new j(null, 0L, -1L), 8) : null;
    }

    @Override // t1.m
    public final String a() {
        return null;
    }

    @Override // t1.m
    public final s1.g b() {
        return this.f50387i;
    }

    @Override // t1.m
    public final j c() {
        return this.f50386h;
    }
}
