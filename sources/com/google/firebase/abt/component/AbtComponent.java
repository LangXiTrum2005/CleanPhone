package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.inject.Provider;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class AbtComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20170a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f20171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f20172c;

    public AbtComponent(Context context, Provider provider) {
        this.f20171b = context;
        this.f20172c = provider;
    }
}
