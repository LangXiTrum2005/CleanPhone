package kh;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f44637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f44639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f44640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f44641j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ck.c cVar) {
        super(cVar);
        this.f44640i = eVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f44639h = obj;
        this.f44641j |= Integer.MIN_VALUE;
        return this.f44640i.e(null, null, this);
    }
}
