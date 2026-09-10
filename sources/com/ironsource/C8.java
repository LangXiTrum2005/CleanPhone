package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f25858b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(Gg gg2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8(Context context) {
        super(context);
        kotlin.jvm.internal.n.f(context, "context");
        this.f25857a = "ISNNativeAdContainer";
    }

    private final Gg a() {
        return new Gg(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    public final a getListener$mediationsdk_release() {
        return this.f25858b;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i10) {
        kotlin.jvm.internal.n.f(changedView, "changedView");
        Logger.i(this.f25857a, "onVisibilityChanged: " + i10);
        a aVar = this.f25858b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        Logger.i(this.f25857a, "onWindowVisibilityChanged: " + i10);
        a aVar = this.f25858b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public final void setListener$mediationsdk_release(a aVar) {
        this.f25858b = aVar;
    }
}
