package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.core.os.TraceCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class GapWorker implements Runnable {
    public static final ThreadLocal f0 = new ThreadLocal();
    public static final Comparator g0 = new AnonymousClass1();
    public ArrayList X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f8046Y;
    public long Z;
    public ArrayList e0;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GapWorker$1, reason: invalid class name */
    public class AnonymousClass1 implements Comparator<Task> {
        @Override // java.util.Comparator
        public final int compare(Task task, Task task2) {
            Task task3 = task;
            Task task4 = task2;
            RecyclerView recyclerView = task3.d;
            if ((recyclerView == null) == (task4.d == null)) {
                boolean z2 = task3.f8050a;
                if (z2 == task4.f8050a) {
                    int i2 = task4.f8051b - task3.f8051b;
                    if (i2 != 0) {
                        return i2;
                    }
                    int i3 = task3.f8052c - task4.f8052c;
                    if (i3 != 0) {
                        return i3;
                    }
                    return 0;
                }
                if (z2) {
                    return -1;
                }
            } else if (recyclerView != null) {
                return -1;
            }
            return 1;
        }
    }

    public static class LayoutPrefetchRegistryImpl implements RecyclerView.LayoutManager.LayoutPrefetchRegistry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f8049c;
        public int d;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        public final void a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i4 = this.d;
            int i5 = i4 * 2;
            int[] iArr = this.f8049c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f8049c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i5 >= iArr.length) {
                int[] iArr3 = new int[i4 * 4];
                this.f8049c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f8049c;
            iArr4[i5] = i2;
            iArr4[i5 + 1] = i3;
            this.d++;
        }

        public final void b(RecyclerView recyclerView, boolean z2) {
            this.d = 0;
            int[] iArr = this.f8049c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || layoutManager == null || !layoutManager.isItemPrefetchEnabled()) {
                return;
            }
            if (z2) {
                if (!recyclerView.mAdapterHelper.g()) {
                    layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                layoutManager.collectAdjacentPrefetchPositions(this.f8047a, this.f8048b, recyclerView.mState, this);
            }
            int i2 = this.d;
            if (i2 > layoutManager.mPrefetchMaxCountObserved) {
                layoutManager.mPrefetchMaxCountObserved = i2;
                layoutManager.mPrefetchMaxObservedInInitialPrefetch = z2;
                recyclerView.mRecycler.n();
            }
        }
    }

    public static class Task {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8052c;
        public RecyclerView d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8053e;
    }

    public static RecyclerView.ViewHolder c(RecyclerView recyclerView, int i2, long j) {
        int childCount = RecyclerView.this.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(RecyclerView.this.getChildAt(i3));
            if (childViewHolderInt.mPosition == i2 && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        RecyclerView.Recycler recycler = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.ViewHolder viewHolderL = recycler.l(i2, j);
            if (viewHolderL != null) {
                if (!viewHolderL.isBound() || viewHolderL.isInvalid()) {
                    recycler.a(viewHolderL, false);
                } else {
                    recycler.i(viewHolderL.itemView);
                }
            }
            return viewHolderL;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.X.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f8046Y == 0) {
                this.f8046Y = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
        layoutPrefetchRegistryImpl.f8047a = i2;
        layoutPrefetchRegistryImpl.f8048b = i3;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    public final void b(long j) {
        Task task;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Task task2;
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i3);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i2 += recyclerView3.mPrefetchRegistry.d;
            }
        }
        ArrayList arrayList2 = this.e0;
        arrayList2.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i5);
            if (recyclerView4.getWindowVisibility() == 0) {
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView4.mPrefetchRegistry;
                int iAbs = Math.abs(layoutPrefetchRegistryImpl.f8048b) + Math.abs(layoutPrefetchRegistryImpl.f8047a);
                for (int i6 = 0; i6 < layoutPrefetchRegistryImpl.d * 2; i6 += 2) {
                    if (i4 >= arrayList2.size()) {
                        task2 = new Task();
                        arrayList2.add(task2);
                    } else {
                        task2 = (Task) arrayList2.get(i4);
                    }
                    int[] iArr = layoutPrefetchRegistryImpl.f8049c;
                    int i7 = iArr[i6 + 1];
                    task2.f8050a = i7 <= iAbs;
                    task2.f8051b = iAbs;
                    task2.f8052c = i7;
                    task2.d = recyclerView4;
                    task2.f8053e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(arrayList2, g0);
        for (int i8 = 0; i8 < arrayList2.size() && (recyclerView = (task = (Task) arrayList2.get(i8)).d) != null; i8++) {
            RecyclerView.ViewHolder viewHolderC = c(recyclerView, task.f8053e, task.f8050a ? Long.MAX_VALUE : j);
            if (viewHolderC != null && viewHolderC.mNestedRecyclerView != null && viewHolderC.isBound() && !viewHolderC.isInvalid() && (recyclerView2 = viewHolderC.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && RecyclerView.this.getChildCount() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl2 = recyclerView2.mPrefetchRegistry;
                layoutPrefetchRegistryImpl2.b(recyclerView2, true);
                if (layoutPrefetchRegistryImpl2.d != 0) {
                    try {
                        int i9 = TraceCompat.f4357a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.State state = recyclerView2.mState;
                        RecyclerView.Adapter adapter = recyclerView2.mAdapter;
                        state.d = 1;
                        state.f8127e = adapter.getItemCount();
                        state.g = false;
                        state.f8128h = false;
                        state.f8129i = false;
                        for (int i10 = 0; i10 < layoutPrefetchRegistryImpl2.d * 2; i10 += 2) {
                            c(recyclerView2, layoutPrefetchRegistryImpl2.f8049c[i10], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i11 = TraceCompat.f4357a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            task.f8050a = false;
            task.f8051b = 0;
            task.f8052c = 0;
            task.d = null;
            task.f8053e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = TraceCompat.f4357a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.X;
            if (arrayList.isEmpty()) {
                this.f8046Y = 0L;
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f8046Y = 0L;
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.Z);
                this.f8046Y = 0L;
            }
        } finally {
            this.f8046Y = 0L;
            int i4 = TraceCompat.f4357a;
            Trace.endSection();
        }
    }
}
