package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0615Bj {
    public static byte[] A05;
    public static final Object A06;
    public static final Map<String, String> A07;
    public static final AtomicBoolean A08;
    public final SharedPreferences A00;
    public final AnonymousClass85 A01;
    public final C05528l A02;
    public final String A03;
    public final String A04;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-100, -19, -14, -4, -25, -89, -45, -35, -32, -45, -29, 35, 47, 45, -18, 33, 46, 36, 50, 47, 41, 36, -18, 54, 37, 46, 36, 41, 46, 39, -21, -5, -23, -8, -15, 10, 26, 19, cw.l, 10, -18, -20, -11, -20, -7, -16, -22};
    }

    static {
        A04();
        A07 = new HashMap();
        A06 = new Object();
        A08 = new AtomicBoolean();
    }

    public C0615Bj(AnonymousClass85 anonymousClass85, String str) {
        this.A01 = anonymousClass85;
        this.A03 = str;
        this.A02 = new C05528l(this.A01, str);
        this.A00 = BJ.A00(this.A01);
        this.A04 = A01(1, 4, 93) + str + A01(0, 1, 18) + this.A02.A06();
    }

    private final String A00() {
        return this.A00.getString(this.A04, null);
    }

    public static String A02(AnonymousClass85 anonymousClass85, String str) {
        try {
            PackageManager packageManager = anonymousClass85.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return CS.A03(packageManager.getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e) {
            if (A08.compareAndSet(false, true)) {
                anonymousClass85.A08().AAu(A01(40, 7, 56), AbstractC05418a.A1P, new C05428b(e));
            }
            return null;
        }
    }

    public static String A03(String str) {
        String str2;
        synchronized (A06) {
            str2 = A07.get(str);
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:6:0x0016  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final void A05() throws JSONException {
        String strA01;
        String checksumApiFingerprint;
        String strA02 = null;
        if (Build.VERSION.SDK_INT < 31) {
            String strA03 = A01(5, 1, 5);
            String checksumApiFingerprint2 = Build.VERSION.CODENAME;
            if (strA03.equals(checksumApiFingerprint2)) {
                if (C05789m.A2e(this.A01)) {
                    strA01 = A01(11, 19, 113);
                    checksumApiFingerprint = this.A02.A0B();
                    if (strA01.equals(checksumApiFingerprint)) {
                        AnonymousClass85 anonymousClass85 = this.A01;
                        String checksumApiFingerprint3 = this.A03;
                        strA02 = CS.A01(anonymousClass85, checksumApiFingerprint3);
                    }
                }
            }
        } else if (C05789m.A2e(this.A01)) {
            strA01 = A01(11, 19, 113);
            checksumApiFingerprint = this.A02.A0B();
            if (strA01.equals(checksumApiFingerprint)) {
                AnonymousClass85 anonymousClass86 = this.A01;
                String checksumApiFingerprint4 = this.A03;
                strA02 = CS.A01(anonymousClass86, checksumApiFingerprint4);
            }
        }
        if (strA02 == null) {
            AnonymousClass85 anonymousClass87 = this.A01;
            String checksumApiFingerprint5 = this.A03;
            strA02 = A02(anonymousClass87, checksumApiFingerprint5);
        } else if (C05789m.A1d(this.A01)) {
            AnonymousClass85 anonymousClass88 = this.A01;
            String checksumApiFingerprint6 = this.A03;
            String strA04 = A02(anonymousClass88, checksumApiFingerprint6);
            String checksumApiFingerprint7 = A01(6, 5, 33);
            C05428b c05428b = new C05428b(checksumApiFingerprint7);
            c05428b.A05(1);
            c05428b.A06(1);
            c05428b.A0A(false);
            JSONObject checksumsJson = new JSONObject();
            String checksumApiFingerprint8 = A01(30, 5, 57);
            checksumsJson.put(checksumApiFingerprint8, strA02);
            String checksumApiFingerprint9 = A01(35, 5, 88);
            checksumsJson.put(checksumApiFingerprint9, strA04);
            c05428b.A07(checksumsJson);
            C8Z c8zA08 = this.A01.A08();
            String legacyMd5 = A01(40, 7, 56);
            c8zA08.AAv(legacyMd5, AbstractC05418a.A1I, c05428b);
        }
        synchronized (A06) {
            Map<String, String> map = A07;
            String checksumApiFingerprint10 = this.A03;
            map.put(checksumApiFingerprint10, strA02);
        }
        SharedPreferences.Editor editorEdit = this.A00.edit();
        String checksumApiFingerprint11 = this.A04;
        editorEdit.putString(checksumApiFingerprint11, strA02).apply();
    }

    public final void A06() {
        String strA00 = A00();
        synchronized (A06) {
            Map<String, String> map = A07;
            String storedFingerprint = this.A03;
            map.put(storedFingerprint, strA00);
        }
    }
}
