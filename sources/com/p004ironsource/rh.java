package com.p004ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class rh implements kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Object> f26670a = new HashMap();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f26671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f26672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f26673c;
        Context d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f26674e;

        public b a(Context context) {
            this.d = context;
            return this;
        }

        public b b(String str) {
            this.f26673c = str;
            return this;
        }

        public b c(String str) {
            this.f26671a = str;
            return this;
        }

        public b d(String str) {
            this.f26674e = str;
            return this;
        }

        public b a(String str) {
            this.f26672b = str;
            return this;
        }

        public rh a() {
            return new rh(this);
        }
    }

    private rh(b bVar) {
        a(bVar);
        a(bVar.d);
    }

    public static void b(String str) {
        f26670a.put(dc.f, SDKUtils.encodeString(str));
    }

    @Override // com.p004ironsource.kf
    public Map<String, Object> a() {
        return f26670a;
    }

    private void a(Context context) {
        f26670a.put(dc.f24783e, a9.b(context));
        f26670a.put(dc.f, a9.d(context));
    }

    private void a(b bVar) {
        Context context = bVar.d;
        za zaVarB = za.b(context);
        f26670a.put(dc.j, SDKUtils.encodeString(zaVarB.e()));
        f26670a.put(dc.k, SDKUtils.encodeString(zaVarB.f()));
        f26670a.put(dc.f24786l, Integer.valueOf(zaVarB.a()));
        f26670a.put(dc.m, SDKUtils.encodeString(zaVarB.d()));
        f26670a.put(dc.f24787n, SDKUtils.encodeString(zaVarB.c()));
        f26670a.put(dc.d, SDKUtils.encodeString(context.getPackageName()));
        f26670a.put(dc.g, SDKUtils.encodeString(bVar.f26672b));
        f26670a.put("sessionid", SDKUtils.encodeString(bVar.f26671a));
        f26670a.put(dc.f24781b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f26670a.put(dc.o, dc.t);
        f26670a.put("origin", dc.q);
        if (TextUtils.isEmpty(bVar.f26674e)) {
            return;
        }
        f26670a.put(dc.f24785i, SDKUtils.encodeString(bVar.f26674e));
    }

    public static void a(String str) {
        f26670a.put(dc.f24783e, SDKUtils.encodeString(str));
    }
}
