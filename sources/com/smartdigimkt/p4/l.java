package com.smartdigimkt.p4;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f37557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37559c;

    public l(String... strArr) {
        this.f37557a = strArr;
    }

    public synchronized void a(String... strArr) {
        a.b(!this.f37558b, "Cannot set libraries after loading");
        this.f37557a = strArr;
    }

    public synchronized boolean a() {
        if (this.f37558b) {
            return this.f37559c;
        }
        this.f37558b = true;
        try {
            for (String str : this.f37557a) {
                System.loadLibrary(str);
            }
            this.f37559c = true;
        } catch (UnsatisfiedLinkError unused) {
        }
        return this.f37559c;
    }
}
