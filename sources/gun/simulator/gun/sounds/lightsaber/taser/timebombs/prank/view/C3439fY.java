package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3439fY implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f4369a;

    public C3439fY(String str) {
        Pattern patternCompile = Pattern.compile(str);
        AbstractC2995aW.p(patternCompile, "compile(pattern)");
        this.f4369a = patternCompile;
    }

    public final String toString() {
        String string = this.f4369a.toString();
        AbstractC2995aW.p(string, "nativePattern.toString()");
        return string;
    }
}
