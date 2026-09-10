package com.smartdigimkt.k1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f36142a = "AppletSchemeCallBack";

    @Override // com.smartdigimkt.k1.d
    public void a() {
        try {
            b();
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.getMessage();
            }
        }
    }

    public abstract void b();

    @Override // com.smartdigimkt.k1.d
    public void b(int i2, String str, String str2) {
        try {
            c(i2, str, str2);
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.getMessage();
            }
        }
    }

    public abstract void b(String str);

    public abstract void c(int i2, String str, String str2);

    @Override // com.smartdigimkt.k1.d
    public void a(String str) {
        try {
            b(str);
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.getMessage();
            }
        }
    }

    @Override // com.smartdigimkt.k1.d
    public void a(int i2, String str, String str2) {
        try {
            c(i2, str, str2);
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.getMessage();
            }
        }
    }
}
