package com.iab.omid.library.unity3d.walking;

import android.view.View;
import com.iab.omid.library.unity3d.internal.e;
import com.iab.omid.library.unity3d.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f25571a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0036a> f25572b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f25573c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f25574d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f25575e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f25576f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f25577g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f25578h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25579i;

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.a$a, reason: collision with other inner class name */
    public static class C0036a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f25580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f25581b = new ArrayList<>();

        public C0036a(e eVar, String str) {
            this.f25580a = eVar;
            a(str);
        }

        public e a() {
            return this.f25580a;
        }

        public ArrayList<String> b() {
            return this.f25581b;
        }

        public void a(String str) {
            this.f25581b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f25578h.remove(view);
            return Boolean.FALSE;
        }
        boolean zContainsKey = this.f25578h.containsKey(view);
        Map<View, Boolean> map = this.f25578h;
        if (zContainsKey) {
            return map.get(view);
        }
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f25573c.get(str);
    }

    public C0036a c(View view) {
        C0036a c0036a = this.f25572b.get(view);
        if (c0036a != null) {
            this.f25572b.remove(view);
        }
        return c0036a;
    }

    public String d(View view) {
        if (this.f25571a.size() == 0) {
            return null;
        }
        String str = this.f25571a.get(view);
        if (str != null) {
            this.f25571a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        if (this.f25574d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f25579i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f25578h.containsKey(view)) {
            return true;
        }
        this.f25578h.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strA = h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f25574d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f25577g.get(str);
    }

    public HashSet<String> c() {
        return this.f25575e;
    }

    public void d() {
        this.f25579i = true;
    }

    public void e() {
        com.iab.omid.library.unity3d.internal.c cVarC = com.iab.omid.library.unity3d.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.unity3d.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f25575e.add(adSessionId);
                            this.f25571a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f25576f.add(adSessionId);
                            this.f25573c.put(adSessionId, viewC);
                            this.f25577g.put(adSessionId, strA);
                        }
                    } else {
                        this.f25576f.add(adSessionId);
                        this.f25577g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f25571a.clear();
        this.f25572b.clear();
        this.f25573c.clear();
        this.f25574d.clear();
        this.f25575e.clear();
        this.f25576f.clear();
        this.f25577g.clear();
        this.f25579i = false;
    }

    public HashSet<String> b() {
        return this.f25576f;
    }

    private void a(com.iab.omid.library.unity3d.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.unity3d.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0036a c0036a = this.f25572b.get(view);
        if (c0036a != null) {
            c0036a.a(aVar.getAdSessionId());
        } else {
            this.f25572b.put(view, new C0036a(eVar, aVar.getAdSessionId()));
        }
    }
}
