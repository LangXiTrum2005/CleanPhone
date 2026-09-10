package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fm2 {
    public final List a;
    public final ur b;
    public final List c;

    public fm2(ArrayList adConfigurations, ur commonConfiguration, ArrayList actions) {
        Intrinsics.checkNotNullParameter(adConfigurations, "adConfigurations");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.a = adConfigurations;
        this.b = commonConfiguration;
        this.c = actions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm2)) {
            return false;
        }
        fm2 fm2Var = (fm2) obj;
        return Intrinsics.wireman(this.a, fm2Var.a) && Intrinsics.wireman(this.b, fm2Var.b) && Intrinsics.wireman(this.c, fm2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ServerResponse(adConfigurations=" + this.a + ", commonConfiguration=" + this.b + ", actions=" + this.c + ")";
    }
}
