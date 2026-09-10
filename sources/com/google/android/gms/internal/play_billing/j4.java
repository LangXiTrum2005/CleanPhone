package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f24384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m4 f24385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n4 f24386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24387d;

    public final void a(Object obj) {
        this.f24387d = true;
        m4 m4Var = this.f24385b;
        if (m4Var != null) {
            l4 l4Var = m4Var.f24427b;
            l4Var.getClass();
            if (obj == null) {
                obj = i4.f24293g;
            }
            if (i4.f24292f.T(l4Var, null, obj)) {
                i4.b(l4Var);
                this.f24384a = null;
                this.f24385b = null;
                this.f24386c = null;
            }
        }
    }

    public final void finalize() {
        n4 n4Var;
        m4 m4Var = this.f24385b;
        if (m4Var != null) {
            l4 l4Var = m4Var.f24427b;
            if (!l4Var.isDone()) {
                if (i4.f24292f.T(l4Var, null, new f2(new n1("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f24384a)), 1)))) {
                    i4.b(l4Var);
                }
            }
        }
        if (this.f24387d || (n4Var = this.f24386c) == null) {
            return;
        }
        n4Var.g(null);
    }
}
