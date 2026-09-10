package p;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements p0, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k.f f47692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k0 f47693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f47694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q0 f47695d;

    public j0(q0 q0Var) {
        this.f47695d = q0Var;
    }

    @Override // p.p0
    public final boolean a() {
        k.f fVar = this.f47692a;
        if (fVar != null) {
            return fVar.isShowing();
        }
        return false;
    }

    @Override // p.p0
    public final int b() {
        return 0;
    }

    @Override // p.p0
    public final void c(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p.p0
    public final CharSequence d() {
        return this.f47694c;
    }

    @Override // p.p0
    public final void dismiss() {
        k.f fVar = this.f47692a;
        if (fVar != null) {
            fVar.dismiss();
            this.f47692a = null;
        }
    }

    @Override // p.p0
    public final Drawable e() {
        return null;
    }

    @Override // p.p0
    public final void f(CharSequence charSequence) {
        this.f47694c = charSequence;
    }

    @Override // p.p0
    public final void g(int i10) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p.p0
    public final void h(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p.p0
    public final void i(int i10, int i11) {
        if (this.f47693b == null) {
            return;
        }
        q0 q0Var = this.f47695d;
        b2.w wVar = new b2.w(q0Var.getPopupContext());
        k.c cVar = (k.c) wVar.f5411c;
        CharSequence charSequence = this.f47694c;
        if (charSequence != null) {
            cVar.f44049d = charSequence;
        }
        k0 k0Var = this.f47693b;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        cVar.f44054i = k0Var;
        cVar.f44055j = this;
        cVar.f44057m = selectedItemPosition;
        cVar.l = true;
        k.f fVarB = wVar.b();
        this.f47692a = fVarB;
        AlertController$RecycleListView alertController$RecycleListView = fVarB.f44094g.f44066e;
        alertController$RecycleListView.setTextDirection(i10);
        alertController$RecycleListView.setTextAlignment(i11);
        this.f47692a.show();
    }

    @Override // p.p0
    public final int j() {
        return 0;
    }

    @Override // p.p0
    public final void k(ListAdapter listAdapter) {
        this.f47693b = (k0) listAdapter;
    }

    @Override // p.p0
    public final void m(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        q0 q0Var = this.f47695d;
        q0Var.setSelection(i10);
        if (q0Var.getOnItemClickListener() != null) {
            q0Var.performItemClick(null, i10, this.f47693b.getItemId(i10));
        }
        dismiss();
    }
}
