package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f4919e = new ThreadLocal();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ae.l f4920f = new ae.l(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f4921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f4924d;

    public static h1 c(RecyclerView recyclerView, int i10, long j10) {
        int iH = recyclerView.mChildHelper.h();
        for (int i11 = 0; i11 < iH; i11++) {
            h1 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i11));
            if (childViewHolderInt.mPosition == i10 && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        y0 y0Var = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            h1 h1VarJ = y0Var.j(i10, j10);
            if (h1VarJ != null) {
                if (!h1VarJ.isBound() || h1VarJ.isInvalid()) {
                    y0Var.a(h1VarJ, false);
                } else {
                    y0Var.g(h1VarJ.itemView);
                }
            }
            return h1VarJ;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f4922b == 0) {
            this.f4922b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        q qVar = recyclerView.mPrefetchRegistry;
        qVar.f4888a = i10;
        qVar.f4889b = i11;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    public final void b(long j10) {
        r rVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        r rVar2;
        ArrayList arrayList = this.f4924d;
        ArrayList arrayList2 = this.f4921a;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i10 += recyclerView3.mPrefetchRegistry.f4891d;
            }
        }
        arrayList.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                q qVar = recyclerView4.mPrefetchRegistry;
                int iAbs = Math.abs(qVar.f4889b) + Math.abs(qVar.f4888a);
                for (int i14 = 0; i14 < qVar.f4891d * 2; i14 += 2) {
                    if (i12 >= arrayList.size()) {
                        rVar2 = new r();
                        arrayList.add(rVar2);
                    } else {
                        rVar2 = (r) arrayList.get(i12);
                    }
                    int[] iArr = qVar.f4890c;
                    int i15 = iArr[i14 + 1];
                    rVar2.f4900a = i15 <= iAbs;
                    rVar2.f4901b = iAbs;
                    rVar2.f4902c = i15;
                    rVar2.f4903d = recyclerView4;
                    rVar2.f4904e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList, f4920f);
        for (int i16 = 0; i16 < arrayList.size() && (recyclerView = (rVar = (r) arrayList.get(i16)).f4903d) != null; i16++) {
            h1 h1VarC = c(recyclerView, rVar.f4904e, rVar.f4900a ? Long.MAX_VALUE : j10);
            if (h1VarC != null && h1VarC.mNestedRecyclerView != null && h1VarC.isBound() && !h1VarC.isInvalid() && (recyclerView2 = h1VarC.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                q qVar2 = recyclerView2.mPrefetchRegistry;
                qVar2.b(recyclerView2, true);
                if (qVar2.f4891d != 0) {
                    try {
                        Trace.beginSection("RV Nested Prefetch");
                        e1 e1Var = recyclerView2.mState;
                        g0 g0Var = recyclerView2.mAdapter;
                        e1Var.f4752d = 1;
                        e1Var.f4753e = g0Var.getItemCount();
                        e1Var.f4755g = false;
                        e1Var.f4756h = false;
                        e1Var.f4757i = false;
                        for (int i17 = 0; i17 < qVar2.f4891d * 2; i17 += 2) {
                            c(recyclerView2, qVar2.f4890c[i17], j10);
                        }
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            rVar.f4900a = false;
            rVar.f4901b = 0;
            rVar.f4902c = 0;
            rVar.f4903d = null;
            rVar.f4904e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f4921a;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f4923c);
                }
            }
        } finally {
            this.f4922b = 0L;
            Trace.endSection();
        }
    }
}
