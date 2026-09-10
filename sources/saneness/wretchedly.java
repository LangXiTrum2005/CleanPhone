package saneness;

import ads_mobile_sdk.gf0;
import ads_mobile_sdk.i72;
import ads_mobile_sdk.kc1;
import ads_mobile_sdk.lg0;
import ads_mobile_sdk.ng0;
import ads_mobile_sdk.og0;
import ads_mobile_sdk.u13;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class wretchedly {
    public static i72 attabal(u13 u13Var, Throwable th) {
        gf0 gf0Var = gf0.EVENT_ID_UNSPECIFIED;
        ((kc1) u13Var.a).a(20307, -1L, th, null);
        return i72.q();
    }

    public static byte[] beachfront(u13 u13Var, Throwable th) {
        gf0 gf0Var = gf0.EVENT_ID_UNSPECIFIED;
        ((kc1) u13Var.a).a(20308, -1L, th, null);
        return new byte[0];
    }

    public static ng0 dern(File file, nesslerize nesslerizeVar, final u13 u13Var) {
        return ((og0) nesslerizeVar).a(file, new byte[0], new com.google.common.base.marial() { // from class: saneness.spring
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return wretchedly.wireman(u13Var, (Throwable) obj);
            }
        });
    }

    public static ng0 marial(File file, nesslerize nesslerizeVar, final u13 u13Var) {
        return ((og0) nesslerizeVar).a(file, new byte[0], new com.google.common.base.marial() { // from class: saneness.patroclinal
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return wretchedly.beachfront(u13Var, (Throwable) obj);
            }
        });
    }

    public static ng0 saneness(File file, nesslerize nesslerizeVar, final u13 u13Var) {
        i72 i72VarQ = i72.q();
        return new ng0(file, ((og0) nesslerizeVar).a, new lg0(i72VarQ), new com.google.common.base.marial() { // from class: saneness.frenchy
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return wretchedly.attabal(u13Var, (Throwable) obj);
            }
        });
    }

    public static byte[] wireman(u13 u13Var, Throwable th) {
        gf0 gf0Var = gf0.EVENT_ID_UNSPECIFIED;
        ((kc1) u13Var.a).a(20309, -1L, th, null);
        return new byte[0];
    }
}
