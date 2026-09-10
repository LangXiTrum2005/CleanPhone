package ea;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.applovin.impl.ca;
import com.google.android.gms.internal.ads.n20;
import com.google.android.gms.internal.measurement.a7;
import com.ironsource.Xa;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l4 extends t1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f39559i = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f39560j = {"_err"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f39561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f39562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b4.d f39564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f39565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f39566h;

    public l4(m1 m1Var) {
        super(m1Var);
        this.f39566h = null;
        this.f39562d = new AtomicLong(0L);
    }

    public static boolean A1(Context context) {
        ActivityInfo receiverInfo;
        k9.c0.h(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void B1(w2 w2Var, Bundle bundle, boolean z10) {
        if (bundle != null && w2Var != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = w2Var.f39862a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = w2Var.f39863b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", w2Var.f39864c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && w2Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean F1(String str) {
        k9.c0.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean H1(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static String N0(int i10, String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    public static boolean R1(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void Y0(k4 k4Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        d1(i10, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        k4Var.a(str, bundle, "_err");
    }

    public static MessageDigest Z0() {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static long a1(byte[] bArr) {
        k9.c0.h(bArr);
        int length = bArr.length;
        int i10 = 0;
        k9.c0.k(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (((long) bArr[i11]) & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    public static boolean b1(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final boolean d1(int i10, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    public static boolean g1(String str, String[] strArr) {
        k9.c0.h(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean h1(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    public static boolean j1(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static byte[] o1(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList z1(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.APP_ID, eVar.f39352a);
            bundle.putString("origin", eVar.f39353b);
            bundle.putLong("creation_timestamp", eVar.f39355d);
            bundle.putString("name", eVar.f39354c.f39485b);
            Object objZza = eVar.f39354c.zza();
            k9.c0.h(objZza);
            z1.c(bundle, objZza);
            bundle.putBoolean("active", eVar.f39356e);
            String str = eVar.f39357f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            u uVar = eVar.f39358g;
            if (uVar != null) {
                bundle.putString("timed_out_event_name", uVar.f39771a);
                t tVar = uVar.f39772b;
                if (tVar != null) {
                    bundle.putBundle("timed_out_event_params", tVar.n());
                }
            }
            bundle.putLong("trigger_timeout", eVar.f39359h);
            u uVar2 = eVar.f39360i;
            if (uVar2 != null) {
                bundle.putString("triggered_event_name", uVar2.f39771a);
                t tVar2 = uVar2.f39772b;
                if (tVar2 != null) {
                    bundle.putBundle("triggered_event_params", tVar2.n());
                }
            }
            bundle.putLong("triggered_timestamp", eVar.f39354c.f39486c);
            bundle.putLong("time_to_live", eVar.f39361j);
            u uVar3 = eVar.f39362k;
            if (uVar3 != null) {
                bundle.putString("expired_event_name", uVar3.f39771a);
                t tVar3 = uVar3.f39772b;
                if (tVar3 != null) {
                    bundle.putBundle("expired_event_params", tVar3.n());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final String C1() {
        byte[] bArr = new byte[16];
        E1().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long D1() {
        long andIncrement;
        long j10;
        AtomicLong atomicLong = this.f39562d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f39562d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((m1) this.f3623a).f39592k.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i10 = this.f39563e + 1;
            this.f39563e = i10;
            j10 = jNextLong + ((long) i10);
        }
        return j10;
    }

    public final SecureRandom E1() {
        G0();
        if (this.f39561c == null) {
            this.f39561c = new SecureRandom();
        }
        return this.f39561c;
    }

    public final Bundle G1(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        m1 m1Var = (m1) this.f3623a;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter2 = uri.getQueryParameter("utm_campaign");
                    queryParameter3 = uri.getQueryParameter("utm_source");
                    queryParameter4 = uri.getQueryParameter("utm_medium");
                    queryParameter5 = uri.getQueryParameter("gclid");
                    queryParameter6 = uri.getQueryParameter("gbraid");
                    queryParameter7 = uri.getQueryParameter("utm_id");
                    queryParameter8 = uri.getQueryParameter("dclid");
                    queryParameter9 = uri.getQueryParameter("srsltid");
                    queryParameter = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (!TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter5) || !TextUtils.isEmpty(queryParameter6) || !TextUtils.isEmpty(queryParameter7) || !TextUtils.isEmpty(queryParameter8) || !TextUtils.isEmpty(queryParameter9) || !TextUtils.isEmpty(queryParameter)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString(MBInterstitialActivity.INTENT_CAMAPIGN, queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("source", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString(Constants.MEDIUM, queryParameter4);
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("gclid", queryParameter5);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("gbraid", queryParameter6);
                    }
                    String queryParameter10 = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString("gad_source", queryParameter10);
                    }
                    String queryParameter11 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter11)) {
                        bundle.putString("term", queryParameter11);
                    }
                    String queryParameter12 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter12)) {
                        bundle.putString("content", queryParameter12);
                    }
                    String queryParameter13 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("aclid", queryParameter13);
                    }
                    String queryParameter14 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("cp1", queryParameter14);
                    }
                    String queryParameter15 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter15)) {
                        bundle.putString("anid", queryParameter15);
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("campaign_id", queryParameter7);
                    }
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("dclid", queryParameter8);
                    }
                    String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter16)) {
                        bundle.putString("source_platform", queryParameter16);
                    }
                    String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter17)) {
                        bundle.putString("creative_format", queryParameter17);
                    }
                    String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter18)) {
                        bundle.putString("marketing_tactic", queryParameter18);
                    }
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("srsltid", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("sfmc_id", queryParameter);
                    }
                    for (String str : uri.getQueryParameterNames()) {
                        if (str.startsWith("gad_")) {
                            String queryParameter19 = uri.getQueryParameter(str);
                            if (!TextUtils.isEmpty(queryParameter19)) {
                                bundle.putString(str, queryParameter19);
                            }
                        }
                    }
                    if (m1Var.f39585d.R0(null, d0.f39289a1)) {
                        String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        m1Var.f39585d.getClass();
                        int iMax = Math.max(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, NotificationCompat.FLAG_LOCAL_ONLY);
                        if (string.length() > iMax) {
                            string = N0(iMax - 3, string, true);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            bundle.putString("deep_link_url", string);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e10) {
                s0 s0Var = m1Var.f39587f;
                m1.h(s0Var);
                s0Var.f39756i.c(e10, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    @Override // ea.t1
    public final boolean H0() {
        return true;
    }

    public final boolean I1(String str, String str2) {
        m1 m1Var = (m1) this.f3623a;
        if (str2 == null) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39755h.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39755h.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            s0 s0Var3 = m1Var.f39587f;
            m1.h(s0Var3);
            s0Var3.f39755h.d("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                s0 s0Var4 = m1Var.f39587f;
                m1.h(s0Var4);
                s0Var4.f39755h.d("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean J1(String str, String str2) {
        m1 m1Var = (m1) this.f3623a;
        if (str2 == null) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39755h.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39755h.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                s0 s0Var3 = m1Var.f39587f;
                m1.h(s0Var3);
                s0Var3.f39755h.d("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                s0 s0Var4 = m1Var.f39587f;
                m1.h(s0Var4);
                s0Var4.f39755h.d("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean K0(String str, int i10, String str2, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) > i10) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39758k.e("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
            return false;
        }
        return true;
    }

    public final boolean K1(String str, String[] strArr, String[] strArr2, String str2) {
        m1 m1Var = (m1) this.f3623a;
        if (str2 == null) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39755h.c(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(f39559i[i10])) {
                s0 s0Var2 = m1Var.f39587f;
                m1.h(s0Var2);
                s0Var2.f39755h.d("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !g1(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && g1(str2, strArr2)) {
            return true;
        }
        s0 s0Var3 = m1Var.f39587f;
        m1.h(s0Var3);
        s0Var3.f39755h.d("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final void L0(String str, String str2, Bundle bundle, List list, boolean z10) {
        int iP1;
        int iO0;
        list = list;
        if (bundle == null) {
            return;
        }
        m1 m1Var = (m1) this.f3623a;
        g gVar = m1Var.f39585d;
        s0 s0Var = m1Var.f39587f;
        o0 o0Var = m1Var.f39591j;
        l4 l4Var = ((m1) gVar.f3623a).f39590i;
        m1.f(l4Var);
        int i10 = true != l4Var.p1(231100000) ? 0 : 35;
        int i11 = 0;
        boolean z11 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iP1 = !z10 ? P1(str3) : 0;
                if (iP1 == 0) {
                    iP1 = Q1(str3);
                }
            } else {
                iP1 = 0;
            }
            if (iP1 != 0) {
                U0(bundle, iP1, str3, iP1 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (R1(bundle.get(str3))) {
                    m1.h(s0Var);
                    s0Var.f39758k.e("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iO0 = 22;
                } else {
                    iO0 = O0(str, str3, bundle.get(str3), bundle, list, z10, false);
                }
                if (iO0 != 0 && !"_ev".equals(str3)) {
                    U0(bundle, iO0, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (F1(str3) && !g1(str3, z1.f39946k)) {
                    i11++;
                    if (!p1(231100000)) {
                        m1.h(s0Var);
                        s0Var.f39755h.d("Item array not supported on client's version of Google Play Services (Android Only)", o0Var.a(str), o0Var.e(bundle));
                        d1(23, bundle);
                        bundle.remove(str3);
                    } else if (i11 > i10) {
                        if (!z11) {
                            m1.h(s0Var);
                            s0Var.f39755h.d(ca.m(new StringBuilder(String.valueOf(i10).length() + 55), "Item can't contain more than ", i10, " item-scoped custom params"), o0Var.a(str), o0Var.e(bundle));
                        }
                        d1(28, bundle);
                        bundle.remove(str3);
                        z11 = true;
                    }
                }
            }
        }
    }

    public final boolean L1(int i10, String str, String str2) {
        m1 m1Var = (m1) this.f3623a;
        if (str2 == null) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39755h.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        s0 s0Var2 = m1Var.f39587f;
        m1.h(s0Var2);
        s0Var2.f39755h.e("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    public final boolean M0(String str) {
        m1 m1Var = (m1) this.f3623a;
        if (TextUtils.isEmpty(str)) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39755h.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        k9.c0.h(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        s0 s0Var2 = m1Var.f39587f;
        m1.h(s0Var2);
        s0Var2.f39755h.c(s0.O0(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final int M1(String str) {
        if (!J1(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (K1(NotificationCompat.CATEGORY_EVENT, z1.f39936a, ((m1) this.f3623a).f39585d.R0(null, d0.f39304f1) ? z1.f39938c : z1.f39937b, str)) {
            return !L1(40, NotificationCompat.CATEGORY_EVENT, str) ? 2 : 0;
        }
        return 13;
    }

    public final boolean N1(String str) {
        return ((m1) this.f3623a).f39585d.R0(null, d0.f39304f1) ? g1(str, z1.f39940e) : g1(str, z1.f39939d);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    public final int O0(String str, String str2, Object obj, Bundle bundle, List list, boolean z10, boolean z11) {
        int i10;
        int size;
        m1 m1Var = (m1) this.f3623a;
        G0();
        int i11 = 0;
        if (!R1(obj)) {
            i10 = 0;
        } else {
            if (!z11) {
                return 21;
            }
            if (!g1(str2, z1.f39945j)) {
                return 20;
            }
            h3 h3VarK = m1Var.k();
            h3VarK.G0();
            h3VarK.H0();
            if (h3VarK.N0()) {
                l4 l4Var = ((m1) h3VarK.f3623a).f39590i;
                m1.f(l4Var);
                if (l4Var.q1() < 200900) {
                    return 25;
                }
            }
            boolean z12 = obj instanceof Parcelable[];
            if (z12) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i10 = 0;
            }
            if (size > 200) {
                s0 s0Var = m1Var.f39587f;
                m1.h(s0Var);
                s0Var.f39758k.e("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i10 = 17;
                if (z12) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
            } else {
                i10 = 0;
            }
        }
        boolean zJ1 = j1(str);
        int iMax = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        if (zJ1 || j1(str2)) {
            m1Var.f39585d.getClass();
            iMax = Math.max(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, NotificationCompat.FLAG_LOCAL_ONLY);
        } else {
            m1Var.f39585d.getClass();
        }
        if (!K0("param", iMax, str2, obj)) {
            if (!z11) {
                return 4;
            }
            if (obj instanceof Bundle) {
                L0(str, str2, (Bundle) obj, list, z10);
                return i10;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i11 < length) {
                    Parcelable parcelable = parcelableArr2[i11];
                    if (!(parcelable instanceof Bundle)) {
                        s0 s0Var2 = m1Var.f39587f;
                        m1.h(s0Var2);
                        s0Var2.f39758k.d("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                        return 4;
                    }
                    L0(str, str2, (Bundle) parcelable, list, z10);
                    i11++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    if (!(obj2 instanceof Bundle)) {
                        s0 s0Var3 = m1Var.f39587f;
                        m1.h(s0Var3);
                        s0Var3.f39758k.d("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str2);
                        return 4;
                    }
                    L0(str, str2, (Bundle) obj2, list, z10);
                    i11++;
                }
            }
        }
        return i10;
    }

    public final int O1(String str) {
        if (!J1("user property", str)) {
            return 6;
        }
        if (!K1("user property", z1.l, null, str)) {
            return 15;
        }
        ((m1) this.f3623a).getClass();
        return !L1(24, "user property", str) ? 6 : 0;
    }

    public final Object P0(Object obj, String str) {
        m1 m1Var = (m1) this.f3623a;
        boolean zEquals = "_ev".equals(str);
        int iMax = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        if (zEquals) {
            m1Var.f39585d.getClass();
            return e1(Math.max(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, NotificationCompat.FLAG_LOCAL_ONLY), obj, true, true);
        }
        if (j1(str)) {
            m1Var.f39585d.getClass();
            iMax = Math.max(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, NotificationCompat.FLAG_LOCAL_ONLY);
        } else {
            m1Var.f39585d.getClass();
        }
        return e1(iMax, obj, false, true);
    }

    public final int P1(String str) {
        if (!I1("event param", str)) {
            return 3;
        }
        if (!K1("event param", null, null, str)) {
            return 14;
        }
        ((m1) this.f3623a).getClass();
        return !L1(40, "event param", str) ? 3 : 0;
    }

    public final Bundle Q0(String str, Bundle bundle, List list, boolean z10) {
        int iP1;
        boolean zG1 = g1(str, z1.f39942g);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        m1 m1Var = (m1) this.f3623a;
        g gVar = m1Var.f39585d;
        o0 o0Var = m1Var.f39591j;
        l4 l4Var = ((m1) gVar.f3623a).f39590i;
        m1.f(l4Var);
        int i10 = l4Var.p1(201500000) ? 100 : 25;
        int i11 = 0;
        boolean z11 = false;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iP1 = !z10 ? P1(str2) : 0;
                if (iP1 == 0) {
                    iP1 = Q1(str2);
                }
            } else {
                iP1 = 0;
            }
            if (iP1 != 0) {
                U0(bundle2, iP1, str2, iP1 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iO0 = O0(str, str2, bundle.get(str2), bundle2, list, z10, zG1);
                if (iO0 == 17) {
                    U0(bundle2, 17, str2, Boolean.FALSE);
                } else if (iO0 != 0 && !"_ev".equals(str2)) {
                    U0(bundle2, iO0, iO0 == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (F1(str2)) {
                    i11++;
                    if (i11 > i10) {
                        if (!z11) {
                            String strM = ca.m(new StringBuilder(String.valueOf(i10).length() + 37), "Event can't contain more than ", i10, " params");
                            s0 s0Var = m1Var.f39587f;
                            m1.h(s0Var);
                            s0Var.f39755h.d(strM, o0Var.a(str), o0Var.e(bundle));
                        }
                        d1(5, bundle2);
                        bundle2.remove(str2);
                        z11 = true;
                    }
                }
            }
        }
        return bundle2;
    }

    public final int Q1(String str) {
        if (!J1("event param", str)) {
            return 3;
        }
        if (!K1("event param", null, null, str)) {
            return 14;
        }
        ((m1) this.f3623a).getClass();
        return !L1(40, "event param", str) ? 3 : 0;
    }

    public final void R0(n20 n20Var, int i10) {
        Bundle bundle = (Bundle) n20Var.f17623f;
        int i11 = 0;
        boolean z10 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (F1(str) && (i11 = i11 + 1) > i10) {
                if (!z10) {
                    String strM = ca.m(new StringBuilder(String.valueOf(i10).length() + 37), "Event can't contain more than ", i10, " params");
                    m1 m1Var = (m1) this.f3623a;
                    s0 s0Var = m1Var.f39587f;
                    o0 o0Var = m1Var.f39591j;
                    m1.h(s0Var);
                    s0Var.f39755h.d(strM, o0Var.a((String) n20Var.f17621d), o0Var.e(bundle));
                    d1(5, bundle);
                }
                bundle.remove(str);
                z10 = true;
            }
        }
    }

    public final void S0(Parcelable[] parcelableArr, int i10) {
        k9.c0.h(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i11 = 0;
            boolean z10 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (F1(str) && !g1(str, z1.f39946k) && (i11 = i11 + 1) > i10) {
                    if (!z10) {
                        m1 m1Var = (m1) this.f3623a;
                        s0 s0Var = m1Var.f39587f;
                        o0 o0Var = m1Var.f39591j;
                        m1.h(s0Var);
                        s0Var.f39755h.d(ca.m(new StringBuilder(String.valueOf(i10).length() + 60), "Param can't contain more than ", i10, " item-scoped custom parameters"), o0Var.b(str), o0Var.e(bundle));
                    }
                    d1(28, bundle);
                    bundle.remove(str);
                    z10 = true;
                }
            }
        }
    }

    public final void T0(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                l4 l4Var = ((m1) this.f3623a).f39590i;
                m1.f(l4Var);
                l4Var.X0(str, bundle2.get(str), bundle);
            }
        }
    }

    public final void U0(Bundle bundle, int i10, String str, Object obj) {
        if (d1(i10, bundle)) {
            ((m1) this.f3623a).getClass();
            bundle.putString("_ev", N0(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int V0(Object obj, String str) {
        return "_ldl".equals(str) ? K0("user property referrer", f1(str), str, obj) : K0("user property", f1(str), str, obj) ? 0 : 7;
    }

    public final Object W0(Object obj, String str) {
        return "_ldl".equals(str) ? e1(f1(str), obj, true, false) : e1(f1(str), obj, false, false);
    }

    public final void X0(String str, Object obj, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            m1 m1Var = (m1) this.f3623a;
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39758k.d("Not putting event parameter. Invalid value type. name, type", m1Var.f39591j.b(str), simpleName);
        }
    }

    public final long c1() {
        long j10;
        Object e10;
        Integer num;
        G0();
        m1 m1Var = (m1) this.f3623a;
        l0 l0VarM = m1Var.m();
        s0 s0Var = m1Var.f39587f;
        Integer num2 = null;
        if (!h1((String) d0.f39327q0.a(null), l0VarM.M0())) {
            return 0L;
        }
        boolean zBooleanValue = false;
        if (SdkExtensions.getExtensionVersion(30) < 4) {
            j10 = 8;
        } else {
            j10 = (SdkExtensions.getExtensionVersion(30) > 3 ? SdkExtensions.getExtensionVersion(1000000) : 0) < ((Integer) d0.f39316k0.a(null)).intValue() ? 16L : 0L;
        }
        if (!i1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0) {
            if (this.f39565g != null) {
                zBooleanValue = this.f39565g.booleanValue();
            } else {
                if (this.f39564f == null) {
                    this.f39564f = b4.d.b(m1Var.f39582a);
                }
                b4.d dVar = this.f39564f;
                if (dVar != null) {
                    try {
                        num = (Integer) dVar.c().get(Xa.f27908s, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e11) {
                                e10 = e11;
                                num2 = num;
                                m1.h(s0Var);
                                s0Var.f39756i.c(e10, "Measurement manager api exception");
                                this.f39565g = Boolean.FALSE;
                                num = num2;
                            }
                        }
                        this.f39565g = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e12) {
                        e10 = e12;
                    }
                    m1.h(s0Var);
                    s0Var.f39760n.c(num, "Measurement manager api status result");
                    zBooleanValue = this.f39565g.booleanValue();
                }
            }
            if (!zBooleanValue) {
                j10 = 64;
            }
        }
        if (j10 == 0) {
            return 1L;
        }
        return j10;
    }

    public final Object e1(int i10, Object obj, boolean z10, boolean z11) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return N0(i10, obj.toString(), z10);
        }
        if (!z11) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleL1 = l1((Bundle) parcelable);
                if (!bundleL1.isEmpty()) {
                    arrayList.add(bundleL1);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int f1(String str) {
        m1 m1Var = (m1) this.f3623a;
        if ("_ldl".equals(str)) {
            m1Var.getClass();
            return com.ironsource.mediationsdk.metadata.a.f29616n;
        }
        if ("_id".equals(str)) {
            m1Var.getClass();
            return NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if ("_lgclid".equals(str)) {
            m1Var.getClass();
            return 100;
        }
        m1Var.getClass();
        return 36;
    }

    public final boolean i1(String str) {
        G0();
        m1 m1Var = (m1) this.f3623a;
        if (r9.c.a(m1Var.f39582a).f40681b.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        s0 s0Var = m1Var.f39587f;
        m1.h(s0Var);
        s0Var.f39759m.c(str, "Permission not granted");
        return false;
    }

    public final boolean k1(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((m1) this.f3623a).f39585d.K0("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle l1(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objP0 = P0(bundle.get(str), str);
                if (objP0 == null) {
                    m1 m1Var = (m1) this.f3623a;
                    s0 s0Var = m1Var.f39587f;
                    m1.h(s0Var);
                    s0Var.f39758k.c(m1Var.f39591j.b(str), "Param value can't be null");
                } else {
                    X0(str, objP0, bundle2);
                }
            }
        }
        return bundle2;
    }

    public final u m1(String str, Bundle bundle, String str2, long j10, long j11, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (M1(str) != 0) {
            m1 m1Var = (m1) this.f3623a;
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39753f.c(m1Var.f39591j.c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleQ0 = Q0(str, bundle2, Collections.singletonList("_o"), true);
        if (z10) {
            bundleQ0 = l1(bundleQ0);
        }
        k9.c0.h(bundleQ0);
        return new u(str, new t(bundleQ0), str2, j10, j11);
    }

    public final boolean n1(Context context, String str) {
        Signature[] signatureArr;
        m1 m1Var = (m1) this.f3623a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoF = r9.c.a(context).f(64, str);
            if (packageInfoF == null || (signatureArr = packageInfoF.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39753f.c(e10, "Package name not found");
            return true;
        } catch (CertificateException e11) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39753f.c(e11, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean p1(int i10) {
        Boolean bool = ((m1) this.f3623a).k().f39459e;
        if (q1() < i10 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int q1() {
        if (this.f39566h == null) {
            m1 m1Var = (m1) this.f3623a;
            i9.e eVar = i9.e.f42929b;
            Context context = m1Var.f39582a;
            eVar.getClass();
            this.f39566h = Integer.valueOf(i9.e.a(context) / 1000);
        }
        return this.f39566h.intValue();
    }

    public final void r1(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39756i.c(Long.valueOf(j11), "Params already contained engagement");
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void s1(String str, a7 a7Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            a7Var.e1(bundle);
        } catch (RemoteException e10) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39756i.c(e10, "Error returning string value to wrapper");
        }
    }

    public final void t1(a7 a7Var, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            a7Var.e1(bundle);
        } catch (RemoteException e10) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39756i.c(e10, "Error returning long value to wrapper");
        }
    }

    public final void u1(a7 a7Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            a7Var.e1(bundle);
        } catch (RemoteException e10) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39756i.c(e10, "Error returning int value to wrapper");
        }
    }

    public final void v1(a7 a7Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            a7Var.e1(bundle);
        } catch (RemoteException e10) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39756i.c(e10, "Error returning byte array to wrapper");
        }
    }

    public final void w1(a7 a7Var, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            a7Var.e1(bundle);
        } catch (RemoteException e10) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39756i.c(e10, "Error returning boolean value to wrapper");
        }
    }

    public final void x1(a7 a7Var, Bundle bundle) {
        try {
            a7Var.e1(bundle);
        } catch (RemoteException e10) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39756i.c(e10, "Error returning bundle value to wrapper");
        }
    }

    public final void y1(a7 a7Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            a7Var.e1(bundle);
        } catch (RemoteException e10) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39756i.c(e10, "Error returning bundle list to wrapper");
        }
    }
}
