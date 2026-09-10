package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2091dJ {
    public static byte[] A08;
    public static String[] A09 = {"wHWy6mJnObE4TdegwzR1XIqaiMp2qzo2", "2kKTv183xGQoCJ4bH8MOQBKEcrYPubr8", "yAnU2m0QEWVpmJNiipOenY", "2CWVvRtjqdC7", "Y1Dj6sRIbzGHXk3FXnyOisKccxY5ExT7", "AAUb4pYdx4XqEM8CotKihUFr9wNvuug2", "KLTFv3N2v474XPM9CBPbC4npqkPjZQN", "uonDorlDhYGoL6YzDZYQroxkAXvFfbHU"};
    public WeakReference<C2084dC> A00;
    public WeakReference<InterfaceC1447Is> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C2300gi A03;
    public final C2071cz A04;
    public final String A05;
    public final String A06;
    public final WeakReference<VA> A07;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-121, -109, -111, -111, -123, -110, -120, -110, -109, -108, -113, -93, -102, -94, 112, AbstractJsonLexerKt.TC_INVALID, 120, 107, -93, -78, -85, -85, -94, -87, -100, -96, -84, -95, -94, -86, -71, -78, -78, -87, -80, -93, -79, -87, -73, -73, -91, -85, -87, -15, 0, -7, -7, -16, -9, -22, -1, 4, -5, -16, -18, -24, -4, -56, -55, -72, -62, -67, -127, 114, -122, -124, 118, 117, 83, -118, 102, -124, 118, -125, -31, -30, -49, -32, -30, -45, -46, -80, -25, -61, -31, -45, -32, -14, -13, -32, -13, -28, -39, -42, -48, -81, -55, -35, -84, -105, -94, -85, -101};
        if (A09[5].charAt(6) == '8') {
            throw new RuntimeException();
        }
        A09[3] = "q8I1zS5uUBp9u7UYsB3eM38aYjAC";
        A08 = bArr;
    }

    static {
        A09();
    }

    public C2091dJ(C2300gi c2300gi, C2084dC c2084dC, VA va, C2071cz c2071cz, String str, String str2) {
        this.A03 = c2300gi;
        this.A00 = new WeakReference<>(c2084dC);
        this.A07 = new WeakReference<>(va);
        this.A04 = c2071cz;
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
        InterfaceC1447Is uxListener = this.A01.get();
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
        InterfaceC1447Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A9k();
    }

    private void A06() {
        InterfaceC1447Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AAm();
    }

    private void A07() {
        this.A03.A0F().A64();
        this.A02 = true;
        InterfaceC1447Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AKD();
        if (C1750Up.A1z(this.A03)) {
            this.A03.A0B().ADb();
        }
    }

    private void A08() {
        InterfaceC1447Is uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.AE0();
    }

    private void A0A(C2084dC c2084dC, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences sharedPreferencesA00 = WN.A00(this.A03);
        String strA01 = A01(57, 5, 77);
        String strA02 = A01(0, 0, 53);
        String storageValue = jSONObject.optString(strA01, strA02);
        String key = jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34));
        String string = sharedPreferencesA00.getString(A01(14, 4, 0) + key, strA02);
        if (string != null) {
            strA02 = string;
        }
        c2084dC.A0g(storageValue, strA02);
    }

    private void A0B(C2084dC c2084dC, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String strA01 = A01(98, 5, 42);
        String strA02 = A01(0, 0, 53);
        String strOptString = jSONObject.optString(strA01, strA02);
        String strOptString2 = jSONObject.optString(A01(57, 5, 77), strA02);
        WN.A00(this.A03).edit().putString(A01(14, 4, 0) + jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34)), strOptString).apply();
        c2084dC.A0f(strOptString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(EnumC2089dH enumC2089dH, String str) throws JSONException {
        switch (enumC2089dH.ordinal()) {
            case 0:
                A0I(new JSONObject(str));
                break;
            case 1:
                A06();
                break;
            case 2:
                A04();
                break;
            case 5:
                A07();
                break;
            case 7:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case 8:
                A0K(new JSONObject(str));
                break;
            case 9:
                A0L(new JSONObject(str));
                break;
            case 10:
                A05();
            case 11:
                this.A03.A0F().A6G(str);
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                A0D(enumC2089dH, str);
                break;
            case 19:
                A0J(new JSONObject(str));
                break;
            case 20:
                A08();
                break;
            case 21:
                A0M(new JSONObject(str));
                break;
        }
        C2084dC c2084dC = this.A00.get();
        if (c2084dC == null) {
        }
        switch (enumC2089dH.ordinal()) {
            case 3:
                c2084dC.A0S();
                break;
            case 4:
                c2084dC.A0R();
                break;
            case 6:
                c2084dC.A0i(A03(new JSONObject(str)));
                break;
            case 17:
                A0B(c2084dC, str);
                break;
            case 18:
                A0A(c2084dC, str);
                break;
        }
    }

    private void A0D(EnumC2089dH enumC2089dH, String str) throws JSONException {
        InterfaceC1447Is interfaceC1447Is = this.A01.get();
        if (interfaceC1447Is == null) {
        }
        switch (enumC2089dH.ordinal()) {
            case 12:
                A0E(interfaceC1447Is, str);
                break;
            case 13:
                interfaceC1447Is.AE4();
                break;
            case 14:
                interfaceC1447Is.AFz();
                break;
            case 15:
                A0G(interfaceC1447Is, str);
                break;
            case 16:
                A0F(interfaceC1447Is, str);
                break;
        }
    }

    private void A0E(InterfaceC1447Is interfaceC1447Is, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, 115);
        interfaceC1447Is.AEu(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(InterfaceC1447Is interfaceC1447Is, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, 5);
        interfaceC1447Is.AGX(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(InterfaceC1447Is interfaceC1447Is, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 98);
        interfaceC1447Is.AGZ(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        InterfaceC1447Is interfaceC1447Is = this.A01.get();
        if (interfaceC1447Is == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 24));
        if (TextUtils.isEmpty(productUrl)) {
            interfaceC1447Is.A9f();
        } else {
            interfaceC1447Is.A9g(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        InterfaceC1447Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 24));
    }

    private void A0K(JSONObject jSONObject) {
        VA va = this.A07.get();
        if (va == null) {
            return;
        }
        if (A09[3].length() == 20) {
            throw new RuntimeException();
        }
        A09[3] = "hDImTkFK3KoL7AYoPxXIP";
        String key = jSONObject.optString(A01(43, 11, 127));
        if (TextUtils.isEmpty(key)) {
            return;
        }
        VI handler = new VI(this.A06, va);
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
        this.A03.A0F().ABA(iOptInt, message);
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
        InterfaceC1447Is interfaceC1447Is = this.A01.get();
        if (interfaceC1447Is == null) {
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
        interfaceC1447Is.AGo(strOptString);
    }

    public final void A0N(InterfaceC1447Is interfaceC1447Is) {
        this.A01 = new WeakReference<>(interfaceC1447Is);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        Y4.A00(new RunnableC2088dG(this, str));
    }
}
