package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3592k1 implements InterfaceC3732s1 {
    private final InterfaceC3646n1 a;
    private final A7 b;
    private final Fb<Integer, Integer> c;
    private final InterfaceC3667o4 d;
    private List<InterfaceC3682p1> e;

    public C3592k1(InterfaceC3646n1 eventBaseData, A7 eventsManager, Fb<Integer, Integer> eventsMapper, InterfaceC3667o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        Intrinsics.checkNotNullParameter(eventsManager, "eventsManager");
        Intrinsics.checkNotNullParameter(eventsMapper, "eventsMapper");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = eventBaseData;
        this.b = eventsManager;
        this.c = eventsMapper;
        this.d = currentTimeProvider;
        this.e = new ArrayList();
    }

    public final void a(List<InterfaceC3682p1> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.e = list;
    }

    public final List<InterfaceC3682p1> b() {
        return this.e;
    }

    private final JSONObject b(List<? extends InterfaceC3682p1> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC3682p1> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC3732s1
    public void a(int i, List<InterfaceC3682p1> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        try {
            Iterator<T> it = this.a.a().iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC3682p1) it.next());
            }
            Iterator<InterfaceC3682p1> it2 = this.e.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            this.b.a(new C3804w5(this.c.a(Integer.valueOf(i)).intValue(), this.d.a(), b(arrayList)));
        } catch (Exception e) {
            C3631m4.d().a(e);
            e.getMessage();
            System.out.getClass();
        }
    }

    public /* synthetic */ C3592k1(InterfaceC3646n1 interfaceC3646n1, A7 a7, Fb fb, InterfaceC3667o4 interfaceC3667o4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3646n1, a7, fb, (i & 8) != 0 ? new InterfaceC3667o4.a() : interfaceC3667o4);
    }

    @Override // com.ironsource.InterfaceC3732s1
    public void a() {
        this.e.clear();
    }

    @Override // com.ironsource.InterfaceC3732s1
    public void a(InterfaceC3682p1... analyticsEventEntity) {
        Intrinsics.checkNotNullParameter(analyticsEventEntity, "analyticsEventEntity");
        for (InterfaceC3682p1 interfaceC3682p1 : analyticsEventEntity) {
            this.e.add(interfaceC3682p1);
        }
    }
}
