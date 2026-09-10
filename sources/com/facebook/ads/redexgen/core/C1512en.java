package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1512en {
    public static byte[] A02;
    public static String[] A03 = {"y19RqLZ2IuVD6HbBrX9TkFHUDexCS89U", "4Dtb8JqriBulvdprIYDDbsy9i3XxxOQa", "bpScKmTJYxMEBy", "xxVNovQDT9VUW", "AzWxpVFMQNB2EJkHOaDeHNxvVhpRFtdb", bc.aM, "hpVewa8V4U0uIeAQyFygie6aobYcZL3L", "KAU542hGN0tQEAnfSxy"};
    public final Map<String, Object> A01 = new HashMap();
    public final List<String> A00 = new ArrayList();

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A02 = new byte[]{61, 80, 71, 55, 68, 61, 70, 66, 85, 76, 60, 79, 66, 65, 70, 79};
    }

    static {
        A07();
    }

    public static C1512en A00(C1512en c1512en, long j) {
        return c1512en.A03(A06(0, 7, 112), j);
    }

    public static C1512en A01(C1512en c1512en, Uri uri) {
        String strA06 = A06(7, 9, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE);
        if (uri == null) {
            return c1512en.A02(strA06);
        }
        return c1512en.A05(strA06, uri.toString());
    }

    private final C1512en A02(String str) {
        this.A00.add(str);
        this.A01.remove(str);
        return this;
    }

    private final C1512en A03(String str, long j) {
        return A04(str, Long.valueOf(j));
    }

    private C1512en A04(String str, Object obj) {
        this.A01.put((String) AbstractC1517es.A01(str), AbstractC1517es.A01(obj));
        this.A00.remove(str);
        return this;
    }

    private final C1512en A05(String str, String str2) {
        return A04(str, str2);
    }

    public final List<String> A08() {
        return Collections.unmodifiableList(new ArrayList(this.A00));
    }

    public final Map<String, Object> A09() {
        HashMap map = new HashMap(this.A01);
        for (Object obj : map.entrySet()) {
            if (A03[6].charAt(7) != 'V') {
                throw new RuntimeException();
            }
            A03[1] = "4URLy2w4g094VfYoQeDAsG1vGQaIlezG";
            Map.Entry entry = (Map.Entry) obj;
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
