package fh;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f40857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f40858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f40859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Set f40860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Iterator f40861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f40862k;
    public final /* synthetic */ s l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f40863m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s sVar, ck.c cVar) {
        super(cVar);
        this.l = sVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f40862k = obj;
        this.f40863m |= Integer.MIN_VALUE;
        return this.l.n(null, this);
    }
}
