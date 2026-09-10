package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.u8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0603u8 implements InterfaceC0477n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Object> f30796a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.u8$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f30797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f30798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f30799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Context f30800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f30801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f30802f;

        public a a(String str) {
            this.f30798b = str;
            return this;
        }

        public a b(String str) {
            this.f30802f = str;
            return this;
        }

        public a c(String str) {
            this.f30799c = str;
            return this;
        }

        public a d(String str) {
            this.f30797a = str;
            return this;
        }

        public a e(String str) {
            this.f30801e = str;
            return this;
        }

        public a a(Context context) {
            this.f30800d = context;
            return this;
        }

        public C0603u8 a() {
            return new C0603u8(this, 0);
        }
    }

    public /* synthetic */ C0603u8(a aVar, int i10) {
        this(aVar);
    }

    private void a(Context context) {
        f30796a.put(B5.f25692e, U3.b(context));
        f30796a.put(B5.f25693f, U3.d(context));
    }

    public static void b(String str) {
        f30796a.put(B5.f25693f, SDKUtils.encodeString(str));
    }

    private C0603u8(a aVar) {
        a(aVar);
        a(aVar.f30800d);
    }

    private void a(a aVar) {
        Context context = aVar.f30800d;
        X4 x4B = X4.b(context);
        f30796a.put(B5.f25697j, SDKUtils.encodeString(x4B.e()));
        f30796a.put(B5.f25698k, SDKUtils.encodeString(x4B.f()));
        f30796a.put(B5.l, Integer.valueOf(x4B.a()));
        f30796a.put(B5.f25699m, SDKUtils.encodeString(x4B.d()));
        f30796a.put(B5.f25700n, SDKUtils.encodeString(x4B.c()));
        f30796a.put(B5.f25691d, SDKUtils.encodeString(context.getPackageName()));
        f30796a.put(B5.f25694g, SDKUtils.encodeString(aVar.f30798b));
        f30796a.put("sessionid", SDKUtils.encodeString(aVar.f30797a));
        f30796a.put(B5.f25689b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f30796a.put(B5.f25701o, B5.f25706t);
        f30796a.put("origin", B5.f25703q);
        if (!TextUtils.isEmpty(aVar.f30801e)) {
            f30796a.put(B5.f25696i, SDKUtils.encodeString(aVar.f30801e));
        }
        if (TextUtils.isEmpty(aVar.f30802f)) {
            return;
        }
        f30796a.put(B5.K, aVar.f30802f);
    }

    @Override // com.ironsource.InterfaceC0477n7
    public Map<String, Object> a() {
        return f30796a;
    }

    public static void a(String str) {
        f30796a.put(B5.f25692e, SDKUtils.encodeString(str));
    }
}
