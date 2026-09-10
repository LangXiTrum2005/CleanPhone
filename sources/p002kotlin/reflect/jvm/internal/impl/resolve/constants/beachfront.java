package p002kotlin.reflect.jvm.internal.impl.resolve.constants;

import byname.saneness;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClassLiteralValue.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saneness f31324attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f31325saneness;

    public beachfront(saneness classId, int i) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f31324attabal = classId;
        this.f31325saneness = i;
    }

    public final saneness attabal() {
        return this.f31324attabal;
    }

    public final int dern() {
        return this.f31325saneness;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beachfront)) {
            return false;
        }
        beachfront beachfrontVar = (beachfront) obj;
        return Intrinsics.wireman(this.f31324attabal, beachfrontVar.f31324attabal) && this.f31325saneness == beachfrontVar.f31325saneness;
    }

    public int hashCode() {
        return (this.f31324attabal.hashCode() * 31) + Integer.hashCode(this.f31325saneness);
    }

    public final int saneness() {
        return this.f31325saneness;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f31325saneness;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f31324attabal);
        int i3 = this.f31325saneness;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final saneness wireman() {
        return this.f31324attabal;
    }
}
