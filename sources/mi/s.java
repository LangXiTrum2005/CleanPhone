package mi;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.provider.Settings;
import android.text.Selection;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cn.e1;
import cn.f1;
import cn.n0;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.n3;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends FrameLayout implements zi.b, z {
    public int A;
    public int B;
    public t C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f46050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f46052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f46053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f46054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f46055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f46056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashSet f46057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f46058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ni.c f46059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f46060k;
    public wi.b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public io.flutter.plugin.editing.j f46061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public io.flutter.plugin.editing.h f46062n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public yi.a f46063o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v9.e f46064p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f46065q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public io.flutter.view.g f46066r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextServicesManager f46067s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public am.e f46068t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.g f46069u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s4.i f46070v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.google.android.gms.internal.auth.k f46071w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final q f46072x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f46073y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.applovin.impl.sdk.ad.d f46074z;

    public s(Context context, n nVar) {
        super(context, null);
        this.f46050a = new AtomicBoolean(true);
        this.f46051b = false;
        this.f46057h = new HashSet();
        this.f46060k = new HashSet();
        this.f46069u = new io.flutter.embedding.engine.renderer.g();
        this.f46070v = new s4.i(this);
        this.f46071w = new com.google.android.gms.internal.auth.k(this, new Handler(Looper.getMainLooper()), 2);
        this.f46072x = new q(this);
        this.f46073y = new io.flutter.embedding.engine.renderer.a(this, 2);
        this.C = new t();
        this.f46052c = nVar;
        this.f46055f = nVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void a() {
        Objects.toString(this.f46059j);
        if (c()) {
            Iterator it = this.f46060k.iterator();
            if (it.hasNext()) {
                throw f2.j(it);
            }
            getContext().getContentResolver().unregisterContentObserver(this.f46071w);
            io.flutter.plugin.platform.n nVar = this.f46059j.f46754s;
            SparseArray sparseArray = nVar.l;
            SparseArray sparseArray2 = nVar.f43363m;
            SparseArray sparseArray3 = nVar.f43365o;
            for (int i10 = 0; i10 < sparseArray3.size(); i10++) {
                nVar.f43355d.removeView((io.flutter.plugin.platform.g) sparseArray3.valueAt(i10));
            }
            for (int i11 = 0; i11 < sparseArray2.size(); i11++) {
                nVar.f43355d.removeView((si.a) sparseArray2.valueAt(i11));
            }
            nVar.c();
            SparseArray sparseArray4 = nVar.f43364n;
            if (nVar.f43355d == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                for (int i12 = 0; i12 < sparseArray4.size(); i12++) {
                    nVar.f43355d.removeView((View) sparseArray4.valueAt(i12));
                }
                sparseArray4.clear();
            }
            nVar.f43355d = null;
            nVar.f43367q = false;
            for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                ((io.flutter.plugin.platform.d) sparseArray.valueAt(i13)).onFlutterViewDetached();
            }
            io.flutter.plugin.platform.m mVar = this.f46059j.f46755t;
            SparseArray sparseArray5 = mVar.f43344i;
            SparseArray sparseArray6 = mVar.f43345j;
            for (int i14 = 0; i14 < sparseArray6.size(); i14++) {
                mVar.f43339d.removeView((si.a) sparseArray6.valueAt(i14));
            }
            Surface surface = mVar.f43348n;
            if (surface != null) {
                surface.release();
                mVar.f43348n = null;
                mVar.f43349o = null;
            }
            mVar.f43339d = null;
            for (int i15 = 0; i15 < sparseArray5.size(); i15++) {
                ((io.flutter.plugin.platform.d) sparseArray5.valueAt(i15)).onFlutterViewDetached();
            }
            this.f46059j.f46754s.E0();
            this.f46059j.f46755t.E0();
            io.flutter.view.g gVar = this.f46066r;
            gVar.f43498u = true;
            gVar.f43483e.E0();
            gVar.f43496s = null;
            AccessibilityManager accessibilityManager = gVar.f43481c;
            accessibilityManager.removeAccessibilityStateChangeListener(gVar.f43499v);
            accessibilityManager.removeTouchExplorationStateChangeListener(gVar.f43500w);
            gVar.f43484f.unregisterContentObserver(gVar.f43501x);
            qd.i iVar = gVar.f43480b;
            iVar.f48982d = null;
            ((FlutterJNI) iVar.f48981c).setAccessibilityDelegate(null);
            this.f46066r = null;
            this.f46061m.f43296b.restartInput(this);
            this.f46061m.c();
            int size = ((HashSet) this.f46064p.f52504c).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.h hVar = this.f46062n;
            if (hVar != null) {
                hVar.f43283a.f49096b = null;
                SpellCheckerSession spellCheckerSession = hVar.f43285c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            wi.b bVar = this.l;
            if (bVar != null) {
                ((qj.x) bVar.f53212b).f49096b = null;
            }
            io.flutter.embedding.engine.renderer.h hVar2 = this.f46059j.f46738b;
            this.f46058i = false;
            hVar2.f43247a.removeIsDisplayingFlutterUiListener(this.f46073y);
            FlutterJNI flutterJNI = hVar2.f43247a;
            if (this.f46051b) {
                flutterJNI.removeResizingFlutterUiListener(this.f46072x);
            }
            hVar2.d();
            flutterJNI.setSemanticsEnabled(false);
            View view = this.f46056g;
            if (view != null && this.f46055f == this.f46054e) {
                this.f46055f = view;
            }
            this.f46055f.b();
            l lVar = this.f46054e;
            if (lVar != null) {
                lVar.f46027a.close();
                removeView(this.f46054e);
                this.f46054e = null;
            }
            this.f46056g = null;
            this.f46059j = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        k5.g gVar;
        k5.g gVar2;
        io.flutter.plugin.editing.j jVar = this.f46061m;
        wi.m mVar = jVar.f43300f;
        if (mVar == null || jVar.f43301g == null || (gVar = mVar.f53263j) == null) {
            return;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            wi.m mVar2 = (wi.m) jVar.f43301g.get(sparseArray.keyAt(i10));
            if (mVar2 != null && (gVar2 = mVar2.f53263j) != null) {
                String str = (String) gVar2.f44325a;
                String string = ((AutofillValue) sparseArray.valueAt(i10)).getTextValue().toString();
                wi.o oVar = new wi.o(string, string.length(), string.length(), -1, -1);
                if (str.equals((String) gVar.f44325a)) {
                    jVar.f43302h.f(oVar);
                } else {
                    map.put(str, oVar);
                }
            }
        }
        wi.b bVar = jVar.f43298d;
        int i11 = jVar.f43299e.f17625b;
        bVar.getClass();
        map.size();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            wi.o oVar2 = (wi.o) entry.getValue();
            map2.put((String) entry.getKey(), wi.b.b(oVar2.f53269a, oVar2.f53270b, oVar2.f53271c, -1, -1));
        }
        ((xi.p) bVar.f53211a).a("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i11), map2), null);
    }

    public final void b() {
        n nVar = this.f46052c;
        if (nVar != null) {
            addView(nVar);
        } else {
            p pVar = this.f46053d;
            if (pVar != null) {
                addView(pVar);
            } else {
                addView(this.f46054e);
            }
        }
        this.f46051b = r9.b.p(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAutofill(1);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final boolean c() {
        ni.c cVar = this.f46059j;
        return cVar != null && cVar.f46738b == this.f46055f.getAttachedRenderer();
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        ni.c cVar = this.f46059j;
        if (cVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        HashMap map = cVar.f46754s.f43362k;
        if (view == null || !map.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) map.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    public final void d() {
        boolean z10;
        String str;
        boolean z11;
        char c4 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f46067s;
        if (textServicesManager == null) {
            z10 = false;
        } else {
            if (Build.VERSION.SDK_INT >= 31) {
                Iterator<SpellCheckerInfo> it = textServicesManager.getEnabledSpellCheckerInfos().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z11 = false;
                        break;
                    } else if (it.next().getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z11 = true;
                        break;
                    }
                }
                if (!this.f46067s.isSpellCheckerEnabled() || !z11) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        wi.l lVar = this.f46059j.f46750o;
        lVar.getClass();
        k5.g gVar = lVar.f53253b;
        HashMap map = new HashMap();
        map.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        map.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z10));
        map.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1));
        map.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        if (c4 == 1) {
            str = "light";
        } else {
            if (c4 != 2) {
                throw null;
            }
            str = "dark";
        }
        map.put("platformBrightness", str);
        Objects.toString(map.get("textScaleFactor"));
        Objects.toString(map.get("alwaysUse24HourFormat"));
        Objects.toString(map.get("platformBrightness"));
        if (Build.VERSION.SDK_INT < 34 || displayMetrics == null) {
            gVar.y(map, null);
            return;
        }
        wi.k kVar = new wi.k(displayMetrics);
        r1.s sVar = lVar.f53252a;
        ((ConcurrentLinkedQueue) sVar.f49338b).add(kVar);
        wi.k kVar2 = (wi.k) sVar.f49340d;
        sVar.f49340d = kVar;
        v6.c cVar = kVar2 != null ? new v6.c(false, sVar, kVar2) : null;
        map.put("configurationId", Integer.valueOf(kVar.f53250a));
        gVar.y(map, cVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f46064p.D(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f10 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.g gVar = this.f46069u;
        gVar.f43226a = f10;
        gVar.f43244t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.h hVar = this.f46059j.f46738b;
        hVar.getClass();
        int i10 = gVar.f43227b;
        ArrayList arrayList = gVar.f43246v;
        ArrayList arrayList2 = gVar.f43245u;
        if (i10 == 0) {
            int i11 = gVar.f43229d;
            int i12 = gVar.f43230e;
            if (i11 <= 0 && i12 <= 0) {
                return;
            }
        } else {
            int i13 = gVar.f43228c;
            if (i13 == 0) {
                int i14 = gVar.f43231f;
                int i15 = gVar.f43232g;
                if (i14 <= 0 && i15 <= 0) {
                    return;
                }
            } else if (i10 <= 0 || i13 <= 0 || gVar.f43226a <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
        }
        arrayList2.size();
        arrayList.size();
        int size = arrayList.size() + arrayList2.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            io.flutter.embedding.engine.renderer.b bVar = (io.flutter.embedding.engine.renderer.b) arrayList2.get(i16);
            int i17 = i16 * 4;
            Rect rect = bVar.f43215a;
            iArr[i17] = rect.left;
            iArr[i17 + 1] = rect.top;
            iArr[i17 + 2] = rect.right;
            iArr[i17 + 3] = rect.bottom;
            iArr2[i16] = v0.i.c(bVar.f43216b);
            iArr3[i16] = v0.i.c(bVar.f43217c);
        }
        int size2 = arrayList2.size() * 4;
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            io.flutter.embedding.engine.renderer.b bVar2 = (io.flutter.embedding.engine.renderer.b) arrayList.get(i18);
            int i19 = (i18 * 4) + size2;
            Rect rect2 = bVar2.f43215a;
            iArr[i19] = rect2.left;
            iArr[i19 + 1] = rect2.top;
            iArr[i19 + 2] = rect2.right;
            iArr[i19 + 3] = rect2.bottom;
            iArr2[arrayList2.size() + i18] = v0.i.c(bVar2.f43216b);
            iArr3[arrayList2.size() + i18] = v0.i.c(bVar2.f43217c);
        }
        hVar.f43247a.setViewportMetrics(gVar.f43226a, gVar.f43227b, gVar.f43228c, gVar.f43233h, gVar.f43234i, gVar.f43235j, gVar.f43236k, gVar.l, gVar.f43237m, gVar.f43238n, gVar.f43239o, gVar.f43240p, gVar.f43241q, gVar.f43242r, gVar.f43243s, gVar.f43244t, iArr, iArr2, iArr3, gVar.f43229d, gVar.f43230e, gVar.f43231f, gVar.f43232g);
    }

    @Override // android.view.View
    @Nullable
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.g gVar = this.f46066r;
        if (gVar == null || !gVar.f43481c.isEnabled()) {
            return null;
        }
        return this.f46066r;
    }

    @Nullable
    public ni.c getAttachedFlutterEngine() {
        return this.f46059j;
    }

    public xi.f getBinaryMessenger() {
        return this.f46059j.f46739c;
    }

    public l getCurrentImageSurface() {
        return this.f46054e;
    }

    public io.flutter.embedding.engine.renderer.g getViewportMetrics() {
        return this.f46069u;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        getWindowSystemUiVisibility();
        getWindowSystemUiVisibility();
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
        int i10 = insets.top;
        io.flutter.embedding.engine.renderer.g gVar = this.f46069u;
        gVar.f43233h = i10;
        gVar.f43234i = insets.right;
        gVar.f43235j = insets.bottom;
        gVar.f43236k = insets.left;
        Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
        gVar.l = insets2.top;
        gVar.f43237m = insets2.right;
        gVar.f43238n = insets2.bottom;
        gVar.f43239o = insets2.left;
        Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
        gVar.f43240p = insets3.top;
        gVar.f43241q = insets3.right;
        gVar.f43242r = insets3.bottom;
        gVar.f43243s = insets3.left;
        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
        if (displayCutout != null) {
            Insets waterfallInsets = displayCutout.getWaterfallInsets();
            gVar.f43233h = Math.max(Math.max(gVar.f43233h, waterfallInsets.top), displayCutout.getSafeInsetTop());
            gVar.f43234i = Math.max(Math.max(gVar.f43234i, waterfallInsets.right), displayCutout.getSafeInsetRight());
            gVar.f43235j = Math.max(Math.max(gVar.f43235j, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
            gVar.f43236k = Math.max(Math.max(gVar.f43236k, waterfallInsets.left), displayCutout.getSafeInsetLeft());
        }
        ArrayList arrayList = new ArrayList();
        DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
        if (displayCutout2 != null) {
            for (Rect rect : displayCutout2.getBoundingRects()) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.b(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = gVar.f43246v;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            t tVar = this.C;
            Context context = getContext();
            tVar.getClass();
            t.a(context, gVar);
        }
        e();
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        am.e eVar;
        fn.e flow;
        super.onAttachedToWindow();
        ak.f fVar = null;
        try {
            x4.g gVar = x4.h.f53626z9;
            Context context = getContext();
            gVar.getClass();
            eVar = new am.e(new m5.k(x4.g.a(context)), 19);
        } catch (NoClassDefFoundError unused) {
            eVar = null;
        }
        this.f46068t = eVar;
        Activity activityV = com.bumptech.glide.d.v(getContext());
        am.e eVar2 = this.f46068t;
        if (eVar2 == null || activityV == null) {
            return;
        }
        this.f46074z = new com.applovin.impl.sdk.ad.d(this, 1);
        Executor executor = getContext().getMainExecutor();
        com.applovin.impl.sdk.ad.d consumer = this.f46074z;
        m5.k kVar = (m5.k) eVar2.f3698b;
        kotlin.jvm.internal.n.f(executor, "executor");
        kotlin.jvm.internal.n.f(consumer, "consumer");
        m5.k kVar2 = (m5.k) kVar.f45903c;
        x4.b bVar = (x4.b) kVar.f45902b;
        bVar.getClass();
        int i10 = 15;
        b4.b bVar2 = new b4.b(bVar, activityV, fVar, i10);
        en.a aVar = en.a.f40122a;
        ak.l lVar = ak.l.f3620a;
        fn.c cVar = new fn.c(bVar2, lVar, -2, aVar);
        jn.e eVar3 = n0.f6748a;
        dn.e eVar4 = hn.o.f42451a;
        if (eVar4.get(e1.f6705a) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + eVar4).toString());
        }
        if (!eVar4.equals(lVar)) {
            flow = cVar;
            flow = gn.l.c(cVar, eVar4, 0, null, 6);
        }
        flow = cVar;
        LinkedHashMap linkedHashMap = (LinkedHashMap) kVar2.f45903c;
        kotlin.jvm.internal.n.f(flow, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) kVar2.f45902b;
        reentrantLock.lock();
        try {
            if (linkedHashMap.get(consumer) == null) {
                linkedHashMap.put(consumer, cn.d0.w(cn.d0.b(cn.d0.o(executor)), null, new b4.c(flow, consumer, fVar, i10), 3));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f46059j != null) {
            this.f46063o.b(configuration);
            d();
            com.bumptech.glide.d.d(getContext(), this.f46059j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0060 A[PHI: r8
  0x0060: PHI (r8v13 int) = (r8v6 int), (r8v16 int) binds: [B:73:0x00bb, B:31:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c0  */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        int i11;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.j jVar = this.f46061m;
        v9.e eVar = this.f46064p;
        n3 n3Var = jVar.f43299e;
        int i12 = n3Var.f17624a;
        if (i12 == 1) {
            jVar.f43304j = null;
            return null;
        }
        int i13 = 4;
        if (i12 == 4) {
            return null;
        }
        if (i12 == 3) {
            if (jVar.f43309p) {
                return jVar.f43304j;
            }
            InputConnection inputConnectionOnCreateInputConnection = jVar.f43305k.b0(n3Var.f17625b).onCreateInputConnection(editorInfo);
            jVar.f43304j = inputConnectionOnCreateInputConnection;
            return inputConnectionOnCreateInputConnection;
        }
        wi.m mVar = jVar.f43300f;
        wi.n nVar = mVar.f53260g;
        boolean z10 = mVar.f53254a;
        boolean z11 = mVar.f53255b;
        boolean z12 = mVar.f53256c;
        boolean z13 = mVar.f53257d;
        int i14 = mVar.f53259f;
        int i15 = nVar.f53266a;
        if (i15 != 2) {
            if (i15 == 5) {
                i13 = nVar.f53267b ? 4098 : 2;
                if (nVar.f53268c) {
                    i13 |= Segment.SIZE;
                }
            } else if (i15 == 6) {
                i13 = 3;
            } else if (i15 == 11) {
                i13 = 0;
            } else {
                if (i15 == 7) {
                    i10 = 131073;
                } else if (i15 == 8 || i15 == 13) {
                    i10 = 33;
                } else if (i15 == 9 || i15 == 12) {
                    i10 = 17;
                } else if (i15 == 10) {
                    i10 = 145;
                } else if (i15 == 3) {
                    i10 = 97;
                } else {
                    i10 = i15 == 4 ? InterfaceC0435l1.d.b.f29114k : 1;
                }
                if (z10) {
                    i11 = 524416;
                } else {
                    if (z11) {
                        i10 |= 32768;
                    }
                    if (z12) {
                        i13 = i10;
                        if (i14 == 1) {
                            i13 |= 4096;
                        } else if (i14 == 2) {
                            i13 |= Segment.SIZE;
                        } else if (i14 == 3) {
                            i13 |= Http2.INITIAL_MAX_FRAME_SIZE;
                        }
                    } else {
                        i11 = 524432;
                    }
                }
                i10 |= i11;
                i13 = i10;
                if (i14 == 1) {
                    i13 |= 4096;
                } else if (i14 == 2) {
                    i13 |= Segment.SIZE;
                } else if (i14 == 3) {
                    i13 |= Http2.INITIAL_MAX_FRAME_SIZE;
                }
            }
        }
        editorInfo.inputType = i13;
        editorInfo.imeOptions = 33554432;
        int i16 = Build.VERSION.SDK_INT;
        if (!z13) {
            editorInfo.imeOptions = 50331648;
        }
        int iIntValue = mVar.f53261h.intValue();
        wi.m mVar2 = jVar.f43300f;
        String str = mVar2.f53262i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = iIntValue;
        }
        editorInfo.imeOptions = iIntValue | editorInfo.imeOptions;
        if (mVar2.f53265m != null) {
            editorInfo.hintLocales = new LocaleList(jVar.f43300f.f53265m);
        }
        String[] strArr = jVar.f43300f.f53264k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i16 >= 34) {
            if (i16 >= 35) {
                o0.a.b(editorInfo);
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.c cVar = new io.flutter.plugin.editing.c(this, jVar.f43299e.f17625b, jVar.f43298d, eVar, jVar.f43302h, editorInfo);
        io.flutter.plugin.editing.f fVar = jVar.f43302h;
        fVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(fVar);
        io.flutter.plugin.editing.f fVar2 = jVar.f43302h;
        fVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(fVar2);
        jVar.f43304j = cVar;
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        com.applovin.impl.sdk.ad.d dVar;
        am.e eVar = this.f46068t;
        if (eVar != null && (dVar = this.f46074z) != null) {
            m5.k kVar = (m5.k) ((m5.k) eVar.f3698b).f45903c;
            LinkedHashMap linkedHashMap = (LinkedHashMap) kVar.f45903c;
            ReentrantLock reentrantLock = (ReentrantLock) kVar.f45902b;
            reentrantLock.lock();
            try {
                f1 f1Var = (f1) linkedHashMap.get(dVar);
                if (f1Var != null) {
                    f1Var.a(null);
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        this.f46074z = null;
        this.f46068t = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            a aVar = this.f46065q;
            Context context = getContext();
            aVar.getClass();
            boolean zIsFromSource = motionEvent.isFromSource(2);
            boolean z10 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (zIsFromSource && z10) {
                int iB = a.b(motionEvent.getActionMasked());
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                aVar.a(motionEvent, motionEvent.getActionIndex(), iB, 0, a.f45970e, byteBufferAllocateDirect, context);
                if (byteBufferAllocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                aVar.f45971a.f43247a.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f46066r.f(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.A = View.MeasureSpec.getMode(i10);
        this.B = View.MeasureSpec.getMode(i11);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i10);
        io.flutter.plugin.editing.j jVar = this.f46061m;
        if (jVar.f43301g != null) {
            String str = (String) jVar.f43300f.f53263j.f44325a;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i11 = 0; i11 < jVar.f43301g.size(); i11++) {
                int iKeyAt = jVar.f43301g.keyAt(i11);
                k5.g gVar = ((wi.m) jVar.f43301g.valueAt(i11)).f53263j;
                if (gVar != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
                    viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                    String[] strArr = (String[]) gVar.f44326b;
                    if (strArr.length > 0) {
                        viewStructureNewChild.setAutofillHints(strArr);
                    }
                    viewStructureNewChild.setAutofillType(1);
                    viewStructureNewChild.setVisibility(0);
                    String str2 = (String) gVar.f44328d;
                    if (str2 != null) {
                        viewStructureNewChild.setHint(str2);
                    }
                    if (str.hashCode() != iKeyAt || (rect = jVar.f43306m) == null) {
                        viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(((wi.o) gVar.f44327c).f53269a));
                    } else {
                        viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), jVar.f43306m.height());
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(jVar.f43302h));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        io.flutter.embedding.engine.renderer.g gVar = this.f46069u;
        gVar.f43227b = i10;
        gVar.f43228c = i11;
        boolean z10 = this.f46051b;
        if (z10 && this.B == 0) {
            gVar.f43231f = 0;
            gVar.f43232g = Segment.SIZE;
        } else {
            gVar.f43231f = i11;
            gVar.f43232g = i11;
        }
        if (z10 && this.A == 0) {
            gVar.f43229d = 0;
            gVar.f43230e = Segment.SIZE;
        } else {
            gVar.f43229d = i10;
            gVar.f43230e = i10;
        }
        if (this.f46050a.compareAndSet(false, true)) {
            return;
        }
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f46065q.c(motionEvent, a.f45970e);
        return true;
    }

    public void setDelegate(@NonNull t tVar) {
        this.C = tVar;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f46055f;
        if (view instanceof n) {
            ((n) view).setVisibility(i10);
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(x4.i iVar) {
        x4.b bVar = x4.b.f53607d;
        ?? r10 = iVar.f53627a;
        ArrayList arrayList = new ArrayList();
        for (x4.c cVar : r10) {
            cVar.f53614a.a().toString();
            u4.b bVar2 = cVar.f53614a;
            int i10 = 2;
            int i11 = ((bVar2.f51881c - bVar2.f51879a == 0 || bVar2.f51882d - bVar2.f51880b == 0) ? x4.b.f53606c : bVar) == bVar ? 3 : 2;
            x4.b bVar3 = cVar.f53616c;
            if (bVar3 != x4.b.f53608e) {
                i10 = bVar3 == x4.b.f53609f ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.b(bVar2.a(), i11, i10));
        }
        ArrayList arrayList2 = this.f46069u.f43245u;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public s(Context context, p pVar) {
        super(context, null);
        this.f46050a = new AtomicBoolean(true);
        this.f46051b = false;
        this.f46057h = new HashSet();
        this.f46060k = new HashSet();
        this.f46069u = new io.flutter.embedding.engine.renderer.g();
        this.f46070v = new s4.i(this);
        this.f46071w = new com.google.android.gms.internal.auth.k(this, new Handler(Looper.getMainLooper()), 2);
        this.f46072x = new q(this);
        this.f46073y = new io.flutter.embedding.engine.renderer.a(this, 2);
        this.C = new t();
        this.f46053d = pVar;
        this.f46055f = pVar;
        b();
    }
}
