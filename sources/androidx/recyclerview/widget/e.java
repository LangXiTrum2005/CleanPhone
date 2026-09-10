package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f4747c;

    public /* synthetic */ e(k kVar, ArrayList arrayList, int i10) {
        this.f4745a = i10;
        this.f4747c = kVar;
        this.f4746b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4745a) {
            case 0:
                ArrayList arrayList = this.f4746b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    k kVar = this.f4747c;
                    if (!zHasNext) {
                        arrayList.clear();
                        kVar.f4806m.remove(arrayList);
                    } else {
                        j jVar = (j) it.next();
                        h1 h1Var = jVar.f4793a;
                        int i10 = jVar.f4794b;
                        int i11 = jVar.f4795c;
                        int i12 = jVar.f4796d;
                        int i13 = jVar.f4797e;
                        kVar.getClass();
                        View view = h1Var.itemView;
                        int i14 = i12 - i10;
                        int i15 = i13 - i11;
                        if (i14 != 0) {
                            view.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        if (i15 != 0) {
                            view.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        kVar.f4809p.add(h1Var);
                        viewPropertyAnimatorAnimate.setDuration(kVar.f4836e).setListener(new g(kVar, h1Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f4746b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    k kVar2 = this.f4747c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        kVar2.f4807n.remove(arrayList2);
                        break;
                    } else {
                        i iVar = (i) it2.next();
                        ArrayList arrayList3 = kVar2.f4811r;
                        long j10 = kVar2.f4837f;
                        h1 h1Var2 = iVar.f4786a;
                        View view2 = h1Var2 == null ? null : h1Var2.itemView;
                        h1 h1Var3 = iVar.f4787b;
                        View view3 = h1Var3 != null ? h1Var3.itemView : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j10);
                            arrayList3.add(iVar.f4786a);
                            duration.translationX(iVar.f4790e - iVar.f4788c);
                            duration.translationY(iVar.f4791f - iVar.f4789d);
                            duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new h(kVar2, iVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(iVar.f4787b);
                            viewPropertyAnimatorAnimate2.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j10).alpha(1.0f).setListener(new h(kVar2, iVar, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f4746b;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    k kVar3 = this.f4747c;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        kVar3.l.remove(arrayList4);
                    } else {
                        h1 h1Var4 = (h1) it3.next();
                        kVar3.getClass();
                        View view4 = h1Var4.itemView;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        kVar3.f4808o.add(h1Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(kVar3.f4834c).setListener(new f(kVar3, h1Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
