package com.charging.screenshow.battery.animations.themes.fragment;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class NewTrendingFrag$sam$androidx_lifecycle_Observer$0 implements Observer, FunctionAdapter {
    public final /* synthetic */ h X;

    public NewTrendingFrag$sam$androidx_lifecycle_Observer$0(h hVar) {
        this.X = hVar;
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
