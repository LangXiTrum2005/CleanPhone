package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class K8 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f22925a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K8(Context context, byte b2) {
        super(context);
        Intrinsics.f(context, "context");
        this.f22925a = b2;
    }

    public abstract void a(C3049h8 c3049h8, L8 l8, int i2, int i3, D8 d8);

    public final byte getType() {
        return this.f22925a;
    }
}
