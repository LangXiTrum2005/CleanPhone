package wk;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum j {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl.f f53326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yl.f f53327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f53329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f53317e = xj.k.E0(new j[]{CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE});

    j(String str) {
        this.f53326a = yl.f.e(str);
        this.f53327b = yl.f.e(str.concat("Array"));
        i iVar = new i(this, 1);
        wj.e eVar = wj.e.f53280a;
        this.f53328c = r9.b.t(eVar, iVar);
        this.f53329d = r9.b.t(eVar, new i(this, 0));
    }
}
