package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/FragmentWrapper;", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class FragmentWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f16323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.app.Fragment f16324b;

    public FragmentWrapper(Fragment fragment) {
        Intrinsics.f(fragment, "fragment");
        this.f16323a = fragment;
    }

    public final Activity a() {
        Fragment fragment = this.f16323a;
        if (fragment != null) {
            if (fragment != null) {
                return fragment.getActivity();
            }
            return null;
        }
        android.app.Fragment fragment2 = this.f16324b;
        if (fragment2 != null) {
            return fragment2.getActivity();
        }
        return null;
    }

    public final void b(Intent intent, int i2) {
        Fragment fragment = this.f16323a;
        if (fragment != null) {
            if (fragment != null) {
                fragment.startActivityForResult(intent, i2);
            }
        } else {
            android.app.Fragment fragment2 = this.f16324b;
            if (fragment2 != null) {
                fragment2.startActivityForResult(intent, i2);
            }
        }
    }

    public FragmentWrapper(android.app.Fragment fragment) {
        Intrinsics.f(fragment, "fragment");
        this.f16324b = fragment;
    }
}
