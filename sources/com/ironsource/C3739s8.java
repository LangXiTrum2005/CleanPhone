package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3739s8 implements InterfaceC3616l7 {
    private static Map<String, Object> a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.s8$a */
    public static class a {
        String a;
        String b;
        String c;
        Context d;
        String e;
        String f;

        public a a(String str) {
            this.b = str;
            return this;
        }

        public a b(String str) {
            this.f = str;
            return this;
        }

        public a c(String str) {
            this.c = str;
            return this;
        }

        public a d(String str) {
            this.a = str;
            return this;
        }

        public a e(String str) {
            this.e = str;
            return this;
        }

        public a a(Context context) {
            this.d = context;
            return this;
        }

        public C3739s8 a() {
            return new C3739s8(this);
        }
    }

    private void a(Context context) {
        a.put(A5.e, U3.b(context));
        a.put(A5.f, U3.d(context));
    }

    public static void b(String str) {
        a.put(A5.f, SDKUtils.encodeString(str));
    }

    private C3739s8(a aVar) {
        a(aVar);
        a(aVar.d);
    }

    private void a(a aVar) {
        Context context = aVar.d;
        W4 w4B = W4.b(context);
        a.put(A5.j, SDKUtils.encodeString(w4B.e()));
        a.put(A5.k, SDKUtils.encodeString(w4B.f()));
        a.put(A5.l, Integer.valueOf(w4B.a()));
        a.put(A5.m, SDKUtils.encodeString(w4B.d()));
        a.put(A5.n, SDKUtils.encodeString(w4B.c()));
        a.put(A5.d, SDKUtils.encodeString(context.getPackageName()));
        a.put(A5.g, SDKUtils.encodeString(aVar.b));
        a.put("sessionid", SDKUtils.encodeString(aVar.a));
        a.put(A5.b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        a.put(A5.o, A5.t);
        a.put("origin", A5.q);
        if (!TextUtils.isEmpty(aVar.e)) {
            a.put(A5.i, SDKUtils.encodeString(aVar.e));
        }
        if (TextUtils.isEmpty(aVar.f)) {
            return;
        }
        a.put(A5.K, aVar.f);
    }

    @Override // com.ironsource.InterfaceC3616l7
    public Map<String, Object> a() {
        return a;
    }

    public static void a(String str) {
        a.put(A5.e, SDKUtils.encodeString(str));
    }
}
