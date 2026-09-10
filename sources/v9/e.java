package v9;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.Selection;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.w0;
import androidx.lifecycle.x;
import bc.i;
import com.applovin.shadow.okio.Segment;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.internal.ads.dm0;
import com.google.android.gms.internal.measurement.bb;
import com.google.android.gms.internal.measurement.cb;
import com.google.android.gms.internal.measurement.db;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.ld;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.internal.measurement.q6;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.za;
import com.google.android.gms.internal.play_billing.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.C0375hc;
import com.ironsource.X3;
import ea.e4;
import ea.f2;
import ea.m1;
import ea.t0;
import fl.a0;
import fl.d0;
import fl.p;
import fl.r;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.j;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import javax.net.ssl.HttpsURLConnection;
import k9.o;
import k9.q;
import kotlin.jvm.internal.n;
import m0.s1;
import mi.s;
import mi.y;
import mi.z;
import n6.t;
import n6.v;
import oj.b0;
import pj.h;
import pm.a1;
import pm.c0;
import pm.j0;
import pm.n0;
import pm.q0;
import pm.r0;
import pm.y0;
import qk.i0;
import qk.w;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements AppSetIdClient, l0.b, k, t0, t, oj.f, pj.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static e f52498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static e f52499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static e f52500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static e f52501h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f52503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f52504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f52505d;

    public /* synthetic */ e(int i10, boolean z10) {
        this.f52502a = i10;
    }

    public static String A(String str, HashMap map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append(X3.j.f27830b);
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append(X3.j.f27832c);
            sb2.append((String) entry2.getKey());
            sb2.append(X3.j.f27830b);
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return wi.d.i(str, "?", string);
        }
        if (!str.endsWith(X3.j.f27832c)) {
            string = X3.j.f27832c.concat(string);
        }
        return wi.d.h(str, string);
    }

    public static Bundle C(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public static e F() {
        if (f52501h == null) {
            ne.c cVar = new ne.c(1);
            li.a aVar = new li.a(0);
            aVar.f45336b = 0;
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(aVar);
            FlutterJNI flutterJNI = new FlutterJNI();
            ri.d dVar = new ri.d();
            dVar.f49600a = false;
            dVar.f49604e = flutterJNI;
            dVar.f49605f = executorServiceNewCachedThreadPool;
            e eVar = new e(21, false);
            eVar.f52503b = dVar;
            eVar.f52504c = cVar;
            eVar.f52505d = executorServiceNewCachedThreadPool;
            f52501h = eVar;
        }
        return f52501h;
    }

    public static final SharedPreferences O(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void P(Context context) throws d {
        if (O(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new d("Failed to store the app set ID last used time.");
    }

    public ec.a B() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        ac.g.b();
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strA = A((String) this.f52503b, (HashMap) this.f52504c);
            String str = "GET Request URL: " + strA;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(strA).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod(C0375hc.f28788a);
                for (Map.Entry entry : ((HashMap) this.f52505d).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[Segment.SIZE];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int i10 = bufferedReader.read(cArr);
                            if (i10 == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, i10);
                        }
                        string = sb2.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new ec.a(responseCode, string);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    public boolean D(KeyEvent keyEvent) {
        y[] yVarArr = (y[]) this.f52503b;
        if (((HashSet) this.f52504c).remove(keyEvent)) {
            return false;
        }
        if (yVarArr.length <= 0) {
            G(keyEvent);
            return true;
        }
        m mVar = new m();
        mVar.f11729a = this;
        mVar.f11731c = ((y[]) this.f52503b).length;
        mVar.f11730b = false;
        mVar.f11732d = keyEvent;
        for (y yVar : yVarArr) {
            yVar.c(keyEvent, new i(mVar));
        }
        return true;
    }

    public void E(String str, String str2) {
        ((HashMap) this.f52505d).put(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    public void G(KeyEvent keyEvent) {
        InputConnection inputConnection;
        int selectionStart;
        int selectionEnd;
        int unicodeChar;
        int iMin;
        int iMax;
        HashSet hashSet = (HashSet) this.f52504c;
        z zVar = (z) this.f52505d;
        if (zVar != null) {
            j jVar = ((s) zVar).f46061m;
            boolean zSendKeyEvent = false;
            if (jVar.f43296b.isAcceptingText() && (inputConnection = jVar.f43304j) != null) {
                if (inputConnection instanceof io.flutter.plugin.editing.c) {
                    io.flutter.plugin.editing.c cVar = (io.flutter.plugin.editing.c) inputConnection;
                    io.flutter.plugin.editing.f fVar = cVar.f43259d;
                    if (keyEvent.getAction() == 0) {
                        if (keyEvent.getKeyCode() == 21) {
                            zSendKeyEvent = cVar.d(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 22) {
                            zSendKeyEvent = cVar.d(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 19) {
                            zSendKeyEvent = cVar.e(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 20) {
                            zSendKeyEvent = cVar.e(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                            EditorInfo editorInfo = cVar.f43260e;
                            if ((editorInfo.inputType & 131072) == 0) {
                                cVar.performEditorAction(editorInfo.imeOptions & 255);
                            } else {
                                selectionStart = Selection.getSelectionStart(fVar);
                                selectionEnd = Selection.getSelectionEnd(fVar);
                                unicodeChar = keyEvent.getUnicodeChar();
                                if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                                    iMin = Math.min(selectionStart, selectionEnd);
                                    iMax = Math.max(selectionStart, selectionEnd);
                                    cVar.beginBatchEdit();
                                    if (iMin != iMax) {
                                        fVar.delete(iMin, iMax);
                                    }
                                    fVar.insert(iMin, (CharSequence) String.valueOf((char) unicodeChar));
                                    int i10 = iMin + 1;
                                    cVar.setSelection(i10, i10);
                                    cVar.endBatchEdit();
                                }
                            }
                            zSendKeyEvent = true;
                        } else {
                            selectionStart = Selection.getSelectionStart(fVar);
                            selectionEnd = Selection.getSelectionEnd(fVar);
                            unicodeChar = keyEvent.getUnicodeChar();
                            if (selectionStart >= 0) {
                                iMin = Math.min(selectionStart, selectionEnd);
                                iMax = Math.max(selectionStart, selectionEnd);
                                cVar.beginBatchEdit();
                                if (iMin != iMax) {
                                    fVar.delete(iMin, iMax);
                                }
                                fVar.insert(iMin, (CharSequence) String.valueOf((char) unicodeChar));
                                int i11 = iMin + 1;
                                cVar.setSelection(i11, i11);
                                cVar.endBatchEdit();
                                zSendKeyEvent = true;
                            }
                        }
                    }
                } else {
                    zSendKeyEvent = inputConnection.sendKeyEvent(keyEvent);
                }
            }
            if (zSendKeyEvent) {
                return;
            }
            hashSet.add(keyEvent);
            ((s) zVar).getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public boolean H(String str, boolean z10, h hVar, pj.a aVar) {
        Map map = hVar.f48392c;
        if (((Activity) this.f52505d) == null) {
            throw new pj.b();
        }
        Bundle bundleC = C(map);
        if (z10) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
                    lowerCase.getClass();
                    switch (lowerCase) {
                        case "accept":
                        case "content-language":
                        case "content-type":
                        case "accept-language":
                            break;
                    }
                } else {
                    Uri uri = Uri.parse(str);
                    Activity activity = (Activity) this.f52505d;
                    u.h hVar2 = new u.h();
                    hVar2.f51632a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", aVar.f48381a ? 1 : 0);
                    u.i iVarA = hVar2.a();
                    iVarA.f51639a.putExtra("com.android.browser.headers", bundleC);
                    try {
                        iVarA.a(activity, uri);
                        return true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }
        }
        Activity activity2 = (Activity) this.f52505d;
        boolean z11 = hVar.f48390a;
        boolean z12 = hVar.f48391b;
        int i10 = WebViewActivity.f43411e;
        try {
            ((Activity) this.f52505d).startActivity(new Intent(activity2, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", z11).putExtra("enableDomStorage", z12).putExtra("com.android.browser.headers", bundleC));
            return true;
        } catch (ActivityNotFoundException unused2) {
            return false;
        }
    }

    public void I(androidx.lifecycle.m mVar) {
        w0 w0Var = (w0) this.f52505d;
        if (w0Var != null) {
            w0Var.run();
        }
        w0 w0Var2 = new w0((x) this.f52503b, mVar);
        this.f52505d = w0Var2;
        ((Handler) this.f52504c).postAtFrontOfQueue(w0Var2);
    }

    public void J(j2.a aVar) {
        q1.j jVar = (q1.j) ((HashMap) this.f52503b).remove(aVar);
        jVar.getClass();
        p1.e eVar = (p1.e) ((p1.f) this.f52505d).f48024p.get(jVar);
        if (eVar != null) {
            synchronized (eVar) {
                eVar.f48000d--;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    public a1 K(fl.h arrayType, nl.a aVar, boolean z10) {
        wk.j jVarG;
        nf nfVar = (nf) this.f52503b;
        ll.a aVar2 = (ll.a) nfVar.f23782b;
        n.f(arrayType, "arrayType");
        boolean z11 = aVar.f46790d;
        a0 a0Var = arrayType.f40994b;
        fl.y yVar = a0Var instanceof fl.y ? (fl.y) a0Var : null;
        if (yVar != null) {
            Class cls = yVar.f41011a;
            if (n.a(cls, Void.TYPE)) {
                jVarG = null;
            } else {
                jVarG = gm.c.b(cls.getName()).g();
            }
        } else {
            jVarG = null;
        }
        ll.c cVar = new ll.c(nfVar, arrayType, true);
        if (jVarG == null) {
            pm.y yVarL = L(a0Var, android.support.v4.media.session.a.I(2, z11, null, 6));
            if (z11) {
                return aVar2.f45498o.d().g(z10 ? 3 : 1, yVarL, cVar);
            }
            return pm.f.j(aVar2.f45498o.d().g(1, yVarL, cVar), aVar2.f45498o.d().g(3, yVarL, cVar).i0(true));
        }
        c0 c0VarQ = aVar2.f45498o.d().q(jVarG);
        pm.y yVarG0 = i0.g0(c0VarQ, new al.k(new al.j[]{c0VarQ.getAnnotations(), cVar}));
        n.d(yVarG0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        c0 c0Var = (c0) yVarG0;
        return z11 ? c0Var : pm.f.j(c0Var, c0Var.i0(true));
    }

    public pm.y L(pl.d dVar, nl.a aVar) {
        ll.a aVar2 = (ll.a) ((nf) this.f52503b).f23782b;
        if (dVar instanceof fl.y) {
            Class cls = ((fl.y) dVar).f41011a;
            wk.j jVarG = n.a(cls, Void.TYPE) ? null : gm.c.b(cls.getName()).g();
            return jVarG != null ? aVar2.f45498o.d().s(jVarG) : aVar2.f45498o.d().w();
        }
        boolean z10 = false;
        if (!(dVar instanceof p)) {
            if (dVar instanceof fl.h) {
                return K((fl.h) dVar, aVar, false);
            }
            if (dVar instanceof d0) {
                a0 a0VarC = ((d0) dVar).c();
                return a0VarC != null ? L(a0VarC, aVar) : aVar2.f45498o.d().m();
            }
            if (dVar == null) {
                return aVar2.f45498o.d().m();
            }
            throw new UnsupportedOperationException("Unsupported type: " + dVar);
        }
        p pVar = (p) dVar;
        if (!aVar.f46790d && aVar.f46787a != 1) {
            z10 = true;
        }
        Type type = pVar.f41003a;
        boolean zD = pVar.d();
        rm.h hVar = rm.h.UNRESOLVED_JAVA_CLASS;
        if (!zD && !z10) {
            c0 c0VarY = y(pVar, aVar, null);
            return c0VarY != null ? c0VarY : rm.i.c(hVar, type.toString());
        }
        c0 c0VarY2 = y(pVar, aVar.b(3), null);
        if (c0VarY2 == null) {
            return rm.i.c(hVar, type.toString());
        }
        c0 c0VarY3 = y(pVar, aVar.b(2), c0VarY2);
        if (c0VarY3 == null) {
            return rm.i.c(hVar, type.toString());
        }
        return zD ? new nl.f(c0VarY2, c0VarY3) : pm.f.j(c0VarY2, c0VarY3);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0050 A[EDGE_INSN: B:57:0x0050->B:55:0x0050 BREAK  A[LOOP:1: B:25:0x0072->B:60:?], SYNTHETIC] */
    public void M(s0 s0Var, Set set, String str) {
        ld[] ldVarArr;
        if (!set.isEmpty() && !((AtomicBoolean) this.f52503b).getAndSet(true)) {
            if (q6.f23887c == null) {
                synchronized (q6.class) {
                    try {
                        if (q6.f23887c == null) {
                            q6.f23887c = new q6(0);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            ((CopyOnWriteArrayList) q6.f23887c.f23891b).add(0, new f1(14));
        }
        final byte[] bArrU = s0Var.u();
        ((ConcurrentHashMap) this.f52504c).compute(str, new BiFunction() { // from class: com.google.android.gms.internal.measurement.kd
            @Override // java.util.function.BiFunction
            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                byte[] bArr2 = bArrU;
                return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) ((ConcurrentHashMap) this.f52505d).putIfAbsent((String) it.next(), new AtomicReference(new ld(str, bArrU)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof ld) {
                        ld ldVar = (ld) obj;
                        if (str.equals(ldVar.f23706a)) {
                            ldVar.a(bArrU);
                            break;
                        }
                        ld ldVar2 = new ld(str, bArrU);
                        ldVarArr = str.compareTo(ldVar.f23706a) < 0 ? new ld[]{ldVar2, ldVar} : new ld[]{ldVar, ldVar2};
                        do {
                            if (atomicReference.compareAndSet(obj, ldVarArr)) {
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    } else {
                        ld[] ldVarArr2 = (ld[]) obj;
                        int iBinarySearch = Arrays.binarySearch(ldVarArr2, str);
                        if (iBinarySearch >= 0) {
                            ldVarArr2[iBinarySearch].a(bArrU);
                            break;
                        }
                        int i10 = ~iBinarySearch;
                        int length = ldVarArr2.length;
                        int i11 = length + 1;
                        int i12 = length - i10;
                        if (i12 == 0) {
                            ldVarArr = (ld[]) Arrays.copyOf(ldVarArr2, i11);
                        } else {
                            ld[] ldVarArr3 = new ld[i11];
                            System.arraycopy(ldVarArr2, 0, ldVarArr3, 0, i10);
                            System.arraycopy(ldVarArr2, i10, ldVarArr3, i10 + 1, i12);
                            ldVarArr = ldVarArr3;
                        }
                        ldVarArr[i10] = new ld(str, bArrU);
                        do {
                            if (atomicReference.compareAndSet(obj, ldVarArr)) {
                                break;
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    }
                }
            }
        }
    }

    public synchronized void N(int i10, int i11, long j10, long j11) {
        ((m1) this.f52503b).f39592k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f52505d;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((m9.d) this.f52504c).d(new o(0, Arrays.asList(new k9.k(36301, i10, 0, j10, j11, null, null, 0, i11)))).addOnFailureListener(new androidx.recyclerview.widget.c(this, jElapsedRealtime, 6));
    }

    @Override // oj.f
    public String a(String str, oj.g gVar) {
        SharedPreferences sharedPreferencesZ = z(gVar);
        if (sharedPreferencesZ.contains(str)) {
            return sharedPreferencesZ.getString(str, "");
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.k
    public void accept(Object obj, Object obj2) {
        cb cbVar = (cb) ((db) obj).getService();
        za zaVar = new za((bb) this.f52503b, (i9.i) this.f52505d);
        String str = (String) this.f52504c;
        Parcel parcelU1 = cbVar.u1();
        parcelU1.writeString(str);
        m6.c(parcelU1, zaVar);
        cbVar.w1(parcelU1, 28);
    }

    @Override // ea.t0
    public void b(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        ((e4) this.f52505d).w(true, i10, th2, bArr, (String) this.f52503b, (ArrayList) this.f52504c, map);
    }

    @Override // oj.f
    public void c(String str, String str2, oj.g gVar) {
        z(gVar).edit().putString(str, str2).apply();
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f52502a) {
            case 5:
                e eVar = new e(((com.google.android.gms.internal.measurement.b) this.f52503b).clone());
                Iterator it = ((ArrayList) this.f52505d).iterator();
                while (it.hasNext()) {
                    ((ArrayList) eVar.f52505d).add(((com.google.android.gms.internal.measurement.b) it.next()).clone());
                }
                return eVar;
            default:
                return super.clone();
        }
    }

    @Override // oj.f
    public void d(String str, String str2, oj.g gVar) {
        z(gVar).edit().putString(str, str2).apply();
    }

    @Override // l0.b
    public boolean e(Object obj) {
        if (obj instanceof b7.b) {
            ((b7.b) obj).a().f5503a = true;
        }
        ((b7.c) this.f52504c).a(obj);
        return ((l0.c) this.f52505d).e(obj);
    }

    @Override // oj.f
    public void f(String str, List list, oj.g gVar) {
        z(gVar).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((ne.c) this.f52505d).a(list))).apply();
    }

    @Override // l0.b
    public Object g() {
        Object objG = ((l0.c) this.f52505d).g();
        if (objG == null) {
            objG = ((b7.a) this.f52503b).e();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objG.getClass());
            }
        }
        if (objG instanceof b7.b) {
            ((b7.b) objG).a().f5503a = false;
        }
        return objG;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public Task getAppSetIdInfo() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((ExecutorService) this.f52505d).execute(new n5.i(5, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // n6.t
    public Bitmap h(BitmapFactory.Options options) {
        v vVar = (v) ((com.bumptech.glide.load.data.i) this.f52503b).f10527b;
        vVar.reset();
        return BitmapFactory.decodeStream(vVar, null, options);
    }

    @Override // oj.f
    public Long i(String str, oj.g gVar) {
        long j10;
        SharedPreferences sharedPreferencesZ = z(gVar);
        if (!sharedPreferencesZ.contains(str)) {
            return null;
        }
        try {
            j10 = sharedPreferencesZ.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j10 = sharedPreferencesZ.getInt(str, 0);
        }
        return Long.valueOf(j10);
    }

    @Override // n6.t
    public void j() {
        v vVar = (v) ((com.bumptech.glide.load.data.i) this.f52503b).f10527b;
        synchronized (vVar) {
            vVar.f46614c = vVar.f46612a.length;
        }
    }

    @Override // oj.f
    public Double k(String str, oj.g gVar) {
        SharedPreferences sharedPreferencesZ = z(gVar);
        if (!sharedPreferencesZ.contains(str)) {
            return null;
        }
        Object objC = oj.a0.c(sharedPreferencesZ.getString(str, ""), (ne.c) this.f52505d);
        n.d(objC, "null cannot be cast to non-null type kotlin.Double");
        return (Double) objC;
    }

    @Override // oj.f
    public void l(String str, double d10, oj.g gVar) {
        z(gVar).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d10).apply();
    }

    @Override // oj.f
    public oj.d0 m(String str, oj.g gVar) {
        SharedPreferences sharedPreferencesZ = z(gVar);
        if (!sharedPreferencesZ.contains(str)) {
            return null;
        }
        String string = sharedPreferencesZ.getString(str, "");
        n.c(string);
        if (an.p.p0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false)) {
            return new oj.d0(string, b0.JSON_ENCODED);
        }
        return an.p.p0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) ? new oj.d0(null, b0.PLATFORM_ENCODED) : new oj.d0(null, b0.UNEXPECTED_STRING);
    }

    @Override // oj.f
    public Boolean n(String str, oj.g gVar) {
        SharedPreferences sharedPreferencesZ = z(gVar);
        if (sharedPreferencesZ.contains(str)) {
            return Boolean.valueOf(sharedPreferencesZ.getBoolean(str, true));
        }
        return null;
    }

    @Override // n6.t
    public int o() {
        List list = (List) this.f52505d;
        v vVar = (v) ((com.bumptech.glide.load.data.i) this.f52503b).f10527b;
        vVar.reset();
        return com.google.android.gms.internal.auth.o.l(list, vVar, (dm0) this.f52504c);
    }

    @Override // oj.f
    public void p(String str, boolean z10, oj.g gVar) {
        z(gVar).edit().putBoolean(str, z10).apply();
    }

    @Override // oj.f
    public Map q(List list, oj.g gVar) {
        Object value;
        Map<String, ?> all = z(gVar).getAll();
        n.e(all, "getAll(...)");
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (oj.a0.b(entry.getKey(), entry.getValue(), list != null ? xj.n.R0(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object objC = oj.a0.c(value, (ne.c) this.f52505d);
                n.d(objC, "null cannot be cast to non-null type kotlin.Any");
                map.put(key, objC);
            }
        }
        return map;
    }

    @Override // oj.f
    public ArrayList r(String str, oj.g gVar) {
        List list;
        SharedPreferences sharedPreferencesZ = z(gVar);
        if (!sharedPreferencesZ.contains(str)) {
            return null;
        }
        String string = sharedPreferencesZ.getString(str, "");
        n.c(string);
        if (!an.p.p0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) || an.p.p0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) || (list = (List) oj.a0.c(sharedPreferencesZ.getString(str, ""), (ne.c) this.f52505d)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // oj.f
    public void s(String str, long j10, oj.g gVar) {
        z(gVar).edit().putLong(str, j10).apply();
    }

    @Override // oj.f
    public void t(List list, oj.g gVar) {
        SharedPreferences sharedPreferencesZ = z(gVar);
        SharedPreferences.Editor editorEdit = sharedPreferencesZ.edit();
        n.e(editorEdit, "edit(...)");
        Map<String, ?> all = sharedPreferencesZ.getAll();
        n.e(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (oj.a0.b(str, all.get(str), list != null ? xj.n.R0(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        n.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            n.e(next, "next(...)");
            editorEdit.remove((String) next);
        }
        editorEdit.apply();
    }

    public String toString() {
        switch (this.f52502a) {
            case 8:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f52503b);
                sb2.append('{');
                l lVar = ((l) this.f52504c).f24396b;
                String str = "";
                while (lVar != null) {
                    Object obj = lVar.f24395a;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    lVar = lVar.f24396b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 24:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f52503b);
                sb3.append('{');
                s1 s1Var = (s1) ((s1) this.f52504c).f45752c;
                String str2 = "";
                while (s1Var != null) {
                    f2 f2Var = (f2) s1Var.f45751b;
                    sb3.append(str2);
                    if (f2Var == null || !f2.class.isArray()) {
                        sb3.append(f2Var);
                    } else {
                        String strDeepToString2 = Arrays.deepToString(new Object[]{f2Var});
                        sb3.append((CharSequence) strDeepToString2, 1, strDeepToString2.length() - 1);
                    }
                    s1Var = (s1) s1Var.f45752c;
                    str2 = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    @Override // oj.f
    public List u(List list, oj.g gVar) {
        Map<String, ?> all = z(gVar).getAll();
        n.e(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            n.e(key, "<get-key>(...)");
            if (oj.a0.b(key, entry.getValue(), list != null ? xj.n.R0(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return xj.n.N0(linkedHashMap.keySet());
    }

    @Override // n6.t
    public ImageHeaderParser$ImageType v() {
        List list = (List) this.f52505d;
        v vVar = (v) ((com.bumptech.glide.load.data.i) this.f52503b).f10527b;
        vVar.reset();
        return com.google.android.gms.internal.auth.o.o(list, vVar, (dm0) this.f52504c);
    }

    public fb.a w() throws GeneralSecurityException {
        s4.i iVar;
        lb.a aVarA;
        fb.d dVar = (fb.d) this.f52503b;
        if (dVar == null || (iVar = (s4.i) this.f52504c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (dVar.f40731a != ((lb.a) iVar.f50111a).f45273a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (dVar.a() && ((Integer) this.f52505d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((fb.d) this.f52503b).a() && ((Integer) this.f52505d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        fb.c cVar = ((fb.d) this.f52503b).f40733c;
        if (cVar == fb.c.f40729e) {
            aVarA = eb.p.f40006a;
        } else if (cVar == fb.c.f40728d || cVar == fb.c.f40727c) {
            aVarA = eb.p.a(((Integer) this.f52505d).intValue());
        } else {
            if (cVar != fb.c.f40726b) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((fb.d) this.f52503b).f40733c);
            }
            aVarA = eb.p.b(((Integer) this.f52505d).intValue());
        }
        return new fb.a((fb.d) this.f52503b, (s4.i) this.f52504c, aVarA, (Integer) this.f52505d);
    }

    public fb.f x() throws GeneralSecurityException {
        s4.i iVar;
        lb.a aVarA;
        fb.j jVar = (fb.j) this.f52503b;
        if (jVar == null || (iVar = (s4.i) this.f52504c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (jVar.f40759a != ((lb.a) iVar.f50111a).f45273a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (jVar.a() && ((Integer) this.f52505d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((fb.j) this.f52503b).a() && ((Integer) this.f52505d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        fb.i iVar2 = ((fb.j) this.f52503b).f40761c;
        if (iVar2 == fb.i.f40757e) {
            aVarA = eb.p.f40006a;
        } else if (iVar2 == fb.i.f40756d || iVar2 == fb.i.f40755c) {
            aVarA = eb.p.a(((Integer) this.f52505d).intValue());
        } else {
            if (iVar2 != fb.i.f40754b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((fb.j) this.f52503b).f40761c);
            }
            aVarA = eb.p.b(((Integer) this.f52505d).intValue());
        }
        return new fb.f((fb.j) this.f52503b, (s4.i) this.f52504c, aVarA, (Integer) this.f52505d);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0145  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Object, wj.d] */
    /* JADX WARN: Type inference failed for: r4v6, types: [pm.n0] */
    public c0 y(p pVar, nl.a aVar, c0 c0Var) {
        j0 j0VarX;
        boolean z10;
        j0 j0Var;
        c0 c0Var2;
        n0 n0VarN;
        boolean z11;
        n0 n0Var;
        Iterator it;
        int i10;
        Object r0Var;
        Object next;
        List listN0;
        e eVar;
        n0 n0Var2;
        p pVar2;
        q0 q0VarF;
        zk.e eVarB;
        int iV;
        e eVar2 = this;
        p pVar3 = pVar;
        nl.a aVar2 = aVar;
        int i11 = aVar2.f46787a;
        int i12 = aVar2.f46788b;
        boolean z12 = aVar2.f46790d;
        nf nfVar = (nf) eVar2.f52503b;
        ll.a aVar3 = (ll.a) nfVar.f23782b;
        if (c0Var == null || (j0VarX = c0Var.M()) == null) {
            j0VarX = pm.c.x(new ll.c(nfVar, pVar3, false));
        }
        r rVar = pVar3.f41004b;
        if (rVar == null) {
            pVar3.getClass();
            throw new UnsupportedOperationException("Type not found: " + pVar3.f41003a);
        }
        int i13 = 0;
        if (rVar instanceof fl.n) {
            fl.n nVar = (fl.n) rVar;
            yl.c cVarC = nVar.c();
            c0Var2 = null;
            if (z12 && cVarC.equals(nl.c.f46798a)) {
                wk.k kVar = aVar3.f45499p;
                v1.j jVar = kVar.f53334c;
                z10 = z12;
                w property = wk.k.f53331e[0];
                jVar.getClass();
                n.f(property, "property");
                yl.f fVarE = yl.f.e(android.support.v4.media.session.a.c(property.getName()));
                j0Var = j0VarX;
                zk.g gVarC = ((im.n) kVar.f53333b.getValue()).c(fVarE, hl.b.f42406b);
                zk.e eVar3 = gVarC instanceof zk.e ? (zk.e) gVarC : null;
                eVarB = eVar3 == null ? kVar.f53332a.r(new yl.b(wk.m.f53370h, fVarE), j1.f.C(1)) : eVar3;
            } else {
                z10 = z12;
                j0Var = j0VarX;
                eVarB = yk.e.b(cVarC, aVar3.f45498o.d());
                if (eVarB == null) {
                    eVarB = null;
                } else {
                    String str = yk.d.f54447a;
                    yl.e eVarG = bm.e.g(eVarB);
                    HashMap map = yk.d.f54457k;
                    if (map.containsKey(eVarG)) {
                        if (i12 == 3 || i11 == 1) {
                            eVarB = yk.e.a(eVarB);
                        } else {
                            pl.d dVar = (pl.d) xj.n.x0(pVar3.c());
                            d0 d0Var = dVar instanceof d0 ? (d0) dVar : null;
                            if (d0Var != null && d0Var.c() != null) {
                                Type[] upperBounds = d0Var.f40989a.getUpperBounds();
                                n.e(upperBounds, "reflectType.upperBounds");
                                if (n.a(xj.k.p0(upperBounds), Object.class)) {
                                    yl.e eVarG2 = bm.e.g(eVarB);
                                    String str2 = yk.d.f54447a;
                                    yl.c cVar = (yl.c) map.get(eVarG2);
                                    if (cVar == null) {
                                        throw new IllegalArgumentException("Given class " + eVarB + " is not a read-only collection");
                                    }
                                    List parameters = fm.e.e(eVarB).i(cVar).n().getParameters();
                                    n.e(parameters, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
                                    m0 m0Var = (m0) xj.n.x0(parameters);
                                    if (m0Var != null && (iV = m0Var.v()) != 0 && iV != 3) {
                                        eVarB = yk.e.a(eVarB);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (eVarB == null) {
                am.e eVar4 = aVar3.f45495k;
                eVar4.getClass();
                am.e eVar5 = (am.e) eVar4.f3698b;
                if (eVar5 == null) {
                    n.l("resolver");
                    throw null;
                }
                eVarB = eVar5.B(nVar);
            }
            if (eVarB == null || (n0VarN = eVarB.n()) == null) {
                pVar3.getClass();
                throw new UnsupportedOperationException("Type not found: " + pVar3.f41003a);
            }
        } else {
            z10 = z12;
            j0Var = j0VarX;
            c0Var2 = null;
            if (!(rVar instanceof fl.b0)) {
                throw new IllegalStateException("Unknown classifier kind: " + rVar);
            }
            m0 m0VarC = ((ll.e) eVar2.f52504c).c((fl.b0) rVar);
            n0VarN = m0VarC != null ? m0VarC.n() : null;
        }
        if (n0VarN == null) {
            return c0Var2;
        }
        boolean z13 = (i12 == 3 || z10 || i11 == 1) ? false : true;
        if (n.a(c0Var != null ? c0Var.P() : c0Var2, n0VarN) && !pVar3.d() && z13) {
            return c0Var.i0(true);
        }
        if (!pVar3.d()) {
            if (pVar3.c().isEmpty()) {
                List parameters2 = n0VarN.getParameters();
                n.e(parameters2, "constructor.parameters");
                z11 = parameters2.isEmpty() ? false : true;
            }
        }
        List parameters3 = n0VarN.getParameters();
        n.e(parameters3, "constructor.parameters");
        if (z11) {
            List<m0> list = parameters3;
            ArrayList arrayList = new ArrayList(xj.p.W(list, 10));
            for (m0 m0Var2 : list) {
                if (i0.Q(m0Var2, c0Var2, aVar2.f46791e)) {
                    q0VarF = y0.k(m0Var2, aVar2);
                    pVar2 = pVar3;
                    n0Var2 = n0VarN;
                    eVar = eVar2;
                } else {
                    n0 n0Var3 = n0VarN;
                    eVar = eVar2;
                    n0Var2 = n0Var3;
                    pVar2 = pVar3;
                    q0VarF = ne.a.f(m0Var2, nl.a.a(aVar, 0, pVar2.d(), null, null, 59), (m5.k) eVar.f52505d, new pm.a0(aVar3.f45485a, new nl.b(eVar2, m0Var2, aVar, n0Var3, pVar3)));
                }
                arrayList.add(q0VarF);
                aVar2 = aVar;
                eVar2 = eVar;
                pVar3 = pVar2;
                n0VarN = n0Var2;
                c0Var2 = null;
            }
            n0Var = n0VarN;
            listN0 = arrayList;
        } else {
            n0Var = n0VarN;
            if (parameters3.size() != pVar3.c().size()) {
                List list2 = parameters3;
                ArrayList arrayList2 = new ArrayList(xj.p.W(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    String strB = ((m0) it2.next()).getName().b();
                    n.e(strB, "p.name.asString()");
                    arrayList2.add(new r0(1, rm.i.c(rm.h.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, strB)));
                }
                listN0 = xj.n.N0(arrayList2);
            } else {
                xj.m mVarT0 = xj.n.T0(pVar3.c());
                ArrayList arrayList3 = new ArrayList(xj.p.W(mVarT0, 10));
                Iterator it3 = mVarT0.iterator();
                while (true) {
                    xj.z zVar = (xj.z) it3;
                    if (zVar.f53872b.hasNext()) {
                        xj.y yVar = (xj.y) zVar.next();
                        int i14 = yVar.f53869a;
                        pl.d dVar2 = (pl.d) yVar.f53870b;
                        parameters3.size();
                        m0 parameter = (m0) parameters3.get(i14);
                        nl.a aVarI = android.support.v4.media.session.a.I(2, i13, null, 7);
                        n.e(parameter, "parameter");
                        if (dVar2 instanceof d0) {
                            d0 d0Var2 = (d0) dVar2;
                            a0 a0VarC = d0Var2.c();
                            Type[] upperBounds2 = d0Var2.f40989a.getUpperBounds();
                            n.e(upperBounds2, "reflectType.upperBounds");
                            int i15 = !n.a(xj.k.p0(upperBounds2), Object.class) ? 3 : 2;
                            if (a0VarC == null || !(parameter.v() == 1 || i15 == parameter.v())) {
                                it = it3;
                                i10 = 0;
                                r0Var = y0.k(parameter, aVarI);
                            } else {
                                if (d0Var2.c() == null) {
                                    throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
                                }
                                Iterator it4 = new ll.c(nfVar, d0Var2, false).iterator();
                                while (true) {
                                    zm.e eVar6 = (zm.e) it4;
                                    if (!eVar6.hasNext()) {
                                        it = it3;
                                        next = null;
                                        break;
                                    }
                                    next = eVar6.next();
                                    al.c cVar2 = (al.c) next;
                                    yl.c[] cVarArr = il.r.f43102b;
                                    it = it3;
                                    int length = cVarArr.length;
                                    Iterator it5 = it4;
                                    int i16 = 0;
                                    while (i16 < length) {
                                        int i17 = length;
                                        int i18 = i16;
                                        if (n.a(cVar2.e(), cVarArr[i16])) {
                                            break;
                                        }
                                        i16 = i18 + 1;
                                        length = i17;
                                    }
                                    it3 = it;
                                    it4 = it5;
                                }
                                al.c cVar3 = (al.c) next;
                                i10 = 0;
                                pm.y yVarL = eVar2.L(a0VarC, android.support.v4.media.session.a.I(2, false, null, 7));
                                if (cVar3 != null) {
                                    ArrayList arrayListA0 = xj.n.A0(yVarL.getAnnotations(), cVar3);
                                    yVarL = i0.g0(yVarL, arrayListA0.isEmpty() ? al.i.f3645a : new al.k(arrayListA0, i10));
                                }
                                r0Var = i0.u(yVarL, i15, parameter);
                            }
                        } else {
                            it = it3;
                            i10 = 0;
                            r0Var = new r0(1, eVar2.L(dVar2, aVarI));
                        }
                        arrayList3.add(r0Var);
                        it3 = it;
                        i13 = i10;
                    } else {
                        listN0 = xj.n.N0(arrayList3);
                    }
                }
            }
        }
        return pm.f.r(listN0, j0Var, n0Var, z13);
    }

    public SharedPreferences z(oj.g gVar) {
        Context context = (Context) this.f52503b;
        String str = gVar.f47484a;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            n.c(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        n.c(sharedPreferences2);
        return sharedPreferences2;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10) {
        this.f52502a = i10;
        this.f52505d = obj;
        this.f52503b = obj2;
        this.f52504c = obj3;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f52502a = i10;
        this.f52503b = obj;
        this.f52504c = obj2;
        this.f52505d = obj3;
    }

    public e(int i10) {
        this.f52502a = i10;
        switch (i10) {
            case 7:
                this.f52503b = new AtomicBoolean(false);
                new ConcurrentHashMap();
                this.f52504c = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.f52505d = new ConcurrentHashMap();
                break;
            case 8:
            default:
                this.f52503b = new com.google.android.gms.internal.measurement.b("", 0L, null);
                this.f52504c = new com.google.android.gms.internal.measurement.b("", 0L, null);
                this.f52505d = new ArrayList();
                break;
            case 9:
                List list = Collections.EMPTY_LIST;
                this.f52503b = list;
                this.f52504c = list;
                break;
        }
    }

    public e(Context context, int i10) {
        this.f52502a = i10;
        switch (i10) {
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                k3.j jVar = new k3.j(context, 19);
                this.f52503b = context;
                this.f52504c = jVar;
                break;
            default:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.f52504c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                this.f52505d = Executors.newSingleThreadExecutor();
                this.f52503b = context;
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new q5.a(this, 4), 0L, 86400L, TimeUnit.SECONDS);
                break;
        }
    }

    public e(Context context, m1 m1Var) {
        this.f52502a = 10;
        this.f52505d = new AtomicLong(-1L);
        this.f52504c = new m9.d(context, null, m9.d.f45913m, new q("measurement:api"), j9.h.f43737c);
        this.f52503b = m1Var;
    }

    public e(String str, int i10) {
        this.f52502a = i10;
        switch (i10) {
            case 24:
                s1 s1Var = new s1(9, false);
                this.f52504c = s1Var;
                this.f52505d = s1Var;
                this.f52503b = str;
                break;
            default:
                l lVar = new l();
                this.f52504c = lVar;
                this.f52505d = lVar;
                this.f52503b = str;
                break;
        }
    }

    public e(com.google.android.gms.internal.measurement.b bVar) {
        this.f52502a = 5;
        this.f52503b = bVar;
        this.f52504c = bVar.clone();
        this.f52505d = new ArrayList();
    }

    public e(rl.d dVar, el.c cVar) {
        this.f52502a = 13;
        this.f52503b = dVar;
        this.f52504c = cVar;
        this.f52505d = new ConcurrentHashMap();
    }

    public e(androidx.lifecycle.y yVar) {
        this.f52502a = 1;
        this.f52503b = new x(yVar);
        this.f52504c = new Handler();
    }

    public e(String str, HashMap map) {
        this.f52502a = 12;
        this.f52503b = str;
        this.f52504c = map;
        this.f52505d = new HashMap();
    }

    public e(nf nfVar, ll.e typeParameterResolver) {
        this.f52502a = 25;
        n.f(typeParameterResolver, "typeParameterResolver");
        this.f52503b = nfVar;
        this.f52504c = typeParameterResolver;
        this.f52505d = new m5.k(new ne.a(2));
    }

    public e(Context context, LocationManager locationManager) {
        this.f52502a = 19;
        this.f52505d = new k.c0();
        this.f52503b = context;
        this.f52504c = locationManager;
    }

    public e(z zVar) {
        this.f52502a = 22;
        this.f52504c = new HashSet();
        this.f52505d = zVar;
        s sVar = (s) zVar;
        this.f52503b = new y[]{new mi.x(sVar.getBinaryMessenger()), new m5.k(new qj.x(sVar.getBinaryMessenger()))};
        new rb.c(sVar.getBinaryMessenger()).f49529b = this;
    }

    public e(a7.m mVar, ArrayList arrayList, dm0 dm0Var) {
        this.f52502a = 23;
        a7.h.c(dm0Var, "Argument must not be null");
        this.f52504c = dm0Var;
        a7.h.c(arrayList, "Argument must not be null");
        this.f52505d = arrayList;
        this.f52503b = new com.bumptech.glide.load.data.i(mVar, dm0Var);
    }

    public e(xi.f messenger, Context context, ne.c cVar) {
        this.f52502a = 26;
        n.f(messenger, "messenger");
        n.f(context, "context");
        this.f52504c = messenger;
        this.f52503b = context;
        this.f52505d = cVar;
        try {
            oj.f.f47483v9.getClass();
            oj.e.b(messenger, this, "shared_preferences");
        } catch (Exception e10) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e10);
        }
    }

    public e(io.flutter.plugins.firebase.messaging.a aVar) {
        this.f52502a = 18;
        this.f52504c = aVar;
        this.f52505d = Executors.newSingleThreadExecutor();
        this.f52503b = new Handler(Looper.getMainLooper());
    }

    public e(g6.m mVar, w6.g gVar, g6.q qVar) {
        this.f52502a = 17;
        this.f52505d = mVar;
        this.f52504c = gVar;
        this.f52503b = qVar;
    }

    public e(p1.f fVar, q1.j jVar) {
        this.f52502a = 27;
        this.f52505d = fVar;
        this.f52503b = new HashMap();
        this.f52504c = jVar;
    }
}
