package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class lj1 implements nj1, q7, ba, sb, k9.b, MediationAdLoadCallback, yd1, jk1, zb0, ao, y30, hm0, gd0, tv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17037c;

    public /* synthetic */ lj1(int i10, Object obj, Object obj2) {
        this.f17035a = i10;
        this.f17037c = obj;
        this.f17036b = obj2;
    }

    public static lj1 f(wm1 wm1Var) {
        return new lj1(0, wm1Var, rj1.a(wm1Var.z()));
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0233  */
    /* JADX WARN: Code duplicated, block: B:127:0x0256  */
    /* JADX WARN: Code duplicated, block: B:129:0x0261  */
    /* JADX WARN: Code duplicated, block: B:131:0x026a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0273  */
    /* JADX WARN: Code duplicated, block: B:134:0x027b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0283  */
    /* JADX WARN: Code duplicated, block: B:137:0x0286  */
    /* JADX WARN: Code duplicated, block: B:139:0x028e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0292  */
    /* JADX WARN: Code duplicated, block: B:142:0x029a  */
    /* JADX WARN: Code duplicated, block: B:146:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:156:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:159:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:166:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:167:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0306  */
    /* JADX WARN: Code duplicated, block: B:171:0x0316  */
    /* JADX WARN: Code duplicated, block: B:172:0x0339  */
    /* JADX WARN: Code duplicated, block: B:174:0x0349  */
    /* JADX WARN: Code duplicated, block: B:176:0x034d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0360  */
    /* JADX WARN: Code duplicated, block: B:183:0x0368  */
    /* JADX WARN: Code duplicated, block: B:185:0x036e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0377  */
    /* JADX WARN: Code duplicated, block: B:211:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:232:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v31 */
    @Override // com.google.android.gms.internal.ads.q7
    public void b(int i10, int i11, b2.d0 d0Var, byte[] bArr) {
        int i12;
        v8 v8VarB;
        String strTrim;
        int i13;
        String string;
        int i14;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        boolean z10;
        lj1 lj1Var = this;
        np0 np0Var = (np0) lj1Var.f17036b;
        np0Var.z(i10 + i11, bArr);
        np0Var.E(i10);
        ArrayList arrayList = new ArrayList();
        try {
            int i15 = np0Var.f17881b;
            Charset charset = StandardCharsets.UTF_8;
            String strN = np0Var.n(charset);
            String str = null;
            if (strN == null || !strN.startsWith("WEBVTT")) {
                np0Var.E(i15);
                throw ab.a(null, "Expected WEBVTT. Got ".concat(String.valueOf(np0Var.n(charset))));
            }
            while (!TextUtils.isEmpty(np0Var.n(StandardCharsets.UTF_8))) {
                lj1Var = this;
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i16 = -1;
                boolean z11 = false;
                byte b10 = -1;
                int i17 = 0;
                while (true) {
                    i12 = 1;
                    if (b10 != -1) {
                        break;
                    }
                    i17 = np0Var.f17881b;
                    String strN2 = np0Var.n(StandardCharsets.UTF_8);
                    if (strN2 == null) {
                        b10 = 0;
                    } else if ("STYLE".equals(strN2)) {
                        b10 = 2;
                    } else {
                        b10 = strN2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                np0Var.E(i17);
                if (b10 == 0) {
                    v71.i(new vu0(arrayList2), d0Var);
                    return;
                }
                if (b10 == 1) {
                    while (!TextUtils.isEmpty(np0Var.n(StandardCharsets.UTF_8))) {
                    }
                } else {
                    if (b10 != 2) {
                        Pattern pattern = a9.f11936a;
                        Charset charset2 = StandardCharsets.UTF_8;
                        String strN3 = np0Var.n(charset2);
                        if (strN3 == null) {
                            v8VarB = null;
                        } else {
                            Pattern pattern2 = a9.f11936a;
                            Matcher matcher2 = pattern2.matcher(strN3);
                            if (matcher2.matches()) {
                                v8VarB = a9.b(null, matcher2, np0Var, arrayList);
                            } else {
                                String strN4 = np0Var.n(charset2);
                                if (strN4 != null) {
                                    Matcher matcher3 = pattern2.matcher(strN4);
                                    if (matcher3.matches()) {
                                        v8VarB = a9.b(strN3.trim(), matcher3, np0Var, arrayList);
                                    } else {
                                        v8VarB = null;
                                    }
                                } else {
                                    v8VarB = null;
                                }
                            }
                        }
                        if (v8VarB != null) {
                            arrayList2.add(v8VarB);
                        }
                    } else {
                        if (!arrayList2.isEmpty()) {
                            throw new IllegalArgumentException("A style block was found after the first cue.");
                        }
                        np0Var.n(StandardCharsets.UTF_8);
                        t8 t8Var = (t8) lj1Var.f17037c;
                        StringBuilder sb2 = t8Var.f20238b;
                        sb2.setLength(0);
                        int i18 = np0Var.f17881b;
                        while (!TextUtils.isEmpty(np0Var.n(StandardCharsets.UTF_8))) {
                        }
                        np0 np0Var2 = t8Var.f20237a;
                        np0Var2.z(np0Var.f17881b, np0Var.f17880a);
                        np0Var2.E(i18);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            t8.a(np0Var2);
                            if (np0Var2.B() >= 5 && "::cue".equals(np0Var2.k(5, StandardCharsets.UTF_8))) {
                                int i19 = np0Var2.f17881b;
                                String strB = t8.b(np0Var2, sb2);
                                if (strB == null) {
                                    strTrim = str;
                                } else if ("{".equals(strB)) {
                                    np0Var2.E(i19);
                                    strTrim = "";
                                } else {
                                    if ("(".equals(strB)) {
                                        int i20 = np0Var2.f17881b;
                                        int i21 = np0Var2.f17882c;
                                        int i22 = z11 ? 1 : 0;
                                        while (i20 < i21 && i22 == 0) {
                                            int i23 = i20 + 1;
                                            i22 = ((char) np0Var2.f17880a[i20]) == ')' ? i12 : z11 ? 1 : 0;
                                            i20 = i23;
                                        }
                                        strTrim = np0Var2.k((i20 - 1) - np0Var2.f17881b, StandardCharsets.UTF_8).trim();
                                    } else {
                                        strTrim = str;
                                    }
                                    if (!")".equals(t8.b(np0Var2, sb2))) {
                                        strTrim = str;
                                    }
                                }
                            } else {
                                strTrim = str;
                            }
                            if (strTrim == null || !"{".equals(t8.b(np0Var2, sb2))) {
                                break;
                            }
                            u8 u8Var = new u8();
                            u8Var.f20679a = "";
                            u8Var.f20680b = "";
                            u8Var.f20681c = Collections.EMPTY_SET;
                            u8Var.f20682d = "";
                            u8Var.f20683e = str;
                            u8Var.f20685g = z11;
                            u8Var.f20687i = z11;
                            u8Var.f20688j = i16;
                            u8Var.f20689k = i16;
                            u8Var.l = i16;
                            u8Var.f20690m = i16;
                            u8Var.f20692o = i16;
                            u8Var.f20693p = z11;
                            if (!strTrim.isEmpty()) {
                                int iIndexOf = strTrim.indexOf(91);
                                if (iIndexOf != i16) {
                                    Matcher matcher4 = t8.f20235c.matcher(strTrim.substring(iIndexOf));
                                    if (matcher4.matches()) {
                                        String strGroup2 = matcher4.group(i12);
                                        strGroup2.getClass();
                                        u8Var.f20682d = strGroup2;
                                    }
                                    strTrim = strTrim.substring(z11 ? 1 : 0, iIndexOf);
                                }
                                String str2 = uu0.f20901a;
                                String[] strArrSplit = strTrim.split("\\.", i16);
                                String str3 = strArrSplit[z11 ? 1 : 0];
                                int iIndexOf2 = str3.indexOf(35);
                                if (iIndexOf2 != i16) {
                                    u8Var.f20680b = str3.substring(z11 ? 1 : 0, iIndexOf2);
                                    u8Var.f20679a = str3.substring(iIndexOf2 + 1);
                                } else {
                                    u8Var.f20680b = str3;
                                }
                                int length = strArrSplit.length;
                                if (length > i12) {
                                    u8Var.f20681c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i12, length)));
                                }
                            }
                            ?? r10 = z11 ? 1 : 0;
                            String strB2 = str;
                            while (r10 == 0) {
                                int i24 = np0Var2.f17881b;
                                strB2 = t8.b(np0Var2, sb2);
                                ?? r15 = (strB2 == null || "}".equals(strB2)) ? i12 : z11;
                                if (r15 == 0) {
                                    np0Var2.E(i24);
                                    t8.a(np0Var2);
                                    String strC = t8.c(np0Var2, sb2);
                                    if (!strC.isEmpty() && ":".equals(t8.b(np0Var2, sb2))) {
                                        t8.a(np0Var2);
                                        StringBuilder sb3 = new StringBuilder();
                                        boolean z12 = false;
                                        while (true) {
                                            if (z12) {
                                                string = sb3.toString();
                                                break;
                                            }
                                            int i25 = np0Var2.f17881b;
                                            String strB3 = t8.b(np0Var2, sb2);
                                            if (strB3 == null) {
                                                string = null;
                                                break;
                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                np0Var2.E(i25);
                                                z12 = true;
                                            } else {
                                                sb3.append(strB3);
                                            }
                                        }
                                        if (string == null || string.isEmpty()) {
                                            i13 = 1;
                                        } else {
                                            int i26 = np0Var2.f17881b;
                                            String strB4 = t8.b(np0Var2, sb2);
                                            if (";".equals(strB4)) {
                                                if ("color".equals(strC)) {
                                                    i14 = 1;
                                                    u8Var.f20684f = ef0.a(string, true);
                                                    u8Var.f20685g = true;
                                                } else {
                                                    i14 = 1;
                                                    if ("background-color".equals(strC)) {
                                                        u8Var.f20686h = ef0.a(string, true);
                                                        u8Var.f20687i = true;
                                                    } else if (!"ruby-position".equals(strC)) {
                                                        if ("text-combine-upright".equals(strC)) {
                                                            if ("all".equals(string)) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = true;
                                                            }
                                                            u8Var.f20693p = z10;
                                                        } else if ("text-decoration".equals(strC)) {
                                                            if (TtmlNode.UNDERLINE.equals(string)) {
                                                                i14 = 1;
                                                                u8Var.f20688j = 1;
                                                            }
                                                        } else if ("font-family".equals(strC)) {
                                                            u8Var.f20683e = x10.e(string);
                                                        } else if ("font-weight".equals(strC)) {
                                                            i14 = 1;
                                                            if ("font-style".equals(strC)) {
                                                                if (TtmlNode.ITALIC.equals(string)) {
                                                                    u8Var.l = 1;
                                                                }
                                                            } else if ("font-size".equals(strC)) {
                                                                matcher = t8.f20236d.matcher(x10.e(string));
                                                                if (matcher.matches()) {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    iHashCode = strGroup.hashCode();
                                                                    if (iHashCode != 37) {
                                                                        if (iHashCode != 3240) {
                                                                            if (iHashCode != 3592) {
                                                                            }
                                                                        } else if (strGroup.equals(UserDataStore.EMAIL)) {
                                                                            u8Var.f20690m = 2;
                                                                            i13 = 1;
                                                                        }
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    if (strGroup.equals("%")) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    u8Var.f20690m = 3;
                                                                    i13 = 1;
                                                                    String strGroup3 = matcher.group(i13);
                                                                    strGroup3.getClass();
                                                                    u8Var.f20691n = Float.parseFloat(strGroup3);
                                                                } else {
                                                                    StringBuilder sb4 = new StringBuilder(string.length() + 22);
                                                                    sb4.append("Invalid font-size: '");
                                                                    sb4.append(string);
                                                                    sb4.append("'.");
                                                                    v71.y("WebvttCssParser", sb4.toString());
                                                                }
                                                            }
                                                        } else if (TtmlNode.BOLD.equals(string)) {
                                                            i14 = 1;
                                                            u8Var.f20689k = 1;
                                                        }
                                                        i13 = 1;
                                                    } else if ("over".equals(string)) {
                                                        u8Var.f20692o = 1;
                                                    } else {
                                                        if ("under".equals(string)) {
                                                            u8Var.f20692o = 2;
                                                        }
                                                        i13 = 1;
                                                    }
                                                }
                                                i13 = i14;
                                            } else {
                                                if ("}".equals(strB4)) {
                                                    np0Var2.E(i26);
                                                    if ("color".equals(strC)) {
                                                        i14 = 1;
                                                        u8Var.f20684f = ef0.a(string, true);
                                                        u8Var.f20685g = true;
                                                    } else {
                                                        i14 = 1;
                                                        if ("background-color".equals(strC)) {
                                                            u8Var.f20686h = ef0.a(string, true);
                                                            u8Var.f20687i = true;
                                                        } else if (!"ruby-position".equals(strC)) {
                                                            if ("over".equals(string)) {
                                                                u8Var.f20692o = 1;
                                                            } else if ("under".equals(string)) {
                                                                u8Var.f20692o = 2;
                                                            }
                                                        } else if ("text-combine-upright".equals(strC)) {
                                                            if ("all".equals(string) || string.startsWith("digits")) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            u8Var.f20693p = z10;
                                                        } else if ("text-decoration".equals(strC)) {
                                                            if (TtmlNode.UNDERLINE.equals(string)) {
                                                                i14 = 1;
                                                                u8Var.f20688j = 1;
                                                            }
                                                        } else if ("font-family".equals(strC)) {
                                                            u8Var.f20683e = x10.e(string);
                                                        } else if ("font-weight".equals(strC)) {
                                                            i14 = 1;
                                                            if ("font-style".equals(strC)) {
                                                                if (TtmlNode.ITALIC.equals(string)) {
                                                                    u8Var.l = 1;
                                                                }
                                                            } else if ("font-size".equals(strC)) {
                                                                matcher = t8.f20236d.matcher(x10.e(string));
                                                                if (matcher.matches()) {
                                                                    StringBuilder sb5 = new StringBuilder(string.length() + 22);
                                                                    sb5.append("Invalid font-size: '");
                                                                    sb5.append(string);
                                                                    sb5.append("'.");
                                                                    v71.y("WebvttCssParser", sb5.toString());
                                                                } else {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    iHashCode = strGroup.hashCode();
                                                                    if (iHashCode != 37) {
                                                                        if (iHashCode != 3240) {
                                                                            if (iHashCode != 3592 && strGroup.equals("px")) {
                                                                                u8Var.f20690m = 1;
                                                                                i13 = 1;
                                                                            }
                                                                        } else if (strGroup.equals(UserDataStore.EMAIL)) {
                                                                            u8Var.f20690m = 2;
                                                                            i13 = 1;
                                                                        }
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    if (strGroup.equals("%")) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    u8Var.f20690m = 3;
                                                                    i13 = 1;
                                                                    String strGroup4 = matcher.group(i13);
                                                                    strGroup4.getClass();
                                                                    u8Var.f20691n = Float.parseFloat(strGroup4);
                                                                }
                                                            }
                                                        } else if (TtmlNode.BOLD.equals(string)) {
                                                            i14 = 1;
                                                            u8Var.f20689k = 1;
                                                        }
                                                    }
                                                    i13 = i14;
                                                }
                                                i13 = 1;
                                            }
                                        }
                                    } else {
                                        i13 = i12;
                                    }
                                } else {
                                    i13 = i12;
                                }
                                i12 = i13;
                                r10 = r15;
                                z11 = false;
                            }
                            int i27 = i12;
                            if ("}".equals(strB2)) {
                                arrayList3.add(u8Var);
                            }
                            i12 = i27;
                            i16 = -1;
                            z11 = false;
                            str = null;
                        }
                        arrayList.addAll(arrayList3);
                    }
                    lj1Var = this;
                    str = null;
                }
            }
        } catch (ab e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public void c(boolean z10, Context context, ka0 ka0Var) throws fd0 {
        try {
            wu0 wu0Var = (wu0) ((qm0) this.f17036b).f19127b;
            wu0Var.b(z10);
            try {
                wu0Var.f21609a.zzp();
            } catch (Throwable th2) {
                throw new qu0(th2);
            }
        } catch (qu0 e10) {
            int i10 = zze.zza;
            zzo.zzj("Cannot show rewarded video.", e10);
            throw new fd0(e10.getCause());
        }
    }

    @Override // k9.b
    public void d(Bundle bundle) {
        try {
            ((m00) this.f17036b).zzc((pr) ((hj) ((i9.i) this.f17037c).f42937a).getService());
        } catch (DeadObjectException e10) {
            ((m00) this.f17036b).zzd(e10);
        }
    }

    public m2 e(Object... objArr) {
        Constructor constructorZza;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f17037c;
        synchronized (atomicBoolean) {
            try {
                if (!atomicBoolean.get()) {
                    try {
                        constructorZza = ((i2) this.f17036b).zza();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.f17037c).set(true);
                        constructorZza = null;
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating extension", e10);
                    }
                }
                constructorZza = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (m2) constructorZza.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.ba
    public void g(np0 np0Var) {
        ea eaVar = (ea) this.f17037c;
        if (np0Var.K() == 0 && (np0Var.K() & 128) != 0) {
            np0Var.G(6);
            int iB = np0Var.B() / 4;
            for (int i10 = 0; i10 < iB; i10++) {
                gp0 gp0Var = (gp0) this.f17036b;
                np0Var.H(gp0Var.f14921a, 0, 4);
                gp0Var.d(0);
                int iH = gp0Var.h(16);
                gp0Var.f(3);
                if (iH == 0) {
                    gp0Var.f(13);
                } else {
                    int iH2 = gp0Var.h(13);
                    if (eaVar.f13905f.get(iH2) == null) {
                        eaVar.f13905f.put(iH2, new ca(new s(eaVar, iH2)));
                    }
                }
            }
            eaVar.f13905f.remove(0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View$OnTouchListener, com.google.android.gms.internal.ads.qh] */
    @Override // com.google.android.gms.internal.ads.ao
    public void h(MotionEvent motionEvent) {
        ((qh) this.f17036b).onTouch(null, motionEvent);
    }

    public void i(qv0 qv0Var) {
        sf sfVar = new sf((nl0) this.f17036b, 5);
        k00 k00Var = (k00) ((fe1) this.f17037c);
        ListenableFuture listenableFutureB = k00Var.b(sfVar);
        listenableFutureB.addListener(new zd1(0, listenableFutureB, new vf(24, this, qv0Var)), k00Var);
    }

    public void k(du0 du0Var) {
        l("aai", du0Var.f13715w);
        l("request_id", du0Var.f13700n0);
        l("ad_format", du0.a(du0Var.f13677b));
    }

    public void l(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ((ConcurrentHashMap) this.f17036b).put(str, str2);
    }

    public void m() {
        ((yh0) this.f17037c).f22255b.execute(new xh0(this, 1));
    }

    public zzt n() {
        if (!((Boolean) zzba.zzc().a(am.Vf)).booleanValue()) {
            m();
            return zzt.zza;
        }
        yh0 yh0Var = (yh0) this.f17037c;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f17036b;
        ci0 ci0Var = yh0Var.f22254a;
        ci0Var.getClass();
        if (concurrentHashMap.isEmpty()) {
            int i10 = zze.zza;
            zzo.zzd("Empty paramMap.");
            return zzt.zza;
        }
        String strGenerateUrl = ci0Var.f13174f.generateUrl(concurrentHashMap);
        zze.zza(strGenerateUrl);
        return ci0Var.f13172d.zzc(strGenerateUrl, null);
    }

    public Set o(m90 m90Var) {
        return Collections.singleton(new nc0(m90Var, l00.f16615h));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        switch (this.f17035a) {
            case 9:
                try {
                    ((su) this.f17036b).a(adError.zza());
                } catch (RemoteException e10) {
                    zzo.zzg("", e10);
                    return;
                }
                break;
            default:
                try {
                    ((wu) this.f17036b).a(adError.zza());
                } catch (RemoteException e11) {
                    zzo.zzg("", e11);
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public Object onSuccess(Object obj) {
        switch (this.f17035a) {
            case 9:
                su suVar = (su) this.f17036b;
                MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
                if (mediationBannerAd != null) {
                    try {
                        suVar.l(new s9.b(mediationBannerAd.getView()));
                        break;
                    } catch (RemoteException e10) {
                        zzo.zzg("", e10);
                    }
                    return new so0((xt) this.f17037c, 13);
                }
                zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                try {
                    suVar.zzf("Adapter returned null.");
                    return null;
                } catch (RemoteException e11) {
                    zzo.zzg("", e11);
                    return null;
                }
            default:
                wu wuVar = (wu) this.f17036b;
                UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
                if (unifiedNativeAdMapper != null) {
                    try {
                        wuVar.w0(new ou(unifiedNativeAdMapper));
                        break;
                    } catch (RemoteException e12) {
                        zzo.zzg("", e12);
                    }
                    return new so0((xt) this.f17037c, 13);
                }
                zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                try {
                    wuVar.zzf("Adapter returned null.");
                    return null;
                } catch (RemoteException e13) {
                    zzo.zzg("", e13);
                    return null;
                }
        }
    }

    public Set p(m90 m90Var) {
        return Collections.singleton(new nc0(m90Var, l00.f16615h));
    }

    @Override // k9.b
    public void q(int i10) {
        ((m00) this.f17036b).zzd(new RuntimeException(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 23), "onConnectionSuspended: ", i10)));
    }

    public void r() {
        ((yh0) this.f17037c).f22255b.execute(new xh0(this, 0));
    }

    @Override // com.google.android.gms.internal.ads.jk1, com.google.android.gms.internal.ads.hm0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ wk1 mo166zza() {
        AtomicInteger atomicInteger = r20.f19281u;
        wk1 wk1VarMo166zza = ((jk1) this.f17036b).mo166zza();
        byte[] bArr = (byte[]) this.f17037c;
        return new n20(new ci1(bArr), bArr.length, wk1VarMo166zza);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public du0 zzb() {
        return (du0) this.f17037c;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    @Override // com.google.android.gms.internal.ads.ao
    public JSONObject zzc() {
        return ((qh) this.f17036b).zzo();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    @Override // com.google.android.gms.internal.ads.ao
    /* JADX INFO: renamed from: zzd */
    public JSONObject mo170zzd() {
        return ((qh) this.f17036b).zzp();
    }

    public lj1(Context context) {
        this.f17035a = 6;
        this.f17037c = context;
        this.f17036b = null;
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
        switch (this.f17035a) {
            case 12:
                ((p00) this.f17036b).mo160zza(obj);
                return;
            case 15:
                List list = ((p80) obj).f18560a;
                o8 o8Var = (o8) this.f17036b;
                s80 s80Var = (s80) this.f17037c;
                Executor executor = s80Var.f19892a;
                if (list == null || list.isEmpty()) {
                    executor.execute(new r80(o8Var, 0));
                    return;
                }
                ListenableFuture listenableFutureX = be1.f12743b;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    listenableFutureX = zw1.x(zw1.u(listenableFutureX, Throwable.class, new rr(o8Var, 3), executor), new q80(s80Var, o8Var, (ListenableFuture) it.next(), 0), executor);
                }
                listenableFutureX.addListener(new zd1(0, listenableFutureX, new md0(s80Var, o8Var)), executor);
                return;
            case 20:
                ((b30) obj).w((String) this.f17036b, (oq) this.f17037c);
                return;
            case 22:
                String str = (String) obj;
                try {
                    kx kxVar = (kx) this.f17037c;
                    ex exVar = (ex) this.f17036b;
                    Parcel parcelQ = kxVar.q();
                    parcelQ.writeString(str);
                    rh.c(parcelQ, exVar);
                    kxVar.m0(parcelQ, 1);
                    return;
                } catch (RemoteException e10) {
                    zze.zzb("Service can't call client", e10);
                    return;
                }
            case 25:
                k80 k80Var = (k80) this.f17037c;
                co0 co0Var = (co0) obj;
                synchronized (k80Var) {
                    try {
                        ((un0) k80Var.f16374k).b(co0Var, (du0) this.f17036b);
                        du0 du0VarA = ((un0) k80Var.f16374k).a();
                        if (du0VarA != null) {
                            k80Var.a(du0VarA);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                ((yv0) ((v90) this.f17037c).f21140f).f22380c.S0(new uo0((uv0) this.f17036b, 5));
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lj1(df0 df0Var, ViewGroup viewGroup) {
        this.f17035a = 18;
        this.f17036b = (qh) df0Var;
        this.f17037c = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.sb, com.google.android.gms.internal.ads.hm0
    /* JADX INFO: renamed from: zza */
    public File mo166zza() {
        if (((File) this.f17036b) == null) {
            this.f17036b = new File(((Context) this.f17037c).getCacheDir(), "volley");
        }
        return (File) this.f17036b;
    }

    public /* synthetic */ lj1(Object obj, Object obj2, Object obj3, int i10) {
        this.f17035a = i10;
        this.f17036b = obj2;
        this.f17037c = obj3;
    }

    @Override // com.google.android.gms.internal.ads.hm0
    /* JADX INFO: renamed from: zza */
    public Object mo166zza() {
        VersionInfoParcel versionInfoParcel = (VersionInfoParcel) this.f17036b;
        int i10 = versionInfoParcel.buddyApkVersion;
        int i11 = versionInfoParcel.clientJarVersion;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(i11).length());
        sb2.append(i10);
        sb2.append(".");
        sb2.append(i11);
        String string = sb2.toString();
        if (!TextUtils.isEmpty("Google")) {
            if (!TextUtils.isEmpty(string)) {
                return new oy0(new fm("Google", string), (WebView) this.f17037c);
            }
            throw new IllegalArgumentException("Version is null or empty");
        }
        throw new IllegalArgumentException("Name is null or empty");
    }

    public /* synthetic */ lj1(Object obj, boolean z10, Object obj2, int i10) {
        this.f17035a = i10;
        this.f17036b = obj;
        this.f17037c = obj2;
    }

    public lj1(int i10) {
        this.f17035a = i10;
        switch (i10) {
            case 4:
                this.f17036b = new np0();
                this.f17037c = new t8();
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f17036b = byteArrayOutputStream;
                this.f17037c = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    public /* synthetic */ lj1(n0 n0Var) {
        this.f17035a = 1;
        this.f17037c = n0Var;
    }

    public lj1(i2 i2Var) {
        this.f17035a = 2;
        this.f17036b = i2Var;
        this.f17037c = new AtomicBoolean(false);
    }

    public lj1(ea eaVar) {
        this.f17035a = 5;
        this.f17037c = eaVar;
        this.f17036b = new gp0(new byte[4], 4);
    }

    public lj1(gm gmVar) {
        this.f17035a = 7;
        this.f17037c = gmVar;
        this.f17036b = new HashMap();
    }

    public lj1(ng0 ng0Var, String str, oq oqVar) {
        this.f17035a = 20;
        this.f17036b = str;
        this.f17037c = oqVar;
        Objects.requireNonNull(ng0Var);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener, com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    @Override // com.google.android.gms.internal.ads.ao, com.google.android.gms.internal.ads.tv0
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public void mo165zza() {
        switch (this.f17035a) {
            case 18:
                ya1 ya1Var = qe0.f19028o;
                ?? r2 = (qh) this.f17036b;
                Map mapZzj = r2.zzj();
                if (mapZzj != null) {
                    int i10 = ya1Var.f22210d;
                    int i11 = 0;
                    while (i11 < i10) {
                        Object obj = mapZzj.get((String) ya1Var.get(i11));
                        i11++;
                        if (obj != null) {
                            r2.onClick((ViewGroup) this.f17037c);
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                po0 po0Var = (po0) this.f17036b;
                hm hmVar = (hm) this.f17037c;
                im imVar = (im) ((jm) po0Var.f18747d);
                Parcel parcelQ = imVar.q();
                rh.e(parcelQ, hmVar);
                imVar.m0(parcelQ, 1);
                break;
        }
    }

    public lj1(yh0 yh0Var) {
        this.f17035a = 21;
        this.f17037c = yh0Var;
        this.f17036b = new ConcurrentHashMap();
    }

    public lj1(hl0 hl0Var, kx kxVar, ex exVar) {
        this.f17035a = 22;
        this.f17037c = kxVar;
        this.f17036b = exVar;
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo160zza(Object obj) {
        ((AppEventListener) obj).onAppEvent((String) this.f17036b, (String) this.f17037c);
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        switch (this.f17035a) {
            case 12:
                ((o00) this.f17037c).mo163zza();
                return;
            case 15:
                ((o8) this.f17036b).zza(th2);
                s80 s80Var = (s80) this.f17037c;
                s80Var.getClass();
                l00.f16613f.execute(new x60(s80Var, 2));
                return;
            case 20:
                return;
            case 22:
                try {
                    kx kxVar = (kx) this.f17037c;
                    com.google.android.gms.ads.internal.util.zzba zzbaVarZza = com.google.android.gms.ads.internal.util.zzba.zza(th2);
                    Parcel parcelQ = kxVar.q();
                    rh.c(parcelQ, zzbaVarZza);
                    kxVar.m0(parcelQ, 2);
                    return;
                } catch (RemoteException e10) {
                    zze.zzb("Service can't call client", e10);
                    return;
                }
            case 25:
                k80 k80Var = (k80) this.f17037c;
                synchronized (k80Var) {
                    try {
                        un0 un0Var = (un0) k80Var.f16374k;
                        du0 du0Var = (du0) this.f17036b;
                        un0Var.c(du0Var);
                        du0 du0VarA = ((un0) k80Var.f16374k).a();
                        if (du0Var.f13714v0) {
                            while (du0VarA != null) {
                                k80Var.a(du0VarA);
                                du0VarA = ((un0) k80Var.f16374k).a();
                            }
                        } else if (du0VarA != null) {
                            k80Var.a(du0VarA);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            default:
                ((yv0) ((v90) this.f17037c).f21140f).f22380c.S0(new md0(27, (uv0) this.f17036b, th2));
                return;
        }
    }

    private final void j(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.y30
    public /* synthetic */ void zza(boolean z10, int i10, String str, String str2) {
        cf0 cf0Var = (cf0) this.f17036b;
        Map map = (Map) this.f17037c;
        HashMap mapN = com.applovin.impl.ca.n("messageType", "validatorHtmlLoaded");
        mapN.put("id", (String) map.get("id"));
        cf0Var.f13151b.d(mapN);
    }

    @Override // com.google.android.gms.internal.ads.ba
    public void a(st0 st0Var, o2 o2Var, ga gaVar) {
    }
}
