package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.immediately;

/* JADX INFO: loaded from: classes.dex */
public final class a30 extends immediately {
    public final String a;
    public final g61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a30(String key, g61 imageValue) {
        super(0);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        this.a = key;
        this.b = imageValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a30)) {
            return false;
        }
        a30 a30Var = (a30) obj;
        return Intrinsics.wireman(this.a, a30Var.a) && Intrinsics.wireman(this.b, a30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageCustomAsset(key=" + this.a + ", imageValue=" + this.b + ")";
    }
}
