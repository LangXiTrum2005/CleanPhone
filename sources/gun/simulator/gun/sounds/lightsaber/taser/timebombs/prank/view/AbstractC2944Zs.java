package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.HashSet;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2944Zs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f4097a = new HashSet();
    public static String b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f4097a.add(str)) {
            b += ", " + str;
        }
    }
}
