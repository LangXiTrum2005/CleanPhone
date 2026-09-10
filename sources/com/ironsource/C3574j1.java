package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3574j1 implements InterfaceC3481df<JSONArray> {
    private final List<C3557i1> a = new ArrayList();

    /* JADX INFO: renamed from: com.ironsource.j1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC3463cf.values().length];
            try {
                iArr[EnumC3463cf.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3463cf.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC3455c7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(EnumC3463cf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = a.a[mode.ordinal()];
        if (i == 1) {
            List<C3557i1> listB = b();
            ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3557i1) it.next()).d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List<C3557i1> listA = a();
        ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(listA, 10));
        Iterator<T> it2 = listA.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C3557i1) it2.next()).c());
        }
        return new JSONArray((Collection) arrayList2);
    }

    public final void a(C3557i1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.add(event);
    }

    private final List<C3557i1> a() {
        List<C3557i1> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C3557i1 c3557i1 = (C3557i1) obj;
            if (c3557i1.e() != EnumC3427af.LoadSuccess && c3557i1.e() != EnumC3427af.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C3557i1) it.next()).a());
        }
        Set setPrefect = CollectionsKt.prefect(arrayList2);
        List<C3557i1> list2 = this.a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            C3557i1 c3557i2 = (C3557i1) obj2;
            if (c3557i2.e() == EnumC3427af.LoadSuccess && !setPrefect.contains(c3557i2.a())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    private final List<C3557i1> b() {
        List<C3557i1> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C3557i1) obj).e() != EnumC3427af.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
