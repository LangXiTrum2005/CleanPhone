package monofuel;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.stats.CodePackage;
import iiion.beachfront;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: IidStore.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final String[] f33571dern = {"*", "FCM", CodePackage.GCM, ""};

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SharedPreferences f33572attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f33573saneness;

    public attabal(beachfront beachfrontVar) {
        this.f33572attabal = beachfrontVar.apical().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f33573saneness = saneness(beachfrontVar);
    }

    public static String dern(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String saneness(beachfront beachfrontVar) {
        String strWireman = beachfrontVar.kowloon().wireman();
        if (strWireman != null) {
            return strWireman;
        }
        String strDern = beachfrontVar.kowloon().dern();
        if (!strDern.startsWith("1:") && !strDern.startsWith("2:")) {
            return strDern;
        }
        String[] strArrSplit = strDern.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public final String attabal(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    public String beachfront() {
        synchronized (this.f33572attabal) {
            try {
                String strCompetently = competently();
                if (strCompetently != null) {
                    return strCompetently;
                }
                return impromptu();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String competently() {
        String string;
        synchronized (this.f33572attabal) {
            string = this.f33572attabal.getString("|S|id", null);
        }
        return string;
    }

    public final String impromptu() {
        synchronized (this.f33572attabal) {
            try {
                String string = this.f33572attabal.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyMarial = marial(string);
                if (publicKeyMarial == null) {
                    return null;
                }
                return dern(publicKeyMarial);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final PublicKey marial(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.toString();
            return null;
        }
    }

    public String taiyuan() {
        synchronized (this.f33572attabal) {
            try {
                for (String str : f33571dern) {
                    String string = this.f33572attabal.getString(attabal(this.f33573saneness, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = wireman(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String wireman(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }
}
