package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends n0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f4800s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f4802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f4803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f4804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f4805k;
    public ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f4806m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f4807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f4808o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f4809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f4810q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f4811r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((h1) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean a(h1 h1Var, h1 h1Var2, m0 m0Var, m0 m0Var2) {
        int i10;
        int i11;
        int i12 = m0Var.f4823a;
        int i13 = m0Var.f4824b;
        if (h1Var2.shouldIgnore()) {
            int i14 = m0Var.f4823a;
            i11 = m0Var.f4824b;
            i10 = i14;
        } else {
            i10 = m0Var2.f4823a;
            i11 = m0Var2.f4824b;
        }
        if (h1Var == h1Var2) {
            return g(h1Var, i12, i13, i10, i11);
        }
        float translationX = h1Var.itemView.getTranslationX();
        float translationY = h1Var.itemView.getTranslationY();
        float alpha = h1Var.itemView.getAlpha();
        l(h1Var);
        h1Var.itemView.setTranslationX(translationX);
        h1Var.itemView.setTranslationY(translationY);
        h1Var.itemView.setAlpha(alpha);
        l(h1Var2);
        h1Var2.itemView.setTranslationX(-((int) ((i10 - i12) - translationX)));
        h1Var2.itemView.setTranslationY(-((int) ((i11 - i13) - translationY)));
        h1Var2.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ArrayList arrayList = this.f4805k;
        i iVar = new i();
        iVar.f4786a = h1Var;
        iVar.f4787b = h1Var2;
        iVar.f4788c = i12;
        iVar.f4789d = i13;
        iVar.f4790e = i10;
        iVar.f4791f = i11;
        arrayList.add(iVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.n0
    public final void d(h1 h1Var) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.f4806m;
        ArrayList arrayList3 = this.f4807n;
        View view = h1Var.itemView;
        view.animate().cancel();
        ArrayList arrayList4 = this.f4804j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) arrayList4.get(size)).f4793a == h1Var) {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                c(h1Var);
                arrayList4.remove(size);
            }
        }
        j(this.f4805k, h1Var);
        if (this.f4802h.remove(h1Var)) {
            view.setAlpha(1.0f);
            c(h1Var);
        }
        if (this.f4803i.remove(h1Var)) {
            view.setAlpha(1.0f);
            c(h1Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, h1Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((j) arrayList6.get(size4)).f4793a == h1Var) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    c(h1Var);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(h1Var)) {
                view.setAlpha(1.0f);
                c(h1Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f4810q.remove(h1Var);
        this.f4808o.remove(h1Var);
        this.f4811r.remove(h1Var);
        this.f4809p.remove(h1Var);
        i();
    }

    @Override // androidx.recyclerview.widget.n0
    public final void e() {
        ArrayList arrayList = this.f4807n;
        ArrayList arrayList2 = this.l;
        ArrayList arrayList3 = this.f4806m;
        ArrayList arrayList4 = this.f4805k;
        ArrayList arrayList5 = this.f4803i;
        ArrayList arrayList6 = this.f4802h;
        ArrayList arrayList7 = this.f4804j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) arrayList7.get(size);
            View view = jVar.f4793a.itemView;
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            c(jVar.f4793a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((h1) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            h1 h1Var = (h1) arrayList5.get(size3);
            h1Var.itemView.setAlpha(1.0f);
            c(h1Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            i iVar = (i) arrayList4.get(size4);
            h1 h1Var2 = iVar.f4786a;
            if (h1Var2 != null) {
                k(iVar, h1Var2);
            }
            h1 h1Var3 = iVar.f4787b;
            if (h1Var3 != null) {
                k(iVar, h1Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList8.get(size6);
                    View view2 = jVar2.f4793a.itemView;
                    view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    c(jVar2.f4793a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    h1 h1Var4 = (h1) arrayList9.get(size8);
                    h1Var4.itemView.setAlpha(1.0f);
                    c(h1Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    i iVar2 = (i) arrayList10.get(size10);
                    h1 h1Var5 = iVar2.f4786a;
                    if (h1Var5 != null) {
                        k(iVar2, h1Var5);
                    }
                    h1 h1Var6 = iVar2.f4787b;
                    if (h1Var6 != null) {
                        k(iVar2, h1Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f4810q);
            h(this.f4809p);
            h(this.f4808o);
            h(this.f4811r);
            ArrayList arrayList11 = this.f4833b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean f() {
        return (this.f4803i.isEmpty() && this.f4805k.isEmpty() && this.f4804j.isEmpty() && this.f4802h.isEmpty() && this.f4809p.isEmpty() && this.f4810q.isEmpty() && this.f4808o.isEmpty() && this.f4811r.isEmpty() && this.f4806m.isEmpty() && this.l.isEmpty() && this.f4807n.isEmpty()) ? false : true;
    }

    public final boolean g(h1 h1Var, int i10, int i11, int i12, int i13) {
        View view = h1Var.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) h1Var.itemView.getTranslationY());
        l(h1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(h1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        ArrayList arrayList = this.f4804j;
        j jVar = new j();
        jVar.f4793a = h1Var;
        jVar.f4794b = translationX;
        jVar.f4795c = translationY;
        jVar.f4796d = i12;
        jVar.f4797e = i13;
        arrayList.add(jVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f4833b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, h1 h1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i iVar = (i) arrayList.get(size);
            if (k(iVar, h1Var) && iVar.f4786a == null && iVar.f4787b == null) {
                arrayList.remove(iVar);
            }
        }
    }

    public final boolean k(i iVar, h1 h1Var) {
        if (iVar.f4787b == h1Var) {
            iVar.f4787b = null;
        } else {
            if (iVar.f4786a != h1Var) {
                return false;
            }
            iVar.f4786a = null;
        }
        h1Var.itemView.setAlpha(1.0f);
        h1Var.itemView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        h1Var.itemView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        c(h1Var);
        return true;
    }

    public final void l(h1 h1Var) {
        if (f4800s == null) {
            f4800s = new ValueAnimator().getInterpolator();
        }
        h1Var.itemView.animate().setInterpolator(f4800s);
        d(h1Var);
    }
}
