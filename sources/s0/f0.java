package s0;

import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f49800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FileInputStream f49801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f49802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g0 f49803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f49804j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, ck.c cVar) {
        super(cVar);
        this.f49803i = g0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f49802h = obj;
        this.f49804j |= Integer.MIN_VALUE;
        return g0.a(this.f49803i, this);
    }
}
