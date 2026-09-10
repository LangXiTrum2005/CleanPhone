package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import java.net.URL;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public interface vi {
    long a();

    View a(Context context);

    Object a(Context context, URL url, l6 l6Var, Continuation continuation);

    void a(fg fgVar);

    void a(wi wiVar);

    long b();

    float getVolume();

    void pause();

    void play();

    void release();

    void setVolume(float f);
}
