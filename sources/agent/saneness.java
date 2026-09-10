package agent;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: AppReportUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static boolean f3931attabal = false;

    /* JADX INFO: compiled from: AppReportUtils.java */
    public interface attabal {
        void attabal(boolean z);
    }

    public static /* synthetic */ void attabal(attabal attabalVar, pancuronium.saneness sanenessVar) {
        if (sanenessVar.attabal() == 0 || sanenessVar.attabal() == 7 || sanenessVar.attabal() == 8) {
            babyless.beachfront.apical(babyless.dern.f14823saneness, Boolean.TRUE);
            kaoline.wireman wiremanVarMonoploid = gerenuk.saneness.monoploid();
            if (wiremanVarMonoploid != null && !TextUtils.isEmpty(wiremanVarMonoploid.wireman())) {
                wiremanVarMonoploid.adultoid(((kaoline.dern) sanenessVar.dern()).attabal());
                gerenuk.saneness.oilcan(wiremanVarMonoploid);
            }
            gerenuk.saneness.rotuma();
            if (attabalVar != null) {
                attabalVar.attabal(true);
            }
        } else if (attabalVar != null) {
            attabalVar.attabal(false);
        }
        f3931attabal = false;
    }

    public static void dern(kaoline.marial marialVar) {
        wireman(marialVar, null);
    }

    public static void marial(Context context, kaoline.wireman wiremanVar) {
        babyless.beachfront.apical(babyless.dern.f14821dern, Boolean.TRUE);
        Bundle bundle = new Bundle();
        String strSaneness = saneness(wiremanVar.molybdenite());
        String strSaneness2 = saneness(wiremanVar.monoploid());
        String strSaneness3 = saneness(wiremanVar.cutely());
        bundle.putString("ud_utm_source", strSaneness);
        bundle.putString("ud_cnl", saneness(wiremanVar.wireman()));
        bundle.putString("ud_utm_medium", strSaneness2);
        bundle.putString("ud_utm_campaign", strSaneness3);
        bundle.putString("ud_utm_content", saneness(wiremanVar.formularize()));
        bundle.putString("ud_utm_info_source", saneness(wiremanVar.competently()));
        bundle.putString("ud_utm_creative_id", saneness(wiremanVar.triweekly()));
        bundle.putString("ud_utm_country", saneness(wiremanVar.impassible()));
        beachfront.marial(context, strSaneness, strSaneness2, strSaneness3);
    }

    public static String saneness(String str) {
        return (!TextUtils.isEmpty(str) && str.length() > 100) ? str.substring(0, 98) : str;
    }

    public static void wireman(kaoline.marial marialVar, final attabal attabalVar) {
        if (f3931attabal) {
            if (attabalVar != null) {
                attabalVar.attabal(false);
            }
        } else if (babyless.beachfront.marial(babyless.dern.f14823saneness, false)) {
            if (attabalVar != null) {
                attabalVar.attabal(true);
            }
        } else if (marialVar != null) {
            f3931attabal = true;
            panocha.wireman.marial().impromptu(hued.attabal.attabal(), marialVar, kaoline.dern.class, new pancuronium.attabal() { // from class: agent.attabal
                @Override // pancuronium.attabal
                public final void attabal(pancuronium.saneness sanenessVar) {
                    saneness.attabal(attabalVar, sanenessVar);
                }
            });
        } else if (attabalVar != null) {
            attabalVar.attabal(false);
        }
    }
}
