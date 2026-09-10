package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.aj0;
import com.google.android.gms.internal.ads.ws;
import com.google.android.gms.internal.ads.z40;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.C0375hc;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nf implements k3.d, rl.k, wd.b, t8.b, ye.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f23782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f23783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f23784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f23785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f23786f;

    public /* synthetic */ nf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f23781a = i10;
        this.f23782b = obj;
        this.f23783c = obj2;
        this.f23784d = obj3;
        this.f23785e = obj4;
        this.f23786f = obj5;
    }

    public static nf c(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        nf nfVar = new nf(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) nfVar.f23785e)) {
            try {
                ((ArrayDeque) nfVar.f23785e).clear();
                String string = ((SharedPreferences) nfVar.f23782b).getString((String) nfVar.f23783c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) nfVar.f23784d)) {
                    String[] strArrSplit = string.split((String) nfVar.f23784d, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) nfVar.f23785e).add(str);
                        }
                    }
                    return nfVar;
                }
                return nfVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Exception j(Task task) {
        return task.getException() != null ? task.getException() : new ExecutionException(new RuntimeException("Unexpected Error"));
    }

    public static void r(Throwable th2) {
        Log.e("WebChromeClientImpl", th2.getClass().getSimpleName() + ", Message: " + th2.getMessage() + ", Stacktrace: " + Log.getStackTraceString(th2));
    }

    public void A(SharedPreferences.Editor editor) {
        editor.putString("FlutterSecureSAlgorithmKey", ((ze.b) this.f23784d).name());
        editor.putString("FlutterSecureSAlgorithmStorage", ((ze.f) this.f23785e).name());
    }

    public void B(String str) {
        if (an.p.p0(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(strSubstring);
        } else if (an.p.p0(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            kotlin.jvm.internal.n.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(strSubstring2);
        }
        kotlin.jvm.internal.n.f(str, "<this>");
        ws wsVar = new ws();
        wsVar.c(null, str);
        this.f23782b = wsVar.a();
    }

    public xn.s a() {
        Map mapUnmodifiableMap;
        xn.m mVar = (xn.m) this.f23782b;
        if (mVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f23783c;
        xn.l lVarI = ((h2.d) this.f23784d).i();
        xn.u uVar = (xn.u) this.f23785e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f23786f;
        byte[] bArr = yn.a.f54560a;
        kotlin.jvm.internal.n.f(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = xj.w.f53867a;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            kotlin.jvm.internal.n.e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new xn.s(mVar, str, lVarI, uVar, mapUnmodifiableMap);
    }

    public boolean b() {
        return ((ze.b) this.f23782b) != ((ze.b) this.f23784d);
    }

    public ze.e d(Context context, ze.a aVar, Cipher cipher, ze.f fVar) throws Exception {
        ye.e eVar = (ye.e) this.f23786f;
        if (fVar == ze.f.AES_GCM_NoPadding) {
            return aVar instanceof ze.c ? new zc.u(context, cipher, eVar) : new ze.g(context, aVar, eVar, 1);
        }
        if (fVar.f54920a != null) {
            return new ze.g(context, aVar, eVar, 0);
        }
        throw new Exception("No implementation available for algorithm: " + fVar.name());
    }

    public xi.l e() {
        if (((tj.g) this.f23784d) == null) {
            this.f23784d = new tj.g(this);
        }
        tj.g gVar = (tj.g) this.f23784d;
        kotlin.jvm.internal.n.c(gVar);
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ye.g
    public void f(BiometricPrompt.AuthenticationResult authenticationResult) {
        switch (this.f23781a) {
            case 11:
                r1.s sVar = (r1.s) this.f23785e;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f23783c;
                af.b bVar = (af.b) this.f23782b;
                ye.d dVar = (ye.d) this.f23786f;
                try {
                    dVar.s(bVar, sharedPreferences, dVar.f54375d);
                    dVar.f54374c = sharedPreferences;
                    Log.i("FlutterSecureStorage", "Migration completed successfully. Now using custom cipher storage.");
                    ye.d.y((v6.c) this.f23784d);
                    sVar.f(null);
                } catch (Exception e10) {
                    Log.e("FlutterSecureStorage", "Migration failed. Falling back to EncryptedSharedPreferences.", e10);
                    dVar.f54374c = bVar;
                    sVar.f(null);
                    return;
                }
                break;
            default:
                zc.u uVar = (zc.u) this.f23784d;
                ye.d dVar2 = (ye.d) this.f23785e;
                try {
                    Log.d("FlutterSecureStorage", "Step 5/6: Initializing current biometric cipher...");
                    ze.e eVarI = dVar2.f54376e.i(dVar2.f54373b, (Cipher) this.f23782b);
                    Log.d("FlutterSecureStorage", "Step 6/6: Encrypting all data with current biometric cipher...");
                    ye.d.e((HashMap) this.f23786f, (SharedPreferences) this.f23783c, eVarI);
                    dVar2.f54375d = eVarI;
                    Log.i("FlutterSecureStorage", "Non-biometric→Biometric migration completed! Data now requires biometric authentication.");
                    uVar.f(null);
                } catch (Exception e11) {
                    Log.e("FlutterSecureStorage", "Failed to complete migration after authentication", e11);
                    uVar.h(e11);
                }
                break;
        }
    }

    public ze.a g(Context context) {
        return ((ze.b) this.f23784d).f54912a.a(context, (ye.e) this.f23786f);
    }

    @Override // vj.a
    public Object get() {
        switch (this.f23781a) {
            case 7:
                return new ud.s0((mb.g) ((rb.c) this.f23782b).f49529b, (uc.d) ((wd.c) this.f23783c).get(), (xd.j) ((wd.c) this.f23784d).get(), (ud.l) ((wd.c) this.f23785e).get(), (ak.k) ((wd.c) this.f23786f).get());
            case 8:
                return new w8.a((Executor) ((vj.a) this.f23782b).get(), (s8.d) ((vj.a) this.f23783c).get(), (r1.s) ((qd.i) this.f23784d).get(), (y8.d) ((vj.a) this.f23785e).get(), (z8.c) ((vj.a) this.f23786f).get());
            default:
                return new xd.c((ud.g1) ((wd.c) this.f23782b).get(), (uc.d) ((wd.c) this.f23783c).get(), (ud.b) ((wd.c) this.f23784d).get(), (xd.d) ((wd.c) this.f23785e).get(), (xd.n) ((wd.c) this.f23786f).get());
        }
    }

    @Override // k3.d
    public List getCues(long j10) {
        q3.c cVar = (q3.c) this.f23782b;
        Map map = (Map) this.f23784d;
        HashMap map2 = (HashMap) this.f23786f;
        HashMap map3 = (HashMap) this.f23785e;
        ArrayList<Pair> arrayList = new ArrayList();
        cVar.g(j10, cVar.f48600h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j10, false, cVar.f48600h, treeMap);
        cVar.h(j10, map, map2, cVar.f48600h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                q3.e eVar = (q3.e) map2.get(pair.first);
                eVar.getClass();
                arrayList2.add(new k1.b(null, null, null, bitmapDecodeByteArray, eVar.f48616c, 0, eVar.f48618e, eVar.f48615b, 0, Integer.MIN_VALUE, -3.4028235E38f, eVar.f48619f, eVar.f48620g, false, -16777216, eVar.f48623j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            q3.e eVar2 = (q3.e) map2.get(entry.getKey());
            eVar2.getClass();
            k1.a aVar = (k1.a) entry.getValue();
            CharSequence charSequence = aVar.f44201a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (q3.a aVar2 : (q3.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), q3.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = eVar2.f48616c;
            int i18 = eVar2.f48617d;
            aVar.f44205e = f10;
            aVar.f44206f = i18;
            aVar.f44207g = eVar2.f48618e;
            aVar.f44208h = eVar2.f48615b;
            aVar.l = eVar2.f48619f;
            float f11 = eVar2.f48622i;
            int i19 = eVar2.f48621h;
            aVar.f44211k = f11;
            aVar.f44210j = i19;
            aVar.f44215p = eVar2.f48623j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // k3.d
    public long getEventTime(int i10) {
        return ((long[]) this.f23783c)[i10];
    }

    @Override // k3.d
    public int getEventTimeCount() {
        return ((long[]) this.f23783c).length;
    }

    @Override // k3.d
    public int getNextEventTimeIndex(long j10) {
        long[] jArr = (long[]) this.f23783c;
        int iB = l1.y.b(jArr, j10, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // ye.g
    public void h(Exception exc) {
        switch (this.f23781a) {
            case 11:
                Log.e("FlutterSecureStorage", "Cipher initialization failed during migration. Using EncryptedSharedPreferences.", exc);
                ((ye.d) this.f23786f).f54374c = (af.b) this.f23782b;
                ((r1.s) this.f23785e).f(null);
                break;
            default:
                Log.e("FlutterSecureStorage", "Biometric authentication failed for migration", exc);
                ((zc.u) this.f23784d).h(new Exception("Migration cancelled: Biometric authentication failed", exc));
                break;
        }
    }

    public ze.e i(Context context, Cipher cipher) {
        return d(context, ((ze.b) this.f23784d).f54912a.a(context, (ye.e) this.f23786f), cipher, (ze.f) this.f23785e);
    }

    @Override // rl.k
    public void k() {
        ((fc.f) this.f23783c).k();
        fc.f fVar = (fc.f) this.f23784d;
        ((HashMap) fVar.f40781c).put((yl.f) this.f23785e, new dm.a((al.c) xj.n.F0((ArrayList) this.f23786f)));
    }

    @Override // rl.k
    public rl.l l(yl.f fVar) {
        return ((fc.f) this.f23782b).l(fVar);
    }

    public ze.a m(Context context) {
        return ((ze.b) this.f23782b).f54912a.a(context, (ye.e) this.f23786f);
    }

    public ze.e n(Context context, Cipher cipher) {
        return d(context, ((ze.b) this.f23782b).f54912a.a(context, (ye.e) this.f23786f), cipher, (ze.f) this.f23783c);
    }

    public void o(String str, String value) {
        kotlin.jvm.internal.n.f(value, "value");
        h2.d dVar = (h2.d) this.f23784d;
        dVar.getClass();
        com.bumptech.glide.d.h(str);
        com.bumptech.glide.d.l(value, str);
        dVar.k(str);
        dVar.g(str, value);
    }

    @Override // rl.k
    public void p(yl.f fVar, Object obj) {
        ((fc.f) this.f23782b).p(fVar, obj);
    }

    public boolean q() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        mb.g gVar = (mb.g) this.f23783c;
        gVar.a();
        Context context = gVar.f45928a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (bundle = (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)).metaData) == null || !bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public void s(String method, xn.u uVar) {
        kotlin.jvm.internal.n.f(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (uVar == null) {
            if (method.equals(C0375hc.f28789b) || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                throw new IllegalArgumentException(defpackage.e.o("method ", method, " must have a request body.").toString());
            }
        } else if (!com.bumptech.glide.d.G(method)) {
            throw new IllegalArgumentException(defpackage.e.o("method ", method, " must not have a request body.").toString());
        }
        this.f23783c = method;
        this.f23785e = uVar;
    }

    public Task t() {
        boolean zQ = q();
        if (!zQ || ((aj0) this.f23786f).d() < 261200000) {
            com.google.android.gms.internal.consent_sdk.x xVar = (com.google.android.gms.internal.consent_sdk.x) this.f23785e;
            return xVar.C(aj0.c((mb.g) xVar.f23260a), zQ, new Bundle()).continueWith(new com.applovin.impl.da(1), new tj.i0(xVar, 18));
        }
        final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new q9.a("Firebase-Messaging-Network-Io"));
        final int i10 = 1;
        Task taskContinueWithTask = ((uc.c) ((uc.d) this.f23784d)).d().continueWithTask(executorServiceNewSingleThreadExecutor, new Continuation(this) { // from class: zc.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ nf f54849b;

            {
                this.f54849b = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                switch (i10) {
                    case 0:
                        if (!task.isSuccessful()) {
                            return Tasks.forException(nf.j(task));
                        }
                        String str = (String) ((Pair) task.getResult()).first;
                        String str2 = (String) ((Pair) task.getResult()).second;
                        nf nfVar = this.f54849b;
                        mb.g gVar = (mb.g) nfVar.f23783c;
                        gVar.a();
                        mb.i iVar = gVar.f45930c;
                        String str3 = iVar.f45943a;
                        gVar.a();
                        h9.b bVar = new h9.b(aj0.c(gVar), iVar.f45944b, str3, str, str2);
                        y9.d dVar = (y9.d) nfVar.f23782b;
                        dVar.getClass();
                        com.google.android.gms.common.api.internal.m mVarB = com.google.android.gms.common.api.internal.m.b();
                        mVarB.f11729a = new i9.c[]{h9.f.f42266a};
                        mVarB.f11732d = new v6.c(dVar, bVar);
                        mVarB.f11731c = 39001;
                        return dVar.c(0, mVarB.a()).continueWith(executorServiceNewSingleThreadExecutor, new ae.a(str, 7));
                    default:
                        if (!task.isSuccessful()) {
                            return Tasks.forException(nf.j(task));
                        }
                        String str4 = ((uc.a) task.getResult()).f51979a;
                        nf nfVar2 = this.f54849b;
                        return ((uc.c) ((uc.d) nfVar2.f23784d)).c().continueWithTask(executorServiceNewSingleThreadExecutor, new ae.a(8, str4, nfVar2));
                }
            }
        });
        final int i11 = 0;
        return taskContinueWithTask.continueWithTask(executorServiceNewSingleThreadExecutor, new Continuation(this) { // from class: zc.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ nf f54849b;

            {
                this.f54849b = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                switch (i11) {
                    case 0:
                        if (!task.isSuccessful()) {
                            return Tasks.forException(nf.j(task));
                        }
                        String str = (String) ((Pair) task.getResult()).first;
                        String str2 = (String) ((Pair) task.getResult()).second;
                        nf nfVar = this.f54849b;
                        mb.g gVar = (mb.g) nfVar.f23783c;
                        gVar.a();
                        mb.i iVar = gVar.f45930c;
                        String str3 = iVar.f45943a;
                        gVar.a();
                        h9.b bVar = new h9.b(aj0.c(gVar), iVar.f45944b, str3, str, str2);
                        y9.d dVar = (y9.d) nfVar.f23782b;
                        dVar.getClass();
                        com.google.android.gms.common.api.internal.m mVarB = com.google.android.gms.common.api.internal.m.b();
                        mVarB.f11729a = new i9.c[]{h9.f.f42266a};
                        mVarB.f11732d = new v6.c(dVar, bVar);
                        mVarB.f11731c = 39001;
                        return dVar.c(0, mVarB.a()).continueWith(executorServiceNewSingleThreadExecutor, new ae.a(str, 7));
                    default:
                        if (!task.isSuccessful()) {
                            return Tasks.forException(nf.j(task));
                        }
                        String str4 = ((uc.a) task.getResult()).f51979a;
                        nf nfVar2 = this.f54849b;
                        return ((uc.c) ((uc.d) nfVar2.f23784d)).c().continueWithTask(executorServiceNewSingleThreadExecutor, new ae.a(8, str4, nfVar2));
                }
            }
        });
    }

    @Override // rl.k
    public void u(yl.f fVar, dm.f fVar2) {
        ((fc.f) this.f23782b).u(fVar, fVar2);
    }

    public boolean v() {
        return (((ze.b) this.f23782b) == ((ze.b) this.f23784d) && ((ze.f) this.f23783c) == ((ze.f) this.f23785e)) ? false : true;
    }

    @Override // rl.k
    public void w(yl.f fVar, yl.b bVar, yl.f fVar2) {
        ((fc.f) this.f23782b).w(fVar, bVar, fVar2);
    }

    public void x(Runnable runnable) {
        Context context = (Context) this.f23785e;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void y(o8.a aVar, o8.g gVar) {
        r8.p pVar = (r8.p) this.f23786f;
        r8.i iVar = (r8.i) this.f23782b;
        String str = (String) this.f23783c;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        o8.e eVar = (o8.e) this.f23785e;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        o8.c cVar = (o8.c) this.f23784d;
        w8.b bVar = pVar.f49508c;
        r8.i iVarB = iVar.b(aVar.f47207b);
        z40 z40Var = new z40();
        z40Var.f22496f = new HashMap();
        z40Var.f22494d = Long.valueOf(pVar.f49506a.f());
        z40Var.f22495e = Long.valueOf(pVar.f49507b.f());
        z40Var.f22491a = str;
        z40Var.f22493c = new r8.l(cVar, (byte[]) eVar.apply(aVar.f47206a));
        z40Var.f22492b = null;
        o8.b bVar2 = aVar.f47208c;
        if (bVar2 != null) {
            z40Var.f22497g = bVar2.f47209a;
        }
        w8.a aVar2 = (w8.a) bVar;
        aVar2.f52996b.execute(new bc.r(aVar2, iVarB, gVar, z40Var.b(), 27));
    }

    @Override // rl.k
    public rl.k z(yl.b bVar, yl.f fVar) {
        return ((fc.f) this.f23782b).z(bVar, fVar);
    }

    public /* synthetic */ nf(boolean z10) {
        this.f23781a = 10;
    }

    public nf(Context context, mb.g gVar, uc.d dVar, com.google.android.gms.internal.consent_sdk.x xVar, aj0 aj0Var) {
        this.f23781a = 13;
        this.f23782b = new y9.d(context, null, y9.d.l, j9.b.f43727o9, j9.h.f43737c);
        this.f23783c = gVar;
        this.f23784d = dVar;
        this.f23785e = xVar;
        this.f23786f = aj0Var;
    }

    public nf(ta.q0 q0Var, te teVar, HashMap map) {
        this.f23781a = 0;
        this.f23782b = new ConcurrentHashMap();
        q0Var.getClass();
        this.f23783c = q0Var;
        teVar.getClass();
        this.f23784d = teVar;
        this.f23786f = map;
        go.k.i(!map.isEmpty());
        this.f23785e = hc.f23545c;
    }

    public nf(v6.c cVar, String str, String str2, ye.e eVar) {
        this.f23781a = 15;
        SharedPreferences sharedPreferences = (SharedPreferences) cVar.f52488b;
        this.f23786f = eVar;
        SharedPreferences sharedPreferences2 = (SharedPreferences) cVar.f52487a;
        String string = sharedPreferences2.getString("FlutterSecureSAlgorithmKey", null);
        string = string == null ? sharedPreferences.getString("FlutterSecureSAlgorithmKey", null) : string;
        String string2 = sharedPreferences2.getString("FlutterSecureSAlgorithmStorage", null);
        string2 = string2 == null ? sharedPreferences.getString("FlutterSecureSAlgorithmStorage", null) : string2;
        ze.f fVarValueOf = ze.f.AES_GCM_NoPadding;
        ze.b bVarValueOf = ze.b.AES_GCM_NoPadding;
        ze.f fVar = ze.f.AES_CBC_PKCS7Padding;
        ze.b bVar = ze.b.RSA_ECB_PKCS1Padding;
        if (string != null && string2 != null) {
            this.f23782b = "AES_GCM_NoPadding_BIOMETRIC".equals(string) ? bVarValueOf : ze.b.valueOf(string);
            this.f23783c = "AES_GCM_NoPadding_BIOMETRIC".equals(string2) ? fVarValueOf : ze.f.valueOf(string2);
        } else {
            this.f23782b = bVar;
            this.f23783c = fVar;
        }
        fVarValueOf = "AES_GCM_NoPadding_BIOMETRIC".equals(str2) ? fVarValueOf : ze.f.valueOf(str2);
        int i10 = fVarValueOf.f54921b;
        int i11 = Build.VERSION.SDK_INT;
        this.f23785e = i10 <= i11 ? fVarValueOf : fVar;
        bVarValueOf = "AES_GCM_NoPadding_BIOMETRIC".equals(str) ? bVarValueOf : ze.b.valueOf(str);
        this.f23784d = bVarValueOf.f54913b <= i11 ? bVarValueOf : bVar;
        if ((string == null || string2 == null) && !eVar.f54382f) {
            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
            A(editorEdit);
            editorEdit.apply();
        }
    }

    public nf(xi.f binaryMessenger, Context context, tj.q qVar) {
        this.f23781a = 6;
        kotlin.jvm.internal.n.f(binaryMessenger, "binaryMessenger");
        this.f23782b = binaryMessenger;
        this.f23783c = new tj.c(new qj.x(new tj.e(binaryMessenger), 10));
        this.f23785e = context;
        this.f23786f = qVar;
    }

    public nf(q3.c cVar, HashMap map, HashMap map2, HashMap map3) {
        this.f23781a = 2;
        this.f23782b = cVar;
        this.f23786f = map2;
        this.f23785e = map3;
        this.f23784d = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f23783c = jArr;
    }

    public nf(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f23781a = 14;
        this.f23785e = new ArrayDeque();
        this.f23782b = sharedPreferences;
        this.f23783c = "topic_operation_queue";
        this.f23784d = ",";
        this.f23786f = scheduledThreadPoolExecutor;
    }

    public nf(ll.a aVar, ll.e typeParameterResolver, wj.d dVar) {
        this.f23781a = 1;
        kotlin.jvm.internal.n.f(typeParameterResolver, "typeParameterResolver");
        this.f23782b = aVar;
        this.f23783c = typeParameterResolver;
        this.f23784d = dVar;
        this.f23785e = dVar;
        this.f23786f = new v9.e(this, typeParameterResolver);
    }

    public nf(int i10) {
        this.f23781a = i10;
        switch (i10) {
            case 16:
                this.f23782b = new LinkedHashMap();
                this.f23783c = new ArrayList();
                break;
            default:
                this.f23786f = new LinkedHashMap();
                this.f23783c = C0375hc.f28788a;
                this.f23784d = new h2.d(4, false);
                break;
        }
    }

    public nf(ye.d dVar, af.b bVar, SharedPreferences sharedPreferences, v6.c cVar, r1.s sVar) {
        this.f23781a = 11;
        this.f23786f = dVar;
        this.f23782b = bVar;
        this.f23783c = sharedPreferences;
        this.f23784d = cVar;
        this.f23785e = sVar;
    }

    public nf(fc.f fVar, fc.f fVar2, yl.f fVar3, ArrayList arrayList) {
        this.f23781a = 5;
        this.f23783c = fVar;
        this.f23784d = fVar2;
        this.f23785e = fVar3;
        this.f23786f = arrayList;
        this.f23782b = fVar;
    }

    public nf(ye.d dVar, Cipher cipher, HashMap map, SharedPreferences sharedPreferences, zc.u uVar) {
        this.f23781a = 12;
        this.f23785e = dVar;
        this.f23782b = cipher;
        this.f23786f = map;
        this.f23783c = sharedPreferences;
        this.f23784d = uVar;
    }
}
