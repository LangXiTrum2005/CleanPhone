package com.apm.insight.entity;

import com.apm.insight.e;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.smartdigimkt.x.g;
import com.thinkup.core.common.oo.o;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10092a;

    private c(String str) {
        this.f10092a = str;
    }

    public static c a(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z2, String str4, String str5) {
        c cVar = new c(str5);
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        cVar.a(o.C0684o.m, (Object) g.f39715A);
        cVar.a("log_type", (Object) str5);
        cVar.a("timestamp", Long.valueOf(System.currentTimeMillis()));
        cVar.a("crash_time", Long.valueOf(System.currentTimeMillis()));
        cVar.a("class_ref", (Object) className);
        cVar.a("method", (Object) methodName);
        cVar.a("line_num", Integer.valueOf(lineNumber));
        cVar.a("stack", (Object) str);
        cVar.a("exception_type", (Object) 1);
        cVar.a("ensure_type", (Object) str4);
        cVar.a("is_core", Integer.valueOf(z2 ? 1 : 0));
        cVar.a(PglCryptUtils.KEY_MESSAGE, (Object) str2);
        e.g();
        cVar.a("process_name", (Object) com.apm.insight.l.a.b());
        cVar.a("crash_thread_name", (Object) str3);
        d.b(cVar.c());
        return cVar;
    }
}
