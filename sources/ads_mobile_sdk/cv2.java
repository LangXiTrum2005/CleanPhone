package ads_mobile_sdk;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;
import saneness.eliminate;
import saneness.licking;
import saneness.moveable;
import svd.DeviceSignals;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class cv2 implements eliminate {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final List h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final long m;
    public final boolean n;
    public final String o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final boolean s;

    public cv2(boolean z, boolean z2, String countryCode, String str, boolean z3, boolean z4, String languageCode, List languageCodeList, String str2, String str3, String submodel, String buildName, long j, boolean z5, String str4, boolean z6, int i, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(languageCodeList, "languageCodeList");
        Intrinsics.checkNotNullParameter(submodel, "submodel");
        Intrinsics.checkNotNullParameter(buildName, "buildName");
        this.a = z;
        this.b = z2;
        this.c = countryCode;
        this.d = str;
        this.e = z3;
        this.f = z4;
        this.g = languageCode;
        this.h = languageCodeList;
        this.i = str2;
        this.j = str3;
        this.k = submodel;
        this.l = buildName;
        this.m = j;
        this.n = z5;
        this.o = str4;
        this.p = z6;
        this.q = i;
        this.r = z7;
        this.s = z8;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.canOpenGeo = Boolean.valueOf(this.a);
        signals.canOpenHttp = Boolean.valueOf(this.b);
        signals.countryCode = this.c;
        signals.deviceCountryCode = this.d;
        signals.isEmulator = Boolean.valueOf(this.e);
        signals.isLatchskyDevice = this.f;
        signals.languageCode = this.g;
        signals.languageCodeList.addAll(this.h);
        signals.deviceLanguageCode = this.i;
        signals.marketVersion = this.j;
        signals.submodel = this.k;
        DeviceSignals deviceSignals = signals.deviceSignals;
        deviceSignals.buildName = this.l;
        deviceSignals.remainingDataPartitionSpaceKilobytes = Long.valueOf(this.m);
        signals.deviceSignals.browserSignals.isDefaultBrowserCustomTabsCapable = Boolean.valueOf(this.n);
        signals.deviceSignals.playStoreSignals.playStoreVersion = this.o;
        if (this.p) {
            signals.isBattlestarDevice = Boolean.TRUE;
        }
        signals.buildApiLevel = Integer.valueOf(this.q);
        signals.transparentBackgroundSupported = Boolean.valueOf(this.r);
        signals.isHsdpSupported = Integer.valueOf(this.s ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv2)) {
            return false;
        }
        cv2 cv2Var = (cv2) obj;
        return this.a == cv2Var.a && this.b == cv2Var.b && Intrinsics.wireman(this.c, cv2Var.c) && Intrinsics.wireman(this.d, cv2Var.d) && this.e == cv2Var.e && this.f == cv2Var.f && Intrinsics.wireman(this.g, cv2Var.g) && Intrinsics.wireman(this.h, cv2Var.h) && Intrinsics.wireman(this.i, cv2Var.i) && Intrinsics.wireman(this.j, cv2Var.j) && Intrinsics.wireman(this.k, cv2Var.k) && Intrinsics.wireman(this.l, cv2Var.l) && this.m == cv2Var.m && this.n == cv2Var.n && Intrinsics.wireman(this.o, cv2Var.o) && this.p == cv2Var.p && this.q == cv2Var.q && this.r == cv2Var.r && this.s == cv2Var.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v27, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.b;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int iAttabal = licking.attabal(this.c, (i + r3) * 31, 31);
        String str = this.d;
        int iHashCode = (iAttabal + (str == null ? 0 : str.hashCode())) * 31;
        boolean z3 = this.e;
        ?? r4 = z3;
        if (z3) {
            r4 = 1;
        }
        int i2 = (iHashCode + r4) * 31;
        boolean z4 = this.f;
        ?? r5 = z4;
        if (z4) {
            r5 = 1;
        }
        int iAttabal2 = moveable.attabal(this.h, licking.attabal(this.g, (i2 + r5) * 31, 31), 31);
        String str2 = this.i;
        int iHashCode2 = (iAttabal2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode3 = (Long.hashCode(this.m) + licking.attabal(this.l, licking.attabal(this.k, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31)) * 31;
        boolean z5 = this.n;
        ?? r1 = z5;
        if (z5) {
            r1 = 1;
        }
        int i3 = (iHashCode3 + r1) * 31;
        String str4 = this.o;
        int iHashCode4 = (i3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z6 = this.p;
        ?? r2 = z6;
        if (z6) {
            r2 = 1;
        }
        int iAttabal3 = bonny.attabal(this.q, (iHashCode4 + r2) * 31, 31);
        boolean z7 = this.r;
        ?? r6 = z7;
        if (z7) {
            r6 = 1;
        }
        int i4 = (iAttabal3 + r6) * 31;
        boolean z8 = this.s;
        return i4 + (z8 ? 1 : z8);
    }

    public final String toString() {
        return "StaticDeviceSignal(canOpenGeo=" + this.a + ", canOpenHttp=" + this.b + ", countryCode=" + this.c + ", deviceCountryCode=" + this.d + ", isEmulator=" + this.e + ", isLatchskyDevice=" + this.f + ", languageCode=" + this.g + ", languageCodeList=" + this.h + ", deviceLanguageCode=" + this.i + ", marketVersion=" + this.j + ", submodel=" + this.k + ", buildName=" + this.l + ", remainingDataPartitionSpaceKilobytes=" + this.m + ", isDefaultBrowserCustomTabsCapable=" + this.n + ", playStoreVersion=" + this.o + ", isBattlestarDevice=" + this.p + ", buildApiLevel=" + this.q + ", isTransparentBackgroundSupported=" + this.r + ", isHsdpSupported=" + this.s + ")";
    }
}
