package com.apm.insight;

import android.text.TextUtils;
import com.p004ironsource.fl;
import com.smartdigimkt.x.g;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ICrashCallback, IOOMCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOOMCallback f9978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ICrashCallback f9979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9980c;

    public b(String str, ICrashCallback iCrashCallback) {
        this.f9980c = str;
        this.f9979b = iCrashCallback;
    }

    public final void a(CrashType crashType, Throwable th, Thread thread, long j, JSONArray jSONArray) {
        CrashType crashType2;
        Throwable th2;
        Thread thread2;
        long j2;
        if (this.f9978a == null || jSONArray == null) {
            return;
        }
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i2), g.f39716B, fl.SESSION_HISTORY_KEY_AD_ID), this.f9980c)) {
                crashType2 = crashType;
                th2 = th;
                thread2 = thread;
                j2 = j;
                this.f9978a.onCrash(crashType2, th2, thread2, j2);
            } else {
                crashType2 = crashType;
                th2 = th;
                thread2 = thread;
                j2 = j;
            }
            i2++;
            crashType = crashType2;
            th = th2;
            thread = thread2;
            j = j2;
        }
    }

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(CrashType crashType, Throwable th, Thread thread, long j) {
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.f9980c = str;
        this.f9978a = iOOMCallback;
    }

    public final void a(CrashType crashType, String str, Thread thread, JSONArray jSONArray) {
        if (this.f9979b == null || jSONArray == null) {
            return;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i2), g.f39716B, fl.SESSION_HISTORY_KEY_AD_ID), this.f9980c)) {
                this.f9979b.onCrash(crashType, str, thread);
            }
        }
    }

    public final void a(CrashType crashType, String str, String str2, String str3) {
        d dVarA;
        if (this.f9979b == null || (dVarA = d.a(this.f9980c)) == null || !dVarA.a(str3, str2)) {
            return;
        }
        this.f9979b.onCrash(crashType, str, null);
    }
}
