package eh;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f40089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f40090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public dh.b f40091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f40092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f40093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40094k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, ck.c cVar) {
        super(cVar);
        this.f40093j = mVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f40092i = obj;
        this.f40094k |= Integer.MIN_VALUE;
        return this.f40093j.a(null, this);
    }
}
