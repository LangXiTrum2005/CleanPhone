package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.premeiotic;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3318w6 {
    public final Ec a;
    public final AbstractC2863e1 b;

    public AbstractC3318w6(Ec nativeAdUnitComponent, AbstractC2863e1 adSessionManager) {
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        this.a = nativeAdUnitComponent;
        this.b = adSessionManager;
    }

    public final InterfaceC3072m9 a() {
        return this.a.a.a.c;
    }

    public abstract Object a(dern dernVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        C3293v6 c3293v6;
        OmSdkInfo omSdkInfo;
        List list2;
        Map mapTaiyuan;
        String customReferenceData;
        if (continuationImpl instanceof C3293v6) {
            c3293v6 = (C3293v6) continuationImpl;
            int i = c3293v6.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3293v6.e = i - Integer.MIN_VALUE;
            } else {
                c3293v6 = new C3293v6(this, continuationImpl);
            }
        } else {
            c3293v6 = new C3293v6(this, continuationImpl);
        }
        Object obj = c3293v6.c;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3293v6.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            if (list.isEmpty()) {
                InterfaceC3072m9 interfaceC3072m9A = a();
                if (interfaceC3072m9A != null) {
                    ((C3097n9) interfaceC3072m9A).a("ExperienceLoader", "OMID trackers are empty");
                }
                return Unit.f29295attabal;
            }
            MetaInfo metaInfo = this.a.a.b.d;
            OmSdkInfo omsdkInfo = metaInfo != null ? metaInfo.getOmsdkInfo() : null;
            boolean z = omsdkInfo != null && omsdkInfo.getOmidEnabled();
            boolean omidEnabled = this.a.a.b.a.b.getViewability().getOmidConfig().getOmidEnabled();
            if (z && omidEnabled) {
                C3153pf c3153pf = C3153pf.a;
                c3293v6.a = list;
                c3293v6.b = omsdkInfo;
                c3293v6.e = 1;
                Context context = Ji.a;
                Object objCompetently = context == null ? "" : impromptu.competently(premeiotic.saneness(), new C3103nf(context, null), c3293v6);
                if (objCompetently == objBeachfront) {
                    return objBeachfront;
                }
                omSdkInfo = omsdkInfo;
                obj = objCompetently;
                list2 = list;
            } else {
                InterfaceC3072m9 interfaceC3072m9A2 = a();
                if (interfaceC3072m9A2 != null) {
                    ((C3097n9) interfaceC3072m9A2).a("ExperienceLoader", "OMID is not enabled");
                }
                return Unit.f29295attabal;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            omSdkInfo = c3293v6.b;
            List list3 = c3293v6.a;
            p002kotlin.dern.saneness(obj);
            list2 = list3;
        }
        String str = (String) obj;
        String str2 = this.a.a.b.a.a.e;
        InterfaceC3072m9 interfaceC3072m9A3 = a();
        if (interfaceC3072m9A3 != null) {
            ((C3097n9) interfaceC3072m9A3).a("ExperienceLoader", "OM-SDK Session Initialize Called");
        }
        AbstractC2863e1 abstractC2863e1 = this.b;
        if (omSdkInfo == null || (mapTaiyuan = omSdkInfo.getMacros()) == null) {
            mapTaiyuan = seminary.taiyuan();
        }
        abstractC2863e1.a(str, list2, mapTaiyuan, str2, (omSdkInfo == null || (customReferenceData = omSdkInfo.getCustomReferenceData()) == null) ? "" : customReferenceData, omSdkInfo != null && omSdkInfo.getIsolateVerificationScripts());
        return Unit.f29295attabal;
    }
}
