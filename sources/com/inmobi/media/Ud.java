package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6 f23276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f23277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Integer f23278c;

    static {
        C6 c6A;
        Context contextD = Uc.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = C6.f22734b;
            c6A = B6.a(contextD, "imtelemetrydboverflow");
        } else {
            c6A = null;
        }
        f23276a = c6A;
        f23277b = -1;
    }

    public static int a() {
        if (f23277b == -1) {
            C6 c6 = f23276a;
            f23277b = c6 != null ? c6.f22735a.getInt("count", 0) : 0;
        }
        return f23277b;
    }
}
