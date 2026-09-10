package com.smartdigimkt.i7;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f35854b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, InterfaceC0508a> f35855a = new ConcurrentHashMap(2);

    /* JADX INFO: renamed from: com.smartdigimkt.i7.a$a, reason: collision with other inner class name */
    public interface InterfaceC0508a {
        void a(String str);
    }

    private a() {
    }

    public static a a() {
        if (f35854b == null) {
            synchronized (a.class) {
                try {
                    if (f35854b == null) {
                        f35854b = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f35854b;
    }

    public void a(String str, InterfaceC0508a interfaceC0508a) {
        if (TextUtils.isEmpty(str) || interfaceC0508a == null) {
            return;
        }
        this.f35855a.put(str, interfaceC0508a);
    }

    public void a(String str) {
        InterfaceC0508a interfaceC0508aRemove;
        if (TextUtils.isEmpty(str) || (interfaceC0508aRemove = this.f35855a.remove(str)) == null) {
            return;
        }
        interfaceC0508aRemove.a(str);
    }
}
