package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class E8 extends AbstractC3230se {
    public final WeakReference d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E8(C2967c8 adUnit) {
        super(adUnit, (byte) 6);
        Intrinsics.f(adUnit, "adUnit");
        this.d = new WeakReference(adUnit);
    }

    @Override // com.inmobi.media.AbstractC3230se
    public final void a(Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        S0 s0 = (C2967c8) this.d.get();
        if (s0 == null) {
            return;
        }
        if (sShortValue != 0) {
            s0.a(new WeakReference<>(s0.r()), sShortValue, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        if (2 == s0.Q()) {
            s0.d((byte) 4);
            InterfaceC3295x interfaceC3295xK = s0.k();
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecX = s0.x();
            F0 f0R = s0.r();
            if (!(interfaceC3295xK instanceof T7)) {
                if (f0R != null) {
                    f0R.a(s0, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            T7 t7 = (T7) interfaceC3295xK;
            t7.H = gestureDetectorOnGestureListenerC3005ecX;
            t7.K = s0.T();
            U0 u0S = s0.s();
            u0S.getClass();
            u0S.f23246i = SystemClock.elapsedRealtime();
            s0.u0();
            s0.z0();
            if (f0R != null) {
                s0.f(f0R);
            }
        }
    }

    @Override // com.inmobi.media.G1
    public final void c() {
        F0 f0R;
        super.c();
        S0 s0 = (C2967c8) this.d.get();
        if (s0 == null || (f0R = s0.r()) == null) {
            return;
        }
        f0R.a(s0, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
    }

    @Override // com.inmobi.media.G1
    public final void a() {
        C2967c8 c2967c8 = (C2967c8) this.d.get();
        if (c2967c8 == null) {
            b((short) 13);
            return;
        }
        F0 f0R = c2967c8.r();
        if (f0R != null) {
            b(Short.valueOf(c2967c8.c(f0R)));
        }
    }
}
