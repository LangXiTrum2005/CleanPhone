package com.smartdigimkt.z5;

import android.text.TextUtils;
import com.smartdigimkt.w6.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f40383b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, c> f40384a = new HashMap();

    private a() {
    }

    public static a a() {
        if (f40383b == null) {
            synchronized (a.class) {
                try {
                    if (f40383b == null) {
                        f40383b = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f40383b;
    }

    public void a(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        this.f40384a.put(str, cVar);
    }

    public c a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f40384a.remove(str);
    }
}
