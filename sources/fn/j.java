package fn;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f41091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f41093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f41094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Serializable f41095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41096k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ak.f fVar) {
        super(fVar);
        this.f41093h = kVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41091f = obj;
        this.f41092g |= Integer.MIN_VALUE;
        return this.f41093h.collect(null, this);
    }
}
