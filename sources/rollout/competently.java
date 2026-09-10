package rollout;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: MetaDataStore.java */
/* JADX INFO: loaded from: classes3.dex */
public class competently {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Charset f36742saneness = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final spissatus.competently f36743attabal;

    /* JADX INFO: compiled from: MetaDataStore.java */
    public class attabal extends JSONObject {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ String f36744attabal;

        public attabal(String str) throws JSONException {
            this.f36744attabal = str;
            put("userId", str);
        }
    }

    public competently(spissatus.competently competentlyVar) {
        this.f36743attabal = competentlyVar;
    }

    public static String arytenoidectomy(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public static List<cutely> beachfront(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(cutely.attabal(string));
            } catch (Exception e) {
                gelandelaufer.competently.beachfront().formularize("Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    public static String formularize(List<cutely> list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(cutely.f36745attabal.saneness(list.get(i))));
            } catch (JSONException e) {
                gelandelaufer.competently.beachfront().formularize("Exception parsing rollout assignment!", e);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void impassible(File file) {
        if (file.exists() && file.delete()) {
            gelandelaufer.competently.beachfront().competently("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    public static String impromptu(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    public static String kowloon(String str) throws JSONException {
        return new attabal(str).toString();
    }

    public static Map<String, String> marial(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, arytenoidectomy(jSONObject, next));
        }
        return map;
    }

    public static void triweekly(File file, String str) {
        if (file.exists() && file.delete()) {
            gelandelaufer.competently.beachfront().competently(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    public String apical(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileWireman = wireman(str);
        FileInputStream fileInputStream2 = null;
        if (!fileWireman.exists() || fileWireman.length() == 0) {
            gelandelaufer.competently.beachfront().saneness("No userId set for session " + str);
            impassible(fileWireman);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileWireman);
            try {
                try {
                    String strCompetently = competently(CommonUtils.stratoscope(fileInputStream));
                    gelandelaufer.competently.beachfront().saneness("Loaded userId " + strCompetently + " for session " + str);
                    CommonUtils.beachfront(fileInputStream, "Failed to close user metadata file.");
                    return strCompetently;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.beachfront(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e) {
                e = e;
                gelandelaufer.competently.beachfront().formularize("Error deserializing user metadata.", e);
                impassible(fileWireman);
                CommonUtils.beachfront(fileInputStream, "Failed to close user metadata file.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.beachfront(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public File attabal(String str) {
        return this.f36743attabal.monoploid(str, "internal-keys");
    }

    public final String competently(String str) throws JSONException {
        return arytenoidectomy(new JSONObject(str), "userId");
    }

    public List<cutely> cutely(String str) throws Throwable {
        File fileDern = dern(str);
        if (!fileDern.exists() || fileDern.length() == 0) {
            triweekly(fileDern, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileDern);
                try {
                    List<cutely> listBeachfront = beachfront(CommonUtils.stratoscope(fileInputStream2));
                    gelandelaufer.competently.beachfront().saneness("Loaded rollouts state:\n" + listBeachfront + "\nfor session " + str);
                    CommonUtils.beachfront(fileInputStream2, "Failed to close rollouts state file.");
                    return listBeachfront;
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    gelandelaufer.competently.beachfront().formularize("Error deserializing rollouts state.", e);
                    impassible(fileDern);
                    CommonUtils.beachfront(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.EMPTY_LIST;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    CommonUtils.beachfront(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public File dern(String str) {
        return this.f36743attabal.monoploid(str, "rollouts-state");
    }

    public void graveside(String str, String str2) throws Throwable {
        File fileWireman = wireman(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strKowloon = kowloon(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileWireman), f36742saneness));
                try {
                    bufferedWriter2.write(strKowloon);
                    bufferedWriter2.flush();
                    CommonUtils.beachfront(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    gelandelaufer.competently.beachfront().formularize("Error serializing user metadata.", e);
                    CommonUtils.beachfront(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.beachfront(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    public void molybdenite(String str, List<cutely> list) throws Throwable {
        Throwable th;
        BufferedWriter bufferedWriter;
        Exception e;
        File fileDern = dern(str);
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            triweekly(fileDern, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                String strFormularize = formularize(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDern), f36742saneness));
                try {
                    bufferedWriter.write(strFormularize);
                    bufferedWriter.flush();
                    CommonUtils.beachfront(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e2) {
                    e = e2;
                    gelandelaufer.competently.beachfront().formularize("Error serializing rollouts state.", e);
                    impassible(fileDern);
                    CommonUtils.beachfront(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Exception e3) {
                bufferedWriter = null;
                e = e3;
            } catch (Throwable th2) {
                IsEmpty = 0;
                th = th2;
                CommonUtils.beachfront(IsEmpty, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.beachfront(IsEmpty, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public void monoploid(String str, Map<String, String> map) throws Throwable {
        polloi(str, map, false);
    }

    public void polloi(String str, Map<String, String> map, boolean z) throws Throwable {
        File fileAttabal = z ? attabal(str) : saneness(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strImpromptu = impromptu(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileAttabal), f36742saneness));
                try {
                    bufferedWriter2.write(strImpromptu);
                    bufferedWriter2.flush();
                    CommonUtils.beachfront(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    gelandelaufer.competently.beachfront().formularize("Error serializing key/value metadata.", e);
                    impassible(fileAttabal);
                    CommonUtils.beachfront(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.beachfront(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public File saneness(String str) {
        return this.f36743attabal.monoploid(str, "keys");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    public Map<String, String> taiyuan(String str, boolean z) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        File fileAttabal = z ? attabal(str) : saneness(str);
        if (!fileAttabal.exists() || fileAttabal.length() == 0) {
            triweekly(fileAttabal, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileAttabal);
                try {
                    Map<String, String> mapMarial = marial(CommonUtils.stratoscope(fileInputStream));
                    CommonUtils.beachfront(fileInputStream, "Failed to close user metadata file.");
                    return mapMarial;
                } catch (Exception e2) {
                    e = e2;
                    gelandelaufer.competently.beachfront().formularize("Error deserializing user metadata.", e);
                    impassible(fileAttabal);
                    CommonUtils.beachfront(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Exception e3) {
                fileInputStream = null;
                e = e3;
            } catch (Throwable th2) {
                ?? r1 = 0;
                th = th2;
                CommonUtils.beachfront(r1, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.beachfront(r1, "Failed to close user metadata file.");
            throw th;
        }
    }

    public File wireman(String str) {
        return this.f36743attabal.monoploid(str, "user-data");
    }
}
