package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4118nB extends IInterface {
    public static final String h1 = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    void extraCallback(String str, Bundle bundle);

    Bundle extraCallbackWithResult(String str, Bundle bundle);

    void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle);

    void onActivityResized(int i, int i2, Bundle bundle);

    void onMessageChannelReady(Bundle bundle);

    void onMinimized(Bundle bundle);

    void onNavigationEvent(int i, Bundle bundle);

    void onPostMessage(String str, Bundle bundle);

    void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle);

    void onUnminimized(Bundle bundle);

    void onWarmupCompleted(Bundle bundle);
}
