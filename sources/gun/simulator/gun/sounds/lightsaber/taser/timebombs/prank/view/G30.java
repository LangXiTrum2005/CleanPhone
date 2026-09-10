package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class G30 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3102a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ G30(SearchView searchView, int i) {
        this.f3102a = i;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3102a;
        SearchView searchView = this.b;
        switch (i) {
            case 0:
                searchView.lambda$requestFocusAndShowKeyboard$8();
                break;
            case 1:
                searchView.show();
                break;
            case 2:
                searchView.lambda$clearFocusAndHideKeyboard$9();
                break;
            default:
                searchView.requestFocusAndShowKeyboardIfNeeded();
                break;
        }
    }
}
