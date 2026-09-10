package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Y7 implements hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z7 f23371a;

    public Y7(Z7 z7) {
        this.f23371a = z7;
    }

    @Override // com.inmobi.media.hf
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        Intrinsics.f(visibleViews, "visibleViews");
        Intrinsics.f(invisibleViews, "invisibleViews");
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            ef efVar = (ef) this.f23371a.f.get(view);
            if (efVar != null) {
                efVar.a(view, true);
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            ef efVar2 = (ef) this.f23371a.f.get(view2);
            if (efVar2 != null) {
                efVar2.a(view2, false);
            }
        }
    }
}
