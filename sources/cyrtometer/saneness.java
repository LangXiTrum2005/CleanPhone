package cyrtometer;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.ironsource.X3;
import com.scottyab.rootbeer.RootBeerNative;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* JADX INFO: compiled from: RootBeer.java */
/* JADX INFO: loaded from: classes4.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f24836attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f24837saneness = true;

    public saneness(Context context) {
        this.f24836attabal = context;
    }

    public boolean apical(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(attabal.f24831attabal));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return impassible(arrayList);
    }

    public final String[] arytenoidectomy() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            irredeemable.attabal.attabal(e);
            return null;
        }
    }

    public boolean attabal() {
        return new RootBeerNative().attabal();
    }

    public boolean beachfront() {
        if (!attabal()) {
            irredeemable.attabal.saneness("We could not load the native library to test for root");
            return false;
        }
        String[] strArrAttabal = attabal.attabal();
        int length = strArrAttabal.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = strArrAttabal[i] + "su";
        }
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.f24837saneness);
            return rootBeerNative.checkForRoot(strArr) > 0;
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public boolean competently() {
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"which", "su"});
            boolean z = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
            processExec.destroy();
            return z;
        } catch (Throwable unused) {
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    public boolean cutely() {
        return apical(null);
    }

    public boolean dern() {
        HashMap map = new HashMap();
        map.put("ro.debuggable", "1");
        map.put("ro.secure", "0");
        String[] strArrMonoploid = monoploid();
        if (strArrMonoploid == null) {
            return false;
        }
        boolean z = false;
        for (String str : strArrMonoploid) {
            for (String str2 : map.keySet()) {
                if (str.contains(str2)) {
                    String str3 = X3.j.d + ((String) map.get(str2)) + X3.j.e;
                    if (str.contains(str3)) {
                        irredeemable.attabal.beachfront(str2 + " = " + str3 + " detected!");
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public boolean formularize() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public final boolean impassible(List<String> list) {
        PackageManager packageManager = this.f24836attabal.getPackageManager();
        boolean z = false;
        for (String str : list) {
            try {
                packageManager.getPackageInfo(str, 0);
                irredeemable.attabal.saneness(str + " ROOT management app detected!");
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    public boolean impromptu() {
        return taiyuan(null);
    }

    @Deprecated
    public boolean kowloon() {
        return triweekly();
    }

    public boolean marial() {
        String[] strArrArytenoidectomy = arytenoidectomy();
        int i = 0;
        if (strArrArytenoidectomy == null) {
            return false;
        }
        int length = strArrArytenoidectomy.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            String str = strArrArytenoidectomy[i2];
            String[] strArrSplit = str.split(" ");
            if (strArrSplit.length < 6) {
                irredeemable.attabal.saneness("Error formatting mount line: " + str);
            } else {
                String str2 = strArrSplit[2];
                String strReplace = strArrSplit[5];
                String[] strArr = attabal.f24833marial;
                int length2 = strArr.length;
                int i3 = i;
                while (i3 < length2) {
                    String str3 = strArr[i3];
                    if (str2.equalsIgnoreCase(str3)) {
                        strReplace = strReplace.replace("(", "").replace(")", "");
                        String[] strArrSplit2 = strReplace.split(",");
                        int length3 = strArrSplit2.length;
                        for (int i4 = i; i4 < length3; i4++) {
                            if (strArrSplit2[i4].equalsIgnoreCase("rw")) {
                                irredeemable.attabal.beachfront(str3 + " path is mounted with rw permissions! " + str);
                                z = true;
                                break;
                            }
                        }
                    }
                    i3++;
                    i = 0;
                }
            }
            i2++;
            i = 0;
        }
        return z;
    }

    public final String[] monoploid() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            irredeemable.attabal.attabal(e);
            return null;
        }
    }

    public boolean saneness(String str) {
        boolean z = false;
        for (String str2 : attabal.attabal()) {
            String str3 = str2 + str;
            if (new File(str2, str).exists()) {
                irredeemable.attabal.beachfront(str3 + " binary detected!");
                z = true;
            }
        }
        return z;
    }

    public boolean taiyuan(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(attabal.f24834saneness));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return impassible(arrayList);
    }

    public boolean triweekly() {
        return cutely() || impromptu() || saneness("su") || dern() || marial() || formularize() || competently() || beachfront() || wireman();
    }

    public boolean wireman() {
        return saneness("magisk");
    }
}
