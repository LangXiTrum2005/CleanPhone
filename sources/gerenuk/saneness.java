package gerenuk;

import android.content.Context;
import android.text.TextUtils;
import babyless.beachfront;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AppsFlyerLib;
import com.blankj.utilcode.util.adultoid;
import com.google.gson.Gson;
import com.ironsource.X3;
import com.yolo.networklibrary.common.util.apical;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kaoline.wireman;

/* JADX INFO: compiled from: InstallReferrerAttributionHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static String f26724apical = "Af value null";

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static boolean f26725arytenoidectomy = false;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static wireman f26726attabal = null;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static String f26727beachfront = "";

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static String f26728competently = "Google Ads ACI";

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static String f26729cutely = "Moloco";

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static wireman f26730dern = null;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static int f26732formularize = 0;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static int f26734impassible = 0;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static String f26735impromptu = "Facebook";

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static List<dern> f26736kowloon = null;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static String f26737marial = null;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static Context f26738molybdenite = null;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static String f26739monoploid = "";

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static String f26740polloi = "";

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static wireman f26741saneness = null;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static String f26742taiyuan = "TikTok";

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static boolean f26743triweekly = false;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static String f26744wireman;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final Map<String, String> f26733graveside = new HashMap();

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static boolean f26723adultoid = false;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static boolean f26731dovishness = false;

    /* JADX INFO: compiled from: InstallReferrerAttributionHandler.java */
    public class attabal implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f26745attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ InstallReferrerClient f26746saneness;

        public attabal(Context context, InstallReferrerClient installReferrerClient) {
            this.f26745attabal = context;
            this.f26746saneness = installReferrerClient;
        }

        public static /* synthetic */ void attabal(Context context, InstallReferrerClient installReferrerClient, ReferrerDetails referrerDetails) {
            String str;
            if (referrerDetails == null) {
                int unused = saneness.f26732formularize = 2;
                str = "";
            } else {
                String str2 = referrerDetails.getInstallReferrer() + "&info_source=gp";
                if (saneness.f26725arytenoidectomy) {
                    str2 = saneness.f26739monoploid;
                }
                String unused2 = saneness.f26727beachfront = str2 + "&info_source=gp";
                str = str2;
            }
            wireman unused3 = saneness.f26741saneness = saneness.preprohormone(str);
            saneness.f26741saneness.gintrap(saneness.f26727beachfront);
            saneness.f26741saneness.rotuma("gp");
            if (!TextUtils.isEmpty(saneness.f26741saneness.molybdenite())) {
                saneness.trm(saneness.f26741saneness.molybdenite(), saneness.f26741saneness.monoploid());
                saneness.gintrap();
            }
            int unused4 = saneness.f26732formularize = 2;
            if (saneness.apical(str) || saneness.f26734impassible == 2) {
                int unused5 = saneness.f26732formularize = 1;
                saneness.adultoid(context);
            } else {
                int unused6 = saneness.f26732formularize = 2;
            }
            try {
                installReferrerClient.endConnection();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            int unused = saneness.f26732formularize = 2;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            if (i == 0) {
                pitchy.attabal attabalVar = new pitchy.attabal(saneness.f26738molybdenite);
                final Context context = this.f26745attabal;
                final InstallReferrerClient installReferrerClient = this.f26746saneness;
                attabalVar.wireman(new pitchy.attabal.dern() { // from class: gerenuk.attabal
                    @Override // pitchy.attabal.dern
                    public final void attabal(ReferrerDetails referrerDetails) {
                        saneness.attabal.attabal(context, installReferrerClient, referrerDetails);
                    }
                });
                attabalVar.marial(this.f26746saneness);
                return;
            }
            if (i == 1) {
                int unused = saneness.f26732formularize = 2;
            } else {
                if (i != 2) {
                    return;
                }
                int unused2 = saneness.f26732formularize = 2;
            }
        }
    }

    /* JADX INFO: renamed from: gerenuk.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InstallReferrerAttributionHandler.java */
    public class RunnableC0618saneness implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ wireman f26747kowloon;

        public RunnableC0618saneness(wireman wiremanVar) {
            this.f26747kowloon = wiremanVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            saneness.dovishness(saneness.molybdenite(), this.f26747kowloon);
        }
    }

    public static void adultoid(Context context) {
        wireman wiremanVar;
        f26743triweekly = false;
        if (beachfront.marial(babyless.dern.f14823saneness, false)) {
            return;
        }
        wireman wiremanVar2 = f26741saneness;
        if ((wiremanVar2 != null && apical(wiremanVar2.taiyuan())) || (wiremanVar = f26730dern) == null) {
            wiremanVar = f26741saneness;
        }
        if (wiremanVar == null) {
            return;
        }
        wireman wiremanVarMonoploid = monoploid();
        if (wiremanVarMonoploid == null || TextUtils.isEmpty(wiremanVarMonoploid.competently())) {
            oilcan(wiremanVar);
        }
        kattegat(wiremanVar);
        stratoscope(context, wiremanVar);
        com.yolo.networklibrary.common.util.saneness.attabal().postDelayed(new RunnableC0618saneness(wiremanVar), apical.saneness(200L, 500L));
    }

    public static boolean apical(String str) {
        return !TextUtils.isEmpty(str) && str.contains("yoadx");
    }

    public static wireman arytenoidectomy() {
        wireman wiremanVar = f26726attabal;
        if (wiremanVar != null && !TextUtils.isEmpty(wiremanVar.molybdenite())) {
            return f26726attabal;
        }
        if (!f26723adultoid) {
            f26723adultoid = true;
            f26726attabal = monoploid();
        }
        return f26726attabal;
    }

    public static String cord(String str) {
        Map<String, String> map = f26733graveside;
        if (map.isEmpty()) {
            return "";
        }
        if (map.containsKey("gclid")) {
            return f26728competently;
        }
        if (map.containsKey("af_tranid") || map.containsKey("not%20set")) {
            return f26724apical;
        }
        if (str.contains("facebook")) {
            return f26735impromptu;
        }
        if (str.contains("bytedance") || str.contains("tiktok") || str.contains("tiktokglobal")) {
            return f26742taiyuan;
        }
        if (str.contains("moloco")) {
            return f26729cutely;
        }
        return !str.contains("google-play") ? f26724apical : "";
    }

    public static void cuirassed(Context context, wireman wiremanVar) {
        if (beachfront.marial(babyless.dern.f14821dern, false)) {
            return;
        }
        agent.beachfront.dern(context, wiremanVar);
        agent.saneness.marial(context, wiremanVar);
    }

    public static void dovishness(boolean z, wireman wiremanVar) {
        List<dern> list = f26736kowloon;
        if (list == null || list.size() == 0) {
            return;
        }
        for (dern dernVar : new CopyOnWriteArrayList(f26736kowloon)) {
            if (dernVar != null) {
                dernVar.dern(z, wiremanVar);
            }
        }
    }

    public static void formularize(Context context, String str) {
        f26738molybdenite = context;
        if (f26743triweekly) {
            return;
        }
        f26743triweekly = false;
        agent.wireman.taiyuan();
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
            installReferrerClientBuild.startConnection(new attabal(context, installReferrerClientBuild));
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            appsFlyerLib.setDebugLog(false);
            appsFlyerLib.init(str, null, context);
            AppsFlyerLib.getInstance().start(context);
            f26740polloi = AppsFlyerLib.getInstance().getAppsFlyerUID(context);
        } catch (Throwable unused) {
        }
        if (beachfront.marial(babyless.dern.f14823saneness, false)) {
            f26743triweekly = false;
            kattegat(monoploid());
            return;
        }
        wireman wiremanVarMonoploid = monoploid();
        if (wiremanVarMonoploid != null) {
            f26743triweekly = false;
            kattegat(monoploid());
            stratoscope(context, wiremanVarMonoploid);
            dovishness(molybdenite(), wiremanVarMonoploid);
        }
    }

    public static void gintrap() {
        List<dern> list = f26736kowloon;
        if (list == null || list.size() == 0) {
            return;
        }
        for (dern dernVar : new CopyOnWriteArrayList(f26736kowloon)) {
            if (dernVar != null) {
                dernVar.saneness();
            }
        }
    }

    public static boolean graveside() {
        String strMolybdenite = (arytenoidectomy() == null || TextUtils.isEmpty(arytenoidectomy().molybdenite())) ? "" : arytenoidectomy().molybdenite();
        if (TextUtils.isEmpty(strMolybdenite)) {
            if (TextUtils.isEmpty(f26744wireman)) {
                f26744wireman = kowloon();
            }
            strMolybdenite = f26744wireman;
        }
        if (TextUtils.isEmpty(strMolybdenite)) {
            return true;
        }
        return hawkthorn.attabal.f27589attabal.marial(strMolybdenite);
    }

    public static String impassible() {
        return f26740polloi;
    }

    public static void kattegat(wireman wiremanVar) {
        if (wiremanVar == null) {
            return;
        }
        kaoline.saneness sanenessVar = new kaoline.saneness();
        sanenessVar.beachfront(wiremanVar.molybdenite());
        sanenessVar.attabal(wiremanVar.cutely());
        sanenessVar.competently(wiremanVar.apical());
        sanenessVar.saneness(wiremanVar.formularize());
        sanenessVar.marial(wiremanVar.monoploid());
        sanenessVar.taiyuan(wiremanVar.polloi());
        sanenessVar.dern(wiremanVar.impassible());
        sanenessVar.wireman(wiremanVar.triweekly());
        sanenessVar.impromptu(wiremanVar.kowloon());
        sanenessVar.cutely(wiremanVar.arytenoidectomy());
        beachfront.formularize("file_key_install_info_for_yoadx_cipher_copy", new Gson().toJson(sanenessVar), true);
    }

    public static String kowloon() {
        if (!TextUtils.isEmpty(f26744wireman)) {
            return f26744wireman;
        }
        if (!f26731dovishness) {
            f26731dovishness = true;
            f26744wireman = beachfront.taiyuan("file_key_install_gp_referrer_utm_source", "");
        }
        return f26744wireman;
    }

    public static boolean molybdenite() {
        if (arytenoidectomy() != null && !TextUtils.isEmpty(arytenoidectomy().molybdenite())) {
            return hawkthorn.attabal.f27589attabal.dern(arytenoidectomy().molybdenite());
        }
        if (TextUtils.isEmpty(f26744wireman)) {
            f26744wireman = kowloon();
        }
        return hawkthorn.attabal.f27589attabal.dern(f26744wireman);
    }

    public static wireman monoploid() {
        return (wireman) beachfront.beachfront("file_key_install_info_cipher_copy", null, wireman.class);
    }

    public static void oilcan(wireman wiremanVar) {
        f26726attabal = wiremanVar;
        beachfront.formularize("file_key_install_info_cipher_copy", wiremanVar, true);
    }

    public static String polloi(String str) {
        Map<String, String> map = f26733graveside;
        if (map == null || TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = map.containsKey(str) ? map.get(str) : "";
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    public static wireman preprohormone(String str) {
        wireman wiremanVar = new wireman();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str)) {
            for (String str2 : str.split(X3.j.c)) {
                if (!TextUtils.isEmpty(str2)) {
                    String[] strArrSplit = str2.split(X3.j.b);
                    if (strArrSplit.length == 2) {
                        String str3 = strArrSplit[0];
                        String str4 = strArrSplit[1];
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                            f26733graveside.put(str3, str4);
                        }
                    }
                }
            }
            wiremanVar.adultoid(polloi("cnl"));
            String strPolloi = polloi("utm_source");
            if (TextUtils.isEmpty(strPolloi)) {
                strPolloi = polloi("pid");
            }
            if (TextUtils.isEmpty(strPolloi)) {
                strPolloi = cord(str);
            }
            wiremanVar.kattegat(strPolloi);
            wiremanVar.cord(polloi("utm_campaign"));
            wiremanVar.yemenite(polloi("utm_medium"));
            wiremanVar.stratoscope(polloi("utm_content"));
            wiremanVar.rotuma(polloi("info_source"));
            wiremanVar.dovishness(polloi("cpi_cost"));
            wiremanVar.preprohormone(str);
        }
        return wiremanVar;
    }

    public static void rotuma() {
        List<dern> list = f26736kowloon;
        if (list == null || list.size() == 0) {
            return;
        }
        for (dern dernVar : new CopyOnWriteArrayList(f26736kowloon)) {
            if (dernVar != null) {
                dernVar.attabal();
            }
        }
    }

    public static void sealless() {
        wireman wiremanVar = f26741saneness;
        if (wiremanVar != null) {
            wiremanVar.rotuma(wiremanVar.competently() + "_af");
            wiremanVar.graveside("onAttributionFailure= limit count");
            wiremanVar.gintrap(f26727beachfront);
        }
        adultoid(f26738molybdenite);
    }

    public static void stratoscope(Context context, wireman wiremanVar) {
        if (wiremanVar == null) {
            return;
        }
        cuirassed(context, wiremanVar);
    }

    public static String triweekly() {
        return f26727beachfront;
    }

    public static void trm(String str, String str2) {
        f26744wireman = str;
        f26737marial = str2;
        beachfront.attabal("file_key_install_gp_referrer_utm_source", str, null);
        beachfront.attabal("file_key_install_gp_referrer_utm_medium", str2, null);
    }

    public static void yemenite(Map<String, Object> map) {
        Context contextAttabal = f26738molybdenite;
        if (contextAttabal == null) {
            contextAttabal = adultoid.attabal();
        }
        f26734impassible = 2;
        if (map == null) {
            adultoid(contextAttabal);
            return;
        }
        if (Objects.equals(map.get("af_status") == null ? "" : (String) map.get("af_status"), "Non-organic")) {
            if (darpa.wireman.saneness(map)) {
                f26730dern = darpa.wireman.attabal(map);
            } else if (darpa.attabal.saneness(map)) {
                f26730dern = darpa.attabal.attabal(map);
            } else if (darpa.saneness.saneness(map)) {
                f26730dern = darpa.saneness.attabal(map);
            } else {
                f26730dern = darpa.dern.attabal(map, f26744wireman);
            }
            f26730dern.gintrap(f26727beachfront);
            if (f26732formularize == 2) {
                f26734impassible = 1;
                adultoid(f26738molybdenite);
                return;
            }
            return;
        }
        f26730dern = null;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(X3.j.b);
            sb.append(entry.getValue());
            sb.append(X3.j.c);
        }
        String string = sb.toString();
        wireman wiremanVar = f26741saneness;
        if (wiremanVar != null) {
            if (TextUtils.isEmpty(wiremanVar.molybdenite())) {
                f26741saneness.kattegat((String) map.get("af_status"));
            }
            f26741saneness.rotuma(f26741saneness.competently() + "_af");
            f26741saneness.graveside(string);
            f26741saneness.gintrap(f26727beachfront);
        }
        adultoid(contextAttabal);
    }
}
