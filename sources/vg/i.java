package vg;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f52609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f52610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f52611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f52612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f52613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f52614k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, ck.c cVar) {
        super(cVar);
        this.f52613j = eVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f52612i = obj;
        this.f52614k |= Integer.MIN_VALUE;
        return this.f52613j.I(this);
    }
}
