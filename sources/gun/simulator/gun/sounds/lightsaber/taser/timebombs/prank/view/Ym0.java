package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Ym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4041a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public final HashSet e;
    public final HashSet f;
    public final HashSet g;
    public final HashMap h;
    public final HashSet i;
    public final WeakHashMap j;
    public boolean k;

    public Ym0(int i) {
        this.f4041a = i;
        if (i != 1) {
            this.b = new HashMap();
            this.c = new HashMap();
            this.d = new HashMap();
            this.e = new HashSet();
            this.f = new HashSet();
            this.g = new HashSet();
            this.h = new HashMap();
            this.i = new HashSet();
            this.j = new WeakHashMap();
            return;
        }
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = new HashSet();
        this.h = new HashMap();
        this.i = new HashSet();
        this.j = new WeakHashMap();
    }

    public final Boolean a(View view) {
        WeakHashMap weakHashMap = this.j;
        switch (this.f4041a) {
            case 0:
                if (view.hasWindowFocus()) {
                    weakHashMap.remove(view);
                    return Boolean.FALSE;
                }
                if (weakHashMap.containsKey(view)) {
                    return (Boolean) weakHashMap.get(view);
                }
                Boolean bool = Boolean.FALSE;
                weakHashMap.put(view, bool);
                return bool;
            default:
                if (view.hasWindowFocus()) {
                    weakHashMap.remove(view);
                    return Boolean.FALSE;
                }
                if (weakHashMap.containsKey(view)) {
                    return (Boolean) weakHashMap.get(view);
                }
                Boolean bool2 = Boolean.FALSE;
                weakHashMap.put(view, bool2);
                return bool2;
        }
    }

    public final String b(View view, boolean z) {
        HashSet hashSet = this.e;
        switch (this.f4041a) {
            case 0:
                if (!view.isAttachedToWindow()) {
                    return "notAttached";
                }
                if (a(view).booleanValue() && !z) {
                    return "noWindowFocus";
                }
                HashSet hashSet2 = new HashSet();
                while (view != null) {
                    String strC = AbstractC2340Cl.c(view);
                    if (strC != null) {
                        return strC;
                    }
                    hashSet2.add(view);
                    Object parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                hashSet.addAll(hashSet2);
                return null;
            default:
                if (!view.isAttachedToWindow()) {
                    return "notAttached";
                }
                if (a(view).booleanValue() && !z) {
                    return "noWindowFocus";
                }
                HashSet hashSet3 = new HashSet();
                while (view != null) {
                    String strB = AbstractC2995aW.b(view);
                    if (strB != null) {
                        return strB;
                    }
                    hashSet3.add(view);
                    Object parent2 = view.getParent();
                    view = parent2 instanceof View ? (View) parent2 : null;
                }
                hashSet.addAll(hashSet3);
                return null;
        }
    }

    public final void c() {
        HashSet hashSet = this.i;
        HashMap map = this.h;
        HashSet hashSet2 = this.g;
        HashSet hashSet3 = this.f;
        HashSet hashSet4 = this.e;
        HashMap map2 = this.d;
        HashMap map3 = this.c;
        HashMap map4 = this.b;
        switch (this.f4041a) {
            case 0:
                map4.clear();
                map3.clear();
                map2.clear();
                hashSet4.clear();
                hashSet3.clear();
                hashSet2.clear();
                map.clear();
                this.k = false;
                hashSet.clear();
                break;
            default:
                map4.clear();
                map3.clear();
                map2.clear();
                hashSet4.clear();
                hashSet3.clear();
                hashSet2.clear();
                map.clear();
                this.k = false;
                hashSet.clear();
                break;
        }
    }

    public final String d(View view) {
        HashMap map = this.b;
        String str = null;
        switch (this.f4041a) {
            case 0:
                if (map.size() != 0 && (str = (String) map.get(view)) != null) {
                    map.remove(view);
                }
                break;
            default:
                if (map.size() != 0 && (str = (String) map.get(view)) != null) {
                    map.remove(view);
                }
                break;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        boolean zIsInPictureInPictureMode;
        Activity activity;
        boolean zIsInPictureInPictureMode2;
        Activity activity2;
        HashMap map = this.d;
        HashMap map2 = this.b;
        HashSet hashSet = this.f;
        HashSet hashSet2 = this.i;
        HashSet hashSet3 = this.g;
        HashMap map3 = this.h;
        int i = 24;
        switch (this.f4041a) {
            case 0:
                Cn0 cn0 = Cn0.c;
                if (cn0 != null) {
                    for (C3203cn0 c3203cn0 : Collections.unmodifiableCollection(cn0.b)) {
                        View view = (View) c3203cn0.d.get();
                        if (c3203cn0.f && !c3203cn0.g) {
                            String str = c3203cn0.h;
                            if (view != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    Context context = view.getContext();
                                    while (true) {
                                        if (!(context instanceof ContextWrapper)) {
                                            activity = null;
                                        } else if (context instanceof Activity) {
                                            activity = (Activity) context;
                                        } else {
                                            context = ((ContextWrapper) context).getBaseContext();
                                        }
                                    }
                                    if (activity != null) {
                                        zIsInPictureInPictureMode = activity.isInPictureInPictureMode();
                                    } else {
                                        zIsInPictureInPictureMode = false;
                                    }
                                } else {
                                    zIsInPictureInPictureMode = false;
                                }
                                if (zIsInPictureInPictureMode) {
                                    hashSet2.add(str);
                                }
                                String strB = b(view, zIsInPictureInPictureMode);
                                if (strB == null) {
                                    hashSet.add(str);
                                    map2.put(view, str);
                                    for (C3996lo0 c3996lo0 : c3203cn0.c.f4903a) {
                                        View view2 = (View) c3996lo0.f4668a.get();
                                        if (view2 != null) {
                                            HashMap map4 = this.c;
                                            C5223zm0 c5223zm0 = (C5223zm0) map4.get(view2);
                                            if (c5223zm0 != null) {
                                                c5223zm0.b.add(str);
                                            } else {
                                                map4.put(view2, new C5223zm0(c3996lo0, str));
                                            }
                                        }
                                    }
                                } else if (strB != "noWindowFocus") {
                                    hashSet3.add(str);
                                    map.put(str, view);
                                    map3.put(str, strB);
                                }
                            } else {
                                hashSet3.add(str);
                                map3.put(str, "noAdView");
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                Hn0 hn0 = Hn0.c;
                if (hn0 != null) {
                    for (Jm0 jm0 : Collections.unmodifiableCollection(hn0.b)) {
                        View view3 = (View) jm0.d.get();
                        if (jm0.f && !jm0.g) {
                            String str2 = jm0.h;
                            if (view3 != null) {
                                if (Build.VERSION.SDK_INT >= i) {
                                    Context context2 = view3.getContext();
                                    while (true) {
                                        if (!(context2 instanceof ContextWrapper)) {
                                            activity2 = null;
                                        } else if (context2 instanceof Activity) {
                                            activity2 = (Activity) context2;
                                        } else {
                                            context2 = ((ContextWrapper) context2).getBaseContext();
                                        }
                                    }
                                    if (activity2 != null) {
                                        zIsInPictureInPictureMode2 = activity2.isInPictureInPictureMode();
                                    } else {
                                        zIsInPictureInPictureMode2 = false;
                                    }
                                } else {
                                    zIsInPictureInPictureMode2 = false;
                                }
                                if (zIsInPictureInPictureMode2) {
                                    hashSet2.add(str2);
                                }
                                String strB2 = b(view3, zIsInPictureInPictureMode2);
                                if (strB2 == null) {
                                    hashSet.add(str2);
                                    map2.put(view3, str2);
                                    Iterator it = jm0.c.f4852a.iterator();
                                    if (it.hasNext()) {
                                        AbstractC3950lJ.z(it.next());
                                        throw null;
                                    }
                                } else if (strB2 != "noWindowFocus") {
                                    hashSet3.add(str2);
                                    map.put(str2, view3);
                                    map3.put(str2, strB2);
                                }
                            } else {
                                hashSet3.add(str2);
                                map3.put(str2, "noAdView");
                            }
                        }
                        i = 24;
                    }
                    return;
                }
                return;
        }
    }

    public final boolean f(View view) {
        WeakHashMap weakHashMap = this.j;
        switch (this.f4041a) {
            case 0:
                if (!weakHashMap.containsKey(view)) {
                    return true;
                }
                weakHashMap.put(view, Boolean.TRUE);
                return false;
            default:
                if (!weakHashMap.containsKey(view)) {
                    return true;
                }
                weakHashMap.put(view, Boolean.TRUE);
                return false;
        }
    }
}
