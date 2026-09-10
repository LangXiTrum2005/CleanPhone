package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1774j9 implements C3W {
    public static C1774j9 A01;
    public static byte[] A02;
    public static String[] A03 = {"JA9mFndCctStcDzVBolZEhplBWXHl3GV", "NcYgt8CJQWeZTs6r7gmN4DT79HnpXepC", "3XxDtH0VTaUV7XfCs333UHSSC4s6Co3p", "GzYduKaWaeKhPeumV22hkK4VttJt2TZR", "1SSiXu0qt70LSSG", "DSz0vhavMIehNnnYUsD24XzaqUk6jyxA", "cWkBnlzylFFk2PvMzvfAX6O9wvYh3tUg", "DdhgMLh6mU1KSfIF9B7woVtLM"};
    public static final String A04;
    public final LinkedHashMap<String, C05919z> A00 = new LinkedHashMap<>();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{74, 93, 70, 76, 68, 77, 87, 77, 80, 92, 90, 73, 91, 87, 67, 77, 81, 6, 39, 49, 54, 48, 45, 59, 39, 38, 98, 3, 38, 98, 112, 119, 113, 124, 98, 103, 124, 106, 103, 124, 104, 102, 122};
    }

    static {
        A02();
        A04 = C1774j9.class.getSimpleName();
    }

    public static C1774j9 A00() {
        if (A01 == null) {
            A01 = new C1774j9();
        }
        return A01;
    }

    public final C3G A03(String str) {
        C05919z adRecord = this.A00.get(str);
        if (adRecord != null) {
            return adRecord.A00;
        }
        String[] strArr = A03;
        if (strArr[1].charAt(31) == strArr[2].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[3] = "XrwELTKduoHwTv5Xe9Ueh6lc6nYoGsk4";
        strArr2[0] = "dmw4t0heQzRKMH67OrdKuJovyCEl55Ve";
        return null;
    }

    public final C05919z A04(String str) {
        return this.A00.get(str);
    }

    public final C05919z A05(String str, Messenger messenger, String str2) {
        C05919z c05919z = new C05919z(str, messenger, str2);
        this.A00.put(str, c05919z);
        return c05919z;
    }

    public final void A06() {
        Iterator<Map.Entry<String, C05919z>> it = this.A00.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A03;
            if (strArr[5].charAt(17) == strArr[6].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "uaiMeFYOk8P5CT6awQd5iZTKLUhraaN2";
            strArr2[6] = "RG3ipiEhElKk8ivC3FwrEM9mKg3mEr0b";
            if (zHasNext) {
                C3G c3g = it.next().getValue().A00;
                if (c3g != null) {
                    c3g.destroy();
                }
                it.remove();
            } else {
                return;
            }
        }
    }

    public final void A07(int i, String str, Bundle bundle, Messenger messenger) {
        try {
            Message messageObtain = Message.obtain((Handler) null, i);
            if (str != null) {
                messageObtain.getData().putString(A01(30, 13, 95), str);
            }
            if (bundle != null) {
                messageObtain.getData().putBundle(A01(0, 17, 116), bundle);
            }
            messenger.send(messageObtain);
        } catch (RemoteException unused) {
            if (str != null) {
                A08(str);
            }
        }
    }

    public final void A08(String str) {
        C05919z c05919z = this.A00.get(str);
        if (c05919z != null && c05919z.A00 != null) {
            String str2 = A01(17, 13, 62) + str;
            c05919z.A00.destroy();
            this.A00.remove(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C3W
    public final void AE7(int i, String str, Bundle bundle) {
        C05919z adRecord = A04(str);
        if (adRecord != null) {
            A07(i, str, bundle, adRecord.A01);
        }
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, C05919z>> it = this.A00.entrySet().iterator();
        while (it.hasNext()) {
            C05919z value = it.next().getValue();
            try {
                value.A01.send(Message.obtain((Handler) null, 3));
            } catch (RemoteException unused) {
                hashSet.add(value.A02);
            }
        }
        Iterator it2 = hashSet.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            String[] strArr = A03;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "oay5V0mz6qjd0xRXPgrRbPRiLoP0UxTC";
            strArr2[6] = "83Bq2rwwej5lQl4xIjWhMW1frgDiuUFT";
            if (zHasNext) {
                A08((String) it2.next());
            } else {
                return;
            }
        }
    }
}
