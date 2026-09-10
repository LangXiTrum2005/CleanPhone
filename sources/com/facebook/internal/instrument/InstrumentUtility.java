package com.facebook.internal.instrument;

import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.internal.Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentUtility;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class InstrumentUtility {
    public static final void a(String str) {
        File fileB = b();
        if (fileB == null || str == null) {
            return;
        }
        new File(fileB, str).delete();
    }

    public static final File b() {
        File file = new File(FacebookSdk.b().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final boolean c(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement element : stackTrace) {
                Intrinsics.e(element, "element");
                String className = element.getClassName();
                Intrinsics.e(className, "element.className");
                if (StringsKt.M(className, "com.facebook", false)) {
                    String className2 = element.getClassName();
                    Intrinsics.e(className2, "element.className");
                    if (!StringsKt.M(className2, "com.facebook.appevents.codeless", false)) {
                        String className3 = element.getClassName();
                        Intrinsics.e(className3, "element.className");
                        if (!StringsKt.M(className3, "com.facebook.appevents.suggestedevents", false)) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    Intrinsics.e(methodName, "element.methodName");
                    if (StringsKt.M(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        Intrinsics.e(methodName2, "element.methodName");
                        if (StringsKt.M(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            Intrinsics.e(methodName3, "element.methodName");
                            if (!StringsKt.M(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final File[] d() {
        File fileB = b();
        if (fileB == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileB.listFiles(InstrumentUtility$listAnrReportFiles$reports$1.f16421a);
        return fileArrListFiles != null ? fileArrListFiles : new File[0];
    }

    public static final File[] e() {
        File fileB = b();
        if (fileB == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileB.listFiles(InstrumentUtility$listExceptionReportFiles$reports$1.f16423a);
        return fileArrListFiles != null ? fileArrListFiles : new File[0];
    }

    public static final JSONObject f(String str) {
        File fileB = b();
        if (fileB == null) {
            return null;
        }
        try {
            return new JSONObject(Utility.P(new FileInputStream(new File(fileB, str))));
        } catch (Exception unused) {
            a(str);
            return null;
        }
    }

    public static final void g(String str, JSONArray jSONArray, GraphRequest.Callback callback) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            String str2 = GraphRequest.j;
            GraphRequest.Companion.g(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{FacebookSdk.c()}, 1)), jSONObject, callback).d();
        } catch (JSONException unused) {
        }
    }

    public static final void h(String str, String str2) {
        File fileB = b();
        if (fileB == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileB, str));
            byte[] bytes = str2.getBytes(Charsets.f44691a);
            Intrinsics.e(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
