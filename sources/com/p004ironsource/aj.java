package com.p004ironsource;

import android.content.Context;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ironsource/aj;", "", "<init>", "()V", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.ironsource.aj$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, d2 = {"Lcom/ironsource/aj$a;", "", "Landroid/content/Context;", "context", "Lorg/json/JSONObject;", "a", "Lcom/ironsource/qt;", "c", "Lcom/ironsource/f8;", "d", "", "b", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        private final JSONObject a(Context context) {
            try {
                return new JSONObject(IronSourceUtils.getLastResponse(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        @JvmStatic
        public final boolean b(Context context) {
            Intrinsics.f(context, "context");
            f8 f8VarD = d(context);
            return f8VarD.d().length() > 0 && f8VarD.e().length() > 0;
        }

        @JvmStatic
        public final qt c(Context context) {
            Intrinsics.f(context, "context");
            f8 f8VarD = d(context);
            if (f8VarD.d().length() <= 0 || f8VarD.e().length() <= 0) {
                f8VarD = null;
            }
            if (f8VarD == null) {
                return null;
            }
            qt qtVar = new qt(context, f8VarD.d(), f8VarD.f(), f8VarD.e());
            qtVar.a(qt.a.CACHE);
            return qtVar;
        }

        @JvmStatic
        public final f8 d(Context context) {
            Intrinsics.f(context, "context");
            JSONObject jSONObjectA = a(context);
            String cachedAppKey = jSONObjectA.optString("appKey");
            String cachedUserId = jSONObjectA.optString("userId");
            String cachedSettings = jSONObjectA.optString(qt.f26623n);
            Intrinsics.e(cachedAppKey, "cachedAppKey");
            Intrinsics.e(cachedUserId, "cachedUserId");
            Intrinsics.e(cachedSettings, "cachedSettings");
            return new f8(cachedAppKey, cachedUserId, cachedSettings);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    public static final boolean a(Context context) {
        return INSTANCE.b(context);
    }

    @JvmStatic
    public static final qt b(Context context) {
        return INSTANCE.c(context);
    }

    @JvmStatic
    public static final f8 c(Context context) {
        return INSTANCE.d(context);
    }
}
