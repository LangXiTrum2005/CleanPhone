package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OverScroller f4776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Interpolator f4777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4780g;

    public g1(RecyclerView recyclerView) {
        this.f4780g = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.f4777d = interpolator;
        this.f4778e = false;
        this.f4779f = false;
        this.f4776c = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final int a(int i10, int i11) {
        int iRound;
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        boolean z10 = iAbs > iAbs2;
        int iSqrt = (int) Math.sqrt(0);
        int iSqrt2 = (int) Math.sqrt((i11 * i11) + (i10 * i10));
        RecyclerView recyclerView = this.f4780g;
        int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i12 = width / 2;
        float f10 = width;
        float f11 = i12;
        float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
        if (iSqrt > 0) {
            iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
        } else {
            if (!z10) {
                iAbs = iAbs2;
            }
            iRound = (int) (((iAbs / f10) + 1.0f) * 300.0f);
        }
        return Math.min(iRound, 2000);
    }

    public final void b() {
        if (this.f4778e) {
            this.f4779f = true;
            return;
        }
        RecyclerView recyclerView = this.f4780g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = m0.s0.f45746a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i10, int i11, int i12, Interpolator interpolator) {
        Interpolator interpolator2 = this.f4777d;
        RecyclerView recyclerView = this.f4780g;
        if (interpolator2 != interpolator) {
            this.f4777d = interpolator;
            this.f4776c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        recyclerView.setScrollState(2);
        this.f4775b = 0;
        this.f4774a = 0;
        this.f4776c.startScroll(0, 0, i10, i11, i12);
        b();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        RecyclerView recyclerView = this.f4780g;
        if (recyclerView.mLayout == null) {
            recyclerView.removeCallbacks(this);
            this.f4776c.abortAnimation();
            return;
        }
        this.f4779f = false;
        this.f4778e = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.f4776c;
        a0 a0Var = recyclerView.mLayout.f4909e;
        if (overScroller.computeScrollOffset()) {
            int[] iArr = recyclerView.mScrollConsumed;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f4774a;
            int i16 = currY - this.f4775b;
            this.f4774a = currX;
            this.f4775b = currY;
            if (recyclerView.dispatchNestedPreScroll(i15, i16, iArr, null, 1)) {
                i15 -= iArr[0];
                i16 -= iArr[1];
            }
            int i17 = i15;
            int i18 = i16;
            if (recyclerView.mAdapter != null) {
                recyclerView.scrollStep(i17, i18, recyclerView.mScrollStepConsumed);
                int[] iArr2 = recyclerView.mScrollStepConsumed;
                int i19 = iArr2[0];
                int i20 = iArr2[1];
                i12 = i17 - i19;
                i13 = i18 - i20;
                if (a0Var != 0 && !a0Var.f4708d && a0Var.f4709e) {
                    int iB = recyclerView.mState.b();
                    if (iB == 0) {
                        a0Var.d();
                    } else if (a0Var.f4705a >= iB) {
                        a0Var.f4705a = iB - 1;
                        a0Var.c(i17 - i12, i18 - i13);
                    } else {
                        a0Var.c(i17 - i12, i18 - i13);
                    }
                }
                i11 = i20;
                i10 = i19;
            } else {
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.mItemDecorations.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.considerReleasingGlowsOnScroll(i17, i18);
            }
            if (!recyclerView.dispatchNestedScroll(i10, i11, i12, i13, null, 1) && (i12 != 0 || i13 != 0)) {
                int currVelocity = (int) overScroller.getCurrVelocity();
                if (i12 == currX) {
                    i14 = 0;
                } else if (i12 < 0) {
                    i14 = -currVelocity;
                } else if (i12 > 0) {
                    i14 = currVelocity;
                } else {
                    i14 = 0;
                }
                if (i13 == currY) {
                    currVelocity = 0;
                } else if (i13 < 0) {
                    currVelocity = -currVelocity;
                } else if (i13 <= 0) {
                    currVelocity = 0;
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.absorbGlows(i14, currVelocity);
                }
                if ((i14 != 0 || i12 == currX || overScroller.getFinalX() == 0) && (currVelocity != 0 || i13 == currY || overScroller.getFinalY() == 0)) {
                    overScroller.abortAnimation();
                }
            }
            if (i10 != 0 || i11 != 0) {
                recyclerView.dispatchOnScrolled(i10, i11);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z10 = (i17 == 0 && i18 == 0) || (i17 != 0 && recyclerView.mLayout.d() && i10 == i17) || (i18 != 0 && recyclerView.mLayout.e() && i11 == i18);
            if (overScroller.isFinished() || !(z10 || recyclerView.hasNestedScrollingParent(1))) {
                r2 = 0;
                recyclerView.setScrollState(0);
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    q qVar = recyclerView.mPrefetchRegistry;
                    int[] iArr3 = qVar.f4890c;
                    if (iArr3 != null) {
                        Arrays.fill(iArr3, -1);
                    }
                    qVar.f4891d = 0;
                }
                recyclerView.stopNestedScroll(1);
            } else {
                b();
                s sVar = recyclerView.mGapWorker;
                if (sVar != null) {
                    sVar.a(recyclerView, i17, i18);
                }
                r2 = 0;
            }
        } else {
            r2 = 0;
        }
        if (a0Var != 0) {
            if (a0Var.f4708d) {
                a0Var.c(r2, r2);
            }
            if (!this.f4779f) {
                a0Var.d();
            }
        }
        this.f4778e = r2;
        if (this.f4779f) {
            b();
        }
    }
}
