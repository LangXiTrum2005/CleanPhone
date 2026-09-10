package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.immediately;

/* JADX INFO: loaded from: classes.dex */
public final class b30 extends immediately {
    public final String a;
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(String key, String stringValue) {
        super(0);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(stringValue, "stringValue");
        this.a = key;
        this.b = stringValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b30)) {
            return false;
        }
        b30 b30Var = (b30) obj;
        return Intrinsics.wireman(this.a, b30Var.a) && Intrinsics.wireman(this.b, b30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StringCustomAsset(key=" + this.a + ", stringValue=" + this.b + ")";
    }
}
