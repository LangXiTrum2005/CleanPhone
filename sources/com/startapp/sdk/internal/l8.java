package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.Orientation;
import com.startapp.sdk.ads.video.VideoAdDetails;
import com.startapp.sdk.ads.video.VideoUtil$VideoEligibility;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingDetails;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class l8 extends t1 {
    public final jj q;
    public final long r;
    public volatile CacheKey s;
    public int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final lb f41205u;
    public final lb v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final lb f41206w;

    public l8(Context context, jj jjVar, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8) {
        super(context, jjVar, adPreferences, adEventListener, placement, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, true);
        this.r = System.currentTimeMillis();
        this.q = jjVar;
        this.f41205u = lbVar;
        this.v = lbVar2;
        this.f41206w = lbVar3;
    }

    @Override // com.startapp.sdk.internal.t1, com.startapp.sdk.adsbase.c
    public final boolean a(Object obj) throws Throwable {
        HashSet hashSet;
        t8 t8Var = (t8) obj;
        String str = t8Var != null ? t8Var.f41509c : null;
        VideoConfig videoConfigF = AdsCommonMetaData.k().F();
        MetaData metaDataE = MetaData.E();
        if (str == null || !str.toLowerCase(Locale.ROOT).contains("json")) {
            String str2 = t8Var != null ? t8Var.f41508b : null;
            if (videoConfigF.r() && metaDataE.f0() && vi.a(str2, "@videoJson@", "@videoJson@") != null) {
                f(false);
            }
            return super.a(obj);
        }
        if (videoConfigF.r() && metaDataE.f0() && ((hashSet = this.m.J0) == null || hashSet.size() <= 0)) {
            f(true);
        }
        try {
            aj ajVar = (aj) JsonParser.fromJson(t8Var.f41508b, aj.class);
            if (ajVar == null || ajVar.getVastTag() == null) {
                return a("no VAST wrapper in json", null, true);
            }
            String strD0 = metaDataE.d0();
            yi yiVar = (!ajVar.isRecordHops() || TextUtils.isEmpty(strD0)) ? null : new yi(this.g, strD0, ajVar.getPartnerResponse(), ajVar.getPartnerName(), ajVar.isSkipFailed());
            com.startapp.sdk.ads.video.vast.a aVar = new com.startapp.sdk.ads.video.vast.a(this.f40631a, ((tk) this.f41206w.a()).a());
            aVar.f = videoConfigF.f();
            aVar.f40566c = new E(this, 0);
            xi xiVarA = aVar.a(ajVar.getVastTag(), yiVar);
            if (xiVarA == null) {
                if (ajVar.getCampaignId() != null) {
                    this.f41498l.add(ajVar.getCampaignId());
                }
                this.t++;
                this.q.r = null;
                if (System.currentTimeMillis() - this.r >= videoConfigF.o()) {
                    return a("VAST retry timeout", null, false);
                }
                if (this.t > videoConfigF.e()) {
                    return a("VAST too many excludes", null, false);
                }
                ((z6) ((y6) this.f40636i.a())).c(this, ii.f41108h);
                return b();
            }
            ej ejVar = this.q.getType() != Ad.AdType.REWARDED_VIDEO ? new ej(ajVar.getSkipafter(), ajVar.getSkipmin()) : null;
            jj jjVar = this.q;
            jjVar.getClass();
            jjVar.r = new VideoAdDetails(xiVarA, videoConfigF, ejVar);
            Integer num = xiVarA.q;
            if (num != null && xiVarA.r != null) {
                if (num.intValue() <= xiVarA.r.intValue()) {
                    Orientation orientation = Orientation.PORTRAIT;
                    jjVar.f41300e = 1;
                } else if (Orientation.LANDSCAPE == Orientation.PORTRAIT) {
                    jjVar.f41300e = 1;
                } else {
                    jjVar.f41300e = 2;
                }
            }
            if (ajVar.getTtlSec() != null) {
                this.q.c(ajVar.getTtlSec());
            }
            t8Var.f41508b = ajVar.getAdmTag();
            t8Var.f41509c = "text/html";
            return super.a(t8Var);
        } catch (Exception e2) {
            return a("VAST json parsing", e2, true);
        }
    }

    public final void b(String str) {
        VideoAdDetails videoAdDetailsF = f();
        if (videoAdDetailsF != null) {
            videoAdDetailsF.setLocalVideoPath(str);
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    /* JADX INFO: renamed from: c */
    public final void b(boolean z2) {
        super.b(z2);
        if (!z2 || f() == null) {
            e(z2);
            return;
        }
        if (AdsCommonMetaData.k().F().q()) {
            super.d(true);
        }
        VideoAdDetails videoAdDetailsF = f();
        if (videoAdDetailsF != null) {
            videoAdDetailsF.setVideoMuted(this.f40633c.isVideoMuted());
        }
        ((z6) ((y6) this.f40636i.a())).c(this, ii.f41109i);
        if (videoAdDetailsF != null) {
            ij ijVar = (ij) this.v.a();
            ((Executor) ijVar.f41118c.a()).execute(new fj(ijVar, videoAdDetailsF.getVideoUrl(), new E(this, 1), new E(this, 2)));
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final void d(boolean z2) {
        if (f() != null) {
            return;
        }
        super.d(z2);
    }

    public final VideoAdDetails f() {
        Ad ad = this.f40632b;
        if (ad instanceof jj) {
            return ((jj) ad).r;
        }
        return null;
    }

    @Override // com.startapp.sdk.internal.t1
    public final boolean b(com.startapp.sdk.adsbase.model.a aVar) {
        VideoUtil$VideoEligibility videoUtil$VideoEligibilityA;
        if (aVar == null) {
            return false;
        }
        Ad.AdType adType = aVar.U0;
        if ((adType != Ad.AdType.VIDEO && adType != Ad.AdType.REWARDED_VIDEO) || (videoUtil$VideoEligibilityA = gk.a(this.f40631a)) == VideoUtil$VideoEligibility.ELIGIBLE) {
            return true;
        }
        this.f = videoUtil$VideoEligibilityA.a();
        return false;
    }

    public final void f(boolean z2) throws Throwable {
        Ad ad = this.f40632b;
        if ((ad == null || ad.getType() == Ad.AdType.REWARDED_VIDEO || this.f40632b.getType() == Ad.AdType.VIDEO) && !z2) {
            return;
        }
        AdPreferences adPreferences = new AdPreferences(this.f40633c);
        Ad ad2 = this.f40632b;
        adPreferences.setType((ad2 == null || !(ad2.getType() == Ad.AdType.REWARDED_VIDEO || this.f40632b.getType() == Ad.AdType.VIDEO)) ? Ad.AdType.NON_VIDEO : Ad.AdType.VIDEO_NO_VAST);
        CacheKey cacheKeyA = ((p) this.f41205u.a()).a(null, this.f40634e, adPreferences, false, 0, null, null);
        if (z2) {
            this.s = cacheKeyA;
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a aVarA = a((com.startapp.sdk.adsbase.model.a) new j8());
        if (aVarA != null) {
            aVarA.f(this.f40631a);
        }
        return aVarA;
    }

    public final void a(String str) {
        if (str != null) {
            ((z6) ((y6) this.f40636i.a())).c(this, ii.j);
            if (!str.equals("downloadInterrupted")) {
                super.d(true);
                VideoAdDetails videoAdDetailsF = f();
                if (videoAdDetailsF != null) {
                    videoAdDetailsF.setLocalVideoPath(str);
                }
            }
            e(true);
            return;
        }
        ((z6) ((y6) this.f40636i.a())).c(this, ii.k);
        e(false);
        Context context = this.f40631a;
        AdEventListener adEventListener = this.d;
        this.d = null;
        a0.a(context, adEventListener, this.f40632b, false);
        a(this.f40631a, f(), null, VASTErrorCodes.FileNotFound);
    }

    public final void a(List list, VASTErrorCodes vASTErrorCodes) {
        a(this.f40631a, f(), list, vASTErrorCodes);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    public static void a(Context context, VideoAdDetails videoAdDetails, List list, VASTErrorCodes vASTErrorCodes) {
        ActionTrackingLink[] actionTrackingLinkArrA;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    try {
                        if (vASTErrorCodes == VASTErrorCodes.SAProcessSuccess) {
                            WeakHashMap weakHashMap = vi.f41589a;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String str = (String) it.next();
                                if (vi.d(str)) {
                                    arrayList.add(str);
                                }
                            }
                            list = arrayList;
                        }
                        if (list.isEmpty()) {
                            actionTrackingLinkArrA = null;
                        } else {
                            actionTrackingLinkArrA = VideoTrackingDetails.a(list);
                        }
                    } catch (Throwable th) {
                        g9.a(th);
                    }
                } else if (videoAdDetails != null || videoAdDetails.getVideoTrackingDetails() == null) {
                    actionTrackingLinkArrA = null;
                } else {
                    actionTrackingLinkArrA = videoAdDetails.getVideoTrackingDetails().e();
                }
            } catch (Throwable th2) {
                g9.a(th2);
                return;
            }
        } else if (videoAdDetails != null) {
            actionTrackingLinkArrA = null;
        } else {
            actionTrackingLinkArrA = null;
        }
        if (actionTrackingLinkArrA == null || actionTrackingLinkArrA.length <= 0) {
            return;
        }
        lj ljVar = new lj(0, new VideoTrackingParams(0, 0, "", "1"), (videoAdDetails == null || videoAdDetails.getVideoUrl() == null) ? "" : videoAdDetails.getVideoUrl(), actionTrackingLinkArrA);
        ljVar.f41229e = vASTErrorCodes;
        gk.a(context, ljVar.a());
    }

    public final boolean a(String str, Exception exc, boolean z2) {
        if (exc != null) {
            g9.a(exc);
        } else if (z2) {
            g9 g9Var = new g9(h9.f41040e);
            g9Var.d = str;
            g9Var.a();
        }
        Object objB = ((p) this.f41205u.a()).b(this.s);
        if (objB instanceof o8) {
            t8 t8Var = new t8();
            t8Var.f41509c = "text/html";
            t8Var.f41508b = ((o8) objB).a();
            return super.a(t8Var);
        }
        Ad ad = this.f40632b;
        if (ad == null) {
            return false;
        }
        ad.setErrorMessage(this.f);
        return false;
    }
}
