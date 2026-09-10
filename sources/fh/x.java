package fh;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Set f40940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f40941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f40942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f40943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40944j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, ck.c cVar) {
        super(cVar);
        this.f40943i = zVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f40942h = obj;
        this.f40944j |= Integer.MIN_VALUE;
        return this.f40943i.b(null, this);
    }
}
