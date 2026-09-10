package com.startapp.sdk.internal;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f41666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41667b;

    public x6(Object emitter) {
        Intrinsics.f(emitter, "emitter");
        this.f41666a = new WeakReference(emitter);
        this.f41667b = new ArrayList();
    }

    public final boolean a(Object obj) {
        Intrinsics.f(obj, "obj");
        if (this.f41666a.get() == obj) {
            return true;
        }
        for (x6 x6Var : this.f41667b) {
            if (x6Var.f41666a.get() == obj || x6Var.a(obj)) {
                return true;
            }
        }
        return false;
    }
}
