package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4744b;

    public /* synthetic */ d0(RecyclerView recyclerView, int i10) {
        this.f4743a = i10;
        this.f4744b = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0115  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10 = this.f4743a;
        RecyclerView recyclerView = this.f4744b;
        switch (i10) {
            case 0:
                if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.mIsAttached) {
                        recyclerView.requestLayout();
                    } else if (recyclerView.mLayoutFrozen) {
                        recyclerView.mLayoutWasDefered = true;
                    } else {
                        recyclerView.consumePendingUpdateOperations();
                    }
                    break;
                }
                break;
            default:
                n0 n0Var = recyclerView.mItemAnimator;
                if (n0Var != null) {
                    k kVar = (k) n0Var;
                    long j10 = kVar.f4835d;
                    ArrayList<h1> arrayList = kVar.f4802h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = kVar.f4804j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = kVar.f4805k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = kVar.f4803i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z10 = false;
                    } else {
                        for (h1 h1Var : arrayList) {
                            View view = h1Var.itemView;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            kVar.f4810q.add(h1Var);
                            viewPropertyAnimatorAnimate.setDuration(j10).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new f(kVar, h1Var, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z11 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            kVar.f4806m.add(arrayList5);
                            arrayList2.clear();
                            e eVar = new e(kVar, arrayList5, 0);
                            if (z11) {
                                eVar.run();
                            } else {
                                View view2 = ((j) arrayList5.get(0)).f4793a.itemView;
                                WeakHashMap weakHashMap = m0.s0.f45746a;
                                view2.postOnAnimationDelayed(eVar, j10);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            kVar.f4807n.add(arrayList6);
                            arrayList3.clear();
                            e eVar2 = new e(kVar, arrayList6, 1);
                            if (z11) {
                                eVar2.run();
                            } else {
                                View view3 = ((i) arrayList6.get(0)).f4786a.itemView;
                                WeakHashMap weakHashMap2 = m0.s0.f45746a;
                                view3.postOnAnimationDelayed(eVar2, j10);
                            }
                        }
                        if (zIsEmpty4) {
                            z10 = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            kVar.l.add(arrayList7);
                            arrayList4.clear();
                            e eVar3 = new e(kVar, arrayList7, 2);
                            if (z11 && zIsEmpty2 && zIsEmpty3) {
                                eVar3.run();
                                z10 = false;
                            } else {
                                if (z11) {
                                    j10 = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? kVar.f4836e : 0L, zIsEmpty3 ? 0L : kVar.f4837f) + j10;
                                z10 = false;
                                View view4 = ((h1) arrayList7.get(0)).itemView;
                                WeakHashMap weakHashMap3 = m0.s0.f45746a;
                                view4.postOnAnimationDelayed(eVar3, jMax);
                            }
                        }
                    }
                } else {
                    z10 = false;
                }
                recyclerView.mPostedAnimatorRunner = z10;
                break;
        }
    }
}
