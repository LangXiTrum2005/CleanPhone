package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class em {
    public final int a;
    public final String b;

    public em(String description, int i) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.a = i;
        this.b = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em)) {
            return false;
        }
        em emVar = (em) obj;
        return this.a == emVar.a && Intrinsics.wireman(this.b, emVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BowResponseError(code=" + this.a + ", description=" + this.b + ")";
    }
}
