package com.iab.omid.library.startio.walking;

import android.view.View;
import com.iab.omid.library.startio.internal.e;
import com.iab.omid.library.startio.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f22299a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0244a> f22300b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f22301c = new HashMap<>();
    private final HashSet<View> d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f22302e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f22303h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22304i;

    /* JADX INFO: renamed from: com.iab.omid.library.startio.walking.a$a, reason: collision with other inner class name */
    public static class C0244a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f22305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f22306b = new ArrayList<>();

        public C0244a(e eVar, String str) {
            this.f22305a = eVar;
            a(str);
        }

        public e a() {
            return this.f22305a;
        }

        public ArrayList<String> b() {
            return this.f22306b;
        }

        public void a(String str) {
            this.f22306b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f22303h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f22303h.containsKey(view)) {
            return this.f22303h.get(view);
        }
        Map<View, Boolean> map = this.f22303h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f22301c.get(str);
    }

    public C0244a c(View view) {
        C0244a c0244a = this.f22300b.get(view);
        if (c0244a != null) {
            this.f22300b.remove(view);
        }
        return c0244a;
    }

    public String d(View view) {
        if (this.f22299a.size() == 0) {
            return null;
        }
        String str = this.f22299a.get(view);
        if (str != null) {
            this.f22299a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        if (this.d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f22304i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f22303h.containsKey(view)) {
            return true;
        }
        this.f22303h.put(view, Boolean.TRUE);
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
        this.d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.g.get(str);
    }

    public HashSet<String> c() {
        return this.f22302e;
    }

    public void d() {
        this.f22304i = true;
    }

    public void e() {
        com.iab.omid.library.startio.internal.c cVarC = com.iab.omid.library.startio.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.startio.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f22302e.add(adSessionId);
                            this.f22299a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f.add(adSessionId);
                            this.f22301c.put(adSessionId, viewC);
                            this.g.put(adSessionId, strA);
                        }
                    } else {
                        this.f.add(adSessionId);
                        this.g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f22299a.clear();
        this.f22300b.clear();
        this.f22301c.clear();
        this.d.clear();
        this.f22302e.clear();
        this.f.clear();
        this.g.clear();
        this.f22304i = false;
    }

    public HashSet<String> b() {
        return this.f;
    }

    private void a(com.iab.omid.library.startio.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.startio.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0244a c0244a = this.f22300b.get(view);
        if (c0244a != null) {
            c0244a.a(aVar.getAdSessionId());
        } else {
            this.f22300b.put(view, new C0244a(eVar, aVar.getAdSessionId()));
        }
    }
}
