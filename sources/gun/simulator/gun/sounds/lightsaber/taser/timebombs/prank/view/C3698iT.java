package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3698iT {
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static C3698iT h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4501a;
    public String b = "";
    public boolean c = true;

    static {
        Qm0.D(new byte[]{-84, 19, 70, 58, 22, 40, -49, -114, -67, 52, 65, 56, com.umeng.analytics.pro.cw.k, 47, -6, -124, -110, 36, 122, 52, com.umeng.analytics.pro.cw.l}, new byte[]{-4, 80, 8, 91, 98, 65, -71, -21});
        d = Qm0.D(new byte[]{110, -51, -106, 76, 43, -67, -29, 50, 123, -30, -123, 124, 45, -89, -10}, new byte[]{com.umeng.analytics.pro.cw.m, -67, -26, 19, 88, -55, -126, 64});
        e = Qm0.D(new byte[]{-10, 37, 30, -89, 22, 56, -113, -57, -15, 27, 26, -83, 60, 37, -109, -9}, new byte[]{-122, 68, 121, -62, 73, 75, -25, -88});
        f = Qm0.D(new byte[]{112, -30, -7, 10, 9, -112, -86, -95, 119, -21, -49, com.umeng.analytics.pro.cw.m, com.umeng.analytics.pro.cw.l, -82, -91}, new byte[]{19, -114, -112, 105, 98, -49, -62, -56});
        g = Qm0.D(new byte[]{40, 43, -65, -103, -67, 126, 89, 0, 55, 6, -87, -128, -89, 108, 104, 17, 43, 58, -75, -102, -84, 68}, new byte[]{78, 89, -38, -24, -56, 27, 55, 99});
    }

    public C3698iT(Context context) {
        this.f4501a = context.getApplicationContext();
    }

    public static synchronized C3698iT a(Context context) {
        try {
            if (h == null) {
                h = new C3698iT(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return h;
    }

    public final void b(String str) {
        String strM = DM.m(new StringBuilder(), e, str);
        Context context = this.f4501a;
        AbstractC2995aW.p0(context, AbstractC2995aW.J(context, 0, strM) + 1, strM);
        Qm0.D(new byte[]{7, -76, -83, 40, -81, 120, 98, -39, 32, -11, -87, 34, -6, 101, 126, -106, 49, -70, -72, 109}, new byte[]{87, -43, -54, 77, -113, 11, 10, -74});
        Qm0.D(new byte[]{-90, 87, -64, 89, -95, -98, 102, 29, -24, 74, -53, 94, -13, -113, 100, 66, -90}, new byte[]{-122, 62, -82, 58, -45, -5, 11, 120});
    }

    public final boolean c(String str, String str2) {
        int i;
        int i2 = 1;
        Context context = this.f4501a;
        char c = 0;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        String[] strArrSplit = str2.split(Qm0.D(new byte[]{-80}, new byte[]{-99, 87, 26, -19, -2, -125, 4, 99}));
        if (strArrSplit.length != 2) {
            Qm0.D(new byte[]{-109, 29, 1, -21, 70, 43, 17, 48, -68, 1, 18, -5, 95, 39, 27, 115, -93, 83, 20, -27, 68, 36, 28, 119, -6, 21, 24, -8, 71, 35, 1, 42, -6}, new byte[]{-38, 115, 119, -118, 42, 66, 117, com.umeng.analytics.pro.cw.n});
            return false;
        }
        try {
            int i3 = Integer.parseInt(strArrSplit[0].trim());
            int i4 = Integer.parseInt(strArrSplit[1].trim());
            if (i3 <= 0 || i4 <= 0) {
                return false;
            }
            String str3 = g + str;
            String strP = AbstractC2995aW.P(context, str3);
            if (strP.isEmpty()) {
                return false;
            }
            String[] strArrSplit2 = strP.split(Qm0.D(new byte[]{-10}, new byte[]{-38, 12, 52, 107, -114, 119, 69, -11}));
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = ((long) i3) * 86400000;
            StringBuilder sb = new StringBuilder();
            int length = strArrSplit2.length;
            int i5 = 0;
            int i6 = 0;
            while (i6 < length) {
                String str4 = strArrSplit2[i6];
                try {
                    if (jCurrentTimeMillis - Long.parseLong(str4.trim()) <= j) {
                        i5 += i2;
                        if (sb.length() > 0) {
                            byte[] bArr = new byte[i2];
                            bArr[c] = 9;
                            bArr[0] = (byte) (bArr[0] ^ new byte[]{37, 58, -27, -43, -114, -103, -64, -77}[0]);
                            sb.append(new String(bArr, StandardCharsets.UTF_8));
                        }
                        sb.append(str4);
                    }
                    i = 1;
                } catch (NumberFormatException unused) {
                    byte[] bArr2 = {71, -13, -51, 113, -49, -21, -32, -36, 122, -12, -42, 117, -48, -10, -27, -111, 126, -67, -46, 126, -125, -16, -31, -97, 97, -17, -33, 42, -125};
                    byte[] bArr3 = {com.umeng.analytics.pro.cw.l, -99, -69, com.umeng.analytics.pro.cw.n, -93, -126, -124, -4};
                    int i7 = i5;
                    int i8 = 0;
                    int i9 = 0;
                    for (int i10 = 29; i8 < i10; i10 = 29) {
                        if (i9 >= 8) {
                            i9 = 0;
                        }
                        bArr2[i8] = (byte) (bArr2[i8] ^ bArr3[i9]);
                        i8++;
                        i9++;
                    }
                    i = 1;
                    new String(bArr2, StandardCharsets.UTF_8);
                    i5 = i7;
                }
                i6 += i;
                strArrSplit2 = strArrSplit2;
                i2 = 1;
                c = 0;
            }
            AbstractC2995aW.r0(context, str3, sb.toString());
            boolean z = i5 >= i4;
            Qm0.D(new byte[]{-22, 114, 125, 98, -96, 83, -40, -67, -43, 32, 123, 124, -69, 66, -60, -79, -64, 32, 123, 123, -80, 85, -35, -2, -54, 111, 106, 51}, new byte[]{-84, 0, 24, 19, -43, 54, -74, -34});
            Qm0.D(new byte[]{76, -2}, new byte[]{118, -34, 46, -118, -91, 122, -73, 105});
            Qm0.D(new byte[]{2}, new byte[]{45, 76, 49, -104, -57, 108, -21, 32});
            Qm0.D(new byte[]{-83, -122, -54, 49}, new byte[]{-115, -17, -92, 17, 47, -85, -57, 86});
            Qm0.D(new byte[]{-122, 50, 121, 84, -52, -126, -110, -39, -49, 34, 112, 68, -47, -114, -47, -63, -56, 34, 106, 66, -45, -108, -110}, new byte[]{-90, 86, 24, 45, -65, -82, -78, -82});
            return z;
        } catch (NumberFormatException unused2) {
            byte[] bArr4 = {38, -92, 18, 112, 54, -31, -33, -94, com.umeng.analytics.pro.cw.m, -27, 11, 125, 33, -10, -102, -10, 6, -73, 30, 109, 38, -32, -111, -75, 25, -27, 24, 115, 61, -29, -106, -79, 90, -27};
            byte[] bArr5 = {96, -59, 123, 28, 83, -123, -1, -42};
            int i11 = 0;
            int i12 = 0;
            while (i11 < 34) {
                if (i12 >= 8) {
                    i12 = 0;
                }
                bArr4[i11] = (byte) (bArr4[i11] ^ bArr5[i12]);
                i11++;
                i12++;
            }
            new String(bArr4, StandardCharsets.UTF_8);
            return false;
        }
    }

    public final void d(String str) {
        String string;
        String strM = DM.m(new StringBuilder(), g, str);
        Context context = this.f4501a;
        String strP = AbstractC2995aW.P(context, strM);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (strP.isEmpty()) {
            string = String.valueOf(jCurrentTimeMillis);
        } else {
            StringBuilder sbO = DM.o(strP);
            byte[] bArr = {-95};
            bArr[0] = (byte) (new byte[]{-115, 70, 86, 106, -97, -87, 1, -88}[0] ^ bArr[0]);
            sbO.append(new String(bArr, StandardCharsets.UTF_8));
            sbO.append(jCurrentTimeMillis);
            string = sbO.toString();
        }
        AbstractC2995aW.r0(context, strM, string);
        Qm0.D(new byte[]{5, -31, -74, 43, -81, -75, 121, 75, 58, -77, -96, 50, -75, -89, 55, 90, 38, -16, -68, 40, -66, -75, 115, 8, 37, -4, -95, 122}, new byte[]{67, -109, -45, 90, -38, -48, 23, 40});
        Qm0.D(new byte[]{80, -44}, new byte[]{106, -12, -124, -5, -15, -45, 125, 112});
    }
}
