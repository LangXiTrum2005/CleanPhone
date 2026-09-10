package fh;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f40921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f40922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f40923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v f40924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40925j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, ck.c cVar) {
        super(cVar);
        this.f40924i = vVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f40923h = obj;
        this.f40925j |= Integer.MIN_VALUE;
        return this.f40924i.a(this);
    }
}
