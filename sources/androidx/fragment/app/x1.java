package androidx.fragment.app;

import android.view.View;
import ea.r2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4505a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f4508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4510f;

    public /* synthetic */ x1(ea.u0 u0Var, int i10, Exception exc, byte[] bArr, Map map) {
        this.f4507c = u0Var;
        this.f4506b = i10;
        this.f4508d = exc;
        this.f4509e = bArr;
        this.f4510f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4505a;
        Object obj = this.f4510f;
        Object obj2 = this.f4509e;
        Serializable serializable = this.f4508d;
        Object obj3 = this.f4507c;
        switch (i10) {
            case 0:
                for (int i11 = 0; i11 < this.f4506b; i11++) {
                    View view = (View) ((ArrayList) obj3).get(i11);
                    String str = (String) ((ArrayList) serializable).get(i11);
                    WeakHashMap weakHashMap = m0.s0.f45746a;
                    view.setTransitionName(str);
                    ((View) ((ArrayList) obj2).get(i11)).setTransitionName((String) ((ArrayList) obj).get(i11));
                }
                break;
            default:
                ea.u0 u0Var = (ea.u0) obj3;
                ((r2) u0Var.f39781f).b(u0Var.f39779d, this.f4506b, (Exception) serializable, (byte[]) obj2, (Map) obj);
                break;
        }
    }

    public x1(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f4506b = i10;
        this.f4507c = arrayList;
        this.f4508d = arrayList2;
        this.f4509e = arrayList3;
        this.f4510f = arrayList4;
    }
}
