package com.applovin.impl.sdk;

import com.applovin.impl.f2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class NativeCrashReporter implements c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f9310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f9311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final NativeCrashReporter f9312d = new NativeCrashReporter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f9313a = new HashMap();

    private NativeCrashReporter() {
    }

    public static void a(l lVar) {
        if (lVar == null) {
            return;
        }
        if (!((Boolean) lVar.a(z4.w4)).booleanValue() && !q7.k(l.p())) {
            if (f9311c) {
                try {
                    c cVarH = lVar.h();
                    NativeCrashReporter nativeCrashReporter = f9312d;
                    cVarH.b((c.a) nativeCrashReporter);
                    nativeCrashReporter.disable();
                    return;
                } catch (Throwable th2) {
                    lVar.Q();
                    if (p.a()) {
                        lVar.Q().a("NativeCrashReporter", "Failed to disable native crash reporter", th2);
                    }
                    lVar.E().a("NativeCrashReporter", "disableInstance", th2);
                    return;
                }
            }
            return;
        }
        if (a()) {
            List listC = lVar.c(z4.f10283x4);
            int[] iArr = new int[listC.size()];
            for (int i10 = 0; i10 < listC.size(); i10++) {
                try {
                    iArr[i10] = Integer.parseInt((String) listC.get(i10));
                } catch (NumberFormatException unused) {
                }
            }
            File file = new File(l.p().getCacheDir(), "al-reports");
            if (file.exists()) {
                a(file, lVar);
            } else if (!file.mkdir()) {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                NativeCrashReporter nativeCrashReporter2 = f9312d;
                nativeCrashReporter2.enable(file.getAbsolutePath(), iArr, ((Boolean) lVar.a(z4.f10291y4)).booleanValue());
                if (((Boolean) lVar.a(z4.f10299z4)).booleanValue()) {
                    lVar.h().a((c.a) nativeCrashReporter2);
                }
            } catch (Throwable th3) {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().a("NativeCrashReporter", "Failed to enable native crash reporter", th3);
                }
                lVar.E().a("NativeCrashReporter", "enableInstance", th3);
            }
        }
    }

    private native void disable();

    private native void enable(String str, int[] iArr, boolean z10);

    private native void updateAdInfo(String str);

    private static boolean a() {
        if (!f9310b) {
            f9310b = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                f9311c = true;
            } catch (Throwable th2) {
                p.b("NativeCrashReporter", "Failed to load native crash reporter library", th2);
            }
        }
        return f9311c;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00a7, please report this as an issue */
    private static void a(File file, l lVar) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            String strF = lVar.I().f(file2);
            if (StringUtils.isValidString(strF)) {
                String[] strArrSplit = strF.split("@@@@@");
                if (strArrSplit.length == 3) {
                    try {
                        String str = strArrSplit[0];
                        String str2 = strArrSplit[1];
                        JSONArray jSONArray = new JSONArray(strArrSplit[2]);
                        if (jSONArray.length() == 0) {
                            lVar.E().a(f2.f7844d1, str2, CollectionUtils.hashMap("error_message", str));
                        } else {
                            ArrayList arrayList = new ArrayList(jSONArray.length());
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
                                if (jSONObject != null) {
                                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str);
                                    mapHashMap.put("source", str2);
                                    mapHashMap.putAll(JsonUtils.toStringMap(jSONObject));
                                    arrayList.add(mapHashMap);
                                }
                            }
                            lVar.E().a(f2.f7844d1, arrayList, 0L);
                        }
                    } catch (Throwable th2) {
                        lVar.Q();
                        if (p.a()) {
                            lVar.Q().a("NativeCrashReporter", "Failed to symbolicate native crash report", th2);
                        }
                    }
                } else {
                    lVar.Q();
                    if (p.a()) {
                        lVar.Q().b("NativeCrashReporter", "Failed to read native crash error report: " + file2.getAbsolutePath());
                    }
                }
            } else {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().b("NativeCrashReporter", "Failed to read native crash error report: " + file2.getAbsolutePath());
                }
            }
            try {
                if (!file2.delete()) {
                    lVar.Q();
                    if (p.a()) {
                        lVar.Q().b("NativeCrashReporter", "Failed to delete native crash report: " + file2.getAbsolutePath());
                    }
                }
            } catch (Throwable th3) {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().a("NativeCrashReporter", "Failed to delete native crash report: " + file2.getAbsolutePath(), th3);
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.c.a
    public void a(List list) {
        try {
            updateAdInfo(new JSONArray((Collection) list).toString());
        } catch (Throwable unused) {
        }
    }
}
