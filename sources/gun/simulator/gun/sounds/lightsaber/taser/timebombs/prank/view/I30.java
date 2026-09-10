package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class I30 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3200a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ I30(SearchView searchView, int i) {
        this.f3200a = i;
        this.b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f3200a;
        SearchView searchView = this.b;
        switch (i) {
            case 0:
                searchView.lambda$setupWithSearchBar$7(view);
                break;
            case 1:
                searchView.lambda$setUpBackButton$1(view);
                break;
            default:
                searchView.lambda$setUpClearButton$2(view);
                break;
        }
    }
}
