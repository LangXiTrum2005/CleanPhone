package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f4467a;

    public s0(g1 g1Var) {
        this.f4467a = g1Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        o1 o1VarG;
        boolean zEquals = p0.class.getName().equals(str);
        g1 g1Var = this.f4467a;
        if (zEquals) {
            return new p0(context, attributeSet, g1Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b1.a.f5209a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = Fragment.class.isAssignableFrom(y0.a(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragmentB = resourceId != -1 ? g1Var.B(resourceId) : null;
                    if (fragmentB == null && string != null) {
                        fragmentB = g1Var.C(string);
                    }
                    if (fragmentB == null && id2 != -1) {
                        fragmentB = g1Var.B(id2);
                    }
                    if (fragmentB == null) {
                        y0 y0VarG = g1Var.G();
                        context.getClassLoader();
                        fragmentB = Fragment.instantiate(y0VarG.f4514a.f4343w.f4443b, attributeValue, null);
                        fragmentB.mFromLayout = true;
                        fragmentB.mFragmentId = resourceId != 0 ? resourceId : id2;
                        fragmentB.mContainerId = id2;
                        fragmentB.mTag = string;
                        fragmentB.mInLayout = true;
                        fragmentB.mFragmentManager = g1Var;
                        q0 q0Var = g1Var.f4343w;
                        fragmentB.mHost = q0Var;
                        fragmentB.onInflate((Context) q0Var.f4443b, attributeSet, fragmentB.mSavedFragmentState);
                        o1VarG = g1Var.a(fragmentB);
                        if (g1.J(2)) {
                            Log.v("FragmentManager", "Fragment " + fragmentB + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fragmentB.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        fragmentB.mInLayout = true;
                        fragmentB.mFragmentManager = g1Var;
                        q0 q0Var2 = g1Var.f4343w;
                        fragmentB.mHost = q0Var2;
                        fragmentB.onInflate((Context) q0Var2.f4443b, attributeSet, fragmentB.mSavedFragmentState);
                        o1VarG = g1Var.g(fragmentB);
                        if (g1.J(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragmentB + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    c1.b bVar = c1.c.f5831a;
                    c1.c.b(new c1.d(fragmentB, viewGroup, 0));
                    c1.c.a(fragmentB).getClass();
                    fragmentB.mContainer = viewGroup;
                    o1VarG.k();
                    o1VarG.j();
                    View view2 = fragmentB.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(defpackage.e.o("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragmentB.mView.getTag() == null) {
                        fragmentB.mView.setTag(string);
                    }
                    fragmentB.mView.addOnAttachStateChangeListener(new r0(this, o1VarG));
                    return fragmentB.mView;
                }
            }
        }
        return null;
    }
}
