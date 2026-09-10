package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.storage.androidcleaner.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements o.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f47671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o.m f47672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f47673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o.x f47674e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o.a0 f47677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f47678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f47679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f47680k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f47681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f47682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f47683o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f47684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f47685q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f47687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f f47688t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h f47689u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g f47690v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f47675f = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f47676g = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f47686r = new SparseBooleanArray();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final am.e f47691w = new am.e(this, 27);

    public j(Context context) {
        this.f47670a = context;
        this.f47673d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(o.o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.e()) {
            o.z zVar = view instanceof o.z ? (o.z) view : (o.z) this.f47673d.inflate(this.f47676g, viewGroup, false);
            zVar.c(oVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) zVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f47677h);
            if (this.f47690v == null) {
                this.f47690v = new g(this);
            }
            actionMenuItemView.setPopupCallback(this.f47690v);
            actionView = (View) zVar;
        }
        actionView.setVisibility(oVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof l)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // o.y
    public final void b(o.m mVar, boolean z10) {
        j();
        f fVar = this.f47688t;
        if (fVar != null && fVar.b()) {
            fVar.f47029i.dismiss();
        }
        o.x xVar = this.f47674e;
        if (xVar != null) {
            xVar.b(mVar, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.y
    public final void c() {
        int i10;
        ViewGroup viewGroup = (ViewGroup) this.f47677h;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            o.m mVar = this.f47672c;
            if (mVar != null) {
                mVar.i();
                ArrayList arrayListL = this.f47672c.l();
                int size = arrayListL.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    o.o oVar = (o.o) arrayListL.get(i11);
                    if ((oVar.f47007x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i10);
                        o.o itemData = childAt instanceof o.z ? ((o.z) childAt).getItemData() : null;
                        View viewA = a(oVar, childAt, viewGroup);
                        if (oVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f47677h).addView(viewA, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f47678i) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f47677h).requestLayout();
        o.m mVar2 = this.f47672c;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.f46967i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                o.p pVar = ((o.o) arrayList2.get(i12)).A;
            }
        }
        o.m mVar3 = this.f47672c;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.f46968j;
        }
        if (this.l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((o.o) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f47678i == null) {
                this.f47678i = new i(this, this.f47670a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f47678i.getParent();
            if (viewGroup3 != this.f47677h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f47678i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f47677h;
                i iVar = this.f47678i;
                actionMenuView.getClass();
                l lVarI = ActionMenuView.i();
                lVarI.f47710a = true;
                actionMenuView.addView(iVar, lVarI);
            }
        } else {
            i iVar2 = this.f47678i;
            if (iVar2 != null) {
                Object parent = iVar2.getParent();
                Object obj = this.f47677h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f47678i);
                }
            }
        }
        ((ActionMenuView) this.f47677h).setOverflowReserved(this.l);
    }

    @Override // o.y
    public final boolean d(o.o oVar) {
        return false;
    }

    @Override // o.y
    public final void e(o.x xVar) {
        throw null;
    }

    @Override // o.y
    public final boolean f(o.o oVar) {
        return false;
    }

    @Override // o.y
    public final void g(Context context, o.m mVar) {
        this.f47671b = context;
        LayoutInflater.from(context);
        this.f47672c = mVar;
        Resources resources = context.getResources();
        if (!this.f47681m) {
            this.l = true;
        }
        int i10 = 2;
        this.f47682n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.f47684p = i10;
        int measuredWidth = this.f47682n;
        if (this.l) {
            if (this.f47678i == null) {
                i iVar = new i(this, this.f47670a);
                this.f47678i = iVar;
                if (this.f47680k) {
                    iVar.setImageDrawable(this.f47679j);
                    this.f47679j = null;
                    this.f47680k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f47678i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f47678i.getMeasuredWidth();
        } else {
            this.f47678i = null;
        }
        this.f47683o = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // o.y
    public final boolean h() {
        int size;
        ArrayList arrayListL;
        int i10;
        boolean z10;
        j jVar = this;
        o.m mVar = jVar.f47672c;
        if (mVar != null) {
            arrayListL = mVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i11 = jVar.f47684p;
        int i12 = jVar.f47683o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) jVar.f47677h;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= size) {
                break;
            }
            o.o oVar = (o.o) arrayListL.get(i13);
            int i16 = oVar.f47008y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z11 = true;
            }
            if (jVar.f47685q && oVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (jVar.l && (z11 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = jVar.f47686r;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            o.o oVar2 = (o.o) arrayListL.get(i18);
            int i20 = oVar2.f47008y;
            boolean z12 = (i20 & 2) == i10 ? z10 : false;
            int i21 = oVar2.f46986b;
            if (z12) {
                View viewA = jVar.a(oVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                oVar2.f(z10);
            } else {
                if ((i20 & 1) == z10) {
                    boolean z13 = sparseBooleanArray.get(i21);
                    boolean z14 = ((i17 > 0 || z13) && i12 > 0) ? z10 : false;
                    if (z14) {
                        View viewA2 = jVar.a(oVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i12 -= measuredWidth2;
                        if (i19 == 0) {
                            i19 = measuredWidth2;
                        }
                        z14 &= i12 + i19 > 0;
                    }
                    if (z14 && i21 != 0) {
                        sparseBooleanArray.put(i21, true);
                    } else if (z13) {
                        sparseBooleanArray.put(i21, false);
                        for (int i22 = 0; i22 < i18; i22++) {
                            o.o oVar3 = (o.o) arrayListL.get(i22);
                            if (oVar3.f46986b == i21) {
                                if ((oVar3.f47007x & 32) == 32) {
                                    i17++;
                                }
                                oVar3.f(false);
                            }
                        }
                    }
                    if (z14) {
                        i17--;
                    }
                    oVar2.f(z14);
                } else {
                    oVar2.f(false);
                }
                i18++;
                i10 = 2;
                jVar = this;
                z10 = true;
            }
            i18++;
            i10 = 2;
            jVar = this;
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.y
    public final boolean i(o.e0 e0Var) {
        boolean z10;
        if (e0Var.hasVisibleItems()) {
            o.e0 e0Var2 = e0Var;
            while (true) {
                o.m mVar = e0Var2.f46916z;
                if (mVar == this.f47672c) {
                    break;
                }
                e0Var2 = (o.e0) mVar;
            }
            o.o oVar = e0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f47677h;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if ((childAt instanceof o.z) && ((o.z) childAt).getItemData() == oVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                e0Var.A.getClass();
                int size = e0Var.f46964f.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z10 = false;
                        break;
                    }
                    MenuItem item = e0Var.getItem(i11);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                f fVar = new f(this, this.f47671b, e0Var, view);
                this.f47688t = fVar;
                fVar.f47027g = z10;
                o.u uVar = fVar.f47029i;
                if (uVar != null) {
                    uVar.n(z10);
                }
                f fVar2 = this.f47688t;
                if (!fVar2.b()) {
                    if (fVar2.f47025e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    fVar2.d(0, 0, false, false);
                }
                o.x xVar = this.f47674e;
                if (xVar != null) {
                    xVar.u(e0Var);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        Object obj;
        h hVar = this.f47689u;
        if (hVar != null && (obj = this.f47677h) != null) {
            ((View) obj).removeCallbacks(hVar);
            this.f47689u = null;
            return true;
        }
        f fVar = this.f47687s;
        if (fVar == null) {
            return false;
        }
        if (fVar.b()) {
            fVar.f47029i.dismiss();
        }
        return true;
    }

    public final boolean k() {
        f fVar = this.f47687s;
        return fVar != null && fVar.b();
    }

    public final boolean l() {
        o.m mVar;
        if (!this.l || k() || (mVar = this.f47672c) == null || this.f47677h == null || this.f47689u != null) {
            return false;
        }
        mVar.i();
        if (mVar.f46968j.isEmpty()) {
            return false;
        }
        h hVar = new h(this, new f(this, this.f47671b, this.f47672c, this.f47678i));
        this.f47689u = hVar;
        ((View) this.f47677h).post(hVar);
        return true;
    }
}
