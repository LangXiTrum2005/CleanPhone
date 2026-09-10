package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f25310a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0028a> f25311b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f25312c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f25313d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f25314e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f25315f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f25316g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f25317h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f25318i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25319j;

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.a$a, reason: collision with other inner class name */
    public static class C0028a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f25320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f25321b = new ArrayList<>();

        public C0028a(e eVar, String str) {
            this.f25320a = eVar;
            a(str);
        }

        public e a() {
            return this.f25320a;
        }

        public ArrayList<String> b() {
            return this.f25321b;
        }

        public void a(String str) {
            this.f25321b.add(str);
        }
    }

    public View a(String str) {
        return this.f25312c.get(str);
    }

    public C0028a b(View view) {
        C0028a c0028a = this.f25311b.get(view);
        if (c0028a != null) {
            this.f25311b.remove(view);
        }
        return c0028a;
    }

    public String c(View view) {
        if (this.f25310a.size() == 0) {
            return null;
        }
        String str = this.f25310a.get(view);
        if (str != null) {
            this.f25310a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        if (this.f25313d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f25319j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.ironsrc.internal.c cVarC = com.iab.omid.library.ironsrc.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f25317h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f25314e.add(adSessionId);
                            this.f25310a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f25315f.add(adSessionId);
                            this.f25312c.put(adSessionId, viewC);
                            this.f25316g.put(adSessionId, strA);
                        }
                    } else {
                        this.f25315f.add(adSessionId);
                        this.f25316g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f25318i.remove(view);
            return Boolean.FALSE;
        }
        boolean zContainsKey = this.f25318i.containsKey(view);
        Map<View, Boolean> map = this.f25318i;
        if (zContainsKey) {
            return map.get(view);
        }
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f25316g.get(str);
    }

    public HashSet<String> c() {
        return this.f25314e;
    }

    public void d() {
        this.f25319j = true;
    }

    public boolean e(View view) {
        if (!this.f25318i.containsKey(view)) {
            return true;
        }
        this.f25318i.put(view, Boolean.TRUE);
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
        this.f25313d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f25315f;
    }

    public boolean c(String str) {
        return this.f25317h.contains(str);
    }

    public void a() {
        this.f25310a.clear();
        this.f25311b.clear();
        this.f25312c.clear();
        this.f25313d.clear();
        this.f25314e.clear();
        this.f25315f.clear();
        this.f25316g.clear();
        this.f25319j = false;
        this.f25317h.clear();
    }

    private void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.ironsrc.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0028a c0028a = this.f25311b.get(view);
        if (c0028a != null) {
            c0028a.a(aVar.getAdSessionId());
        } else {
            this.f25311b.put(view, new C0028a(eVar, aVar.getAdSessionId()));
        }
    }
}
