package iridectome;

import android.content.Context;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: SignalsCollectorBase.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class marial implements dern {

    /* JADX INFO: compiled from: SignalsCollectorBase.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f28994attabal;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f28994attabal = iArr;
            try {
                iArr[UnityAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28994attabal[UnityAdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28994attabal[UnityAdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: SignalsCollectorBase.java */
    public class saneness implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public beachfront f28995arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public iridectome.saneness f28996kowloon;

        public saneness(iridectome.saneness sanenessVar, beachfront beachfrontVar) {
            this.f28996kowloon = sanenessVar;
            this.f28995arytenoidectomy = beachfrontVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, String> mapSaneness = this.f28995arytenoidectomy.saneness();
            if (mapSaneness.size() > 0) {
                this.f28996kowloon.onSignalsCollected(new JSONObject(mapSaneness).toString());
            } else if (this.f28995arytenoidectomy.attabal() == null) {
                this.f28996kowloon.onSignalsCollected("");
            } else {
                this.f28996kowloon.onSignalsCollectionFailed(this.f28995arytenoidectomy.attabal());
            }
        }
    }

    @Override // iridectome.dern
    public void attabal(Context context, boolean z, iridectome.saneness sanenessVar) {
        com.unity3d.scar.adapter.common.attabal attabalVar = new com.unity3d.scar.adapter.common.attabal();
        beachfront beachfrontVar = new beachfront();
        attabalVar.attabal();
        wireman(context, UnityAdFormat.INTERSTITIAL, attabalVar, beachfrontVar);
        attabalVar.attabal();
        wireman(context, UnityAdFormat.REWARDED, attabalVar, beachfrontVar);
        if (z) {
            attabalVar.attabal();
            wireman(context, UnityAdFormat.BANNER, attabalVar, beachfrontVar);
        }
        attabalVar.saneness(new saneness(sanenessVar, beachfrontVar));
    }

    public String beachfront(UnityAdFormat unityAdFormat) {
        int i = attabal.f28994attabal[unityAdFormat.ordinal()];
        if (i == 1) {
            return "gmaScarBiddingBannerSignal";
        }
        if (i != 2) {
            return i != 3 ? "" : "gmaScarBiddingRewardedSignal";
        }
        return "gmaScarBiddingInterstitialSignal";
    }

    @Override // iridectome.dern
    public void dern(Context context, String str, UnityAdFormat unityAdFormat, iridectome.saneness sanenessVar) {
        com.unity3d.scar.adapter.common.attabal attabalVar = new com.unity3d.scar.adapter.common.attabal();
        beachfront beachfrontVar = new beachfront();
        attabalVar.attabal();
        marial(context, str, unityAdFormat, attabalVar, beachfrontVar);
        attabalVar.saneness(new saneness(sanenessVar, beachfrontVar));
    }

    @Override // iridectome.dern
    public void saneness(Context context, List<UnityAdFormat> list, iridectome.saneness sanenessVar) {
        com.unity3d.scar.adapter.common.attabal attabalVar = new com.unity3d.scar.adapter.common.attabal();
        beachfront beachfrontVar = new beachfront();
        for (UnityAdFormat unityAdFormat : list) {
            attabalVar.attabal();
            wireman(context, unityAdFormat, attabalVar, beachfrontVar);
        }
        attabalVar.saneness(new saneness(sanenessVar, beachfrontVar));
    }
}
