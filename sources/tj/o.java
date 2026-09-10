package tj;

import android.content.Context;
import android.hardware.display.DisplayManager;
import com.google.android.gms.internal.measurement.nf;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nf f50873a;

    public o(nf pigeonRegistrar, int i10) {
        switch (i10) {
            case 1:
                kotlin.jvm.internal.n.f(pigeonRegistrar, "pigeonRegistrar");
                this.f50873a = pigeonRegistrar;
                break;
            case 2:
                kotlin.jvm.internal.n.f(pigeonRegistrar, "pigeonRegistrar");
                this.f50873a = pigeonRegistrar;
                break;
            case 3:
                kotlin.jvm.internal.n.f(pigeonRegistrar, "pigeonRegistrar");
                this.f50873a = pigeonRegistrar;
                break;
            default:
                kotlin.jvm.internal.n.f(pigeonRegistrar, "pigeonRegistrar");
                this.f50873a = pigeonRegistrar;
                break;
        }
    }

    public w0 a() {
        DisplayManager displayManager = (DisplayManager) ((Context) this.f50873a.f23785e).getSystemService(X3.i.f27786d);
        ArrayList arrayList = new ArrayList();
        w0 w0Var = new w0(this);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.removeAll(arrayList);
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                displayManager.unregisterDisplayListener((DisplayManager.DisplayListener) it.next());
                displayManager.registerDisplayListener(new io.flutter.view.p(arrayList2, displayManager, 1), null);
            }
        }
        return w0Var;
    }
}
