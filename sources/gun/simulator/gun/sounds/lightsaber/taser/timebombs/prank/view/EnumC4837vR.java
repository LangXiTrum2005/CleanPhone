package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC4837vR {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f5130a;
    public static final /* synthetic */ EnumC4837vR[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4837vR EF5;

    static {
        EnumC4837vR enumC4837vR = new EnumC4837vR("UNKNOWN_MOBILE_SUBTYPE", 0);
        EnumC4837vR enumC4837vR2 = new EnumC4837vR("GPRS", 1);
        EnumC4837vR enumC4837vR3 = new EnumC4837vR("EDGE", 2);
        EnumC4837vR enumC4837vR4 = new EnumC4837vR("UMTS", 3);
        EnumC4837vR enumC4837vR5 = new EnumC4837vR("CDMA", 4);
        EnumC4837vR enumC4837vR6 = new EnumC4837vR("EVDO_0", 5);
        EnumC4837vR enumC4837vR7 = new EnumC4837vR("EVDO_A", 6);
        EnumC4837vR enumC4837vR8 = new EnumC4837vR("RTT", 7);
        EnumC4837vR enumC4837vR9 = new EnumC4837vR("HSDPA", 8);
        EnumC4837vR enumC4837vR10 = new EnumC4837vR("HSUPA", 9);
        EnumC4837vR enumC4837vR11 = new EnumC4837vR("HSPA", 10);
        EnumC4837vR enumC4837vR12 = new EnumC4837vR("IDEN", 11);
        EnumC4837vR enumC4837vR13 = new EnumC4837vR("EVDO_B", 12);
        EnumC4837vR enumC4837vR14 = new EnumC4837vR("LTE", 13);
        EnumC4837vR enumC4837vR15 = new EnumC4837vR("EHRPD", 14);
        EnumC4837vR enumC4837vR16 = new EnumC4837vR("HSPAP", 15);
        EnumC4837vR enumC4837vR17 = new EnumC4837vR("GSM", 16);
        EnumC4837vR enumC4837vR18 = new EnumC4837vR("TD_SCDMA", 17);
        EnumC4837vR enumC4837vR19 = new EnumC4837vR("IWLAN", 18);
        EnumC4837vR enumC4837vR20 = new EnumC4837vR("LTE_CA", 19);
        b = new EnumC4837vR[]{enumC4837vR, enumC4837vR2, enumC4837vR3, enumC4837vR4, enumC4837vR5, enumC4837vR6, enumC4837vR7, enumC4837vR8, enumC4837vR9, enumC4837vR10, enumC4837vR11, enumC4837vR12, enumC4837vR13, enumC4837vR14, enumC4837vR15, enumC4837vR16, enumC4837vR17, enumC4837vR18, enumC4837vR19, enumC4837vR20, new EnumC4837vR("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f5130a = sparseArray;
        sparseArray.put(0, enumC4837vR);
        sparseArray.put(1, enumC4837vR2);
        sparseArray.put(2, enumC4837vR3);
        sparseArray.put(3, enumC4837vR4);
        sparseArray.put(4, enumC4837vR5);
        sparseArray.put(5, enumC4837vR6);
        sparseArray.put(6, enumC4837vR7);
        sparseArray.put(7, enumC4837vR8);
        sparseArray.put(8, enumC4837vR9);
        sparseArray.put(9, enumC4837vR10);
        sparseArray.put(10, enumC4837vR11);
        sparseArray.put(11, enumC4837vR12);
        sparseArray.put(12, enumC4837vR13);
        sparseArray.put(13, enumC4837vR14);
        sparseArray.put(14, enumC4837vR15);
        sparseArray.put(15, enumC4837vR16);
        sparseArray.put(16, enumC4837vR17);
        sparseArray.put(17, enumC4837vR18);
        sparseArray.put(18, enumC4837vR19);
        sparseArray.put(19, enumC4837vR20);
    }

    public static EnumC4837vR valueOf(String str) {
        return (EnumC4837vR) Enum.valueOf(EnumC4837vR.class, str);
    }

    public static EnumC4837vR[] values() {
        return (EnumC4837vR[]) b.clone();
    }
}
