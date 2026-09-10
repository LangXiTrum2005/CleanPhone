package com.gyf.immersionbar;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes3.dex */
public final class SupportRequestBarManagerFragment extends Fragment {
    public ImmersionDelegate X;

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ImmersionDelegate immersionDelegate = this.X;
        if (immersionDelegate != null) {
            getResources().getConfiguration();
            immersionDelegate.b();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ImmersionDelegate immersionDelegate = this.X;
        if (immersionDelegate != null) {
            immersionDelegate.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ImmersionDelegate immersionDelegate = this.X;
        if (immersionDelegate != null) {
            immersionDelegate.d();
            this.X = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ImmersionDelegate immersionDelegate = this.X;
        if (immersionDelegate != null) {
            immersionDelegate.e();
        }
    }
}
