package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bumptech.glide.Glide;
import com.bumptech.glide.util.Util;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class SupportRequestManagerFragment extends Fragment {
    public final ActivityFragmentLifecycle X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final HashSet f12769Y;
    public SupportRequestManagerFragment Z;

    public class SupportFragmentRequestManagerTreeNode implements RequestManagerTreeNode {
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            throw null;
        }
    }

    public SupportRequestManagerFragment() {
        ActivityFragmentLifecycle activityFragmentLifecycle = new ActivityFragmentLifecycle();
        this.f12769Y = new HashSet();
        this.X = activityFragmentLifecycle;
    }

    public final void b(Context context, FragmentManager fragmentManager) {
        SupportRequestManagerFragment supportRequestManagerFragment = this.Z;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.f12769Y.remove(this);
            this.Z = null;
        }
        RequestManagerRetriever requestManagerRetriever = Glide.a(context).f0;
        HashMap map = requestManagerRetriever.Z;
        SupportRequestManagerFragment supportRequestManagerFragment2 = (SupportRequestManagerFragment) map.get(fragmentManager);
        if (supportRequestManagerFragment2 == null) {
            SupportRequestManagerFragment supportRequestManagerFragment3 = (SupportRequestManagerFragment) fragmentManager.C("com.bumptech.glide.manager");
            if (supportRequestManagerFragment3 == null) {
                supportRequestManagerFragment3 = new SupportRequestManagerFragment();
                map.put(fragmentManager, supportRequestManagerFragment3);
                FragmentTransaction fragmentTransactionD = fragmentManager.d();
                fragmentTransactionD.h(0, supportRequestManagerFragment3, "com.bumptech.glide.manager", 1);
                fragmentTransactionD.d();
                requestManagerRetriever.e0.obtainMessage(2, fragmentManager).sendToTarget();
            }
            supportRequestManagerFragment2 = supportRequestManagerFragment3;
        }
        this.Z = supportRequestManagerFragment2;
        if (equals(supportRequestManagerFragment2)) {
            return;
        }
        this.Z.f12769Y.add(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = this;
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        FragmentManager fragmentManager = parentFragment.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                b(getContext(), fragmentManager);
            } catch (IllegalStateException e2) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e2);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.X.c();
        SupportRequestManagerFragment supportRequestManagerFragment = this.Z;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.f12769Y.remove(this);
            this.Z = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        SupportRequestManagerFragment supportRequestManagerFragment = this.Z;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.f12769Y.remove(this);
            this.Z = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ActivityFragmentLifecycle activityFragmentLifecycle = this.X;
        activityFragmentLifecycle.f12746Y = true;
        Iterator it = Util.e(activityFragmentLifecycle.X).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ActivityFragmentLifecycle activityFragmentLifecycle = this.X;
        activityFragmentLifecycle.f12746Y = false;
        Iterator it = Util.e(activityFragmentLifecycle.X).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStop();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
