package com.iab.omid.library.adcolony.walking;

import android.view.View;
import com.iab.omid.library.adcolony.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f21511a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0212a> f21512b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f21513c = new HashMap<>();
    private final HashSet<View> d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f21514e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f21515h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21516i;

    /* JADX INFO: renamed from: com.iab.omid.library.adcolony.walking.a$a, reason: collision with other inner class name */
    public static class C0212a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.adcolony.b.c f21517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f21518b = new ArrayList<>();

        public C0212a(com.iab.omid.library.adcolony.b.c cVar, String str) {
            this.f21517a = cVar;
            a(str);
        }

        public com.iab.omid.library.adcolony.b.c a() {
            return this.f21517a;
        }

        public ArrayList<String> b() {
            return this.f21518b;
        }

        public void a(String str) {
            this.f21518b.add(str);
        }
    }

    private String e(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strE = f.e(view);
            if (strE != null) {
                return strE;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.d.addAll(hashSet);
        return null;
    }

    private Boolean f(View view) {
        if (view.hasWindowFocus()) {
            this.f21515h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f21515h.containsKey(view)) {
            return this.f21515h.get(view);
        }
        Map<View, Boolean> map = this.f21515h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String a(View view) {
        if (this.f21511a.size() == 0) {
            return null;
        }
        String str = this.f21511a.get(view);
        if (str != null) {
            this.f21511a.remove(view);
        }
        return str;
    }

    public View b(String str) {
        return this.f21513c.get(str);
    }

    public c c(View view) {
        if (this.d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f21516i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f21511a.clear();
        this.f21512b.clear();
        this.f21513c.clear();
        this.d.clear();
        this.f21514e.clear();
        this.f.clear();
        this.g.clear();
        this.f21516i = false;
    }

    public String a(String str) {
        return this.g.get(str);
    }

    public C0212a b(View view) {
        C0212a c0212a = this.f21512b.get(view);
        if (c0212a != null) {
            this.f21512b.remove(view);
        }
        return c0212a;
    }

    public void c() {
        com.iab.omid.library.adcolony.b.a aVarA = com.iab.omid.library.adcolony.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.adcolony.adsession.a aVar : aVarA.c()) {
                View viewE = aVar.e();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewE != null) {
                        String strE = e(viewE);
                        if (strE == null) {
                            this.f21514e.add(adSessionId);
                            this.f21511a.put(viewE, adSessionId);
                            a(aVar);
                        } else if (strE != "noWindowFocus") {
                            this.f.add(adSessionId);
                            this.f21513c.put(adSessionId, viewE);
                            this.g.put(adSessionId, strE);
                        }
                    } else {
                        this.f.add(adSessionId);
                        this.g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean d(View view) {
        if (!this.f21515h.containsKey(view)) {
            return true;
        }
        this.f21515h.put(view, Boolean.TRUE);
        return false;
    }

    public void e() {
        this.f21516i = true;
    }

    public HashSet<String> a() {
        return this.f21514e;
    }

    public HashSet<String> b() {
        return this.f;
    }

    private void a(com.iab.omid.library.adcolony.adsession.a aVar) {
        Iterator<com.iab.omid.library.adcolony.b.c> it = aVar.a().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.adcolony.b.c cVar, com.iab.omid.library.adcolony.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0212a c0212a = this.f21512b.get(view);
        if (c0212a != null) {
            c0212a.a(aVar.getAdSessionId());
        } else {
            this.f21512b.put(view, new C0212a(cVar, aVar.getAdSessionId()));
        }
    }
}
