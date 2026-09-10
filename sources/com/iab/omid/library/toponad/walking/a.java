package com.iab.omid.library.toponad.walking;

import android.view.View;
import com.iab.omid.library.toponad.internal.e;
import com.iab.omid.library.toponad.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f22399a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0248a> f22400b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f22401c = new HashMap<>();
    private final HashSet<View> d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f22402e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f22403h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f22404i = new WeakHashMap();
    private boolean j;

    /* JADX INFO: renamed from: com.iab.omid.library.toponad.walking.a$a, reason: collision with other inner class name */
    public static class C0248a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f22405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f22406b = new ArrayList<>();

        public C0248a(e eVar, String str) {
            this.f22405a = eVar;
            a(str);
        }

        public e a() {
            return this.f22405a;
        }

        public ArrayList<String> b() {
            return this.f22406b;
        }

        public void a(String str) {
            this.f22406b.add(str);
        }
    }

    public View a(String str) {
        return this.f22401c.get(str);
    }

    public C0248a b(View view) {
        C0248a c0248a = this.f22400b.get(view);
        if (c0248a != null) {
            this.f22400b.remove(view);
        }
        return c0248a;
    }

    public String c(View view) {
        if (this.f22399a.size() == 0) {
            return null;
        }
        String str = this.f22399a.get(view);
        if (str != null) {
            this.f22399a.remove(view);
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
        com.iab.omid.library.toponad.internal.c cVarC = com.iab.omid.library.toponad.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.toponad.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f22403h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f22402e.add(adSessionId);
                            this.f22399a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f.add(adSessionId);
                            this.f22401c.put(adSessionId, viewC);
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

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f22404i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f22404i.containsKey(view)) {
            return this.f22404i.get(view);
        }
        Map<View, Boolean> map = this.f22404i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.g.get(str);
    }

    public HashSet<String> c() {
        return this.f22402e;
    }

    public void d() {
        this.j = true;
    }

    public boolean e(View view) {
        if (!this.f22404i.containsKey(view)) {
            return true;
        }
        this.f22404i.put(view, Boolean.TRUE);
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
        return this.f22403h.contains(str);
    }

    public void a() {
        this.f22399a.clear();
        this.f22400b.clear();
        this.f22401c.clear();
        this.d.clear();
        this.f22402e.clear();
        this.f.clear();
        this.g.clear();
        this.j = false;
        this.f22403h.clear();
    }

    private void a(com.iab.omid.library.toponad.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.toponad.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0248a c0248a = this.f22400b.get(view);
        if (c0248a != null) {
            c0248a.a(aVar.getAdSessionId());
        } else {
            this.f22400b.put(view, new C0248a(eVar, aVar.getAdSessionId()));
        }
    }
}
