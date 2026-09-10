package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.h1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    @NonNull
    protected final h mLifecycleFragment;

    public g(h hVar) {
        this.mLifecycleFragment = hVar;
    }

    @NonNull
    public static h getFragment(@NonNull Activity activity) {
        return getFragment(new f(activity));
    }

    @NonNull
    public Activity getActivity() {
        Activity activityU = this.mLifecycleFragment.u();
        k9.c0.h(activityU);
        return activityU;
    }

    public abstract void onStop();

    @NonNull
    public static h getFragment(@NonNull f fVar) {
        l0 l0Var;
        n0 n0Var;
        Activity activity = fVar.f11710a;
        if (!(activity instanceof FragmentActivity)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = l0.f11727b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (l0Var = (l0) weakReference.get()) != null) {
                return l0Var;
            }
            try {
                l0 l0Var2 = (l0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (l0Var2 == null || l0Var2.isRemoving()) {
                    l0Var2 = new l0();
                    activity.getFragmentManager().beginTransaction().add(l0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(l0Var2));
                return l0Var2;
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
            }
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        WeakHashMap weakHashMap2 = n0.f11739b;
        h1 h1VarF = fragmentActivity.F();
        WeakHashMap weakHashMap3 = n0.f11739b;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(fragmentActivity);
        if (weakReference2 != null && (n0Var = (n0) weakReference2.get()) != null) {
            return n0Var;
        }
        try {
            n0 n0Var2 = (n0) h1VarF.C("SLifecycleFragmentImpl");
            if (n0Var2 == null || n0Var2.isRemoving()) {
                n0Var2 = new n0();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(h1VarF);
                aVar.g(0, n0Var2, "SLifecycleFragmentImpl");
                aVar.f(true, true);
            }
            weakHashMap3.put(fragmentActivity, new WeakReference(n0Var2));
            return n0Var2;
        } catch (ClassCastException e11) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e11);
        }
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    @NonNull
    public static h getFragment(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public void onCreate(@Nullable Bundle bundle) {
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }
}
