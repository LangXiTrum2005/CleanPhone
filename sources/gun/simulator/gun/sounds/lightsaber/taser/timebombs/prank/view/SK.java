package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* JADX INFO: loaded from: classes.dex */
public final class SK extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3713a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MDRootLayout d;

    public SK(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z, boolean z2) {
        this.d = mDRootLayout;
        this.f3713a = viewGroup;
        this.b = z;
        this.c = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        MDRootLayout mDRootLayout = this.d;
        boolean z = false;
        for (MDButton mDButton : mDRootLayout.f46a) {
            if (mDButton != null && mDButton.getVisibility() != 8) {
                z = true;
                break;
            }
        }
        MDRootLayout.a(mDRootLayout, this.f3713a, this.b, this.c, z);
        mDRootLayout.invalidate();
    }
}
