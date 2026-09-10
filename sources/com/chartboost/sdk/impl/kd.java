package com.chartboost.sdk.impl;

import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.AdSessionConfiguration;
import com.iab.omid.library.chartboost.adsession.AdSessionContext;
import com.iab.omid.library.chartboost.adsession.CreativeType;
import com.iab.omid.library.chartboost.adsession.ImpressionType;
import com.iab.omid.library.chartboost.adsession.Owner;
import com.iab.omid.library.chartboost.adsession.Partner;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kd {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AdSession f14352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AdEvents f14353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public MediaEvents f14354c;

        public a(AdSession adSession, AdEvents adEvents, MediaEvents mediaEvents) {
            this.f14352a = adSession;
            this.f14353b = adEvents;
            this.f14354c = mediaEvents;
        }

        public final MediaEvents a() {
            return this.f14354c;
        }

        public final AdEvents b() {
            return this.f14353b;
        }

        public final AdSession c() {
            return this.f14352a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.f14352a, aVar.f14352a) && Intrinsics.a(this.f14353b, aVar.f14353b) && Intrinsics.a(this.f14354c, aVar.f14354c);
        }

        public int hashCode() {
            AdSession adSession = this.f14352a;
            int iHashCode = (adSession == null ? 0 : adSession.hashCode()) * 31;
            AdEvents adEvents = this.f14353b;
            int iHashCode2 = (iHashCode + (adEvents == null ? 0 : adEvents.hashCode())) * 31;
            MediaEvents mediaEvents = this.f14354c;
            return iHashCode2 + (mediaEvents != null ? mediaEvents.hashCode() : 0);
        }

        public String toString() {
            return "OMSessionHolder(omSession=" + this.f14352a + ", omAdEvents=" + this.f14353b + ", mediaEvents=" + this.f14354c + ")";
        }

        public final void a(AdEvents adEvents) {
            this.f14353b = adEvents;
        }

        public final void a(AdSession adSession) {
            this.f14352a = adSession;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14355a;

        static {
            int[] iArr = new int[kb.values().length];
            try {
                iArr[kb.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kb.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kb.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kb.AUDIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kb.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f14355a = iArr;
        }
    }

    public final List a(List list, List list2, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.addAll(a(list2));
        }
        arrayList.addAll(list);
        return arrayList;
    }

    public final CreativeType b(kb kbVar) {
        int i2 = b.f14355a[kbVar.ordinal()];
        if (i2 == 1) {
            return CreativeType.NATIVE_DISPLAY;
        }
        if (i2 == 2) {
            return CreativeType.HTML_DISPLAY;
        }
        if (i2 == 3) {
            return CreativeType.VIDEO;
        }
        if (i2 == 4) {
            return CreativeType.AUDIO;
        }
        if (i2 == 5) {
            return CreativeType.NATIVE_DISPLAY;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Owner c(kb kbVar) {
        int i2 = b.f14355a[kbVar.ordinal()];
        if (i2 == 1) {
            return Owner.NATIVE;
        }
        if (i2 == 2) {
            return Owner.NONE;
        }
        if (i2 == 3) {
            return Owner.NATIVE;
        }
        if (i2 == 4) {
            return Owner.NATIVE;
        }
        if (i2 == 5) {
            return Owner.NATIVE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final AdSessionConfiguration a(kb kbVar) {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(b(kbVar), ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, c(kbVar), false);
        } catch (IllegalArgumentException e2) {
            za.a("buildAdSessionVideoConfig error", e2);
            return null;
        }
    }

    public final AdSessionContext a(Partner partner, i3 i3Var) {
        try {
            return AdSessionContext.createHtmlAdSessionContext(partner, i3Var, null, null);
        } catch (IllegalArgumentException e2) {
            za.a("buildHtmlContext error", e2);
            return null;
        }
    }

    public final AdSessionContext a(Partner partner, String str, List list, boolean z2, List list2) {
        try {
            return AdSessionContext.createNativeAdSessionContext(partner, str, a(list, list2, z2), null, null);
        } catch (IllegalArgumentException e2) {
            za.a("buildNativeContext error", e2);
            return null;
        }
    }

    public final List a(List list) {
        try {
            ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ni niVar = (ni) it.next();
                arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(niVar.c(), a(niVar.b()), niVar.a()));
            }
            return arrayList;
        } catch (Exception e2) {
            za.a("buildVerificationResources error", e2);
            return EmptyList.X;
        }
    }

    public final MediaEvents a(kb kbVar, AdSession adSession) {
        if (kbVar == kb.HTML) {
            return null;
        }
        return MediaEvents.createMediaEvents(adSession);
    }

    public final a a(i3 webView, kb mtype, Partner partner, String str, List verificationScriptResourcesList, boolean z2, List verificationListConfig) {
        Intrinsics.f(webView, "webView");
        Intrinsics.f(mtype, "mtype");
        Intrinsics.f(verificationScriptResourcesList, "verificationScriptResourcesList");
        Intrinsics.f(verificationListConfig, "verificationListConfig");
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(a(mtype), a(partner, str, verificationScriptResourcesList, z2, verificationListConfig, mtype, webView));
            adSessionCreateAdSession.registerAdView(webView);
            return new a(adSessionCreateAdSession, AdEvents.createAdEvents(adSessionCreateAdSession), a(mtype, adSessionCreateAdSession));
        } catch (Exception e2) {
            za.b("OMSDK create session exception", e2);
            return null;
        }
    }

    public final AdSessionContext a(Partner partner, String str, List list, boolean z2, List list2, kb kbVar, i3 i3Var) {
        if (kbVar == kb.HTML) {
            return a(partner, i3Var);
        }
        return a(partner, str, list, z2, list2);
    }

    public final URL a(String str) {
        try {
            return new URL(str);
        } catch (Exception e2) {
            za.a("buildVerificationResources invalid url", e2);
            return null;
        }
    }
}
