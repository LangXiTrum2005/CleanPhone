package cl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f6475f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, int i10) {
        super(0);
        this.f6474e = i10;
        this.f6475f = b0Var;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f6474e) {
            case 0:
                b0 b0Var = this.f6475f;
                f0 f0Var = b0Var.f6479c;
                f0Var.I0();
                return Boolean.valueOf(zk.u.h((o) f0Var.f6506k.getValue(), b0Var.f6480d));
            case 1:
                b0 b0Var2 = this.f6475f;
                f0 f0Var2 = b0Var2.f6479c;
                f0Var2.I0();
                return zk.u.i((o) f0Var2.f6506k.getValue(), b0Var2.f6480d);
            default:
                b0 b0Var3 = this.f6475f;
                om.i iVar = b0Var3.f6482f;
                qk.w[] wVarArr = b0.f6478h;
                boolean zBooleanValue = ((Boolean) j1.f.w(iVar, wVarArr[1])).booleanValue();
                yl.c cVar = b0Var3.f6480d;
                f0 f0Var3 = b0Var3.f6479c;
                if (zBooleanValue) {
                    return im.m.f43190b;
                }
                List list = (List) j1.f.w(b0Var3.f6481e, wVarArr[0]);
                ArrayList arrayList = new ArrayList(xj.p.W(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zk.b0) it.next()).A());
                }
                return t9.e.b("package view scope for " + cVar + " in " + f0Var3.getName(), xj.n.D0(arrayList, new r0(f0Var3, cVar)));
        }
    }
}
