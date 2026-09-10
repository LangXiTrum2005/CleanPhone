package com.inmobi.media;

import android.view.OrientationEventListener;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.inmobi.media.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3110l5 extends OrientationEventListener {
    public static final /* synthetic */ KProperty[] d = {Reflection.f43333a.f(new MutablePropertyReference1Impl("currentOrientation", C3110l5.class, "getCurrentOrientation()Lcom/inmobi/ads/rendering/orientation/Orientation;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiAdActivity f23765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f23766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3094k5 f23767c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3110l5(InMobiAdActivity activity) {
        super(activity);
        Intrinsics.f(activity, "activity");
        this.f23765a = activity;
        this.f23766b = new HashSet();
        this.f23767c = new C3094k5(AbstractC3195qa.a(U3.g()), this);
    }

    public final void a(C3210ra orientationProperties) {
        Intrinsics.f(orientationProperties, "orientationProperties");
        try {
            if (orientationProperties.f23962a) {
                this.f23765a.setRequestedOrientation(13);
                return;
            }
            String str = orientationProperties.f23963b;
            if (Intrinsics.a(str, com.ironsource.d9.h.C)) {
                this.f23765a.setRequestedOrientation(6);
            } else if (Intrinsics.a(str, com.ironsource.d9.h.D)) {
                this.f23765a.setRequestedOrientation(7);
            } else {
                this.f23765a.setRequestedOrientation(13);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void b() {
        int i2 = this.f23765a.getResources().getConfiguration().orientation;
        byte bG = U3.g();
        int i3 = 1;
        if (bG != 1 && bG != 2 && (bG == 3 || bG == 4)) {
            i3 = 2;
        }
        if (i2 == i3) {
            this.f23767c.setValue(this, d[0], AbstractC3195qa.a(U3.g()));
        }
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i2) {
        b();
    }

    public final void a() {
        if (this.f23766b.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }
}
