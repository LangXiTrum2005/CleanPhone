package dj;

import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f38918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f38919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f38920d;

    public b(String name, a aVar, Boolean bool, Map map) {
        n.f(name, "name");
        this.f38917a = name;
        this.f38918b = aVar;
        this.f38919c = bool;
        this.f38920d = map;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(b.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        b bVar = (b) obj;
        return com.google.android.gms.internal.auth.i.h(this.f38917a, bVar.f38917a) && com.google.android.gms.internal.auth.i.h(this.f38918b, bVar.f38918b) && com.google.android.gms.internal.auth.i.h(this.f38919c, bVar.f38919c) && com.google.android.gms.internal.auth.i.h(this.f38920d, bVar.f38920d);
    }

    public final int hashCode() {
        return com.google.android.gms.internal.auth.i.j(this.f38920d) + ((com.google.android.gms.internal.auth.i.j(this.f38919c) + ((com.google.android.gms.internal.auth.i.j(this.f38918b) + ((com.google.android.gms.internal.auth.i.j(this.f38917a) + (b.class.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreInitializeResponse(name=" + this.f38917a + ", options=" + this.f38918b + ", isAutomaticDataCollectionEnabled=" + this.f38919c + ", pluginConstants=" + this.f38920d + ")";
    }
}
