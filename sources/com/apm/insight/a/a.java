package com.apm.insight.a;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.b.i;
import com.apm.insight.runtime.m;

/* JADX INFO: loaded from: classes.dex */
public class a implements ICrashCallback {
    private static volatile a d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f9973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile i.a f9974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile i.a f9975c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f9976e = false;

    private a() {
    }

    public static a a() {
        if (d == null) {
            synchronized (a.class) {
                try {
                    if (d == null) {
                        d = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(CrashType crashType, String str, Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    public final void a(String str, i.a aVar, i.a aVar2) {
        this.f9973a = str;
        this.f9974b = aVar;
        this.f9975c = aVar2;
        if (this.f9976e) {
            return;
        }
        this.f9976e = true;
        m.a().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
