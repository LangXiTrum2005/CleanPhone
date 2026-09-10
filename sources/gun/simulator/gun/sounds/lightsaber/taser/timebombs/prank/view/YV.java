package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.webkit.ProfileStore;
import androidx.webkit.internal.ProfileStoreImpl;
import androidx.webkit.internal.WebViewFeatureInternal;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class YV {
    public static ProfileStore a() {
        if (WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return ProfileStoreImpl.getInstance();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
