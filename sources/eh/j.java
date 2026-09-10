package eh;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f40081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ch.c f40082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Iterator f40083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f40084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f40085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f40086k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ck.c cVar) {
        super(cVar);
        this.f40086k = kVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f40085j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f40086k.e(null, this);
    }
}
