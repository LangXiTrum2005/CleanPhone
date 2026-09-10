package com.smartdigimkt.g5;

/* JADX INFO: loaded from: classes5.dex */
public class f extends com.smartdigimkt.v4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f35450a;

    private f() {
    }

    @Override // com.smartdigimkt.v4.b
    public void a(Object obj, String str) {
    }

    @Override // com.smartdigimkt.v4.b
    public void b(Object obj, String str) {
    }

    @Override // com.smartdigimkt.v4.b
    public void a(Object obj, String str, String str2) {
    }

    public static f a() {
        if (f35450a == null) {
            synchronized (f.class) {
                try {
                    if (f35450a == null) {
                        f35450a = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f35450a;
    }
}
