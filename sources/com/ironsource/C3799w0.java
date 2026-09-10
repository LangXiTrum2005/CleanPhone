package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3799w0 {
    private final String a;
    private final List<NetworkSettings> b;
    private final C3583ja c;

    /* JADX WARN: Multi-variable type inference failed */
    public C3799w0(String str, List<? extends NetworkSettings> providerList, C3583ja publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.a = str;
        this.b = providerList;
        this.c = publisherDataHolder;
    }

    public final String a() {
        return this.a;
    }

    public final List<NetworkSettings> b() {
        return this.b;
    }

    public final C3583ja c() {
        return this.c;
    }

    public final List<NetworkSettings> d() {
        return this.b;
    }

    public final C3583ja e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3799w0)) {
            return false;
        }
        C3799w0 c3799w0 = (C3799w0) obj;
        return Intrinsics.wireman(this.a, c3799w0.a) && Intrinsics.wireman(this.b, c3799w0.b) && Intrinsics.wireman(this.c, c3799w0.c);
    }

    public final String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "AdUnitCommonData(userId=" + this.a + ", providerList=" + this.b + ", publisherDataHolder=" + this.c + ")";
    }

    public final C3799w0 a(String str, List<? extends NetworkSettings> providerList, C3583ja publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        return new C3799w0(str, providerList, publisherDataHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3799w0 a(C3799w0 c3799w0, String str, List list, C3583ja c3583ja, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3799w0.a;
        }
        if ((i & 2) != 0) {
            list = c3799w0.b;
        }
        if ((i & 4) != 0) {
            c3583ja = c3799w0.c;
        }
        return c3799w0.a(str, list, c3583ja);
    }
}
