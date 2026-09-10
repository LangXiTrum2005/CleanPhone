package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Zo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f4093a;
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        f4093a = map;
        HashMap map2 = new HashMap();
        b = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }
}
