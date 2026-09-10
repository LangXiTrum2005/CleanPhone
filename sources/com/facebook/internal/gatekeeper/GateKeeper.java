package com.facebook.internal.gatekeeper;

import android.support.v4.media.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/gatekeeper/GateKeeper;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GateKeeper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16409b;

    public GateKeeper(String name, boolean z2) {
        Intrinsics.f(name, "name");
        this.f16408a = name;
        this.f16409b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GateKeeper)) {
            return false;
        }
        GateKeeper gateKeeper = (GateKeeper) obj;
        return Intrinsics.a(this.f16408a, gateKeeper.f16408a) && this.f16409b == gateKeeper.f16409b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        String str = this.f16408a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z2 = this.f16409b;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GateKeeper(name=");
        sb.append(this.f16408a);
        sb.append(", value=");
        return a.t(sb, this.f16409b, ")");
    }
}
