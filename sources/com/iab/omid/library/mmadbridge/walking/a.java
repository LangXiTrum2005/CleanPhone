package com.iab.omid.library.mmadbridge.walking;

import android.view.View;
import com.iab.omid.library.mmadbridge.internal.e;
import com.iab.omid.library.mmadbridge.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f25444a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0032a> f25445b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f25446c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f25447d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f25448e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f25449f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f25450g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f25451h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f25452i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25453j;

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.a$a, reason: collision with other inner class name */
    public static class C0032a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f25454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f25455b = new ArrayList<>();

        public C0032a(e eVar, String str) {
            this.f25454a = eVar;
            a(str);
        }

        public e a() {
            return this.f25454a;
        }

        public ArrayList<String> b() {
            return this.f25455b;
        }

        public void a(String str) {
            this.f25455b.add(str);
        }
    }

    public View a(String str) {
        return this.f25446c.get(str);
    }

    public C0032a b(View view) {
        C0032a c0032a = this.f25445b.get(view);
        if (c0032a != null) {
            this.f25445b.remove(view);
        }
        return c0032a;
    }

    public String c(View view) {
        if (this.f25444a.size() == 0) {
            return null;
        }
        String str = this.f25444a.get(view);
        if (str != null) {
            this.f25444a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        if (this.f25447d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f25453j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.mmadbridge.internal.c cVarC = com.iab.omid.library.mmadbridge.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.mmadbridge.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f25451h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f25448e.add(adSessionId);
                            this.f25444a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f25449f.add(adSessionId);
                            this.f25446c.put(adSessionId, viewC);
                            this.f25450g.put(adSessionId, strA);
                        }
                    } else {
                        this.f25449f.add(adSessionId);
                        this.f25450g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f25452i.remove(view);
            return Boolean.FALSE;
        }
        boolean zContainsKey = this.f25452i.containsKey(view);
        Map<View, Boolean> map = this.f25452i;
        if (zContainsKey) {
            return map.get(view);
        }
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f25450g.get(str);
    }

    public HashSet<String> c() {
        return this.f25448e;
    }

    public void d() {
        this.f25453j = true;
    }

    public boolean e(View view) {
        if (!this.f25452i.containsKey(view)) {
            return true;
        }
        this.f25452i.put(view, Boolean.TRUE);
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
        this.f25447d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f25449f;
    }

    public boolean c(String str) {
        return this.f25451h.contains(str);
    }

    public void a() {
        this.f25444a.clear();
        this.f25445b.clear();
        this.f25446c.clear();
        this.f25447d.clear();
        this.f25448e.clear();
        this.f25449f.clear();
        this.f25450g.clear();
        this.f25453j = false;
        this.f25451h.clear();
    }

    private void a(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.mmadbridge.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0032a c0032a = this.f25445b.get(view);
        if (c0032a != null) {
            c0032a.a(aVar.getAdSessionId());
        } else {
            this.f25445b.put(view, new C0032a(eVar, aVar.getAdSessionId()));
        }
    }
}
