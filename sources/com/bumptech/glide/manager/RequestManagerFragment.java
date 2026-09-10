package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.util.Util;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RequestManagerFragment extends Fragment {
    public final ActivityFragmentLifecycle X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final RequestManagerTreeNode f12752Y;
    public final HashSet Z;
    public RequestManager e0;
    public RequestManagerFragment f0;

    public class FragmentRequestManagerTreeNode implements RequestManagerTreeNode {
        public FragmentRequestManagerTreeNode() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + "}";
        }
    }

    public RequestManagerFragment() {
        ActivityFragmentLifecycle activityFragmentLifecycle = new ActivityFragmentLifecycle();
        this.f12752Y = new FragmentRequestManagerTreeNode();
        this.Z = new HashSet();
        this.X = activityFragmentLifecycle;
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            RequestManagerFragment requestManagerFragment = this.f0;
            if (requestManagerFragment != null) {
                requestManagerFragment.Z.remove(this);
                this.f0 = null;
            }
            RequestManagerRetriever requestManagerRetriever = Glide.a(activity).f0;
            requestManagerRetriever.getClass();
            RequestManagerFragment requestManagerFragmentD = requestManagerRetriever.d(activity.getFragmentManager());
            this.f0 = requestManagerFragmentD;
            if (equals(requestManagerFragmentD)) {
                return;
            }
            this.f0.Z.add(this);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.X.c();
        RequestManagerFragment requestManagerFragment = this.f0;
        if (requestManagerFragment != null) {
            requestManagerFragment.Z.remove(this);
            this.f0 = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        RequestManagerFragment requestManagerFragment = this.f0;
        if (requestManagerFragment != null) {
            requestManagerFragment.Z.remove(this);
            this.f0 = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        ActivityFragmentLifecycle activityFragmentLifecycle = this.X;
        activityFragmentLifecycle.f12746Y = true;
        Iterator it = Util.e(activityFragmentLifecycle.X).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        ActivityFragmentLifecycle activityFragmentLifecycle = this.X;
        activityFragmentLifecycle.f12746Y = false;
        Iterator it = Util.e(activityFragmentLifecycle.X).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStop();
        }
    }

    @Override // android.app.Fragment
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
