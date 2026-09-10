package eia;

import android.os.Bundle;
import java.util.Locale;

/* JADX INFO: compiled from: CrashlyticsAnalyticsListener.java */
/* JADX INFO: loaded from: classes3.dex */
public class marial implements anthomaniac.attabal.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public arcticology.saneness f25594attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public arcticology.saneness f25595saneness;

    public static void saneness(arcticology.saneness sanenessVar, String str, Bundle bundle) {
        if (sanenessVar == null) {
            return;
        }
        sanenessVar.saneness(str, bundle);
    }

    @Override // anthomaniac.attabal.saneness
    public void attabal(int i, Bundle bundle) {
        String string;
        gelandelaufer.competently.beachfront().taiyuan(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        dern(string, bundle2);
    }

    public final void dern(String str, Bundle bundle) {
        saneness("clx".equals(bundle.getString("_o")) ? this.f25594attabal : this.f25595saneness, str, bundle);
    }

    public void marial(arcticology.saneness sanenessVar) {
        this.f25594attabal = sanenessVar;
    }

    public void wireman(arcticology.saneness sanenessVar) {
        this.f25595saneness = sanenessVar;
    }
}
