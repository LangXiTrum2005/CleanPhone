package fh;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Set f40933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f40934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ln.a f40935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f40936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f40938k;
    public final /* synthetic */ z l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f40939m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, ck.c cVar) {
        super(cVar);
        this.l = zVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f40938k = obj;
        this.f40939m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
