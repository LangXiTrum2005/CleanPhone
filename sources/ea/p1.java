package ea;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f39682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f39683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f39684f;

    public /* synthetic */ p1(Object obj, String str, String str2, Object obj2, long j10, int i10) {
        this.f39679a = i10;
        this.f39680b = str;
        this.f39681c = str2;
        this.f39683e = obj2;
        this.f39682d = j10;
        this.f39684f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39679a) {
            case 0:
                String str = (String) this.f39681c;
                s1 s1Var = (s1) this.f39684f;
                String str2 = (String) this.f39680b;
                if (str2 != null) {
                    w2 w2Var = new w2((String) this.f39683e, str2, this.f39682d);
                    e4 e4Var = s1Var.f39761a;
                    e4Var.P().G0();
                    String str3 = e4Var.G;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    e4Var.G = str;
                    e4Var.F = w2Var;
                } else {
                    e4 e4Var2 = s1Var.f39761a;
                    e4Var2.P().G0();
                    String str4 = e4Var2.G;
                    if (str4 == null || str4.equals(str)) {
                        e4Var2.G = str;
                        e4Var2.F = null;
                    }
                }
                break;
            case 1:
                p2 p2Var = (p2) this.f39684f;
                String str5 = (String) this.f39680b;
                String str6 = (String) this.f39681c;
                p2Var.R0(this.f39682d, this.f39683e, str5, str6);
                break;
            default:
                Bundle bundle = (Bundle) this.f39680b;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                z2 z2Var = (z2) this.f39684f;
                l4 l4Var = ((m1) z2Var.f3623a).f39590i;
                m1.f(l4Var);
                z2Var.M0((w2) this.f39681c, (w2) this.f39683e, this.f39682d, true, l4Var.Q0("screen_view", bundle, null, false));
                break;
        }
    }

    public p1(z2 z2Var, Bundle bundle, w2 w2Var, w2 w2Var2, long j10) {
        this.f39679a = 2;
        this.f39680b = bundle;
        this.f39681c = w2Var;
        this.f39683e = w2Var2;
        this.f39682d = j10;
        Objects.requireNonNull(z2Var);
        this.f39684f = z2Var;
    }
}
