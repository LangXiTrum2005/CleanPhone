package vd;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f52557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f52558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f52559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f52560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f52561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f52562k;
    public final /* synthetic */ c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f52563m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ck.c cVar2) {
        super(cVar2);
        this.l = cVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f52562k = obj;
        this.f52563m |= Integer.MIN_VALUE;
        return this.l.b(this);
    }
}
