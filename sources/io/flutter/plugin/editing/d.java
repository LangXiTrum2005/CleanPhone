package io.flutter.plugin.editing;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends BaseInputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f43269a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view, f fVar) {
        super(view, true);
        this.f43269a = fVar;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f43269a;
    }
}
