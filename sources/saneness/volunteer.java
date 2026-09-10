package saneness;

import ads_mobile_sdk.jk0;
import ads_mobile_sdk.to0;
import ads_mobile_sdk.ym;
import ads_mobile_sdk.zk;
import ads_mobile_sdk.zm;
import ads_mobile_sdk.zs2;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class volunteer {
    public static long attabal(jk0 flags, to0 signalId) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(signalId, "signalId");
        flags.getClass();
        JsonObject defaultValue = jk0.y;
        Intrinsics.checkNotNullParameter("gads:signal_source_timeouts_ms", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return saneness((JsonObject) flags.a("gads:signal_source_timeouts_ms", defaultValue, zk.i), defaultValue, signalId, zs2.c.a);
    }

    public static boolean dern(JsonObject jsonObject, JsonObject jsonObject2, to0 to0Var) {
        try {
            try {
                JsonElement jsonElement = jsonObject.get(String.valueOf(to0Var.getNumber()));
                Intrinsics.checkNotNullExpressionValue(jsonElement, "get(...)");
                return jsonElement.getAsBoolean();
            } catch (Exception unused) {
                JsonElement jsonElement2 = jsonObject2.get(String.valueOf(to0Var.getNumber()));
                Intrinsics.checkNotNullExpressionValue(jsonElement2, "get(...)");
                return jsonElement2.getAsBoolean();
            }
        } catch (Exception unused2) {
            if (ym.a() == zm.PRODUCTION) {
                return false;
            }
            throw new Exception("No default value for signal: " + to0Var);
        }
    }

    public static long saneness(JsonObject jsonObject, JsonObject jsonObject2, to0 to0Var, long j) {
        try {
            try {
                p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                JsonElement jsonElement = jsonObject.get(String.valueOf(to0Var.getNumber()));
                Intrinsics.checkNotNullExpressionValue(jsonElement, "get(...)");
                return p002kotlin.time.dern.graveside(jsonElement.getAsLong(), DurationUnit.MILLISECONDS);
            } catch (Exception unused) {
                if (ym.a() == zm.PRODUCTION) {
                    return j;
                }
                throw new Exception("No default value for signal: " + to0Var);
            }
        } catch (Exception unused2) {
            p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
            JsonElement jsonElement2 = jsonObject2.get(String.valueOf(to0Var.getNumber()));
            Intrinsics.checkNotNullExpressionValue(jsonElement2, "get(...)");
            return p002kotlin.time.dern.graveside(jsonElement2.getAsLong(), DurationUnit.MILLISECONDS);
        }
    }
}
