package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC2337Ci {
    ALLOW_ID(0),
    DISABLE_ID(1),
    LEGACY(2);

    public static final C2311Bi Companion = new C2311Bi(null);
    private static final Map<Integer, EnumC2337Ci> rawValueMap;
    private final int rawValue;

    static {
        EnumC2337Ci[] enumC2337CiArrValues = values();
        int iN = AbstractC3375el.N(enumC2337CiArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iN < 16 ? 16 : iN);
        for (EnumC2337Ci enumC2337Ci : enumC2337CiArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC2337Ci.rawValue), enumC2337Ci);
        }
        rawValueMap = linkedHashMap;
    }

    EnumC2337Ci(int i) {
        this.rawValue = i;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}
