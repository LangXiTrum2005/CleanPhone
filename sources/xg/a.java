package xg;

import xi.g;
import xi.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f53793a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static g f53794b;

    @Override // xi.h
    public final void g(g gVar) {
        f53794b = gVar;
    }

    @Override // xi.h
    public final void onCancel() {
        f53794b = null;
    }
}
