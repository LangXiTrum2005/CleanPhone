package saneness;

import ads_mobile_sdk.fe1;
import ads_mobile_sdk.ij2;
import ads_mobile_sdk.su1;
import ads_mobile_sdk.yf2;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class naming {
    public static conclusively attabal(naming namingVar, String adapterClassName, boolean z, boolean z2, yf2 requestType, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            requestType = yf2.d;
        }
        namingVar.getClass();
        Intrinsics.checkNotNullParameter(adapterClassName, "adapterClassName");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        try {
            Object objNewInstance = Class.forName(adapterClassName).getDeclaredConstructor(null).newInstance(null);
            if (!z) {
                if (objNewInstance instanceof MediationAdapter) {
                    MediationAdapter mediationAdapter = (MediationAdapter) objNewInstance;
                    if (((requestType == yf2.f && (mediationAdapter instanceof MediationBannerAdapter)) || ((requestType == yf2.h && (mediationAdapter instanceof MediationInterstitialAdapter)) || (requestType == yf2.i && (mediationAdapter instanceof MediationNativeAdapter)))) && !z2) {
                        return new su1((MediationAdapter) objNewInstance);
                    }
                }
                if (objNewInstance instanceof Adapter) {
                    return new fe1((Adapter) objNewInstance);
                }
            } else if (objNewInstance instanceof RtbAdapter) {
                return new ij2((RtbAdapter) objNewInstance);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
