package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e3 {
    public abstract void a(cb cbVar);

    public final boolean a(Context context, String[] strArr, bb bbVar, Bundle bundle) {
        Class clsAsSubclass;
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        boolean z2 = false;
        for (String str : strArr) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(cb.class);
            } catch (Throwable unused) {
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(Context.class, bb.class, Bundle.class);
                    declaredConstructor.setAccessible(true);
                    Context contextA = x0.a(context);
                    if (contextA == null) {
                        contextA = context;
                    }
                    a((cb) declaredConstructor.newInstance(contextA, bbVar, bundle));
                    z2 = true;
                } catch (Throwable unused2) {
                }
            }
        }
        return z2;
    }
}
