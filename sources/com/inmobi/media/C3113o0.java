package com.inmobi.media;

import com.inmobi.ads.WatermarkData;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import org.objectweb.asm.Opcodes;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3113o0 {
    public final String a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final AbstractC3039l1 i;
    public final String j;
    public final LinkedHashMap k;
    public final Boolean l;
    public final WatermarkData m;
    public final AdQualityControl n;
    public final byte o;
    public final LinkedHashSet p;
    public final String q;
    public final String r;
    public final C2932gi s;
    public final C3097n9 t;

    public C3113o0(String str, boolean z, long j, boolean z2, String str2, String str3, String str4, String str5, AbstractC3039l1 abstractC3039l1, String str6, LinkedHashMap linkedHashMap, Boolean bool, WatermarkData watermarkData, AdQualityControl adQualityControl, byte b, LinkedHashSet linkedHashSet, String str7, String landingScheme, C2932gi c2932gi, C3097n9 c3097n9) {
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        this.a = str;
        this.b = z;
        this.c = j;
        this.d = z2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = abstractC3039l1;
        this.j = str6;
        this.k = linkedHashMap;
        this.l = bool;
        this.m = watermarkData;
        this.n = adQualityControl;
        this.o = b;
        this.p = linkedHashSet;
        this.q = str7;
        this.r = landingScheme;
        this.s = c2932gi;
        this.t = c3097n9;
    }

    public static C3113o0 a(C3113o0 c3113o0, C2932gi c2932gi, int i) {
        String str = c3113o0.a;
        boolean z = c3113o0.b;
        long j = c3113o0.c;
        boolean z2 = c3113o0.d;
        String str2 = c3113o0.e;
        String str3 = c3113o0.f;
        String str4 = c3113o0.g;
        String str5 = c3113o0.h;
        String str6 = c3113o0.j;
        LinkedHashMap linkedHashMap = c3113o0.k;
        Boolean bool = c3113o0.l;
        WatermarkData watermarkData = (i & 4096) != 0 ? c3113o0.m : null;
        AdQualityControl adQualityControl = c3113o0.n;
        byte b = c3113o0.o;
        LinkedHashSet linkedHashSet = c3113o0.p;
        String str7 = c3113o0.q;
        String landingScheme = c3113o0.r;
        C2932gi c2932gi2 = (i & Opcodes.ASM8) != 0 ? c3113o0.s : c2932gi;
        C3097n9 c3097n9 = c3113o0.t;
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        return new C3113o0(str, z, j, z2, str2, str3, str4, str5, null, str6, linkedHashMap, bool, watermarkData, adQualityControl, b, linkedHashSet, str7, landingScheme, c2932gi2, c3097n9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3113o0)) {
            return false;
        }
        C3113o0 c3113o0 = (C3113o0) obj;
        return Intrinsics.wireman(this.a, c3113o0.a) && this.b == c3113o0.b && this.c == c3113o0.c && this.d == c3113o0.d && Intrinsics.wireman(this.e, c3113o0.e) && Intrinsics.wireman(this.f, c3113o0.f) && Intrinsics.wireman(this.g, c3113o0.g) && Intrinsics.wireman(this.h, c3113o0.h) && Intrinsics.wireman(this.i, c3113o0.i) && Intrinsics.wireman(this.j, c3113o0.j) && Intrinsics.wireman(this.k, c3113o0.k) && Intrinsics.wireman(this.l, c3113o0.l) && Intrinsics.wireman(this.m, c3113o0.m) && Intrinsics.wireman(this.n, c3113o0.n) && this.o == c3113o0.o && Intrinsics.wireman(this.p, c3113o0.p) && Intrinsics.wireman(this.q, c3113o0.q) && Intrinsics.wireman(this.r, c3113o0.r) && Intrinsics.wireman(this.s, c3113o0.s) && Intrinsics.wireman(this.t, c3113o0.t);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (Boolean.hashCode(this.d) + ((Long.hashCode(this.c) + ((Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (this.g.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AbstractC3039l1 abstractC3039l1 = this.i;
        int iHashCode5 = (iHashCode4 + (abstractC3039l1 == null ? 0 : abstractC3039l1.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LinkedHashMap linkedHashMap = this.k;
        int iHashCode7 = (this.l.hashCode() + ((iHashCode6 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31)) * 31;
        WatermarkData watermarkData = this.m;
        int iHashCode8 = (iHashCode7 + (watermarkData == null ? 0 : watermarkData.hashCode())) * 31;
        AdQualityControl adQualityControl = this.n;
        int iHashCode9 = (this.p.hashCode() + ((Byte.hashCode(this.o) + ((iHashCode8 + (adQualityControl == null ? 0 : adQualityControl.hashCode())) * 31)) * 31)) * 31;
        String str6 = this.q;
        int iHashCode10 = (this.r.hashCode() + ((Boolean.hashCode(false) + ((iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31)) * 31;
        C2932gi c2932gi = this.s;
        int iHashCode11 = (iHashCode10 + (c2932gi == null ? 0 : c2932gi.hashCode())) * 31;
        C3097n9 c3097n9 = this.t;
        return Long.hashCode(-1L) + ((iHashCode11 + (c3097n9 != null ? c3097n9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        long j = this.c;
        boolean z2 = this.d;
        String str2 = this.e;
        String str3 = this.f;
        String str4 = this.g;
        String str5 = this.h;
        AbstractC3039l1 abstractC3039l1 = this.i;
        String str6 = this.j;
        LinkedHashMap linkedHashMap = this.k;
        Boolean bool = this.l;
        WatermarkData watermarkData = this.m;
        AdQualityControl adQualityControl = this.n;
        byte b = this.o;
        return "AdMetaData(adType=" + str + ", isImmersiveMode=" + z + ", placementId=" + j + ", allowAutoRedirection=" + z2 + ", creativeId=" + str2 + ", creativeType=" + str3 + ", markupTypeAdUnit=" + str4 + ", adSize=" + str5 + ", adPodHandler=" + abstractC3039l1 + ", contentURL=" + str6 + ", telemetryManagerMap=" + linkedHashMap + ", isHardwareAccelerationDisabled=" + bool + ", watermarkData=" + watermarkData + ", adQualityControl=" + adQualityControl + ", placementType=" + ((int) b) + ", viewabilityTrackers=" + this.p + ", impressionId=" + this.q + ", isInAppBrowser=false, landingScheme=" + this.r + ", renderViewMetaData=" + this.s + ", logger=" + this.t + ", viewTouchTimestamp=-1)";
    }
}
