package sg.bigo.ads.api;

import android.view.Window;

/* JADX INFO: loaded from: classes7.dex */
public class PopupAdActivity extends AdActivity {
    @Override // sg.bigo.ads.api.AdActivity
    public final void a() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.setStatusBarColor(0);
    }
}
