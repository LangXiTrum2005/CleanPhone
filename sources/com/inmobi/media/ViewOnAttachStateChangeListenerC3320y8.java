package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.y8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnAttachStateChangeListenerC3320y8 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D8 f24125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f24126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2984d8 f24127c;

    public ViewOnAttachStateChangeListenerC3320y8(D8 d8, ArrayList arrayList, C2984d8 c2984d8) {
        this.f24125a = d8;
        this.f24126b = arrayList;
        this.f24127c = c2984d8;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.f(v, "v");
        this.f24125a.f22772l.a(this.f24126b);
        T7 t7 = this.f24125a.f22767b;
        C2984d8 c2984d8A = t7.a(t7.f23212b, this.f24127c);
        C2984d8 c2984d8 = this.f24127c;
        T7 t8 = this.f24125a.f22767b;
        if (c2984d8A == null) {
            c2984d8A = c2984d8;
        }
        c2984d8.a("creativeView", t8.a(c2984d8A), (L7) null, this.f24125a.f);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.f(v, "v");
        v.removeOnAttachStateChangeListener(this);
        C2943b1 c2943b1 = this.f24125a.f22772l;
        ArrayList arrayList = this.f24126b;
        c2943b1.getClass();
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C2926a1) it.next()).f23421a.cancel();
        }
        c2943b1.f23458b.removeAll(arrayList);
    }
}
