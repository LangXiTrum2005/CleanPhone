package com.smartdigimkt.g7;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile c f35508b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f35509a = new HashMap();

    private c() {
    }

    public static c a() {
        if (f35508b == null) {
            synchronized (c.class) {
                try {
                    if (f35508b == null) {
                        f35508b = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f35508b;
    }

    public synchronized void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a aVar = this.f35509a.get(str);
        if (aVar != null) {
            aVar.k();
        }
    }

    public synchronized void c(String str) {
        if (this.f35509a != null && !TextUtils.isEmpty(str)) {
            this.f35509a.remove(str);
        }
    }

    public synchronized void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a aVar = this.f35509a.get(str);
        if (aVar != null) {
            aVar.m();
        }
    }

    public synchronized a a(String str) {
        a aVar = this.f35509a.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(str);
        this.f35509a.put(str, aVar2);
        return aVar2;
    }
}
