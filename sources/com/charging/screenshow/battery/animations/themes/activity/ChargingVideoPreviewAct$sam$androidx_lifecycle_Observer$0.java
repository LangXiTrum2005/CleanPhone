package com.charging.screenshow.battery.animations.themes.activity;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ChargingVideoPreviewAct$sam$androidx_lifecycle_Observer$0 implements Observer, FunctionAdapter {
    public final /* synthetic */ Function1 X;

    public ChargingVideoPreviewAct$sam$androidx_lifecycle_Observer$0(Function1 function1) {
        this.X = function1;
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void a(Object obj) {
        this.X.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
            return this.X.equals(((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.X;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }
}
