package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public interface EngagementSignalsCallback {
    default void onGreatestScrollPercentageIncreased(int i2, Bundle bundle) {
    }

    default void onSessionEnded(boolean z2, Bundle bundle) {
    }

    default void onVerticalScrollEvent(boolean z2, Bundle bundle) {
    }
}
