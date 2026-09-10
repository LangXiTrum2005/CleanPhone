package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Rh0 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f3672a;

    public Rh0(Sh0 sh0) {
        this.f3672a = new WeakReference(sh0);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Sh0 sh0 = (Sh0) this.f3672a.get();
        if (sh0 == null) {
            return true;
        }
        ArrayList arrayList = sh0.b;
        if (arrayList.isEmpty()) {
            return true;
        }
        View view = sh0.f3728a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = sh0.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = sh0.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if (iA <= 0 && iA != Integer.MIN_VALUE) {
            return true;
        }
        if (iA2 <= 0 && iA2 != Integer.MIN_VALUE) {
            return true;
        }
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            ((T60) ((InterfaceC4903w70) it.next())).j(iA, iA2);
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(sh0.c);
        }
        sh0.c = null;
        arrayList.clear();
        return true;
    }
}
