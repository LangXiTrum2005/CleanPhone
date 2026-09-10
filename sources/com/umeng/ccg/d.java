package com.umeng.ccg;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.umeng.analytics.pro.ab;
import com.umeng.analytics.pro.ac;
import com.umeng.analytics.pro.ad;
import com.umeng.analytics.pro.ae;
import com.umeng.analytics.pro.af;
import com.umeng.analytics.pro.ag;
import com.umeng.analytics.pro.ah;
import com.umeng.analytics.pro.ai;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.ao;
import com.umeng.analytics.pro.aq;
import com.umeng.analytics.pro.ar;
import com.umeng.analytics.pro.as;
import com.umeng.analytics.pro.au;
import com.umeng.analytics.pro.av;
import com.umeng.analytics.pro.aw;
import com.umeng.analytics.pro.ax;
import com.umeng.analytics.pro.ay;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.utils.UMUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class d implements com.umeng.ccg.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f2618a = "iucc";
    private static final String b = ay.b().b(ay.C);
    private static JSONObject c = null;
    private static final String[] d = {com.umeng.ccg.a.f, com.umeng.ccg.a.g, com.umeng.ccg.a.h};
    private static final String[] e = {com.umeng.ccg.a.f, com.umeng.ccg.a.g, com.umeng.ccg.a.h, com.umeng.ccg.a.i};
    private static ArrayList<ac> f = null;
    private static ArrayList<ac> g = null;
    private static ArrayList<ac> h = null;
    private static ArrayList<ac> i = null;
    private static ab j = null;
    private static e m = new e();
    private volatile String k = "";
    private Map<String, b> l = new HashMap();

    public static class a extends BroadcastReceiver {
        public long a(ArrayList<ac> arrayList) {
            if (arrayList != null && arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    ac acVar = arrayList.get(i);
                    if (acVar instanceof af) {
                        return ((af) acVar).c();
                    }
                }
            }
            return 0L;
        }

        public boolean b(ArrayList<ac> arrayList) {
            if (arrayList == null || arrayList.size() <= 0) {
                return false;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).b()) {
                    return false;
                }
            }
            return true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                if (action.equals("android.intent.action.SCREEN_ON") && d.j != null && (d.j instanceof ae)) {
                    if (b(d.i)) {
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 304, d.a(), null, a(d.i) * 1000);
                    } else {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "don't send INVOKE_APPACT_WHEN_SCREEN_ON msg.");
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public class b {
        private JSONArray b;
        private String c;

        public b(JSONArray jSONArray, String str) {
            this.b = jSONArray;
            this.c = str;
        }

        public JSONArray a() {
            return this.b;
        }

        public String b() {
            return this.c;
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2622a;
        public int b;
        public int c;

        public c(String str, int i, int i2) {
            this.f2622a = str;
            this.b = i;
            this.c = i2;
        }
    }

    /* JADX INFO: renamed from: com.umeng.ccg.d$d, reason: collision with other inner class name */
    public static class C0283d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f2623a = new d();

        private C0283d() {
        }
    }

    public static class e extends BroadcastReceiver {
        public long a(ArrayList<ac> arrayList) {
            if (arrayList != null && arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    ac acVar = arrayList.get(i);
                    if (acVar instanceof af) {
                        return ((af) acVar).c();
                    }
                }
            }
            return 0L;
        }

        public boolean b(ArrayList<ac> arrayList) {
            if (arrayList == null || arrayList.size() <= 0) {
                return false;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).b()) {
                    return false;
                }
            }
            return true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv intent : ACTION_SCREEN_ON");
                    if (b(d.f)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "report screen_on event.");
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 301, d.a(), null, a(d.f) * 1000);
                    } else {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "don't report screen_on event.");
                    }
                }
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv intent : ACTION_SCREEN_OFF");
                    if (b(d.g)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "report screen_off event.");
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 302, d.a(), null, a(d.g) * 1000);
                    } else {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "don't report screen_off event.");
                    }
                }
                if (action.equals("android.intent.action.USER_PRESENT")) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv intent : ACTION_USER_PRESENT");
                    if (!b(d.h)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "don't report screen_unlock event.");
                        return;
                    }
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "report screen_unlock event.");
                    com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 303, d.a(), null, a(d.h) * 1000);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Context context, String str, BroadcastReceiver broadcastReceiver) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(str);
        context.registerReceiver(broadcastReceiver, intentFilter);
    }

    private boolean g() {
        SharedPreferences sharedPreferencesA = au.a(UMGlobalContext.getAppContext());
        if (sharedPreferencesA != null) {
            String string = sharedPreferencesA.getString(au.f, "");
            if (TextUtils.isEmpty(string)) {
                h();
                return false;
            }
            try {
                if (!as.a().keySet().equals(as.a(new JSONObject(string)).keySet())) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private void h() {
        try {
            SharedPreferences sharedPreferencesA = au.a(UMGlobalContext.getAppContext());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putString(au.f, new JSONObject(as.a()).toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    private boolean i() {
        try {
            SharedPreferences sharedPreferencesA = au.a(UMGlobalContext.getAppContext());
            return (sharedPreferencesA == null || TextUtils.isEmpty(sharedPreferencesA.getString(au.g, ""))) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private JSONObject j() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ax.b(UMUtils.genUmc(), byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ax.a(byteArray, UMUtils.genSin());
            String str = new String(byteArray);
            byteArrayOutputStream.reset();
            return new JSONObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private long b(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ts")) {
            try {
                return jSONObject.optLong("ts");
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    private void c(Context context) {
        ImprintHandler.getImprintService(context).registImprintCallback(f2618a, new UMImprintChangeCallback() { // from class: com.umeng.ccg.d.1
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
            public void onImprintValueChanged(String str, String str2) {
                com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 107, d.a(), str2);
            }
        });
    }

    private Long d(Context context) {
        long j2 = 0L;
        try {
            SharedPreferences sharedPreferencesA = au.a(context);
            return sharedPreferencesA != null ? Long.valueOf(sharedPreferencesA.getLong(au.d, 0L)) : j2;
        } catch (Throwable unused) {
            return j2;
        }
    }

    private String e(Context context) {
        try {
            SharedPreferences sharedPreferencesA = au.a(context);
            return sharedPreferencesA != null ? sharedPreferencesA.getString(au.e, "") : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private void c(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(com.umeng.ccg.a.f2615a)) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.umeng.ccg.a.f2615a);
            ab abVarA = null;
            ab abVarA2 = jSONObjectOptJSONObject.has(com.umeng.ccg.a.b) ? a(com.umeng.ccg.a.b, jSONObjectOptJSONObject.optJSONObject(com.umeng.ccg.a.b)) : null;
            ab abVarA3 = jSONObjectOptJSONObject.has(com.umeng.ccg.a.c) ? a(com.umeng.ccg.a.c, jSONObjectOptJSONObject.optJSONObject(com.umeng.ccg.a.c)) : null;
            ab abVarA4 = jSONObjectOptJSONObject.has(com.umeng.ccg.a.d) ? a(com.umeng.ccg.a.d, jSONObjectOptJSONObject.optJSONObject(com.umeng.ccg.a.d)) : null;
            ab abVarA5 = jSONObjectOptJSONObject.has(com.umeng.ccg.a.e) ? a(com.umeng.ccg.a.e, jSONObjectOptJSONObject.optJSONObject(com.umeng.ccg.a.e)) : null;
            ab abVarA6 = jSONObjectOptJSONObject.has(com.umeng.ccg.a.f) ? a(com.umeng.ccg.a.f, jSONObjectOptJSONObject.optJSONObject(com.umeng.ccg.a.f)) : null;
            ab abVarA7 = jSONObjectOptJSONObject.has(com.umeng.ccg.a.g) ? a(com.umeng.ccg.a.g, jSONObjectOptJSONObject.optJSONObject(com.umeng.ccg.a.g)) : null;
            ab abVarA8 = jSONObjectOptJSONObject.has(com.umeng.ccg.a.h) ? a(com.umeng.ccg.a.h, jSONObjectOptJSONObject.optJSONObject(com.umeng.ccg.a.h)) : null;
            if (jSONObjectOptJSONObject.has(com.umeng.ccg.a.i)) {
                abVarA = a(com.umeng.ccg.a.i, jSONObjectOptJSONObject.optJSONObject(com.umeng.ccg.a.i));
                j = abVarA;
            }
            ArrayList arrayList = new ArrayList();
            if (abVarA2 != null) {
                arrayList.add(abVarA2);
            }
            if (abVarA3 != null) {
                arrayList.add(abVarA3);
            }
            if (abVarA4 != null) {
                arrayList.add(abVarA4);
            }
            if (abVarA5 != null) {
                arrayList.add(abVarA5);
            }
            if (abVarA6 != null) {
                arrayList.add(abVarA6);
            }
            if (abVarA7 != null) {
                arrayList.add(abVarA7);
            }
            if (abVarA8 != null) {
                arrayList.add(abVarA8);
            }
            if (abVarA != null) {
                arrayList.add(abVarA);
            }
            com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 202, a(), arrayList);
        } catch (Throwable unused) {
        }
    }

    public static d a() {
        return C0283d.f2623a;
    }

    public synchronized JSONObject b(Context context) {
        FileInputStream fileInputStreamOpenFileInput;
        JSONObject jSONObject = null;
        try {
            File filesDir = context.getFilesDir();
            String str = b;
            if (!new File(filesDir, str).exists()) {
                return null;
            }
            try {
                fileInputStreamOpenFileInput = context.openFileInput(str);
                try {
                    JSONObject jSONObject2 = new JSONObject(new String(ax.a(HelperUtils.readStreamToByteArray(fileInputStreamOpenFileInput), UMConfigure.sAppkey.getBytes())));
                    try {
                        as.a(fileInputStreamOpenFileInput);
                    } catch (Throwable unused) {
                    }
                    jSONObject = jSONObject2;
                } catch (Throwable unused2) {
                    as.a(fileInputStreamOpenFileInput);
                }
            } catch (Throwable unused3) {
                fileInputStreamOpenFileInput = null;
            }
        } catch (Throwable unused4) {
        }
        return jSONObject;
    }

    public void a(Context context) {
        com.umeng.ccg.c.a(context, 105, a(), null);
    }

    private boolean a(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("code")) {
            return false;
        }
        try {
            return 200 == jSONObject.optInt("code") && jSONObject.has(com.umeng.ccg.a.f2615a) && jSONObject.has("ts");
        } catch (Throwable unused) {
            return false;
        }
    }

    private synchronized void a(Context context, JSONObject jSONObject, String str) {
        try {
            long jB = b(jSONObject);
            byte[] bArrA = ax.a(jSONObject.toString().getBytes(), UMConfigure.sAppkey.getBytes());
            if (bArrA != null && bArrA.length > 1) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), b));
                try {
                    fileOutputStream.write(bArrA);
                    fileOutputStream.flush();
                    as.a(fileOutputStream);
                    a(context, str, jB);
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "saveConfigFile success.");
                } catch (Throwable th) {
                    as.a(fileOutputStream);
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void b(String str) {
        String strI = AbstractC3888ke0.i(au.b, str);
        SharedPreferences sharedPreferencesA = au.a(UMGlobalContext.getAppContext());
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putLong(strI, System.currentTimeMillis()).commit();
        }
    }

    private void a(String str, ac acVar) {
        if (com.umeng.ccg.a.f.equalsIgnoreCase(str)) {
            if (f == null) {
                f = new ArrayList<>();
            }
            f.add(acVar);
        }
        if (com.umeng.ccg.a.g.equalsIgnoreCase(str)) {
            if (g == null) {
                g = new ArrayList<>();
            }
            g.add(acVar);
        }
        if (com.umeng.ccg.a.h.equalsIgnoreCase(str)) {
            if (h == null) {
                h = new ArrayList<>();
            }
            h.add(acVar);
        }
        if (com.umeng.ccg.a.i.equalsIgnoreCase(str)) {
            if (i == null) {
                i = new ArrayList<>();
            }
            i.add(acVar);
        }
    }

    private ab a(String str, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        ab abVar;
        JSONArray jSONArrayOptJSONArray2;
        String str2 = "sdk";
        if (jSONObject != null) {
            try {
                if (jSONObject.has(com.umeng.ccg.a.l) && (jSONArrayOptJSONArray = jSONObject.optJSONArray(com.umeng.ccg.a.l)) != null && jSONArrayOptJSONArray.length() > 0) {
                    JSONObject jSONObject2 = (JSONObject) jSONArrayOptJSONArray.get(0);
                    boolean zHas = jSONObject2.has(com.umeng.ccg.a.m);
                    boolean zHas2 = jSONObject2.has(com.umeng.ccg.a.p);
                    boolean zHas3 = jSONObject2.has(com.umeng.ccg.a.q);
                    if (!zHas || !zHas2 || !zHas3) {
                        return null;
                    }
                    try {
                        int iOptInt = jSONObject2.optInt(com.umeng.ccg.a.m);
                        long jOptLong = jSONObject2.optLong(com.umeng.ccg.a.p);
                        long jOptLong2 = jSONObject2.optLong(com.umeng.ccg.a.q);
                        String strOptString = jSONObject2.optString(com.umeng.ccg.a.r);
                        ArrayList arrayList = new ArrayList();
                        if (!jSONObject2.has(com.umeng.ccg.a.n)) {
                            str2 = "sdk";
                        } else {
                            JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray(com.umeng.ccg.a.n);
                            HashSet hashSet = new HashSet();
                            if (jSONArrayOptJSONArray3 != null) {
                                int i2 = 0;
                                for (int length = jSONArrayOptJSONArray3.length(); i2 < length; length = length) {
                                    hashSet.add(Integer.valueOf(jSONArrayOptJSONArray3.getInt(i2)));
                                    i2++;
                                }
                            }
                            if (hashSet.size() > 0) {
                                am amVar = new am(hashSet);
                                if (Arrays.asList(d).contains(str)) {
                                    a(str, amVar);
                                } else {
                                    arrayList.add(amVar);
                                    if (com.umeng.ccg.a.i.equalsIgnoreCase(str)) {
                                        a(str, amVar);
                                    }
                                }
                            }
                        }
                        if (jSONObject2.has(com.umeng.ccg.a.o)) {
                            String strOptString2 = jSONObject2.optString(com.umeng.ccg.a.o);
                            if (!TextUtils.isEmpty(strOptString2)) {
                                ak akVar = new ak(strOptString2);
                                HashSet hashSet2 = new HashSet();
                                for (int i3 = 1; i3 <= 24; i3++) {
                                    if (akVar.a(i3)) {
                                        hashSet2.add(Integer.valueOf(i3));
                                    }
                                }
                                if (hashSet2.size() > 0) {
                                    ag agVar = new ag(hashSet2);
                                    if (Arrays.asList(d).contains(str)) {
                                        a(str, agVar);
                                    } else {
                                        arrayList.add(agVar);
                                    }
                                    if (com.umeng.ccg.a.i.equalsIgnoreCase(str)) {
                                        a(str, agVar);
                                    }
                                }
                            }
                        }
                        arrayList.add(new ai(iOptInt));
                        ah ahVar = new ah(str, jOptLong);
                        String[] strArr = d;
                        if (Arrays.asList(strArr).contains(str)) {
                            a(str, ahVar);
                        } else {
                            arrayList.add(ahVar);
                        }
                        if (com.umeng.ccg.a.i.equalsIgnoreCase(str)) {
                            a(str, ahVar);
                        }
                        af afVar = new af(jOptLong2);
                        if (Arrays.asList(strArr).contains(str)) {
                            a(str, afVar);
                            arrayList.add(afVar);
                        } else {
                            arrayList.add(afVar);
                        }
                        if (com.umeng.ccg.a.i.equalsIgnoreCase(str)) {
                            a(str, afVar);
                        }
                        if (com.umeng.ccg.a.e.equals(str)) {
                            abVar = new ad(str, arrayList);
                        } else if (com.umeng.ccg.a.i.equals(str)) {
                            abVar = new ae(str, arrayList);
                        } else {
                            abVar = new ab(str, arrayList);
                        }
                        ab abVar2 = abVar;
                        try {
                            abVar2.b(str, jSONObject2);
                            abVar2.a(strOptString);
                            String str3 = "";
                            String str4 = str2;
                            if (jSONObject.has(str4) && (jSONArrayOptJSONArray2 = jSONObject.optJSONArray(str4)) != null) {
                                Map<String, b> map = this.l;
                                if (map != null && !map.containsKey(str)) {
                                    this.l.put(str, new b(new JSONArray(jSONArrayOptJSONArray2.toString()), strOptString));
                                }
                                int length2 = jSONArrayOptJSONArray2.length();
                                for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                                    str3 = str3 + jSONArrayOptJSONArray2.getString(i4);
                                    if (i4 < length2 - 1) {
                                        str3 = str3 + ",";
                                    }
                                }
                            }
                            abVar2.b(str3);
                            return abVar2;
                        } catch (Throwable unused) {
                            return abVar2;
                        }
                    } catch (Throwable unused2) {
                        return null;
                    }
                }
            } catch (Throwable unused3) {
            }
        }
        return null;
    }

    private void a(Context context, String str, long j2) {
        SharedPreferences sharedPreferencesA;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] strArrSplit = str.split("@");
            if (strArrSplit.length != 4 || (sharedPreferencesA = au.a(context)) == null) {
                return;
            }
            long j3 = Long.parseLong(strArrSplit[0]);
            String str2 = strArrSplit[1];
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putLong(au.c, j2);
            editorEdit.putLong(au.d, j3);
            editorEdit.putString(au.e, str2).commit();
            UMRTLog.i(UMRTLog.RTLOG_TAG, "updateTsS1S2 : ts = " + j2 + "; s1 = " + j3 + "; s2 = " + str2);
        } catch (Throwable unused) {
        }
    }

    private void a(String str) {
        try {
            String[] strArrSplit = str.split("@");
            if (strArrSplit.length != 4) {
                return;
            }
            long j2 = Long.parseLong(strArrSplit[0]);
            String str2 = strArrSplit[1];
            if (!TextUtils.isEmpty(this.k)) {
                String[] strArrSplit2 = this.k.split("@");
                if (strArrSplit2.length == 2) {
                    long j3 = Long.parseLong(strArrSplit2[0]);
                    String str3 = strArrSplit2[1];
                    if (j3 == j2 && str3.equalsIgnoreCase(str2)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "重复的iucc S1 and S2, 忽略本次更新，不发起fetch。");
                        return;
                    }
                }
            }
            SharedPreferences sharedPreferencesA = au.a(UMGlobalContext.getAppContext());
            if (sharedPreferencesA != null) {
                if (sharedPreferencesA.getLong(au.c, 0L) != j2) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "local config ts != iuccS1, send FETCH_NEW_CONFIG msg.");
                    this.k = String.valueOf(j2) + "@" + str2;
                    com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 101, a(), str);
                    return;
                }
                d(UMGlobalContext.getAppContext());
                if (e(UMGlobalContext.getAppContext()).equalsIgnoreCase(str2)) {
                    return;
                }
                UMRTLog.i(UMRTLog.RTLOG_TAG, "local S2 != iuccS2, send FETCH_NEW_CONFIG msg.");
                this.k = String.valueOf(j2) + "@" + str2;
                com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 101, a(), str);
            }
        } catch (Throwable unused) {
        }
    }

    private void a(boolean z) {
        try {
            SharedPreferences sharedPreferencesA = au.a(UMGlobalContext.getAppContext());
            if (sharedPreferencesA != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
                if (z) {
                    editorEdit.putString(au.g, "1").commit();
                } else {
                    editorEdit.putString(au.g, "").commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    private JSONObject a(String str, int i2, int i3) {
        b bVar;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject.put("id", "$$_umc_ev1");
            jSONObject.put("ts", jCurrentTimeMillis);
            jSONObject.put(TtmlNode.TAG_TT, str);
            jSONObject.put(com.umeng.ccg.a.B, i2);
            jSONObject.put("result", i3);
            if (!this.l.containsKey(com.umeng.ccg.a.i) || (bVar = this.l.get(com.umeng.ccg.a.i)) == null) {
                return null;
            }
            JSONObject jSONObjectA = ao.a(UMGlobalContext.getAppContext(), bVar.a(), bVar.b());
            JSONObject jSONObjectA2 = ao.a(UMGlobalContext.getAppContext(), jSONObject);
            if (jSONObjectA == null || jSONObjectA2 == null) {
                return null;
            }
            return ao.a(jSONObjectA, jSONObjectA2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public JSONObject a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject.put("id", "$$_umc_ev2");
            jSONObject.put("ts", jCurrentTimeMillis);
            jSONObject.put(TtmlNode.TAG_TT, str);
            jSONObject.put("flag", str2);
            jSONObject.put("ss", str3);
            JSONObject jSONObjectA = ao.a(UMGlobalContext.getAppContext(), new JSONArray(), "");
            JSONObject jSONObjectA2 = ao.a(UMGlobalContext.getAppContext(), jSONObject);
            if (jSONObjectA == null || jSONObjectA2 == null) {
                return null;
            }
            return ao.a(jSONObjectA, jSONObjectA2);
        } catch (Throwable unused) {
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    private void a(Context context, String str, JSONObject jSONObject) {
        JSONObject jSONObjectA;
        Object objA;
        try {
            b(com.umeng.ccg.a.i);
            final String strOptString = "";
            if (jSONObject.has("target")) {
                strOptString = jSONObject.optString("target");
            }
            if (TextUtils.isEmpty(strOptString)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> target is empty, ignore umc_cfg process");
                return;
            }
            final int iOptInt = jSONObject.has(com.umeng.ccg.a.B) ? jSONObject.optInt(com.umeng.ccg.a.B) : 0;
            if (iOptInt == 0) {
                JSONObject jSONObjectJ = j();
                if (jSONObjectJ == null || (objA = aw.a(jSONObjectJ.optString(bc.aL), jSONObjectJ.optString(bc.aH), new Class[]{String.class}, context, new Object[]{jSONObjectJ.optString("a")})) == null || Build.VERSION.SDK_INT < 23) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("ss", Base64.encodeToString(ax.a(DeviceConfig.getPackageName(context).getBytes(), UMUtils.genSin()), 0).trim());
                aw.a(jSONObjectJ.optString("m"), jSONObjectJ.optString("x"), new Class[]{String.class, String.class, String[].class, Bundle.class, Activity.class, aw.a(jSONObjectJ.optString(bc.aJ)), Handler.class}, objA, new Object[]{strOptString, com.umeng.ccg.a.k, null, bundle, null, new AccountManagerCallback<Bundle>() { // from class: com.umeng.ccg.d.2
                    @Override // android.accounts.AccountManagerCallback
                    public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
                        int i2 = 1;
                        try {
                            accountManagerFuture.getResult();
                            i2 = 0;
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> umc_cfg p s!");
                        } catch (Throwable unused) {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> umc_cfg p f!");
                        }
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 305, d.a(), d.this.new c(strOptString, iOptInt, i2));
                    }
                }, null});
                return;
            }
            if (Build.VERSION.SDK_INT < 23 || (jSONObjectA = a(strOptString, iOptInt, 0)) == null) {
                return;
            }
            av.a(new aq(aq.b, jSONObjectA), 0L, TimeUnit.SECONDS);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x03a5 A[Catch: all -> 0x0557, TryCatch #4 {all -> 0x0557, blocks: (B:9:0x003d, B:11:0x004b, B:17:0x006c, B:19:0x0082, B:20:0x008b, B:23:0x0097, B:25:0x00a2, B:27:0x00ac, B:30:0x00e3, B:32:0x00ee, B:34:0x00f8, B:37:0x012f, B:39:0x013a, B:41:0x0144, B:43:0x0178, B:45:0x017c, B:47:0x0199, B:49:0x01ae, B:51:0x01be, B:54:0x01c6, B:55:0x01d4, B:57:0x01da, B:58:0x01ea, B:60:0x01f0, B:61:0x0200, B:63:0x0206, B:65:0x020c, B:67:0x0212, B:70:0x021e, B:71:0x022c, B:73:0x0235, B:77:0x0242, B:79:0x024e, B:81:0x0254, B:84:0x028d, B:82:0x0277, B:85:0x0296, B:86:0x029f, B:88:0x02a6, B:90:0x02aa, B:94:0x02b7, B:96:0x02c7, B:98:0x02d4, B:100:0x02da, B:103:0x02ee, B:105:0x02f7, B:107:0x0301, B:109:0x0307, B:110:0x030d, B:111:0x0337, B:112:0x033d, B:114:0x0344, B:116:0x0348, B:128:0x0381, B:130:0x0389, B:132:0x0391, B:134:0x0399, B:136:0x03a1, B:137:0x03a5, B:138:0x03a9, B:140:0x03af, B:141:0x03cf, B:169:0x0486, B:171:0x0494, B:173:0x049a, B:174:0x04a6, B:180:0x04bf, B:182:0x04cb, B:183:0x04da, B:191:0x050f, B:192:0x0530, B:194:0x0536), top: B:207:0x0024 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v17, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v20, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    @Override // com.umeng.ccg.c.a
    public void a(Object obj, int i2) {
        JSONObject jSONObjectB;
        ArrayList arrayList;
        int size;
        JSONObject jSONObject;
        b bVar;
        b bVar2;
        b bVar3;
        try {
            switch (i2) {
                case 101:
                    if (obj != null && (obj instanceof String)) {
                        String str = (String) obj;
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "[workEvent]: recv FETCH_NEW_CONFIG msg. source iucc is: ".concat(str));
                        JSONObject jSONObjectA = ao.a(UMGlobalContext.getAppContext(), str);
                        if (jSONObjectA != null) {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "[imprint] send request. body: " + jSONObjectA.toString());
                            av.a(new ar(ar.f2497a, jSONObjectA, str), 0L, TimeUnit.SECONDS);
                        }
                        if (i()) {
                            c(UMGlobalContext.getAppContext());
                            String strImprintProperty = UMEnvelopeBuild.imprintProperty(UMGlobalContext.getAppContext(), f2618a, "");
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "manual check iucc value: " + strImprintProperty);
                            a(strImprintProperty);
                        }
                        break;
                    }
                    break;
                case 102:
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "[workEvent]: recv FETCH_RESPONSE msg.");
                    this.k = "";
                    if (obj != null && (obj instanceof JSONObject)) {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        if (a(jSONObject2.optJSONObject("config"))) {
                            com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 103, a(), jSONObject2);
                        } else {
                            com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 104, a(), null);
                        }
                    } else {
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 104, a(), null);
                    }
                    break;
                case 103:
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "[workEvent]: recv FETCH_SUCCESS msg.");
                    Context appContext = UMGlobalContext.getAppContext();
                    if (obj != null && (obj instanceof JSONObject)) {
                        JSONObject jSONObject3 = (JSONObject) obj;
                        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("config");
                        String strOptString = jSONObject3.optString("sourceIucc");
                        if (jSONObjectOptJSONObject != null) {
                            if (i()) {
                                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 成功拉取云配参数后，检测到should fetch标志，清除此标志。更新SDK类型集缓存值");
                                h();
                                a(false);
                            }
                            a(appContext, jSONObjectOptJSONObject, strOptString);
                            CcgAgent.notifyConfigChanged(jSONObjectOptJSONObject);
                        }
                        break;
                    }
                    break;
                case 104:
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "[workEvent]: recv FETCH_FAILED msg.");
                    break;
                case 105:
                    String[] collectItemList = CcgAgent.getCollectItemList();
                    int length = collectItemList.length;
                    ?? jSONObject4 = 0;
                    while (jSONObject4 < length) {
                        String str2 = collectItemList[jSONObject4];
                        ArrayList<String> forbidSdkArray = CcgAgent.getForbidSdkArray(str2);
                        StringBuilder sbU = AbstractC3950lJ.u("[forbid_sdk] 采集项: ", str2, "; 值: ");
                        sbU.append(forbidSdkArray.toString());
                        UMRTLog.i(UMRTLog.RTLOG_TAG, sbU.toString());
                        jSONObject4++;
                    }
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "[workEvent]: recv LOAD_CONFIG msg.");
                    int i3 = 0;
                    try {
                        try {
                            jSONObjectB = b(UMGlobalContext.getAppContext());
                            try {
                                if (jSONObjectB != null && a(jSONObjectB)) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                jSONObject4 = new JSONObject();
                                jSONObject4.put("result", i3);
                                jSONObject4 = jSONObject4;
                                if (jSONObjectB != null) {
                                    jSONObject4.put("config", jSONObjectB);
                                }
                            } catch (Throwable unused) {
                                jSONObject4 = new JSONObject();
                                jSONObject4.put("result", i3);
                                jSONObject4 = jSONObject4;
                                if (jSONObjectB != null) {
                                }
                                com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 106, a(), jSONObject4);
                                return;
                            }
                        } catch (Throwable unused2) {
                            jSONObjectB = null;
                        }
                        break;
                    } catch (Throwable unused3) {
                    }
                    com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 106, a(), jSONObject4);
                    break;
                case 106:
                    if (obj != null && (obj instanceof JSONObject)) {
                        JSONObject jSONObject5 = (JSONObject) obj;
                        if (jSONObject5.has("result")) {
                            if ((jSONObject5.optInt("result") & 1) != 0 && jSONObject5.has("config")) {
                                JSONObject jSONObjectOptJSONObject2 = jSONObject5.optJSONObject("config");
                                c = jSONObjectOptJSONObject2;
                                if (jSONObjectOptJSONObject2 != null) {
                                    CcgAgent.notifyConfigReady(jSONObjectOptJSONObject2);
                                } else {
                                    CcgAgent.notifyConfigReady(null);
                                }
                            } else {
                                CcgAgent.notifyConfigReady(null);
                            }
                        }
                        if (g()) {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 检测到集成的SDK类型集合发生变化，发起云配参数拉取请求(设置本地should fetch标志).");
                            String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(UMGlobalContext.getAppContext(), f2618a, "");
                            a(true);
                            com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 101, a(), strImprintProperty2);
                        } else {
                            c(UMGlobalContext.getAppContext());
                            String strImprintProperty3 = UMEnvelopeBuild.imprintProperty(UMGlobalContext.getAppContext(), f2618a, "");
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "manual check iucc value: " + strImprintProperty3);
                            a(strImprintProperty3);
                        }
                        break;
                    }
                    break;
                case 107:
                    if (obj != null) {
                        try {
                            if (obj instanceof String) {
                                String str3 = (String) obj;
                                UMRTLog.i(UMRTLog.RTLOG_TAG, "[IMPRINT_IUCC_CHANGED] iucc : ".concat(str3));
                                a(str3);
                            }
                        } catch (Throwable th) {
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "[imprint] process error " + th.getMessage());
                            return;
                        }
                    }
                    break;
                default:
                    switch (i2) {
                        case 201:
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "recv PARSE_CONFIG msg.");
                            if (obj != null && (obj instanceof JSONObject)) {
                                c((JSONObject) obj);
                                break;
                            }
                            break;
                        case 202:
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "recv COLLECTION_JUDGMENT msg.");
                            if (obj != null && (obj instanceof ArrayList) && (size = (arrayList = (ArrayList) obj).size()) > 0) {
                                int i4 = 0;
                                JSONObject jSONObject6 = null;
                                while (i4 < size) {
                                    ab abVar = (ab) arrayList.get(i4);
                                    String strA = abVar.a();
                                    if (com.umeng.ccg.a.i.equalsIgnoreCase(strA)) {
                                        jSONObject = new JSONObject();
                                        jSONObject.put(com.umeng.ccg.a.j, 202);
                                    } else {
                                        jSONObject = jSONObject6;
                                    }
                                    JSONObject jSONObjectA2 = abVar.a(strA, jSONObject);
                                    if (jSONObjectA2 != null) {
                                        long jOptLong = !Arrays.asList(d).contains(abVar.a()) ? jSONObjectA2.optLong("delay") * 1000 : 0L;
                                        if (com.umeng.ccg.a.i.equalsIgnoreCase(abVar.a()) && jSONObjectA2.optInt(com.umeng.ccg.a.z) == 0) {
                                            jOptLong = jSONObjectA2.optLong("delay") * 1000;
                                        }
                                        long j2 = jOptLong;
                                        jSONObjectA2.remove("delay");
                                        UMRTLog.i(UMRTLog.RTLOG_TAG, "send START_COLLECT msg, delayTs = " + j2);
                                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 203, a(), jSONObjectA2, j2);
                                    }
                                    i4++;
                                    jSONObject6 = jSONObject;
                                }
                                break;
                            }
                            break;
                        case 203:
                            if (obj != null && (obj instanceof JSONObject)) {
                                JSONObject jSONObject7 = (JSONObject) obj;
                                String strOptString2 = jSONObject7.optString("actionName");
                                UMRTLog.i(UMRTLog.RTLOG_TAG, "recv START_COLLECT msg. name is : " + strOptString2);
                                if (!com.umeng.ccg.b.a(strOptString2)) {
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "Local switch of [" + strOptString2 + "] is off, ignore this command.");
                                    break;
                                } else {
                                    String string = jSONObject7.toString();
                                    if (Arrays.asList(e).contains(strOptString2)) {
                                        if (com.umeng.ccg.a.f.equalsIgnoreCase(strOptString2)) {
                                            UMRTLog.i(UMRTLog.RTLOG_TAG, "register Intent.ACTION_SCREEN_ON");
                                            a(UMGlobalContext.getAppContext(), "android.intent.action.SCREEN_ON", m);
                                        }
                                        if (com.umeng.ccg.a.g.equalsIgnoreCase(strOptString2)) {
                                            UMRTLog.i(UMRTLog.RTLOG_TAG, "register Intent.ACTION_SCREEN_OFF");
                                            a(UMGlobalContext.getAppContext(), "android.intent.action.SCREEN_OFF", m);
                                        }
                                        if (com.umeng.ccg.a.h.equalsIgnoreCase(strOptString2)) {
                                            UMRTLog.i(UMRTLog.RTLOG_TAG, "register Intent.ACTION_USER_PRESENT");
                                            a(UMGlobalContext.getAppContext(), "android.intent.action.USER_PRESENT", m);
                                        }
                                        if (com.umeng.ccg.a.i.equalsIgnoreCase(strOptString2) && jSONObject7.has(com.umeng.ccg.a.z)) {
                                            int iOptInt = jSONObject7.optInt(com.umeng.ccg.a.z);
                                            if (iOptInt == 0) {
                                                a(UMGlobalContext.getAppContext(), strOptString2, jSONObject7);
                                            } else if (iOptInt == 1) {
                                                a(UMGlobalContext.getAppContext(), "android.intent.action.SCREEN_ON", new a());
                                            }
                                            break;
                                        }
                                    } else {
                                        b(strOptString2);
                                        if (CcgAgent.hasRegistedActionInfo()) {
                                            boolean z = CcgAgent.getActionInfo("anti") != null;
                                            String strOptString3 = jSONObject7.optString(com.umeng.ccg.a.s);
                                            if (TextUtils.isEmpty(strOptString3)) {
                                                UMRTLog.i(UMRTLog.RTLOG_TAG, "忽略 本次采集项[" + strOptString2 + "]采集请求.");
                                            } else {
                                                ActionInfo actionInfo = CcgAgent.getActionInfo(strOptString3);
                                                if (actionInfo != null) {
                                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "调用[" + strOptString3 + "] onCommand接口方法, 参数: " + jSONObject7.toString());
                                                    actionInfo.onCommand(UMGlobalContext.getAppContext(), strOptString2, jSONObject7);
                                                }
                                            }
                                            if (!z) {
                                                as.a(UMGlobalContext.getAppContext(), string);
                                            }
                                        } else {
                                            as.a(UMGlobalContext.getAppContext(), string);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            switch (i2) {
                                case 301:
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv REPORT_SCREEN_ON msg.");
                                    b(com.umeng.ccg.a.f);
                                    if (this.l.containsKey(com.umeng.ccg.a.f) && (bVar = this.l.get(com.umeng.ccg.a.f)) != null) {
                                        JSONObject jSONObjectA3 = ao.a(UMGlobalContext.getAppContext(), 1, bVar.a(), bVar.b());
                                        UMRTLog.i(UMRTLog.RTLOG_TAG, "screen_on event param: " + jSONObjectA3.toString());
                                        av.a(new aq(aq.f2496a, jSONObjectA3), 0L, TimeUnit.SECONDS);
                                        break;
                                    }
                                    break;
                                case 302:
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv REPORT_SCREEN_OFF msg.");
                                    b(com.umeng.ccg.a.g);
                                    if (this.l.containsKey(com.umeng.ccg.a.g) && (bVar2 = this.l.get(com.umeng.ccg.a.g)) != null) {
                                        JSONObject jSONObjectA4 = ao.a(UMGlobalContext.getAppContext(), 3, bVar2.a(), bVar2.b());
                                        UMRTLog.i(UMRTLog.RTLOG_TAG, "screen_off event param: " + jSONObjectA4.toString());
                                        av.a(new aq(aq.f2496a, jSONObjectA4), 0L, TimeUnit.SECONDS);
                                        break;
                                    }
                                    break;
                                case 303:
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv REPORT_SCREEN_UNLOCK msg.");
                                    b(com.umeng.ccg.a.h);
                                    if (this.l.containsKey(com.umeng.ccg.a.h) && (bVar3 = this.l.get(com.umeng.ccg.a.h)) != null) {
                                        JSONObject jSONObjectA5 = ao.a(UMGlobalContext.getAppContext(), 2, bVar3.a(), bVar3.b());
                                        UMRTLog.i(UMRTLog.RTLOG_TAG, "screen_unlock event param: " + jSONObjectA5.toString());
                                        av.a(new aq(aq.f2496a, jSONObjectA5), 0L, TimeUnit.SECONDS);
                                        break;
                                    }
                                    break;
                                case 304:
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv INVOKE_APPACT_WHEN_SC_ON msg.");
                                    if (!com.umeng.ccg.b.a(com.umeng.ccg.a.i)) {
                                        UMRTLog.i(UMRTLog.RTLOG_TAG, "Local switch of [umc_cfg] is off, ignore this command.");
                                    } else {
                                        JSONObject jSONObject8 = new JSONObject();
                                        jSONObject8.put(com.umeng.ccg.a.j, 304);
                                        ab abVar2 = j;
                                        JSONObject jSONObjectA6 = abVar2.a(abVar2.a(), jSONObject8);
                                        if (jSONObjectA6 != null) {
                                            a(UMGlobalContext.getAppContext(), com.umeng.ccg.a.i, jSONObjectA6);
                                        } else {
                                            UMRTLog.i(UMRTLog.RTLOG_TAG, "appActAction.process return null !");
                                        }
                                    }
                                    break;
                                case 305:
                                    c cVar = (c) obj;
                                    JSONObject jSONObjectA7 = a(cVar.f2622a, cVar.b, cVar.c);
                                    if (jSONObjectA7 != null) {
                                        av.a(new aq(aq.b, jSONObjectA7), 0L, TimeUnit.SECONDS);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } catch (Throwable unused4) {
        }
    }
}
