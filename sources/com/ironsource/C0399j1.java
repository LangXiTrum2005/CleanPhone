package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0399j1 implements InterfaceC0539qf<JSONArray> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<C0382i1> f28919a = new ArrayList();

    /* JADX INFO: renamed from: com.ironsource.j1$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28920a;

        static {
            int[] iArr = new int[EnumC0521pf.values().length];
            try {
                iArr[EnumC0521pf.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0521pf.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28920a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC0316e7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(EnumC0521pf mode) {
        kotlin.jvm.internal.n.f(mode, "mode");
        int i10 = a.f28920a[mode.ordinal()];
        if (i10 == 1) {
            List<C0382i1> listB = b();
            ArrayList arrayList = new ArrayList(xj.p.W(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0382i1) it.next()).d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i10 != 2) {
            throw new aa.b((byte) 0, 20);
        }
        List<C0382i1> listA = a();
        ArrayList arrayList2 = new ArrayList(xj.p.W(listA, 10));
        Iterator<T> it2 = listA.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C0382i1) it2.next()).c());
        }
        return new JSONArray((Collection) arrayList2);
    }

    public final void a(C0382i1 event) {
        kotlin.jvm.internal.n.f(event, "event");
        this.f28919a.add(event);
    }

    private final List<C0382i1> a() {
        List<C0382i1> list = this.f28919a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C0382i1 c0382i1 = (C0382i1) obj;
            if (c0382i1.e() != EnumC0485nf.LoadSuccess && c0382i1.e() != EnumC0485nf.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(xj.p.W(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0382i1) it.next()).a());
        }
        Set setR0 = xj.n.R0(arrayList2);
        List<C0382i1> list2 = this.f28919a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            C0382i1 c0382i2 = (C0382i1) obj2;
            if (c0382i2.e() == EnumC0485nf.LoadSuccess && !setR0.contains(c0382i2.a())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    private final List<C0382i1> b() {
        List<C0382i1> list = this.f28919a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C0382i1) obj).e() != EnumC0485nf.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
