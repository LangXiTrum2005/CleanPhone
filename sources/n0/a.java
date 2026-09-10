package n0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f46326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46327c;

    public a(int i10, e eVar, int i11) {
        this.f46325a = i10;
        this.f46326b = eVar;
        this.f46327c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f46325a);
        this.f46326b.f46334a.performAction(this.f46327c, bundle);
    }
}
