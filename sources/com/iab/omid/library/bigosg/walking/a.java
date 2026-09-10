package com.iab.omid.library.bigosg.walking;

import android.view.View;
import com.iab.omid.library.bigosg.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f21703a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0219a> f21704b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f21705c = new HashMap<>();
    private final HashSet<View> d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f21706e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21707h;

    /* JADX INFO: renamed from: com.iab.omid.library.bigosg.walking.a$a, reason: collision with other inner class name */
    public static class C0219a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.bigosg.b.c f21708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f21709b = new ArrayList<>();

        public C0219a(com.iab.omid.library.bigosg.b.c cVar, String str) {
            this.f21708a = cVar;
            a(str);
        }

        public com.iab.omid.library.bigosg.b.c a() {
            return this.f21708a;
        }

        public ArrayList<String> b() {
            return this.f21709b;
        }

        public void a(String str) {
            this.f21709b.add(str);
        }
    }

    private String d(View view) {
        if (!view.hasWindowFocus()) {
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

    public String a(View view) {
        if (this.f21703a.size() == 0) {
            return null;
        }
        String str = this.f21703a.get(view);
        if (str != null) {
            this.f21703a.remove(view);
        }
        return str;
    }

    public View b(String str) {
        return this.f21705c.get(str);
    }

    public c c(View view) {
        if (this.d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f21707h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        this.f21707h = true;
    }

    public String a(String str) {
        return this.g.get(str);
    }

    public C0219a b(View view) {
        C0219a c0219a = this.f21704b.get(view);
        if (c0219a != null) {
            this.f21704b.remove(view);
        }
        return c0219a;
    }

    public void c() {
        com.iab.omid.library.bigosg.b.a aVarA = com.iab.omid.library.bigosg.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.bigosg.adsession.a aVar : aVarA.c()) {
                View viewD = aVar.d();
                if (aVar.e()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewD != null) {
                        String strD = d(viewD);
                        if (strD == null) {
                            this.f21706e.add(adSessionId);
                            this.f21703a.put(viewD, adSessionId);
                            a(aVar);
                        } else {
                            this.f.add(adSessionId);
                            this.f21705c.put(adSessionId, viewD);
                            this.g.put(adSessionId, strD);
                        }
                    } else {
                        this.f.add(adSessionId);
                        this.g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f21703a.clear();
        this.f21704b.clear();
        this.f21705c.clear();
        this.d.clear();
        this.f21706e.clear();
        this.f.clear();
        this.g.clear();
        this.f21707h = false;
    }

    public HashSet<String> a() {
        return this.f21706e;
    }

    public HashSet<String> b() {
        return this.f;
    }

    private void a(com.iab.omid.library.bigosg.adsession.a aVar) {
        Iterator<com.iab.omid.library.bigosg.b.c> it = aVar.a().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.bigosg.b.c cVar, com.iab.omid.library.bigosg.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0219a c0219a = this.f21704b.get(view);
        if (c0219a != null) {
            c0219a.a(aVar.getAdSessionId());
        } else {
            this.f21704b.put(view, new C0219a(cVar, aVar.getAdSessionId()));
        }
    }
}
