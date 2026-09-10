package q7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.webkit.CookieManager;
import com.applovin.shadow.okio.Segment;
import com.facebook.appevents.codeless.internal.Constants;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f48677a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f48678b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile long f48679c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile long f48680d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile String f48681e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile String f48682f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile String f48683g = "NoCarrier";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile String f48684h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile Locale f48685i;

    public static final void A(String str, Exception exc) {
        if (!l7.s.f45219h || str == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
    }

    public static final void B(String str, String str2) {
        if (!l7.s.f45219h || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    public static final void C(String str, String str2, Exception exc) {
        if (!l7.s.f45219h || w(str)) {
            return;
        }
        Log.d(str, str2, exc);
    }

    public static final String D(Map map) {
        kotlin.jvm.internal.n.f(map, "map");
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
        kotlin.jvm.internal.n.e(string, "{\n      try {\n        va…\n        \"\"\n      }\n    }");
        return string;
    }

    public static final Bundle E(String str) {
        Bundle bundle = new Bundle();
        if (!w(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            for (String str2 : (String[]) an.h.I0(str, new String[]{X3.j.f27832c}, 0, 6).toArray(new String[0])) {
                String[] strArr = (String[]) an.h.I0(str2, new String[]{X3.j.f27830b}, 0, 6).toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), URLDecoder.decode(strArr[1], "UTF-8"));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e10) {
                    A("FacebookSDK", e10);
                }
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void F(Bundle bundle, JSONArray jSONArray) {
        kotlin.jvm.internal.n.f(bundle, "bundle");
        if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray(X3.i.I0, (boolean[]) jSONArray);
            return;
        }
        if (jSONArray instanceof double[]) {
            bundle.putDoubleArray(X3.i.I0, (double[]) jSONArray);
            return;
        }
        if (jSONArray instanceof int[]) {
            bundle.putIntArray(X3.i.I0, (int[]) jSONArray);
        } else if (jSONArray instanceof long[]) {
            bundle.putLongArray(X3.i.I0, (long[]) jSONArray);
        } else {
            bundle.putString(X3.i.I0, jSONArray.toString());
        }
    }

    public static final HashMap G(Parcel parcel) {
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (string != null && string2 != null) {
                map.put(string, string2);
            }
        }
        return map;
    }

    public static final String H(InputStream inputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(inputStream));
        try {
            StringBuilder sb2 = new StringBuilder();
            char[] cArr = new char[com.ironsource.mediationsdk.metadata.a.f29616n];
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 == -1) {
                    String string = sb2.toString();
                    inputStreamReader.close();
                    kotlin.jvm.internal.n.e(string, "InputStreamReader(buffer…gBuilder.toString()\n    }");
                    return string;
                }
                sb2.append(cArr, 0, i10);
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                qk.i0.j(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static final void I(JSONObject jSONObject, Context context) throws JSONException {
        Locale locale;
        int i10;
        int i11;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        int i12 = 0;
        if (f48678b == -1 || System.currentTimeMillis() - f48678b >= 1800000) {
            f48678b = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                kotlin.jvm.internal.n.e(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
                f48681e = displayName;
                String id2 = timeZone.getID();
                kotlin.jvm.internal.n.e(id2, "tz.id");
                f48682f = id2;
            } catch (AssertionError unused) {
            } catch (Exception e10) {
                C("FacebookSDK", "Failed to refresh timezone", e10);
            }
            if (f48683g.equals("NoCarrier")) {
                try {
                    Object systemService = context.getSystemService("phone");
                    kotlin.jvm.internal.n.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    kotlin.jvm.internal.n.e(networkOperatorName, "telephonyManager.networkOperatorName");
                    f48683g = networkOperatorName;
                } catch (Exception e11) {
                    C("FacebookSDK", "Failed to refresh carrier name", e11);
                }
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f48679c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
                }
                f48679c = Math.round(f48679c / 1.073741824E9d);
            } catch (Exception unused2) {
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f48680d = ((long) statFs2.getAvailableBlocks()) * ((long) statFs2.getBlockSize());
                }
                f48680d = Math.round(f48680d / 1.073741824E9d);
            } catch (Exception unused3) {
            }
        }
        String packageName = context.getPackageName();
        int i13 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i13 = packageInfo.versionCode;
            f48684h = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused4) {
        }
        jSONArray.put(packageName);
        jSONArray.put(i13);
        jSONArray.put(f48684h);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().getLocales().get(0);
        } catch (Exception unused5) {
            locale = Locale.getDefault();
        }
        f48685i = locale;
        StringBuilder sb2 = new StringBuilder();
        Locale locale2 = f48685i;
        String language = locale2 != null ? locale2.getLanguage() : null;
        if (language == null) {
            language = "";
        }
        sb2.append(language);
        sb2.append('_');
        Locale locale3 = f48685i;
        String country = locale3 != null ? locale3.getCountry() : null;
        sb2.append(country != null ? country : "");
        jSONArray.put(sb2.toString());
        jSONArray.put(f48681e);
        jSONArray.put(f48683g);
        double d10 = 0.0d;
        try {
            Object systemService2 = context.getSystemService(X3.i.f27786d);
            DisplayManager displayManager = systemService2 instanceof DisplayManager ? (DisplayManager) systemService2 : null;
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                int i14 = displayMetrics.widthPixels;
                try {
                    i12 = displayMetrics.heightPixels;
                    d10 = displayMetrics.density;
                } catch (Exception unused6) {
                }
                i10 = i12;
                i12 = i14;
            } else {
                i10 = 0;
            }
        } catch (Exception unused7) {
        }
        jSONArray.put(i12);
        jSONArray.put(i10);
        jSONArray.put(new DecimalFormat("#.##").format(d10));
        if (f48677a > 0) {
            i11 = f48677a;
        } else {
            try {
                File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new fc.a(2));
                if (fileArrListFiles != null) {
                    f48677a = fileArrListFiles.length;
                }
            } catch (Exception e12) {
                C("FacebookSDK", "Failed to enumerate CPU cores", e12);
            }
            if (f48677a <= 0) {
                f48677a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
            }
            i11 = f48677a;
        }
        jSONArray.put(i11);
        jSONArray.put(f48679c);
        jSONArray.put(f48680d);
        jSONArray.put(f48682f);
        jSONObject.put(Constants.EXTINFO, jSONArray.toString());
    }

    public static final String J(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(an.a.f3768a);
        kotlin.jvm.internal.n.e(bytes, "this as java.lang.String).getBytes(charset)");
        try {
            MessageDigest hash = MessageDigest.getInstance("SHA-256");
            kotlin.jvm.internal.n.e(hash, "hash");
            hash.update(bytes);
            byte[] digest = hash.digest();
            StringBuilder sb2 = new StringBuilder();
            kotlin.jvm.internal.n.e(digest, "digest");
            for (byte b10 : digest) {
                sb2.append(Integer.toHexString((b10 >> 4) & 15));
                sb2.append(Integer.toHexString(b10 & 15));
            }
            String string = sb2.toString();
            kotlin.jvm.internal.n.e(string, "builder.toString()");
            return string;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final void K(Parcel parcel, Map map) {
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

    public static final Uri a(String str, Bundle bundle, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
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
        kotlin.jvm.internal.n.e(uriBuild, "builder.build()");
        return uriBuild;
    }

    public static void b(String str) {
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : (String[]) an.h.I0(cookie, new String[]{";"}, 0, 6).toArray(new String[0])) {
            String[] strArr = (String[]) an.h.I0(str2, new String[]{X3.j.f27830b}, 0, 6).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb2 = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = kotlin.jvm.internal.n.h(str3.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                sb2.append(str3.subSequence(i10, length + 1).toString());
                sb2.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb2.toString());
            }
        }
        cookieManager.flush();
    }

    public static final void c(Context context) {
        try {
            b("facebook.com");
            b(".facebook.com");
            b("https://facebook.com");
            b("https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final String d(String str) {
        return w(str) ? "" : str;
    }

    public static final HashSet e(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String string = jSONArray.getString(i10);
            kotlin.jvm.internal.n.e(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final ArrayList f(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jSONArray.getString(i10);
                kotlin.jvm.internal.n.e(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final HashMap g(JSONObject jsonObject) {
        kotlin.jvm.internal.n.f(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    String string = jSONArrayNames.getString(i10);
                    kotlin.jvm.internal.n.e(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = g((JSONObject) value);
                    }
                    kotlin.jvm.internal.n.e(value, "value");
                    map.put(string, value);
                } catch (JSONException e10) {
                    C("FacebookSDK", "Failed to convert JSONObject to HashMap", e10);
                }
            }
        }
        return map;
    }

    public static final HashMap h(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            String strOptString = jSONObject.optString(key);
            if (strOptString != null) {
                kotlin.jvm.internal.n.e(key, "key");
                map.put(key, strOptString);
            }
        }
        return map;
    }

    public static final int i(InputStream inputStream, FilterOutputStream filterOutputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byte[] bArr = new byte[Segment.SIZE];
            int i10 = 0;
            while (true) {
                int i11 = bufferedInputStream.read(bArr);
                if (i11 == -1) {
                    bufferedInputStream.close();
                    return i10;
                }
                filterOutputStream.write(bArr, 0, i11);
                i10 += i11;
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                qk.i0.j(bufferedInputStream, th2);
                throw th3;
            }
        }
    }

    public static final void j(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static final String k(Context context) {
        if (context == null) {
            return "null";
        }
        return context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    public static final String l(Context context) {
        try {
            l7.s sVar = l7.s.f45212a;
            f.o();
            String str = l7.s.f45216e;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i10);
            kotlin.jvm.internal.n.e(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Date m(Bundle bundle, String str, Date date) {
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

    public static final JSONObject n() {
        if (!v7.a.b(e0.class)) {
            try {
                String string = l7.s.b().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
                if (string != null) {
                    try {
                        return new JSONObject(string);
                    } catch (JSONException e10) {
                        C("FacebookSDK", "Failed to parse data processing options", e10);
                    }
                }
            } catch (Throwable th2) {
                v7.a.a(e0.class, th2);
                return null;
            }
        }
        return null;
    }

    public static final void o(final String accessToken, final d0 d0Var) {
        String str;
        kotlin.jvm.internal.n.f(accessToken, "accessToken");
        ConcurrentHashMap concurrentHashMap = a0.f48658a;
        JSONObject jSONObject = (JSONObject) a0.f48658a.get(accessToken);
        if (jSONObject != null) {
            d0Var.i(jSONObject);
            return;
        }
        l7.w wVar = new l7.w() { // from class: q7.c0
            @Override // l7.w
            public final void a(l7.e0 e0Var) {
                String accessToken2 = accessToken;
                kotlin.jvm.internal.n.f(accessToken2, "$accessToken");
                JSONObject jSONObject2 = e0Var.f45112d;
                l7.q qVar = e0Var.f45111c;
                d0 d0Var2 = d0Var;
                if (qVar != null) {
                    d0Var2.j(qVar.f45210i);
                } else {
                    if (jSONObject2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    a0.f48658a.put(accessToken2, jSONObject2);
                    d0Var2.i(jSONObject2);
                }
            }
        };
        Bundle bundle = new Bundle();
        Date date = l7.a.l;
        l7.a aVarD = go.k.D();
        if (aVarD == null || (str = aVarD.f45081k) == null) {
            str = "facebook";
        }
        bundle.putString("fields", str.equals("instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", accessToken);
        l7.b0 b0Var = new l7.b0(null, "me", null, null, new com.facebook.appevents.cloudbridge.a(2));
        b0Var.f45090d = bundle;
        b0Var.f45094h = l7.f0.f45120a;
        b0Var.j(wVar);
        b0Var.d();
    }

    public static final Method p(Class cls, String str, Class... parameterTypes) {
        kotlin.jvm.internal.n.f(parameterTypes, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method q(String str, String str2, Class... clsArr) {
        try {
            return p(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object r(JSONObject jSONObject, String str, String str2) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new l7.n("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, objOpt);
        return jSONObject2;
    }

    public static final Object s(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean t() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{l7.s.c()}, 1))));
            Context contextB = l7.s.b();
            PackageManager packageManager = contextB.getPackageManager();
            String packageName = contextB.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            kotlin.jvm.internal.n.e(listQueryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.n.a(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean u() {
        if (!v7.a.b(e0.class)) {
            try {
                JSONObject jSONObjectN = n();
                if (jSONObjectN != null) {
                    try {
                        JSONArray jSONArray = jSONObjectN.getJSONArray("data_processing_options");
                        int length = jSONArray.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            String string = jSONArray.getString(i10);
                            kotlin.jvm.internal.n.e(string, "options.getString(i)");
                            String lowerCase = string.toLowerCase();
                            kotlin.jvm.internal.n.e(lowerCase, "this as java.lang.String).toLowerCase()");
                            if (lowerCase.equals("ldu")) {
                                return true;
                            }
                        }
                    } catch (Exception e10) {
                        C("FacebookSDK", "Failed to check data processing restriction", e10);
                    }
                }
            } catch (Throwable th2) {
                v7.a.a(e0.class, th2);
                return false;
            }
        }
        return false;
    }

    public static boolean v(Context context) {
        Method methodQ = q("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodQ != null) {
            Object objS = s(null, methodQ, context);
            if ((objS instanceof Integer) && objS.equals(0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean w(String str) {
        return str == null || str.length() == 0;
    }

    public static final boolean x(Uri uri) {
        if (uri != null) {
            return "http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme());
        }
        return false;
    }

    public static final ArrayList y(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return arrayList;
    }

    public static final HashMap z(String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                kotlin.jvm.internal.n.e(key, "key");
                String string = jSONObject.getString(key);
                kotlin.jvm.internal.n.e(string, "jsonObject.getString(key)");
                map.put(key, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }
}
