package com.p004ironsource.mediationsdk.demandOnly;

import com.p004ironsource.m5;
import com.p004ironsource.mediationsdk.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\bf\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/a;", "", "", "b", "", "isEmpty", "instanceName", "Lcom/ironsource/m5;", "a", "", "index", "get", "", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface a {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/a$a;", "Lcom/ironsource/mediationsdk/demandOnly/a;", "", "b", "", "isEmpty", "instanceName", "Lcom/ironsource/m5;", "a", "", "index", "get", "", "Ljava/util/List;", d.f25770h, "<init>", "(Ljava/util/List;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class C0287a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<m5> waterfall;

        public C0287a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.a
        public m5 a(String instanceName) {
            Object next;
            Intrinsics.f(instanceName, "instanceName");
            Iterator<T> it = this.waterfall.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.a(((m5) next).c(), instanceName)) {
                    return (m5) next;
                }
            }
            next = null;
            return (m5) next;
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.a
        public String b() {
            if (this.waterfall.isEmpty()) {
                return "";
            }
            return "1" + ((m5) CollectionsKt.w(this.waterfall)).c();
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.a
        public m5 get(int index) {
            if (index < 0 || index >= this.waterfall.size()) {
                return null;
            }
            return this.waterfall.get(index);
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.waterfall.isEmpty();
        }

        public C0287a(List<m5> waterfall) {
            Intrinsics.f(waterfall, "waterfall");
            this.waterfall = waterfall;
        }

        @Override // com.p004ironsource.mediationsdk.demandOnly.a
        public List<m5> a() {
            return this.waterfall;
        }

        public /* synthetic */ C0287a(List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new ArrayList() : list);
        }
    }

    m5 a(String instanceName);

    List<m5> a();

    String b();

    m5 get(int index);

    boolean isEmpty();
}
