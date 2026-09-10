package nonpolluting;

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
    public frailly.attabal f33952attabal;

    /* JADX INFO: compiled from: SignalsCollector.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f33953attabal;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f33953attabal = iArr;
            try {
                iArr[UnityAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33953attabal[UnityAdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public saneness(frailly.attabal attabalVar) {
        this.f33952attabal = attabalVar;
    }

    public AdFormat competently(UnityAdFormat unityAdFormat) {
        int i = attabal.f33953attabal[unityAdFormat.ordinal()];
        if (i != 1) {
            return i != 2 ? AdFormat.INTERSTITIAL : AdFormat.REWARDED;
        }
        return AdFormat.BANNER;
    }

    @Override // iridectome.dern
    public void marial(Context context, String str, UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.attabal attabalVar, beachfront beachfrontVar) {
        QueryInfo.generate(context, competently(unityAdFormat), this.f33952attabal.attabal(), new nonpolluting.attabal(str, new wireman(attabalVar, beachfrontVar)));
    }

    @Override // iridectome.dern
    public void wireman(Context context, UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.attabal attabalVar, beachfront beachfrontVar) {
        marial(context, beachfront(unityAdFormat), unityAdFormat, attabalVar, beachfrontVar);
    }
}
