package o;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e0 f46982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k.f f46983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f46984c;

    @Override // o.x
    public final void b(m mVar, boolean z10) {
        k.f fVar;
        if ((z10 || mVar == this.f46982a) && (fVar = this.f46983b) != null) {
            fVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        e0 e0Var = this.f46982a;
        i iVar = this.f46984c;
        if (iVar.f46951f == null) {
            iVar.f46951f = new h(iVar);
        }
        e0Var.q(iVar.f46951f.getItem(i10), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f46984c.b(this.f46982a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        e0 e0Var = this.f46982a;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f46983b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f46983b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                e0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return e0Var.performShortcut(i10, keyEvent, 0);
    }

    @Override // o.x
    public final boolean u(m mVar) {
        return false;
    }
}
