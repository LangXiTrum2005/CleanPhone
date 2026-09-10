package o;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p.q1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends q1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f46891j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f46892k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f46892k = actionMenuItemView;
    }

    @Override // p.q1
    public final c0 b() {
        p.f fVar;
        switch (this.f46891j) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f46892k).l;
                if (cVar == null || (fVar = ((p.g) cVar).f47647a.f47688t) == null) {
                    return null;
                }
                return fVar.a();
            default:
                p.f fVar2 = ((p.i) this.f46892k).f47669a.f47687s;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.a();
        }
    }

    @Override // p.q1
    public final boolean c() {
        c0 c0VarB;
        switch (this.f46891j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f46892k;
                l lVar = actionMenuItemView.f3841j;
                return lVar != null && lVar.b(actionMenuItemView.f3838g) && (c0VarB = b()) != null && c0VarB.a();
            default:
                ((p.i) this.f46892k).f47669a.l();
                return true;
        }
    }

    @Override // p.q1
    public boolean d() {
        switch (this.f46891j) {
            case 1:
                p.j jVar = ((p.i) this.f46892k).f47669a;
                if (jVar.f47689u != null) {
                    return false;
                }
                jVar.j();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p.i iVar, p.i iVar2) {
        super(iVar2);
        this.f46892k = iVar;
    }
}
