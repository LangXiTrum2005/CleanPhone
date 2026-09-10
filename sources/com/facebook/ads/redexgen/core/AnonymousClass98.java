package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.ads.internal.util.process.ProcessUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.98, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass98 {
    public static String A00;
    public static CM A01;
    public static byte[] A02;
    public static String[] A03 = {"voSC7", "XZAhka0CvCOYv4I2O5x3YaAw3CbuYBFN", "p9gqIJ2nr", "98tXqko6jTMLdbqfVFP5nvRcnbiOcAti", "T2H4NPeAA8j3XC4jkS0zz8rIAu9TBODq", "PgqQ", "DWYdqAxgZwpx5TFll0r56voildH8EXHj", "oGCSEutn0BLuvxJJ07JBH6t"};
    public static final Map<String, Integer> A04;
    public static final AtomicInteger A05;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            A03[1] = "U3LMWoXZ5NcjJWeamIlVlKUbevsxyVyN";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
            i4++;
        }
    }

    public static void A05() {
        A02 = new byte[]{115, 6, 1, 23};
    }

    static {
        A05();
        A00 = null;
        A05 = new AtomicInteger(0);
        A04 = new HashMap();
    }

    public static synchronized CM A00(AnonymousClass85 anonymousClass85) {
        if (A01 == null) {
            A01 = CN.A00(anonymousClass85);
        }
        return A01;
    }

    public static Integer A01(String str) {
        synchronized (A04) {
            Integer num = A04.get(str);
            if (num == null) {
                return 0;
            }
            return num;
        }
    }

    public static void A06(AnonymousClass85 anonymousClass85, String str, Map<String, String> params) {
        String strA03;
        if (A0A(anonymousClass85)) {
            strA03 = C0615Bj.A03(str);
        } else {
            strA03 = A00;
        }
        if (strA03 != null) {
            String fingerprint = A02(1, 3, 28);
            params.put(fingerprint, strA03);
        }
    }

    public static void A07(final AnonymousClass85 anonymousClass85, boolean z) {
        if (!A05.compareAndSet(0, 1)) {
            return;
        }
        A00(anonymousClass85);
        try {
            final SharedPreferences sharedPreferencesA00 = BJ.A00(anonymousClass85);
            final C05528l c05528l = new C05528l(anonymousClass85);
            final String str = Build.FINGERPRINT + A02(0, 1, 19) + c05528l.A06();
            A00 = sharedPreferencesA00.getString(str, null);
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.97
                public static byte[] A04;
                public static String[] A05 = {"dMyKB8n8mY8sFmfmCsf5VwvZBLoVpPiR", "TBvdqjLuIRaxglwGY5TjNnUOxCNoUnNv", "FK0GmuaP9q8EyodOlfs4PJ6Rrg0VVoxV", "1UM", "Fv6ZlsmxNYwaZ6XY1w8nvtw6Sd1Ai0k0", "lERcqI9wEyu6Ta8yIDBCfbsl7aq4DQ3Q", "fq", "Qdyh6wSbko6o8Mj4qT2RTqVvwzMlz"};

                public static String A01(int i, int i2, int i3) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
                    for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 46);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A02() {
                    A04 = new byte[]{37, 105, 103, 122, 105, 121, 61, 49, 51, 112, 63, 48, 58, 44, 49, 55, 58, 112, 40, 59, 48, 58, 55, 48, 57, 48, 32, 50, 35, 58, 62, 46, 49, 58, 62, 99, 97, 106, 97, 118, 109, 103};
                }

                static {
                    A02();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:10:0x0034  */
                /* JADX WARN: Code duplicated, block: B:6:0x0017  */
                /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                public final Boolean call() throws Exception {
                    String strA0B;
                    String checksumApiFingerprint;
                    String strA01 = null;
                    if (Build.VERSION.SDK_INT < 31) {
                        String strA02 = A01(0, 1, 88);
                        String checksumApiFingerprint2 = Build.VERSION.CODENAME;
                        if (strA02.equals(checksumApiFingerprint2)) {
                            if (C05789m.A2e(anonymousClass85)) {
                                strA0B = c05528l.A0B();
                                checksumApiFingerprint = A01(6, 19, 112);
                                if (checksumApiFingerprint.equals(strA0B)) {
                                    AnonymousClass85 anonymousClass86 = anonymousClass85;
                                    String checksumApiFingerprint3 = anonymousClass85.getPackageName();
                                    strA01 = CS.A01(anonymousClass86, checksumApiFingerprint3);
                                }
                            }
                        }
                    } else if (C05789m.A2e(anonymousClass85)) {
                        strA0B = c05528l.A0B();
                        checksumApiFingerprint = A01(6, 19, 112);
                        if (checksumApiFingerprint.equals(strA0B)) {
                            AnonymousClass85 anonymousClass87 = anonymousClass85;
                            String checksumApiFingerprint4 = anonymousClass85.getPackageName();
                            strA01 = CS.A01(anonymousClass87, checksumApiFingerprint4);
                        }
                    }
                    if (strA01 == null) {
                        AnonymousClass85 anonymousClass88 = anonymousClass85;
                        String checksumApiFingerprint5 = anonymousClass85.getPackageName();
                        AnonymousClass98.A00 = C0615Bj.A02(anonymousClass88, checksumApiFingerprint5);
                    } else {
                        boolean zA1d = C05789m.A1d(anonymousClass85);
                        String[] strArr = A05;
                        String str2 = strArr[7];
                        String checksumApiFingerprint6 = strArr[0];
                        if (str2.length() == checksumApiFingerprint6.length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A05;
                        strArr2[1] = "kDvoq9mMnaUwO0DWwqxaQOFrfqCdc2U4";
                        strArr2[5] = "nyTkqSQWVKKnLYnFLp1tRd7YKhoP35dr";
                        if (zA1d) {
                            AnonymousClass85 anonymousClass89 = anonymousClass85;
                            String checksumApiFingerprint7 = anonymousClass85.getPackageName();
                            String strA03 = C0615Bj.A02(anonymousClass89, checksumApiFingerprint7);
                            String checksumApiFingerprint8 = A01(1, 5, 36);
                            C05428b c05428b = new C05428b(checksumApiFingerprint8);
                            c05428b.A05(1);
                            c05428b.A06(1);
                            c05428b.A0A(false);
                            JSONObject jSONObject = new JSONObject();
                            String checksumApiFingerprint9 = A01(25, 5, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE);
                            jSONObject.put(checksumApiFingerprint9, strA01);
                            String checksumApiFingerprint10 = A01(30, 5, 115);
                            jSONObject.put(checksumApiFingerprint10, strA03);
                            c05428b.A07(jSONObject);
                            C8Z c8zA08 = anonymousClass85.A08();
                            int i = AbstractC05418a.A1I;
                            String checksumApiFingerprint11 = A01(35, 7, 42);
                            c8zA08.AAv(checksumApiFingerprint11, i, c05428b);
                        }
                        AnonymousClass98.A00 = strA01;
                    }
                    SharedPreferences.Editor editorEdit = sharedPreferencesA00.edit();
                    String str3 = str;
                    String checksumApiFingerprint12 = AnonymousClass98.A00;
                    editorEdit.putString(str3, checksumApiFingerprint12).apply();
                    AnonymousClass98.A05.set(2);
                    return true;
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            A05.set(0);
        }
    }

    public static void A08(AnonymousClass85 anonymousClass85, boolean z, String str) {
        if (A0A(anonymousClass85)) {
            A09(anonymousClass85, z, str);
        } else {
            A07(anonymousClass85, z);
        }
    }

    public static void A09(AnonymousClass85 anonymousClass85, boolean z, final String str) {
        if (str == null) {
            str = anonymousClass85.getPackageName();
        }
        if (A0B(str)) {
            return;
        }
        A00(anonymousClass85);
        final C0615Bj c0615Bj = new C0615Bj(anonymousClass85, str);
        try {
            c0615Bj.A06();
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.96
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                public final Boolean call() throws Exception {
                    c0615Bj.A05();
                    synchronized (AnonymousClass98.A04) {
                        AnonymousClass98.A04.put(str, 2);
                    }
                    return true;
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            synchronized (A04) {
                A04.put(str, 0);
            }
        }
    }

    public static boolean A0A(AnonymousClass85 anonymousClass85) {
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            boolean zA2j = C05789m.A2j(anonymousClass85);
            if (A03[4].charAt(29) == 'E') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "Hubg";
            strArr[0] = "jm3dJ";
            if (!zA2j) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0B(String str) {
        synchronized (A04) {
            int status = A01(str).intValue();
            if (status != 0) {
                return true;
            }
            A04.put(str, 1);
            return false;
        }
    }
}
