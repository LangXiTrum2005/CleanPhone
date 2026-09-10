package com.mbridge.msdk.foundation.db.middle;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.k;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.buffer.a f33500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f33501b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f33502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.buffer.a f33503b;

        public a(boolean z10, com.mbridge.msdk.foundation.same.buffer.a aVar) {
            this.f33502a = z10;
            this.f33503b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f33502a || b.this.f33501b == null) {
                return;
            }
            for (String str : this.f33503b.a()) {
                b.this.f33501b.a(str, b.this.f33500a.a(str));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.middle.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class C0121b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static b f33505a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    private b() {
        this.f33500a = new com.mbridge.msdk.foundation.same.buffer.a(1000);
        try {
            k kVarA = k.a(g.a(c.n().d()));
            this.f33501b = kVarA;
            a(kVarA.d(), false);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            com.mbridge.msdk.foundation.same.buffer.a aVar = new com.mbridge.msdk.foundation.same.buffer.a(100);
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                this.f33500a.a(next, jSONObjectOptJSONObject);
                aVar.a(next, jSONObjectOptJSONObject);
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(z10, aVar));
        }
    }

    public JSONArray b() {
        return new JSONArray((Collection) this.f33500a.a());
    }

    public static b a() {
        return C0121b.f33505a;
    }

    public JSONObject a(String str) {
        k kVar;
        JSONObject jSONObjectA = this.f33500a.a(str);
        if (jSONObjectA != null || (kVar = this.f33501b) == null) {
            return jSONObjectA;
        }
        JSONObject jSONObjectB = kVar.b(str);
        if (jSONObjectB != null) {
            this.f33500a.a(str, jSONObjectB);
        }
        return jSONObjectB;
    }
}
