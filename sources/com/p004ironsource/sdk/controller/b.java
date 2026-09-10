package com.p004ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.p004ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: loaded from: classes5.dex */
class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f26844b = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v.r f26845a;

    public b(v.r rVar) {
        this.f26845a = rVar;
    }

    public void a(String str) {
        v.r rVar = this.f26845a;
        if (rVar != null) {
            rVar.c(str);
        }
    }

    public void b(String str) {
        v.r rVar = this.f26845a;
        if (rVar != null) {
            rVar.d(str);
        }
    }

    public synchronized void a(String str, String str2) throws Exception {
        if (this.f26845a == null) {
            Logger.e(f26844b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = v.r.class.getDeclaredMethod(str, String.class);
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.f26845a, str2);
        } else {
            throw new AccessControlException("Trying to access a private function: " + str);
        }
    }
}
