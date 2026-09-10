package jh;

import kotlin.jvm.internal.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f43860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f43861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f43862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f43863i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, ck.c cVar) {
        super(cVar);
        this.f43862h = hVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f43861g = obj;
        this.f43863i |= Integer.MIN_VALUE;
        return this.f43862h.c(null, 0, this);
    }
}
