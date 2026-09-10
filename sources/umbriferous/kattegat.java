package umbriferous;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.ironsource.Ua;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: IdManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class kattegat implements supplicat {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Pattern f39121competently = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final String f39122impromptu = Pattern.quote("/");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final restrictive f39123attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public supplicat.attabal f39124beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f39125dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final trm f39126marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Context f39127saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ingathering.competently f39128wireman;

    public kattegat(Context context, String str, ingathering.competently competentlyVar, trm trmVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f39127saneness = context;
        this.f39125dern = str;
        this.f39128wireman = competentlyVar;
        this.f39126marial = trmVar;
        this.f39123attabal = new restrictive();
    }

    public static boolean apical(String str) {
        return str != null && str.startsWith("SYN_");
    }

    public static String dern() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public static String marial(String str) {
        return f39121competently.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    @Override // umbriferous.supplicat
    public synchronized supplicat.attabal attabal() {
        if (!triweekly()) {
            return this.f39124beachfront;
        }
        gelandelaufer.competently.beachfront().taiyuan("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesMonoploid = CommonUtils.monoploid(this.f39127saneness);
        String string = sharedPreferencesMonoploid.getString("firebase.installation.id", null);
        gelandelaufer.competently.beachfront().taiyuan("Cached Firebase Installation ID: " + string);
        if (this.f39126marial.wireman()) {
            FirebaseInstallationId firebaseInstallationIdWireman = wireman(false);
            gelandelaufer.competently.beachfront().taiyuan("Fetched Firebase Installation ID: " + firebaseInstallationIdWireman.getFid());
            if (firebaseInstallationIdWireman.getFid() == null) {
                firebaseInstallationIdWireman = new FirebaseInstallationId(string == null ? dern() : string, null);
            }
            if (Objects.equals(firebaseInstallationIdWireman.getFid(), string)) {
                this.f39124beachfront = supplicat.attabal.attabal(formularize(sharedPreferencesMonoploid), firebaseInstallationIdWireman);
            } else {
                this.f39124beachfront = supplicat.attabal.attabal(saneness(firebaseInstallationIdWireman.getFid(), sharedPreferencesMonoploid), firebaseInstallationIdWireman);
            }
        } else if (apical(string)) {
            this.f39124beachfront = supplicat.attabal.saneness(formularize(sharedPreferencesMonoploid));
        } else {
            this.f39124beachfront = supplicat.attabal.saneness(saneness(dern(), sharedPreferencesMonoploid));
        }
        gelandelaufer.competently.beachfront().taiyuan("Install IDs: " + this.f39124beachfront);
        return this.f39124beachfront;
    }

    public String beachfront() {
        return this.f39125dern;
    }

    public String competently() {
        return this.f39123attabal.attabal(this.f39127saneness);
    }

    public String cutely() {
        return impassible(Build.VERSION.RELEASE);
    }

    public final String formularize(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    public final String impassible(String str) {
        return str.replaceAll(f39122impromptu, "");
    }

    public String impromptu() {
        return String.format(Locale.US, "%s/%s", impassible(Build.MANUFACTURER), impassible(Build.MODEL));
    }

    public final synchronized String saneness(String str, SharedPreferences sharedPreferences) {
        String strMarial;
        strMarial = marial(UUID.randomUUID().toString());
        gelandelaufer.competently.beachfront().taiyuan("Created new Crashlytics installation ID: " + strMarial + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strMarial).putString("firebase.installation.id", str).apply();
        return strMarial;
    }

    public String taiyuan() {
        return impassible(Build.VERSION.INCREMENTAL);
    }

    public final boolean triweekly() {
        supplicat.attabal attabalVar = this.f39124beachfront;
        if (attabalVar != null) {
            return attabalVar.marial() == null && this.f39126marial.wireman();
        }
        return true;
    }

    public FirebaseInstallationId wireman(boolean z) {
        String strSaneness;
        CrashlyticsWorkers.marial();
        String str = null;
        if (z) {
            try {
                strSaneness = ((ingathering.apical) Tasks.await(this.f39128wireman.attabal(false), Ua.s, TimeUnit.MILLISECONDS)).saneness();
            } catch (Exception e) {
                gelandelaufer.competently.beachfront().formularize("Error getting Firebase authentication token.", e);
                strSaneness = null;
            }
        } else {
            strSaneness = null;
        }
        try {
            str = (String) Tasks.await(this.f39128wireman.getId(), Ua.s, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            gelandelaufer.competently.beachfront().formularize("Error getting Firebase installation id.", e2);
        }
        return new FirebaseInstallationId(str, strSaneness);
    }
}
