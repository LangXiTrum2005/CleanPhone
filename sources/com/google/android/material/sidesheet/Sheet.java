package com.google.android.material.sidesheet;

import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.sidesheet.SheetCallback;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
interface Sheet<C extends SheetCallback> extends MaterialBackHandler {

    @Retention(RetentionPolicy.SOURCE)
    public @interface SheetEdge {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SheetState {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StableSheetState {
    }

    void a(SideSheetDialog.AnonymousClass1 anonymousClass1);

    void c(int i2);

    int getState();
}
