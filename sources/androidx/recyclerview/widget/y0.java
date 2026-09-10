package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f4971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f4973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x0 f4976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4977h;

    public y0(RecyclerView recyclerView) {
        this.f4977h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f4970a = arrayList;
        this.f4971b = null;
        this.f4972c = new ArrayList();
        this.f4973d = Collections.unmodifiableList(arrayList);
        this.f4974e = 2;
        this.f4975f = 2;
    }

    public static void d(ViewGroup viewGroup, boolean z10) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                d((ViewGroup) childAt, true);
            }
        }
        if (z10) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
    }

    public final void a(h1 h1Var, boolean z10) {
        RecyclerView.clearNestedRecyclerViewIfNotNested(h1Var);
        if (h1Var.hasAnyOfTheFlags(Http2.INITIAL_MAX_FRAME_SIZE)) {
            h1Var.setFlags(0, Http2.INITIAL_MAX_FRAME_SIZE);
            m0.s0.f(h1Var.itemView, null);
        }
        if (z10) {
            RecyclerView recyclerView = this.f4977h;
            g0 g0Var = recyclerView.mAdapter;
            if (g0Var != null) {
                g0Var.onViewRecycled(h1Var);
            }
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.d(h1Var);
            }
        }
        h1Var.mOwnerRecyclerView = null;
        x0 x0VarC = c();
        x0VarC.getClass();
        int itemViewType = h1Var.getItemViewType();
        ArrayList arrayList = x0VarC.a(itemViewType).f4949a;
        if (((w0) x0VarC.f4957a.get(itemViewType)).f4950b <= arrayList.size()) {
            return;
        }
        h1Var.resetInternal();
        arrayList.add(h1Var);
    }

    public final int b(int i10) {
        RecyclerView recyclerView = this.f4977h;
        if (i10 >= 0 && i10 < recyclerView.mState.b()) {
            return !recyclerView.mState.f4755g ? i10 : recyclerView.mAdapterHelper.f(i10, 0);
        }
        StringBuilder sbU = defpackage.e.u(i10, "invalid position ", ". State item count is ");
        sbU.append(recyclerView.mState.b());
        sbU.append(recyclerView.exceptionLabel());
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public final x0 c() {
        if (this.f4976g == null) {
            x0 x0Var = new x0();
            x0Var.f4957a = new SparseArray();
            x0Var.f4958b = 0;
            this.f4976g = x0Var;
        }
        return this.f4976g;
    }

    public final void e() {
        ArrayList arrayList = this.f4972c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            q qVar = this.f4977h.mPrefetchRegistry;
            int[] iArr = qVar.f4890c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            qVar.f4891d = 0;
        }
    }

    public final void f(int i10) {
        ArrayList arrayList = this.f4972c;
        a((h1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public final void g(View view) {
        h1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isTmpDetached()) {
            this.f4977h.removeDetachedView(view, false);
        }
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.unScrap();
        } else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        h(childViewHolderInt);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095 A[LOOP:2: B:43:0x008a->B:47:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0098 A[EDGE_INSN: B:74:0x0098->B:48:0x0098 BREAK  A[LOOP:1: B:39:0x0075->B:46:0x0092], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0098 A[EDGE_INSN: B:75:0x0098->B:48:0x0098 BREAK  A[LOOP:1: B:39:0x0075->B:46:0x0092, LOOP_LABEL: LOOP:1: B:39:0x0075->B:46:0x0092], SYNTHETIC] */
    public final void h(h1 h1Var) {
        boolean z10;
        int i10;
        int i11;
        q qVar;
        int i12;
        int i13;
        boolean zIsScrap = h1Var.isScrap();
        boolean z11 = false;
        boolean z12 = true;
        RecyclerView recyclerView = this.f4977h;
        if (zIsScrap || h1Var.itemView.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(h1Var.isScrap());
            sb2.append(" isAttached:");
            sb2.append(h1Var.itemView.getParent() != null);
            sb2.append(recyclerView.exceptionLabel());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (h1Var.isTmpDetached()) {
            StringBuilder sb3 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb3.append(h1Var);
            throw new IllegalArgumentException(defpackage.e.k(recyclerView, sb3));
        }
        if (h1Var.shouldIgnore()) {
            throw new IllegalArgumentException(defpackage.e.k(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        boolean zDoesTransientStatePreventRecycling = h1Var.doesTransientStatePreventRecycling();
        g0 g0Var = recyclerView.mAdapter;
        if ((g0Var != null && zDoesTransientStatePreventRecycling && g0Var.onFailedToRecycleView(h1Var)) || h1Var.isRecyclable()) {
            if (this.f4975f <= 0 || h1Var.hasAnyOfTheFlags(IronSourceError.ERROR_CAPPED_PER_SESSION)) {
                z10 = false;
            } else {
                ArrayList arrayList = this.f4972c;
                int size = arrayList.size();
                if (size >= this.f4975f && size > 0) {
                    f(0);
                    size--;
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                    q qVar2 = recyclerView.mPrefetchRegistry;
                    int i14 = h1Var.mPosition;
                    if (qVar2.f4890c != null) {
                        int i15 = qVar2.f4891d * 2;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= i15) {
                                i10 = size - 1;
                                loop1: while (i10 >= 0) {
                                    i11 = ((h1) arrayList.get(i10)).mPosition;
                                    qVar = recyclerView.mPrefetchRegistry;
                                    if (qVar.f4890c != null) {
                                        break;
                                    }
                                    i12 = qVar.f4891d * 2;
                                    i13 = 0;
                                    while (true) {
                                        if (i13 < i12) {
                                            break loop1;
                                        } else if (qVar.f4890c[i13] == i11) {
                                            break;
                                        } else {
                                            i13 += 2;
                                        }
                                    }
                                    i10--;
                                }
                                size = i10 + 1;
                            } else if (qVar2.f4890c[i16] != i14) {
                                i16 += 2;
                            }
                        }
                    } else {
                        i10 = size - 1;
                        loop1: while (i10 >= 0) {
                            i11 = ((h1) arrayList.get(i10)).mPosition;
                            qVar = recyclerView.mPrefetchRegistry;
                            if (qVar.f4890c != null) {
                                break;
                                break;
                            }
                            i12 = qVar.f4891d * 2;
                            i13 = 0;
                            while (true) {
                                if (i13 < i12) {
                                    break loop1;
                                    break loop1;
                                } else if (qVar.f4890c[i13] == i11) {
                                    break;
                                } else {
                                    i13 += 2;
                                }
                            }
                            i10--;
                        }
                        size = i10 + 1;
                    }
                }
                arrayList.add(size, h1Var);
                z10 = true;
            }
            if (z10) {
                z12 = false;
            } else {
                a(h1Var, true);
            }
            z11 = z10;
        } else {
            z12 = false;
        }
        recyclerView.mViewInfoStore.d(h1Var);
        if (z11 || z12 || !zDoesTransientStatePreventRecycling) {
            return;
        }
        h1Var.mOwnerRecyclerView = null;
    }

    public final void i(View view) {
        h1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean zHasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f4977h;
        if (!zHasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.f4971b == null) {
                this.f4971b = new ArrayList();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.f4971b.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
            throw new IllegalArgumentException(defpackage.e.k(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        childViewHolderInt.setScrapContainer(this, false);
        this.f4970a.add(childViewHolderInt);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:101:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:123:0x0206  */
    /* JADX WARN: Code duplicated, block: B:128:0x0223  */
    /* JADX WARN: Code duplicated, block: B:170:0x0306  */
    /* JADX WARN: Code duplicated, block: B:202:0x0399  */
    /* JADX WARN: Code duplicated, block: B:210:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:216:0x03df  */
    /* JADX WARN: Code duplicated, block: B:218:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:224:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:226:0x040b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0417  */
    /* JADX WARN: Code duplicated, block: B:233:0x0437  */
    /* JADX WARN: Code duplicated, block: B:236:0x0446  */
    /* JADX WARN: Code duplicated, block: B:238:0x0450  */
    /* JADX WARN: Code duplicated, block: B:239:0x0456  */
    /* JADX WARN: Code duplicated, block: B:243:0x045f  */
    /* JADX WARN: Code duplicated, block: B:244:0x046c  */
    /* JADX WARN: Code duplicated, block: B:247:0x0474  */
    /* JADX WARN: Code duplicated, block: B:251:0x047f  */
    /* JADX WARN: Code duplicated, block: B:252:0x048b  */
    /* JADX WARN: Code duplicated, block: B:254:0x0491  */
    /* JADX WARN: Code duplicated, block: B:255:0x049d  */
    /* JADX WARN: Code duplicated, block: B:258:0x04a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:260:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:271:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[EDGE_INSN: B:35:0x0083->B:36:0x0084 BREAK  A[LOOP:0: B:14:0x0027->B:20:0x0041]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:71:0x0104  */
    /* JADX WARN: Code duplicated, block: B:73:0x010a  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:81:0x012f A[EDGE_INSN: B:81:0x012f->B:97:0x019b BREAK  A[LOOP:1: B:43:0x0095->B:56:0x00c1]] */
    /* JADX WARN: Code duplicated, block: B:82:0x013d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0151  */
    /* JADX WARN: Code duplicated, block: B:86:0x0165  */
    /* JADX WARN: Code duplicated, block: B:88:0x0179  */
    /* JADX WARN: Code duplicated, block: B:90:0x0180  */
    /* JADX WARN: Code duplicated, block: B:98:0x019d  */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x0151, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x0165, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final h1 j(int i10, long j10) {
        h1 childViewHolderInt;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i12;
        long j11;
        long j12;
        long j13;
        int itemViewType;
        long nanoTime;
        long j14;
        int i13;
        int i14;
        View view;
        long j15;
        ViewGroup.LayoutParams layoutParams;
        s0 s0Var;
        boolean z10;
        int iF;
        RecyclerView recyclerViewFindNestedRecyclerView;
        h1 h1Var;
        int size;
        int i15;
        ArrayList arrayList3;
        int size2;
        int i16;
        View view2;
        int size3;
        int i17;
        h1 h1Var2;
        d dVar;
        c cVar;
        int iIndexOfChild;
        c cVar2;
        int iIndexOfChild2;
        int iE;
        h1 childViewHolderInt2;
        int i18;
        boolean z11;
        int size4;
        int iF2;
        RecyclerView recyclerView = this.f4977h;
        if (i10 < 0 || i10 >= recyclerView.mState.b()) {
            StringBuilder sbL = l1.d.l("Invalid item position ", i10, "(", i10, "). Item count:");
            sbL.append(recyclerView.mState.b());
            sbL.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        int i19 = 1;
        if (recyclerView.mState.f4755g) {
            ArrayList arrayList4 = this.f4971b;
            if (arrayList4 != null && (size4 = arrayList4.size()) != 0) {
                int i20 = 0;
                while (true) {
                    if (i20 >= size4) {
                        if (recyclerView.mAdapter.hasStableIds() && (iF2 = recyclerView.mAdapterHelper.f(i10, 0)) > 0 && iF2 < recyclerView.mAdapter.getItemCount()) {
                            long itemId = recyclerView.mAdapter.getItemId(iF2);
                            int i21 = 0;
                            while (true) {
                                if (i21 >= size4) {
                                    childViewHolderInt = null;
                                    break;
                                }
                                h1 h1Var3 = (h1) this.f4971b.get(i21);
                                if (!h1Var3.wasReturnedFromScrap() && h1Var3.getItemId() == itemId) {
                                    h1Var3.addFlags(32);
                                    childViewHolderInt = h1Var3;
                                    break;
                                }
                                i21++;
                            }
                        } else {
                            childViewHolderInt = null;
                            break;
                        }
                    } else {
                        childViewHolderInt = (h1) this.f4971b.get(i20);
                        if (!childViewHolderInt.wasReturnedFromScrap() && childViewHolderInt.getLayoutPosition() == i10) {
                            childViewHolderInt.addFlags(32);
                            break;
                        }
                        i20++;
                    }
                }
            } else {
                childViewHolderInt = null;
                break;
            }
            if (childViewHolderInt != null) {
                i11 = 1;
            }
            arrayList = this.f4970a;
            arrayList2 = this.f4972c;
            if (childViewHolderInt == null) {
                size = arrayList.size();
                i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        arrayList3 = recyclerView.mChildHelper.f4742c;
                        size2 = arrayList3.size();
                        i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                view2 = null;
                                break;
                            }
                            view2 = (View) arrayList3.get(i16);
                            childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view2);
                            if (childViewHolderInt2.getLayoutPosition() != i10 && !childViewHolderInt2.isInvalid() && !childViewHolderInt2.isRemoved()) {
                                break;
                            }
                            i16++;
                        }
                        if (view2 != null) {
                            size3 = arrayList2.size();
                            i17 = 0;
                            while (true) {
                                if (i17 < size3) {
                                    childViewHolderInt = null;
                                    break;
                                }
                                h1Var2 = (h1) arrayList2.get(i17);
                                if (h1Var2.isInvalid() && h1Var2.getLayoutPosition() == i10) {
                                    arrayList2.remove(i17);
                                } else {
                                    i17++;
                                }
                            }
                        } else {
                            childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                            dVar = recyclerView.mChildHelper;
                            cVar = dVar.f4741b;
                            iIndexOfChild = dVar.f4740a.f4767a.indexOfChild(view2);
                            if (iIndexOfChild >= 0) {
                                throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                            }
                            if (cVar.G(iIndexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                            }
                            cVar.D(iIndexOfChild);
                            dVar.j(view2);
                            d dVar2 = recyclerView.mChildHelper;
                            cVar2 = dVar2.f4741b;
                            iIndexOfChild2 = dVar2.f4740a.f4767a.indexOfChild(view2);
                            if (iIndexOfChild2 == -1 && !cVar2.G(iIndexOfChild2)) {
                                iE = iIndexOfChild2 - cVar2.E(iIndexOfChild2);
                            } else {
                                iE = -1;
                            }
                            if (iE != -1) {
                                StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb2.append(childViewHolderInt);
                                throw new IllegalStateException(defpackage.e.k(recyclerView, sb2));
                            }
                            recyclerView.mChildHelper.c(iE);
                            i(view2);
                            childViewHolderInt.addFlags(8224);
                            break;
                        }
                    } else {
                        h1Var2 = (h1) arrayList.get(i15);
                        if (!h1Var2.wasReturnedFromScrap() || h1Var2.getLayoutPosition() != i10 || h1Var2.isInvalid() || (!recyclerView.mState.f4755g && h1Var2.isRemoved())) {
                            i15++;
                        } else {
                            h1Var2.addFlags(32);
                        }
                    }
                    childViewHolderInt = h1Var2;
                    break;
                }
                if (childViewHolderInt != null) {
                    if (childViewHolderInt.isRemoved()) {
                        z11 = recyclerView.mState.f4755g;
                    } else {
                        i18 = childViewHolderInt.mPosition;
                        if (i18 >= 0 || i18 >= recyclerView.mAdapter.getItemCount()) {
                            StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb3.append(childViewHolderInt);
                            throw new IndexOutOfBoundsException(defpackage.e.k(recyclerView, sb3));
                        }
                        z11 = (recyclerView.mState.f4755g || recyclerView.mAdapter.getItemViewType(childViewHolderInt.mPosition) == childViewHolderInt.getItemViewType()) && (!recyclerView.mAdapter.hasStableIds() || childViewHolderInt.getItemId() == recyclerView.mAdapter.getItemId(childViewHolderInt.mPosition));
                    }
                    if (z11) {
                        i11 = 1;
                    } else {
                        childViewHolderInt.addFlags(4);
                        if (childViewHolderInt.isScrap()) {
                            recyclerView.removeDetachedView(childViewHolderInt.itemView, false);
                            childViewHolderInt.unScrap();
                        } else if (childViewHolderInt.wasReturnedFromScrap()) {
                            childViewHolderInt.clearReturnedFromScrapFlag();
                        }
                        h(childViewHolderInt);
                        childViewHolderInt = null;
                    }
                }
            }
            if (childViewHolderInt == null) {
                j11 = 3;
                iF = recyclerView.mAdapterHelper.f(i10, 0);
                if (iF >= 0 || iF >= recyclerView.mAdapter.getItemCount()) {
                    StringBuilder sbL2 = l1.d.l("Inconsistency detected. Invalid item position ", i10, "(offset:", iF, ").state:");
                    sbL2.append(recyclerView.mState.b());
                    sbL2.append(recyclerView.exceptionLabel());
                    throw new IndexOutOfBoundsException(sbL2.toString());
                }
                int itemViewType2 = recyclerView.mAdapter.getItemViewType(iF);
                j12 = 4;
                if (recyclerView.mAdapter.hasStableIds()) {
                    long itemId2 = recyclerView.mAdapter.getItemId(iF);
                    int size5 = arrayList.size() - 1;
                    while (true) {
                        if (size5 < 0) {
                            i12 = i19;
                            j13 = 0;
                            int size6 = arrayList2.size() - 1;
                            while (true) {
                                if (size6 >= 0) {
                                    h1 h1Var4 = (h1) arrayList2.get(size6);
                                    if (h1Var4.getItemId() != itemId2) {
                                        size6--;
                                    } else {
                                        if (itemViewType2 == h1Var4.getItemViewType()) {
                                            arrayList2.remove(size6);
                                            childViewHolderInt = h1Var4;
                                            break;
                                        }
                                        f(size6);
                                    }
                                }
                                childViewHolderInt = null;
                                break;
                            }
                        }
                        j13 = 0;
                        h1 h1Var5 = (h1) arrayList.get(size5);
                        if (h1Var5.getItemId() != itemId2 || h1Var5.wasReturnedFromScrap()) {
                            i12 = i19;
                        } else {
                            i12 = i19;
                            if (itemViewType2 == h1Var5.getItemViewType()) {
                                h1Var5.addFlags(32);
                                if (h1Var5.isRemoved() && !recyclerView.mState.f4755g) {
                                    h1Var5.setFlags(2, 14);
                                }
                                childViewHolderInt = h1Var5;
                                break;
                            }
                            arrayList.remove(size5);
                            recyclerView.removeDetachedView(h1Var5.itemView, false);
                            h1 childViewHolderInt3 = RecyclerView.getChildViewHolderInt(h1Var5.itemView);
                            childViewHolderInt3.mScrapContainer = null;
                            childViewHolderInt3.mInChangeScrap = false;
                            childViewHolderInt3.clearReturnedFromScrapFlag();
                            h(childViewHolderInt3);
                        }
                        size5--;
                        i19 = i12;
                    }
                    if (childViewHolderInt != null) {
                        childViewHolderInt.mPosition = iF;
                        i11 = i12;
                    }
                } else {
                    i12 = 1;
                    j13 = 0;
                }
                if (childViewHolderInt == null) {
                    w0 w0Var = (w0) c().f4957a.get(itemViewType2);
                    if (w0Var != null) {
                        ArrayList arrayList5 = w0Var.f4949a;
                        if (arrayList5.isEmpty()) {
                            h1Var = null;
                        } else {
                            h1Var = (h1) arrayList5.remove(arrayList5.size() - 1);
                        }
                    } else {
                        h1Var = null;
                    }
                    if (h1Var != null) {
                        h1Var.resetInternal();
                        if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                            View view3 = h1Var.itemView;
                            if (view3 instanceof ViewGroup) {
                                d((ViewGroup) view3, false);
                            }
                        }
                    }
                    childViewHolderInt = h1Var;
                }
                if (childViewHolderInt == null) {
                    long nanoTime2 = recyclerView.getNanoTime();
                    if (j10 != Long.MAX_VALUE) {
                        long j16 = this.f4976g.a(itemViewType2).f4951c;
                        if (((j16 == j13 || j16 + nanoTime2 < j10) ? i12 : 0) == 0) {
                            return null;
                        }
                    }
                    h1 h1VarCreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType2);
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(h1VarCreateViewHolder.itemView)) != null) {
                        h1VarCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                    }
                    long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                    w0 w0VarA = this.f4976g.a(itemViewType2);
                    long j17 = w0VarA.f4951c;
                    if (j17 != j13) {
                        nanoTime3 = (nanoTime3 / 4) + ((j17 / 4) * 3);
                    }
                    w0VarA.f4951c = nanoTime3;
                    childViewHolderInt = h1VarCreateViewHolder;
                }
            } else {
                i12 = 1;
                j11 = 3;
                j12 = 4;
                j13 = 0;
            }
            if (i11 != 0 && !recyclerView.mState.f4755g && childViewHolderInt.hasAnyOfTheFlags(Segment.SIZE)) {
                childViewHolderInt.setFlags(0, Segment.SIZE);
                if (recyclerView.mState.f4758j) {
                    n0.b(childViewHolderInt);
                    n0 n0Var = recyclerView.mItemAnimator;
                    childViewHolderInt.getUnmodifiedPayloads();
                    n0Var.getClass();
                    m0 m0Var = new m0();
                    m0Var.a(childViewHolderInt);
                    recyclerView.recordAnimationInfoIfBouncedHiddenView(childViewHolderInt, m0Var);
                }
            }
            if (recyclerView.mState.f4755g || !childViewHolderInt.isBound()) {
                if (childViewHolderInt.isBound() || childViewHolderInt.needsUpdate() || childViewHolderInt.isInvalid()) {
                    int iF3 = recyclerView.mAdapterHelper.f(i10, 0);
                    childViewHolderInt.mOwnerRecyclerView = recyclerView;
                    itemViewType = childViewHolderInt.getItemViewType();
                    long nanoTime4 = recyclerView.getNanoTime();
                    if (j10 != Long.MAX_VALUE) {
                        j15 = this.f4976g.a(itemViewType).f4952d;
                        if (j15 != j13 || j15 + nanoTime4 < j10) {
                        }
                    }
                    recyclerView.mAdapter.bindViewHolder(childViewHolderInt, iF3);
                    nanoTime = recyclerView.getNanoTime() - nanoTime4;
                    w0 w0VarA2 = this.f4976g.a(childViewHolderInt.getItemViewType());
                    j14 = w0VarA2.f4952d;
                    if (j14 != j13) {
                        nanoTime = (nanoTime / j12) + ((j14 / j12) * j11);
                    }
                    w0VarA2.f4952d = nanoTime;
                    if (recyclerView.isAccessibilityEnabled()) {
                        view = childViewHolderInt.itemView;
                        WeakHashMap weakHashMap = m0.s0.f45746a;
                        if (view.getImportantForAccessibility() == 0) {
                            i13 = i12;
                            view.setImportantForAccessibility(i13);
                        } else {
                            i13 = i12;
                        }
                        if (m0.p0.a(view) == null) {
                            childViewHolderInt.addFlags(Http2.INITIAL_MAX_FRAME_SIZE);
                            m0.s0.f(view, recyclerView.mAccessibilityDelegate.f4799e);
                        }
                    } else {
                        i13 = i12;
                    }
                    if (recyclerView.mState.f4755g) {
                        childViewHolderInt.mPreLayoutPosition = i10;
                    }
                    i14 = i13;
                }
                layoutParams = childViewHolderInt.itemView.getLayoutParams();
                if (layoutParams == null) {
                    s0Var = (s0) recyclerView.generateDefaultLayoutParams();
                    childViewHolderInt.itemView.setLayoutParams(s0Var);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    s0Var = (s0) layoutParams;
                } else {
                    s0Var = (s0) recyclerView.generateLayoutParams(layoutParams);
                    childViewHolderInt.itemView.setLayoutParams(s0Var);
                }
                s0Var.f4925a = childViewHolderInt;
                if (i11 != 0 || i14 == 0) {
                    z10 = 0;
                } else {
                    z10 = i13;
                }
                s0Var.f4928d = z10;
                return childViewHolderInt;
            }
            childViewHolderInt.mPreLayoutPosition = i10;
            i14 = 0;
            i13 = i12;
            layoutParams = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams == null) {
                s0Var = (s0) recyclerView.generateDefaultLayoutParams();
                childViewHolderInt.itemView.setLayoutParams(s0Var);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                s0Var = (s0) recyclerView.generateLayoutParams(layoutParams);
                childViewHolderInt.itemView.setLayoutParams(s0Var);
            } else {
                s0Var = (s0) layoutParams;
            }
            s0Var.f4925a = childViewHolderInt;
            if (i11 != 0) {
                z10 = 0;
            } else {
                z10 = 0;
            }
            s0Var.f4928d = z10;
            return childViewHolderInt;
        }
        childViewHolderInt = null;
        i11 = 0;
        arrayList = this.f4970a;
        arrayList2 = this.f4972c;
        if (childViewHolderInt == null) {
            size = arrayList.size();
            i15 = 0;
            while (true) {
                if (i15 >= size) {
                    h1Var2 = (h1) arrayList.get(i15);
                    if (h1Var2.wasReturnedFromScrap()) {
                    }
                    i15++;
                } else {
                    arrayList3 = recyclerView.mChildHelper.f4742c;
                    size2 = arrayList3.size();
                    i16 = 0;
                    while (true) {
                        if (i16 < size2) {
                            view2 = null;
                            break;
                        }
                        view2 = (View) arrayList3.get(i16);
                        childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view2);
                        if (childViewHolderInt2.getLayoutPosition() != i10) {
                        }
                        i16++;
                    }
                    if (view2 != null) {
                        size3 = arrayList2.size();
                        i17 = 0;
                        while (true) {
                            if (i17 < size3) {
                                childViewHolderInt = null;
                                break;
                            }
                            h1Var2 = (h1) arrayList2.get(i17);
                            if (h1Var2.isInvalid()) {
                            }
                            i17++;
                        }
                    } else {
                        childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                        dVar = recyclerView.mChildHelper;
                        cVar = dVar.f4741b;
                        iIndexOfChild = dVar.f4740a.f4767a.indexOfChild(view2);
                        if (iIndexOfChild >= 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                        }
                        if (cVar.G(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                        }
                        cVar.D(iIndexOfChild);
                        dVar.j(view2);
                        d dVar3 = recyclerView.mChildHelper;
                        cVar2 = dVar3.f4741b;
                        iIndexOfChild2 = dVar3.f4740a.f4767a.indexOfChild(view2);
                        if (iIndexOfChild2 == -1) {
                            iE = -1;
                        } else {
                            iE = iIndexOfChild2 - cVar2.E(iIndexOfChild2);
                        }
                        if (iE != -1) {
                            StringBuilder sb4 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb4.append(childViewHolderInt);
                            throw new IllegalStateException(defpackage.e.k(recyclerView, sb4));
                        }
                        recyclerView.mChildHelper.c(iE);
                        i(view2);
                        childViewHolderInt.addFlags(8224);
                        break;
                    }
                    if (childViewHolderInt != null) {
                        if (childViewHolderInt.isRemoved()) {
                            i18 = childViewHolderInt.mPosition;
                            if (i18 >= 0) {
                            }
                            StringBuilder sb5 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb5.append(childViewHolderInt);
                            throw new IndexOutOfBoundsException(defpackage.e.k(recyclerView, sb5));
                        }
                        z11 = recyclerView.mState.f4755g;
                        if (z11) {
                            childViewHolderInt.addFlags(4);
                            if (childViewHolderInt.isScrap()) {
                                recyclerView.removeDetachedView(childViewHolderInt.itemView, false);
                                childViewHolderInt.unScrap();
                            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                                childViewHolderInt.clearReturnedFromScrapFlag();
                            }
                            h(childViewHolderInt);
                            childViewHolderInt = null;
                        } else {
                            i11 = 1;
                        }
                    }
                }
                childViewHolderInt = h1Var2;
                if (childViewHolderInt != null) {
                    if (childViewHolderInt.isRemoved()) {
                        i18 = childViewHolderInt.mPosition;
                        if (i18 >= 0) {
                        }
                        StringBuilder sb6 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb6.append(childViewHolderInt);
                        throw new IndexOutOfBoundsException(defpackage.e.k(recyclerView, sb6));
                    }
                    z11 = recyclerView.mState.f4755g;
                    if (z11) {
                        childViewHolderInt.addFlags(4);
                        if (childViewHolderInt.isScrap()) {
                            recyclerView.removeDetachedView(childViewHolderInt.itemView, false);
                            childViewHolderInt.unScrap();
                        } else if (childViewHolderInt.wasReturnedFromScrap()) {
                            childViewHolderInt.clearReturnedFromScrapFlag();
                        }
                        h(childViewHolderInt);
                        childViewHolderInt = null;
                    } else {
                        i11 = 1;
                    }
                }
            }
        }
        if (childViewHolderInt == null) {
            j11 = 3;
            iF = recyclerView.mAdapterHelper.f(i10, 0);
            if (iF >= 0) {
            }
            StringBuilder sbL3 = l1.d.l("Inconsistency detected. Invalid item position ", i10, "(offset:", iF, ").state:");
            sbL3.append(recyclerView.mState.b());
            sbL3.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbL3.toString());
        }
        i12 = 1;
        j11 = 3;
        j12 = 4;
        j13 = 0;
        if (i11 != 0) {
            childViewHolderInt.setFlags(0, Segment.SIZE);
            if (recyclerView.mState.f4758j) {
                n0.b(childViewHolderInt);
                n0 n0Var2 = recyclerView.mItemAnimator;
                childViewHolderInt.getUnmodifiedPayloads();
                n0Var2.getClass();
                m0 m0Var2 = new m0();
                m0Var2.a(childViewHolderInt);
                recyclerView.recordAnimationInfoIfBouncedHiddenView(childViewHolderInt, m0Var2);
            }
        }
        if (recyclerView.mState.f4755g) {
            if (childViewHolderInt.isBound()) {
                int iF4 = recyclerView.mAdapterHelper.f(i10, 0);
                childViewHolderInt.mOwnerRecyclerView = recyclerView;
                itemViewType = childViewHolderInt.getItemViewType();
                long nanoTime5 = recyclerView.getNanoTime();
                if (j10 != Long.MAX_VALUE) {
                    j15 = this.f4976g.a(itemViewType).f4952d;
                    if (j15 != j13) {
                    }
                }
                recyclerView.mAdapter.bindViewHolder(childViewHolderInt, iF4);
                nanoTime = recyclerView.getNanoTime() - nanoTime5;
                w0 w0VarA3 = this.f4976g.a(childViewHolderInt.getItemViewType());
                j14 = w0VarA3.f4952d;
                if (j14 != j13) {
                    nanoTime = (nanoTime / j12) + ((j14 / j12) * j11);
                }
                w0VarA3.f4952d = nanoTime;
                if (recyclerView.isAccessibilityEnabled()) {
                    view = childViewHolderInt.itemView;
                    WeakHashMap weakHashMap2 = m0.s0.f45746a;
                    if (view.getImportantForAccessibility() == 0) {
                        i13 = i12;
                        view.setImportantForAccessibility(i13);
                    } else {
                        i13 = i12;
                    }
                    if (m0.p0.a(view) == null) {
                        childViewHolderInt.addFlags(Http2.INITIAL_MAX_FRAME_SIZE);
                        m0.s0.f(view, recyclerView.mAccessibilityDelegate.f4799e);
                    }
                } else {
                    i13 = i12;
                }
                if (recyclerView.mState.f4755g) {
                    childViewHolderInt.mPreLayoutPosition = i10;
                }
                i14 = i13;
            } else {
                int iF5 = recyclerView.mAdapterHelper.f(i10, 0);
                childViewHolderInt.mOwnerRecyclerView = recyclerView;
                itemViewType = childViewHolderInt.getItemViewType();
                long nanoTime6 = recyclerView.getNanoTime();
                if (j10 != Long.MAX_VALUE) {
                    j15 = this.f4976g.a(itemViewType).f4952d;
                    if (j15 != j13) {
                    }
                }
                recyclerView.mAdapter.bindViewHolder(childViewHolderInt, iF5);
                nanoTime = recyclerView.getNanoTime() - nanoTime6;
                w0 w0VarA4 = this.f4976g.a(childViewHolderInt.getItemViewType());
                j14 = w0VarA4.f4952d;
                if (j14 != j13) {
                    nanoTime = (nanoTime / j12) + ((j14 / j12) * j11);
                }
                w0VarA4.f4952d = nanoTime;
                if (recyclerView.isAccessibilityEnabled()) {
                    view = childViewHolderInt.itemView;
                    WeakHashMap weakHashMap3 = m0.s0.f45746a;
                    if (view.getImportantForAccessibility() == 0) {
                        i13 = i12;
                        view.setImportantForAccessibility(i13);
                    } else {
                        i13 = i12;
                    }
                    if (m0.p0.a(view) == null) {
                        childViewHolderInt.addFlags(Http2.INITIAL_MAX_FRAME_SIZE);
                        m0.s0.f(view, recyclerView.mAccessibilityDelegate.f4799e);
                    }
                } else {
                    i13 = i12;
                }
                if (recyclerView.mState.f4755g) {
                    childViewHolderInt.mPreLayoutPosition = i10;
                }
                i14 = i13;
            }
        } else if (childViewHolderInt.isBound()) {
            int iF6 = recyclerView.mAdapterHelper.f(i10, 0);
            childViewHolderInt.mOwnerRecyclerView = recyclerView;
            itemViewType = childViewHolderInt.getItemViewType();
            long nanoTime7 = recyclerView.getNanoTime();
            if (j10 != Long.MAX_VALUE) {
                j15 = this.f4976g.a(itemViewType).f4952d;
                if (j15 != j13) {
                }
            }
            recyclerView.mAdapter.bindViewHolder(childViewHolderInt, iF6);
            nanoTime = recyclerView.getNanoTime() - nanoTime7;
            w0 w0VarA5 = this.f4976g.a(childViewHolderInt.getItemViewType());
            j14 = w0VarA5.f4952d;
            if (j14 != j13) {
                nanoTime = (nanoTime / j12) + ((j14 / j12) * j11);
            }
            w0VarA5.f4952d = nanoTime;
            if (recyclerView.isAccessibilityEnabled()) {
                view = childViewHolderInt.itemView;
                WeakHashMap weakHashMap4 = m0.s0.f45746a;
                if (view.getImportantForAccessibility() == 0) {
                    i13 = i12;
                    view.setImportantForAccessibility(i13);
                } else {
                    i13 = i12;
                }
                if (m0.p0.a(view) == null) {
                    childViewHolderInt.addFlags(Http2.INITIAL_MAX_FRAME_SIZE);
                    m0.s0.f(view, recyclerView.mAccessibilityDelegate.f4799e);
                }
            } else {
                i13 = i12;
            }
            if (recyclerView.mState.f4755g) {
                childViewHolderInt.mPreLayoutPosition = i10;
            }
            i14 = i13;
        } else {
            int iF7 = recyclerView.mAdapterHelper.f(i10, 0);
            childViewHolderInt.mOwnerRecyclerView = recyclerView;
            itemViewType = childViewHolderInt.getItemViewType();
            long nanoTime8 = recyclerView.getNanoTime();
            if (j10 != Long.MAX_VALUE) {
                j15 = this.f4976g.a(itemViewType).f4952d;
                if (j15 != j13) {
                }
            }
            recyclerView.mAdapter.bindViewHolder(childViewHolderInt, iF7);
            nanoTime = recyclerView.getNanoTime() - nanoTime8;
            w0 w0VarA6 = this.f4976g.a(childViewHolderInt.getItemViewType());
            j14 = w0VarA6.f4952d;
            if (j14 != j13) {
                nanoTime = (nanoTime / j12) + ((j14 / j12) * j11);
            }
            w0VarA6.f4952d = nanoTime;
            if (recyclerView.isAccessibilityEnabled()) {
                view = childViewHolderInt.itemView;
                WeakHashMap weakHashMap5 = m0.s0.f45746a;
                if (view.getImportantForAccessibility() == 0) {
                    i13 = i12;
                    view.setImportantForAccessibility(i13);
                } else {
                    i13 = i12;
                }
                if (m0.p0.a(view) == null) {
                    childViewHolderInt.addFlags(Http2.INITIAL_MAX_FRAME_SIZE);
                    m0.s0.f(view, recyclerView.mAccessibilityDelegate.f4799e);
                }
            } else {
                i13 = i12;
            }
            if (recyclerView.mState.f4755g) {
                childViewHolderInt.mPreLayoutPosition = i10;
            }
            i14 = i13;
        }
        layoutParams = childViewHolderInt.itemView.getLayoutParams();
        if (layoutParams == null) {
            s0Var = (s0) recyclerView.generateDefaultLayoutParams();
            childViewHolderInt.itemView.setLayoutParams(s0Var);
        } else if (recyclerView.checkLayoutParams(layoutParams)) {
            s0Var = (s0) recyclerView.generateLayoutParams(layoutParams);
            childViewHolderInt.itemView.setLayoutParams(s0Var);
        } else {
            s0Var = (s0) layoutParams;
        }
        s0Var.f4925a = childViewHolderInt;
        if (i11 != 0) {
            z10 = 0;
        } else {
            z10 = 0;
        }
        s0Var.f4928d = z10;
        return childViewHolderInt;
    }

    public final void k(h1 h1Var) {
        if (h1Var.mInChangeScrap) {
            this.f4971b.remove(h1Var);
        } else {
            this.f4970a.remove(h1Var);
        }
        h1Var.mScrapContainer = null;
        h1Var.mInChangeScrap = false;
        h1Var.clearReturnedFromScrapFlag();
    }

    public final void l() {
        r0 r0Var = this.f4977h.mLayout;
        this.f4975f = this.f4974e + (r0Var != null ? r0Var.f4914j : 0);
        ArrayList arrayList = this.f4972c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f4975f; size--) {
            f(size);
        }
    }
}
