package com.facebook.appevents;

import an.h;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.x;
import com.facebook.appevents.aam.MetadataRule;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import j1.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import q7.e0;
import xj.b0;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u007f\u0010\r\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\r\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0003J\u0019\u0010!\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b!\u0010\u000eJ#\u0010#\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\"H\u0007¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+R\u001c\u0010-\u001a\n ,*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010.R$\u0010<\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010>\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0014\u0010?\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010.R\u0014\u0010@\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010.R\u0014\u0010A\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010.R\u0014\u0010B\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010.R\u0014\u0010C\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010.R\u0014\u0010D\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010.R\u0014\u0010E\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010.R\u0014\u0010F\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010.R\u0014\u0010G\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010.R\u0014\u0010H\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010.R\u0014\u0010I\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010.R$\u0010L\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lcom/facebook/appevents/UserDataStore;", "", "<init>", "()V", "Lwj/r;", "initStore", "", X3.i.W, X3.i.X, "writeDataIntoCache", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "ud", "setUserDataAndHash", "(Landroid/os/Bundle;)V", NotificationCompat.CATEGORY_EMAIL, "firstName", "lastName", "phone", "dateOfBirth", "gender", "city", "state", "zip", "country", "externalId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "clear", "getHashedUserData$facebook_core_release", "()Ljava/lang/String;", "getHashedUserData", "getAllHashedUserData", "initAndWait", "updateHashUserData", "", "setInternalUd", "(Ljava/util/Map;)V", "type", "data", "normalizeData", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "maybeSHA256Hashed", "(Ljava/lang/String;)Z", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "USER_DATA_KEY", "INTERNAL_USER_DATA_KEY", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "MAX_NUM", "I", "DATA_SEPARATOR", "Ljava/util/concurrent/ConcurrentHashMap;", "externalHashedUserData", "Ljava/util/concurrent/ConcurrentHashMap;", "internalHashedUserData", "EMAIL", "FIRST_NAME", "LAST_NAME", "PHONE", "DATE_OF_BIRTH", "GENDER", "CITY", "STATE", "ZIP", "COUNTRY", "EXTERNAL_ID", "getEnabledInternalUserData", "()Ljava/util/Map;", "enabledInternalUserData", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class UserDataStore {
    public static final String CITY = "ct";
    public static final String COUNTRY = "country";
    private static final String DATA_SEPARATOR = ",";
    public static final String DATE_OF_BIRTH = "db";
    public static final String EMAIL = "em";
    public static final String EXTERNAL_ID = "external_id";
    public static final String FIRST_NAME = "fn";
    public static final String GENDER = "ge";
    private static final String INTERNAL_USER_DATA_KEY = "com.facebook.appevents.UserDataStore.internalUserData";
    public static final String LAST_NAME = "ln";
    private static final int MAX_NUM = 5;
    public static final String PHONE = "ph";
    public static final String STATE = "st";
    private static final String USER_DATA_KEY = "com.facebook.appevents.UserDataStore.userData";
    public static final String ZIP = "zp";
    private static SharedPreferences sharedPreferences;
    public static final UserDataStore INSTANCE = new UserDataStore();
    private static final String TAG = "UserDataStore";
    private static final AtomicBoolean initialized = new AtomicBoolean(false);
    private static final ConcurrentHashMap<String, String> externalHashedUserData = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, String> internalHashedUserData = new ConcurrentHashMap<>();

    private UserDataStore() {
    }

    public static final void clear() {
        if (v7.a.b(UserDataStore.class)) {
            return;
        }
        try {
            InternalAppEventsLogger.INSTANCE.getAnalyticsExecutor().execute(new x(5));
        } catch (Throwable th2) {
            v7.a.a(UserDataStore.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clear$lambda$2() {
        if (v7.a.b(UserDataStore.class)) {
            return;
        }
        try {
            if (!initialized.get()) {
                Log.w(TAG, "initStore should have been called before calling setUserData");
                INSTANCE.initAndWait();
            }
            externalHashedUserData.clear();
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putString(USER_DATA_KEY, null).apply();
            } else {
                n.l("sharedPreferences");
                throw null;
            }
        } catch (Throwable th2) {
            v7.a.a(UserDataStore.class, th2);
        }
    }

    public static final String getAllHashedUserData() {
        if (v7.a.b(UserDataStore.class)) {
            return null;
        }
        try {
            if (!initialized.get()) {
                INSTANCE.initAndWait();
            }
            HashMap map = new HashMap();
            map.putAll(externalHashedUserData);
            map.putAll(INSTANCE.getEnabledInternalUserData());
            return e0.D(map);
        } catch (Throwable th2) {
            v7.a.a(UserDataStore.class, th2);
            return null;
        }
    }

    private final Map<String, String> getEnabledInternalUserData() {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            Set<String> enabledRuleNames = MetadataRule.INSTANCE.getEnabledRuleNames();
            for (String str : internalHashedUserData.keySet()) {
                if (enabledRuleNames.contains(str)) {
                    map.put(str, internalHashedUserData.get(str));
                }
            }
            return map;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public static final String getHashedUserData$facebook_core_release() {
        if (v7.a.b(UserDataStore.class)) {
            return null;
        }
        try {
            if (!initialized.get()) {
                Log.w(TAG, "initStore should have been called before calling setUserID");
                INSTANCE.initAndWait();
            }
            return e0.D(externalHashedUserData);
        } catch (Throwable th2) {
            v7.a.a(UserDataStore.class, th2);
            return null;
        }
    }

    private final synchronized void initAndWait() {
        if (v7.a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = initialized;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(s.b());
            n.e(defaultSharedPreferences, "getDefaultSharedPreferen….getApplicationContext())");
            sharedPreferences = defaultSharedPreferences;
            String string = defaultSharedPreferences.getString(USER_DATA_KEY, "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 == null) {
                n.l("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences2.getString(INTERNAL_USER_DATA_KEY, "");
            if (string2 == null) {
                string2 = "";
            }
            externalHashedUserData.putAll(e0.z(string));
            internalHashedUserData.putAll(e0.z(string2));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public static final void initStore() {
        if (v7.a.b(UserDataStore.class)) {
            return;
        }
        try {
            if (initialized.get()) {
                return;
            }
            INSTANCE.initAndWait();
        } catch (Throwable th2) {
            v7.a.a(UserDataStore.class, th2);
        }
    }

    private final boolean maybeSHA256Hashed(String data) {
        if (v7.a.b(this)) {
            return false;
        }
        try {
            Pattern patternCompile = Pattern.compile("[A-Fa-f0-9]{64}");
            n.e(patternCompile, "compile(...)");
            n.f(data, "input");
            return patternCompile.matcher(data).matches();
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return false;
        }
    }

    private final String normalizeData(String type, String data) {
        String strSubstring;
        if (v7.a.b(this)) {
            return null;
        }
        try {
            int length = data.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = n.h(data.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            String lowerCase = data.subSequence(i10, length + 1).toString().toLowerCase();
            n.e(lowerCase, "this as java.lang.String).toLowerCase()");
            if (EMAIL.equals(type)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    Log.e(TAG, "Setting email failure: this is not a valid email address");
                    return "";
                }
            } else {
                if (PHONE.equals(type)) {
                    Pattern patternCompile = Pattern.compile("[^0-9]");
                    n.e(patternCompile, "compile(...)");
                    String strReplaceAll = patternCompile.matcher(lowerCase).replaceAll("");
                    n.e(strReplaceAll, "replaceAll(...)");
                    return strReplaceAll;
                }
                if (GENDER.equals(type)) {
                    if (lowerCase.length() > 0) {
                        strSubstring = lowerCase.substring(0, 1);
                        n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        strSubstring = "";
                    }
                    if (!"f".equals(strSubstring) && !"m".equals(strSubstring)) {
                        Log.e(TAG, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return strSubstring;
                }
            }
            return lowerCase;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f0 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:5:0x000a, B:7:0x0017, B:10:0x0020, B:11:0x0028, B:13:0x002e, B:18:0x0052, B:25:0x0067, B:28:0x006d, B:29:0x0070, B:31:0x008a, B:34:0x0094, B:36:0x00aa, B:41:0x00e4, B:44:0x00f2, B:47:0x0110, B:49:0x0118, B:56:0x013f, B:50:0x011c, B:52:0x0120, B:54:0x012c, B:55:0x0137, B:37:0x00b3, B:38:0x00bb, B:40:0x00d4, B:43:0x00f0, B:57:0x014a, B:58:0x014f), top: B:62:0x000a }] */
    public static final void setInternalUd(Map<String, String> ud2) {
        String[] strArr;
        List listC;
        if (v7.a.b(UserDataStore.class)) {
            return;
        }
        try {
            n.f(ud2, "ud");
            if (!initialized.get()) {
                INSTANCE.initAndWait();
            }
            for (Map.Entry<String, String> entry : ud2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                UserDataStore userDataStore = INSTANCE;
                int length = value.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = n.h(value.charAt(!z10 ? i10 : length), 32) <= 0;
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
                String strJ = e0.J(userDataStore.normalizeData(key, value.subSequence(i10, length + 1).toString()));
                ConcurrentHashMap<String, String> concurrentHashMap = internalHashedUserData;
                if (concurrentHashMap.containsKey(key)) {
                    String str = concurrentHashMap.get(key);
                    if (str != null) {
                        Pattern patternCompile = Pattern.compile(DATA_SEPARATOR);
                        n.e(patternCompile, "compile(...)");
                        h.G0(0);
                        Matcher matcher = patternCompile.matcher(str);
                        if (matcher.find()) {
                            ArrayList arrayList = new ArrayList(10);
                            int iEnd = 0;
                            do {
                                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                                iEnd = matcher.end();
                            } while (matcher.find());
                            arrayList.add(str.subSequence(iEnd, str.length()).toString());
                            listC = arrayList;
                        } else {
                            listC = f.C(str.toString());
                        }
                        strArr = (String[]) listC.toArray(new String[0]);
                        if (strArr == null) {
                            strArr = new String[0];
                        }
                    } else {
                        strArr = new String[0];
                    }
                    Object[] elements = Arrays.copyOf(strArr, strArr.length);
                    n.f(elements, "elements");
                    LinkedHashSet linkedHashSet = new LinkedHashSet(b0.O(elements.length));
                    k.A0(elements, linkedHashSet);
                    if (linkedHashSet.contains(strJ)) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (strArr.length == 0) {
                        sb2.append(strJ);
                    } else if (strArr.length < 5) {
                        sb2.append(str);
                        sb2.append(DATA_SEPARATOR);
                        sb2.append(strJ);
                    } else {
                        for (int i11 = 1; i11 < 5; i11++) {
                            sb2.append(strArr[i11]);
                            sb2.append(DATA_SEPARATOR);
                        }
                        sb2.append(strJ);
                        linkedHashSet.remove(strArr[0]);
                    }
                    internalHashedUserData.put(key, sb2.toString());
                } else {
                    concurrentHashMap.put(key, strJ);
                }
            }
            INSTANCE.writeDataIntoCache(INTERNAL_USER_DATA_KEY, e0.D(internalHashedUserData));
        } catch (Throwable th2) {
            v7.a.a(UserDataStore.class, th2);
        }
    }

    public static final void setUserDataAndHash(Bundle ud2) {
        if (v7.a.b(UserDataStore.class)) {
            return;
        }
        try {
            InternalAppEventsLogger.INSTANCE.getAnalyticsExecutor().execute(new androidx.fragment.app.n(ud2, 15));
        } catch (Throwable th2) {
            v7.a.a(UserDataStore.class, th2);
        }
    }

    public static /* synthetic */ void setUserDataAndHash$default(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i10, Object obj) {
        if (v7.a.b(UserDataStore.class)) {
            return;
        }
        try {
            setUserDataAndHash(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (i10 & 1024) != 0 ? null : str11);
        } catch (Throwable th2) {
            v7.a.a(UserDataStore.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUserDataAndHash$lambda$1(Bundle bundle) {
        if (v7.a.b(UserDataStore.class)) {
            return;
        }
        try {
            if (!initialized.get()) {
                Log.w(TAG, "initStore should have been called before calling setUserData");
                INSTANCE.initAndWait();
            }
            UserDataStore userDataStore = INSTANCE;
            userDataStore.updateHashUserData(bundle);
            userDataStore.writeDataIntoCache(USER_DATA_KEY, e0.D(externalHashedUserData));
            userDataStore.writeDataIntoCache(INTERNAL_USER_DATA_KEY, e0.D(internalHashedUserData));
        } catch (Throwable th2) {
            v7.a.a(UserDataStore.class, th2);
        }
    }

    private final void updateHashUserData(Bundle ud2) {
        if (v7.a.b(this) || ud2 == null) {
            return;
        }
        try {
            for (String key : ud2.keySet()) {
                Object obj = ud2.get(key);
                if (obj != null) {
                    String string = obj.toString();
                    if (maybeSHA256Hashed(string)) {
                        ConcurrentHashMap<String, String> concurrentHashMap = externalHashedUserData;
                        String lowerCase = string.toLowerCase();
                        n.e(lowerCase, "this as java.lang.String).toLowerCase()");
                        concurrentHashMap.put(key, lowerCase);
                    } else {
                        n.e(key, "key");
                        String strJ = e0.J(normalizeData(key, string));
                        if (strJ != null) {
                            externalHashedUserData.put(key, strJ);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    private final void writeDataIntoCache(String key, String value) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            s.d().execute(new c(key, value, 0));
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeDataIntoCache$lambda$0(String key, String value) {
        if (v7.a.b(UserDataStore.class)) {
            return;
        }
        try {
            n.f(key, "$key");
            n.f(value, "$value");
            if (!initialized.get()) {
                INSTANCE.initAndWait();
            }
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putString(key, value).apply();
            } else {
                n.l("sharedPreferences");
                throw null;
            }
        } catch (Throwable th2) {
            v7.a.a(UserDataStore.class, th2);
        }
    }

    public static final void setUserDataAndHash(String email, String firstName, String lastName, String phone, String dateOfBirth, String gender, String city, String state, String zip, String country, String externalId) {
        if (v7.a.b(UserDataStore.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            if (email != null) {
                bundle.putString(EMAIL, email);
            }
            if (firstName != null) {
                bundle.putString(FIRST_NAME, firstName);
            }
            if (lastName != null) {
                bundle.putString("ln", lastName);
            }
            if (phone != null) {
                bundle.putString(PHONE, phone);
            }
            if (dateOfBirth != null) {
                bundle.putString(DATE_OF_BIRTH, dateOfBirth);
            }
            if (gender != null) {
                bundle.putString(GENDER, gender);
            }
            if (city != null) {
                bundle.putString(CITY, city);
            }
            if (state != null) {
                bundle.putString(STATE, state);
            }
            if (zip != null) {
                bundle.putString(ZIP, zip);
            }
            if (country != null) {
                bundle.putString("country", country);
            }
            if (externalId != null) {
                bundle.putString(EXTERNAL_ID, externalId);
            }
            setUserDataAndHash(bundle);
        } catch (Throwable th2) {
            v7.a.a(UserDataStore.class, th2);
        }
    }
}
