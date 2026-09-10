package com.iab.omid.library.vungle.walking;

import android.view.View;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f22598a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0257a> f22599b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f22600c = new HashMap<>();
    private final HashSet<View> d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f22601e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f22602h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f22603i = new WeakHashMap();
    private boolean j;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.a$a, reason: collision with other inner class name */
    public static class C0257a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f22604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f22605b = new ArrayList<>();

        public C0257a(e eVar, String str) {
            this.f22604a = eVar;
            a(str);
        }

        public e a() {
            return this.f22604a;
        }

        public ArrayList<String> b() {
            return this.f22605b;
        }

        public void a(String str) {
            this.f22605b.add(str);
        }
    }

    public View a(String str) {
        return this.f22600c.get(str);
    }

    public C0257a b(View view) {
        C0257a c0257a = this.f22599b.get(view);
        if (c0257a != null) {
            this.f22599b.remove(view);
        }
        return c0257a;
    }

    public String c(View view) {
        if (this.f22598a.size() == 0) {
            return null;
        }
        String str = this.f22598a.get(view);
        if (str != null) {
            this.f22598a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        if (this.d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.vungle.internal.c cVarC = com.iab.omid.library.vungle.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f22602h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f22601e.add(strC);
                            this.f22598a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f.add(strC);
                            this.f22600c.put(strC, viewE);
                            this.g.put(strC, strA);
                        }
                    } else {
                        this.f.add(strC);
                        this.g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f22603i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f22603i.containsKey(view)) {
            return this.f22603i.get(view);
        }
        Map<View, Boolean> map = this.f22603i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.g.get(str);
    }

    public HashSet<String> c() {
        return this.f22601e;
    }

    public void d() {
        this.j = true;
    }

    public boolean e(View view) {
        if (!this.f22603i.containsKey(view)) {
            return true;
        }
        this.f22603i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z2) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z2) {
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

    public HashSet<String> b() {
        return this.f;
    }

    public boolean c(String str) {
        return this.f22602h.contains(str);
    }

    public void a() {
        this.f22598a.clear();
        this.f22599b.clear();
        this.f22600c.clear();
        this.d.clear();
        this.f22601e.clear();
        this.f.clear();
        this.g.clear();
        this.j = false;
        this.f22602h.clear();
    }

    private void a(com.iab.omid.library.vungle.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.vungle.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0257a c0257a = this.f22599b.get(view);
        if (c0257a != null) {
            c0257a.a(aVar.c());
        } else {
            this.f22599b.put(view, new C0257a(eVar, aVar.c()));
        }
    }
}
