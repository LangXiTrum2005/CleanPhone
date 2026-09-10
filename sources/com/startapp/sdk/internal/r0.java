package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41419a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vf f41420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile String f41421c;
    public volatile String d;

    public r0(vf vfVar) {
        this.f41420b = vfVar;
    }

    public final boolean a(String str, String str2) {
        boolean z2;
        if (str != null) {
            str = str.trim();
            if (str.isEmpty()) {
                str = null;
            }
        }
        if (str2 != null) {
            str2 = str2.trim();
            if (str2.isEmpty()) {
                str2 = null;
            }
        }
        synchronized (this.f41419a) {
            try {
                z2 = (vi.a((Object) this.f41421c, (Object) str) && vi.a((Object) this.d, (Object) str2)) ? false : true;
                this.f41421c = str;
                this.d = str2;
                uf ufVarEdit = this.f41420b.edit();
                ufVarEdit.a("c88d4eab540fab77", str);
                ufVarEdit.f41545a.putString("c88d4eab540fab77", str);
                ufVarEdit.a("2696a7f502faed4b", str2);
                ufVarEdit.f41545a.putString("2696a7f502faed4b", str2);
                ufVarEdit.f41545a.commit();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public final String a() {
        String string;
        String str = this.d;
        if (str != null) {
            return str;
        }
        synchronized (this.f41419a) {
            try {
                string = this.d;
                if (string == null && (string = this.f41420b.getString("2696a7f502faed4b", null)) == null) {
                    string = this.f41420b.getString("31721150b470a3b9", null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }
}
