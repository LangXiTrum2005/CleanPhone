package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lf implements ta.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23708a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ce f23709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23711d;

    public /* synthetic */ lf(ce ceVar, int i10, ArrayList arrayList) {
        this.f23709b = ceVar;
        this.f23711d = i10;
        this.f23710c = arrayList;
    }

    @Override // ta.z
    public final ListenableFuture apply(Object obj) {
        switch (this.f23708a) {
            case 0:
                int i10 = this.f23711d;
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    if (((Boolean) ta.k0.b((Future) this.f23710c.get(i11))).booleanValue()) {
                        ((List) this.f23709b.f23361b).get(i11).getClass();
                        throw new ClassCastException();
                    }
                }
                oa.j0 j0VarW = oa.j0.w(arrayList);
                l7.r rVar = new l7.r(2);
                ta.b0 b0Var = new ta.b0(j0VarW, true);
                b0Var.f50588n = new ta.a0(b0Var, rVar);
                b0Var.s();
                return b0Var;
            default:
                ArrayList arrayList2 = this.f23710c;
                oa.j0 j0VarW2 = oa.j0.w(arrayList2);
                h9.k kVar = new h9.k();
                ce ceVar = this.f23709b;
                kVar.f42287b = ceVar;
                kVar.f42288c = (l0) obj;
                kVar.f42286a = this.f23711d;
                kVar.f42289d = arrayList2;
                h6 h6VarA = tg.a(kVar);
                Executor executor = (Executor) ceVar.f23362c;
                ta.b0 b0Var2 = new ta.b0(j0VarW2, false);
                b0Var2.f50588n = new ta.a0(b0Var2, h6VarA, executor);
                b0Var2.s();
                return b0Var2;
        }
    }

    public /* synthetic */ lf(ce ceVar, ArrayList arrayList, int i10) {
        this.f23709b = ceVar;
        this.f23710c = arrayList;
        this.f23711d = i10;
    }
}
