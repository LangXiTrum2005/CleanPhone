package phonoscope;

import android.content.Context;
import babyless.beachfront;
import babyless.dern;

/* JADX INFO: compiled from: BaseAppOpenOptionHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static int f35289attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static boolean f35290dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static boolean f35291saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static boolean f35292wireman;

    public static void attabal() {
        if (f35290dern) {
            return;
        }
        f35290dern = true;
        f35289attabal = beachfront.competently(dern.f14820beachfront, 0) + 1;
        beachfront.apical(dern.f14820beachfront, Integer.valueOf(f35289attabal));
    }

    public static void dern(int i) {
        if (f35292wireman) {
            return;
        }
        f35292wireman = true;
        String str = dern.f14822marial;
        int iCompetently = beachfront.competently(str, 0);
        if (iCompetently <= 0 || i <= iCompetently) {
            f35291saneness = false;
        } else {
            f35291saneness = true;
        }
        beachfront.apical(str, Integer.valueOf(i));
    }

    public static void saneness(Context context) {
        agent.beachfront.wireman(context, wireman());
    }

    public static boolean wireman() {
        return f35289attabal == 1;
    }
}
