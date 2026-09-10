package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;

/* JADX INFO: compiled from: FragmentLayoutInflaterFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class rotuma implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final FragmentManager f10371kowloon;

    public rotuma(FragmentManager fragmentManager) {
        this.f10371kowloon = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        merc mercVarCuirassed;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f10371kowloon);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, prefect.dern.Fragment);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(prefect.dern.Fragment_android_name);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(prefect.dern.Fragment_android_id, -1);
        String string = typedArrayObtainStyledAttributes.getString(prefect.dern.Fragment_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !graveside.saneness(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentCoi = resourceId != -1 ? this.f10371kowloon.coi(resourceId) : null;
        if (fragmentCoi == null && string != null) {
            fragmentCoi = this.f10371kowloon.czestochowa(string);
        }
        if (fragmentCoi == null && id != -1) {
            fragmentCoi = this.f10371kowloon.coi(id);
        }
        if (fragmentCoi == null) {
            fragmentCoi = this.f10371kowloon.achondroplasia().attabal(context.getClassLoader(), attributeValue);
            fragmentCoi.mFromLayout = true;
            fragmentCoi.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentCoi.mContainerId = id;
            fragmentCoi.mTag = string;
            fragmentCoi.mInLayout = true;
            FragmentManager fragmentManager = this.f10371kowloon;
            fragmentCoi.mFragmentManager = fragmentManager;
            fragmentCoi.mHost = fragmentManager.claque();
            fragmentCoi.onInflate(this.f10371kowloon.claque().getContext(), attributeSet, fragmentCoi.mSavedFragmentState);
            mercVarCuirassed = this.f10371kowloon.formularize(fragmentCoi);
            if (FragmentManager.deadwork(2)) {
                fragmentCoi.toString();
                Integer.toHexString(resourceId);
            }
        } else {
            if (fragmentCoi.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentCoi.mInLayout = true;
            FragmentManager fragmentManager2 = this.f10371kowloon;
            fragmentCoi.mFragmentManager = fragmentManager2;
            fragmentCoi.mHost = fragmentManager2.claque();
            fragmentCoi.onInflate(this.f10371kowloon.claque().getContext(), attributeSet, fragmentCoi.mSavedFragmentState);
            mercVarCuirassed = this.f10371kowloon.cuirassed(fragmentCoi);
            if (FragmentManager.deadwork(2)) {
                fragmentCoi.toString();
                Integer.toHexString(resourceId);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        FragmentStrictMode.competently(fragmentCoi, viewGroup);
        fragmentCoi.mContainer = viewGroup;
        mercVarCuirassed.impassible();
        mercVarCuirassed.cutely();
        View view2 = fragmentCoi.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentCoi.mView.getTag() == null) {
            fragmentCoi.mView.setTag(string);
        }
        fragmentCoi.mView.addOnAttachStateChangeListener(new attabal(mercVarCuirassed));
        return fragmentCoi.mView;
    }

    /* JADX INFO: compiled from: FragmentLayoutInflaterFactory.java */
    public class attabal implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ merc f10373kowloon;

        public attabal(merc mercVar) {
            this.f10373kowloon = mercVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentApical = this.f10373kowloon.apical();
            this.f10373kowloon.impassible();
            SpecialEffectsController.adultoid((ViewGroup) fragmentApical.mView.getParent(), rotuma.this.f10371kowloon).monoploid();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
