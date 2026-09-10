package o4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.y1;
import com.google.android.gms.internal.ads.lw;
import com.storage.androidcleaner.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m0.s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class n extends y1 {
    @Override // androidx.fragment.app.y1
    public final void a(View view, Object obj) {
        ((r) obj).b(view);
    }

    @Override // androidx.fragment.app.y1
    public final void b(Object obj, ArrayList arrayList) {
        r rVar = (r) obj;
        if (rVar == null) {
            return;
        }
        int i10 = 0;
        if (rVar instanceof w) {
            w wVar = (w) rVar;
            int size = wVar.f47168v.size();
            while (i10 < size) {
                b((i10 < 0 || i10 >= wVar.f47168v.size()) ? null : (r) wVar.f47168v.get(i10), arrayList);
                i10++;
            }
            return;
        }
        if (y1.h(rVar.f47146c) && y1.h(rVar.f47147d)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                rVar.b((View) arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.y1
    public final void c(ViewGroup viewGroup, Object obj) {
        r rVar = (r) obj;
        ArrayList arrayList = v.f47167c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = s0.f45746a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (rVar == null) {
                rVar = v.f47165a;
            }
            r rVarClone = rVar.clone();
            ArrayList arrayList2 = (ArrayList) v.a().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((r) it.next()).u(viewGroup);
                }
            }
            if (rVarClone != null) {
                rVarClone.h(viewGroup, true);
            }
            if (viewGroup.getTag(R.id.transition_current_scene) != null) {
                throw new ClassCastException();
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (rVarClone != null) {
                u uVar = new u();
                uVar.f47163a = rVarClone;
                uVar.f47164b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(uVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(uVar);
            }
        }
    }

    @Override // androidx.fragment.app.y1
    public final boolean e(Object obj) {
        return obj instanceof r;
    }

    @Override // androidx.fragment.app.y1
    public final Object f(Object obj) {
        if (obj != null) {
            return ((r) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.y1
    public final Object j(Object obj, Object obj2, Object obj3) {
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        r rVar3 = (r) obj3;
        if (rVar != null && rVar2 != null) {
            w wVar = new w();
            wVar.G(rVar);
            wVar.G(rVar2);
            wVar.f47169w = false;
            rVar = wVar;
        } else if (rVar == null) {
            rVar = rVar2 != null ? rVar2 : null;
        }
        if (rVar3 == null) {
            return rVar;
        }
        w wVar2 = new w();
        if (rVar != null) {
            wVar2.G(rVar);
        }
        wVar2.G(rVar3);
        return wVar2;
    }

    @Override // androidx.fragment.app.y1
    public final Object k(Object obj, Object obj2) {
        w wVar = new w();
        if (obj != null) {
            wVar.G((r) obj);
        }
        wVar.G((r) obj2);
        return wVar;
    }

    @Override // androidx.fragment.app.y1
    public final void l(Object obj, View view, ArrayList arrayList) {
        ((r) obj).a(new k(view, arrayList));
    }

    @Override // androidx.fragment.app.y1
    public final void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((r) obj).a(new l(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.y1
    public final void n(View view, Object obj) {
        if (view != null) {
            y1.g(view, new Rect());
            ((r) obj).z(new j());
        }
    }

    @Override // androidx.fragment.app.y1
    public final void o(Object obj, Rect rect) {
        ((r) obj).z(new j());
    }

    @Override // androidx.fragment.app.y1
    public final void p(Object obj, lw lwVar, Runnable runnable) {
        r rVar = (r) obj;
        am.e eVar = new am.e(rVar, 24);
        synchronized (lwVar) {
            while (lwVar.f17136b) {
                try {
                    try {
                        lwVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (((am.e) lwVar.f17137c) != eVar) {
                lwVar.f17137c = eVar;
                if (lwVar.f17135a) {
                    ((r) eVar.f3698b).cancel();
                }
            }
        }
        rVar.a(new m(runnable));
    }

    @Override // androidx.fragment.app.y1
    public final void q(Object obj, View view, ArrayList arrayList) {
        w wVar = (w) obj;
        ArrayList arrayList2 = wVar.f47147d;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            y1.d(arrayList2, (View) arrayList.get(i10));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(wVar, arrayList);
    }

    @Override // androidx.fragment.app.y1
    public final void r(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        w wVar = (w) obj;
        if (wVar != null) {
            ArrayList arrayList3 = wVar.f47147d;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            t(wVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.y1
    public final Object s(Object obj) {
        if (obj == null) {
            return null;
        }
        w wVar = new w();
        wVar.G((r) obj);
        return wVar;
    }

    public final void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        r rVar = (r) obj;
        int i10 = 0;
        if (rVar instanceof w) {
            w wVar = (w) rVar;
            int size = wVar.f47168v.size();
            while (i10 < size) {
                t((i10 < 0 || i10 >= wVar.f47168v.size()) ? null : (r) wVar.f47168v.get(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (y1.h(rVar.f47146c)) {
            ArrayList arrayList3 = rVar.f47147d;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size2) {
                    rVar.b((View) arrayList2.get(i10));
                    i10++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    rVar.w((View) arrayList.get(size3));
                }
            }
        }
    }
}
