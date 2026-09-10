package com.google.android.material.color.utilities;

import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
public final class DynamicColor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function f19222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function f19223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function f19224c;
    public final Function d;

    public DynamicColor(String str, Function function, Function function2, boolean z2, Function function3, ContrastCurve contrastCurve, Function function4) {
        new HashMap();
        this.f19222a = function;
        this.f19223b = function2;
        this.f19224c = function3;
        this.d = function4;
    }

    public static DynamicColor a(String str, Function function, Function function2) {
        return new DynamicColor(str, function, function2, false, null, null, null);
    }

    public DynamicColor(N.a aVar, N.a aVar2, N.a aVar3) {
        new HashMap();
        this.f19222a = aVar;
        this.f19223b = aVar2;
        this.f19224c = null;
        this.d = null;
    }
}
