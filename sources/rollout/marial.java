package rollout;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: KeysMap.java */
/* JADX INFO: loaded from: classes3.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<String, String> f36782attabal = new HashMap();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f36783dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f36784saneness;

    public marial(int i, int i2) {
        this.f36784saneness = i;
        this.f36783dern = i2;
    }

    public static String dern(String str, int i) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i ? strTrim.substring(0, i) : strTrim;
    }

    public synchronized Map<String, String> attabal() {
        return Collections.unmodifiableMap(new HashMap(this.f36782attabal));
    }

    public synchronized void marial(Map<String, String> map) {
        try {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String strSaneness = saneness(entry.getKey());
                if (this.f36782attabal.size() < this.f36784saneness || this.f36782attabal.containsKey(strSaneness)) {
                    String value = entry.getValue();
                    this.f36782attabal.put(strSaneness, value == null ? "" : dern(value, this.f36783dern));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                gelandelaufer.competently.beachfront().apical("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f36784saneness);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String saneness(String str) {
        if (str != null) {
            return dern(str, this.f36783dern);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public synchronized boolean wireman(String str, String str2) {
        String strSaneness = saneness(str);
        if (this.f36782attabal.size() >= this.f36784saneness && !this.f36782attabal.containsKey(strSaneness)) {
            gelandelaufer.competently.beachfront().apical("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f36784saneness);
            return false;
        }
        String strDern = dern(str2, this.f36783dern);
        if (CommonUtils.cord(this.f36782attabal.get(strSaneness), strDern)) {
            return false;
        }
        Map<String, String> map = this.f36782attabal;
        if (str2 == null) {
            strDern = "";
        }
        map.put(strSaneness, strDern);
        return true;
    }
}
