package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d2 extends x0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f13671e = new a(null);
    public final Function0 d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(Context context, AttributeSet attributeSet, int i2, Function0 function0) {
        super(context, attributeSet, i2, null, null, 24, null);
        Intrinsics.f(context, "context");
        this.d = function0;
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        setPadding(a(16), a(4), a(16), a(4));
    }

    public abstract void a(i5 i5Var);

    public abstract void a(oj ojVar, mj mjVar);

    public final Function0<Unit> getOnCtaClicked() {
        return this.d;
    }

    public final void setCustomContentDescription(String description) {
        Intrinsics.f(description, "description");
        setContentDescription(description);
    }
}
