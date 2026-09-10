package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0755Gz {
    public static byte[] A08;
    public static String[] A09 = {"wHWy6mJnObE4TdegwzR1XIqaiMp2qzo2", "2kKTv183xGQoCJ4bH8MOQBKEcrYPubr8", "yAnU2m0QEWVpmJNiipOenY", "2CWVvRtjqdC7", "Y1Dj6sRIbzGHXk3FXnyOisKccxY5ExT7", "AAUb4pYdx4XqEM8CotKihUFr9wNvuug2", "KLTFv3N2v474XPM9CBPbC4npqkPjZQN", "uonDorlDhYGoL6YzDZYQroxkAXvFfbHU"};
    public WeakReference<C0747Gr> A00;
    public WeakReference<InterfaceC1540fG> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C1828k1 A03;
    public final C0734Ge A04;
    public final String A05;
    public final String A06;
    public final WeakReference<A7> A07;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-121, -109, -111, -111, -123, -110, -120, -110, -109, -108, -113, -93, -102, -94, 112, 127, 120, 107, -93, -78, -85, -85, -94, -87, -100, -96, -84, -95, -94, -86, -71, -78, -78, -87, -80, -93, -79, -87, -73, -73, -91, -85, -87, -15, 0, -7, -7, -16, -9, -22, -1, 4, -5, -16, -18, -24, -4, -56, -55, -72, -62, -67, -127, 114, -122, -124, 118, 117, 83, -118, 102, -124, 118, -125, -31, -30, -49, -32, -30, -45, -46, -80, -25, -61, -31, -45, -32, -14, -13, -32, -13, -28, -39, -42, -48, -81, -55, -35, -84, -105, -94, -85, -101};
        if (A09[5].charAt(6) == '8') {
            throw new RuntimeException();
        }
        A09[3] = "q8I1zS5uUBp9u7UYsB3eM38aYjAC";
        A08 = bArr;
    }

    static {
        A09();
    }

    public C0755Gz(C1828k1 c1828k1, C0747Gr c0747Gr, A7 a7, C0734Ge c0734Ge, String str, String str2) {
        this.A03 = c1828k1;
        this.A00 = new WeakReference<>(c0747Gr);
        this.A07 = new WeakReference<>(a7);
        this.A04 = c0734Ge;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        return map;
    }

    private void A04() {
        InterfaceC1540fG uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
        if (A09[3].length() == 20) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[2] = "rLuDNCDiUJCt8jrcDw8nHa";
        strArr[6] = "w5dFeIXZRXYPRcNf7kYaeIakMq27def";
    }

    private void A05() {
        InterfaceC1540fG uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A9a();
    }

    private void A06() {
        InterfaceC1540fG uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AAb();
    }

    private void A07() {
        this.A03.A0F().A5u();
        this.A02 = true;
        InterfaceC1540fG uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AJI();
        if (C05789m.A1s(this.A03)) {
            this.A03.A0B().ACq();
        }
    }

    private void A08() {
        InterfaceC1540fG uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.ADF();
    }

    private void A0A(C0747Gr c0747Gr, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences sharedPreferencesA00 = BJ.A00(this.A03);
        String strA01 = A01(57, 5, 77);
        String strA02 = A01(0, 0, 53);
        String storageValue = jSONObject.optString(strA01, strA02);
        String key = jSONObject.optString(A01(54, 3, EnumC4719u30.JSON_ENCODE_ERROR_VALUE), A01(7, 7, 34));
        String string = sharedPreferencesA00.getString(A01(14, 4, 0) + key, strA02);
        if (string != null) {
            strA02 = string;
        }
        c0747Gr.A0g(storageValue, strA02);
    }

    private void A0B(C0747Gr c0747Gr, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String strA01 = A01(98, 5, 42);
        String strA02 = A01(0, 0, 53);
        String strOptString = jSONObject.optString(strA01, strA02);
        String strOptString2 = jSONObject.optString(A01(57, 5, 77), strA02);
        BJ.A00(this.A03).edit().putString(A01(14, 4, 0) + jSONObject.optString(A01(54, 3, EnumC4719u30.JSON_ENCODE_ERROR_VALUE), A01(7, 7, 34)), strOptString).apply();
        c0747Gr.A0f(strOptString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:6:0x0015 A[RETURN] */
    public void A0C(EnumC0753Gx enumC0753Gx, String str) throws JSONException {
        C0747Gr c0747Gr;
        switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
            case 1:
                A0I(new JSONObject(str));
                c0747Gr = this.A00.get();
                if (c0747Gr == null) {
                    return;
                }
                switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
                    case 19:
                        c0747Gr.A0S();
                        return;
                    case 20:
                        c0747Gr.A0R();
                        return;
                    case 21:
                        A0B(c0747Gr, str);
                        return;
                    case 22:
                        A0A(c0747Gr, str);
                        return;
                    case 23:
                        c0747Gr.A0i(A03(new JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 2:
                A06();
                c0747Gr = this.A00.get();
                if (c0747Gr == null) {
                    return;
                }
                switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
                    case 19:
                        c0747Gr.A0S();
                        return;
                    case 20:
                        c0747Gr.A0R();
                        return;
                    case 21:
                        A0B(c0747Gr, str);
                        return;
                    case 22:
                        A0A(c0747Gr, str);
                        return;
                    case 23:
                        c0747Gr.A0i(A03(new JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 3:
                A04();
                c0747Gr = this.A00.get();
                if (c0747Gr == null) {
                    return;
                }
                switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
                    case 19:
                        c0747Gr.A0S();
                        return;
                    case 20:
                        c0747Gr.A0R();
                        return;
                    case 21:
                        A0B(c0747Gr, str);
                        return;
                    case 22:
                        A0A(c0747Gr, str);
                        return;
                    case 23:
                        c0747Gr.A0i(A03(new JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 4:
                A07();
                c0747Gr = this.A00.get();
                if (c0747Gr == null) {
                    return;
                }
                switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
                    case 19:
                        c0747Gr.A0S();
                        return;
                    case 20:
                        c0747Gr.A0R();
                        return;
                    case 21:
                        A0B(c0747Gr, str);
                        return;
                    case 22:
                        A0A(c0747Gr, str);
                        return;
                    case 23:
                        c0747Gr.A0i(A03(new JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 5:
                A0K(new JSONObject(str));
                c0747Gr = this.A00.get();
                if (c0747Gr == null) {
                    return;
                }
                switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
                    case 19:
                        c0747Gr.A0S();
                        return;
                    case 20:
                        c0747Gr.A0R();
                        return;
                    case 21:
                        A0B(c0747Gr, str);
                        return;
                    case 22:
                        A0A(c0747Gr, str);
                        return;
                    case 23:
                        c0747Gr.A0i(A03(new JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 6:
                A0L(new JSONObject(str));
                c0747Gr = this.A00.get();
                if (c0747Gr == null) {
                    return;
                }
                switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
                    case 19:
                        c0747Gr.A0S();
                        return;
                    case 20:
                        c0747Gr.A0R();
                        return;
                    case 21:
                        A0B(c0747Gr, str);
                        return;
                    case 22:
                        A0A(c0747Gr, str);
                        return;
                    case 23:
                        c0747Gr.A0i(A03(new JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 7:
                boolean zIsDebug = BuildConfigApi.isDebug();
                String[] strArr = A09;
                if (strArr[2].length() != strArr[6].length()) {
                    String[] strArr2 = A09;
                    strArr2[7] = "ti0FJd6QzsmsCUgFEJNk2tGDtWFDX3UL";
                    strArr2[0] = "2bsL1IjRD3bcdVR1Mvy0yjSySADV0GcP";
                    if (zIsDebug) {
                    }
                    c0747Gr = this.A00.get();
                    if (c0747Gr == null) {
                        return;
                    }
                    switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
                        case 19:
                            c0747Gr.A0S();
                            return;
                        case 20:
                            c0747Gr.A0R();
                            return;
                        case 21:
                            A0B(c0747Gr, str);
                            return;
                        case 22:
                            A0A(c0747Gr, str);
                            return;
                        case 23:
                            c0747Gr.A0i(A03(new JSONObject(str)));
                            return;
                        default:
                            return;
                    }
                }
                throw new RuntimeException();
            case 8:
                A05();
                this.A03.A0F().A66(str);
                c0747Gr = this.A00.get();
                if (c0747Gr == null) {
                    return;
                }
                switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
                    case 19:
                        c0747Gr.A0S();
                        return;
                    case 20:
                        c0747Gr.A0R();
                        return;
                    case 21:
                        A0B(c0747Gr, str);
                        return;
                    case 22:
                        A0A(c0747Gr, str);
                        return;
                    case 23:
                        c0747Gr.A0i(A03(new JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 9:
                this.A03.A0F().A66(str);
                c0747Gr = this.A00.get();
                if (c0747Gr == null) {
                    return;
                }
                switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
                    case 19:
                        c0747Gr.A0S();
                        return;
                    case 20:
                        c0747Gr.A0R();
                        return;
                    case 21:
                        A0B(c0747Gr, str);
                        return;
                    case 22:
                        A0A(c0747Gr, str);
                        return;
                    case 23:
                        c0747Gr.A0i(A03(new JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                A0D(enumC0753Gx, str);
                c0747Gr = this.A00.get();
                if (c0747Gr == null) {
                    return;
                }
                switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
                    case 19:
                        c0747Gr.A0S();
                        return;
                    case 20:
                        c0747Gr.A0R();
                        return;
                    case 21:
                        A0B(c0747Gr, str);
                        return;
                    case 22:
                        A0A(c0747Gr, str);
                        return;
                    case 23:
                        c0747Gr.A0i(A03(new JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 15:
                A0J(new JSONObject(str));
                c0747Gr = this.A00.get();
                if (c0747Gr == null) {
                    return;
                }
                switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
                    case 19:
                        c0747Gr.A0S();
                        return;
                    case 20:
                        c0747Gr.A0R();
                        return;
                    case 21:
                        A0B(c0747Gr, str);
                        return;
                    case 22:
                        A0A(c0747Gr, str);
                        return;
                    case 23:
                        c0747Gr.A0i(A03(new JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 16:
                A08();
                c0747Gr = this.A00.get();
                if (c0747Gr == null) {
                    return;
                }
                switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
                    case 19:
                        c0747Gr.A0S();
                        return;
                    case 20:
                        c0747Gr.A0R();
                        return;
                    case 21:
                        A0B(c0747Gr, str);
                        return;
                    case 22:
                        A0A(c0747Gr, str);
                        return;
                    case 23:
                        c0747Gr.A0i(A03(new JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 17:
                A0M(new JSONObject(str));
                c0747Gr = this.A00.get();
                if (c0747Gr == null) {
                    return;
                }
                switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
                    case 19:
                        c0747Gr.A0S();
                        return;
                    case 20:
                        c0747Gr.A0R();
                        return;
                    case 21:
                        A0B(c0747Gr, str);
                        return;
                    case 22:
                        A0A(c0747Gr, str);
                        return;
                    case 23:
                        c0747Gr.A0i(A03(new JSONObject(str)));
                        return;
                    default:
                        return;
                }
            default:
                c0747Gr = this.A00.get();
                if (c0747Gr == null) {
                    return;
                }
                switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
                    case 19:
                        c0747Gr.A0S();
                        return;
                    case 20:
                        c0747Gr.A0R();
                        return;
                    case 21:
                        A0B(c0747Gr, str);
                        return;
                    case 22:
                        A0A(c0747Gr, str);
                        return;
                    case 23:
                        c0747Gr.A0i(A03(new JSONObject(str)));
                        return;
                    default:
                        return;
                }
        }
    }

    private void A0D(EnumC0753Gx enumC0753Gx, String str) throws JSONException {
        InterfaceC1540fG interfaceC1540fG = this.A01.get();
        if (interfaceC1540fG == null) {
        }
        switch (C0752Gw.A00[enumC0753Gx.ordinal()]) {
            case 10:
                interfaceC1540fG.ADJ();
                break;
            case 11:
                interfaceC1540fG.AF8();
                break;
            case 12:
                A0G(interfaceC1540fG, str);
                break;
            case 13:
                A0F(interfaceC1540fG, str);
                break;
            case 14:
                A0E(interfaceC1540fG, str);
                break;
        }
    }

    private void A0E(InterfaceC1540fG interfaceC1540fG, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, 115);
        interfaceC1540fG.AE9(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(InterfaceC1540fG interfaceC1540fG, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, 5);
        interfaceC1540fG.AFf(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(InterfaceC1540fG interfaceC1540fG, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 98);
        interfaceC1540fG.AFh(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        InterfaceC1540fG interfaceC1540fG = this.A01.get();
        if (interfaceC1540fG == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 24));
        if (TextUtils.isEmpty(productUrl)) {
            interfaceC1540fG.A9V();
        } else {
            interfaceC1540fG.A9W(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        InterfaceC1540fG uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 24));
    }

    private void A0K(JSONObject jSONObject) {
        A7 a7 = this.A07.get();
        if (a7 == null) {
            return;
        }
        if (A09[3].length() == 20) {
            throw new RuntimeException();
        }
        A09[3] = "hDImTkFK3KoL7AYoPxXIP";
        String key = jSONObject.optString(A01(43, 11, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE));
        if (TextUtils.isEmpty(key)) {
            return;
        }
        AF handler = new AF(this.A06, a7);
        handler.A05(key, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(A01(18, 11, 49), -1);
        if (iOptInt == -1) {
            return;
        }
        String message = jSONObject.optString(A01(29, 14, 56));
        if (TextUtils.isEmpty(message)) {
            return;
        }
        this.A03.A0F().AAs(iOptInt, message);
        String[] strArr = A09;
        String message2 = strArr[2];
        String str = strArr[6];
        int length = message2.length();
        int code = str.length();
        if (length == code) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "NCNoRnun1G3dlwmqoYaN2uZPLfccAkgr";
        strArr2[0] = "12RLbgldZ9TmNXvaOMkOvzOeimlYTJg9";
    }

    private void A0M(JSONObject jSONObject) {
        InterfaceC1540fG interfaceC1540fG = this.A01.get();
        if (interfaceC1540fG == null) {
            return;
        }
        String strA01 = A01(92, 6, 88);
        String[] strArr = A09;
        if (strArr[2].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "rydiERFHLfFXOcJD9tadKbqyFej0NUPk";
        strArr2[0] = "tiiagSBkZ4Sc0Tn3kexlzzs5G1JfuHdZ";
        String strOptString = jSONObject.optString(strA01);
        if (strOptString == null) {
            return;
        }
        interfaceC1540fG.AFw(strOptString);
    }

    public final void A0N(InterfaceC1540fG interfaceC1540fG) {
        this.A01 = new WeakReference<>(interfaceC1540fG);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        ExecutorC0649Cx.A00(new RunnableC0751Gv(this, str));
    }
}
