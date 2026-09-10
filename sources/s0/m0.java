package s0;

import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FileOutputStream f49862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FileOutputStream f49863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f49864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0 f49865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f49866j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, ck.c cVar) {
        super(cVar);
        this.f49865i = n0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f49864h = obj;
        this.f49866j |= Integer.MIN_VALUE;
        return this.f49865i.b(null, this);
    }
}
