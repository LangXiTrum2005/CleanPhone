package oj;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Set f47511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f47512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Iterator f47513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w0.d f47514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f47515j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f47516k;
    public final /* synthetic */ z l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f47517m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z zVar, ck.c cVar) {
        super(cVar);
        this.l = zVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f47516k = obj;
        this.f47517m |= Integer.MIN_VALUE;
        return z.e(this.l, null, this);
    }
}
