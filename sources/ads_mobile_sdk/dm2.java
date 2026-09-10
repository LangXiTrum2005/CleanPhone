package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dm2 {
    public final String a;
    public final JsonObject b;

    public dm2(JsonObject jsonObject, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.b = jsonObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm2)) {
            return false;
        }
        dm2 dm2Var = (dm2) obj;
        return Intrinsics.wireman(this.a, dm2Var.a) && Intrinsics.wireman(this.b, dm2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        JsonObject jsonObject = this.b;
        return iHashCode + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    public final String toString() {
        return "Action(name=" + this.a + ", info=" + this.b + ")";
    }
}
