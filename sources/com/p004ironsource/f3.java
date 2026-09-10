package com.p004ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u000e\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ironsource/f3;", "Lcom/ironsource/ku;", "Lorg/json/JSONArray;", "", "Lcom/ironsource/e3;", "b", "a", "event", "", "Lcom/ironsource/ju;", d9.a.t, "", "Ljava/util/List;", "records", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class f3 implements ku<JSONArray> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<e3> records = new ArrayList();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24965a;

        static {
            int[] iArr = new int[ju.values().length];
            try {
                iArr[ju.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ju.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24965a = iArr;
        }
    }

    private final List<e3> b() {
        List<e3> list = this.records;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((e3) obj).getRecordType() != hu.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<e3> a() {
        List<e3> list = this.records;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            e3 e3Var = (e3) obj;
            if (e3Var.getRecordType() != hu.LoadSuccess && e3Var.getRecordType() != hu.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((e3) it.next()).getAdInstanceId());
        }
        Set setL0 = CollectionsKt.l0(arrayList2);
        List<e3> list2 = this.records;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            e3 e3Var2 = (e3) obj2;
            if (e3Var2.getRecordType() == hu.LoadSuccess && !setL0.contains(e3Var2.getAdInstanceId())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    @Override // com.p004ironsource.ef
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(ju mode) {
        Intrinsics.f(mode, "mode");
        int i2 = a.f24965a[mode.ordinal()];
        if (i2 == 1) {
            List<e3> listB = b();
            ArrayList arrayList = new ArrayList(CollectionsKt.n(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((e3) it.next()).d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List<e3> listA = a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(listA, 10));
        Iterator<T> it2 = listA.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((e3) it2.next()).c());
        }
        return new JSONArray((Collection) arrayList2);
    }

    public final void a(e3 event) {
        Intrinsics.f(event, "event");
        this.records.add(event);
    }
}
