package ads_mobile_sdk;

import complexometry.dovishness;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.VideoOptionsSignal;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class ll1 implements eliminate {
    public final Integer a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final String e;
    public final Boolean f;
    public final Integer g;
    public final Boolean h;
    public final dovishness i;
    public final Boolean j;
    public final Integer k;
    public final Boolean l;
    public final Integer m;

    public ll1(Integer num, List list, List list2, Boolean bool, String str, Boolean bool2, Integer num2, Boolean bool3, dovishness dovishnessVar, Boolean bool4, Integer num3, Boolean bool5, Integer num4) {
        this.a = num;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = str;
        this.f = bool2;
        this.g = num2;
        this.h = bool3;
        this.i = dovishnessVar;
        this.j = bool4;
        this.k = num3;
        this.l = bool5;
        this.m = num4;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        VideoOptionsSignal videoOptionsSignal;
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.nativeVersion = this.a;
        List<String> list = this.b;
        if (list != null) {
            signals.nativeTemplates = list;
        }
        signals.nativeCustomTemplates = this.c;
        signals.enableNativeMediaOrientation = this.d;
        signals.nativeMediaOrientation = this.e;
        signals.customMuteThisAdRequested = this.f;
        signals.customClickGestureDirection = this.g;
        signals.customClickGestureAllowTaps = this.h;
        dovishness dovishnessVar = this.i;
        if (dovishnessVar != null) {
            videoOptionsSignal = new VideoOptionsSignal(dovishnessVar.getStartMuted(), dovishnessVar.getClickToExpandRequested(), dovishnessVar.getCustomControlsRequested());
        } else {
            videoOptionsSignal = null;
        }
        signals.videoOptionsSignal = videoOptionsSignal;
        signals.isImageLoadingDisabled = this.j;
        signals.adChoicesPlacement = this.k;
        signals.usesMediaView = this.l;
        signals.numberOfAdsRequested = this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll1)) {
            return false;
        }
        ll1 ll1Var = (ll1) obj;
        return Intrinsics.wireman(this.a, ll1Var.a) && Intrinsics.wireman(this.b, ll1Var.b) && Intrinsics.wireman(this.c, ll1Var.c) && Intrinsics.wireman(this.d, ll1Var.d) && Intrinsics.wireman(this.e, ll1Var.e) && Intrinsics.wireman(this.f, ll1Var.f) && Intrinsics.wireman(this.g, ll1Var.g) && Intrinsics.wireman(this.h, ll1Var.h) && Intrinsics.wireman(this.i, ll1Var.i) && Intrinsics.wireman(this.j, ll1Var.j) && Intrinsics.wireman(this.k, ll1Var.k) && Intrinsics.wireman(this.l, ll1Var.l) && Intrinsics.wireman(this.m, ll1Var.m);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.h;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        dovishness dovishnessVar = this.i;
        int iHashCode9 = (iHashCode8 + (dovishnessVar == null ? 0 : dovishnessVar.hashCode())) * 31;
        Boolean bool4 = this.j;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num3 = this.k;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool5 = this.l;
        int iHashCode12 = (iHashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num4 = this.m;
        return iHashCode12 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "NativeAdSignal(nativeVersion=" + this.a + ", nativeTemplateIds=" + this.b + ", nativeCustomTemplates=" + this.c + ", enableNativeMediaOrientation=" + this.d + ", nativeMediaOrientation=" + this.e + ", customMuteThisAdRequested=" + this.f + ", customClickGestureDirection=" + this.g + ", customClickGestureAllowTaps=" + this.h + ", videoOptions=" + this.i + ", isImageLoadingDisabled=" + this.j + ", adChoicesPlacement=" + this.k + ", usesMediaView=" + this.l + ", numberOfAdsRequested=" + this.m + ")";
    }
}
