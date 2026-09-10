package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tl1 {
    public final JsonObject a;
    public final JsonObject b;
    public final JsonObject c;
    public final JsonObject d;
    public final JsonObject e;

    public tl1(JsonObject assetViewsSignal, JsonObject nativeAdViewSignal, JsonObject scrollViewSignal, JsonObject lockScreenSignal, JsonObject adScreenSignal) {
        Intrinsics.checkNotNullParameter(assetViewsSignal, "assetViewsSignal");
        Intrinsics.checkNotNullParameter(nativeAdViewSignal, "nativeAdViewSignal");
        Intrinsics.checkNotNullParameter(scrollViewSignal, "scrollViewSignal");
        Intrinsics.checkNotNullParameter(lockScreenSignal, "lockScreenSignal");
        Intrinsics.checkNotNullParameter(adScreenSignal, "adScreenSignal");
        this.a = assetViewsSignal;
        this.b = nativeAdViewSignal;
        this.c = scrollViewSignal;
        this.d = lockScreenSignal;
        this.e = adScreenSignal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl1)) {
            return false;
        }
        tl1 tl1Var = (tl1) obj;
        return Intrinsics.wireman(this.a, tl1Var.a) && Intrinsics.wireman(this.b, tl1Var.b) && Intrinsics.wireman(this.c, tl1Var.c) && Intrinsics.wireman(this.d, tl1Var.d) && Intrinsics.wireman(this.e, tl1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdSignals(assetViewsSignal=" + this.a + ", nativeAdViewSignal=" + this.b + ", scrollViewSignal=" + this.c + ", lockScreenSignal=" + this.d + ", adScreenSignal=" + this.e + ")";
    }
}
