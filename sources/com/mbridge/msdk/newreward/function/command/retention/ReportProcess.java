package com.mbridge.msdk.newreward.function.command.retention;

import com.mbridge.msdk.newreward.adapter.e;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class ReportProcess {
    static e adapterModel;

    public static void init(e eVar) {
        adapterModel = eVar;
    }

    public static void reportProcessAtThisTime(Object obj) {
        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (!method.isAnnotationPresent(ReportAnnotation.MethodInfo.class)) {
                return;
            }
        }
    }
}
