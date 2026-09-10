package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Oh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f3515a = new SparseArray();

    public static void a(final View view, final InterfaceC2766Sw interfaceC2766Sw) {
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        if (view instanceof TextView) {
            ViewOnTouchListenerC2712Qu viewOnTouchListenerC2712Qu = new ViewOnTouchListenerC2712Qu();
            viewOnTouchListenerC2712Qu.f3632a = -1L;
            view.setOnTouchListener(viewOnTouchListenerC2712Qu);
        }
        final long j = 500;
        view.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Nh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                View view3 = view;
                AbstractC2995aW.q(view3, "$this_click");
                InterfaceC2766Sw interfaceC2766Sw2 = interfaceC2766Sw;
                AbstractC2995aW.q(interfaceC2766Sw2, "$action");
                SparseArray sparseArray = Oh0.f3515a;
                if (sparseArray.size() > 30) {
                    sparseArray.removeAt(0);
                }
                Long l = (Long) sparseArray.get(view3.getId());
                if (l == null || l.longValue() < System.currentTimeMillis()) {
                    int id = view3.getId();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = j;
                    sparseArray.put(id, Long.valueOf(jCurrentTimeMillis + j2));
                    AbstractC2995aW.n(view2);
                    interfaceC2766Sw2.invoke(view2);
                    view3.postDelayed(new RunnableC4057mb(view3, 2), j2);
                }
            }
        });
    }

    public static final boolean b(View view) {
        return view.getVisibility() == 0;
    }

    public static final void c(View view) {
        if (view.getVisibility() != 4) {
            view.setVisibility(4);
        }
    }

    public static final void d(ImageView imageView, int i) {
        ((PY) ((PY) com.bumptech.glide.a.d(imageView.getContext()).i(Drawable.class).y(Integer.valueOf(i)).n(true)).d(AbstractC2940Zo.f4092a)).w(imageView);
    }

    public static final void e(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }
}
