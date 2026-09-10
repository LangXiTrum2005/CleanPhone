package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.if, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class Cif {
    private Cif() {
    }

    public /* synthetic */ Cif(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    public static /* synthetic */ EE makeJobInfo$default(Cif cif, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return cif.makeJobInfo(str);
    }

    public final EE makeJobInfo(String str) {
        EE priority = new EE(C3889kf.TAG).setPriority(0);
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("AD_ID_KEY", str);
        }
        return priority.setExtras(bundle).setUpdateCurrent(str == null);
    }
}
