package com.p004ironsource;

import com.p004ironsource.mediationsdk.model.InterstitialPlacement;
import com.p004ironsource.mediationsdk.model.Placement;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\nJ\u0006\u0010\u0014\u001a\u00020\u0013J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\f\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u001a\u001a\u00020\bJ\u000e\u0010\u0007\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0010\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0010\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006!"}, d2 = {"Lcom/ironsource/fm;", "Lcom/ironsource/ns;", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "adFormat", "", "adUnitId", "Lcom/ironsource/vd$c;", "a", "", "k", "", "Lcom/ironsource/bp;", "c", "d", "Lcom/ironsource/i7$b;", "Lcom/ironsource/vd$a;", "b", "Lcom/unity3d/mediation/LevelPlayAdSize;", h.f36614b, "", i.f37957c, "placementName", "Lcom/ironsource/mediationsdk/model/Placement;", "Lcom/ironsource/xm;", "tools", "Lcom/ironsource/lr;", "j", "Lcom/ironsource/s1;", "Lcom/ironsource/pq;", "", "sdkConfig", "<init>", "(Lcom/ironsource/ns;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class fm extends ns {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25030a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f25030a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm(ns sdkConfig) {
        super(sdkConfig);
        Intrinsics.f(sdkConfig, "sdkConfig");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a A[PHI: r8
  0x005a: PHI (r8v20 java.lang.Boolean) = (r8v4 java.lang.Boolean), (r8v13 java.lang.Boolean), (r8v22 java.lang.Boolean) binds: [B:16:0x0058, B:22:0x0083, B:13:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    public final i7.b a(String adUnitId) {
        Boolean boolE;
        boolean zBooleanValue;
        Intrinsics.f(adUnitId, "adUnitId");
        t6 bannerConfigurations = getSdkInitResponse().getConfigurations().getBannerConfigurations();
        t6.b bVarB = bannerConfigurations.a().get(adUnitId);
        if (bVarB == null) {
            bVarB = bannerConfigurations.getFeatures();
        }
        int iB = bVarB.getCom.ironsource.v6.a java.lang.String();
        t6.b bVarB2 = bannerConfigurations.a().get(adUnitId);
        if (bVarB2 == null) {
            bVarB2 = bannerConfigurations.getFeatures();
        }
        boolean zD = bVarB2.getCom.ironsource.v6.b java.lang.String();
        t6.b bVar = bannerConfigurations.a().get(adUnitId);
        if ((bVar == null || (boolE = bVar.getIsLoadWhileShow()) == null) && (boolE = bannerConfigurations.getFeatures().getIsLoadWhileShow()) == null) {
            C3376p c3376p = getSdkInitResponse().getConfigurations().getApplicationConfigurations().getAuctionSettings().a().get(LevelPlay.AdFormat.BANNER);
            boolE = c3376p != null ? c3376p.getIsLoadWhileShow() : null;
            if (boolE != null) {
                zBooleanValue = boolE.booleanValue();
            } else {
                zBooleanValue = false;
            }
        } else {
            zBooleanValue = boolE.booleanValue();
        }
        return new i7.b(zBooleanValue ? i7.c.TIMED_SHOW : i7.c.TIMED_LOAD, ((long) iB) * 1000, zD);
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        C3381s.d dVarB;
        Long lD;
        Intrinsics.f(adFormat, "adFormat");
        C3381s c3381s = getSdkInitResponse().getConfigurations().a().get(adFormat);
        long jLongValue = (c3381s == null || (dVarB = c3381s.getFeatures()) == null || (lD = dVarB.getCom.ironsource.s.i java.lang.String()) == null) ? 60L : lD.longValue();
        return jLongValue > 0 ? TimeUnit.MINUTES.toMillis(jLongValue) : jLongValue;
    }

    public final lr c(xm tools) {
        Intrinsics.f(tools, "tools");
        C3381s c3381s = getSdkInitResponse().getConfigurations().a().get(LevelPlay.AdFormat.REWARDED);
        return new lr(tools, c3381s != null ? c3381s.a() : null, c3381s != null ? c3381s.c() : null);
    }

    public final List<bp> d(LevelPlay.AdFormat adFormat, String adUnitId) {
        Map<String, br.b> mapA;
        br.b bVar;
        List<String> listA;
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(adUnitId, "adUnitId");
        br.a aVar = getSdkInitResponse().getProviderOrder().a().get(adFormat);
        if (aVar == null || (mapA = aVar.a()) == null || (bVar = mapA.get(adUnitId)) == null || (listA = bVar.a()) == null) {
            return EmptyList.X;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            bp bpVar = getSdkInitResponse().getProviderSettings().a().get((String) it.next());
            if (bpVar != null) {
                arrayList.add(bpVar);
            }
        }
        return arrayList;
    }

    public final List<LevelPlayAdSize> h() {
        List<String> listA = getSdkInitResponse().getConfigurations().getBannerConfigurations().getFeatures().a();
        ArrayList arrayList = new ArrayList(CollectionsKt.n(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.INSTANCE.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    public final float i() {
        return getSdkInitResponse().getConfigurations().getBannerConfigurations().getFeatures().getCom.ironsource.v6.g java.lang.String();
    }

    public final boolean j() {
        com.p004ironsource.mediationsdk.adquality.a aVarA = d().c().getAdQualityConfigurations();
        return aVarA != null && aVarA.b();
    }

    public final boolean k() {
        return getSdkInitResponse().getConfigurations().getApplicationConfigurations().getCom.ironsource.a4.g java.lang.String();
    }

    public final s1 a(xm tools) {
        Intrinsics.f(tools, "tools");
        return new s1(tools, getSdkInitResponse().getConfigurations().a());
    }

    public final pq b(xm tools) {
        Intrinsics.f(tools, "tools");
        return new pq(tools, getSdkInitResponse().getConfigurations().a());
    }

    public final Placement c(LevelPlay.AdFormat adFormat, String placementName) {
        Placement placementA;
        InterstitialPlacement interstitialPlacementA;
        Intrinsics.f(adFormat, "adFormat");
        int i2 = a.f25030a[adFormat.ordinal()];
        if (i2 == 1) {
            bs bsVarF = d().c().getRewardedVideoConfigurations();
            if (bsVarF == null || (placementA = bsVarF.a(placementName)) == null) {
                return null;
            }
            return new Placement(placementA.getPlacementId(), placementA.getPlacementName(), placementA.getIsDefault(), placementA.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME java.lang.String(), placementA.getRewardAmount(), placementA.getPlacementAvailabilitySettings());
        }
        if (i2 == 2) {
            uj ujVarD = d().c().getInterstitialConfigurations();
            if (ujVarD == null || (interstitialPlacementA = ujVarD.a(placementName)) == null) {
                return null;
            }
            return new Placement(interstitialPlacementA);
        }
        if (i2 == 3) {
            u6 u6VarC = d().c().getBannerConfigurations();
            if (u6VarC == null) {
                throw new IllegalStateException("Error getting " + adFormat + " configurations");
            }
            h7 h7VarA = u6VarC.a(placementName);
            if (h7VarA == null) {
                h7VarA = u6VarC.i();
                Intrinsics.e(h7VarA, "config.defaultBannerPlacement");
            }
            return new Placement(h7VarA);
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        tn tnVarE = d().c().getNativeAdConfigurations();
        if (tnVarE != null && placementName != null) {
            eo eoVarA = tnVarE.a(placementName);
            if (eoVarA == null) {
                eoVarA = tnVarE.e();
            }
            if (eoVarA != null) {
                return new Placement(eoVarA);
            }
        }
        throw new IllegalStateException("Error getting " + adFormat + " configurations");
    }

    private final vd.c a(LevelPlay.AdFormat adFormat, String adUnitId) {
        C3381s.d dVarB;
        yq yqVarG;
        Map<String, C3381s.d> mapA;
        C3381s.d dVar;
        yq yqVarG2;
        boolean z2 = adFormat == LevelPlay.AdFormat.REWARDED;
        C3381s c3381s = getSdkInitResponse().getConfigurations().a().get(adFormat);
        vd.c type = null;
        vd.c type2 = (c3381s == null || (mapA = c3381s.a()) == null || (dVar = mapA.get(adUnitId)) == null || (yqVarG2 = dVar.getProgressiveLoadingConfig()) == null) ? null : yqVarG2.getType();
        if (c3381s != null && (dVarB = c3381s.getFeatures()) != null && (yqVarG = dVarB.getProgressiveLoadingConfig()) != null) {
            type = yqVarG.getType();
        }
        if (type2 == null) {
            type2 = type;
        }
        if (type2 != null) {
            return type2;
        }
        return z2 ? vd.c.PROGRESSIVE_ON_SHOW_SUCCESS : vd.c.SINGLE;
    }

    public final vd.a b(LevelPlay.AdFormat adFormat, String adUnitId) {
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(adUnitId, "adUnitId");
        return new vd.a(a(adFormat, adUnitId));
    }

    public final List<String> a(LevelPlay.AdFormat adFormat) {
        Map<String, br.b> mapA;
        Set<String> setKeySet;
        Intrinsics.f(adFormat, "adFormat");
        br.a aVar = getSdkInitResponse().getProviderOrder().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || (setKeySet = mapA.keySet()) == null) ? EmptyList.X : CollectionsKt.i0(setKeySet);
    }

    public final List<bp> c(LevelPlay.AdFormat adFormat) {
        Map<String, br.b> mapA;
        Set<String> setKeySet;
        Intrinsics.f(adFormat, "adFormat");
        br.a aVar = getSdkInitResponse().getProviderOrder().a().get(adFormat);
        if (aVar == null || (mapA = aVar.a()) == null || (setKeySet = mapA.keySet()) == null) {
            return EmptyList.X;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.n(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(d(adFormat, (String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CollectionsKt.g((Iterable) it2.next(), arrayList2);
        }
        return CollectionsKt.q(arrayList2);
    }

    public final boolean a(String adUnitId, LevelPlay.AdFormat adFormat) {
        Map<String, br.b> mapA;
        Intrinsics.f(adUnitId, "adUnitId");
        Intrinsics.f(adFormat, "adFormat");
        br.a aVar = getSdkInitResponse().getProviderOrder().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || !mapA.containsKey(adUnitId)) ? false : true;
    }
}
