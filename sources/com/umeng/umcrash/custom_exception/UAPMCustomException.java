package com.umeng.umcrash.custom_exception;

import android.text.TextUtils;
import com.umeng.crash.UCrash;
import com.umeng.innner.umcrash.UMCrashThreadPoolExecutorFactory;
import com.umeng.umcrash.UMCrashUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class UAPMCustomException {
    private static final String TAG = "UAPMCustomException";

    public static void generateCustomLog(final boolean z, boolean z2, boolean z3, final String str, final String str2, final String str3, final boolean z4, final boolean z5) {
        if ((!z && !z2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        UMCrashThreadPoolExecutorFactory.execute(new Runnable() { // from class: com.umeng.umcrash.custom_exception.UAPMCustomException.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    HashMap map = new HashMap(20);
                    map.put(UMCustomLogInfoBuilder.LOG_KEY_CT, "exception");
                    map.put(UMCustomLogInfoBuilder.LOG_KEY_AC, str2);
                    StringBuffer stringBuffer = new StringBuffer();
                    for (Map.Entry entry : map.entrySet()) {
                        stringBuffer.append((String) entry.getKey());
                        stringBuffer.append(":");
                        stringBuffer.append((String) entry.getValue());
                        stringBuffer.append("\n");
                    }
                    String str4 = str3;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = "Exception message:" + str4 + "\nBack traces starts.\n" + str + "\nBack traces ends.";
                    if (!TextUtils.isEmpty(str5)) {
                        stringBuffer.append(str5);
                        stringBuffer.append("\n");
                    }
                    if (z5) {
                        Map<String, String> allThreadTraces = UMCrashUtils.getAllThreadTraces();
                        stringBuffer.append(UMCustomLogInfoBuilder.LOG_SECTION_SEP);
                        stringBuffer.append("\n");
                        stringBuffer.append("AllThreadsTraces: \n");
                        for (Map.Entry<String, String> entry2 : allThreadTraces.entrySet()) {
                            stringBuffer.append(entry2.getKey());
                            stringBuffer.append("\n");
                            stringBuffer.append(entry2.getValue());
                            stringBuffer.append("\n");
                        }
                    }
                    if (z) {
                        UCrash.generateCustomLog(stringBuffer.toString(), z4);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void generateCustomLog(final boolean z, boolean z2, boolean z3, final Throwable th, final String str, final String str2, final boolean z4, final boolean z5) {
        if ((!z && !z2) || th == null || TextUtils.isEmpty(str)) {
            return;
        }
        UMCrashThreadPoolExecutorFactory.execute(new Runnable() { // from class: com.umeng.umcrash.custom_exception.UAPMCustomException.2
            @Override // java.lang.Runnable
            public void run() {
                CustomLogInfo customLogInfoBuild;
                try {
                    UMCustomLogInfoBuilder uMCustomLogInfoBuilderAddLogCat = new UMCustomLogInfoBuilder(str).stack(th, str2).addLogCat(z4);
                    if (z5) {
                        StringBuilder sb = new StringBuilder("AllThreadsTraces: \n");
                        for (Map.Entry<String, String> entry : UMCrashUtils.getAllThreadTraces().entrySet()) {
                            sb.append(entry.getKey());
                            sb.append("\n");
                            sb.append(entry.getValue());
                            sb.append("\n");
                        }
                        customLogInfoBuild = uMCustomLogInfoBuilderAddLogCat.addSection(sb.toString()).build();
                    } else {
                        customLogInfoBuild = uMCustomLogInfoBuilderAddLogCat.build();
                    }
                    if (z) {
                        UCrash.generateCustomLog(customLogInfoBuild.mData.toString(), z4);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
