package o4;

import android.view.View;
import android.view.ViewGroup;
import com.storage.androidcleaner.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f47096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f47097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f47098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f47099d;

    public b0(i iVar, ViewGroup viewGroup, View view, View view2) {
        this.f47099d = iVar;
        this.f47096a = viewGroup;
        this.f47097b = view;
        this.f47098c = view2;
    }

    @Override // o4.s, o4.q
    public final void a() {
        this.f47096a.getOverlay().remove(this.f47097b);
    }

    @Override // o4.q
    public final void c(r rVar) {
        this.f47098c.setTag(R.id.save_overlay_view, null);
        this.f47096a.getOverlay().remove(this.f47097b);
        rVar.v(this);
    }

    @Override // o4.s, o4.q
    public final void d() {
        View view = this.f47097b;
        if (view.getParent() == null) {
            this.f47096a.getOverlay().add(view);
        } else {
            this.f47099d.cancel();
        }
    }
}
