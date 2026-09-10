package bm;

import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends o implements jk.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zk.b f5724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zk.b f5725f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zk.b bVar, zk.b bVar2) {
        super(2);
        this.f5724e = bVar;
        this.f5725f = bVar2;
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(n.a((zk.j) obj, this.f5724e) && n.a((zk.j) obj2, this.f5725f));
    }
}
