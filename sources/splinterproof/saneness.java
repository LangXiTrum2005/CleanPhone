package splinterproof;

import android.view.autofill.AutofillId;

/* JADX INFO: compiled from: AutofillIdCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object f38053attabal;

    public saneness(AutofillId autofillId) {
        this.f38053attabal = autofillId;
    }

    public static saneness saneness(AutofillId autofillId) {
        return new saneness(autofillId);
    }

    public AutofillId attabal() {
        return attabal.attabal(this.f38053attabal);
    }
}
