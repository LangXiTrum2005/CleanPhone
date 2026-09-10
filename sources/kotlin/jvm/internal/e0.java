package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class e0 {
    public qk.d b(Class cls) {
        return new f(cls);
    }

    public qk.f c(Class cls, String str) {
        return new t(cls, str);
    }

    public String i(i iVar) {
        String string = iVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String j(o oVar) {
        return i(oVar);
    }

    public qk.g a(j jVar) {
        return jVar;
    }

    public qk.j d(p pVar) {
        return pVar;
    }

    public qk.l e(r rVar) {
        return rVar;
    }

    public qk.r f(hn.j jVar) {
        return jVar;
    }

    public qk.t g(u uVar) {
        return uVar;
    }

    public qk.v h(w wVar) {
        return wVar;
    }
}
