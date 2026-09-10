package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class H30 implements ViewUtils.OnApplyWindowInsetsListener, OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f3151a;

    public /* synthetic */ H30(SearchView searchView) {
        this.f3151a = searchView;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f3151a.lambda$setUpStatusBarSpacerInsetListener$5(view, windowInsetsCompat);
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        return this.f3151a.lambda$setUpToolbarInsetListener$4(view, windowInsetsCompat, relativePadding);
    }
}
