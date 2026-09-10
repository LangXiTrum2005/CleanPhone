package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class PW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PW f3555a;
    public static final /* synthetic */ PW[] b;

    static {
        PW pw = new PW("DEFAULT", 0);
        f3555a = pw;
        PW pw2 = new PW("UNMETERED_ONLY", 1);
        PW pw3 = new PW("UNMETERED_OR_DAILY", 2);
        PW pw4 = new PW("FAST_IF_RADIO_AWAKE", 3);
        PW pw5 = new PW("NEVER", 4);
        PW pw6 = new PW("UNRECOGNIZED", 5);
        b = new PW[]{pw, pw2, pw3, pw4, pw5, pw6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, pw);
        sparseArray.put(1, pw2);
        sparseArray.put(2, pw3);
        sparseArray.put(3, pw4);
        sparseArray.put(4, pw5);
        sparseArray.put(-1, pw6);
    }

    public static PW valueOf(String str) {
        return (PW) Enum.valueOf(PW.class, str);
    }

    public static PW[] values() {
        return (PW[]) b.clone();
    }
}
