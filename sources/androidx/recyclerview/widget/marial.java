package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: GapWorker.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial implements Runnable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public long f13460arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public long f13462monoploid;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final ThreadLocal<marial> f13459molybdenite = new ThreadLocal<>();

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static Comparator<dern> f13458graveside = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public ArrayList<RecyclerView> f13461kowloon = new ArrayList<>();

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public ArrayList<dern> f13463polloi = new ArrayList<>();

    /* JADX INFO: compiled from: GapWorker.java */
    public class attabal implements Comparator<dern> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compare(dern dernVar, dern dernVar2) {
            RecyclerView recyclerView = dernVar.f13468wireman;
            if ((recyclerView == null) != (dernVar2.f13468wireman == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = dernVar.f13464attabal;
            if (z != dernVar2.f13464attabal) {
                return z ? -1 : 1;
            }
            int i = dernVar2.f13467saneness - dernVar.f13467saneness;
            if (i != 0) {
                return i;
            }
            int i2 = dernVar.f13465dern - dernVar2.f13465dern;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: GapWorker.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f13464attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f13465dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f13466marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f13467saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public RecyclerView f13468wireman;

        public void attabal() {
            this.f13464attabal = false;
            this.f13467saneness = 0;
            this.f13465dern = 0;
            this.f13468wireman = null;
            this.f13466marial = 0;
        }
    }

    /* JADX INFO: compiled from: GapWorker.java */
    public static class saneness implements RecyclerView.kowloon.dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f13469attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int[] f13470dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f13471saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f13472wireman;

        @Override // androidx.recyclerview.widget.RecyclerView.kowloon.dern
        public void attabal(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f13472wireman;
            int i4 = i3 * 2;
            int[] iArr = this.f13470dern;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f13470dern = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.f13470dern = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f13470dern;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.f13472wireman++;
        }

        public void dern(RecyclerView recyclerView, boolean z) {
            this.f13472wireman = 0;
            int[] iArr = this.f13470dern;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.kowloon kowloonVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || kowloonVar == null || !kowloonVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.arytenoidectomy()) {
                    kowloonVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                kowloonVar.collectAdjacentPrefetchPositions(this.f13469attabal, this.f13471saneness, recyclerView.mState, this);
            }
            int i = this.f13472wireman;
            if (i > kowloonVar.mPrefetchMaxCountObserved) {
                kowloonVar.mPrefetchMaxCountObserved = i;
                kowloonVar.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.creditor();
            }
        }

        public void marial(int i, int i2) {
            this.f13469attabal = i;
            this.f13471saneness = i2;
        }

        public void saneness() {
            int[] iArr = this.f13470dern;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f13472wireman = 0;
        }

        public boolean wireman(int i) {
            if (this.f13470dern != null) {
                int i2 = this.f13472wireman * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f13470dern[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static boolean marial(RecyclerView recyclerView, int i) {
        int iCutely = recyclerView.mChildHelper.cutely();
        for (int i2 = 0; i2 < iCutely; i2++) {
            RecyclerView.stratoscope childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.taiyuan(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    public void attabal(RecyclerView recyclerView) {
        if (RecyclerView.sDebugAssertionsEnabled && this.f13461kowloon.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f13461kowloon.add(recyclerView);
    }

    public void beachfront(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f13461kowloon.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f13460arytenoidectomy == 0) {
                this.f13460arytenoidectomy = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.mPrefetchRegistry.marial(i, i2);
    }

    public void competently(long j) {
        saneness();
        wireman(j);
    }

    public void cutely(RecyclerView recyclerView) {
        boolean zRemove = this.f13461kowloon.remove(recyclerView);
        if (RecyclerView.sDebugAssertionsEnabled && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    public final void dern(dern dernVar, long j) {
        RecyclerView.stratoscope stratoscopeVarTaiyuan = taiyuan(dernVar.f13468wireman, dernVar.f13466marial, dernVar.f13464attabal ? Long.MAX_VALUE : j);
        if (stratoscopeVarTaiyuan == null || stratoscopeVarTaiyuan.mNestedRecyclerView == null || !stratoscopeVarTaiyuan.isBound() || stratoscopeVarTaiyuan.isInvalid()) {
            return;
        }
        impromptu(stratoscopeVarTaiyuan.mNestedRecyclerView.get(), j);
    }

    public final void impromptu(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.cutely() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        saneness sanenessVar = recyclerView.mPrefetchRegistry;
        sanenessVar.dern(recyclerView, true);
        if (sanenessVar.f13472wireman != 0) {
            try {
                claque.impassible.attabal("RV Nested Prefetch");
                recyclerView.mState.beachfront(recyclerView.mAdapter);
                for (int i = 0; i < sanenessVar.f13472wireman * 2; i += 2) {
                    taiyuan(recyclerView, sanenessVar.f13470dern[i], j);
                }
                claque.impassible.saneness();
            } catch (Throwable th) {
                claque.impassible.saneness();
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            claque.impassible.attabal("RV Prefetch");
            if (!this.f13461kowloon.isEmpty()) {
                int size = this.f13461kowloon.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f13461kowloon.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    competently(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f13462monoploid);
                }
            }
        } finally {
            this.f13460arytenoidectomy = 0L;
            claque.impassible.saneness();
        }
    }

    public final void saneness() {
        dern dernVar;
        int size = this.f13461kowloon.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f13461kowloon.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.dern(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f13472wireman;
            }
        }
        this.f13463polloi.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f13461kowloon.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                saneness sanenessVar = recyclerView2.mPrefetchRegistry;
                int iAbs = Math.abs(sanenessVar.f13469attabal) + Math.abs(sanenessVar.f13471saneness);
                for (int i5 = 0; i5 < sanenessVar.f13472wireman * 2; i5 += 2) {
                    if (i3 >= this.f13463polloi.size()) {
                        dernVar = new dern();
                        this.f13463polloi.add(dernVar);
                    } else {
                        dernVar = this.f13463polloi.get(i3);
                    }
                    int[] iArr = sanenessVar.f13470dern;
                    int i6 = iArr[i5 + 1];
                    dernVar.f13464attabal = i6 <= iAbs;
                    dernVar.f13467saneness = iAbs;
                    dernVar.f13465dern = i6;
                    dernVar.f13468wireman = recyclerView2;
                    dernVar.f13466marial = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f13463polloi, f13458graveside);
    }

    public final RecyclerView.stratoscope taiyuan(RecyclerView recyclerView, int i, long j) {
        if (marial(recyclerView, i)) {
            return null;
        }
        RecyclerView.graveside gravesideVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.stratoscope stratoscopeVarSaran = gravesideVar.saran(i, false, j);
            if (stratoscopeVarSaran != null) {
                if (!stratoscopeVarSaran.isBound() || stratoscopeVarSaran.isInvalid()) {
                    gravesideVar.attabal(stratoscopeVarSaran, false);
                } else {
                    gravesideVar.kattegat(stratoscopeVarSaran.itemView);
                }
            }
            return stratoscopeVarSaran;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public final void wireman(long j) {
        for (int i = 0; i < this.f13463polloi.size(); i++) {
            dern dernVar = this.f13463polloi.get(i);
            if (dernVar.f13468wireman == null) {
                return;
            }
            dern(dernVar, j);
            dernVar.attabal();
        }
    }
}
