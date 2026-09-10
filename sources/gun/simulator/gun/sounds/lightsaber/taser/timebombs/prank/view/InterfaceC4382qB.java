package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4382qB extends IInterface {
    public static final String i1 = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    Bundle extraCommand(String str, Bundle bundle);

    boolean isEngagementSignalsApiAvailable(InterfaceC4118nB interfaceC4118nB, Bundle bundle);

    boolean mayLaunchUrl(InterfaceC4118nB interfaceC4118nB, Uri uri, Bundle bundle, List list);

    boolean newSession(InterfaceC4118nB interfaceC4118nB);

    boolean newSessionWithExtras(InterfaceC4118nB interfaceC4118nB, Bundle bundle);

    int postMessage(InterfaceC4118nB interfaceC4118nB, String str, Bundle bundle);

    boolean receiveFile(InterfaceC4118nB interfaceC4118nB, Uri uri, int i, Bundle bundle);

    boolean requestPostMessageChannel(InterfaceC4118nB interfaceC4118nB, Uri uri);

    boolean requestPostMessageChannelWithExtras(InterfaceC4118nB interfaceC4118nB, Uri uri, Bundle bundle);

    boolean setEngagementSignalsCallback(InterfaceC4118nB interfaceC4118nB, IBinder iBinder, Bundle bundle);

    boolean updateVisuals(InterfaceC4118nB interfaceC4118nB, Bundle bundle);

    boolean validateRelationship(InterfaceC4118nB interfaceC4118nB, int i, Uri uri, Bundle bundle);

    boolean warmup(long j);
}
