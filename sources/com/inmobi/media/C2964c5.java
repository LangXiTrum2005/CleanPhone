package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2964c5 implements hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3030g5 f23482a;

    public C2964c5(C3030g5 c3030g5) {
        this.f23482a = c3030g5;
    }

    @Override // com.inmobi.media.hf
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        Intrinsics.f(visibleViews, "visibleViews");
        Intrinsics.f(invisibleViews, "invisibleViews");
        Intrinsics.e(this.f23482a.d, "access$getTAG$p(...)");
        Objects.toString(visibleViews);
        Objects.toString(invisibleViews);
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            C2998e5 c2998e5 = (C2998e5) this.f23482a.f23625a.get(view);
            if (c2998e5 == null) {
                this.f23482a.a(view);
            } else {
                C2998e5 c2998e6 = (C2998e5) this.f23482a.f23626b.get(view);
                if (!Intrinsics.a(c2998e5.f23546a, c2998e6 != null ? c2998e6.f23546a : null)) {
                    c2998e5.d = SystemClock.uptimeMillis();
                    this.f23482a.f23626b.put(view, c2998e5);
                }
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            this.f23482a.f23626b.remove((View) it2.next());
        }
        C3030g5 c3030g5 = this.f23482a;
        if (c3030g5.f23628e.hasMessages(0)) {
            return;
        }
        c3030g5.f23628e.postDelayed(c3030g5.f, c3030g5.g);
    }
}
