package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;
import org.json.JSONArray;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2266j0 implements WC {
    public static byte[] A0D;
    public static String[] A0E = {"mx9sJqsz4sgJcdPgoYbgRIW9VnwzqRx6", "rFbyGWP2Ub8PQhtH", "vlmOFoI5eqS6Nw0ENJhYNh6o4BRmenqE", "", "JTMxf3amnDxIP84vbXSIdB2jgXN5bQ", "LkG9NIMCA2H26FKF", "xLNm9V1ZNmyFYJ5qhdZubuzSePd6Iimu", "7SoM7bEoo8CKfR8pxc6QG8O9JCd0xBEh"};
    public static final N6 A0F = null;
    public static final WD A0G = null;
    public static final Handler A0H;
    public static final String A0I;
    public N1 A00;
    public N1 A01;
    public C1562Tw A04;
    public WA A05;
    public WD A06;
    public N2 A07;
    public final O7 A08;
    public final VA A09;
    public final N6 A0A;
    public final C2131gi A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public String A02 = null;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{-58, -23, -26, -11, -7, -22, -9, -91, -23, -12, -22, -8, -91, -13, -12, -7, -91, -22, -3, -18, -8, -7, -14, 21, 18, 33, 37, 22, 35, -47, 26, 36, -47, 31, 38, 29, 29, -47, -39, 20, 25, 18, 26, 31, -47, 31, RemoteControlWriter.BLOCK_CMDOK, 37, -47, 29, RemoteControlWriter.BLOCK_CMDOK, 18, 21, 22, 21, -38, -56, -21, -24, -9, -5, -20, -7, -89, -16, -6, -89, -11, -4, -13, -13, -89, -81, -22, -17, -24, -16, -11, -20, -21, -80, -91, -56, -59, -44, -40, -55, -42, -124, -51, -41, -124, -46, -39, -48, -48, -124, -116, -46, -45, -124, -57, -52, -59, -51, -46, -115, 6, 41, 38, 53, 57, 42, 55, -27, 46, 56, -27, 51, 58, 49, 49, -27, 52, 51, -27, 56, 57, 38, 55, 57, 6, 41, -21, 12, -67, 10, 12, 15, 2, -67, -2, 1, -67, 0, -2, 11, 1, 6, 1, -2, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 2, ExecutionDataWriter.BLOCK_SESSIONINFO, -53, -50, -23, -26, -27, -34, -105, -40, -37, -40, -25, -21, -36, -23, -105, -21, -16, -25, -36, -91, Utf8.REPLACEMENT_BYTE, 66, -2, Utf8.REPLACEMENT_BYTE, 74, 80, 67, Utf8.REPLACEMENT_BYTE, 66, 87, -2, 81, 82, Utf8.REPLACEMENT_BYTE, 80, 82, 67, 66, 47, 50, 65, -51, -36, -43, 62, 67, 60, 68, 73, 58, 75, 60, 77, 60, 72, 78, -50, -33, -29, -32, -13, -32, -50, -31, -23, -28, -30, -13, -97, -24, -14, -97, -19, -12, -21, -21, 19, 28, ExecutionDataWriter.BLOCK_EXECUTIONDATA, RemoteControlWriter.BLOCK_CMDOK, 39, 30, 34, 19, 18, 13, 23, 18, 60, 69, 77, RemoteControlWriter.BLOCK_CMDDUMP, 73, 70, 69, 68, 60, 69, 75, -9, RemoteControlWriter.BLOCK_CMDDUMP, 74, -9, 60, 68, 71, 75, 80, 51, 57, 46, RemoteControlWriter.BLOCK_CMDDUMP, 53, 44, 48, 60, 59, 51, 54, 52, 21, 33, 20, RemoteControlWriter.BLOCK_CMDOK, 36, 20, 29, 18, 40, 14, 18, ExecutionDataWriter.BLOCK_SESSIONINFO, 31, 31, 24, 29, 22, -3, 2, 10, -11, 0, -3, -8, -76, 4, 0, -11, -9, -7, 1, -7, 2, 8, -76, -3, 2, -76, 6, -7, 7, 4, 3, 2, 7, -7, 36, 39, 25, 28, 23, 44, 33, 37, 29, 23, 37, 43, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 4, ExecutionDataWriter.BLOCK_SESSIONINFO, 20, 4, 18, 19, -2, 8, 3, 10, 5, -7, -10, 9, -6, -12, 9, -2, 2, -6, 8, 9, -10, 2, 5};
    }

    public abstract void A0P();

    public abstract void A0R(N1 n1, C1562Tw c1562Tw, C1560Tu c1560Tu, O8 o8);

    static {
        A08();
        YD.A02();
        A0I = AbstractC2266j0.class.getSimpleName();
        A0H = new Handler(Looper.getMainLooper());
    }

    public AbstractC2266j0(C2131gi c2131gi, O7 o7) {
        this.A0B = c2131gi;
        this.A08 = o7;
        if (A0G != null) {
            this.A06 = A0G;
        } else {
            this.A06 = new WD(this.A0B);
        }
        this.A06.A0R(this);
        if (A0F != null) {
            this.A0A = A0F;
        } else {
            this.A0A = new N6();
        }
        DynamicLoaderFactory.makeLoader(this.A0B).getInitApi().onAdLoadInvoked(this.A0B);
        this.A09 = c2131gi.A0A();
        this.A0B.A0F().A5e();
    }

    private void A09(C1562Tw c1562Tw) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(this.A0B);
        if (c1562Tw.A0C() != null) {
            sharedPreferences.edit().putString(A07(262, 12, 110), c1562Tw.A0C()).putLong(A07(342, 16, 54), System.currentTimeMillis()).apply();
            return;
        }
        sharedPreferences.edit().clear().apply();
    }

    private void A0A(C1562Tw c1562Tw) {
        this.A0B.A0F().AJS(c1562Tw.A0H());
    }

    private void A0B(RG rg) {
        C1562Tw placement = rg.A00();
        if (placement == null || placement.A05() == null) {
            String strA07 = A07(291, 29, 53);
            C1603Vm error = new C1603Vm(AdErrorType.NO_AD_PLACEMENT, strA07);
            this.A0B.A0F().A5g(error.A03().getErrorCode(), strA07);
            if (this.A07 != null) {
                this.A07.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        C1562Tw c1562Tw = this.A04;
        JSONObject jSONObjectA0E = c1562Tw.A0E();
        String strA08 = A07(Opcodes.MONITOREXIT, 3, 13);
        if (jSONObjectA0E == null) {
            C1560Tu c1560TuA04 = c1562Tw.A04();
            if (!A0F(c1562Tw, c1560TuA04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A08().ABC(strA08, AbstractC1543Td.A0a, new C1544Te(A07(81, 26, 5), c1560TuA04.A02()));
                ADp(C1603Vm.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            A0R(this.A00, c1562Tw, c1560TuA04, new O8(c1560TuA04.A04(), c1562Tw.A05(), this.A08.A0A, c1562Tw.A05().A0C()));
        } else {
            ArrayList arrayList = new ArrayList();
            C1560Tu c1560TuA05 = c1562Tw.A04();
            do {
                if (arrayList.isEmpty()) {
                    if (A0F(c1562Tw, c1560TuA05)) {
                        arrayList.add(c1560TuA05);
                    } else {
                        return;
                    }
                } else if (A0E(c1560TuA05)) {
                    arrayList.add(c1560TuA05);
                }
                c1560TuA05 = c1562Tw.A04();
            } while (c1560TuA05 != null);
            N1 n1 = this.A00;
            String[] strArr = A0E;
            if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
                throw new RuntimeException();
            }
            A0E[2] = "ioxWOihgwDfBac41kTr6w1CF9LpRHapv";
            if (n1 == null) {
                this.A0B.A08().ABC(strA08, AbstractC1543Td.A0a, new C1544Te(A07(56, 25, 40), ((C1560Tu) arrayList.get(0)).A02()));
                ADp(C1603Vm.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            boolean z = false;
            try {
                if (arrayList.size() > 1 && this.A00 != null && this.A00.AKL()) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((C1560Tu) it.next()).A04());
                    }
                    jSONObject.put(A07(192, 3, 111), jSONArray);
                    jSONObject.put(A07(Opcodes.IFNULL, 12, 124), c1562Tw.A0E());
                    A0R(this.A00, c1562Tw, c1560TuA05, new O8(jSONObject, c1562Tw.A05(), this.A08.A0A, c1562Tw.A05().A0C()));
                    z = true;
                }
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                if (arrayList.isEmpty()) {
                    C1603Vm c1603VmA01 = C1603Vm.A01(AdErrorType.NO_FILL, A07(0, 0, 103));
                    this.A0B.A0F().A5g(c1603VmA01.A03().getErrorCode(), A07(133, 22, 62));
                    if (this.A07 != null) {
                        this.A07.A0G(c1603VmA01);
                        return;
                    }
                    return;
                }
                if (this.A00 == null) {
                    this.A0B.A08().ABC(strA08, AbstractC1543Td.A0a, new C1544Te(A07(22, 34, 82), ((C1560Tu) arrayList.get(0)).A02()));
                    ADp(C1603Vm.A00(AdErrorType.INTERNAL_ERROR));
                    return;
                }
                C1560Tu c1560Tu = (C1560Tu) arrayList.get(0);
                A0R(this.A00, c1562Tw, c1560Tu, new O8(c1560Tu.A04(), c1562Tw.A05(), this.A08.A0A, c1562Tw.A05().A0C()));
            }
        }
        A09(placement);
        A0A(placement);
    }

    private final void A0C(String str, AdExperienceType adExperienceType) {
        this.A0B.A0F().A5h(str != null);
        this.A03 = System.currentTimeMillis();
        try {
            C1610Vu bidPayload = new C1610Vu(this.A0B, str, this.A08.A0A, this.A08.A09);
            this.A05 = this.A08.A00(this.A0B, bidPayload, adExperienceType);
            if (this.A06 != null) {
                this.A06.A0Q(this.A05);
            }
        } catch (C1604Vn e) {
            ADp(C1603Vm.A02(e));
        }
    }

    private void A0D(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A07(230, 12, 79));
            N8.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0E(C1560Tu c1560Tu) {
        return (c1560Tu == null || c1560Tu.A04() == null) ? false : true;
    }

    private boolean A0F(C1562Tw c1562Tw, C1560Tu c1560Tu) {
        String strA07 = A07(0, 0, 103);
        if (c1560Tu == null) {
            C1603Vm c1603VmA01 = C1603Vm.A01(AdErrorType.NO_FILL, strA07);
            this.A0B.A0F().A5g(c1603VmA01.A03().getErrorCode(), A07(133, 22, 62));
            if (this.A07 != null) {
                this.A07.A0G(c1603VmA01);
            }
            return false;
        }
        String strA02 = c1560Tu.A02();
        N1 n1A00 = this.A0A.A00(this.A0B, c1562Tw.A05().A0D());
        if (n1A00 == null) {
            this.A0B.A08().ABC(A07(Opcodes.MONITOREXIT, 3, 13), AbstractC1543Td.A0a, new C1544Te(A07(0, 22, 38), strA02));
            ADp(C1603Vm.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        }
        if (!this.A08.A01().contains(n1A00.A8k())) {
            C1603Vm c1603VmA02 = C1603Vm.A01(AdErrorType.INTERNAL_ERROR, strA07);
            this.A0B.A0F().A5g(c1603VmA02.A03().getErrorCode(), A07(155, 19, 24));
            if (this.A07 != null) {
                N2 n2 = this.A07;
                if (A0E[0].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[7] = "XDVsCbJ3K5v8dlUMGtS0uKtjThdAM1fs";
                strArr[6] = "AXbWkB0jI9efrJtSTWvCCcVR8Wd1ee9G";
                n2.A0G(c1603VmA02);
            }
            return false;
        }
        this.A00 = n1A00;
        JSONObject jSONObjectA04 = c1560Tu.A04();
        if (jSONObjectA04 != null) {
            String strOptString = jSONObjectA04.optString(A07(332, 10, 64));
            this.A0B.A0F().AJk(strOptString);
            this.A0B.A0D(strOptString);
            C2127ge c2127geA00 = T7.A00();
            if (c2127geA00 != null) {
                c2127geA00.A0D(strOptString);
            }
            JSONObject dataObject = jSONObjectA04.optJSONObject(A07(274, 17, 80));
            A0D(dataObject);
            if (this.A05 == null) {
                String strA08 = A07(242, 20, 120);
                C1603Vm c1603VmA03 = C1603Vm.A01(AdErrorType.UNKNOWN_ERROR, strA08);
                this.A0B.A0F().A5g(c1603VmA03.A03().getErrorCode(), strA08);
                if (this.A07 != null) {
                    this.A07.A0G(c1603VmA03);
                }
                return false;
            }
            return true;
        }
        String strA09 = A07(Sdk$SDKError.Reason.PLACEMENT_SLEEP_VALUE, 18, 32);
        C1603Vm c1603VmA04 = C1603Vm.A01(AdErrorType.UNKNOWN_ERROR, strA09);
        this.A0B.A0F().A5g(c1603VmA04.A03().getErrorCode(), strA09);
        if (this.A07 != null) {
            this.A07.A0G(c1603VmA04);
        }
        return false;
    }

    public final long A0G() {
        if (this.A04 != null) {
            return this.A04.A03();
        }
        String[] strArr = A0E;
        if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        A0E[2] = "cOTrI9DB0oxjTyLR1voyMrEgWVbVphTL";
        return -1L;
    }

    public final Handler A0H() {
        return A0H;
    }

    public NQ A0I() {
        if (this.A01 != null) {
            N1 n1 = this.A01;
            if (A0E[2].charAt(15) == 'D') {
                return ((AbstractC2300jh) n1).A0I();
            }
            A0E[0] = "oRXWb94touLPnP0lmqQIoCQNN81QkmVq";
            return ((AbstractC2300jh) n1).A0I();
        }
        String[] strArr = A0E;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[7] = "c4mFc8cvcfHQyghvzrB7bYP2aMdrhGND";
        strArr2[6] = "OOjdStzIF6ducmayoMT1WxOsFGdjLtMG";
        return null;
    }

    public final C1563Tx A0J() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A05();
    }

    public final void A0K() {
        if (!C1581Up.A1v(this.A0B)) {
            return;
        }
        N1 n1 = this.A01;
        String[] strArr = A0E;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "";
        strArr2[4] = "YS2d1pFjROLoYd3yH38ADYRoaACmCS";
        if (n1 != null) {
            C1627Wl.A00(this.A0B).A0D(this.A01.A8k().toString(), this.A01.A7O());
        }
        if (this.A06 != null) {
            this.A06.A0R(null);
            this.A06 = null;
        }
        this.A07 = null;
        this.A00 = null;
        this.A01 = null;
    }

    public final void A0L() {
        String strA7O;
        this.A0B.A0F().A3R(Y1.A01(this.A03));
        if (this.A01 == null || (strA7O = this.A01.A7O()) == null) {
            return;
        }
        HashMap map = new HashMap();
        String strA05 = Y1.A05(this.A03);
        String clientToken = A07(320, 12, 89);
        map.put(clientToken, strA05);
        new VI(strA7O, this.A09).A04(VH.A08, map);
    }

    public final void A0M() {
        N1 n1 = this.A01;
        String strA07 = A07(Opcodes.MONITOREXIT, 3, 13);
        if (n1 == null) {
            String strA08 = A07(107, 26, 102);
            this.A0B.A08().ABC(strA07, AbstractC1543Td.A0Q, new C1544Te(strA08));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0F().A5g(adErrorType.getErrorCode(), strA08);
            if (this.A07 != null) {
                N2 n2 = this.A07;
                String errorMessage = adErrorType.getDefaultErrorMessage();
                n2.A0G(C1603Vm.A01(adErrorType, errorMessage));
            }
            this.A0B.A0F().A5j();
            return;
        }
        if (this.A0C) {
            String strA09 = A07(Opcodes.FRETURN, 18, 127);
            this.A0B.A08().ABC(strA07, AbstractC1543Td.A0M, new C1544Te(strA09));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0F().A5g(adErrorType2.getErrorCode(), strA09);
            if (this.A07 != null) {
                N2 n3 = this.A07;
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                n3.A0G(C1603Vm.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0F().A5i();
            return;
        }
        if (!TextUtils.isEmpty(this.A01.A7O())) {
            this.A09.AC0(this.A01.A7O());
        }
        this.A0B.A0F().A5k();
        this.A0C = true;
        A0P();
    }

    public final void A0N() {
        A0Y(false);
    }

    public final void A0O() {
        if (this.A02 != null) {
            N8.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0Q(N1 n1) {
        if (n1 != null) {
            n1.onDestroy();
        }
    }

    public final void A0S(N2 n2) {
        this.A07 = n2;
    }

    public final void A0T(O8 o8) {
        A0V(o8.A03().optString(A07(Sdk$SDKError.Reason.AD_NOT_LOADED_VALUE, 2, 12)));
    }

    public void A0U(String str) {
        A0C(str, null);
    }

    public final void A0V(String str) {
        this.A0B.A0F().A5d();
        if (!TextUtils.isEmpty(str)) {
            new VI(str, this.A09).A04(VH.A04, null);
        }
    }

    public final void A0W(String str) {
        A0U(str);
    }

    public final void A0X(String str, AdExperienceType adExperienceType) {
        A0C(str, adExperienceType);
    }

    public void A0Y(boolean z) {
        if (!z && !this.A0C) {
            return;
        }
        this.A0B.A0F().A5l();
        A0Q(this.A01);
        this.A0C = false;
    }

    public final boolean A0Z() {
        return this.A04 == null || this.A04.A0I();
    }

    @Override // com.facebook.ads.redexgen.core.WC
    public final synchronized void ADp(C1603Vm c1603Vm) {
        A0H().post(new C2267j1(this, c1603Vm));
    }

    @Override // com.facebook.ads.redexgen.core.WC
    public final synchronized void AG7(RG rg) {
        try {
            A0B(rg);
        } catch (Exception e) {
            this.A0B.A08().ABC(A07(Opcodes.MONITOREXIT, 3, 13), AbstractC1543Td.A0T, new C1544Te(e));
        }
    }
}
