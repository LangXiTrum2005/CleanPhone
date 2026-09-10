package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f30290b = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v.s f30291a;

    public b(v.s sVar) {
        this.f30291a = sVar;
    }

    public synchronized void a(String str, String str2) throws Exception {
        if (this.f30291a == null) {
            Logger.e(f30290b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = v.s.class.getDeclaredMethod(str, String.class);
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.f30291a, str2);
        } else {
            throw new AccessControlException("Trying to access a private function: " + str);
        }
    }

    public void b(String str) {
        v.s sVar = this.f30291a;
        if (sVar != null) {
            sVar.v(str);
        }
    }

    public void a(String str) {
        v.s sVar = this.f30291a;
        if (sVar != null) {
            sVar.u(str);
        }
    }
}
