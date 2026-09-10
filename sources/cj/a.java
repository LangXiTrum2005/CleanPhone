package cj;

import cc.a2;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f6437b;

    public a(String str, Map map) {
        this.f6436a = str;
        this.f6437b = map;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(a.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return a2.f(this.f6436a, aVar.f6436a) && a2.f(this.f6437b, aVar.f6437b);
    }

    public final int hashCode() {
        return a2.h(this.f6437b) + ((a2.h(this.f6436a) + (a.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AnalyticsEvent(name=" + this.f6436a + ", parameters=" + this.f6437b + ")";
    }
}
