package gh;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41901a;

    public d(String str) {
        this.f41901a = str;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder("documents");
        sb2.append(File.separator);
        return defpackage.e.q(this.f41901a, ".json", sb2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f41901a.equals(((d) obj).f41901a);
    }

    public final int hashCode() {
        return c.f41899a.hashCode() + (((this.f41901a.hashCode() * 31) + 3271912) * 961);
    }

    public final String toString() {
        return "FileURLComponents(fileName=" + this.f41901a + ", fileExtension=json, directoryName=null, directoryPath=" + c.f41899a + ")";
    }
}
