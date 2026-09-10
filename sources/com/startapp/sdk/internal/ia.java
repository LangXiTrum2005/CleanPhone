package com.startapp.sdk.internal;

import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vf f41088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f41089b;

    public ia(vf vfVar) {
        this.f41088a = vfVar;
    }

    public final String a() {
        String string;
        String str = this.f41089b;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            try {
                string = this.f41089b;
                if (string == null) {
                    string = this.f41088a.getString("e695c6d894060903", null);
                    if (string == null) {
                        string = UUID.randomUUID().toString();
                        uf ufVarEdit = this.f41088a.edit();
                        ufVarEdit.a("e695c6d894060903", string);
                        ufVarEdit.f41545a.putString("e695c6d894060903", string);
                        if (!ufVarEdit.f41545a.commit()) {
                            string = "00000000-0000-0000-0000-000000000000";
                        }
                    }
                    this.f41089b = string;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }
}
