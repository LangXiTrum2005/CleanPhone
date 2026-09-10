package umbriferous;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: AppData.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f39071attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final String f39072beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final String f39073competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final List<beachfront> f39074dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final gelandelaufer.beachfront f39075impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String f39076marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f39077saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f39078wireman;

    public attabal(String str, String str2, List<beachfront> list, String str3, String str4, String str5, String str6, gelandelaufer.beachfront beachfrontVar) {
        this.f39071attabal = str;
        this.f39077saneness = str2;
        this.f39074dern = list;
        this.f39078wireman = str3;
        this.f39076marial = str4;
        this.f39072beachfront = str5;
        this.f39073competently = str6;
        this.f39075impromptu = beachfrontVar;
    }

    public static attabal attabal(Context context, kattegat kattegatVar, String str, String str2, List<beachfront> list, gelandelaufer.beachfront beachfrontVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strCompetently = kattegatVar.competently();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strSaneness = saneness(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new attabal(str, str2, list, strCompetently, packageName, strSaneness, str3, beachfrontVar);
    }

    public static String saneness(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
