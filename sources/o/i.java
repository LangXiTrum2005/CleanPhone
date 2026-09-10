package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements y, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f46946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f46947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f46948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f46949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f46950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f46951f;

    public i(ContextWrapper contextWrapper) {
        this.f46946a = contextWrapper;
        this.f46947b = LayoutInflater.from(contextWrapper);
    }

    @Override // o.y
    public final void b(m mVar, boolean z10) {
        x xVar = this.f46950e;
        if (xVar != null) {
            xVar.b(mVar, z10);
        }
    }

    @Override // o.y
    public final void c() {
        h hVar = this.f46951f;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // o.y
    public final boolean d(o oVar) {
        return false;
    }

    @Override // o.y
    public final void e(x xVar) {
        throw null;
    }

    @Override // o.y
    public final boolean f(o oVar) {
        return false;
    }

    @Override // o.y
    public final void g(Context context, m mVar) {
        if (this.f46946a != null) {
            this.f46946a = context;
            if (this.f46947b == null) {
                this.f46947b = LayoutInflater.from(context);
            }
        }
        this.f46948c = mVar;
        h hVar = this.f46951f;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // o.y
    public final boolean h() {
        return false;
    }

    @Override // o.y
    public final boolean i(e0 e0Var) {
        boolean zHasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f46959a;
        if (!zHasVisibleItems) {
            return false;
        }
        n nVar = new n();
        nVar.f46982a = e0Var;
        b2.w wVar = new b2.w(context);
        k.c cVar = (k.c) wVar.f5411c;
        i iVar = new i(cVar.f44046a);
        nVar.f46984c = iVar;
        iVar.f46950e = nVar;
        e0Var.b(iVar, context);
        i iVar2 = nVar.f46984c;
        if (iVar2.f46951f == null) {
            iVar2.f46951f = new h(iVar2);
        }
        cVar.f44054i = iVar2.f46951f;
        cVar.f44055j = nVar;
        View view = e0Var.f46972o;
        if (view != null) {
            cVar.f44050e = view;
        } else {
            cVar.f44048c = e0Var.f46971n;
            cVar.f44049d = e0Var.f46970m;
        }
        cVar.f44053h = nVar;
        k.f fVarB = wVar.b();
        nVar.f46983b = fVarB;
        fVarB.setOnDismissListener(nVar);
        WindowManager.LayoutParams attributes = nVar.f46983b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        nVar.f46983b.show();
        x xVar = this.f46950e;
        if (xVar == null) {
            return true;
        }
        xVar.u(e0Var);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f46948c.q(this.f46951f.getItem(i10), this, 0);
    }
}
