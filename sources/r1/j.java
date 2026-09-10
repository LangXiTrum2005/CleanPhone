package r1;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f49313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f49314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f49315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i1.e f49316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f49317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f49318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f49319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f49320k;

    public j(i iVar) {
        this.f49310a = iVar.f49299a;
        this.f49311b = iVar.f49300b;
        this.f49312c = iVar.f49301c;
        this.f49313d = iVar.f49302d;
        this.f49314e = iVar.f49303e;
        this.f49315f = iVar.f49304f;
        this.f49316g = iVar.f49305g;
        this.f49317h = iVar.f49306h;
        this.f49318i = iVar.f49307i;
        this.f49319j = iVar.f49308j;
        this.f49320k = iVar.f49309k;
    }

    public final i a() {
        i iVar = new i();
        iVar.f49299a = this.f49310a;
        iVar.f49300b = this.f49311b;
        iVar.f49301c = this.f49312c;
        iVar.f49302d = this.f49313d;
        iVar.f49303e = this.f49314e;
        iVar.f49304f = this.f49315f;
        iVar.f49305g = this.f49316g;
        iVar.f49306h = this.f49317h;
        iVar.f49307i = this.f49318i;
        iVar.f49308j = this.f49319j;
        iVar.f49309k = this.f49320k;
        return iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f49310a == jVar.f49310a && this.f49311b == jVar.f49311b && this.f49312c == jVar.f49312c && this.f49313d == jVar.f49313d && this.f49314e == jVar.f49314e && this.f49315f == jVar.f49315f && this.f49317h == jVar.f49317h && this.f49318i == jVar.f49318i && this.f49319j == jVar.f49319j && this.f49320k == jVar.f49320k && this.f49316g.equals(jVar.f49316g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f49310a), Integer.valueOf(this.f49311b), Integer.valueOf(this.f49312c), Boolean.valueOf(this.f49313d), Boolean.valueOf(this.f49314e), Integer.valueOf(this.f49315f), this.f49316g, Integer.valueOf(this.f49317h), Integer.valueOf(this.f49318i), Boolean.valueOf(this.f49320k), Boolean.valueOf(this.f49319j));
    }
}
