package com.gyf.immersionbar;

import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class RequestBarManagerFragment extends Fragment {
    public ImmersionDelegate X;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ImmersionDelegate immersionDelegate = this.X;
        if (immersionDelegate != null) {
            getResources().getConfiguration();
            immersionDelegate.b();
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ImmersionDelegate immersionDelegate = this.X;
        if (immersionDelegate != null) {
            immersionDelegate.c();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ImmersionDelegate immersionDelegate = this.X;
        if (immersionDelegate != null) {
            immersionDelegate.d();
            this.X = null;
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        ImmersionDelegate immersionDelegate = this.X;
        if (immersionDelegate != null) {
            immersionDelegate.e();
        }
    }
}
