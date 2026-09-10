package cn;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e2 extends hn.r implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6706e;

    public e2(long j10, ck.c cVar) {
        super(cVar, cVar.getContext());
        this.f6706e = j10;
    }

    @Override // cn.q1
    public final String Q() {
        return super.Q() + "(timeMillis=" + this.f6706e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        ak.k kVar = this.f6670c;
        d0.p(kVar);
        z zVar = (z) kVar.get(z.f6788b);
        String str = zVar != null ? zVar.f6789a : null;
        String strJ = defpackage.e.j(this.f6706e, "Timed out waiting for ", " ms");
        if (str != null) {
            StringBuilder sbK = d5.u.k("Coroutine \"", str, "\" ");
            if (strJ.length() > 0) {
                char lowerCase = Character.toLowerCase(strJ.charAt(0));
                String strSubstring = strJ.substring(1);
                kotlin.jvm.internal.n.e(strSubstring, "substring(...)");
                strJ = lowerCase + strSubstring;
            }
            sbK.append(strJ);
            strJ = sbK.toString();
        }
        t(new d2(strJ, this));
    }
}
