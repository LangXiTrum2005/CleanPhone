package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3015f6 extends AbstractC3230se {
    public final WeakReference d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f23603e;
    public short f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3015f6(C3127m6 adUnit, F0 eventListener) {
        super(adUnit, (byte) 5);
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(eventListener, "eventListener");
        this.d = new WeakReference(adUnit);
        this.f23603e = new WeakReference(eventListener);
    }

    @Override // com.inmobi.media.AbstractC3230se
    public final void a(Object obj) {
        F0 f0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C3127m6 c3127m6 = (C3127m6) this.d.get();
        if (c3127m6 == null || (f0 = (F0) this.f23603e.get()) == null) {
            return;
        }
        if (!zBooleanValue) {
            short s = this.f;
            if (s != 0) {
                c3127m6.a(this.f23603e, s, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            } else {
                c3127m6.b(f0, (short) 85);
                return;
            }
        }
        InterfaceC3295x interfaceC3295xK = c3127m6.k();
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecX = c3127m6.x();
        if (gestureDetectorOnGestureListenerC3005ecX != null) {
            if (interfaceC3295xK instanceof T7) {
                T7 t7 = (T7) interfaceC3295xK;
                t7.H = gestureDetectorOnGestureListenerC3005ecX;
                t7.K = c3127m6.T();
            } else {
                c3127m6.b(f0, (short) 84);
            }
        }
        c3127m6.h(f0);
    }

    @Override // com.inmobi.media.G1
    public final void c() {
        super.c();
        C3127m6 c3127m6 = (C3127m6) this.d.get();
        if (c3127m6 == null || ((F0) this.f23603e.get()) == null) {
            return;
        }
        c3127m6.a(this.f23603e, (short) 40, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
    }

    @Override // com.inmobi.media.G1
    public final void a() {
        C3127m6 c3127m6 = (C3127m6) this.d.get();
        F0 f0 = (F0) this.f23603e.get();
        if (c3127m6 != null && f0 != null) {
            if (c3127m6.E0()) {
                short sC = c3127m6.c(f0);
                this.f = sC;
                b(Boolean.valueOf(sC == 0));
                return;
            }
            b(Boolean.FALSE);
            return;
        }
        b(Boolean.FALSE);
    }
}
