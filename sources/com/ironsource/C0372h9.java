package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.h9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0372h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f28784a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.h9$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final JSONObject a(Context context) {
            try {
                return new JSONObject(IronSourceUtils.e(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        public final boolean b(Context context) {
            kotlin.jvm.internal.n.f(context, "context");
            C0652x3 c0652x3D = d(context);
            return c0652x3D.d().length() > 0 && c0652x3D.e().length() > 0;
        }

        public final Ve c(Context context) {
            kotlin.jvm.internal.n.f(context, "context");
            C0652x3 c0652x3D = d(context);
            if (c0652x3D.d().length() <= 0 || c0652x3D.e().length() <= 0) {
                c0652x3D = null;
            }
            if (c0652x3D == null) {
                return null;
            }
            Ve ve = new Ve(context, c0652x3D.d(), c0652x3D.f(), c0652x3D.e());
            ve.a(Ve.a.CACHE);
            return ve;
        }

        public final C0652x3 d(Context context) {
            kotlin.jvm.internal.n.f(context, "context");
            JSONObject jSONObjectA = a(context);
            String cachedAppKey = jSONObjectA.optString("appKey");
            String cachedUserId = jSONObjectA.optString("userId");
            String cachedSettings = jSONObjectA.optString(Ve.f27442n);
            kotlin.jvm.internal.n.e(cachedAppKey, "cachedAppKey");
            kotlin.jvm.internal.n.e(cachedUserId, "cachedUserId");
            kotlin.jvm.internal.n.e(cachedSettings, "cachedSettings");
            return new C0652x3(cachedAppKey, cachedUserId, cachedSettings);
        }

        private a() {
        }
    }

    public static final boolean a(Context context) {
        return f28784a.b(context);
    }

    public static final Ve b(Context context) {
        return f28784a.c(context);
    }

    public static final C0652x3 c(Context context) {
        return f28784a.d(context);
    }
}
