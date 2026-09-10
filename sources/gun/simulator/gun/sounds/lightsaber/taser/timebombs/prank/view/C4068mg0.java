package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import androidx.appcompat.app.AlertDialog;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4068mg0 {
    public static final C4068mg0 h = new C4068mg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f4706a = new AtomicBoolean(false);
    public K5 b = null;
    public int c = 0;
    public WeakReference d = null;
    public AlertDialog e = null;
    public C3804jg0 f = null;
    public C3892kg0 g = null;

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        byte[] bArr = {90, 112, 121, 32, 51, 77, -1};
        byte[] bArr2 = {1, 64, 84, 25, 29, com.umeng.analytics.pro.cw.n, -44, -30};
        int i = 0;
        int i2 = 0;
        while (i < 7) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        Matcher matcher = Pattern.compile(new String(bArr, StandardCharsets.UTF_8)).matcher(str);
        if (matcher.find()) {
            try {
                return Integer.parseInt(matcher.group());
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    public final boolean b(AbstractApplicationC2673Ph abstractApplicationC2673Ph) {
        K5 k5 = this.b;
        if (k5 != null && k5.f3300a.booleanValue() && abstractApplicationC2673Ph != null) {
            try {
                WeakReference weakReference = new WeakReference(abstractApplicationC2673Ph);
                PackageInfo packageInfo = ((Context) weakReference.get()).getPackageManager().getPackageInfo(((Context) weakReference.get()).getPackageName(), 0);
                if (packageInfo != null) {
                    int i = packageInfo.versionCode;
                    Qm0.D(new byte[]{-14, -40, -80, -105, -113, -83, 85, -60, -27, -47, -85, -121, -39, -23, 118, -47, -13, -61, -74, -115, -115, -118, 111, -48, -28, -112, -30, -62}, new byte[]{-127, -80, -33, -30, -29, -55, 0, -76});
                    String str = this.b.h;
                    if (TextUtils.isEmpty(str)) {
                        Qm0.D(new byte[]{78, -98, -56, -62, -22, 123, 43, -13, 89, -105, -45, -46, -68, 63, 23, -16, 120, -101, -41, -61, -1}, new byte[]{61, -10, -89, -73, -122, 31, 126, -125});
                        Integer num = this.b.f;
                        if (num != null) {
                            return i < num.intValue();
                        }
                    }
                    if (str.contains(Qm0.D(new byte[]{-98}, new byte[]{-72, 34, 33, 50, 121, -103, -26, 22}))) {
                        Qm0.D(new byte[]{127, 56, 51, 108, -82, -128, -112, -21, 104, 49, 40, 124, -8, -60, -29}, new byte[]{12, 80, 92, 25, -62, -28, -59, -101});
                        String[] strArrSplit = str.trim().split(Qm0.D(new byte[]{112}, new byte[]{86, 72, -63, 90, 94, 47, 108, 39}));
                        for (String str2 : strArrSplit) {
                            int iA = a(str2);
                            if (iA != -1 && i == iA) {
                                return true;
                            }
                        }
                    } else if (str.contains(Qm0.D(new byte[]{-126, 98}, new byte[]{-66, 95, -28, 50, 3, -58, 48, -83})) || str.contains(Qm0.D(new byte[]{-69}, new byte[]{-121, -95, 121, 56, 68, 107, -66, -89}))) {
                        Qm0.D(new byte[]{-23, -128, -6, 32, -122, 108, 55, -28, -2, -119, -31, 48, -48, 40, 94, -87, -70, -108, -23, 117, -42}, new byte[]{-102, -24, -107, 85, -22, 8, 98, -108});
                        boolean zContains = str.contains(Qm0.D(new byte[]{-125}, new byte[]{-66, -93, 108, -26, -112, 68, 92, 112}));
                        for (String str3 : str.trim().split(zContains ? Qm0.D(new byte[]{104, -90}, new byte[]{84, -101, -104, -111, -76, 94, 3, 97}) : Qm0.D(new byte[]{32}, new byte[]{28, 120, 121, 33, 123, 86, 55, 23}))) {
                            int iA2 = a(str3);
                            if (iA2 != -1) {
                                if (zContains) {
                                    if (i <= iA2) {
                                        Qm0.D(new byte[]{11, 5, -48, 70, -119, 24, -51, 1, 28, 12, -53, 86, -33, 92, -18, 20, 10, 30, -42, 92, -117, 63, -9, 21, 29, 77, -125, com.umeng.analytics.pro.cw.l, -59, 31, -9, 21, 29}, new byte[]{120, 109, -65, 51, -27, 124, -104, 113});
                                        return true;
                                    }
                                } else if (i < iA2) {
                                    Qm0.D(new byte[]{11, 5, -48, 70, -119, 24, -51, 1, 28, 12, -53, 86, -33, 92, -18, 20, 10, 30, -42, 92, -117, 63, -9, 21, 29, 77, -125, com.umeng.analytics.pro.cw.l, -59, 31, -9, 21, 29}, new byte[]{120, 109, -65, 51, -27, 124, -104, 113});
                                    return true;
                                }
                            }
                        }
                    } else {
                        Qm0.D(new byte[]{-121, 115, -46, -57, -57, -126, 78, 121, -112, 122, -55, -41, -111, -58, 116, 125, -100, 126, -49}, new byte[]{-12, 27, -67, -78, -85, -26, 27, 9});
                        String[] strArrSplit2 = str.split(" ");
                        for (String str4 : strArrSplit2) {
                            int iA3 = a(str4);
                            if (iA3 != -1 && i == iA3) {
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public final void c(Activity activity) {
        AtomicBoolean atomicBoolean = this.f4706a;
        if (activity != null) {
            try {
                if (!activity.isDestroyed() && !activity.isFinishing() && !activity.isRestricted()) {
                    AlertDialog alertDialog = this.e;
                    if (alertDialog != null && alertDialog.isShowing()) {
                        this.e.dismiss();
                        this.e = null;
                    }
                    atomicBoolean.set(false);
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        atomicBoolean.set(false);
    }

    public final boolean d() {
        K5 k5 = this.b;
        if (k5 == null || !k5.f3300a.booleanValue()) {
            return false;
        }
        return this.b.b.booleanValue();
    }
}
