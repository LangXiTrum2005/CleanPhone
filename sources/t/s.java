package t;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50303a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f50304b;

    public s(t tVar) {
        this.f50304b = new WeakReference(tVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f50303a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.f50304b;
                if (weakReference.get() != null) {
                    ((t) weakReference.get()).f(true);
                }
                break;
            default:
                ((z) this.f50304b).f50324s.f(true);
                break;
        }
    }

    public s(z zVar) {
        this.f50304b = zVar;
    }
}
