package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.storage.androidcleaner.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f4433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Context context, AttributeSet attrs, g1 g1Var) {
        View view;
        super(context, attrs);
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(attrs, "attrs");
        this.f4431a = new ArrayList();
        this.f4432b = new ArrayList();
        this.f4434d = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, b1.a.f5210b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment fragmentB = g1Var.B(id2);
        if (classAttribute != null && fragmentB == null) {
            if (id2 == -1) {
                throw new IllegalStateException(defpackage.e.o("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            y0 y0VarG = g1Var.G();
            context.getClassLoader();
            Fragment fragmentInstantiate = Fragment.instantiate(y0VarG.f4514a.f4343w.f4443b, classAttribute, null);
            kotlin.jvm.internal.n.e(fragmentInstantiate, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentInstantiate.mFragmentId = id2;
            fragmentInstantiate.mContainerId = id2;
            fragmentInstantiate.mTag = string;
            fragmentInstantiate.mFragmentManager = g1Var;
            fragmentInstantiate.mHost = g1Var.f4343w;
            fragmentInstantiate.onInflate(context, attrs, (Bundle) null);
            a aVar = new a(g1Var);
            aVar.f4239o = true;
            fragmentInstantiate.mContainer = this;
            fragmentInstantiate.mInDynamicContainer = true;
            aVar.g(getId(), fragmentInstantiate, string);
            if (aVar.f4232g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            g1 g1Var2 = aVar.f4241q;
            if (g1Var2.f4343w != null && !g1Var2.J) {
                g1Var2.y(true);
                a aVar2 = g1Var2.f4329h;
                if (aVar2 != null) {
                    aVar2.f4242r = false;
                    aVar2.d();
                    if (g1.J(3)) {
                        Log.d("FragmentManager", "Reversing mTransitioningOp " + g1Var2.f4329h + " as part of execSingleAction for action " + aVar);
                    }
                    g1Var2.f4329h.f(false, false);
                    g1Var2.f4329h.a(g1Var2.L, g1Var2.M);
                    Iterator it = g1Var2.f4329h.f4226a.iterator();
                    while (it.hasNext()) {
                        Fragment fragment = ((q1) it.next()).f4447b;
                        if (fragment != null) {
                            fragment.mTransitioning = false;
                        }
                    }
                    g1Var2.f4329h = null;
                }
                aVar.a(g1Var2.L, g1Var2.M);
                g1Var2.f4323b = true;
                try {
                    g1Var2.U(g1Var2.L, g1Var2.M);
                    g1Var2.d();
                    g1Var2.f0();
                    if (g1Var2.K) {
                        g1Var2.K = false;
                        g1Var2.d0();
                    }
                    g1Var2.f4324c.f4436b.values().removeAll(Collections.singleton(null));
                } catch (Throwable th2) {
                    g1Var2.d();
                    throw th2;
                }
            }
        }
        for (o1 o1Var : g1Var.f4324c.d()) {
            Fragment fragment2 = o1Var.f4414c;
            if (fragment2.mContainerId == getId() && (view = fragment2.mView) != null && view.getParent() == null) {
                fragment2.mContainer = this;
                o1Var.b();
                o1Var.k();
            }
        }
    }

    public final void a(View view) {
        if (this.f4432b.contains(view)) {
            this.f4431a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i10, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.n.f(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(child, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        m0.r1 r1VarD;
        kotlin.jvm.internal.n.f(insets, "insets");
        m0.r1 r1VarG = m0.r1.g(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4433c;
        if (onApplyWindowInsetsListener != null) {
            kotlin.jvm.internal.n.c(onApplyWindowInsetsListener);
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.n.e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            r1VarD = m0.r1.g(null, windowInsetsOnApplyWindowInsets);
        } else {
            r1VarD = m0.s0.d(this, r1VarG);
        }
        if (!r1VarD.f45740a.n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                m0.s0.b(getChildAt(i10), r1VarD);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.n.f(canvas, "canvas");
        if (this.f4434d) {
            Iterator it = this.f4431a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j10) {
        kotlin.jvm.internal.n.f(canvas, "canvas");
        kotlin.jvm.internal.n.f(child, "child");
        if (this.f4434d) {
            ArrayList arrayList = this.f4431a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j10);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.n.f(view, "view");
        this.f4432b.remove(view);
        if (this.f4431a.remove(view)) {
            this.f4434d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        FragmentActivity fragmentActivity;
        Fragment fragment;
        g1 g1VarF;
        View view = this;
        while (true) {
            fragmentActivity = null;
            if (view == null) {
                fragment = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (fragment == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
            }
            if (fragmentActivity == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            g1VarF = fragmentActivity.F();
        } else {
            if (!fragment.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            g1VarF = fragment.getChildFragmentManager();
        }
        return (F) g1VarF.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.n.f(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                kotlin.jvm.internal.n.e(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        kotlin.jvm.internal.n.f(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View view = getChildAt(i10);
        kotlin.jvm.internal.n.e(view, "view");
        a(view);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.n.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.n.e(view, "view");
            a(view);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.n.e(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f4434d = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f4433c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        kotlin.jvm.internal.n.f(view, "view");
        if (view.getParent() == this) {
            this.f4432b.add(view);
        }
        super.startViewTransition(view);
    }
}
