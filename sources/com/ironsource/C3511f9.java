package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3511f9 {
    public static final a a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.f9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
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
            Intrinsics.checkNotNullParameter(context, "context");
            C3819x3 c3819x3D = d(context);
            return c3819x3D.d().length() > 0 && c3819x3D.e().length() > 0;
        }

        public final Ie c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C3819x3 c3819x3D = d(context);
            if (c3819x3D.d().length() <= 0 || c3819x3D.e().length() <= 0) {
                c3819x3D = null;
            }
            if (c3819x3D == null) {
                return null;
            }
            Ie ie = new Ie(context, c3819x3D.d(), c3819x3D.f(), c3819x3D.e());
            ie.a(Ie.a.CACHE);
            return ie;
        }

        public final C3819x3 d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            JSONObject jSONObjectA = a(context);
            String cachedAppKey = jSONObjectA.optString("appKey");
            String cachedUserId = jSONObjectA.optString("userId");
            String cachedSettings = jSONObjectA.optString(Ie.n);
            Intrinsics.checkNotNullExpressionValue(cachedAppKey, "cachedAppKey");
            Intrinsics.checkNotNullExpressionValue(cachedUserId, "cachedUserId");
            Intrinsics.checkNotNullExpressionValue(cachedSettings, "cachedSettings");
            return new C3819x3(cachedAppKey, cachedUserId, cachedSettings);
        }

        private a() {
        }
    }

    public static final boolean a(Context context) {
        return a.b(context);
    }

    public static final Ie b(Context context) {
        return a.c(context);
    }

    public static final C3819x3 c(Context context) {
        return a.d(context);
    }
}
