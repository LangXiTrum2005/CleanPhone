package reeve;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* JADX INFO: compiled from: CachedSettingsIo.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final File f36164attabal;

    public attabal(spissatus.competently competentlyVar) {
        this.f36164attabal = competentlyVar.competently("com.crashlytics.settings.json");
    }

    public final File attabal() {
        return this.f36164attabal;
    }

    public void dern(long j, JSONObject jSONObject) throws Throwable {
        gelandelaufer.competently.beachfront().taiyuan("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(attabal());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    CommonUtils.beachfront(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    gelandelaufer.competently.beachfront().marial("Failed to cache settings", e);
                    CommonUtils.beachfront(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    CommonUtils.beachfront(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public JSONObject saneness() throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        gelandelaufer.competently.beachfront().saneness("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileAttabal = attabal();
                if (fileAttabal.exists()) {
                    fileInputStream = new FileInputStream(fileAttabal);
                    try {
                        jSONObject = new JSONObject(CommonUtils.stratoscope(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        gelandelaufer.competently.beachfront().marial("Failed to fetch cached settings", e);
                        CommonUtils.beachfront(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    gelandelaufer.competently.beachfront().taiyuan("Settings file does not exist.");
                    jSONObject = null;
                }
                CommonUtils.beachfront(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.beachfront(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.beachfront(null, "Error while closing settings cache file.");
            throw th;
        }
    }
}
