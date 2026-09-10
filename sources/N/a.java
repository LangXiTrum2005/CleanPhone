package n;

import android.view.MenuInflater;
import android.view.View;
import kotlin.jvm.internal.n;
import zk.z0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46264a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f46266c;

    public /* synthetic */ a() {
    }

    public Integer a(a visibility) {
        n.f(visibility, "visibility");
        yj.f fVar = z0.f55013a;
        if (this == visibility) {
            return 0;
        }
        yj.f fVar2 = z0.f55013a;
        Integer num = (Integer) fVar2.get(this);
        Integer num2 = (Integer) fVar2.get(visibility);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public abstract void b();

    public abstract View d();

    public String e() {
        return (String) this.f46266c;
    }

    public abstract o.m f();

    public abstract MenuInflater g();

    public abstract CharSequence h();

    public abstract CharSequence i();

    public abstract void j();

    public abstract boolean k();

    public abstract void m(View view);

    public abstract void n(int i10);

    public abstract void o(CharSequence charSequence);

    public abstract void p(int i10);

    public abstract void r(CharSequence charSequence);

    public abstract void s(boolean z10);

    public String toString() {
        switch (this.f46264a) {
            case 1:
                return e();
            default:
                return super.toString();
        }
    }

    public a(String str, boolean z10) {
        this.f46266c = str;
        this.f46265b = z10;
    }

    public a l() {
        return this;
    }
}
