package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.util.Pools;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3789jY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HP f4557a;
    public final C5036xh b;
    public final C3692iN c;
    public final C5036xh d;
    public final C4165nl e;
    public final C5036xh f;
    public final H4 g;
    public final C3692iN h = new C3692iN(15);
    public final II i = new II();
    public final C2296At j;

    public C3789jY() {
        C2296At c2296At = new C2296At(new Pools.SynchronizedPool(20), new C5056xt(), new C5144yt());
        this.j = c2296At;
        this.f4557a = new HP(c2296At);
        this.b = new C5036xh(2);
        this.c = new C3692iN(16);
        this.d = new C5036xh(3);
        this.e = new C4165nl();
        this.f = new C5036xh(1);
        this.g = new H4();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C3692iN c3692iN = this.c;
        synchronized (c3692iN) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((List) c3692iN.b);
                ((List) c3692iN.b).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((List) c3692iN.b).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((List) c3692iN.b).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(InterfaceC3966lZ interfaceC3966lZ, Class cls, Class cls2, String str) {
        C3692iN c3692iN = this.c;
        synchronized (c3692iN) {
            c3692iN.C(str).add(new C4054mZ(cls, cls2, interfaceC3966lZ));
        }
    }

    public final void b(Class cls, InterfaceC3473fr interfaceC3473fr) {
        C5036xh c5036xh = this.b;
        synchronized (c5036xh) {
            c5036xh.f5240a.add(new C3649hr(cls, interfaceC3473fr));
        }
    }

    public final void c(Class cls, InterfaceC4230oZ interfaceC4230oZ) {
        C5036xh c5036xh = this.d;
        synchronized (c5036xh) {
            c5036xh.f5240a.add(new C4318pZ(cls, interfaceC4230oZ));
        }
    }

    public final void d(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
        HP hp = this.f4557a;
        synchronized (hp) {
            hp.f3171a.a(cls, cls2, modelLoaderFactory);
            hp.b.f4758a.clear();
        }
    }

    public final ArrayList e(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Class cls4 : this.c.F(cls, cls2)) {
            for (Class cls5 : this.f.i(cls4, cls3)) {
                C3692iN c3692iN = this.c;
                synchronized (c3692iN) {
                    arrayList = new ArrayList();
                    Iterator it = ((List) c3692iN.b).iterator();
                    while (it.hasNext()) {
                        List<C4054mZ> list = (List) ((Map) c3692iN.c).get((String) it.next());
                        if (list != null) {
                            for (C4054mZ c4054mZ : list) {
                                if (c4054mZ.f4699a.isAssignableFrom(cls) && cls4.isAssignableFrom(c4054mZ.b)) {
                                    arrayList.add(c4054mZ.c);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new C2522Jl(cls, cls4, cls5, arrayList, this.f.g(cls4, cls5), this.j));
            }
        }
        return arrayList2;
    }

    public final List f() {
        List list;
        H4 h4 = this.g;
        synchronized (h4) {
            list = h4.f3152a;
        }
        if (list.isEmpty()) {
            throw new C3703iY("Failed to find image header parser.");
        }
        return list;
    }

    public final List g(Object obj) {
        List listUnmodifiableList;
        HP hp = this.f4557a;
        hp.getClass();
        Class<?> cls = obj.getClass();
        synchronized (hp) {
            GP gp = (GP) hp.b.f4758a.get(cls);
            listUnmodifiableList = gp == null ? null : gp.f3121a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(hp.f3171a.d(cls));
                if (((GP) hp.b.f4758a.put(cls, new GP(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new C3703iY("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            FP fp = (FP) listUnmodifiableList.get(i);
            if (fp.a(obj)) {
                if (z) {
                    listEmptyList = new ArrayList(size - i);
                    z = false;
                }
                listEmptyList.add(fp);
            }
        }
        if (!listEmptyList.isEmpty()) {
            return listEmptyList;
        }
        throw new C3703iY("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final InterfaceC3989ll h(Object obj) {
        InterfaceC3989ll interfaceC3989llB;
        C4165nl c4165nl = this.e;
        synchronized (c4165nl) {
            try {
                AbstractC2871Wx.U(obj);
                InterfaceC3901kl interfaceC3901kl = (InterfaceC3901kl) c4165nl.f4758a.get(obj.getClass());
                if (interfaceC3901kl == null) {
                    for (InterfaceC3901kl interfaceC3901kl2 : c4165nl.f4758a.values()) {
                        if (interfaceC3901kl2.a().isAssignableFrom(obj.getClass())) {
                            interfaceC3901kl = interfaceC3901kl2;
                            break;
                        }
                    }
                }
                if (interfaceC3901kl == null) {
                    interfaceC3901kl = C4165nl.b;
                }
                interfaceC3989llB = interfaceC3901kl.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC3989llB;
    }

    public final void i(InterfaceC3901kl interfaceC3901kl) {
        C4165nl c4165nl = this.e;
        synchronized (c4165nl) {
            c4165nl.f4758a.put(interfaceC3901kl.a(), interfaceC3901kl);
        }
    }

    public final void j(InterfaceC3943lC interfaceC3943lC) {
        H4 h4 = this.g;
        synchronized (h4) {
            h4.f3152a.add(interfaceC3943lC);
        }
    }

    public final void k(Class cls, Class cls2, InterfaceC4669tZ interfaceC4669tZ) {
        C5036xh c5036xh = this.f;
        synchronized (c5036xh) {
            c5036xh.f5240a.add(new Ad0(cls, cls2, interfaceC4669tZ));
        }
    }
}
