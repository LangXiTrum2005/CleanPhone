package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3145p7 implements Pn {
    public final /* synthetic */ C3170q7 a;

    public C3145p7(C3170q7 c3170q7) {
        this.a = c3170q7;
    }

    @Override // com.inmobi.media.Pn
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        Intrinsics.checkNotNullParameter(visibleViews, "visibleViews");
        Intrinsics.checkNotNullParameter(invisibleViews, "invisibleViews");
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            Ln ln = (Ln) this.a.i.get(view);
            if (ln != null) {
                Oh oh = (Oh) ln;
                Intrinsics.checkNotNullParameter(view, "view");
                if (view instanceof GestureDetectorOnGestureListenerC2829ci) {
                    if (oh.a.hasWindowFocus()) {
                        oh.a.d(true);
                    } else {
                        oh.a.d(false);
                    }
                }
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            Ln ln2 = (Ln) this.a.i.get(view2);
            if (ln2 != null) {
                Oh oh2 = (Oh) ln2;
                Intrinsics.checkNotNullParameter(view2, "view");
                if (view2 instanceof GestureDetectorOnGestureListenerC2829ci) {
                    if (oh2.a.hasWindowFocus()) {
                        oh2.a.d(false);
                    } else {
                        oh2.a.d(false);
                    }
                }
            }
        }
    }
}
