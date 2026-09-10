package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f4485b;

    public /* synthetic */ v0(g1 g1Var, int i10) {
        this.f4484a = i10;
        this.f4485b = g1Var;
    }

    @Override // h.b
    public final void onActivityResult(Object obj) {
        switch (this.f4484a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                g1 g1Var = this.f4485b;
                c1 c1Var = (c1) g1Var.F.pollFirst();
                if (c1Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = c1Var.f4269a;
                    int i11 = c1Var.f4270b;
                    Fragment fragmentC = g1Var.f4324c.c(str);
                    if (fragmentC == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    } else {
                        fragmentC.onRequestPermissionsResult(i11, strArr, iArr);
                    }
                }
                break;
            case 1:
                h.a aVar = (h.a) obj;
                g1 g1Var2 = this.f4485b;
                c1 c1Var2 = (c1) g1Var2.F.pollLast();
                if (c1Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = c1Var2.f4269a;
                    int i12 = c1Var2.f4270b;
                    Fragment fragmentC2 = g1Var2.f4324c.c(str2);
                    if (fragmentC2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        fragmentC2.onActivityResult(i12, aVar.f42048a, aVar.f42049b);
                    }
                }
                break;
            default:
                h.a aVar2 = (h.a) obj;
                g1 g1Var3 = this.f4485b;
                c1 c1Var3 = (c1) g1Var3.F.pollFirst();
                if (c1Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = c1Var3.f4269a;
                    int i13 = c1Var3.f4270b;
                    Fragment fragmentC3 = g1Var3.f4324c.c(str3);
                    if (fragmentC3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        fragmentC3.onActivityResult(i13, aVar2.f42048a, aVar2.f42049b);
                    }
                }
                break;
        }
    }
}
