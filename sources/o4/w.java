package o4;

import android.view.View;
import android.view.ViewGroup;
import cc.a2;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class w extends r {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f47170x;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f47168v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f47169w = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f47171y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f47172z = 0;

    @Override // o4.r
    public final void A() {
        this.f47172z |= 1;
        ArrayList arrayList = this.f47168v;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((r) this.f47168v.get(i10)).A();
            }
        }
    }

    @Override // o4.r
    public final void B(ne.c cVar) {
        super.B(cVar);
        this.f47172z |= 4;
        if (this.f47168v != null) {
            for (int i10 = 0; i10 < this.f47168v.size(); i10++) {
                ((r) this.f47168v.get(i10)).B(cVar);
            }
        }
    }

    @Override // o4.r
    public final void C() {
        this.f47172z |= 2;
        int size = this.f47168v.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r) this.f47168v.get(i10)).C();
        }
    }

    @Override // o4.r
    public final void D(long j10) {
        this.f47145b = j10;
    }

    @Override // o4.r
    public final String F(String str) {
        String strF = super.F(str);
        for (int i10 = 0; i10 < this.f47168v.size(); i10++) {
            StringBuilder sbJ = d5.u.j(strF, "\n");
            sbJ.append(((r) this.f47168v.get(i10)).F(str + "  "));
            strF = sbJ.toString();
        }
        return strF;
    }

    public final void G(r rVar) {
        this.f47168v.add(rVar);
        rVar.f47150g = this;
        if ((this.f47172z & 1) != 0) {
            rVar.A();
        }
        if ((this.f47172z & 2) != 0) {
            rVar.C();
        }
        if ((this.f47172z & 4) != 0) {
            rVar.B(this.f47160r);
        }
        if ((this.f47172z & 8) != 0) {
            rVar.z(this.f47159q);
        }
    }

    @Override // o4.r
    public final void b(View view) {
        for (int i10 = 0; i10 < this.f47168v.size(); i10++) {
            ((r) this.f47168v.get(i10)).b(view);
        }
        this.f47147d.add(view);
    }

    @Override // o4.r
    public final void cancel() {
        super.cancel();
        int size = this.f47168v.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r) this.f47168v.get(i10)).cancel();
        }
    }

    @Override // o4.r
    public final void d(x xVar) {
        View view = xVar.f47174b;
        if (s(view)) {
            for (r rVar : this.f47168v) {
                if (rVar.s(view)) {
                    rVar.d(xVar);
                    xVar.f47175c.add(rVar);
                }
            }
        }
    }

    @Override // o4.r
    public final void f(x xVar) {
        int size = this.f47168v.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r) this.f47168v.get(i10)).f(xVar);
        }
    }

    @Override // o4.r
    public final void g(x xVar) {
        View view = xVar.f47174b;
        if (s(view)) {
            for (r rVar : this.f47168v) {
                if (rVar.s(view)) {
                    rVar.g(xVar);
                    xVar.f47175c.add(rVar);
                }
            }
        }
    }

    @Override // o4.r
    /* JADX INFO: renamed from: j */
    public final r clone() {
        w wVar = (w) super.clone();
        wVar.f47168v = new ArrayList();
        int size = this.f47168v.size();
        for (int i10 = 0; i10 < size; i10++) {
            r rVarClone = ((r) this.f47168v.get(i10)).clone();
            wVar.f47168v.add(rVarClone);
            rVarClone.f47150g = wVar;
        }
        return wVar;
    }

    @Override // o4.r
    public final void l(ViewGroup viewGroup, k5.g gVar, k5.g gVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j10 = this.f47145b;
        int size = this.f47168v.size();
        for (int i10 = 0; i10 < size; i10++) {
            r rVar = (r) this.f47168v.get(i10);
            if (j10 > 0 && (this.f47169w || i10 == 0)) {
                long j11 = rVar.f47145b;
                if (j11 > 0) {
                    rVar.D(j11 + j10);
                } else {
                    rVar.D(j10);
                }
            }
            rVar.l(viewGroup, gVar, gVar2, arrayList, arrayList2);
        }
    }

    @Override // o4.r
    public final void u(View view) {
        super.u(view);
        int size = this.f47168v.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r) this.f47168v.get(i10)).u(view);
        }
    }

    @Override // o4.r
    public final void w(View view) {
        for (int i10 = 0; i10 < this.f47168v.size(); i10++) {
            ((r) this.f47168v.get(i10)).w(view);
        }
        this.f47147d.remove(view);
    }

    @Override // o4.r
    public final void x(View view) {
        super.x(view);
        int size = this.f47168v.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r) this.f47168v.get(i10)).x(view);
        }
    }

    @Override // o4.r
    public final void y() {
        if (this.f47168v.isEmpty()) {
            E();
            m();
            return;
        }
        h hVar = new h();
        hVar.f47123b = this;
        Iterator it = this.f47168v.iterator();
        while (it.hasNext()) {
            ((r) it.next()).a(hVar);
        }
        this.f47170x = this.f47168v.size();
        if (this.f47169w) {
            Iterator it2 = this.f47168v.iterator();
            while (it2.hasNext()) {
                ((r) it2.next()).y();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f47168v.size(); i10++) {
            ((r) this.f47168v.get(i10 - 1)).a(new h((r) this.f47168v.get(i10), 1));
        }
        r rVar = (r) this.f47168v.get(0);
        if (rVar != null) {
            rVar.y();
        }
    }

    @Override // o4.r
    public final void z(a2 a2Var) {
        this.f47159q = a2Var;
        this.f47172z |= 8;
        int size = this.f47168v.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r) this.f47168v.get(i10)).z(a2Var);
        }
    }
}
