package com.facebook.ads.redexgen.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1762ix implements AK {
    public static byte[] A01;
    public final C1828k1 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{94, 89, 91, 76, 77, 89, 84, 103, 76, 81, 85, 93, 75, 76, 89, 85, 72, 64, 79, 74, 70, 77, 87, 124, 66, 83, 74, 124, 85, 70, 81, 80, 74, 76, 77, 101, 105, 104, 114, 99, 104, 114, 60, 41, 41, 5, 2, 31, 24, cw.k, 0, 0, 51, 30, 9, 10, 9, 30, 30, 9, 30, 68, 94, 114, 78, 89, 57, 40, 42, 34, 40, 46, 44, 22, 39, 40, 36, 44};
    }

    public C1762ix(C1828k1 c1828k1) {
        this.A00 = c1828k1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A03(String str, boolean z, String str2, String str3, String str4, long j) {
        this.A00.A0F().AB4(str);
        PackageManager packageManager = this.A00.getPackageManager();
        if (packageManager == null) {
            this.A00.A0F().AB9(str);
            return false;
        }
        ContentResolver contentResolver = this.A00.getContentResolver();
        if (contentResolver == null) {
            this.A00.A0F().AB6(str);
            return false;
        }
        if (packageManager.resolveContentProvider(str, 0) == null) {
            this.A00.A0F().AB5(str);
            return false;
        }
        Uri uri = Uri.parse(A00(35, 10, 10) + str + A00(0, 1, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE) + str2);
        ContentValues values = new ContentValues();
        values.put(A00(17, 18, 47), (Integer) 1);
        values.put(A00(61, 5, 33), Boolean.valueOf(z));
        values.put(A00(45, 16, 96), str3);
        values.put(A00(66, 12, 69), str4);
        values.put(A00(1, 16, 52), Long.valueOf(j));
        try {
            contentResolver.insert(uri, values);
            this.A00.A0F().ABB(str);
            return true;
        } catch (UnsupportedOperationException unused) {
            this.A00.A0F().AB8(str);
            return false;
        } catch (Exception unused2) {
            this.A00.A0F().AB7(str);
            return false;
        }
    }

    public final void A04(boolean z, String str, String str2, String str3, long j, boolean z2) {
        this.A00.A0F().ABA();
        D8.A06.execute(new C1763iy(this, z, str, str2, str3, j, z2));
    }
}
