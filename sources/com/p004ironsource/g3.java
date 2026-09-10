package com.p004ironsource;

import com.applovin.impl.Z;
import com.google.firebase.crashlytics.internal.model.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0017\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\"\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0016J#\u0010\r\u001a\u00020\f2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u000e\"\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u0010J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0006\u0010!\"\u0004\b\r\u0010\"¨\u0006&"}, d2 = {"Lcom/ironsource/g3;", "Lcom/ironsource/o3;", "", "Lcom/ironsource/l3;", "list", "Lorg/json/JSONObject;", "b", "", "Lcom/unity3d/ironsourceads/internal/analytics/EventCode;", "code", "", "arrayList", "", "a", "", "analyticsEventEntity", "([Lcom/ironsource/l3;)V", "Lcom/ironsource/j3;", "Lcom/ironsource/j3;", "eventBaseData", "Lcom/ironsource/zf;", "Lcom/ironsource/zf;", "eventsManager", "Lcom/ironsource/nn;", "c", "Lcom/ironsource/nn;", "eventsMapper", "Lcom/ironsource/s9;", "d", "Lcom/ironsource/s9;", "currentTimeProvider", "e", "Ljava/util/List;", "()Ljava/util/List;", "(Ljava/util/List;)V", "additionalData", "<init>", "(Lcom/ironsource/j3;Lcom/ironsource/zf;Lcom/ironsource/nn;Lcom/ironsource/s9;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class g3 implements o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j3 eventBaseData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zf eventsManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final nn<Integer, Integer> eventsMapper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final s9 currentTimeProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<l3> additionalData;

    public g3(j3 eventBaseData, zf eventsManager, nn<Integer, Integer> eventsMapper, s9 currentTimeProvider) {
        Intrinsics.f(eventBaseData, "eventBaseData");
        Intrinsics.f(eventsManager, "eventsManager");
        Intrinsics.f(eventsMapper, "eventsMapper");
        Intrinsics.f(currentTimeProvider, "currentTimeProvider");
        this.eventBaseData = eventBaseData;
        this.eventsManager = eventsManager;
        this.eventsMapper = eventsMapper;
        this.currentTimeProvider = currentTimeProvider;
        this.additionalData = new ArrayList();
    }

    @Override // com.p004ironsource.o3
    public void a() {
        this.additionalData.clear();
    }

    public final List<l3> b() {
        return this.additionalData;
    }

    public /* synthetic */ g3(j3 j3Var, zf zfVar, nn nnVar, s9 s9Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j3Var, zfVar, nnVar, (i2 & 8) != 0 ? new s9.a() : s9Var);
    }

    private final JSONObject b(List<? extends l3> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends l3> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.p004ironsource.o3
    public void a(int code, List<l3> arrayList) {
        Intrinsics.f(arrayList, "arrayList");
        try {
            Iterator<T> it = this.eventBaseData.a().iterator();
            while (it.hasNext()) {
                arrayList.add((l3) it.next());
            }
            Iterator<l3> it2 = this.additionalData.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            this.eventsManager.a(new zb(this.eventsMapper.a(Integer.valueOf(code)).intValue(), this.currentTimeProvider.a(), b(arrayList)));
        } catch (Exception e2) {
            System.out.println((Object) Z.m(e2, a.o(e2, "LogRemote | Exception: ")));
        }
    }

    public final void a(List<l3> list) {
        Intrinsics.f(list, "<set-?>");
        this.additionalData = list;
    }

    @Override // com.p004ironsource.o3
    public void a(l3... analyticsEventEntity) {
        Intrinsics.f(analyticsEventEntity, "analyticsEventEntity");
        for (l3 l3Var : analyticsEventEntity) {
            this.additionalData.add(l3Var);
        }
    }
}
