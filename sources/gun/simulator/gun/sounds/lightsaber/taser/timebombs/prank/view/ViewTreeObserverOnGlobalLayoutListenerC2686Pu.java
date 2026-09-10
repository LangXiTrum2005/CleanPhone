package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.R;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2686Pu implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.gyf.immersionbar.a f3578a;
    public final Window b;
    public final View c;
    public final View d;
    public final View e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public int j;
    public boolean k;

    public ViewTreeObserverOnGlobalLayoutListenerC2686Pu(com.gyf.immersionbar.a aVar) {
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.f3578a = aVar;
        Window window = aVar.d;
        this.b = window;
        View decorView = window.getDecorView();
        this.c = decorView;
        FrameLayout frameLayout = (FrameLayout) decorView.findViewById(R.id.content);
        if (aVar.i) {
            Fragment fragment = aVar.b;
            if (fragment != null) {
                this.e = fragment.getView();
            } else {
                android.app.Fragment fragment2 = aVar.c;
                if (fragment2 != null) {
                    this.e = fragment2.getView();
                }
            }
        } else {
            View childAt = frameLayout.getChildAt(0);
            this.e = childAt;
            if (childAt != null && (childAt instanceof DrawerLayout)) {
                this.e = ((DrawerLayout) childAt).getChildAt(0);
            }
        }
        View view = this.e;
        if (view != null) {
            this.f = view.getPaddingLeft();
            this.g = this.e.getPaddingTop();
            this.h = this.e.getPaddingRight();
            this.i = this.e.getPaddingBottom();
        }
        View view2 = this.e;
        this.d = view2 != null ? view2 : frameLayout;
    }

    public final void a() {
        if (this.k) {
            View view = this.e;
            View view2 = this.d;
            if (view == null) {
                com.gyf.immersionbar.a aVar = this.f3578a;
                view2.setPadding(aVar.q, aVar.r, aVar.s, aVar.t);
            } else {
                view2.setPadding(this.f, this.g, this.h, this.i);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        T8 t8;
        com.gyf.immersionbar.a aVar;
        ViewTreeObserverOnGlobalLayoutListenerC2686Pu viewTreeObserverOnGlobalLayoutListenerC2686Pu;
        int i;
        com.gyf.immersionbar.a aVar2 = this.f3578a;
        if (aVar2 == null || (t8 = aVar2.k) == null || !t8.k) {
            return;
        }
        if (aVar2.l == null) {
            aVar2.l = new S8(aVar2.f850a);
        }
        S8 s8 = aVar2.l;
        int i2 = s8.c() ? s8.c : s8.d;
        Rect rect = new Rect();
        this.c.getWindowVisibleDisplayFrame(rect);
        View view = this.d;
        int height = view.getHeight() - rect.bottom;
        if (height != this.j) {
            this.j = height;
            boolean z = true;
            if (com.gyf.immersionbar.a.a(this.b.getDecorView().findViewById(R.id.content))) {
                if (height - i2 <= i2) {
                    z = false;
                }
            } else if (this.e != null) {
                aVar2.k.getClass();
                aVar2.k.getClass();
                if (height > i2) {
                    i = height + this.i;
                } else {
                    i = 0;
                    z = false;
                }
                view.setPadding(this.f, this.g, this.h, i);
            } else {
                int i3 = aVar2.t;
                int i4 = height - i2;
                if (i4 > i2) {
                    i3 = i4 + i2;
                } else {
                    z = false;
                }
                view.setPadding(aVar2.q, aVar2.r, aVar2.s, i3);
            }
            aVar2.k.getClass();
            if (!z && aVar2.k.q != 4) {
                aVar2.h();
            }
            if (z || (aVar = aVar2.g) == null || (viewTreeObserverOnGlobalLayoutListenerC2686Pu = aVar.o) == null) {
                return;
            }
            viewTreeObserverOnGlobalLayoutListenerC2686Pu.a();
            aVar2.g.o.j = 0;
        }
    }
}
