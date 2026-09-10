package l1;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.ads.br0;
import com.google.android.gms.internal.ads.gr0;
import com.google.android.gms.internal.ads.mk0;
import com.google.android.gms.internal.ads.nr0;
import com.google.android.gms.internal.ads.t02;
import com.google.android.gms.internal.ads.vr0;
import com.google.android.gms.internal.ads.z40;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44795b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f44794a = i10;
        this.f44795b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = this.f44794a;
        Object obj = this.f44795b;
        switch (i10) {
            case 0:
                mk0 mk0Var = (mk0) obj;
                l lVar = (l) mk0Var.f17463e;
                lVar.getClass();
                for (m mVar : (CopyOnWriteArraySet) mk0Var.f17464f) {
                    if (!mVar.f44799d && mVar.f44798c) {
                        i1.n nVarB = mVar.f44797b.b();
                        mVar.f44797b = new t02(1);
                        mVar.f44798c = false;
                        lVar.a(mVar.f44796a, nVarB);
                    }
                    w wVar = (w) mk0Var.f17462d;
                    wVar.getClass();
                    if (wVar.f44825a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                z40 z40Var = (z40) obj;
                z40Var.getClass();
                int i11 = message.what;
                if (i11 == 1) {
                    ((br0) z40Var.f22497g).a();
                    return true;
                }
                if (i11 == 2) {
                    ((gr0) z40Var.f22498h).a();
                    return true;
                }
                if (i11 == 3) {
                    ((nr0) z40Var.f22499i).a();
                    return true;
                }
                if (i11 != 4) {
                    return false;
                }
                ((vr0) z40Var.f22500j).a();
                return true;
        }
    }
}
