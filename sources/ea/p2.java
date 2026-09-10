package ea;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.ads.hy1;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.v4;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import com.ironsource.Xa;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p2 extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m2 f39685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public eb.d0 f39686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f39687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f39689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f39690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f39691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d2 f39693k;
    public d2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PriorityQueue f39694m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y1 f39695n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicLong f39696o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f39697p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l1 f39698q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f39699r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d2 f39700s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o2 f39701t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d2 f39702u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s4.i f39703v;

    public p2(m1 m1Var) {
        super(m1Var);
        this.f39687e = new CopyOnWriteArraySet();
        this.f39690h = new Object();
        this.f39691i = false;
        this.f39692j = 1;
        this.f39699r = true;
        this.f39703v = new s4.i(this);
        this.f39689g = new AtomicReference();
        this.f39695n = y1.f39925c;
        this.f39697p = -1L;
        this.f39696o = new AtomicLong(0L);
        this.f39698q = new l1(m1Var);
    }

    @Override // ea.f0
    public final boolean J0() {
        return false;
    }

    public final void K0(String str, Bundle bundle, String str2) {
        long jElapsedRealtime;
        m1 m1Var = (m1) this.f3623a;
        m1Var.f39592k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (m1Var.f39585d.R0(null, d0.f39301e1)) {
            m1Var.f39592k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        L0(str, str2, bundle, true, true, jCurrentTimeMillis, jElapsedRealtime);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r3 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (r5 > 500) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L0(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.p2.L0(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long, long):void");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0268  */
    /* JADX WARN: Code duplicated, block: B:102:0x026d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0307  */
    /* JADX WARN: Code duplicated, block: B:107:0x031f  */
    /* JADX WARN: Code duplicated, block: B:110:0x033b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0356  */
    /* JADX WARN: Code duplicated, block: B:115:0x0375  */
    /* JADX WARN: Code duplicated, block: B:117:0x0387  */
    /* JADX WARN: Code duplicated, block: B:120:0x0392  */
    /* JADX WARN: Code duplicated, block: B:121:0x0395  */
    /* JADX WARN: Code duplicated, block: B:125:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:126:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:128:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:137:0x0437  */
    /* JADX WARN: Code duplicated, block: B:139:0x0457  */
    /* JADX WARN: Code duplicated, block: B:140:0x046a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0483  */
    /* JADX WARN: Code duplicated, block: B:158:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:162:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:166:0x04fd A[Catch: NumberFormatException -> 0x0502, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0502, blocks: (B:164:0x04f1, B:166:0x04fd), top: B:196:0x04f1 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0502  */
    /* JADX WARN: Code duplicated, block: B:174:0x051f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0536  */
    /* JADX WARN: Code duplicated, block: B:183:0x0545  */
    /* JADX WARN: Code duplicated, block: B:185:0x054a  */
    /* JADX WARN: Code duplicated, block: B:188:0x0558  */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0201  */
    /* JADX WARN: Code duplicated, block: B:82:0x0204  */
    /* JADX WARN: Code duplicated, block: B:85:0x021b  */
    /* JADX WARN: Code duplicated, block: B:86:0x021e  */
    /* JADX WARN: Code duplicated, block: B:89:0x022c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0231  */
    /* JADX WARN: Code duplicated, block: B:93:0x0240  */
    /* JADX WARN: Code duplicated, block: B:94:0x0245  */
    /* JADX WARN: Code duplicated, block: B:97:0x0254  */
    /* JADX WARN: Code duplicated, block: B:98:0x0259  */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x03ef, please report this as an issue */
    public final void M0() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        b2.p pVarD;
        oa.e2 it;
        com.google.android.gms.internal.measurement.h0 h0Var;
        m1 m1Var;
        boolean z10;
        q3 q3Var;
        com.google.android.gms.internal.measurement.h0 h0Var2;
        com.google.android.gms.internal.measurement.h0 h0Var3;
        com.google.android.gms.internal.measurement.h0 h0Var4;
        com.google.android.gms.internal.measurement.h0 h0Var5;
        Object obj;
        boolean z11;
        Object obj2;
        boolean z12;
        Object obj3;
        Object obj4;
        Object obj5;
        int iZza;
        int iZza2;
        int iZza3;
        int iZza4;
        int i15;
        String str;
        String str2;
        int i16;
        String str3;
        int i17;
        String str4;
        String str5;
        String str6;
        oa.s1 s1VarC;
        String string;
        HashMap map;
        int i18;
        int i19;
        q3 q3Var2;
        String[] strArrSplit;
        String string2;
        String strA;
        Bundle bundleB;
        p2 p2Var;
        HashMap map2;
        String str7;
        Bundle bundleB2;
        Bundle bundleB3;
        String str8;
        HashMap map3;
        String str9;
        StringBuilder sb2;
        int i20;
        int iC;
        int i21;
        boolean zEquals;
        int i22;
        String str10;
        com.google.android.gms.internal.measurement.h0 h0Var6;
        G0();
        m1 m1Var2 = (m1) this.f3623a;
        s0 s0Var = m1Var2.f39587f;
        s0 s0Var2 = m1Var2.f39587f;
        m1.h(s0Var);
        s0Var.f39759m.b("Handle tcf update.");
        a1 a1Var = m1Var2.f39586e;
        m1.f(a1Var);
        SharedPreferences sharedPreferencesL0 = a1Var.L0();
        oa.n1 n1Var = s3.f39764a;
        com.google.android.gms.internal.measurement.g0 g0Var = com.google.android.gms.internal.measurement.g0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        r3 r3Var = r3.f39745a;
        com.google.android.gms.internal.measurement.g0 g0Var2 = com.google.android.gms.internal.measurement.g0.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
        r3 r3Var2 = r3.f39746b;
        com.google.android.gms.internal.measurement.g0 g0Var3 = com.google.android.gms.internal.measurement.g0.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.g0 g0Var4 = com.google.android.gms.internal.measurement.g0.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.g0 g0Var5 = com.google.android.gms.internal.measurement.g0.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        oa.s1 s1VarJ = oa.s1.j(7, new Object[]{g0Var, r3Var, g0Var2, r3Var2, g0Var3, r3Var, g0Var4, r3Var, g0Var5, r3Var2, com.google.android.gms.internal.measurement.g0.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, r3Var2, com.google.android.gms.internal.measurement.g0.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, r3Var2}, null);
        int i23 = oa.u0.f47325c;
        oa.b2 b2Var = new oa.b2("CH");
        char[] cArr = new char[5];
        boolean zContains = sharedPreferencesL0.contains(AndroidTcfDataSource.TCF_TCSTRING_KEY);
        try {
            i10 = sharedPreferencesL0.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused) {
            i10 = -1;
        }
        try {
            i11 = sharedPreferencesL0.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused2) {
            i11 = -1;
        }
        try {
            i12 = sharedPreferencesL0.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused3) {
            i12 = -1;
        }
        try {
            try {
                i13 = sharedPreferencesL0.getInt("IABTCF_PurposeOneTreatment", -1);
                while (true) {
                    boolean zHasNext = it.hasNext();
                    h0Var = com.google.android.gms.internal.measurement.h0.PURPOSE_RESTRICTION_UNDEFINED;
                    if (!zHasNext) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.g0 g0Var6 = (com.google.android.gms.internal.measurement.g0) it.next();
                    boolean z13 = zContains;
                    int iZza5 = g0Var6.zza();
                    int i24 = i10;
                    oa.b2 b2Var2 = b2Var;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZza5).length() + 28);
                    sb3.append("IABTCF_PublisherRestrictions");
                    sb3.append(iZza5);
                    String strA2 = s3.a(sharedPreferencesL0, sb3.toString());
                    if (TextUtils.isEmpty(strA2) || strA2.length() < 755) {
                        h0Var6 = h0Var;
                    } else {
                        int iDigit = Character.digit(strA2.charAt(754), 10);
                        h0Var6 = com.google.android.gms.internal.measurement.h0.PURPOSE_RESTRICTION_NOT_ALLOWED;
                        if (iDigit >= 0 && iDigit <= com.google.android.gms.internal.measurement.h0.values().length && iDigit != 0) {
                            if (iDigit == 1) {
                                h0Var = com.google.android.gms.internal.measurement.h0.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                            } else if (iDigit == 2) {
                                h0Var = com.google.android.gms.internal.measurement.h0.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                            }
                            h0Var6 = h0Var;
                        }
                    }
                    pVarD.l(g0Var6, h0Var6);
                    zContains = z13;
                    i10 = i24;
                    b2Var = b2Var2;
                }
            } catch (ClassCastException unused4) {
                i13 = -1;
            }
            i14 = sharedPreferencesL0.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused5) {
            i14 = -1;
        }
        int i25 = i11;
        String strA3 = s3.a(sharedPreferencesL0, "IABTCF_PublisherCC");
        pVarD = oa.o0.d();
        it = s1VarJ.keySet().iterator();
        boolean z14 = zContains;
        int i26 = i10;
        oa.b2 b2Var3 = b2Var;
        oa.s1 s1VarC2 = pVarD.c(true);
        String strA4 = s3.a(sharedPreferencesL0, "IABTCF_PurposeConsents");
        String strA5 = s3.a(sharedPreferencesL0, "IABTCF_VendorConsents");
        boolean z15 = !TextUtils.isEmpty(strA5) && strA5.length() >= 755 && strA5.charAt(754) == '1';
        String strA6 = s3.a(sharedPreferencesL0, "IABTCF_PurposeLegitimateInterests");
        String strA7 = s3.a(sharedPreferencesL0, "IABTCF_VendorLegitimateInterests");
        if (!TextUtils.isEmpty(strA7)) {
            m1Var = m1Var2;
            if (strA7.length() >= 755 && strA7.charAt(754) == '1') {
                z10 = true;
            }
            cArr[0] = '2';
            if (z14) {
                h0Var2 = (com.google.android.gms.internal.measurement.h0) s1VarC2.get(g0Var);
                h0Var3 = (com.google.android.gms.internal.measurement.h0) s1VarC2.get(g0Var3);
                h0Var4 = (com.google.android.gms.internal.measurement.h0) s1VarC2.get(g0Var4);
                h0Var5 = (com.google.android.gms.internal.measurement.h0) s1VarC2.get(g0Var5);
                b2.p pVarD2 = oa.o0.d();
                pVarD2.l("Version", "2");
                if (true != z15) {
                    obj = "0";
                } else {
                    obj = "1";
                }
                z11 = z15;
                pVarD2.l("VendorConsent", obj);
                if (true != z10) {
                    obj2 = "0";
                } else {
                    obj2 = "1";
                }
                z12 = z10;
                pVarD2.l("VendorLegitimateInterest", obj2);
                if (i12 != 1) {
                    obj3 = "0";
                } else {
                    obj3 = "1";
                }
                pVarD2.l("gdprApplies", obj3);
                if (i14 != 1) {
                    obj4 = "0";
                } else {
                    obj4 = "1";
                }
                pVarD2.l("EnableAdvertiserConsentMode", obj4);
                pVarD2.l("PolicyVersion", String.valueOf(i25));
                pVarD2.l("CmpSdkID", String.valueOf(i26));
                if (i13 != 1) {
                    obj5 = "0";
                } else {
                    obj5 = "1";
                }
                pVarD2.l("PurposeOneTreatment", obj5);
                pVarD2.l("PublisherCC", strA3);
                if (h0Var2 != null) {
                    iZza = h0Var2.zza();
                } else {
                    iZza = h0Var.zza();
                }
                pVarD2.l("PublisherRestrictions1", String.valueOf(iZza));
                if (h0Var3 != null) {
                    iZza2 = h0Var3.zza();
                } else {
                    iZza2 = h0Var.zza();
                }
                pVarD2.l("PublisherRestrictions3", String.valueOf(iZza2));
                if (h0Var4 != null) {
                    iZza3 = h0Var4.zza();
                } else {
                    iZza3 = h0Var.zza();
                }
                pVarD2.l("PublisherRestrictions4", String.valueOf(iZza3));
                if (h0Var5 != null) {
                    iZza4 = h0Var5.zza();
                } else {
                    iZza4 = h0Var.zza();
                }
                pVarD2.l("PublisherRestrictions7", String.valueOf(iZza4));
                String strD = s3.d(g0Var, strA4, strA6);
                i15 = i12;
                String strD2 = s3.d(g0Var3, strA4, strA6);
                String strD3 = s3.d(g0Var4, strA4, strA6);
                String strD4 = s3.d(g0Var5, strA4, strA6);
                oa.q.c("Purpose1", strD);
                oa.q.c("Purpose3", strD2);
                oa.q.c("Purpose4", strD3);
                oa.q.c("Purpose7", strD4);
                pVarD2.m(oa.s1.j(4, new Object[]{"Purpose1", strD, "Purpose3", strD2, "Purpose4", strD3, "Purpose7", strD4}, null).entrySet());
                str = "0";
                str2 = "1";
                i16 = i13;
                if (true != s3.b(g0Var, s1VarJ, s1VarC2, b2Var3, cArr, i14, i15, i16, strA3, strA4, strA6, z11, z12)) {
                    str3 = str;
                } else {
                    str3 = str2;
                }
                i17 = i14;
                if (true != s3.b(g0Var3, s1VarJ, s1VarC2, b2Var3, cArr, i17, i15, i16, strA3, strA4, strA6, z11, z12)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                if (true != s3.b(g0Var4, s1VarJ, s1VarC2, b2Var3, cArr, i17, i15, i16, strA3, strA4, strA6, z11, z12)) {
                    str5 = str;
                } else {
                    str5 = str2;
                }
                if (true != s3.b(g0Var5, s1VarJ, s1VarC2, b2Var3, cArr, i17, i15, i16, strA3, strA4, strA6, z11, z12)) {
                    str6 = str;
                } else {
                    str6 = str2;
                }
                pVarD2.m(oa.s1.j(5, new Object[]{"AuthorizePurpose1", str3, "AuthorizePurpose3", str4, "AuthorizePurpose4", str5, "AuthorizePurpose7", str6, "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                s1VarC = pVarD2.c(true);
            } else {
                s1VarC = oa.s1.f47307g;
                str2 = "1";
                str = "0";
            }
            q3Var = new q3(s1VarC);
            m1.h(s0Var2);
            s0Var2.f39760n.c(q3Var, "Tcf preferences read");
            a1Var.G0();
            string = a1Var.K0().getString("stored_tcf_param", "");
            map = new HashMap();
            if (TextUtils.isEmpty(string)) {
                q3Var2 = new q3(map);
                i19 = 2;
            } else {
                for (String str11 : string.split(";")) {
                    strArrSplit = str11.split(X3.j.f27830b);
                    if (strArrSplit.length < 2 && s3.f39764a.contains(strArrSplit[0])) {
                        map.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
                i19 = 2;
                q3Var2 = new q3(map);
            }
            a1Var.G0();
            string2 = a1Var.K0().getString("stored_tcf_param", "");
            strA = q3Var.a();
            if (strA.equals(string2)) {
            }
            SharedPreferences.Editor editorEdit = a1Var.K0().edit();
            editorEdit.putString("stored_tcf_param", strA);
            editorEdit.apply();
            bundleB = q3Var.b();
            m1.h(s0Var2);
            s0Var2.f39760n.c(bundleB, "Consent generated from Tcf");
            if (bundleB != Bundle.EMPTY) {
                m1Var.f39592k.getClass();
                p2Var = this;
                p2Var.a1(bundleB, -30, System.currentTimeMillis());
            } else {
                p2Var = this;
            }
            Bundle bundle = new Bundle();
            map2 = q3Var2.f39728a;
            if (map2.isEmpty() && ((String) map2.get("Version")) == null) {
                str7 = str2;
            } else {
                str7 = str;
            }
            bundleB2 = q3Var.b();
            bundleB3 = q3Var2.b();
            if (bundleB2.size() != bundleB3.size() && Objects.equals(bundleB2.getString("ad_storage"), bundleB3.getString("ad_storage")) && Objects.equals(bundleB2.getString("ad_personalization"), bundleB3.getString("ad_personalization")) && Objects.equals(bundleB2.getString("ad_user_data"), bundleB3.getString("ad_user_data"))) {
                str8 = str;
            } else {
                str8 = str2;
            }
            bundle.putString("_tcfm", str7.concat(str8));
            map3 = q3Var.f39728a;
            str9 = (String) map3.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str9)) {
                str9 = "200000";
            }
            bundle.putString("_tcfd2", str9);
            sb2 = new StringBuilder(str2);
            try {
                str10 = (String) map3.get("CmpSdkID");
                if (TextUtils.isEmpty(str10)) {
                    i20 = -1;
                } else {
                    i20 = Integer.parseInt(str10);
                }
            } catch (NumberFormatException unused6) {
            }
            if (i20 >= 0 || i20 > 4095) {
                sb2.append("00");
            } else {
                sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i20 >> 6));
                sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i20 & 63));
            }
            iC = q3Var.c();
            if (iC >= 0 || iC > 63) {
                sb2.append(str);
            } else {
                sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iC));
            }
            if (true != str2.equals(map3.get("gdprApplies"))) {
                i21 = 0;
            } else {
                i21 = i19;
            }
            zEquals = str2.equals(map3.get("EnableAdvertiserConsentMode"));
            i22 = i21 | 4;
            if (zEquals) {
                i22 = i21 | 12;
            }
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i22));
            bundle.putString("_tcfd", sb2.toString());
            p2Var.N0("auto", bundle, "_tcf");
        }
        m1Var = m1Var2;
        z10 = false;
        cArr[0] = '2';
        if (z14) {
            s1VarC = oa.s1.f47307g;
            str2 = "1";
            str = "0";
        } else {
            h0Var2 = (com.google.android.gms.internal.measurement.h0) s1VarC2.get(g0Var);
            h0Var3 = (com.google.android.gms.internal.measurement.h0) s1VarC2.get(g0Var3);
            h0Var4 = (com.google.android.gms.internal.measurement.h0) s1VarC2.get(g0Var4);
            h0Var5 = (com.google.android.gms.internal.measurement.h0) s1VarC2.get(g0Var5);
            b2.p pVarD3 = oa.o0.d();
            pVarD3.l("Version", "2");
            if (true != z15) {
                obj = "0";
            } else {
                obj = "1";
            }
            z11 = z15;
            pVarD3.l("VendorConsent", obj);
            if (true != z10) {
                obj2 = "0";
            } else {
                obj2 = "1";
            }
            z12 = z10;
            pVarD3.l("VendorLegitimateInterest", obj2);
            if (i12 != 1) {
                obj3 = "0";
            } else {
                obj3 = "1";
            }
            pVarD3.l("gdprApplies", obj3);
            if (i14 != 1) {
                obj4 = "0";
            } else {
                obj4 = "1";
            }
            pVarD3.l("EnableAdvertiserConsentMode", obj4);
            pVarD3.l("PolicyVersion", String.valueOf(i25));
            pVarD3.l("CmpSdkID", String.valueOf(i26));
            if (i13 != 1) {
                obj5 = "0";
            } else {
                obj5 = "1";
            }
            pVarD3.l("PurposeOneTreatment", obj5);
            pVarD3.l("PublisherCC", strA3);
            if (h0Var2 != null) {
                iZza = h0Var2.zza();
            } else {
                iZza = h0Var.zza();
            }
            pVarD3.l("PublisherRestrictions1", String.valueOf(iZza));
            if (h0Var3 != null) {
                iZza2 = h0Var3.zza();
            } else {
                iZza2 = h0Var.zza();
            }
            pVarD3.l("PublisherRestrictions3", String.valueOf(iZza2));
            if (h0Var4 != null) {
                iZza3 = h0Var4.zza();
            } else {
                iZza3 = h0Var.zza();
            }
            pVarD3.l("PublisherRestrictions4", String.valueOf(iZza3));
            if (h0Var5 != null) {
                iZza4 = h0Var5.zza();
            } else {
                iZza4 = h0Var.zza();
            }
            pVarD3.l("PublisherRestrictions7", String.valueOf(iZza4));
            String strD5 = s3.d(g0Var, strA4, strA6);
            i15 = i12;
            String strD6 = s3.d(g0Var3, strA4, strA6);
            String strD7 = s3.d(g0Var4, strA4, strA6);
            String strD8 = s3.d(g0Var5, strA4, strA6);
            oa.q.c("Purpose1", strD5);
            oa.q.c("Purpose3", strD6);
            oa.q.c("Purpose4", strD7);
            oa.q.c("Purpose7", strD8);
            pVarD3.m(oa.s1.j(4, new Object[]{"Purpose1", strD5, "Purpose3", strD6, "Purpose4", strD7, "Purpose7", strD8}, null).entrySet());
            str = "0";
            str2 = "1";
            i16 = i13;
            if (true != s3.b(g0Var, s1VarJ, s1VarC2, b2Var3, cArr, i14, i15, i16, strA3, strA4, strA6, z11, z12)) {
                str3 = str;
            } else {
                str3 = str2;
            }
            i17 = i14;
            if (true != s3.b(g0Var3, s1VarJ, s1VarC2, b2Var3, cArr, i17, i15, i16, strA3, strA4, strA6, z11, z12)) {
                str4 = str;
            } else {
                str4 = str2;
            }
            if (true != s3.b(g0Var4, s1VarJ, s1VarC2, b2Var3, cArr, i17, i15, i16, strA3, strA4, strA6, z11, z12)) {
                str5 = str;
            } else {
                str5 = str2;
            }
            if (true != s3.b(g0Var5, s1VarJ, s1VarC2, b2Var3, cArr, i17, i15, i16, strA3, strA4, strA6, z11, z12)) {
                str6 = str;
            } else {
                str6 = str2;
            }
            pVarD3.m(oa.s1.j(5, new Object[]{"AuthorizePurpose1", str3, "AuthorizePurpose3", str4, "AuthorizePurpose4", str5, "AuthorizePurpose7", str6, "PurposeDiagnostics", new String(cArr)}, null).entrySet());
            s1VarC = pVarD3.c(true);
        }
        q3Var = new q3(s1VarC);
        m1.h(s0Var2);
        s0Var2.f39760n.c(q3Var, "Tcf preferences read");
        a1Var.G0();
        string = a1Var.K0().getString("stored_tcf_param", "");
        map = new HashMap();
        if (TextUtils.isEmpty(string)) {
            q3Var2 = new q3(map);
            i19 = 2;
        } else {
            while (i18 < r10) {
                strArrSplit = str11.split(X3.j.f27830b);
                if (strArrSplit.length < 2) {
                }
            }
            i19 = 2;
            q3Var2 = new q3(map);
        }
        a1Var.G0();
        string2 = a1Var.K0().getString("stored_tcf_param", "");
        strA = q3Var.a();
        if (strA.equals(string2)) {
            SharedPreferences.Editor editorEdit2 = a1Var.K0().edit();
            editorEdit2.putString("stored_tcf_param", strA);
            editorEdit2.apply();
            bundleB = q3Var.b();
            m1.h(s0Var2);
            s0Var2.f39760n.c(bundleB, "Consent generated from Tcf");
            if (bundleB != Bundle.EMPTY) {
                m1Var.f39592k.getClass();
                p2Var = this;
                p2Var.a1(bundleB, -30, System.currentTimeMillis());
            } else {
                p2Var = this;
            }
            Bundle bundle2 = new Bundle();
            map2 = q3Var2.f39728a;
            if (map2.isEmpty()) {
                str7 = str;
            } else {
                str7 = str;
            }
            bundleB2 = q3Var.b();
            bundleB3 = q3Var2.b();
            if (bundleB2.size() != bundleB3.size()) {
                str8 = str2;
            } else {
                str8 = str;
            }
            bundle2.putString("_tcfm", str7.concat(str8));
            map3 = q3Var.f39728a;
            str9 = (String) map3.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str9)) {
                str9 = "200000";
            }
            bundle2.putString("_tcfd2", str9);
            sb2 = new StringBuilder(str2);
            str10 = (String) map3.get("CmpSdkID");
            if (TextUtils.isEmpty(str10)) {
                i20 = Integer.parseInt(str10);
            } else {
                i20 = -1;
            }
            if (i20 >= 0) {
                sb2.append("00");
            } else {
                sb2.append("00");
            }
            iC = q3Var.c();
            if (iC >= 0) {
                sb2.append(str);
            } else {
                sb2.append(str);
            }
            if (true != str2.equals(map3.get("gdprApplies"))) {
                i21 = 0;
            } else {
                i21 = i19;
            }
            zEquals = str2.equals(map3.get("EnableAdvertiserConsentMode"));
            i22 = i21 | 4;
            if (zEquals) {
                i22 = i21 | 12;
            }
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i22));
            bundle2.putString("_tcfd", sb2.toString());
            p2Var.N0("auto", bundle2, "_tcf");
        }
    }

    public final void N0(String str, Bundle bundle, String str2) {
        long jElapsedRealtime;
        G0();
        m1 m1Var = (m1) this.f3623a;
        m1Var.f39592k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (m1Var.f39585d.R0(null, d0.f39301e1)) {
            m1Var.f39592k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        O0(jCurrentTimeMillis, jElapsedRealtime, bundle, str, str2);
    }

    public final void O0(long j10, long j11, Bundle bundle, String str, String str2) {
        G0();
        boolean z10 = true;
        if (this.f39686d != null && !l4.j1(str2)) {
            z10 = false;
        }
        P0(str, str2, j10, j11, bundle, true, z10, true);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    public final void P0(String str, String str2, long j10, long j11, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        String str3;
        a1 a1Var;
        s4.i iVar;
        boolean z13;
        z2 z2Var;
        long j12;
        boolean zA;
        int i10;
        p3 p3Var;
        long j13;
        int i11;
        long j14;
        p3 p3Var2;
        boolean zN0;
        ArrayList arrayList;
        Bundle[] bundleArr;
        int i12;
        int length;
        String str4 = str;
        k9.c0.e(str4);
        k9.c0.h(bundle);
        G0();
        H0();
        m1 m1Var = (m1) this.f3623a;
        boolean zA2 = m1Var.a();
        p3 p3Var3 = m1Var.f39589h;
        g gVar = m1Var.f39585d;
        Context context = m1Var.f39582a;
        l4 l4Var = m1Var.f39590i;
        s0 s0Var = m1Var.f39587f;
        if (!zA2) {
            m1.h(s0Var);
            s0Var.f39759m.b("Event not sent since app measurement is disabled");
            return;
        }
        List list = m1Var.m().f39542k;
        if (list != null && !list.contains(str2)) {
            m1.h(s0Var);
            s0Var.f39759m.d("Dropping non-safelisted event. event name, origin", str2, str4);
            return;
        }
        if (!this.f39688f) {
            this.f39688f = true;
            try {
                try {
                    (!m1Var.f39583b ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod(MobileAdsBridgeBase.initializeMethodName, Context.class).invoke(null, context);
                } catch (Exception e10) {
                    m1.h(s0Var);
                    s0Var.f39756i.c(e10, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                m1.h(s0Var);
                s0Var.l.b("Tag Manager is not found and thus will not be used");
            }
        }
        o0 o0Var = m1Var.f39591j;
        a1 a1Var2 = m1Var.f39586e;
        p9.b bVar = m1Var.f39592k;
        if (!gVar.R0(null, d0.Z0) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            bVar.getClass();
            str3 = null;
            R0(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            str3 = null;
        }
        if (!z10 || l4.f39560j[0].equals(str2)) {
            a1Var = a1Var2;
        } else {
            m1.f(l4Var);
            m1.f(a1Var2);
            a1Var = a1Var2;
            l4Var.T0(bundle, a1Var.f39225y.E());
        }
        s4.i iVar2 = this.f39703v;
        if (z12 || "_iap".equals(str2)) {
            iVar = iVar2;
        } else {
            m1.f(l4Var);
            int i13 = 2;
            if (l4Var.I1(NotificationCompat.CATEGORY_EVENT, str2)) {
                iVar = iVar2;
                if (l4Var.K1(NotificationCompat.CATEGORY_EVENT, z1.f39936a, ((m1) l4Var.f3623a).f39585d.R0(str3, d0.f39304f1) ? z1.f39938c : z1.f39937b, str2)) {
                    i12 = 40;
                    if (l4Var.L1(40, NotificationCompat.CATEGORY_EVENT, str2)) {
                        i13 = 0;
                    }
                } else {
                    i13 = 13;
                }
                if (i13 != 0) {
                    m1.h(s0Var);
                    s0Var.f39755h.c(o0Var.a(str2), "Invalid public event name. Event will not be logged (FE)");
                    m1.f(l4Var);
                    String strN0 = l4.N0(i12, str2, true);
                    if (str2 != null) {
                        length = str2.length();
                    } else {
                        length = 0;
                    }
                    l4.Y0(iVar, null, i13, "_ev", strN0, length);
                    return;
                }
            } else {
                iVar = iVar2;
            }
            i12 = 40;
            if (i13 != 0) {
                m1.h(s0Var);
                s0Var.f39755h.c(o0Var.a(str2), "Invalid public event name. Event will not be logged (FE)");
                m1.f(l4Var);
                String strN1 = l4.N0(i12, str2, true);
                if (str2 != null) {
                    length = str2.length();
                } else {
                    length = 0;
                }
                l4.Y0(iVar, null, i13, "_ev", strN1, length);
                return;
            }
        }
        z2 z2Var2 = m1Var.l;
        m1.g(z2Var2);
        w2 w2VarK0 = z2Var2.K0(false);
        if (w2VarK0 != null && !bundle.containsKey("_sc")) {
            w2VarK0.f39865d = true;
        }
        l4.B1(w2VarK0, bundle, z10 && !z12);
        boolean zEquals = "am".equals(str4);
        boolean zJ1 = l4.j1(str2);
        if (!z10 || this.f39686d == null || zJ1) {
            z13 = zEquals;
        } else {
            if (!zEquals) {
                m1.h(s0Var);
                s0Var.f39759m.d("Passing event to registered event handler (FE)", o0Var.a(str2), o0Var.e(bundle));
                k9.c0.h(this.f39686d);
                eb.d0 d0Var = this.f39686d;
                d0Var.getClass();
                try {
                    ((e7) d0Var.f39976b).E0(j10, bundle, str4, str2);
                    return;
                } catch (RemoteException e11) {
                    m1 m1Var2 = ((AppMeasurementDynamiteService) d0Var.f39977c).f24515a;
                    if (m1Var2 != null) {
                        s0 s0Var2 = m1Var2.f39587f;
                        m1.h(s0Var2);
                        s0Var2.f39756i.c(e11, "Event interceptor threw exception");
                        return;
                    }
                    return;
                }
            }
            z13 = true;
        }
        if (m1Var.c()) {
            m1.f(l4Var);
            m1 m1Var3 = (m1) l4Var.f3623a;
            int iM1 = l4Var.M1(str2);
            if (iM1 != 0) {
                m1.h(s0Var);
                s0Var.f39755h.c(o0Var.a(str2), "Invalid event name. Event will not be logged (FE)");
                String strN2 = l4.N0(40, str2, true);
                int length2 = str2 != null ? str2.length() : 0;
                m1.f(l4Var);
                l4.Y0(iVar, null, iM1, "_ev", strN2, length2);
                return;
            }
            Bundle bundleQ0 = l4Var.Q0(str2, bundle, p9.c.i("_o", "_sn", "_sc", "_si"), z12);
            k9.c0.h(bundleQ0);
            m1.g(z2Var2);
            String str5 = "_o";
            if (z2Var2.K0(false) == null || !"_ae".equals(str2)) {
                z2Var = z2Var2;
                j12 = 0;
            } else {
                m1.g(p3Var3);
                c7 c7Var = p3Var3.f39707f;
                ((m1) ((p3) c7Var.f13073d).f3623a).f39592k.getClass();
                j12 = 0;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                z2Var = z2Var2;
                long j15 = jElapsedRealtime - c7Var.f13071b;
                c7Var.f13071b = jElapsedRealtime;
                if (j15 > 0) {
                    l4Var.r1(bundleQ0, j15);
                }
            }
            if (!"auto".equals(str4) && "_ssr".equals(str2)) {
                String string2 = bundleQ0.getString("_ffr");
                if (p9.d.a(string2)) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                a1 a1Var3 = m1Var3.f39586e;
                m1.f(a1Var3);
                if (Objects.equals(string2, a1Var3.f39222v.g())) {
                    s0 s0Var3 = m1Var3.f39587f;
                    m1.h(s0Var3);
                    s0Var3.f39759m.b("Not logging duplicate session_start_with_rollout event");
                    return;
                } else {
                    a1 a1Var4 = m1Var3.f39586e;
                    m1.f(a1Var4);
                    a1Var4.f39222v.h(string2);
                }
            } else if ("_ae".equals(str2)) {
                a1 a1Var5 = m1Var3.f39586e;
                m1.f(a1Var5);
                String strG = a1Var5.f39222v.g();
                if (!TextUtils.isEmpty(strG)) {
                    bundleQ0.putString("_ffr", strG);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bundleQ0);
            if (gVar.R0(null, d0.S0)) {
                m1.g(p3Var3);
                p3Var3.G0();
                zA = p3Var3.f39705d;
            } else {
                m1.f(a1Var);
                zA = a1Var.f39219s.a();
            }
            m1.f(a1Var);
            if (a1Var.f39216p.e() > j12) {
                p3Var = p3Var3;
                j14 = j10;
                if (a1Var.P0(j14) && zA) {
                    m1.h(s0Var);
                    s0Var.f39760n.b("Current session is expired, remove the session number, ID, and engagement time");
                    bVar.getClass();
                    i10 = 1;
                    i11 = 0;
                    R0(System.currentTimeMillis(), null, "auto", "_sid");
                    bVar.getClass();
                    R0(System.currentTimeMillis(), null, "auto", "_sno");
                    bVar.getClass();
                    R0(System.currentTimeMillis(), null, "auto", "_se");
                    j13 = j12;
                    a1Var.f39217q.f(j13);
                } else {
                    i10 = 1;
                    j13 = j12;
                    i11 = 0;
                }
            } else {
                i10 = 1;
                p3Var = p3Var3;
                j13 = j12;
                i11 = 0;
                j14 = j10;
            }
            if (bundleQ0.getLong("extend_session", j13) == 1) {
                m1.h(s0Var);
                s0Var.f39760n.b("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                m1.g(p3Var);
                p3Var2 = p3Var;
                p3Var2.f39706e.F(j14, j11);
            } else {
                p3Var2 = p3Var;
            }
            ArrayList arrayList3 = new ArrayList(bundleQ0.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i14 = i11;
            while (i14 < size) {
                String str6 = (String) arrayList3.get(i14);
                if (str6 != null) {
                    m1.f(l4Var);
                    Object obj = bundleQ0.get(str6);
                    arrayList = arrayList3;
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[i10];
                        bundleArr[i11] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList4 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleQ0.putParcelableArray(str6, bundleArr);
                    }
                } else {
                    arrayList = arrayList3;
                }
                i14++;
                arrayList3 = arrayList;
                i10 = 1;
            }
            int i15 = i11;
            while (i15 < arrayList2.size()) {
                Bundle bundleL1 = (Bundle) arrayList2.get(i15);
                String str7 = i15 != 0 ? "_ep" : str2;
                String str8 = str5;
                bundleL1.putString(str8, str4);
                if (z11) {
                    bundleL1 = l4Var.l1(bundleL1);
                }
                Bundle bundle2 = bundleL1;
                u uVar = new u(str7, new t(bundleL1), str4, j14, j11);
                h3 h3VarK = m1Var.k();
                h3VarK.getClass();
                h3VarK.G0();
                h3VarK.H0();
                h3VarK.S0();
                n0 n0VarJ = ((m1) h3VarK.f3623a).j();
                n0VarJ.getClass();
                Parcel parcelObtain = Parcel.obtain();
                android.support.v4.media.a.a(uVar, parcelObtain, i11);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    s0 s0Var4 = ((m1) n0VarJ.f3623a).f39587f;
                    m1.h(s0Var4);
                    s0Var4.f39754g.b("Event is too long for local database. Sending event directly to service");
                    zN0 = false;
                } else {
                    zN0 = n0VarJ.N0(0, bArrMarshall);
                }
                h3VarK.U0(new hy1(h3VarK, h3VarK.W0(true), zN0, uVar, 2));
                if (!z13) {
                    Iterator it = this.f39687e.iterator();
                    while (it.hasNext()) {
                        ((a2) it.next()).a(j10, new Bundle(bundle2), str, str2);
                    }
                }
                i15++;
                str4 = str;
                j14 = j10;
                str5 = str8;
                i11 = 0;
            }
            m1.g(z2Var);
            if (z2Var.K0(false) == null || !"_ae".equals(str2)) {
                return;
            }
            m1.g(p3Var2);
            bVar.getClass();
            p3Var2.f39707f.c(SystemClock.elapsedRealtime(), true, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void Q0(String str, String str2, Object obj, boolean z10, long j10) {
        int iO1;
        int length;
        m1 m1Var = (m1) this.f3623a;
        if (z10) {
            l4 l4Var = m1Var.f39590i;
            m1.f(l4Var);
            iO1 = l4Var.O1(str2);
        } else {
            l4 l4Var2 = m1Var.f39590i;
            m1.f(l4Var2);
            if (!l4Var2.I1("user property", str2)) {
                iO1 = 6;
            } else if (l4Var2.K1("user property", z1.l, null, str2)) {
                ((m1) l4Var2.f3623a).getClass();
                if (l4Var2.L1(24, "user property", str2)) {
                    iO1 = 0;
                } else {
                    iO1 = 6;
                }
            } else {
                iO1 = 15;
            }
        }
        s4.i iVar = this.f39703v;
        if (iO1 != 0) {
            m1.f(m1Var.f39590i);
            String strN0 = l4.N0(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            m1.f(m1Var.f39590i);
            l4.Y0(iVar, null, iO1, "_ev", strN0, length);
            return;
        }
        String str3 = str == null ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : str;
        if (obj == null) {
            j1 j1Var = m1Var.f39588g;
            m1.h(j1Var);
            j1Var.P0(new p1(this, str3, str2, null, j10, 1));
            return;
        }
        l4 l4Var3 = m1Var.f39590i;
        m1.f(l4Var3);
        int iV0 = l4Var3.V0(obj, str2);
        if (iV0 != 0) {
            m1.f(l4Var3);
            String strN1 = l4.N0(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            m1.f(m1Var.f39590i);
            l4.Y0(iVar, null, iV0, "_ev", strN1, length);
            return;
        }
        m1.f(l4Var3);
        Object objW0 = l4Var3.W0(obj, str2);
        if (objW0 != null) {
            j1 j1Var2 = m1Var.f39588g;
            m1.h(j1Var2);
            j1Var2.P0(new p1(this, str3, str2, objW0, j10, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    public final void R0(long j10, Object obj, String str, String str2) {
        String str3;
        boolean zN0;
        Object objValueOf = obj;
        m1 m1Var = (m1) this.f3623a;
        k9.c0.e(str);
        k9.c0.e(str2);
        G0();
        H0();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (objValueOf instanceof String) {
                String str5 = (String) objValueOf;
                if (!TextUtils.isEmpty(str5)) {
                    long j11 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    objValueOf = Long.valueOf(j11);
                    a1 a1Var = m1Var.f39586e;
                    m1.f(a1Var);
                    a1Var.f39213m.h(j11 == 1 ? com.ironsource.mediationsdk.metadata.a.f29610g : "false");
                } else if (objValueOf == null) {
                    a1 a1Var2 = m1Var.f39586e;
                    m1.f(a1Var2);
                    a1Var2.f39213m.h("unset");
                } else {
                    str4 = str2;
                }
            } else if (objValueOf == null) {
                a1 a1Var3 = m1Var.f39586e;
                m1.f(a1Var3);
                a1Var3.f39213m.h("unset");
            } else {
                str4 = str2;
            }
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39760n.d("Setting user property(FE)", "non_personalized_ads(_npa)", objValueOf);
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj2 = objValueOf;
        if (!m1Var.a()) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39760n.b("User property not set since app measurement is disabled");
            return;
        }
        if (m1Var.c()) {
            i4 i4Var = new i4(j10, obj2, str3, str);
            h3 h3VarK = m1Var.k();
            h3VarK.G0();
            h3VarK.H0();
            h3VarK.S0();
            n0 n0VarJ = ((m1) h3VarK.f3623a).j();
            n0VarJ.getClass();
            Parcel parcelObtain = Parcel.obtain();
            android.support.v4.media.a.b(i4Var, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                s0 s0Var3 = ((m1) n0VarJ.f3623a).f39587f;
                m1.h(s0Var3);
                s0Var3.f39754g.b("User property too long for local database. Sending directly to service");
                zN0 = false;
            } else {
                zN0 = n0VarJ.N0(1, bArrMarshall);
            }
            h3VarK.U0(new hy1(h3VarK, h3VarK.W0(true), zN0, i4Var, 1));
        }
    }

    public final void S0() {
        G0();
        H0();
        m1 m1Var = (m1) this.f3623a;
        if (m1Var.c()) {
            g gVar = m1Var.f39585d;
            ((m1) gVar.f3623a).getClass();
            Boolean boolT0 = gVar.T0("google_analytics_deferred_deep_link_enabled");
            if (boolT0 != null && boolT0.booleanValue()) {
                s0 s0Var = m1Var.f39587f;
                m1.h(s0Var);
                s0Var.f39759m.b("Deferred Deep Link feature enabled.");
                j1 j1Var = m1Var.f39588g;
                m1.h(j1Var);
                j1Var.P0(new c2(this, 2));
            }
            h3 h3VarK = m1Var.k();
            h3VarK.G0();
            h3VarK.H0();
            n4 n4VarW0 = h3VarK.W0(true);
            h3VarK.S0();
            m1 m1Var2 = (m1) h3VarK.f3623a;
            m1Var2.f39585d.R0(null, d0.W0);
            m1Var2.j().N0(3, new byte[0]);
            h3VarK.U0(new c3(h3VarK, n4VarW0, 1));
            this.f39699r = false;
            a1 a1Var = m1Var.f39586e;
            m1.f(a1Var);
            a1Var.G0();
            String string = a1Var.K0().getString("previous_os_version", null);
            ((m1) a1Var.f3623a).l().I0();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = a1Var.K0().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            m1Var.l().I0();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            N0("auto", bundle, "_ou");
        }
    }

    public final void T0(Bundle bundle, long j10) {
        m1 m1Var = (m1) this.f3623a;
        k9.c0.h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(MBridgeConstans.APP_ID))) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39756i.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(MBridgeConstans.APP_ID);
        z1.e(bundle2, MBridgeConstans.APP_ID, String.class, null);
        z1.e(bundle2, "origin", String.class, null);
        z1.e(bundle2, "name", String.class, null);
        z1.e(bundle2, X3.i.X, Object.class, null);
        z1.e(bundle2, "trigger_event_name", String.class, null);
        z1.e(bundle2, "trigger_timeout", Long.class, 0L);
        z1.e(bundle2, "timed_out_event_name", String.class, null);
        z1.e(bundle2, "timed_out_event_params", Bundle.class, null);
        z1.e(bundle2, "triggered_event_name", String.class, null);
        z1.e(bundle2, "triggered_event_params", Bundle.class, null);
        z1.e(bundle2, "time_to_live", Long.class, 0L);
        z1.e(bundle2, "expired_event_name", String.class, null);
        z1.e(bundle2, "expired_event_params", Bundle.class, null);
        k9.c0.e(bundle2.getString("name"));
        k9.c0.e(bundle2.getString("origin"));
        k9.c0.h(bundle2.get(X3.i.X));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(X3.i.X);
        l4 l4Var = m1Var.f39590i;
        o0 o0Var = m1Var.f39591j;
        s0 s0Var2 = m1Var.f39587f;
        m1.f(l4Var);
        if (l4Var.O1(string) != 0) {
            m1.h(s0Var2);
            s0Var2.f39753f.c(o0Var.c(string), "Invalid conditional user property name");
            return;
        }
        m1.f(l4Var);
        if (l4Var.V0(obj, string) != 0) {
            m1.h(s0Var2);
            s0Var2.f39753f.d("Invalid conditional user property value", o0Var.c(string), obj);
            return;
        }
        Object objW0 = l4Var.W0(obj, string);
        if (objW0 == null) {
            m1.h(s0Var2);
            s0Var2.f39753f.d("Unable to normalize conditional user property value", o0Var.c(string), obj);
            return;
        }
        z1.c(bundle2, objW0);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j11 > 15552000000L || j11 < 1)) {
            m1.h(s0Var2);
            s0Var2.f39753f.d("Invalid conditional user property timeout", o0Var.c(string), Long.valueOf(j11));
            return;
        }
        long j12 = bundle2.getLong("time_to_live");
        if (j12 > 15552000000L || j12 < 1) {
            m1.h(s0Var2);
            s0Var2.f39753f.d("Invalid conditional user property time to live", o0Var.c(string), Long.valueOf(j12));
        } else {
            j1 j1Var = m1Var.f39588g;
            m1.h(j1Var);
            j1Var.P0(new k2(this, bundle2, 0));
        }
    }

    public final void U0(String str, Bundle bundle, String str2) {
        m1 m1Var = (m1) this.f3623a;
        m1Var.f39592k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        k9.c0.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        j1 j1Var = m1Var.f39588g;
        m1.h(j1Var);
        j1Var.P0(new k2(this, bundle2, 1));
    }

    public final String V0() {
        m1 m1Var = (m1) this.f3623a;
        try {
            return z1.b(m1Var.f39582a, m1Var.f39596p);
        } catch (IllegalStateException e10) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39753f.c(e10, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void W0(y1 y1Var, long j10, boolean z10) {
        int i10 = y1Var.f39927b;
        G0();
        H0();
        m1 m1Var = (m1) this.f3623a;
        a1 a1Var = m1Var.f39586e;
        s0 s0Var = m1Var.f39587f;
        m1.f(a1Var);
        y1 y1VarN0 = a1Var.N0();
        if (j10 <= this.f39697p && y1.l(y1VarN0.f39927b, i10)) {
            m1.h(s0Var);
            s0Var.l.c(y1Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        a1 a1Var2 = m1Var.f39586e;
        m1.f(a1Var2);
        a1Var2.G0();
        if (!y1.l(i10, a1Var2.K0().getInt("consent_source", 100))) {
            m1.h(s0Var);
            s0Var.l.c(Integer.valueOf(i10), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = a1Var2.K0().edit();
        editorEdit.putString("consent_settings", y1Var.g());
        editorEdit.putInt("consent_source", i10);
        editorEdit.apply();
        m1.h(s0Var);
        s0Var.f39760n.c(y1Var, "Setting storage consent(FE)");
        this.f39697p = j10;
        if (m1Var.k().Q0()) {
            h3 h3VarK = m1Var.k();
            h3VarK.G0();
            h3VarK.H0();
            h3VarK.U0(new f3(h3VarK, 2));
        } else {
            h3 h3VarK2 = m1Var.k();
            h3VarK2.G0();
            h3VarK2.H0();
            if (h3VarK2.P0()) {
                h3VarK2.U0(new c3(h3VarK2, h3VarK2.W0(false)));
            }
        }
        if (z10) {
            m1Var.k().K0(new AtomicReference());
        }
    }

    public final void X0(Boolean bool, boolean z10) {
        G0();
        H0();
        m1 m1Var = (m1) this.f3623a;
        s0 s0Var = m1Var.f39587f;
        m1.h(s0Var);
        s0Var.f39759m.c(bool, "Setting app measurement enabled (FE)");
        a1 a1Var = m1Var.f39586e;
        m1.f(a1Var);
        a1Var.G0();
        SharedPreferences.Editor editorEdit = a1Var.K0().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z10) {
            a1Var.G0();
            SharedPreferences.Editor editorEdit2 = a1Var.K0().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        j1 j1Var = m1Var.f39588g;
        m1.h(j1Var);
        j1Var.G0();
        if (m1Var.f39606z || !(bool == null || bool.booleanValue())) {
            Y0();
        }
    }

    public final void Y0() {
        G0();
        m1 m1Var = (m1) this.f3623a;
        a1 a1Var = m1Var.f39586e;
        s0 s0Var = m1Var.f39587f;
        p9.b bVar = m1Var.f39592k;
        m1.f(a1Var);
        String strG = a1Var.f39213m.g();
        if (strG != null) {
            if ("unset".equals(strG)) {
                bVar.getClass();
                R0(System.currentTimeMillis(), null, MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != com.ironsource.mediationsdk.metadata.a.f29610g.equals(strG) ? 0L : 1L);
                bVar.getClass();
                R0(System.currentTimeMillis(), lValueOf, MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa");
            }
        }
        if (!m1Var.a() || !this.f39699r) {
            m1.h(s0Var);
            s0Var.f39759m.b("Updating Scion state (FE)");
            h3 h3VarK = m1Var.k();
            h3VarK.G0();
            h3VarK.H0();
            h3VarK.U0(new c3(h3VarK, h3VarK.W0(true), 3));
            return;
        }
        m1.h(s0Var);
        s0Var.f39759m.b("Recording app launch after enabling measurement for the first time (FE)");
        S0();
        p3 p3Var = m1Var.f39589h;
        m1.g(p3Var);
        p3Var.f39706e.E();
        j1 j1Var = m1Var.f39588g;
        m1.h(j1Var);
        j1Var.P0(new c2(this, 1));
    }

    public final void Z0() {
        m1 m1Var = (m1) this.f3623a;
        if (!(m1Var.f39582a.getApplicationContext() instanceof Application) || this.f39685c == null) {
            return;
        }
        ((Application) m1Var.f39582a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f39685c);
    }

    public final void a1(Bundle bundle, int i10, long j10) {
        Boolean bool;
        String string;
        v1 v1Var;
        Boolean bool2;
        m1 m1Var = (m1) this.f3623a;
        H0();
        y1 y1Var = y1.f39925c;
        x1[] x1VarArr = w1.STORAGE.f39861a;
        int length = x1VarArr.length;
        int i11 = 0;
        while (true) {
            bool = null;
            if (i11 >= length) {
                string = null;
                break;
            }
            String str = x1VarArr[i11].f39910a;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    bool2 = Boolean.TRUE;
                } else {
                    bool2 = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool2 == null) {
                    break;
                }
            }
            i11++;
        }
        if (string != null) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39758k.c(string, "Ignoring invalid consent setting");
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39758k.b("Valid consent values are 'granted', 'denied'");
        }
        j1 j1Var = m1Var.f39588g;
        m1.h(j1Var);
        boolean zM0 = j1Var.M0();
        y1 y1VarB = y1.b(i10, bundle);
        Iterator it = y1VarB.f39926a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            v1Var = v1.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((v1) it.next()) != v1Var) {
                c1(y1VarB, zM0);
                break;
            }
        }
        o oVarC = o.c(i10, bundle);
        Iterator it2 = oVarC.f39658e.values().iterator();
        while (it2.hasNext()) {
            if (((v1) it2.next()) != v1Var) {
                b1(oVarC, zM0);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = y1.d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i10 == -30 ? "tcf" : MBridgeConstans.DYNAMIC_VIEW_WX_APP;
            if (zM0) {
                R0(j10, bool.toString(), str2, "allow_personalized_ads");
            } else {
                Q0(str2, "allow_personalized_ads", bool.toString(), false, j10);
            }
        }
    }

    public final void b1(o oVar, boolean z10) {
        ta.i0 i0Var = new ta.i0(this, false, oVar, 11);
        if (z10) {
            G0();
            i0Var.run();
        } else {
            j1 j1Var = ((m1) this.f3623a).f39588g;
            m1.h(j1Var);
            j1Var.P0(i0Var);
        }
    }

    public final void c1(y1 y1Var, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        y1 y1Var2;
        H0();
        int i10 = y1Var.f39927b;
        if (i10 != -10) {
            v1 v1Var = (v1) y1Var.f39926a.get(x1.AD_STORAGE);
            if (v1Var == null) {
                v1Var = v1.UNINITIALIZED;
            }
            v1 v1Var2 = v1.UNINITIALIZED;
            if (v1Var == v1Var2) {
                v1 v1Var3 = (v1) y1Var.f39926a.get(x1.ANALYTICS_STORAGE);
                if (v1Var3 == null) {
                    v1Var3 = v1Var2;
                }
                if (v1Var3 == v1Var2) {
                    s0 s0Var = ((m1) this.f3623a).f39587f;
                    m1.h(s0Var);
                    s0Var.f39758k.b("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.f39690h) {
            try {
                z11 = false;
                if (y1.l(i10, this.f39695n.f39927b)) {
                    y1 y1Var3 = this.f39695n;
                    EnumMap enumMap = y1Var.f39926a;
                    x1[] x1VarArr = (x1[]) enumMap.keySet().toArray(new x1[0]);
                    int length = x1VarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            z12 = false;
                            break;
                        }
                        x1 x1Var = x1VarArr[i11];
                        v1 v1Var4 = (v1) enumMap.get(x1Var);
                        v1 v1Var5 = (v1) y1Var3.f39926a.get(x1Var);
                        v1 v1Var6 = v1.DENIED;
                        if (v1Var4 == v1Var6 && v1Var5 != v1Var6) {
                            z12 = true;
                            break;
                        }
                        i11++;
                    }
                    x1 x1Var2 = x1.ANALYTICS_STORAGE;
                    if (y1Var.i(x1Var2) && !this.f39695n.i(x1Var2)) {
                        z11 = true;
                    }
                    y1Var = y1Var.k(this.f39695n);
                    this.f39695n = y1Var;
                    z13 = z11;
                    z11 = true;
                } else {
                    z12 = false;
                    z13 = false;
                }
                y1Var2 = y1Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z11) {
            s0 s0Var2 = ((m1) this.f3623a).f39587f;
            m1.h(s0Var2);
            s0Var2.l.c(y1Var2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f39696o.getAndIncrement();
        if (z12) {
            this.f39689g.set(null);
            l2 l2Var = new l2(this, y1Var2, andIncrement, z13, 0);
            if (z10) {
                G0();
                l2Var.run();
                return;
            } else {
                j1 j1Var = ((m1) this.f3623a).f39588g;
                m1.h(j1Var);
                j1Var.R0(l2Var);
                return;
            }
        }
        l2 l2Var2 = new l2(this, y1Var2, andIncrement, z13, 1);
        if (z10) {
            G0();
            l2Var2.run();
        } else if (i10 == 30 || i10 == -10) {
            j1 j1Var2 = ((m1) this.f3623a).f39588g;
            m1.h(j1Var2);
            j1Var2.R0(l2Var2);
        } else {
            j1 j1Var3 = ((m1) this.f3623a).f39588g;
            m1.h(j1Var3);
            j1Var3.P0(l2Var2);
        }
    }

    public final void d1() {
        v4.a();
        m1 m1Var = (m1) this.f3623a;
        g gVar = m1Var.f39585d;
        j1 j1Var = m1Var.f39588g;
        s0 s0Var = m1Var.f39587f;
        if (gVar.R0(null, d0.P0)) {
            m1.h(j1Var);
            if (j1Var.M0()) {
                m1.h(s0Var);
                s0Var.f39753f.b("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (fd.b.e()) {
                m1.h(s0Var);
                s0Var.f39753f.b("Cannot get trigger URIs from main thread");
                return;
            }
            H0();
            m1.h(s0Var);
            s0Var.f39760n.b("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            m1.h(j1Var);
            j1Var.Q0(atomicReference, Xa.f27908s, "get trigger URIs", new j2(this, atomicReference, 5, false));
            List list = (List) atomicReference.get();
            if (list == null) {
                m1.h(s0Var);
                s0Var.f39755h.b("Timed out waiting for get trigger URIs");
            } else {
                m1.h(j1Var);
                j1Var.P0(new ta.i0(13, this, list));
            }
        }
    }

    public final PriorityQueue e1() {
        if (this.f39694m == null) {
            this.f39694m = new PriorityQueue(Comparator.comparing(n2.f39624a, ae.l.f3510b));
        }
        return this.f39694m;
    }

    public final void f1() {
        t3 t3Var;
        G0();
        if (e1().isEmpty() || this.f39691i || (t3Var = (t3) e1().poll()) == null) {
            return;
        }
        m1 m1Var = (m1) this.f3623a;
        l4 l4Var = m1Var.f39590i;
        m1.f(l4Var);
        if (l4Var.f39564f == null) {
            l4Var.f39564f = b4.d.b(((m1) l4Var.f3623a).f39582a);
        }
        b4.d dVar = l4Var.f39564f;
        if (dVar != null) {
            this.f39691i = true;
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            bo.b bVar = s0Var.f39760n;
            String str = t3Var.f39768a;
            bVar.c(str, "Registering trigger URI");
            ListenableFuture listenableFutureF = dVar.f(Uri.parse(str));
            if (listenableFutureF != null) {
                listenableFutureF.addListener(new ta.i0(0, listenableFutureF, new f2(0, this, t3Var)), new e2(this, 0));
            } else {
                this.f39691i = false;
                e1().add(t3Var);
            }
        }
    }

    public final void g1(y1 y1Var) {
        G0();
        boolean z10 = (y1Var.i(x1.ANALYTICS_STORAGE) && y1Var.i(x1.AD_STORAGE)) || ((m1) this.f3623a).k().P0();
        m1 m1Var = (m1) this.f3623a;
        j1 j1Var = m1Var.f39588g;
        m1.h(j1Var);
        j1Var.G0();
        if (z10 != m1Var.f39606z) {
            j1 j1Var2 = m1Var.f39588g;
            m1.h(j1Var2);
            j1Var2.G0();
            m1Var.f39606z = z10;
            a1 a1Var = ((m1) this.f3623a).f39586e;
            m1.f(a1Var);
            a1Var.G0();
            Boolean boolValueOf = a1Var.K0().contains("measurement_enabled_from_api") ? Boolean.valueOf(a1Var.K0().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                X0(Boolean.valueOf(z10), false);
            }
        }
    }
}
