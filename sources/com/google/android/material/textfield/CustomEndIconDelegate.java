package com.google.android.material.textfield;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes4.dex */
class CustomEndIconDelegate extends EndIconDelegate {
    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void r() {
        EndCompoundLayout endCompoundLayout = this.f19512b;
        endCompoundLayout.s0 = null;
        CheckableImageButton checkableImageButton = endCompoundLayout.k0;
        checkableImageButton.setOnLongClickListener(null);
        IconHelper.d(checkableImageButton, null);
    }
}
