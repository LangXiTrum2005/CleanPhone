package com.ironsource.mediationsdk;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractAdapter f29759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f29761d;

    public /* synthetic */ w(AbstractAdapter abstractAdapter, String str, List list, int i10) {
        this.f29758a = i10;
        this.f29759b = abstractAdapter;
        this.f29760c = str;
        this.f29761d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29758a) {
            case 0:
                c.a(this.f29759b, this.f29760c, this.f29761d);
                break;
            default:
                c.b(this.f29759b, this.f29760c, this.f29761d);
                break;
        }
    }
}
