package com.inmobi.media;

import android.view.View;
import android.view.WindowInsets;
import com.inmobi.media.to;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class to {
    public final ArrayList a;
    public final WeakReference b;

    public to(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a = new ArrayList();
        this.b = new WeakReference(view);
        C3342x5.a.getClass();
        if (C3342x5.u()) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: adsuki.heck
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return to.a(this.f3458attabal, view2, windowInsets);
                }
            });
        }
    }

    public static final WindowInsets a(to toVar, View view, WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        if (!toVar.a.isEmpty()) {
            Iterator it = toVar.a.iterator();
            while (it.hasNext()) {
                xo xoVar = (xo) ((so) it.next());
                xoVar.getClass();
                Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
                xoVar.a.a(windowInsets);
                xoVar.a(windowInsets);
            }
        }
        return windowInsets;
    }

    public final void a() {
        View view;
        this.a.clear();
        C3342x5.a.getClass();
        if (!C3342x5.u() || (view = (View) this.b.get()) == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(null);
    }
}
