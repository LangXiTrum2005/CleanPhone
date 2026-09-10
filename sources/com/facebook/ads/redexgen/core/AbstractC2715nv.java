package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2715nv implements InterfaceC1298Cx {
    public static String[] A07 = {"KBisateWM8YQ4arKDgRYpdTDxezzMkCv", "VJ2uSooodcJBZOLyoDYKaqw5tYDrMz4W", "bemaZsDF2tY6J54Bg3tOUH55klLpC", "LnVxhCvG0lD6F7ZPu", "7ofy39p1yDzqV7NnIWFVVnn8VzEJdml2", "3pklWVRHTZe0TjeZrFE3TnxhkITdP", "TfKHOeXRiNIOMg3PDS", "WMeybOD3P6lu5fyh7Idh"};
    public Looper A00;
    public Timeline A01;
    public C8O A02;
    public final ArrayList<InterfaceC1297Cw> A05 = new ArrayList<>(1);
    public final HashSet<InterfaceC1297Cw> A06 = new HashSet<>(1);
    public final D8 A04 = new D8();
    public final A1 A03 = new A1();

    public abstract void A09();

    public abstract void A0A(InterfaceC11315t interfaceC11315t);

    public final C8O A00() {
        return (C8O) AbstractC10843y.A02(this.A02);
    }

    public final A1 A01(C2708no c2708no) {
        return this.A03.A00(0, c2708no);
    }

    public final D8 A02(C2708no c2708no) {
        return this.A04.A02(0, c2708no, 0L);
    }

    public void A03() {
    }

    public void A04() {
    }

    public final void A05(Timeline timeline) {
        this.A01 = timeline;
        Iterator<InterfaceC1297Cw> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().AG1(this, timeline);
        }
    }

    public final void A06(InterfaceC1297Cw interfaceC1297Cw) {
        boolean z2 = !this.A06.isEmpty();
        this.A06.remove(interfaceC1297Cw);
        if (z2) {
            boolean wasEnabled = this.A06.isEmpty();
            if (wasEnabled) {
                A03();
            }
        }
    }

    public final void A07(InterfaceC1297Cw interfaceC1297Cw) {
        AbstractC10843y.A01(this.A00);
        boolean zIsEmpty = this.A06.isEmpty();
        this.A06.add(interfaceC1297Cw);
        if (zIsEmpty) {
            A04();
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    public final void A08(InterfaceC1297Cw interfaceC1297Cw, InterfaceC11315t interfaceC11315t, C8O c8o) {
        boolean z2;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.A00;
        if (looper != null) {
            Looper looper2 = this.A00;
            if (looper2 == looperMyLooper) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        AbstractC10843y.A07(z2);
        this.A02 = c8o;
        Timeline timeline = this.A01;
        this.A05.add(interfaceC1297Cw);
        Looper looper3 = this.A00;
        if (looper3 == null) {
            this.A00 = looperMyLooper;
            this.A06.add(interfaceC1297Cw);
            A0A(interfaceC11315t);
        } else {
            if (timeline == null) {
                return;
            }
            A07(interfaceC1297Cw);
            interfaceC1297Cw.AG1(this, timeline);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1298Cx
    public final void A3z(Handler handler, D9 d9) {
        AbstractC10843y.A01(handler);
        AbstractC10843y.A01(d9);
        this.A04.A04(handler, d9);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1298Cx
    public final void AH7(InterfaceC1297Cw interfaceC1297Cw, InterfaceC11315t interfaceC11315t) {
        A08(interfaceC1297Cw, interfaceC11315t, C8O.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1298Cx
    public final void AHl(InterfaceC1297Cw interfaceC1297Cw) {
        this.A05.remove(interfaceC1297Cw);
        if (this.A05.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.clear();
            String[] strArr = A07;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "pnZ7WVnnf2PAl7J7h";
            strArr2[6] = "ddcJoNElLz9Uvwup8w";
            A09();
            return;
        }
        A06(interfaceC1297Cw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1298Cx
    public final void AIS(D9 d9) {
        this.A04.A0D(d9);
    }
}
