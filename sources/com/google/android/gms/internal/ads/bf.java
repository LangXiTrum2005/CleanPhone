package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.services.UnityAdsConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bf implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ bf f12746b = new bf(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12747a;

    public /* synthetic */ bf(int i10) {
        this.f12747a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:201:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x0147  */
    /* JADX WARN: Code duplicated, block: B:72:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x017a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        CountDownLatch countDownLatch;
        HashSet hashSet;
        Throwable th2;
        KeyguardManager keyguardManager;
        Iterator it;
        WeakHashMap weakHashMap;
        Iterator it2;
        HashSet hashSet2;
        Activity activity;
        Boolean bool;
        String str;
        View view;
        iz0 iz0Var;
        switch (this.f12747a) {
            case 0:
                try {
                    cf.f13146b = MessageDigest.getInstance(SameMD5.TAG);
                    countDownLatch = cf.f13149e;
                } catch (NoSuchAlgorithmException unused) {
                    countDownLatch = cf.f13149e;
                } catch (Throwable th3) {
                    cf.f13149e.countDown();
                    throw th3;
                }
                countDownLatch.countDown();
                return;
            case 1:
                return;
            case 2:
                List list = zy.l;
                x10.j("Pinged SB successfully.");
                return;
            case 3:
                Looper.myLooper().quit();
                return;
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                kz0 kz0Var = kz0.f16576g;
                ln0 ln0Var = kz0Var.f16584d;
                md0 md0Var = kz0Var.f16585e;
                kz0Var.f16582b.clear();
                for (ky0 ky0Var : Collections.unmodifiableCollection(vy0.f21317c.f21319b)) {
                }
                kz0Var.f16586f = System.nanoTime();
                HashMap map = (HashMap) ln0Var.f17077h;
                HashSet hashSet3 = (HashSet) ln0Var.f17075f;
                HashMap map2 = (HashMap) ln0Var.f17072c;
                HashMap map3 = (HashMap) ln0Var.f17071b;
                HashSet hashSet4 = (HashSet) ln0Var.f17074e;
                HashSet hashSet5 = (HashSet) ln0Var.f17078i;
                HashSet<String> hashSet6 = (HashSet) ln0Var.f17076g;
                HashMap map4 = (HashMap) ln0Var.f17073d;
                WeakHashMap weakHashMap2 = (WeakHashMap) ln0Var.f17079j;
                vy0 vy0Var = vy0.f21317c;
                if (vy0Var != null) {
                    Iterator it3 = Collections.unmodifiableCollection(vy0Var.f21319b).iterator();
                    while (it3.hasNext()) {
                        ky0 ky0Var2 = (ky0) it3.next();
                        View view2 = (View) ky0Var2.f16559c.get();
                        String str2 = ky0Var2.f16563g;
                        md0Var = md0Var;
                        if (!ky0Var2.f16561e || ky0Var2.f16562f) {
                            weakHashMap = weakHashMap2;
                            it2 = it3;
                            hashSet2 = hashSet5;
                            it3 = it2;
                            weakHashMap2 = weakHashMap;
                            hashSet5 = hashSet2;
                        } else if (view2 != null) {
                            Context context = view2.getContext();
                            it2 = it3;
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    activity = null;
                                } else if (context instanceof Activity) {
                                    activity = (Activity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            boolean zIsInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                            if (zIsInPictureInPictureMode) {
                                hashSet5.add(str2);
                            }
                            boolean z10 = zIsInPictureInPictureMode;
                            if (view2.isAttachedToWindow()) {
                                if (view2.hasWindowFocus()) {
                                    weakHashMap2.remove(view2);
                                    bool = Boolean.FALSE;
                                } else if (weakHashMap2.containsKey(view2)) {
                                    bool = (Boolean) weakHashMap2.get(view2);
                                } else {
                                    bool = Boolean.FALSE;
                                    weakHashMap2.put(view2, bool);
                                }
                                if (!bool.booleanValue() || z10) {
                                    HashSet hashSet7 = new HashSet();
                                    weakHashMap = weakHashMap2;
                                    View view3 = view2;
                                    while (true) {
                                        if (view3 == null) {
                                            hashSet2 = hashSet5;
                                            hashSet4.addAll(hashSet7);
                                            str = null;
                                        } else {
                                            String strF = pi1.f(view3);
                                            if (strF != null) {
                                                str = strF;
                                            } else {
                                                hashSet7.add(view3);
                                                Object parent = view3.getParent();
                                                hashSet5 = hashSet5;
                                                view3 = parent instanceof View ? (View) parent : null;
                                            }
                                        }
                                    }
                                    if (str == null) {
                                        hashSet3.add(str2);
                                        map3.put(view2, str2);
                                        for (yy0 yy0Var : ky0Var2.f16558b.f22774a) {
                                            view = (View) yy0Var.f22409a.get();
                                            if (view == null) {
                                                iz0Var = (iz0) map2.get(view);
                                                if (iz0Var != null) {
                                                    iz0Var.f15879b.add(str2);
                                                } else {
                                                    map2.put(view, new iz0(yy0Var, str2));
                                                }
                                            }
                                        }
                                    } else if (str != "noWindowFocus") {
                                        hashSet6.add(str2);
                                        map4.put(str2, view2);
                                        map.put(str2, str);
                                    }
                                    it3 = it2;
                                    weakHashMap2 = weakHashMap;
                                    hashSet5 = hashSet2;
                                } else {
                                    weakHashMap = weakHashMap2;
                                    str = "noWindowFocus";
                                }
                            } else {
                                str = "notAttached";
                                weakHashMap = weakHashMap2;
                            }
                            hashSet2 = hashSet5;
                            if (str == null) {
                                hashSet3.add(str2);
                                map3.put(view2, str2);
                                while (r0.hasNext()) {
                                    view = (View) yy0Var.f22409a.get();
                                    if (view == null) {
                                        iz0Var = (iz0) map2.get(view);
                                        if (iz0Var != null) {
                                            iz0Var.f15879b.add(str2);
                                        } else {
                                            map2.put(view, new iz0(yy0Var, str2));
                                        }
                                    }
                                }
                            } else if (str != "noWindowFocus") {
                                hashSet6.add(str2);
                                map4.put(str2, view2);
                                map.put(str2, str);
                            }
                            it3 = it2;
                            weakHashMap2 = weakHashMap;
                            hashSet5 = hashSet2;
                        } else {
                            hashSet6.add(str2);
                            map.put(str2, "noAdView");
                            weakHashMap2 = weakHashMap2;
                        }
                    }
                }
                md0 md0Var2 = md0Var;
                HashSet hashSet8 = hashSet5;
                iw0 iw0Var = kz0Var.f16583c;
                long jNanoTime = System.nanoTime();
                uo0 uo0Var = (uo0) iw0Var.f15865c;
                if (hashSet6.size() > 0) {
                    for (String str3 : hashSet6) {
                        HashSet hashSet9 = hashSet6;
                        JSONObject jSONObjectG = uo0Var.g(null);
                        View view4 = (View) map4.get(str3);
                        x11 x11Var = (x11) iw0Var.f15864b;
                        uo0 uo0Var2 = uo0Var;
                        String str4 = (String) map.get(str3);
                        if (str4 != null) {
                            JSONObject jSONObjectZ = x11Var.z(view4);
                            try {
                                jSONObjectZ.put("adSessionId", str3);
                            } catch (JSONException e10) {
                                rb0.k("Error with setting ad session id", e10);
                            }
                            try {
                                jSONObjectZ.put("notVisibleReason", str4);
                            } catch (JSONException e11) {
                                rb0.k("Error with setting not visible reason", e11);
                            }
                            hz0.c(jSONObjectG, jSONObjectZ);
                        } else {
                            map4 = map4;
                        }
                        hz0.d(jSONObjectG);
                        HashSet hashSet10 = new HashSet();
                        hashSet10.add(str3);
                        md0Var2.getClass();
                        HashMap map5 = map;
                        md0 md0Var3 = md0Var2;
                        nz0 nz0Var = new nz0(md0Var3, hashSet10, jSONObjectG, jNanoTime, 0);
                        ay0 ay0Var = (ay0) md0Var3.f17400c;
                        nz0Var.f17163a = ay0Var;
                        ArrayDeque arrayDeque = (ArrayDeque) ay0Var.f12538c;
                        arrayDeque.add(nz0Var);
                        if (((lz0) ay0Var.f12539d) == null) {
                            lz0 lz0Var = (lz0) arrayDeque.poll();
                            ay0Var.f12539d = lz0Var;
                            if (lz0Var != null) {
                                lz0Var.executeOnExecutor((ThreadPoolExecutor) ay0Var.f12537b, new Object[0]);
                            }
                        }
                        md0Var2 = md0Var3;
                        hashSet6 = hashSet9;
                        map4 = map4;
                        map = map5;
                        uo0Var = uo0Var2;
                        break;
                    }
                }
                HashSet hashSet11 = hashSet6;
                uo0 uo0Var3 = uo0Var;
                HashMap map6 = map4;
                HashMap map7 = map;
                md0 md0Var4 = md0Var2;
                if (hashSet3.size() > 0) {
                    JSONObject jSONObjectG2 = uo0Var3.g(null);
                    uo0Var3.getClass();
                    ArrayList arrayList = new ArrayList();
                    vy0 vy0Var2 = vy0.f21317c;
                    if (vy0Var2 != null) {
                        Collection collectionUnmodifiableCollection = Collections.unmodifiableCollection(vy0Var2.f21319b);
                        int size = collectionUnmodifiableCollection.size();
                        th2 = null;
                        IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
                        Iterator it4 = collectionUnmodifiableCollection.iterator();
                        while (it4.hasNext()) {
                            View view5 = (View) ((ky0) it4.next()).f16559c.get();
                            if (view5 != null && view5.isAttachedToWindow() && view5.isShown()) {
                                View view6 = view5;
                                while (true) {
                                    if (view6 == null) {
                                        md0Var4 = md0Var4;
                                        View rootView = view5.getRootView();
                                        if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                            identityHashMap.put(rootView, rootView);
                                            float z11 = rootView.getZ();
                                            int size2 = arrayList.size();
                                            while (true) {
                                                if (size2 > 0) {
                                                    it = it4;
                                                    int i10 = size2 - 1;
                                                    if (((View) arrayList.get(i10)).getZ() > z11) {
                                                        size2 = i10;
                                                        it4 = it;
                                                    }
                                                } else {
                                                    it = it4;
                                                }
                                            }
                                            arrayList.add(size2, rootView);
                                            it4 = it;
                                        }
                                    }
                                    if (view6.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    }
                                    Object parent2 = view6.getParent();
                                    md0 md0Var5 = md0Var4;
                                    if (parent2 instanceof View) {
                                        view6 = (View) parent2;
                                        md0Var4 = md0Var5;
                                    } else {
                                        md0Var4 = md0Var5;
                                        view6 = null;
                                    }
                                    break;
                                    break;
                                }
                            }
                        }
                    } else {
                        th2 = null;
                    }
                    md0 md0Var6 = md0Var4;
                    int size3 = arrayList.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        kz0Var.a((View) arrayList.get(i11), (x11) uo0Var3.f20839b, jSONObjectG2, false);
                    }
                    hz0.d(jSONObjectG2);
                    md0Var6.getClass();
                    hashSet = hashSet3;
                    nz0 nz0Var2 = new nz0(md0Var6, hashSet, jSONObjectG2, jNanoTime, 1);
                    ay0 ay0Var2 = (ay0) md0Var6.f17400c;
                    nz0Var2.f17163a = ay0Var2;
                    ArrayDeque arrayDeque2 = (ArrayDeque) ay0Var2.f12538c;
                    arrayDeque2.add(nz0Var2);
                    if (((lz0) ay0Var2.f12539d) == null) {
                        lz0 lz0Var2 = (lz0) arrayDeque2.poll();
                        ay0Var2.f12539d = lz0Var2;
                        if (lz0Var2 != null) {
                            lz0Var2.executeOnExecutor((ThreadPoolExecutor) ay0Var2.f12537b, new Object[0]);
                        }
                    }
                } else {
                    hashSet = hashSet3;
                    th2 = null;
                    md0Var4.getClass();
                    mz0 mz0Var = new mz0(md0Var4);
                    ay0 ay0Var3 = (ay0) md0Var4.f17400c;
                    mz0Var.f17163a = ay0Var3;
                    ArrayDeque arrayDeque3 = (ArrayDeque) ay0Var3.f12538c;
                    arrayDeque3.add(mz0Var);
                    if (((lz0) ay0Var3.f12539d) == null) {
                        lz0 lz0Var3 = (lz0) arrayDeque3.poll();
                        ay0Var3.f12539d = lz0Var3;
                        if (lz0Var3 != null) {
                            lz0Var3.executeOnExecutor((ThreadPoolExecutor) ay0Var3.f12537b, new Object[0]);
                        }
                    }
                }
                map3.clear();
                map2.clear();
                map6.clear();
                hashSet4.clear();
                hashSet.clear();
                hashSet11.clear();
                map7.clear();
                ln0Var.f17070a = false;
                hashSet8.clear();
                long jNanoTime2 = System.nanoTime() - kz0Var.f16586f;
                ArrayList arrayList2 = kz0Var.f16581a;
                if (arrayList2.size() > 0) {
                    Iterator it5 = arrayList2.iterator();
                    if (it5.hasNext()) {
                        if (it5.next() != null) {
                            throw new ClassCastException();
                        }
                        TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                        throw th2;
                    }
                }
                cz0 cz0Var = cz0.f13317d;
                Context context2 = (Context) cz0Var.f13318a.get();
                if (context2 == null || (keyguardManager = (KeyguardManager) context2.getSystemService("keyguard")) == null) {
                    return;
                }
                boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
                cz0Var.a(cz0Var.f13319b, zIsDeviceLocked);
                cz0Var.f13320c = zIsDeviceLocked;
                return;
            case 8:
                Handler handler = kz0.f16578i;
                if (handler != null) {
                    handler.post(kz0.f16579j);
                    kz0.f16578i.postDelayed(kz0.f16580k, 200L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }

    private final /* synthetic */ void c() {
    }

    private final /* synthetic */ void d() {
    }

    private final void e() {
    }
}
