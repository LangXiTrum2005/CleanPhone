package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.FragmentActivity;
import com.applovin.shadow.okio.Segment;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.ads.RequestConfiguration;
import com.p004ironsource.d9;
import com.p004ironsource.mediationsdk.metadata.a;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/Utility;", "", "GraphMeRequestWithCacheCallback", "Mapper", "PermissionsLists", "Predicate", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class Utility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f16377a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f16378b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f16379c = -1;
    public static long d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f16380e = "";
    public static String f = "";
    public static String g = "NoCarrier";

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface GraphMeRequestWithCacheCallback {
        void a(JSONObject jSONObject);

        void b(FacebookException facebookException);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/internal/Utility$Mapper;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "K", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Mapper<T, K> {
        Object apply(Object obj);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/Utility$PermissionsLists;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class PermissionsLists {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f16381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f16382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f16383c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/Utility$Predicate;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Predicate<T> {
    }

    public static final boolean A(FragmentActivity context) {
        Intrinsics.f(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        return str != null && new Regex(".+_cheets|cheets_.+").b(str);
    }

    public static final boolean B() {
        if (!CrashShieldHandler.b(Utility.class)) {
            try {
                JSONObject jSONObjectP = p();
                if (jSONObjectP != null) {
                    try {
                        JSONArray jSONArray = jSONObjectP.getJSONArray("data_processing_options");
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            String string = jSONArray.getString(i2);
                            Intrinsics.e(string, "options.getString(i)");
                            String lowerCase = string.toLowerCase();
                            Intrinsics.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                            if (lowerCase.equals("ldu")) {
                                return true;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(Utility.class, th);
                return false;
            }
        }
        return false;
    }

    public static final boolean C(String str) {
        return str == null || str.length() == 0;
    }

    public static final boolean D(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static final boolean E(Uri uri) {
        if (uri != null) {
            return "http".equalsIgnoreCase(uri.getScheme()) || HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme());
        }
        return false;
    }

    public static final HashSet F(JSONArray jSONArray) throws JSONException {
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String string = jSONArray.getString(i2);
            Intrinsics.e(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final ArrayList G(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        return arrayList;
    }

    public static final HashMap H(String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Intrinsics.e(key, "key");
                String string = jSONObject.getString(key);
                Intrinsics.e(string, "jsonObject.getString(key)");
                map.put(key, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final ArrayList I(List list, Mapper mapper) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object objApply = mapper.apply(it.next());
            if (objApply != null) {
                arrayList.add(objApply);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    public static final String J(Map map) {
        Intrinsics.f(map, "map");
        String string = "";
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
        }
        Intrinsics.e(string, "try {\n        val jsonOb…ion) {\n        \"\"\n      }");
        return string;
    }

    public static final String K(String key) {
        Intrinsics.f(key, "key");
        byte[] bytes = key.getBytes(Charsets.f44691a);
        Intrinsics.e(bytes, "(this as java.lang.String).getBytes(charset)");
        return x("MD5", bytes);
    }

    public static final Bundle L(String str) {
        Bundle bundle = new Bundle();
        if (!C(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object[] array = StringsKt.J(str, 0, 6, new String[]{d9.i.f24749c}).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            for (String str2 : (String[]) array) {
                Object[] array2 = StringsKt.J(str2, 0, 6, new String[]{d9.i.f24747b}).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array2;
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), URLDecoder.decode(strArr[1], "UTF-8"));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException unused) {
                    HashSet hashSet = FacebookSdk.f15915a;
                }
            }
        }
        return bundle;
    }

    public static final void M(String str, ArrayList arrayList, Bundle bundle) {
        if (arrayList != null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(",");
            }
            bundle.putString(str, sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "");
        }
    }

    public static final void N(Bundle bundle, String str, Object obj) {
        Intrinsics.f(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
        } else if (obj instanceof JSONObject) {
            bundle.putString(str, obj.toString());
        }
    }

    public static final void O(Bundle bundle, String str, String str2) {
        if (C(str2)) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static final String P(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[a.f25965n];
                    while (true) {
                        int i2 = inputStreamReader.read(cArr);
                        if (i2 == -1) {
                            String string = sb.toString();
                            Intrinsics.e(string, "stringBuilder.toString()");
                            e(bufferedInputStream);
                            e(inputStreamReader);
                            return string;
                        }
                        sb.append(cArr, 0, i2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    e(bufferedInputStream);
                    e(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    public static final HashMap Q(Parcel parcel) {
        Intrinsics.f(parcel, "parcel");
        int i2 = parcel.readInt();
        if (i2 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            map.put(parcel.readString(), parcel.readString());
        }
        return map;
    }

    public static final void R(JSONObject jSONObject, Context appContext) throws JSONException {
        String str;
        Locale locale;
        int i2;
        Intrinsics.f(appContext, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        int i3 = 0;
        if (f16378b == -1 || System.currentTimeMillis() - f16378b >= 1800000) {
            f16378b = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                Intrinsics.e(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
                f16380e = displayName;
                String id = timeZone.getID();
                Intrinsics.e(id, "tz.id");
                f = id;
            } catch (AssertionError | Exception unused) {
            }
            if (g.equals("NoCarrier")) {
                try {
                    Object systemService = appContext.getSystemService("phone");
                    if (systemService == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                    }
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    Intrinsics.e(networkOperatorName, "telephonyManager.networkOperatorName");
                    g = networkOperatorName;
                } catch (Exception unused2) {
                }
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    File path = Environment.getExternalStorageDirectory();
                    Intrinsics.e(path, "path");
                    StatFs statFs = new StatFs(path.getPath());
                    f16379c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
                }
                f16379c = Math.round(f16379c / 1.073741824E9d);
            } catch (Exception unused3) {
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    File path2 = Environment.getExternalStorageDirectory();
                    Intrinsics.e(path2, "path");
                    StatFs statFs2 = new StatFs(path2.getPath());
                    d = ((long) statFs2.getAvailableBlocks()) * ((long) statFs2.getBlockSize());
                }
                d = Math.round(d / 1.073741824E9d);
            } catch (Exception unused4) {
            }
        }
        String packageName = appContext.getPackageName();
        int i4 = -1;
        try {
            PackageInfo packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i4 = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused5) {
            str = "";
        }
        jSONArray.put(packageName);
        jSONArray.put(i4);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            Resources resources = appContext.getResources();
            Intrinsics.e(resources, "appContext.resources");
            locale = resources.getConfiguration().locale;
        } catch (Exception unused6) {
            locale = Locale.getDefault();
        }
        StringBuilder sb = new StringBuilder();
        Intrinsics.e(locale, "locale");
        sb.append(locale.getLanguage());
        sb.append("_");
        sb.append(locale.getCountry());
        jSONArray.put(sb.toString());
        jSONArray.put(f16380e);
        jSONArray.put(g);
        double d2 = 0.0d;
        try {
            Object systemService2 = appContext.getSystemService(d9.h.d);
            if (!(systemService2 instanceof DisplayManager)) {
                systemService2 = null;
            }
            DisplayManager displayManager = (DisplayManager) systemService2;
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                int i5 = displayMetrics.widthPixels;
                try {
                    i3 = displayMetrics.heightPixels;
                    d2 = displayMetrics.density;
                } catch (Exception unused7) {
                }
                i2 = i3;
                i3 = i5;
            } else {
                i2 = 0;
            }
        } catch (Exception unused8) {
        }
        jSONArray.put(i3);
        jSONArray.put(i2);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        int i6 = f16377a;
        if (i6 <= 0) {
            try {
                File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(Utility$refreshBestGuessNumberOfCPUCores$cpuFiles$1.f16386a);
                if (fileArrListFiles != null) {
                    f16377a = fileArrListFiles.length;
                }
            } catch (Exception unused9) {
            }
            if (f16377a <= 0) {
                f16377a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
            }
            i6 = f16377a;
        }
        jSONArray.put(i6);
        jSONArray.put(f16379c);
        jSONArray.put(d);
        jSONArray.put(f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static final String S(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(Charsets.f44691a);
        Intrinsics.e(bytes, "(this as java.lang.String).getBytes(charset)");
        return x("SHA-256", bytes);
    }

    public static final void T(Parcel parcel, HashMap map) {
        Intrinsics.f(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static final Uri b(Bundle bundle, String str, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(HttpRequest.DEFAULT_SCHEME);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri uriBuild = builder.build();
        Intrinsics.e(uriBuild, "builder.build()");
        return uriBuild;
    }

    public static void c(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie != null) {
            Object[] array = StringsKt.J(cookie, 0, 6, new String[]{";"}).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            for (String str2 : (String[]) array) {
                Object[] array2 = StringsKt.J(str2, 0, 6, new String[]{d9.i.f24747b}).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array2;
                if (strArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    String str3 = strArr[0];
                    int length = str3.length() - 1;
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 <= length) {
                        boolean z3 = Intrinsics.h(str3.charAt(!z2 ? i2 : length), 32) <= 0;
                        if (z2) {
                            if (!z3) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z3) {
                            i2++;
                        } else {
                            z2 = true;
                        }
                    }
                    sb.append(str3.subSequence(i2, length + 1).toString());
                    sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    cookieManager.setCookie(str, sb.toString());
                }
            }
            cookieManager.removeExpiredCookie();
        }
    }

    public static final void d(Context context) {
        Intrinsics.f(context, "context");
        c(context, "facebook.com");
        c(context, ".facebook.com");
        c(context, "https://facebook.com");
        c(context, "https://.facebook.com");
    }

    public static final void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final String f(String str, String str2) {
        return C(str) ? str2 : str;
    }

    public static final ArrayList g(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String string = jSONArray.getString(i2);
                Intrinsics.e(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final HashMap h(JSONObject jsonObject) {
        Intrinsics.f(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    String string = jSONArrayNames.getString(i2);
                    Intrinsics.e(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = h((JSONObject) value);
                    }
                    Intrinsics.e(value, "value");
                    map.put(string, value);
                } catch (JSONException unused) {
                }
            }
        }
        return map;
    }

    public static final HashMap i(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            String strOptString = jSONObject.optString(key);
            if (strOptString != null) {
                Intrinsics.e(key, "key");
                map.put(key, strOptString);
            }
        }
        return map;
    }

    public static final int j(InputStream inputStream, OutputStream outputStream) throws Throwable {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[Segment.SIZE];
                int i2 = 0;
                while (true) {
                    int i3 = bufferedInputStream2.read(bArr);
                    if (i3 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i3);
                    i2 += i3;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i2;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final void k(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                k(file2);
            }
        }
        file.delete();
    }

    public static final void l(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static final String m(Context context) {
        if (context == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    public static final String n(Context context) {
        Intrinsics.f(context, "context");
        try {
            HashSet hashSet = FacebookSdk.f15915a;
            Validate.h();
            String str = FacebookSdk.d;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            if (i2 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i2);
            Intrinsics.e(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Date o(Bundle bundle, String str, Date date) {
        long jLongValue;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            jLongValue = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                jLongValue = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (jLongValue == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((jLongValue * 1000) + date.getTime());
    }

    public static final JSONObject p() {
        if (CrashShieldHandler.b(Utility.class)) {
            return null;
        }
        try {
            String string = FacebookSdk.b().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.a(Utility.class, th);
            return null;
        }
    }

    public static final void q(final GraphMeRequestWithCacheCallback graphMeRequestWithCacheCallback, final String accessToken) {
        String str;
        Intrinsics.f(accessToken, "accessToken");
        ConcurrentHashMap concurrentHashMap = ProfileInformationCache.f16369a;
        JSONObject jSONObject = (JSONObject) ProfileInformationCache.f16369a.get(accessToken);
        if (jSONObject != null) {
            graphMeRequestWithCacheCallback.a(jSONObject);
            return;
        }
        GraphRequest.Callback callback = new GraphRequest.Callback() { // from class: com.facebook.internal.Utility$getGraphMeRequestWithCacheAsync$graphCallback$1
            @Override // com.facebook.GraphRequest.Callback
            public final void a(GraphResponse graphResponse) {
                Utility.GraphMeRequestWithCacheCallback graphMeRequestWithCacheCallback2 = graphMeRequestWithCacheCallback;
                FacebookRequestError facebookRequestError = graphResponse.d;
                if (facebookRequestError != null) {
                    graphMeRequestWithCacheCallback2.b(facebookRequestError.f15913Y);
                    return;
                }
                JSONObject jSONObject2 = graphResponse.f15950a;
                if (jSONObject2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ConcurrentHashMap concurrentHashMap2 = ProfileInformationCache.f16369a;
                String key = accessToken;
                Intrinsics.f(key, "key");
                ProfileInformationCache.f16369a.put(key, jSONObject2);
                graphMeRequestWithCacheCallback2.a(jSONObject2);
            }
        };
        Bundle bundle = new Bundle();
        Date date = AccessToken.m0;
        AccessToken accessTokenB = AccessToken.Companion.b();
        if (accessTokenB == null || (str = accessTokenB.l0) == null) {
            str = "facebook";
        }
        bundle.putString("fields", str.equals("instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", accessToken);
        GraphRequest graphRequest = new GraphRequest(null, "me", bundle, HttpMethod.X, null, 32);
        graphRequest.j(callback);
        graphRequest.d();
    }

    public static final Method r(Class cls, String str, Class... parameterTypes) {
        Intrinsics.f(parameterTypes, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method s(String str, String str2, Class... clsArr) {
        try {
            return r(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Locale t() {
        try {
            Resources resources = FacebookSdk.b().getResources();
            Intrinsics.e(resources, "FacebookSdk.getApplicationContext().resources");
            return resources.getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object u(String str, String str2, JSONObject jSONObject) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, objOpt);
        return jSONObject2;
    }

    public static final String v(Uri uri) {
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    public static final PermissionsLists w(JSONObject result) throws JSONException {
        String strOptString;
        Intrinsics.f(result, "result");
        JSONArray jSONArray = result.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            String strOptString2 = jSONObjectOptJSONObject.optString("permission");
            if (strOptString2 != null && !strOptString2.equals("installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                if (strOptString.equals("granted")) {
                    arrayList.add(strOptString2);
                } else if (strOptString.equals("declined")) {
                    arrayList2.add(strOptString2);
                } else if (strOptString.equals("expired")) {
                    arrayList3.add(strOptString2);
                }
            }
        }
        PermissionsLists permissionsLists = new PermissionsLists();
        permissionsLists.f16381a = arrayList;
        permissionsLists.f16382b = arrayList2;
        permissionsLists.f16383c = arrayList3;
        return permissionsLists;
    }

    public static String x(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            Intrinsics.e(hash, "hash");
            hash.update(bArr);
            byte[] bArrDigest = hash.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(Integer.toHexString((b2 >> 4) & 15));
                sb.append(Integer.toHexString(b2 & 15));
            }
            String string = sb.toString();
            Intrinsics.e(string, "builder.toString()");
            return string;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object y(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean z() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{FacebookSdk.c()}, 1))));
            Context contextB = FacebookSdk.b();
            PackageManager packageManager = contextB.getPackageManager();
            String packageName = contextB.getPackageName();
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                if (Intrinsics.a(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
