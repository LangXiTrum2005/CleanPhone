package com.smartdigimkt.p8;

import android.text.TextUtils;
import android.util.Log;
import com.p004ironsource.d9;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    private static volatile a d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f37735b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37734a = "a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, Long> f37736c = new HashMap<>();

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

    public void b() {
        Log.e(this.f37734a, "recordLoadStart>>>>>> start");
        this.f37735b = System.currentTimeMillis();
        this.f37736c.clear();
    }

    public void c(String str) {
        this.f37736c.put(str, Long.valueOf(System.currentTimeMillis()));
        a(str);
    }

    public void b(String str) {
        a(str, "");
    }

    public void a(String str, String str2) {
        Long l2 = this.f37736c.get(str);
        if (l2 == null) {
            Log.w(this.f37734a, str + ">>>>>> not start");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            a(str, System.currentTimeMillis() - l2.longValue());
        } else {
            a(android.support.v4.media.a.D(str, "---", str2), System.currentTimeMillis() - l2.longValue());
        }
    }

    private void a(String str) {
        Log.i(this.f37734a, d9.i.d + (System.currentTimeMillis() - this.f37735b) + d9.i.f24752e + str + ">>>>>> start");
    }

    private void a(String str, long j) {
        Log.d(this.f37734a, d9.i.d + (System.currentTimeMillis() - this.f37735b) + d9.i.f24752e + str + ">>>>>> end usetime:" + j);
    }
}
