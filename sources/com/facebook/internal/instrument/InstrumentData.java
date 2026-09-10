package com.facebook.internal.instrument;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.FacebookSdk;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData;", "", "Builder", "Companion", "Type", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class InstrumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Type f16414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONArray f16415c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16416e;
    public String f;
    public Long g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Builder;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {
        public static final InstrumentData a(String str, String str2) {
            InstrumentData instrumentData = new InstrumentData();
            instrumentData.f16414b = Type.Z;
            Context contextB = FacebookSdk.b();
            String str3 = null;
            if (contextB != null) {
                try {
                    PackageInfo packageInfo = contextB.getPackageManager().getPackageInfo(contextB.getPackageName(), 0);
                    if (packageInfo != null) {
                        str3 = packageInfo.versionName;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            instrumentData.d = str3;
            instrumentData.f16416e = str;
            instrumentData.f = str2;
            Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
            instrumentData.g = lValueOf;
            StringBuffer stringBuffer = new StringBuffer("anr_log_");
            stringBuffer.append(String.valueOf(lValueOf));
            stringBuffer.append(".json");
            String string = stringBuffer.toString();
            Intrinsics.e(string, "StringBuffer()\n         …)\n            .toString()");
            instrumentData.f16413a = string;
            return instrumentData;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0020  */
        public static final InstrumentData b(Throwable th, Type type) {
            String str;
            String str2;
            InstrumentData instrumentData = new InstrumentData();
            instrumentData.f16414b = type;
            Context contextB = FacebookSdk.b();
            Throwable th2 = null;
            if (contextB != null) {
                try {
                    PackageInfo packageInfo = contextB.getPackageManager().getPackageInfo(contextB.getPackageName(), 0);
                    if (packageInfo != null) {
                        str = packageInfo.versionName;
                    } else {
                        str = null;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } else {
                str = null;
            }
            instrumentData.d = str;
            instrumentData.f16416e = th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
            JSONArray jSONArray = new JSONArray();
            while (th != null && th != th2) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    jSONArray.put(stackTraceElement.toString());
                }
                th2 = th;
                th = th.getCause();
            }
            instrumentData.f = jSONArray.toString();
            Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
            instrumentData.g = lValueOf;
            StringBuffer stringBuffer = new StringBuffer();
            int iOrdinal = type.ordinal();
            if (iOrdinal == 1) {
                str2 = "analysis_log_";
            } else if (iOrdinal == 2) {
                str2 = "anr_log_";
            } else if (iOrdinal == 3) {
                str2 = "crash_log_";
            } else if (iOrdinal != 4) {
                str2 = iOrdinal != 5 ? "Unknown" : "thread_check_log_";
            } else {
                str2 = "shield_log_";
            }
            stringBuffer.append(str2);
            stringBuffer.append(String.valueOf(lValueOf));
            stringBuffer.append(".json");
            String string = stringBuffer.toString();
            Intrinsics.e(string, "StringBuffer().append(t.…ppend(\".json\").toString()");
            instrumentData.f16413a = string;
            return instrumentData;
        }

        public static final InstrumentData c(File file) {
            Type type;
            Intrinsics.f(file, "file");
            InstrumentData instrumentData = new InstrumentData();
            String name = file.getName();
            Intrinsics.e(name, "file.name");
            instrumentData.f16413a = name;
            if (StringsKt.M(name, "crash_log_", false)) {
                type = Type.e0;
            } else if (StringsKt.M(name, "shield_log_", false)) {
                type = Type.f0;
            } else if (StringsKt.M(name, "thread_check_log_", false)) {
                type = Type.g0;
            } else if (StringsKt.M(name, "analysis_log_", false)) {
                type = Type.f16417Y;
            } else {
                type = StringsKt.M(name, "anr_log_", false) ? Type.Z : Type.X;
            }
            instrumentData.f16414b = type;
            JSONObject jSONObjectF = InstrumentUtility.f(name);
            if (jSONObjectF != null) {
                instrumentData.g = Long.valueOf(jSONObjectF.optLong("timestamp", 0L));
                instrumentData.d = jSONObjectF.optString("app_version", null);
                instrumentData.f16416e = jSONObjectF.optString("reason", null);
                instrumentData.f = jSONObjectF.optString("callstack", null);
                instrumentData.f16415c = jSONObjectF.optJSONArray("feature_names");
            }
            return instrumentData;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Companion;", "", "", "PARAM_APP_VERSION", "Ljava/lang/String;", "PARAM_CALLSTACK", "PARAM_DEVICE_MODEL", "PARAM_DEVICE_OS", "PARAM_FEATURE_NAMES", "PARAM_REASON", "PARAM_TIMESTAMP", "PARAM_TYPE", "UNKNOWN", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Type;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Type {
        public static final Type X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Type f16417Y;
        public static final Type Z;
        public static final Type e0;
        public static final Type f0;
        public static final Type g0;
        public static final /* synthetic */ Type[] h0;

        @Metadata(k = 3, mv = {1, 5, 1})
        public final /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Type.values().length];
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 5;
                int[] iArr2 = new int[Type.values().length];
                iArr2[1] = 1;
                iArr2[2] = 2;
                iArr2[3] = 3;
                iArr2[4] = 4;
                iArr2[5] = 5;
            }
        }

        static {
            Type type = new Type("Unknown", 0);
            X = type;
            Type type2 = new Type("Analysis", 1);
            f16417Y = type2;
            Type type3 = new Type("AnrReport", 2);
            Z = type3;
            Type type4 = new Type("CrashReport", 3);
            e0 = type4;
            Type type5 = new Type("CrashShield", 4);
            f0 = type5;
            Type type6 = new Type("ThreadCheck", 5);
            g0 = type6;
            h0 = new Type[]{type, type2, type3, type4, type5, type6};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) h0.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            int iOrdinal = ordinal();
            if (iOrdinal == 1) {
                return "Analysis";
            }
            if (iOrdinal == 2) {
                return "AnrReport";
            }
            if (iOrdinal == 3) {
                return "CrashReport";
            }
            if (iOrdinal != 4) {
                return iOrdinal != 5 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Type.values().length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[3] = 3;
            iArr[4] = 4;
            iArr[5] = 5;
            int[] iArr2 = new int[Type.values().length];
            iArr2[1] = 1;
            iArr2[2] = 2;
            iArr2[3] = 3;
            iArr2[4] = 4;
            iArr2[5] = 5;
        }
    }

    public final boolean a() {
        Type type = this.f16414b;
        if (type != null) {
            int iOrdinal = type.ordinal();
            Long l2 = this.g;
            if (iOrdinal == 1) {
                return (this.f16415c == null || l2 == null) ? false : true;
            }
            String str = this.f;
            if (iOrdinal != 2) {
                return ((iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) || str == null || l2 == null) ? false : true;
            }
            return (str == null || this.f16416e == null || l2 == null) ? false : true;
        }
        return false;
    }

    public final void b() {
        if (a()) {
            InstrumentUtility.h(this.f16413a, toString());
        }
    }

    public final String toString() {
        JSONObject jSONObject = null;
        Type type = this.f16414b;
        if (type != null) {
            int iOrdinal = type.ordinal();
            Long l2 = this.g;
            try {
                if (iOrdinal == 1) {
                    JSONObject jSONObject2 = new JSONObject();
                    JSONArray jSONArray = this.f16415c;
                    if (jSONArray != null) {
                        jSONObject2.put("feature_names", jSONArray);
                    }
                    if (l2 != null) {
                        jSONObject2.put("timestamp", l2);
                    }
                    jSONObject = jSONObject2;
                } else if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("device_os_version", Build.VERSION.RELEASE);
                    jSONObject3.put("device_model", Build.MODEL);
                    String str = this.d;
                    if (str != null) {
                        jSONObject3.put("app_version", str);
                    }
                    if (l2 != null) {
                        jSONObject3.put("timestamp", l2);
                    }
                    String str2 = this.f16416e;
                    if (str2 != null) {
                        jSONObject3.put("reason", str2);
                    }
                    String str3 = this.f;
                    if (str3 != null) {
                        jSONObject3.put("callstack", str3);
                    }
                    jSONObject3.put("type", type);
                    jSONObject = jSONObject3;
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            String string = jSONObject.toString();
            Intrinsics.e(string, "params.toString()");
            return string;
        }
        String string2 = new JSONObject().toString();
        Intrinsics.e(string2, "JSONObject().toString()");
        return string2;
    }
}
