package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Wl extends AbstractC3318w6 {
    public final Ec c;
    public final String d;
    public final NativeVideo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wl(Ec nativeAdUnitComponent, AbstractC2863e1 adSessionManager) {
        super(nativeAdUnitComponent, adSessionManager);
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        this.c = nativeAdUnitComponent;
        JsonAssetObject assetsObject = nativeAdUnitComponent.b.getAssetsObject();
        NativeMedia media = assetsObject != null ? assetsObject.getMedia() : null;
        this.d = media != null ? media.getType() : null;
        this.e = media != null ? media.getVideo() : null;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x016e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x021f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0168 A[SYNTHETIC] */
    @Override // com.inmobi.media.AbstractC3318w6
    public final Object a(dern dernVar) {
        Tl tl;
        C3184ql c3184ql;
        ArrayList arrayList;
        JsonAssetObject assetsObject;
        NativeMedia media;
        List<TrackingInfo> listFormularize;
        Object objA;
        NativeVideo video;
        if (dernVar instanceof Tl) {
            tl = (Tl) dernVar;
            int i = tl.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tl.d = i - Integer.MIN_VALUE;
            } else {
                tl = new Tl(this, (ContinuationImpl) dernVar);
            }
        } else {
            tl = new Tl(this, (ContinuationImpl) dernVar);
        }
        Object objA2 = tl.b;
        Object objBeachfront = attabal.beachfront();
        int i2 = tl.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA2);
            InterfaceC3072m9 interfaceC3072m9A = a();
            if (interfaceC3072m9A != null) {
                ((C3097n9) interfaceC3072m9A).a("VideoExperienceLoader", "load called - mediaType: " + this.d);
            }
            if (!Intrinsics.wireman(this.d, "video")) {
                InterfaceC3072m9 interfaceC3072m9A2 = a();
                if (interfaceC3072m9A2 != null) {
                    ((C3097n9) interfaceC3072m9A2).b("VideoExperienceLoader", "Invalid Media Type - expected VIDEO, got: " + this.d);
                }
                return new B6();
            }
            NativeVideo nativeVideo = this.e;
            if (nativeVideo == null) {
                InterfaceC3072m9 interfaceC3072m9A3 = a();
                if (interfaceC3072m9A3 != null) {
                    ((C3097n9) interfaceC3072m9A3).b("VideoExperienceLoader", "Invalid Native Video - nativeVideo is null");
                }
                return new C3393z6((short) 2361);
            }
            ArrayList arrayListA = AbstractC3391z4.a("error", nativeVideo.getTrackers());
            String vastTag = this.e.getVastTag();
            tl.d = 1;
            objA2 = a(vastTag, arrayListA, tl);
            if (objA2 != objBeachfront) {
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            p002kotlin.dern.saneness(objA2);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(objA2);
                return objA2;
            }
            c3184ql = tl.a;
            p002kotlin.dern.saneness(objA2);
        }
        String str = c3184ql.a;
        String str2 = c3184ql.b;
        int iA = Jl.a(c3184ql.e);
        ArrayList arrayList2 = c3184ql.c;
        arrayList = new ArrayList();
        for (Object obj : arrayList2) {
            if (!(((C3301ve) obj) instanceof C3402zf)) {
                arrayList.add(obj);
            }
        }
        C3034kl vastBeaconData = new C3034kl(str, str2, iA, arrayList);
        String str3 = c3184ql.e;
        ArrayList arrayList3 = c3184ql.f;
        ArrayList arrayList4 = c3184ql.g;
        AdConfig.VastVideoConfig vastVideo = this.c.a.b.a.b.getVastVideo();
        VideoExperience experience = this.e.getExperience();
        C3139p1 c3139p1 = this.c.a.b.a;
        Qm qm = new Qm(c3139p1.a.f, experience, c3139p1.b.getNative());
        Ec ec = this.c;
        Intrinsics.checkNotNullParameter(ec, "<this>");
        Intrinsics.checkNotNullParameter(vastBeaconData, "vastBeaconData");
        C2811c0 c2811c0 = ec.a.a.d;
        Intrinsics.checkNotNullParameter(ec, "<this>");
        assetsObject = ec.b.getAssetsObject();
        if (assetsObject != null) {
            media = assetsObject.getMedia();
        } else {
            media = null;
        }
        if (media != null || (video = media.getVideo()) == null || (listFormularize = video.getTrackers()) == null) {
            listFormularize = adultoid.formularize();
        }
        C3160pm c3160pm = new C3160pm(str3, arrayList3, arrayList4, vastVideo, qm, new Ml(vastBeaconData, c2811c0, new C2937gn(listFormularize)), new C3186qn(this.c.a.b), new V3(this.c.a.b));
        tl.a = null;
        tl.d = 3;
        objA = a(vastBeaconData, c3160pm, tl);
        if (objA != objBeachfront) {
            return objBeachfront;
        }
        return objA;
        c3184ql = (C3184ql) objA2;
        if (c3184ql == null) {
            NativeVideo nativeVideo2 = this.e;
            if (!(nativeVideo2 != null ? nativeVideo2.getRequired() : false)) {
                return new B6();
            }
            InterfaceC3072m9 interfaceC3072m9A4 = a();
            if (interfaceC3072m9A4 != null) {
                ((C3097n9) interfaceC3072m9A4).b("VideoExperienceLoader", "Vast Parse Failure - Video Required");
            }
            return new C3393z6((short) 2360);
        }
        Ec ec2 = this.c;
        String str4 = c3184ql.d;
        ArrayList arrayList5 = c3184ql.c;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayList5) {
            if (Intrinsics.wireman(((C3301ve) obj2).b, "click")) {
                arrayList6.add(obj2);
            }
        }
        ec2.e = new C3059ll(str4, arrayList6);
        ArrayList arrayList7 = c3184ql.c;
        ArrayList arrayList8 = new ArrayList();
        for (Object obj3 : arrayList7) {
            if (obj3 instanceof C3402zf) {
                arrayList8.add(obj3);
            }
        }
        tl.a = c3184ql;
        tl.d = 2;
        if (a(arrayList8, tl) != objBeachfront) {
            String str5 = c3184ql.a;
            String str6 = c3184ql.b;
            int iA2 = Jl.a(c3184ql.e);
            ArrayList arrayList9 = c3184ql.c;
            arrayList = new ArrayList();
            while (r8.hasNext()) {
                if (!(((C3301ve) obj) instanceof C3402zf)) {
                    arrayList.add(obj);
                }
            }
            C3034kl vastBeaconData2 = new C3034kl(str5, str6, iA2, arrayList);
            String str7 = c3184ql.e;
            ArrayList arrayList10 = c3184ql.f;
            ArrayList arrayList11 = c3184ql.g;
            AdConfig.VastVideoConfig vastVideo2 = this.c.a.b.a.b.getVastVideo();
            VideoExperience experience2 = this.e.getExperience();
            C3139p1 c3139p2 = this.c.a.b.a;
            Qm qm2 = new Qm(c3139p2.a.f, experience2, c3139p2.b.getNative());
            Ec ec3 = this.c;
            Intrinsics.checkNotNullParameter(ec3, "<this>");
            Intrinsics.checkNotNullParameter(vastBeaconData2, "vastBeaconData");
            C2811c0 c2811c1 = ec3.a.a.d;
            Intrinsics.checkNotNullParameter(ec3, "<this>");
            assetsObject = ec3.b.getAssetsObject();
            if (assetsObject != null) {
                media = assetsObject.getMedia();
            } else {
                media = null;
            }
            if (media != null) {
                listFormularize = adultoid.formularize();
            } else {
                listFormularize = adultoid.formularize();
            }
            C3160pm c3160pm2 = new C3160pm(str7, arrayList10, arrayList11, vastVideo2, qm2, new Ml(vastBeaconData2, c2811c1, new C2937gn(listFormularize)), new C3186qn(this.c.a.b), new V3(this.c.a.b));
            tl.a = null;
            tl.d = 3;
            objA = a(vastBeaconData2, c3160pm2, tl);
            if (objA != objBeachfront) {
                return objA;
            }
        }
        return objBeachfront;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ArrayList arrayList, ContinuationImpl continuationImpl) {
        Vl vl;
        if (continuationImpl instanceof Vl) {
            vl = (Vl) continuationImpl;
            int i = vl.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vl.c = i - Integer.MIN_VALUE;
            } else {
                vl = new Vl(this, continuationImpl);
            }
        } else {
            vl = new Vl(this, continuationImpl);
        }
        Object objA = vl.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = vl.c;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objA);
                InterfaceC3072m9 interfaceC3072m9A = a();
                if (interfaceC3072m9A != null) {
                    ((C3097n9) interfaceC3072m9A).a("VideoExperienceLoader", "parseVastTag - processing VAST tag with " + arrayList.size() + " error URLs");
                }
                Il il = Il.a;
                C3336x c3336x = this.c.a;
                vl.c = 1;
                objA = il.a(str, c3336x, arrayList, vl);
                if (objA == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(objA);
            }
            return (C3184ql) objA;
        } catch (C3258tl e) {
            InterfaceC3072m9 interfaceC3072m9A2 = a();
            if (interfaceC3072m9A2 == null) {
                return null;
            }
            ((C3097n9) interfaceC3072m9A2).b("VideoExperienceLoader", "parseVastTag - VAST parse exception: " + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C3034kl c3034kl, C3160pm c3160pm, ContinuationImpl continuationImpl) {
        Ul ul;
        if (continuationImpl instanceof Ul) {
            ul = (Ul) continuationImpl;
            int i = ul.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ul.d = i - Integer.MIN_VALUE;
            } else {
                ul = new Ul(this, continuationImpl);
            }
        } else {
            ul = new Ul(this, continuationImpl);
        }
        Object objA = ul.b;
        Object objBeachfront = attabal.beachfront();
        int i2 = ul.d;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objA);
                C3050lc c3050lc = (C3050lc) this.c.g.getValue();
                InterfaceC3072m9 interfaceC3072m9A = a();
                if (interfaceC3072m9A != null) {
                    ((C3097n9) interfaceC3072m9A).a("VideoExperienceLoader", "onPrepareExperienceModelSuccess - loading video experience");
                }
                ul.a = c3034kl;
                ul.d = 1;
                objA = c3050lc.a(c3160pm, ul);
                if (objA == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3034kl = ul.a;
                p002kotlin.dern.saneness(objA);
            }
            return new A6((MediaView) objA, c3034kl);
        } catch (Exception e) {
            InterfaceC3072m9 interfaceC3072m9A2 = a();
            if (interfaceC3072m9A2 != null) {
                ((C3097n9) interfaceC3072m9A2).b("VideoExperienceLoader", "onPrepareExperienceModelSuccess - exception during media load: " + e.getMessage());
            }
            return a(e, c3034kl);
        }
    }

    public final C6 a(Exception exc, C3034kl c3034kl) {
        NativeVideo nativeVideo = this.e;
        if (nativeVideo != null ? nativeVideo.getRequired() : false) {
            InterfaceC3072m9 interfaceC3072m9A = a();
            if (interfaceC3072m9A != null) {
                ((C3097n9) interfaceC3072m9A).b("VideoExperienceLoader", "Media Load Failure: " + exc);
            }
            return new C3393z6((short) 2362);
        }
        return new B6(c3034kl);
    }
}
