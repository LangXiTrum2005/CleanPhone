package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DD implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2961a;

    public /* synthetic */ DD(int i) {
        this.f2961a = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        String str = (String) obj;
        switch (this.f2961a) {
            case 0:
                IntentSanitizer.lambda$sanitizeByThrowing$1(str);
                break;
            default:
                IntentSanitizer.lambda$sanitizeByFiltering$0(str);
                break;
        }
    }
}
