package vg;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f52587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f52588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f52589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f52590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f52591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f52592k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ck.c cVar) {
        super(cVar);
        this.f52591j = eVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f52590i = obj;
        this.f52592k |= Integer.MIN_VALUE;
        return this.f52591j.I(this);
    }
}
