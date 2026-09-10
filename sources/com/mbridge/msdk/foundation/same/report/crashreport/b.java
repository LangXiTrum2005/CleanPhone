package com.mbridge.msdk.foundation.same.report.crashreport;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    public static List<String> a() {
        ArrayList arrayList = new ArrayList();
        try {
            g gVarF = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarF == null) {
                gVarF = i.b().a();
            }
            Matcher matcher = Pattern.compile("<mvpackage>([^<]+)</mvpackage>").matcher(gVarF.R());
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                if (!TextUtils.isEmpty(strGroup)) {
                    String[] strArrSplit = strGroup.split(",");
                    if (strArrSplit.length > 0) {
                        arrayList.addAll(Arrays.asList(strArrSplit));
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add("mbridge");
            }
            return arrayList;
        } catch (Exception e10) {
            q0.b("FilterStringUtil", e10.getMessage());
            arrayList.clear();
            arrayList.add("mbridge");
            return arrayList;
        }
    }

    public static JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return jSONObject;
            }
            float fMaxMemory = (float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d);
            float f10 = (float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d);
            float fFreeMemory = (float) ((Runtime.getRuntime().freeMemory() * 1.0d) / 1048576.0d);
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            long usableSpace = externalStorageDirectory.getUsableSpace();
            long totalSpace = externalStorageDirectory.getTotalSpace();
            String fileSize = Formatter.formatFileSize(contextD, usableSpace);
            String fileSize2 = Formatter.formatFileSize(contextD, totalSpace);
            jSONObject.put("max_memory", String.valueOf(fMaxMemory));
            jSONObject.put("memoryby_app", String.valueOf(f10));
            jSONObject.put("remaining_memory", fFreeMemory);
            jSONObject.put("sdcard_remainder", fileSize);
            jSONObject.put("totalspacestr", fileSize2);
            jSONObject.put("crashtime", str);
            return jSONObject;
        } catch (Throwable th2) {
            q0.b("AbnormalExitUtil", th2.getMessage());
            return jSONObject;
        }
    }
}
