package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class JY extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RunnableC4646tC f3270a;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        RunnableC4646tC runnableC4646tC = this.f3270a;
        if (runnableC4646tC != null) {
            getResources().getConfiguration();
            runnableC4646tC.a();
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RunnableC4646tC runnableC4646tC = this.f3270a;
        if (runnableC4646tC != null) {
            runnableC4646tC.b();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        RunnableC4646tC runnableC4646tC = this.f3270a;
        if (runnableC4646tC != null) {
            runnableC4646tC.c();
            this.f3270a = null;
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        RunnableC4646tC runnableC4646tC = this.f3270a;
        if (runnableC4646tC != null) {
            runnableC4646tC.d();
        }
    }
}
