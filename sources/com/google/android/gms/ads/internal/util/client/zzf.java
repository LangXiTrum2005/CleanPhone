package com.google.android.gms.ads.internal.util.client;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.pn;
import com.google.android.gms.internal.ads.y01;
import com.ironsource.O6;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.services.UnityAdsConstants;
import i9.e;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import l1.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r9.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f10979a = -1.0f;
    public static final Handler zza = new y01(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f10974b = AdView.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f10975c = InterstitialAd.class.getName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f10976d = AdManagerAdView.class.getName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f10977e = AdManagerInterstitialAd.class.getName();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f10978f = AdLoader.class.getName();

    public static String a(String str, String str2) {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static final void e(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i10, int i11) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i10);
        textView.setBackgroundColor(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i10);
        int iZzE = zzE(context, 3);
        int i12 = zzrVar.zzf;
        int i13 = zzrVar.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(i12 - iZzE, i13 - iZzE, 17));
        viewGroup.addView(frameLayout, i12, i13);
    }

    public static final boolean zzA(Context context) {
        int iC = e.f42929b.c(context, 12451000);
        return iC == 0 || iC == 2;
    }

    public static final boolean zzB() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int zzC(DisplayMetrics displayMetrics, int i10) {
        return Math.round(i10 / displayMetrics.density);
    }

    public static final void zzD(Context context, @Nullable String str, String str2, Bundle bundle, boolean z10, zze zzeVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString(O6.F, Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            e.f42929b.getClass();
            int iA = e.a(context);
            str = d.i(new StringBuilder(String.valueOf(iA).length() + 10), iA, ".261710000");
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzeVar.zza(builderAppendQueryParameter.toString());
    }

    public static final int zzE(Context context, int i10) {
        return zzw(context.getResources().getDisplayMetrics(), i10);
    }

    @Nullable
    public static final String zzF(Context context) {
        am.a(context);
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || zzy()) {
            string = "emulator";
        }
        return a(string, SameMD5.TAG);
    }

    public static Object zzd(Map map, Object obj, Object obj2) {
        return map.containsKey(obj) ? map.get(obj) : obj2;
    }

    @Nullable
    public static ActivityManager.MemoryInfo zze(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (NullPointerException unused) {
            zzo.zzi("Error retrieving the memory information.");
            return memoryInfo;
        }
    }

    @Nullable
    public static String zzf(Context context) {
        if (context == null) {
            return null;
        }
        try {
            Bundle bundle = c.a(context).d(128, context.getPackageName()).metaData;
            if (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                return bundle.getString("com.google.unity.ads.UNITY_VERSION");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    @Nullable
    public static String zzg(String str) {
        return a(str, SameMD5.TAG);
    }

    @Nullable
    public static String zzh(String str) {
        return a(str, "SHA-256");
    }

    public static String zzj() {
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    public static AdSize zzk(Context context, int i10, int i11, int i12) {
        int iRound;
        int iZzr = zzr(context, i12);
        if (iZzr == -1) {
            return AdSize.INVALID;
        }
        int iMin = Math.min(90, Math.round(iZzr * 0.15f));
        if (i10 > 655) {
            iRound = Math.round((i10 / 728.0f) * 90.0f);
        } else if (i10 > 632) {
            iRound = 81;
        } else if (i10 > 526) {
            iRound = Math.round((i10 / 468.0f) * 60.0f);
        } else {
            iRound = i10 > 432 ? 68 : Math.round((i10 / 320.0f) * 50.0f);
        }
        return new AdSize(i10, Math.max(Math.min(iRound, iMin), 50));
    }

    public static AdSize zzl(Context context, int i10, int i11) {
        int iZzr = zzr(context, i11);
        if (iZzr == -1) {
            return AdSize.INVALID;
        }
        return new AdSize(i10, Math.max(Math.min(Math.max(100, Math.round((i10 / 320.0f) * 100.0f)), Math.min(150, Math.round(iZzr * 0.2f))), 50));
    }

    public static boolean zzq(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) pn.f18740d.o());
    }

    public static int zzr(Context context, int i10) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i11 = configuration.orientation;
        if (i10 == 0) {
            i10 = i11;
        }
        return i10 == i11 ? Math.round(displayMetrics.heightPixels / displayMetrics.density) : Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    @Nullable
    public static PreloadConfiguration zzs(zzfp zzfpVar) {
        PreloadConfiguration preloadConfigurationZzt = zzt(zzfpVar);
        if (preloadConfigurationZzt == null) {
            return null;
        }
        PreloadConfiguration.Builder builder = new PreloadConfiguration.Builder(preloadConfigurationZzt.getAdUnitId());
        builder.setAdRequest(preloadConfigurationZzt.getAdRequest());
        builder.setBufferSize(preloadConfigurationZzt.getBufferSize());
        return builder.build();
    }

    @Nullable
    public static PreloadConfiguration zzt(@NonNull zzfp zzfpVar) {
        String str = zzfpVar.zza;
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return null;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfpVar.zzc;
        AdRequest.Builder builder = new AdRequest.Builder();
        List list = zzmVar.zze;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                builder.addKeyword((String) it.next());
            }
        }
        builder.zza(zzmVar.zzm);
        Bundle bundle = zzmVar.zzn;
        for (String str2 : bundle.keySet()) {
            builder.addCustomTargeting(str2, bundle.getString(str2));
        }
        builder.setAdString(zzmVar.zzx);
        String str3 = zzmVar.zzl;
        if (str3 != null) {
            builder.setContentUrl(str3);
        }
        builder.setNeighboringContentUrls(zzmVar.zzv);
        builder.setRequestAgent(zzmVar.zzp);
        AdRequest adRequestBuild = builder.build();
        PreloadConfiguration.Builder builder2 = new PreloadConfiguration.Builder(str, adFormat);
        builder2.setAdRequest(adRequestBuild);
        builder2.setBufferSize(zzfpVar.zzd);
        return builder2.build();
    }

    public static zzfp zzu(Context context, PreloadConfiguration preloadConfiguration, AdFormat adFormat) {
        PreloadConfiguration.Builder builder = new PreloadConfiguration.Builder(preloadConfiguration.getAdUnitId(), adFormat);
        builder.setAdRequest(preloadConfiguration.getAdRequest());
        builder.setBufferSize(preloadConfiguration.getBufferSize());
        return zzv(context, builder.build(), 2);
    }

    public static zzfp zzv(Context context, PreloadConfiguration preloadConfiguration, int i10) {
        boolean z10;
        int iIntValue;
        com.google.android.gms.ads.internal.client.zzm zzmVarZza = com.google.android.gms.ads.internal.client.zzq.zza.zza(context, preloadConfiguration.getAdRequest().zza());
        int iIntValue2 = 1;
        if (i10 == 1) {
            zzmVarZza.zzc.putBoolean("is_sdk_preload", true);
        } else {
            zzmVarZza.zzc.putBoolean("zenith_v2", true);
        }
        int bufferSize = preloadConfiguration.getBufferSize();
        if (bufferSize <= 0) {
            int iOrdinal = preloadConfiguration.getAdFormat().ordinal();
            if (iOrdinal == 1) {
                bufferSize = ((Integer) zzba.zzc().a(am.f12233l0)).intValue();
            } else if (iOrdinal == 2) {
                bufferSize = ((Integer) zzba.zzc().a(am.f12248m0)).intValue();
            } else if (iOrdinal != 5) {
                bufferSize = 1;
            } else {
                bufferSize = ((Integer) zzba.zzc().a(am.f12219k0)).intValue();
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int iOrdinal2 = preloadConfiguration.getAdFormat().ordinal();
        if (iOrdinal2 == 1) {
            iIntValue = ((Integer) zzba.zzc().a(am.f12188i0)).intValue();
        } else if (iOrdinal2 == 2) {
            iIntValue = ((Integer) zzba.zzc().a(am.f12203j0)).intValue();
        } else if (iOrdinal2 != 5) {
            iIntValue = 1;
        } else {
            iIntValue = ((Integer) zzba.zzc().a(am.f12174h0)).intValue();
        }
        int iMax = Math.max(Math.min(iIntValue, 15), 1);
        int iOrdinal3 = preloadConfiguration.getAdFormat().ordinal();
        if (iOrdinal3 == 1) {
            iIntValue2 = ((Integer) zzba.zzc().a(am.f12278o0)).intValue();
        } else if (iOrdinal3 == 2) {
            iIntValue2 = ((Integer) zzba.zzc().a(am.f12293p0)).intValue();
        } else if (iOrdinal3 == 5) {
            iIntValue2 = ((Integer) zzba.zzc().a(am.f12263n0)).intValue();
        }
        return new zzfp(preloadConfiguration.getAdUnitId(), preloadConfiguration.getAdFormat().getValue(), zzmVarZza, Math.max(Math.min(bufferSize, iMax), Math.min(iIntValue2, iMax)), z10);
    }

    public static final int zzw(DisplayMetrics displayMetrics, int i10) {
        return (int) TypedValue.applyDimension(1, i10, displayMetrics);
    }

    @Nullable
    public static final String zzx(StackTraceElement[] stackTraceElementArr, String str) {
        String className;
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f10974b.equalsIgnoreCase(className2) || f10975c.equalsIgnoreCase(className2) || f10976d.equalsIgnoreCase(className2) || f10977e.equalsIgnoreCase(className2) || f10978f.equalsIgnoreCase(className2))) {
                className = stackTraceElementArr[i11].getClassName();
                break;
            }
            i10 = i11;
        }
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb2 = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb2.append(stringTokenizer.nextToken());
                for (int i12 = 2; i12 > 0 && stringTokenizer.hasMoreElements(); i12--) {
                    sb2.append(".");
                    sb2.append(stringTokenizer.nextToken());
                }
                str = sb2.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    public static final boolean zzy() {
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12071ad)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return zBooleanValue && Build.HARDWARE.contains("ranchu");
    }

    public static final boolean zzz(Context context, int i10) {
        return e.f42929b.c(context, i10) == 0;
    }

    public final JSONArray b(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c(jSONArray, it.next());
        }
        return jSONArray;
    }

    public final void c(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(zzo((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(zzm((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(b((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(f((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    public final void d(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (((Boolean) zzba.zzc().a(am.f12368u)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzo((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, zzm((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), b((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, b(Arrays.asList((Object[]) obj)));
            return;
        }
        int i10 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            Integer[] numArr = new Integer[length];
            while (i10 < length) {
                numArr[i10] = Integer.valueOf(iArr[i10]);
                i10++;
            }
            jSONObject.put(str, f(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length2 = dArr.length;
            Double[] dArr2 = new Double[length2];
            while (i10 < length2) {
                dArr2[i10] = Double.valueOf(dArr[i10]);
                i10++;
            }
            jSONObject.put(str, f(dArr2));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length3 = jArr.length;
            Long[] lArr = new Long[length3];
            while (i10 < length3) {
                lArr[i10] = Long.valueOf(jArr[i10]);
                i10++;
            }
            jSONObject.put(str, f(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        int length4 = zArr.length;
        Boolean[] boolArr = new Boolean[length4];
        while (i10 < length4) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
            i10++;
        }
        jSONObject.put(str, f(boolArr));
    }

    public final JSONArray f(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            c(jSONArray, obj);
        }
        return jSONArray;
    }

    public final int zza(Context context, int i10) {
        if (this.f10979a < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            synchronized (this) {
                try {
                    if (this.f10979a < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f10979a = displayMetrics.density;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Math.round(i10 / this.f10979a);
    }

    public final void zzb(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            zzo.zzi(str2);
        }
        e(viewGroup, zzrVar, str, -65536, -16777216);
    }

    public final void zzc(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, @Nullable String str) {
        e(viewGroup, zzrVar, "Ads by Google", -16777216, -1);
    }

    public final void zzi(final Context context, @Nullable String str, String str2, Bundle bundle, boolean z10) {
        zzD(context, str, "gmob-apps", bundle, true, new zze() { // from class: com.google.android.gms.ads.internal.util.client.zzd
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final /* synthetic */ zzt zza(String str3) {
                new zzc(this.f10972a, context, str3).start();
                return zzt.zza;
            }
        });
    }

    public final JSONObject zzm(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                d(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e10) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e10.getMessage())));
        }
    }

    public final JSONObject zzn(@Nullable Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return zzo(bundle);
            } catch (JSONException e10) {
                zzo.zzg("Error converting Bundle to JSON", e10);
            }
        }
        return null;
    }

    public final JSONObject zzo(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            d(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }
}
