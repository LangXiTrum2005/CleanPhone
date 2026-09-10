package ingathering;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class triweekly {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static triweekly f28869wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final hamah.attabal f28870attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final long f28868saneness = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Pattern f28867dern = Pattern.compile("\\AA[\\w-]{38}\\z");

    public triweekly(hamah.attabal attabalVar) {
        this.f28870attabal = attabalVar;
    }

    public static boolean competently(String str) {
        return f28867dern.matcher(str).matches();
    }

    public static triweekly dern() {
        return wireman(hamah.saneness.attabal());
    }

    public static boolean impromptu(String str) {
        return str.contains(":");
    }

    public static triweekly wireman(hamah.attabal attabalVar) {
        if (f28869wireman == null) {
            f28869wireman = new triweekly(attabalVar);
        }
        return f28869wireman;
    }

    public long attabal() {
        return this.f28870attabal.currentTimeMillis();
    }

    public boolean beachfront(com.google.firebase.installations.local.saneness sanenessVar) {
        return TextUtils.isEmpty(sanenessVar.saneness()) || sanenessVar.impromptu() + sanenessVar.dern() < saneness() + f28868saneness;
    }

    public long marial() {
        return (long) (Math.random() * 1000.0d);
    }

    public long saneness() {
        return TimeUnit.MILLISECONDS.toSeconds(attabal());
    }
}
