package com.p004ironsource;

import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.sdk.controller.f;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0003B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/ironsource/qn;", "", "", "a", "b", "Lorg/json/JSONObject;", "c", f.b.AD_ID, f.b.COMMAND, "params", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "Lorg/json/JSONObject;", com.smartdigimkt.h5.f.j, "()Lorg/json/JSONObject;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class qn {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String adId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String command;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final JSONObject params;

    /* JADX INFO: renamed from: com.ironsource.qn$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/ironsource/qn$a;", "", "", "jsonStr", "Lcom/ironsource/qn;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final qn a(String jsonStr) throws JSONException {
            Intrinsics.f(jsonStr, "jsonStr");
            JSONObject jSONObject = new JSONObject(jsonStr);
            String adId = jSONObject.getString(f.b.AD_ID);
            String command = jSONObject.getString(f.b.COMMAND);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            Intrinsics.e(adId, "adId");
            Intrinsics.e(command, "command");
            return new qn(adId, command, jSONObjectOptJSONObject);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public qn(String adId, String command, JSONObject jSONObject) {
        Intrinsics.f(adId, "adId");
        Intrinsics.f(command, "command");
        this.adId = adId;
        this.command = command;
        this.params = jSONObject;
    }

    public static /* synthetic */ qn a(qn qnVar, String str, String str2, JSONObject jSONObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = qnVar.adId;
        }
        if ((i2 & 2) != 0) {
            str2 = qnVar.command;
        }
        if ((i2 & 4) != 0) {
            jSONObject = qnVar.params;
        }
        return qnVar.a(str, str2, jSONObject);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final JSONObject getParams() {
        return this.params;
    }

    public final String d() {
        return this.adId;
    }

    public final String e() {
        return this.command;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof qn)) {
            return false;
        }
        qn qnVar = (qn) other;
        return Intrinsics.a(this.adId, qnVar.adId) && Intrinsics.a(this.command, qnVar.command) && Intrinsics.a(this.params, qnVar.params);
    }

    public final JSONObject f() {
        return this.params;
    }

    public int hashCode() {
        int iB = a.b(this.command, this.adId.hashCode() * 31, 31);
        JSONObject jSONObject = this.params;
        return iB + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "MessageToNative(adId=" + this.adId + ", command=" + this.command + ", params=" + this.params + ')';
    }

    @JvmStatic
    public static final qn a(String str) throws JSONException {
        return INSTANCE.a(str);
    }

    public final qn a(String adId, String command, JSONObject params) {
        Intrinsics.f(adId, "adId");
        Intrinsics.f(command, "command");
        return new qn(adId, command, params);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdId() {
        return this.adId;
    }
}
