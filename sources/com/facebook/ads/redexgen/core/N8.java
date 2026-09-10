package com.facebook.ads.redexgen.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class N8 {
    public static N8 A08;
    public static byte[] A09;
    public static final String A0A;
    public boolean A01;
    public final T8 A03;
    public final String A04;
    public final Executor A07;
    public final CountDownLatch A05 = new CountDownLatch(1);
    public final CountDownLatch A06 = new CountDownLatch(1);
    public final N7 A02 = new N7();
    public String A00 = null;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A09 = new byte[]{65, 64, 82, 57, 44, 91, 94, 73, 121, 91, 74, 74, 83, 84, 93, 115, 84, 92, 85, 20, 78, 66, 78, 72, 74, 91, 91, 78, 79, 106, 79, 88, 5, 95, 83, 95, 66, 86, 65, 85, 81, 65, 74, 71, 93, 123, 71, 69, 84, 84, 77, 74, 67};
    }

    static {
        A09();
        A0A = N8.class.getSimpleName();
    }

    public N8(T8 t8, boolean z2, Executor executor, String str) {
        this.A03 = t8.A02();
        this.A04 = str;
        this.A07 = executor;
        if (z2) {
            A0A();
        }
    }

    public static synchronized N8 A01(T8 t8) {
        if (A08 == null) {
            A08 = new N8(t8, true, YG.A06, A03(0, 0, 18));
        }
        return A08;
    }

    private String A04(String str) {
        String strA03 = A03(0, 0, 18);
        try {
            synchronized (this) {
                File file = new File(this.A03.getFilesDir(), str);
                if (file.exists() && file.length() > 0) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] data = new byte[(int) file.length()];
                    fileInputStream.read(data);
                    fileInputStream.close();
                    String fileContent = A03(0, 5, 12);
                    strA03 = new String(data, fileContent);
                }
            }
        } catch (FileNotFoundException e2) {
            this.A03.A08().ABC(A03(36, 17, 60), AbstractC1712Td.A17, new C1713Te(e2));
        } catch (IOException e3) {
            this.A03.A08().ABC(A03(36, 17, 60), AbstractC1712Td.A19, new C1713Te(e3));
        }
        return strA03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        String strA03 = A03(36, 17, 60);
        try {
            this.A02.A08(A04(this.A04 + A03(23, 13, 51)));
            this.A02.A0A(A04(A03(5, 18, 34)));
        } catch (C1713Te e2) {
            A0M();
            this.A03.A08().ABC(strA03, AbstractC1712Td.A18, e2);
        } catch (JSONException e3) {
            A0M();
            this.A03.A08().ABC(strA03, AbstractC1712Td.A1A, new C1713Te(e3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        String adsFrequencyCappingDataList;
        synchronized (this.A02) {
            adsFrequencyCappingDataList = this.A02.A05().toString();
        }
        A0G(A0K(), adsFrequencyCappingDataList);
    }

    private final void A0A() {
        this.A07.execute(new C2501kD(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E(C1563Nf c1563Nf, String str, boolean z2) {
        c1563Nf.A07(z2);
        if (c1563Nf.A08() || c1563Nf.A09()) {
            this.A02.A07(str);
        } else {
            this.A02.A09(str);
        }
    }

    private void A0F(String str) {
        File file = new File(this.A03.getFilesDir(), str);
        if (file.exists()) {
            file.delete();
        }
    }

    private final synchronized void A0G(String str, String str2) {
        A0H(this.A04 + A03(23, 13, 51), str.getBytes());
        A0H(A03(5, 18, 34), str2.getBytes());
    }

    private void A0H(String str, byte[] bArr) {
        try {
            synchronized (this) {
                try {
                    File file = new File(this.A03.getFilesDir(), str);
                    FileOutputStream fout = new FileOutputStream(file);
                    fout.write(bArr);
                    fout.close();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (FileNotFoundException e2) {
            this.A03.A08().ABC(A03(36, 17, 60), AbstractC1712Td.A17, new C1713Te(e2));
        } catch (IOException e3) {
            this.A03.A08().ABC(A03(36, 17, 60), AbstractC1712Td.A19, new C1713Te(e3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(String str) {
        boolean z2 = false;
        try {
            synchronized (this.A02) {
                z2 = this.A02.A05().get(str) instanceof C1563Nf;
            }
        } catch (JSONException e2) {
            this.A03.A08().ABC(A03(36, 17, 60), AbstractC1712Td.A1A, new C1713Te(e2));
        }
        return z2;
    }

    public final String A0K() {
        return this.A02.A04();
    }

    public final void A0L() {
        if (!this.A01 || this.A00 == null) {
            return;
        }
        this.A07.execute(new C2498kA(this, this.A00));
    }

    public final synchronized void A0M() {
        A0F(this.A04 + A03(5, 18, 34));
        A0F(this.A04 + A03(23, 13, 51));
    }

    public final void A0N(String str) {
        if (!this.A01) {
            return;
        }
        this.A00 = str;
        this.A07.execute(new C2499kB(this, str));
    }

    public final void A0O(JSONObject jSONObject) {
        this.A01 = C1750Up.A1E(this.A03);
        if (!this.A01) {
            return;
        }
        this.A07.execute(new C2500kC(this, jSONObject));
    }
}
