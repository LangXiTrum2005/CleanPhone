package t1;

import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import l1.y;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1.p f50388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f50389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f50390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f50391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f50392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f50393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f50394g;

    public m(i1.p pVar, List list, s sVar, List list2, List list3, List list4) {
        go.k.i(!list.isEmpty());
        this.f50388a = pVar;
        this.f50389b = j0.x(list);
        this.f50391d = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f50392e = list3;
        this.f50393f = list4;
        this.f50394g = sVar.a(this);
        long j10 = sVar.f50410c;
        long j11 = sVar.f50409b;
        String str = y.f44830a;
        this.f50390c = y.U(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract s1.g b();

    public abstract j c();
}
