package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class tz1 implements eliminate {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public tz1(String packageName, String str, Integer num, String str2, String str3, String str4, String appName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(appName, "appName");
        this.a = packageName;
        this.b = str;
        this.c = num;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = appName;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME java.lang.String = this.a;
        signals.versionName = this.b;
        signals.versionCode = this.c;
        signals.displayLabel = this.d;
        signals.installerPackage = this.e;
        signals.initiatorPackage = this.f;
        signals.appName = this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz1)) {
            return false;
        }
        tz1 tz1Var = (tz1) obj;
        return Intrinsics.wireman(this.a, tz1Var.a) && Intrinsics.wireman(this.b, tz1Var.b) && Intrinsics.wireman(this.c, tz1Var.c) && Intrinsics.wireman(this.d, tz1Var.d) && Intrinsics.wireman(this.e, tz1Var.e) && Intrinsics.wireman(this.f, tz1Var.f) && Intrinsics.wireman(this.g, tz1Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return this.g.hashCode() + ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PackageInfoSignal(packageName=" + this.a + ", versionName=" + this.b + ", versionCode=" + this.c + ", displayLabel=" + this.d + ", installerPackage=" + this.e + ", initiatorPackage=" + this.f + ", appName=" + this.g + ")";
    }
}
