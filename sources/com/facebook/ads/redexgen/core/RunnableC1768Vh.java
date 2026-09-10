package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC1768Vh implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ T8 A00;
    public final /* synthetic */ C1771Vk A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-66, -58, -72, -6, -5, 5, 6, 1, 4, 11, 3, -10, 1, 0, 3, 5, -6, -1, -8, -38, -51, -39, -35, -51, -37, -36, -57, -47, -52};
    }

    public RunnableC1768Vh(C1771Vk c1771Vk, String str, T8 t8) {
        this.A01 = c1771Vk;
        this.A02 = str;
        this.A00 = t8;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ArrayList<C1770Vj> arrayList;
        if (WU.A02(this)) {
            return;
        }
        try {
            C1713Te nvl = new C1713Te(A00(0, 3, 84));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, 118), jSONArray);
            jSONObject.put(A00(19, 10, 76), this.A02);
            synchronized (this.A01.A0D) {
                arrayList = new ArrayList(this.A01.A0D);
                this.A01.A0D.clear();
            }
            for (C1770Vj c1770Vj : arrayList) {
                jSONArray.put(A00(0, 0, 23) + c1770Vj.A00 + ';' + c1770Vj.A02 + ';' + c1770Vj.A01);
            }
            nvl.A07(jSONObject);
            nvl.A05(1);
            this.A00.A08().ABD(A00(10, 9, 117), AbstractC1712Td.A2R, nvl);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
