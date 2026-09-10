package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1863ka implements InterfaceC0736Gg {
    public static String[] A03 = {"nDiRY7f5TVWQOdU6I2mqi9PFa0bJ0VdN", "dUUtDl8unUO3GnPy3lwgtNvfo3F9XuVE", "auWwlwtRUPVHuGctx8NQwZ9fHxwXm1Rl", "TBzFY5XPxTfovmrmdBuO6vWMd6W8Cva2", "LKANgRtOSZEoLNHfrBEFH87LShAEPYie", "UCBlHB7WfBTqWuynAgT0g", "VPae1XPQy5IfYkfssFJoJg5Ye50RabOh", "Wz70ndlImsTWQI2daID25L24SXF8SnWJ"};
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ C1858kV A01;
    public final /* synthetic */ C1744ie A02;

    public C1863ka(C1858kV c1858kV, C1744ie c1744ie, NativeAd nativeAd) {
        this.A01 = c1858kV;
        this.A02 = c1744ie;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0736Gg
    public final void AAc() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0736Gg
    public final void AD1(LI li) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1864kb(this, li), 1L);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0736Gg
    public final void ADH() {
        if (this.A01.A0A != null) {
            LI li = this.A01.A0A;
            String[] strArr = A03;
            if (strArr[4].charAt(31) == strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            A03[1] = "TOeEN4NbTJF6yCcoA7wHZFJASn52oXHD";
            li.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0736Gg
    public final void AFK(View view, MotionEvent motionEvent) throws Throwable {
        this.A02.A1A().A06(this.A01.A07, motionEvent, view, view);
        if (motionEvent.getAction() == 1 && !this.A01.A0J(this.A00) && this.A02.A13() != null) {
            this.A02.A13().onClick(view);
        }
    }
}
