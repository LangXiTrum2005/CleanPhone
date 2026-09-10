package com.basic.mvp;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.basic.mvp.BasicMvpModel;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasicMvpController$MvpPresenterImp<V, M extends BasicMvpModel> implements LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
    }
}
