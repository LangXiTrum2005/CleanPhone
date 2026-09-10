package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f21798a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0223a> f21799b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f21800c = new HashMap<>();
    private final HashSet<View> d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f21801e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f21802h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21803i;

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    public static class C0223a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f21804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f21805b = new ArrayList<>();

        public C0223a(e eVar, String str) {
            this.f21804a = eVar;
            a(str);
        }

        public e a() {
            return this.f21804a;
        }

        public ArrayList<String> b() {
            return this.f21805b;
        }

        public void a(String str) {
            this.f21805b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f21802h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f21802h.containsKey(view)) {
            return this.f21802h.get(view);
        }
        Map<View, Boolean> map = this.f21802h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f21800c.get(str);
    }

    public C0223a c(View view) {
        C0223a c0223a = this.f21799b.get(view);
        if (c0223a != null) {
            this.f21799b.remove(view);
        }
        return c0223a;
    }

    public String d(View view) {
        if (this.f21798a.size() == 0) {
            return null;
        }
        String str = this.f21798a.get(view);
        if (str != null) {
            this.f21798a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        if (this.d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f21803i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f21802h.containsKey(view)) {
            return true;
        }
        this.f21802h.put(view, Boolean.TRUE);
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
        return this.f21801e;
    }

    public void d() {
        this.f21803i = true;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c cVarC = com.iab.omid.library.bytedance2.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f21801e.add(adSessionId);
                            this.f21798a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f.add(adSessionId);
                            this.f21800c.put(adSessionId, viewC);
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
        this.f21798a.clear();
        this.f21799b.clear();
        this.f21800c.clear();
        this.d.clear();
        this.f21801e.clear();
        this.f.clear();
        this.g.clear();
        this.f21803i = false;
    }

    public HashSet<String> b() {
        return this.f;
    }

    private void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.bytedance2.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0223a c0223a = this.f21799b.get(view);
        if (c0223a != null) {
            c0223a.a(aVar.getAdSessionId());
        } else {
            this.f21799b.put(view, new C0223a(eVar, aVar.getAdSessionId()));
        }
    }
}
