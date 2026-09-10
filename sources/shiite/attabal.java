package shiite;

import android.os.Bundle;

/* JADX INFO: compiled from: RequestExtras.java */
/* JADX INFO: loaded from: classes4.dex */
public class attabal {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static String f37620dern = "requester_type_5";

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static String f37621saneness = "query_info_type";

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static String f37622wireman = "UnityScar";

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f37623attabal;

    public attabal(String str) {
        this.f37623attabal = f37622wireman + str;
    }

    public Bundle attabal() {
        Bundle bundle = new Bundle();
        bundle.putString(f37621saneness, f37620dern);
        return bundle;
    }

    public String saneness() {
        return this.f37623attabal;
    }
}
