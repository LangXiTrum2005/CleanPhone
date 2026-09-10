package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import kotlin.collections.EmptySet;

/* JADX INFO: loaded from: classes.dex */
class FragmentLayoutInflaterFactory implements LayoutInflater.Factory2 {
    public final FragmentManager X;

    public FragmentLayoutInflaterFactory(FragmentManager fragmentManager) {
        this.X = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        final FragmentStateManager fragmentStateManagerG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.X;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f5074a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = Fragment.class.isAssignableFrom(FragmentFactory.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragmentB = resourceId != -1 ? fragmentManager.B(resourceId) : null;
                    if (fragmentB == null && string != null) {
                        fragmentB = fragmentManager.C(string);
                    }
                    if (fragmentB == null && id != -1) {
                        fragmentB = fragmentManager.B(id);
                    }
                    if (fragmentB == null) {
                        fragmentB = fragmentManager.E().a(context.getClassLoader(), attributeValue);
                        fragmentB.mFromLayout = true;
                        fragmentB.mFragmentId = resourceId != 0 ? resourceId : id;
                        fragmentB.mContainerId = id;
                        fragmentB.mTag = string;
                        fragmentB.mInLayout = true;
                        fragmentB.mFragmentManager = fragmentManager;
                        FragmentHostCallback<?> fragmentHostCallback = fragmentManager.f5129u;
                        fragmentB.mHost = fragmentHostCallback;
                        fragmentB.onInflate((Context) fragmentHostCallback.f5109Y, attributeSet, fragmentB.mSavedFragmentState);
                        fragmentStateManagerG = fragmentManager.a(fragmentB);
                        if (FragmentManager.I(2)) {
                            Log.v("FragmentManager", "Fragment " + fragmentB + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fragmentB.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        fragmentB.mInLayout = true;
                        fragmentB.mFragmentManager = fragmentManager;
                        FragmentHostCallback<?> fragmentHostCallback2 = fragmentManager.f5129u;
                        fragmentB.mHost = fragmentHostCallback2;
                        fragmentB.onInflate((Context) fragmentHostCallback2.f5109Y, attributeSet, fragmentB.mSavedFragmentState);
                        fragmentStateManagerG = fragmentManager.g(fragmentB);
                        if (FragmentManager.I(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragmentB + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    FragmentStrictMode.Policy policy = FragmentStrictMode.f5209a;
                    FragmentStrictMode.b(new FragmentTagUsageViolation(fragmentB, viewGroup));
                    FragmentStrictMode.a(fragmentB).getClass();
                    EmptySet.X.contains(FragmentStrictMode.Flag.f5210Y);
                    fragmentB.mContainer = viewGroup;
                    fragmentStateManagerG.k();
                    fragmentStateManagerG.j();
                    View view2 = fragmentB.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(android.support.v4.media.a.n("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragmentB.mView.getTag() == null) {
                        fragmentB.mView.setTag(string);
                    }
                    fragmentB.mView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentLayoutInflaterFactory.1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public final void onViewAttachedToWindow(View view3) {
                            FragmentStateManager fragmentStateManager = fragmentStateManagerG;
                            fragmentStateManager.k();
                            SpecialEffectsController.f((ViewGroup) fragmentStateManager.f5150c.mView.getParent(), FragmentLayoutInflaterFactory.this.X).e();
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public final void onViewDetachedFromWindow(View view3) {
                        }
                    });
                    return fragmentB.mView;
                }
            }
        }
        return null;
    }
}
