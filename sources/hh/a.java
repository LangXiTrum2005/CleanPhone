package hh;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42350a;

    public a(List list) {
        this.f42350a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f42350a.equals(((a) obj).f42350a);
    }

    public final int hashCode() {
        return this.f42350a.hashCode();
    }

    public final String toString() {
        return "AssetFolderStorage(folders=" + this.f42350a + ")";
    }
}
