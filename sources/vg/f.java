package vg;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f52596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f52597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f52598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f52599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f52600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f52601k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ck.c cVar) {
        super(cVar);
        this.f52600j = gVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f52599i = obj;
        this.f52601k |= Integer.MIN_VALUE;
        return this.f52600j.I(this);
    }
}
