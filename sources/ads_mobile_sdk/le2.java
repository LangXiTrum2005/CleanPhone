package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;
import saneness.licking;

/* JADX INFO: loaded from: classes.dex */
public final class le2 {
    public String a;
    public int b;
    public String c;
    public String d;
    public String e;
    public Boolean f;
    public boolean g;

    public /* synthetic */ le2() {
        this("", 0, "", "", "", null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le2)) {
            return false;
        }
        le2 le2Var = (le2) obj;
        return Intrinsics.wireman(this.a, le2Var.a) && this.b == le2Var.b && Intrinsics.wireman(this.c, le2Var.c) && Intrinsics.wireman(this.d, le2Var.d) && Intrinsics.wireman(this.e, le2Var.e) && Intrinsics.wireman(this.f, le2Var.f) && this.g == le2Var.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iAttabal = licking.attabal(this.e, licking.attabal(this.d, licking.attabal(this.c, bonny.attabal(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        Boolean bool = this.f;
        int iHashCode = (iAttabal + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z = this.g;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        return "RenderTraceMeta(renderId=" + this.a + ", adConfigIndex=" + this.b + ", renderer=" + this.c + ", adapterName=" + this.d + ", adapterVersion=" + this.e + ", winningAd=" + this.f + ", isOfflineAd=" + this.g + ")";
    }

    public le2(String renderId, int i, String renderer, String adapterName, String adapterVersion, Boolean bool, boolean z) {
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(adapterName, "adapterName");
        Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
        this.a = renderId;
        this.b = i;
        this.c = renderer;
        this.d = adapterName;
        this.e = adapterVersion;
        this.f = bool;
        this.g = z;
    }
}
