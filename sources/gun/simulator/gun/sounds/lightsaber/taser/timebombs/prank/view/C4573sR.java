package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4573sR extends BroadcastReceiver {
    public static long b = 0;
    public static long c = 0;
    public static long d = 0;
    public static int e = -3;
    public static boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JS f4980a;

    static {
        byte[] bArr = {-92, 109, -117};
        byte[] bArr2 = {-16, 44, -52, -126, 102, 49, 12, 105};
        int i = 0;
        int i2 = 0;
        while (i < 3) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        f = true;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        if (f) {
            f = false;
            return;
        }
        String action = intent.getAction();
        byte[] bArr = {-50, -110, 17, 28, 62, 94, 33, 103, -63, -103, 1, 64, 50, 88, 43, 39, -127, -65, 58, 32, 31, 114, 6, 29, -26, -86, 60, 58, 8, 104, 6, 1, -18, -78, 50, 43};
        byte[] bArr2 = {-81, -4, 117, 110, 81, 55, 69, 73};
        int length = bArr.length;
        int length2 = bArr2.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 >= length2) {
                i3 = 0;
            }
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
            i2++;
            i3++;
        }
        if (action.equals(new String(bArr, StandardCharsets.UTF_8))) {
            byte[] bArr3 = {74, -65, -114, -8, -54, -107, -113, 106, 91, -82, -102, -20, -12, -85};
            byte[] bArr4 = {51, -58, -9, -127, -121, -40, -21, com.umeng.analytics.pro.cw.l};
            int i4 = 0;
            int i5 = 0;
            while (i4 < 14) {
                if (i5 >= 8) {
                    i5 = 0;
                }
                bArr3[i4] = (byte) (bArr3[i4] ^ bArr4[i5]);
                i4++;
                i5++;
            }
            long jLongValue = Long.valueOf(new SimpleDateFormat(new String(bArr3, StandardCharsets.UTF_8)).format(new Date())).longValue();
            if (jLongValue == b || jLongValue == c || jLongValue == d) {
                return;
            }
            byte[] bArr5 = {-120, 82, -126, -84, 67, -127, -1, 126, -99, 84, -104, -69};
            byte[] bArr6 = {-21, 61, -20, -62, 38, -30, -117, 23};
            int i6 = 0;
            int i7 = 0;
            while (i6 < 12) {
                if (i7 >= 8) {
                    i7 = 0;
                }
                bArr5[i6] = (byte) (bArr5[i6] ^ bArr6[i7]);
                i6++;
                i7++;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(new String(bArr5, StandardCharsets.UTF_8))).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                i = -1;
            } else if (activeNetworkInfo.getType() == 1) {
                i = 0;
            } else if (activeNetworkInfo.getType() == 0) {
                i = 1;
            } else {
                i = -1;
            }
            if (i == 0 && e != 0) {
                b = jLongValue;
                e = i;
                byte[] bArr7 = {9, 66, 101, 2, 83, 127, 10};
                byte[] bArr8 = {126, 43, 3, 107, -68, -61, -112, 0};
                int length3 = bArr7.length;
                int length4 = bArr8.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length3) {
                    if (i9 >= length4) {
                        i9 = 0;
                    }
                    bArr7[i8] = (byte) (bArr7[i8] ^ bArr8[i9]);
                    i8++;
                    i9++;
                }
                new String(bArr7, StandardCharsets.UTF_8);
                JS js = this.f4980a;
                if (js != null) {
                    js.a(0);
                    return;
                }
                return;
            }
            if (i == 1 && e != 1) {
                c = jLongValue;
                e = i;
                byte[] bArr9 = {-80, -51, -32, -121, 83, -17, -110, 123, -57, -65, -21, -3, 49, -3, -17};
                byte[] bArr10 = {86, 88, 80, 97, -34, 65, 117, -58};
                int length5 = bArr9.length;
                int length6 = bArr10.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length5) {
                    if (i11 >= length6) {
                        i11 = 0;
                    }
                    bArr9[i10] = (byte) (bArr9[i10] ^ bArr10[i11]);
                    i10++;
                    i11++;
                }
                new String(bArr9, StandardCharsets.UTF_8);
                JS js2 = this.f4980a;
                if (js2 != null) {
                    js2.a(0);
                    return;
                }
                return;
            }
            if (i != -1 || e == -1) {
                return;
            }
            d = jLongValue;
            e = i;
            byte[] bArr11 = {-85, 37, -19, 110, 67, 40, 78, 29, -47, 93, -15, 19};
            byte[] bArr12 = {77, -78, 77, -119, -2, -71, -87, -90};
            int length7 = bArr11.length;
            int length8 = bArr12.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length7) {
                if (i13 >= length8) {
                    i13 = 0;
                }
                bArr11[i12] = (byte) (bArr11[i12] ^ bArr12[i13]);
                i12++;
                i13++;
            }
            new String(bArr11, StandardCharsets.UTF_8);
            JS js3 = this.f4980a;
            if (js3 != null) {
                js3.a(1);
            }
        }
    }
}
