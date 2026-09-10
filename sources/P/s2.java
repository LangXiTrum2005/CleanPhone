package p;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import com.ironsource.InterfaceC0435l1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 implements o.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o.m f47808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o.o f47809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f47810c;

    public s2(Toolbar toolbar) {
        this.f47810c = toolbar;
    }

    @Override // o.y
    public final void c() {
        if (this.f47809b != null) {
            o.m mVar = this.f47808a;
            if (mVar != null) {
                int size = mVar.f46964f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f47808a.getItem(i10) == this.f47809b) {
                        return;
                    }
                }
            }
            f(this.f47809b);
        }
    }

    @Override // o.y
    public final boolean d(o.o oVar) {
        Toolbar toolbar = this.f47810c;
        toolbar.c();
        ViewParent parent = toolbar.f3977h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f3977h);
            }
            toolbar.addView(toolbar.f3977h);
        }
        View actionView = oVar.getActionView();
        toolbar.f3978i = actionView;
        this.f47809b = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f3978i);
            }
            t2 t2VarH = Toolbar.h();
            t2VarH.f47815a = (toolbar.f3982n & InterfaceC0435l1.d.b.f29113j) | 8388611;
            t2VarH.f47816b = 2;
            toolbar.f3978i.setLayoutParams(t2VarH);
            toolbar.addView(toolbar.f3978i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((t2) childAt.getLayoutParams()).f47816b != 2 && childAt != toolbar.f3970a) {
                toolbar.removeViewAt(childCount);
                toolbar.E.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.C = true;
        oVar.f46997n.p(false);
        KeyEvent.Callback callback = toolbar.f3978i;
        if (callback instanceof n.b) {
            ((o.q) ((n.b) callback)).f47012a.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // o.y
    public final boolean f(o.o oVar) {
        Toolbar toolbar = this.f47810c;
        KeyEvent.Callback callback = toolbar.f3978i;
        if (callback instanceof n.b) {
            ((o.q) ((n.b) callback)).f47012a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f3978i);
        toolbar.removeView(toolbar.f3977h);
        toolbar.f3978i = null;
        ArrayList arrayList = toolbar.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f47809b = null;
        toolbar.requestLayout();
        oVar.C = false;
        oVar.f46997n.p(false);
        toolbar.t();
        return true;
    }

    @Override // o.y
    public final void g(Context context, o.m mVar) {
        o.o oVar;
        o.m mVar2 = this.f47808a;
        if (mVar2 != null && (oVar = this.f47809b) != null) {
            mVar2.d(oVar);
        }
        this.f47808a = mVar;
    }

    @Override // o.y
    public final boolean h() {
        return false;
    }

    @Override // o.y
    public final boolean i(o.e0 e0Var) {
        return false;
    }

    @Override // o.y
    public final void b(o.m mVar, boolean z10) {
    }
}
