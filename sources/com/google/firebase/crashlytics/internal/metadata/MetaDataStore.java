package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.encoders.DataEncoder;
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

/* JADX INFO: loaded from: classes4.dex */
class MetaDataStore {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f20395b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileStore f20396a;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.metadata.MetaDataStore$1, reason: invalid class name */
    class AnonymousClass1 extends JSONObject {
    }

    public MetaDataStore(FileStore fileStore) {
        this.f20396a = fileStore;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            try {
                DataEncoder dataEncoder = RolloutAssignment.f20411a;
                JSONObject jSONObject = new JSONObject(string);
                arrayList.add(RolloutAssignment.a(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion")));
            } catch (Exception e2) {
                Logger.f20289a.f(e2, "Failed de-serializing rollouts state. " + string);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < list.size(); i2++) {
            try {
                jSONArray.put(new JSONObject(RolloutAssignment.f20411a.b(list.get(i2))));
            } catch (JSONException e2) {
                Logger.f20289a.f(e2, "Exception parsing rollout assignment!");
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Logger.f20289a.d("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Logger.f20289a.d("Deleted corrupt file: " + file.getAbsolutePath() + "\nReason: " + str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    public final Map c(String str, boolean z2) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e2;
        FileStore fileStore = this.f20396a;
        File fileB = z2 ? fileStore.b(str, "internal-keys") : fileStore.b(str, "keys");
        if (!fileB.exists() || fileB.length() == 0) {
            g(fileB, android.support.v4.media.a.C("The file has a length of zero for session: ", str));
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileB);
                try {
                    HashMap mapA = a(CommonUtils.i(fileInputStream));
                    CommonUtils.b(fileInputStream, "Failed to close user metadata file.");
                    return mapA;
                } catch (Exception e3) {
                    e2 = e3;
                    Logger.f20289a.f(e2, "Error deserializing user metadata.");
                    f(fileB);
                    CommonUtils.b(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Exception e4) {
                fileInputStream = null;
                e2 = e4;
            } catch (Throwable th2) {
                ?? r1 = 0;
                th = th2;
                CommonUtils.b(r1, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.b(r1, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final String d(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileB = this.f20396a.b(str, "user-data");
        boolean zExists = fileB.exists();
        Logger logger = Logger.f20289a;
        FileInputStream fileInputStream2 = null;
        if (!zExists || fileB.length() == 0) {
            logger.b("No userId set for session " + str, null);
            f(fileB);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileB);
            try {
                try {
                    JSONObject jSONObject = new JSONObject(CommonUtils.i(fileInputStream));
                    String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                    logger.b("Loaded userId " + strOptString + " for session " + str, null);
                    CommonUtils.b(fileInputStream, "Failed to close user metadata file.");
                    return strOptString;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.b(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                logger.f(e, "Error deserializing user metadata.");
                f(fileB);
                CommonUtils.b(fileInputStream, "Failed to close user metadata file.");
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.b(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final void h(String str, Map map, boolean z2) throws Throwable {
        FileStore fileStore = this.f20396a;
        File fileB = z2 ? fileStore.b(str, "internal-keys") : fileStore.b(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f20395b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    CommonUtils.b(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e2) {
                    e = e2;
                    bufferedWriter = bufferedWriter2;
                    Logger.f20289a.f(e, "Error serializing key/value metadata.");
                    f(fileB);
                    CommonUtils.b(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.b(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final void i(String str, List list) throws Throwable {
        BufferedWriter bufferedWriter;
        Throwable th;
        Exception e2;
        File fileB = this.f20396a.b(str, "rollouts-state");
        if (list.isEmpty()) {
            g(fileB, android.support.v4.media.a.C("Rollout state is empty for session: ", str));
            return;
        }
        try {
            String strE = e(list);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f20395b));
            try {
                try {
                    bufferedWriter.write(strE);
                    bufferedWriter.flush();
                    CommonUtils.b(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th2) {
                    th = th2;
                    CommonUtils.b(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e3) {
                e2 = e3;
                Logger.f20289a.f(e2, "Error serializing rollouts state.");
                f(fileB);
                CommonUtils.b(bufferedWriter, "Failed to close rollouts state file.");
            }
        } catch (Exception e4) {
            bufferedWriter = null;
            e2 = e4;
        } catch (Throwable th3) {
            bufferedWriter = null;
            th = th3;
            CommonUtils.b(bufferedWriter, "Failed to close rollouts state file.");
            throw th;
        }
    }
}
