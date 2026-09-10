package co;

import bo.i;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import xn.s;
import xn.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f6795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bo.e f6798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f6799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6803i;

    public g(i iVar, ArrayList arrayList, int i10, bo.e eVar, s sVar, int i11, int i12, int i13) {
        this.f6795a = iVar;
        this.f6796b = arrayList;
        this.f6797c = i10;
        this.f6798d = eVar;
        this.f6799e = sVar;
        this.f6800f = i11;
        this.f6801g = i12;
        this.f6802h = i13;
    }

    public static g a(g gVar, int i10, bo.e eVar, s sVar, int i11) {
        if ((i11 & 1) != 0) {
            i10 = gVar.f6797c;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            eVar = gVar.f6798d;
        }
        bo.e eVar2 = eVar;
        if ((i11 & 4) != 0) {
            sVar = gVar.f6799e;
        }
        s request = sVar;
        int i13 = gVar.f6800f;
        int i14 = gVar.f6801g;
        int i15 = gVar.f6802h;
        n.f(request, "request");
        return new g(gVar.f6795a, gVar.f6796b, i12, eVar2, request, i13, i14, i15);
    }

    public final w b(s request) {
        n.f(request, "request");
        ArrayList arrayList = this.f6796b;
        int size = arrayList.size();
        int i10 = this.f6797c;
        if (i10 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f6803i++;
        bo.e eVar = this.f6798d;
        if (eVar != null) {
            if (!((b2.a) eVar.f5778c).d(request.f54060a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must retain the same host and port").toString());
            }
            if (this.f6803i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i11 = i10 + 1;
        g gVarA = a(this, i11, null, request, 58);
        xn.n nVar = (xn.n) arrayList.get(i10);
        w wVarA = nVar.a(gVarA);
        if (wVarA == null) {
            throw new NullPointerException("interceptor " + nVar + " returned null");
        }
        if (eVar != null && i11 < arrayList.size() && gVarA.f6803i != 1) {
            throw new IllegalStateException(("network interceptor " + nVar + " must call proceed() exactly once").toString());
        }
        if (wVarA.f54087g != null) {
            return wVarA;
        }
        throw new IllegalStateException(("interceptor " + nVar + " returned a response with no body").toString());
    }
}
