package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class Sa0 implements TI {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TI
    public String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        AbstractC2995aW.p(language, "getDefault().language");
        return language;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TI
    public String getTimeZoneId() {
        String id = TimeZone.getDefault().getID();
        AbstractC2995aW.p(id, "getDefault().id");
        return id;
    }
}
