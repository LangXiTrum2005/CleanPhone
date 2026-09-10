package diu;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import iridectome.beachfront;
import iridectome.dern;
import iridectome.marial;
import iridectome.wireman;

/* JADX INFO: compiled from: SignalsCollector.java */
/* JADX INFO: loaded from: classes4.dex */
public class saneness extends marial implements dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public twas.attabal f25362attabal;

    /* JADX INFO: compiled from: SignalsCollector.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f25363attabal;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f25363attabal = iArr;
            try {
                iArr[UnityAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25363attabal[UnityAdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25363attabal[UnityAdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public saneness(twas.attabal attabalVar) {
        this.f25362attabal = attabalVar;
    }

    public AdFormat competently(UnityAdFormat unityAdFormat) {
        int i = attabal.f25363attabal[unityAdFormat.ordinal()];
        if (i == 1) {
            return AdFormat.BANNER;
        }
        if (i != 2) {
            return i != 3 ? AdFormat.UNKNOWN : AdFormat.REWARDED;
        }
        return AdFormat.INTERSTITIAL;
    }

    @Override // iridectome.dern
    public void marial(Context context, String str, UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.attabal attabalVar, beachfront beachfrontVar) {
        QueryInfo.generate(context, competently(unityAdFormat), this.f25362attabal.attabal(), new diu.attabal(str, new wireman(attabalVar, beachfrontVar)));
    }

    @Override // iridectome.dern
    public void wireman(Context context, UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.attabal attabalVar, beachfront beachfrontVar) {
        marial(context, beachfront(unityAdFormat), unityAdFormat, attabalVar, beachfrontVar);
    }
}
