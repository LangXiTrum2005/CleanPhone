package com.iab.omid.library.chartboost.walking;

import android.view.View;
import com.iab.omid.library.chartboost.internal.e;
import com.iab.omid.library.chartboost.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f21902a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0228a> f21903b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f21904c = new HashMap<>();
    private final HashSet<View> d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f21905e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f21906h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f21907i = new WeakHashMap();
    private boolean j;

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.walking.a$a, reason: collision with other inner class name */
    public static class C0228a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f21908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f21909b = new ArrayList<>();

        public C0228a(e eVar, String str) {
            this.f21908a = eVar;
            a(str);
        }

        public e a() {
            return this.f21908a;
        }

        public ArrayList<String> b() {
            return this.f21909b;
        }

        public void a(String str) {
            this.f21909b.add(str);
        }
    }

    public View a(String str) {
        return this.f21904c.get(str);
    }

    public C0228a b(View view) {
        C0228a c0228a = this.f21903b.get(view);
        if (c0228a != null) {
            this.f21903b.remove(view);
        }
        return c0228a;
    }

    public String c(View view) {
        if (this.f21902a.size() == 0) {
            return null;
        }
        String str = this.f21902a.get(view);
        if (str != null) {
            this.f21902a.remove(view);
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
        com.iab.omid.library.chartboost.internal.c cVarC = com.iab.omid.library.chartboost.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.chartboost.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f21906h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f21905e.add(strC);
                            this.f21902a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f.add(strC);
                            this.f21904c.put(strC, viewE);
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
            this.f21907i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f21907i.containsKey(view)) {
            return this.f21907i.get(view);
        }
        Map<View, Boolean> map = this.f21907i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.g.get(str);
    }

    public HashSet<String> c() {
        return this.f21905e;
    }

    public void d() {
        this.j = true;
    }

    public boolean e(View view) {
        if (!this.f21907i.containsKey(view)) {
            return true;
        }
        this.f21907i.put(view, Boolean.TRUE);
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
        return this.f21906h.contains(str);
    }

    public void a() {
        this.f21902a.clear();
        this.f21903b.clear();
        this.f21904c.clear();
        this.d.clear();
        this.f21905e.clear();
        this.f.clear();
        this.g.clear();
        this.j = false;
        this.f21906h.clear();
    }

    private void a(com.iab.omid.library.chartboost.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.chartboost.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0228a c0228a = this.f21903b.get(view);
        if (c0228a != null) {
            c0228a.a(aVar.c());
        } else {
            this.f21903b.put(view, new C0228a(eVar, aVar.c()));
        }
    }
}
