package cybernatic;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: CeaUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront {
    public static void attabal(long j, decarock.stratoscope stratoscopeVar, privatdozent[] privatdozentVarArr) {
        while (true) {
            if (stratoscopeVar.attabal() <= 1) {
                return;
            }
            int iDern = dern(stratoscopeVar);
            int iDern2 = dern(stratoscopeVar);
            int iBeachfront = stratoscopeVar.beachfront() + iDern2;
            if (iDern2 == -1 || iDern2 > stratoscopeVar.attabal()) {
                decarock.triweekly.impromptu("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iBeachfront = stratoscopeVar.competently();
            } else if (iDern == 4 && iDern2 >= 8) {
                int iSupplicat = stratoscopeVar.supplicat();
                int iSaran = stratoscopeVar.saran();
                int iMonoploid = iSaran == 49 ? stratoscopeVar.monoploid() : 0;
                int iSupplicat2 = stratoscopeVar.supplicat();
                if (iSaran == 47) {
                    stratoscopeVar.splinterproof(1);
                }
                boolean z = iSupplicat == 181 && (iSaran == 49 || iSaran == 47) && iSupplicat2 == 3;
                if (iSaran == 49) {
                    z &= iMonoploid == 1195456820;
                }
                if (z) {
                    saneness(j, stratoscopeVar, privatdozentVarArr);
                }
            }
            stratoscopeVar.mathsort(iBeachfront);
        }
    }

    public static int dern(decarock.stratoscope stratoscopeVar) {
        int i = 0;
        while (stratoscopeVar.attabal() != 0) {
            int iSupplicat = stratoscopeVar.supplicat();
            i += iSupplicat;
            if (iSupplicat != 255) {
                return i;
            }
        }
        return -1;
    }

    public static void saneness(long j, decarock.stratoscope stratoscopeVar, privatdozent[] privatdozentVarArr) {
        int iSupplicat = stratoscopeVar.supplicat();
        if ((iSupplicat & 64) != 0) {
            stratoscopeVar.splinterproof(1);
            int i = (iSupplicat & 31) * 3;
            int iBeachfront = stratoscopeVar.beachfront();
            for (privatdozent privatdozentVar : privatdozentVarArr) {
                stratoscopeVar.mathsort(iBeachfront);
                privatdozentVar.saneness(stratoscopeVar, i);
                decarock.attabal.competently(j != C.TIME_UNSET);
                privatdozentVar.wireman(j, 1, i, 0, null);
            }
        }
    }
}
