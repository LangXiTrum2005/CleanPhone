package fh;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public dh.d f40851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinkedHashMap f40852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f40853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f40854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f40855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40856k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s sVar, ck.c cVar) {
        super(cVar);
        this.f40855j = sVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f40854i = obj;
        this.f40856k |= Integer.MIN_VALUE;
        return this.f40855j.m(null, null, this);
    }
}
