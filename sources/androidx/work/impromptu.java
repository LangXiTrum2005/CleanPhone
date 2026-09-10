package androidx.work;

import java.util.List;

/* JADX INFO: compiled from: InputMerger.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final String f14193attabal = apical.beachfront("InputMerger");

    public static impromptu attabal(String str) {
        try {
            return (impromptu) Class.forName(str).newInstance();
        } catch (Exception e) {
            apical.dern().saneness(f14193attabal, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    public abstract wireman saneness(List<wireman> list);
}
