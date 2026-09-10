package com.iab.omid.library.applovin.walking;

import android.view.View;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f25176a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0024a> f25177b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f25178c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f25179d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f25180e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f25181f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f25182g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f25183h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f25184i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25185j;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    public static class C0024a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f25186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f25187b = new ArrayList<>();

        public C0024a(e eVar, String str) {
            this.f25186a = eVar;
            a(str);
        }

        public e a() {
            return this.f25186a;
        }

        public ArrayList<String> b() {
            return this.f25187b;
        }

        public void a(String str) {
            this.f25187b.add(str);
        }
    }

    public View a(String str) {
        return this.f25178c.get(str);
    }

    public C0024a b(View view) {
        C0024a c0024a = this.f25177b.get(view);
        if (c0024a != null) {
            this.f25177b.remove(view);
        }
        return c0024a;
    }

    public String c(View view) {
        if (this.f25176a.size() == 0) {
            return null;
        }
        String str = this.f25176a.get(view);
        if (str != null) {
            this.f25176a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        if (this.f25179d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f25185j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c cVarC = com.iab.omid.library.applovin.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f25183h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f25180e.add(strC);
                            this.f25176a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f25181f.add(strC);
                            this.f25178c.put(strC, viewE);
                            this.f25182g.put(strC, strA);
                        }
                    } else {
                        this.f25181f.add(strC);
                        this.f25182g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f25184i.remove(view);
            return Boolean.FALSE;
        }
        boolean zContainsKey = this.f25184i.containsKey(view);
        Map<View, Boolean> map = this.f25184i;
        if (zContainsKey) {
            return map.get(view);
        }
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f25182g.get(str);
    }

    public HashSet<String> c() {
        return this.f25180e;
    }

    public void d() {
        this.f25185j = true;
    }

    public boolean e(View view) {
        if (!this.f25184i.containsKey(view)) {
            return true;
        }
        this.f25184i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z10) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z10) {
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
        this.f25179d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f25181f;
    }

    public boolean c(String str) {
        return this.f25183h.contains(str);
    }

    public void a() {
        this.f25176a.clear();
        this.f25177b.clear();
        this.f25178c.clear();
        this.f25179d.clear();
        this.f25180e.clear();
        this.f25181f.clear();
        this.f25182g.clear();
        this.f25185j = false;
        this.f25183h.clear();
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0024a c0024a = this.f25177b.get(view);
        if (c0024a != null) {
            c0024a.a(aVar.c());
        } else {
            this.f25177b.put(view, new C0024a(eVar, aVar.c()));
        }
    }
}
