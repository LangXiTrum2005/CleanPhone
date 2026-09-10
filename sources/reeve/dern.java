package reeve;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.ironsource.A5;
import com.ironsource.C3700q2;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import umbriferous.gintrap;

/* JADX INFO: compiled from: DefaultSettingsSpiCall.java */
/* JADX INFO: loaded from: classes3.dex */
public class dern implements cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f36166attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final gelandelaufer.competently f36167dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final abortive.saneness f36168saneness;

    public dern(String str, abortive.saneness sanenessVar) {
        this(str, sanenessVar, gelandelaufer.competently.beachfront());
    }

    @Override // reeve.cutely
    public JSONObject attabal(taiyuan taiyuanVar, boolean z) {
        CrashlyticsWorkers.wireman();
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map<String, String> mapBeachfront = beachfront(taiyuanVar);
            abortive.attabal attabalVarSaneness = saneness(wireman(mapBeachfront), taiyuanVar);
            this.f36167dern.saneness("Requesting settings from " + this.f36166attabal);
            this.f36167dern.taiyuan("Settings query params were: " + mapBeachfront);
            return competently(attabalVarSaneness.dern());
        } catch (IOException e) {
            this.f36167dern.marial("Settings request failed.", e);
            return null;
        }
    }

    public final Map<String, String> beachfront(taiyuan taiyuanVar) {
        HashMap map = new HashMap();
        map.put("build_version", taiyuanVar.f36174impromptu);
        map.put("display_version", taiyuanVar.f36172competently);
        map.put("source", Integer.toString(taiyuanVar.f36177taiyuan));
        String str = taiyuanVar.f36171beachfront;
        if (!TextUtils.isEmpty(str)) {
            map.put(C3700q2.p, str);
        }
        return map;
    }

    public JSONObject competently(abortive.dern dernVar) {
        int iSaneness = dernVar.saneness();
        this.f36167dern.taiyuan("Settings response code was: " + iSaneness);
        if (impromptu(iSaneness)) {
            return marial(dernVar.attabal());
        }
        this.f36167dern.wireman("Settings request failed; (status: " + iSaneness + ") from " + this.f36166attabal);
        return null;
    }

    public final void dern(abortive.attabal attabalVar, String str, String str2) {
        if (str2 != null) {
            attabalVar.wireman(str, str2);
        }
    }

    public boolean impromptu(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public final JSONObject marial(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            this.f36167dern.formularize("Failed to parse settings JSON from " + this.f36166attabal, e);
            this.f36167dern.apical("Settings response " + str);
            return null;
        }
    }

    public final abortive.attabal saneness(abortive.attabal attabalVar, taiyuan taiyuanVar) {
        dern(attabalVar, "X-CRASHLYTICS-GOOGLE-APP-ID", taiyuanVar.f36170attabal);
        dern(attabalVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        dern(attabalVar, "X-CRASHLYTICS-API-CLIENT-VERSION", gintrap.formularize());
        dern(attabalVar, "Accept", A5.M);
        dern(attabalVar, "X-CRASHLYTICS-DEVICE-MODEL", taiyuanVar.f36176saneness);
        dern(attabalVar, "X-CRASHLYTICS-OS-BUILD-VERSION", taiyuanVar.f36173dern);
        dern(attabalVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", taiyuanVar.f36178wireman);
        dern(attabalVar, "X-CRASHLYTICS-INSTALLATION-ID", taiyuanVar.f36175marial.attabal().dern());
        return attabalVar;
    }

    public abortive.attabal wireman(Map<String, String> map) {
        return this.f36168saneness.attabal(this.f36166attabal, map).wireman(Command.HTTP_HEADER_USER_AGENT, "Crashlytics Android SDK/" + gintrap.formularize()).wireman("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public dern(String str, abortive.saneness sanenessVar, gelandelaufer.competently competentlyVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f36167dern = competentlyVar;
        this.f36168saneness = sanenessVar;
        this.f36166attabal = str;
    }
}
