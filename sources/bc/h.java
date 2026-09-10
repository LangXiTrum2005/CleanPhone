package bc;

import android.util.Log;
import androidx.core.app.NotificationCompat;
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

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f5549b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fc.f f5550a;

    public h(fc.f fVar) {
        this.f5550a = fVar;
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
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                am.e eVar = p.f5572a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j10 = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, NotificationCompat.FLAG_LOCAL_ONLY);
                }
                arrayList.add(new b(string2, string3, string4, string5, j10));
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(p.f5572a.y(list.get(i10))));
            } catch (JSONException e10) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e10);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", l1.d.g("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    public final Map c(String str, boolean z10) throws Throwable {
        ?? r10;
        FileInputStream fileInputStream;
        Exception e10;
        fc.f fVar = this.f5550a;
        File fileR = z10 ? fVar.r(str, "internal-keys") : fVar.r(str, "keys");
        if (!fileR.exists() || fileR.length() == 0) {
            g(fileR, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        ?? r11 = 0;
        try {
            try {
                fileInputStream = new FileInputStream(fileR);
                try {
                    HashMap mapA = a(zb.f.j(fileInputStream));
                    zb.f.b(fileInputStream, "Failed to close user metadata file.");
                    return mapA;
                } catch (Exception e11) {
                    e10 = e11;
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e10);
                    f(fileR);
                    zb.f.b(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Exception e12) {
                fileInputStream = null;
                e10 = e12;
            } catch (Throwable th2) {
                th = th2;
                zb.f.b(r11, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            r11 = r10;
            zb.f.b(r11, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    public final String d(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileR = this.f5550a.r(str, "user-data");
        ?? r10 = 0;
        if (fileR.exists()) {
            ?? r2 = (fileR.length() > 0L ? 1 : (fileR.length() == 0L ? 0 : -1));
            try {
                if (r2 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileR);
                        try {
                            JSONObject jSONObject = new JSONObject(zb.f.j(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            zb.f.b(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e10) {
                            e = e10;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(fileR);
                            zb.f.b(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        zb.f.b(r10, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r10 = r2;
            }
        }
        String strN = defpackage.e.n("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strN, null);
        }
        f(fileR);
        return null;
    }

    public final void h(String str, Map map, boolean z10) {
        BufferedWriter bufferedWriter;
        Exception e10;
        fc.f fVar = this.f5550a;
        File fileR = z10 ? fVar.r(str, "internal-keys") : fVar.r(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            String string = new JSONObject(map).toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileR), f5549b));
            try {
                try {
                    bufferedWriter.write(string);
                    bufferedWriter.flush();
                    zb.f.b(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter2 = bufferedWriter;
                    zb.f.b(bufferedWriter2, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e10 = e11;
                Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e10);
                f(fileR);
                zb.f.b(bufferedWriter, "Failed to close key/value metadata file.");
            }
        } catch (Exception e12) {
            bufferedWriter = null;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            zb.f.b(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void i(String str, List list) {
        BufferedWriter bufferedWriter;
        Exception e10;
        File fileR = this.f5550a.r(str, "rollouts-state");
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            g(fileR, "Rollout state is empty for session: " + str);
            return;
        }
        ?? r10 = 0;
        try {
            try {
                String strE = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileR), f5549b));
                try {
                    bufferedWriter.write(strE);
                    bufferedWriter.flush();
                    zb.f.b(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e11) {
                    e10 = e11;
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e10);
                    f(fileR);
                    zb.f.b(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Exception e12) {
                bufferedWriter = null;
                e10 = e12;
            } catch (Throwable th2) {
                th = th2;
                zb.f.b(r10, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            r10 = IsEmpty;
            zb.f.b(r10, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public final void j(String str, String str2) {
        File fileR = this.f5550a.r(str, "user-data");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                g gVar = new g();
                gVar.put("userId", str2);
                String string = gVar.toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileR), f5549b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    zb.f.b(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                    zb.f.b(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    zb.f.b(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
