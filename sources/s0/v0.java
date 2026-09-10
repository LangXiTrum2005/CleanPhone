package s0;

import java.io.FileInputStream;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ln.c f49923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FileInputStream f49924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileLock f49925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f49926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f49927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w0 f49928k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, ck.c cVar) {
        super(cVar);
        this.f49928k = w0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f49927j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f49928k.d(null, this);
    }
}
