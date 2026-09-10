package umbriferous;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: CrashlyticsFileMarker.java */
/* JADX INFO: loaded from: classes3.dex */
public class rotuma {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f39192attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final spissatus.competently f39193saneness;

    public rotuma(String str, spissatus.competently competentlyVar) {
        this.f39192attabal = str;
        this.f39193saneness = competentlyVar;
    }

    public boolean attabal() {
        try {
            return saneness().createNewFile();
        } catch (IOException e) {
            gelandelaufer.competently.beachfront().marial("Error creating marker: " + this.f39192attabal, e);
            return false;
        }
    }

    public boolean dern() {
        return saneness().exists();
    }

    public final File saneness() {
        return this.f39193saneness.competently(this.f39192attabal);
    }

    public boolean wireman() {
        return saneness().delete();
    }
}
