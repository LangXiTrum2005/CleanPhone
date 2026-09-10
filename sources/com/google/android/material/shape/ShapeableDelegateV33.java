package com.google.android.material.shape;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes4.dex */
class ShapeableDelegateV33 extends ShapeableDelegate {
    private void a(View view) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.shape.ShapeableDelegateV33.1
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                ShapeableDelegateV33.this.getClass();
                throw null;
            }
        });
    }
}
