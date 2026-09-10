package com.airbnb.lottie;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;

/* JADX INFO: compiled from: L.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static boolean f16278attabal = false;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static sentimentalism.marial f16279beachfront = null;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static sentimentalism.wireman f16280competently = null;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static ThreadLocal<utwa.impromptu> f16281cutely = null;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static boolean f16282dern = true;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static volatile sentimentalism.competently f16283impromptu = null;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static boolean f16285saneness = false;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static volatile sentimentalism.beachfront f16286taiyuan = null;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static boolean f16287wireman = false;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static AsyncUpdates f16284marial = AsyncUpdates.AUTOMATIC;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static ramallah.attabal f16277apical = new ramallah.saneness();

    public static /* synthetic */ File attabal(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static ramallah.attabal beachfront() {
        return f16277apical;
    }

    public static utwa.impromptu competently() {
        utwa.impromptu impromptuVar = f16281cutely.get();
        if (impromptuVar != null) {
            return impromptuVar;
        }
        utwa.impromptu impromptuVar2 = new utwa.impromptu();
        f16281cutely.set(impromptuVar2);
        return impromptuVar2;
    }

    public static sentimentalism.competently cutely(Context context) {
        sentimentalism.competently competentlyVar;
        sentimentalism.competently competentlyVar2 = f16283impromptu;
        if (competentlyVar2 != null) {
            return competentlyVar2;
        }
        synchronized (sentimentalism.competently.class) {
            try {
                competentlyVar = f16283impromptu;
                if (competentlyVar == null) {
                    sentimentalism.beachfront beachfrontVarTaiyuan = taiyuan(context);
                    sentimentalism.marial sanenessVar = f16279beachfront;
                    if (sanenessVar == null) {
                        sanenessVar = new sentimentalism.saneness();
                    }
                    competentlyVar = new sentimentalism.competently(beachfrontVarTaiyuan, sanenessVar);
                    f16283impromptu = competentlyVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return competentlyVar;
    }

    public static float dern(String str) {
        return !f16285saneness ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : competently().saneness(str);
    }

    public static boolean impromptu() {
        return f16285saneness;
    }

    public static boolean marial() {
        return f16287wireman;
    }

    public static void saneness(String str) {
        if (f16285saneness) {
            competently().attabal(str);
        }
    }

    public static sentimentalism.beachfront taiyuan(Context context) {
        sentimentalism.beachfront beachfrontVar;
        if (!f16282dern) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        sentimentalism.beachfront beachfrontVar2 = f16286taiyuan;
        if (beachfrontVar2 != null) {
            return beachfrontVar2;
        }
        synchronized (sentimentalism.beachfront.class) {
            try {
                beachfrontVar = f16286taiyuan;
                if (beachfrontVar == null) {
                    sentimentalism.wireman wiremanVar = f16280competently;
                    if (wiremanVar == null) {
                        wiremanVar = new sentimentalism.wireman() { // from class: com.airbnb.lottie.dern
                            @Override // sentimentalism.wireman
                            public final File attabal() {
                                return wireman.attabal(applicationContext);
                            }
                        };
                    }
                    beachfrontVar = new sentimentalism.beachfront(wiremanVar);
                    f16286taiyuan = beachfrontVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return beachfrontVar;
    }

    public static AsyncUpdates wireman() {
        return f16284marial;
    }
}
