package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0417k1 implements InterfaceC0560s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0471n1 f29016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7 f29017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Jb<Integer, Integer> f29018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0510p4 f29019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<InterfaceC0507p1> f29020e;

    public C0417k1(InterfaceC0471n1 eventBaseData, C7 eventsManager, Jb<Integer, Integer> eventsMapper, InterfaceC0510p4 currentTimeProvider) {
        kotlin.jvm.internal.n.f(eventBaseData, "eventBaseData");
        kotlin.jvm.internal.n.f(eventsManager, "eventsManager");
        kotlin.jvm.internal.n.f(eventsMapper, "eventsMapper");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        this.f29016a = eventBaseData;
        this.f29017b = eventsManager;
        this.f29018c = eventsMapper;
        this.f29019d = currentTimeProvider;
        this.f29020e = new ArrayList();
    }

    public final void a(List<InterfaceC0507p1> list) {
        kotlin.jvm.internal.n.f(list, "<set-?>");
        this.f29020e = list;
    }

    public final List<InterfaceC0507p1> b() {
        return this.f29020e;
    }

    private final JSONObject b(List<? extends InterfaceC0507p1> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC0507p1> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC0560s1
    public void a(int i10, List<InterfaceC0507p1> arrayList) {
        kotlin.jvm.internal.n.f(arrayList, "arrayList");
        try {
            Iterator<T> it = this.f29016a.a().iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC0507p1) it.next());
            }
            Iterator<InterfaceC0507p1> it2 = this.f29020e.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            this.f29017b.a(new C0654x5(this.f29018c.a(Integer.valueOf(i10)).intValue(), this.f29019d.a(), b(arrayList)));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            System.out.println((Object) defpackage.e.n("LogRemote | Exception: ", e10.getMessage()));
        }
    }

    public /* synthetic */ C0417k1(InterfaceC0471n1 interfaceC0471n1, C7 c10, Jb jb2, InterfaceC0510p4 interfaceC0510p4, int i10, kotlin.jvm.internal.g gVar) {
        this(interfaceC0471n1, c10, jb2, (i10 & 8) != 0 ? new InterfaceC0510p4.a() : interfaceC0510p4);
    }

    @Override // com.ironsource.InterfaceC0560s1
    public void a() {
        this.f29020e.clear();
    }

    @Override // com.ironsource.InterfaceC0560s1
    public void a(InterfaceC0507p1... analyticsEventEntity) {
        kotlin.jvm.internal.n.f(analyticsEventEntity, "analyticsEventEntity");
        for (InterfaceC0507p1 interfaceC0507p1 : analyticsEventEntity) {
            this.f29020e.add(interfaceC0507p1);
        }
    }
}
