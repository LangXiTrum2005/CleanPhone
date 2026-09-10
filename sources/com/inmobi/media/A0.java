package com.inmobi.media;

import A.RunnableC0881b;
import A.RunnableC0883c;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class A0 implements InterfaceC3249u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B0 f22671a;

    public A0(B0 b1) {
        this.f22671a = b1;
    }

    public static final void a(B0 this$0, byte b2) {
        short s;
        Intrinsics.f(this$0, "this$0");
        S0 s0 = this$0.f22708a;
        Z z2 = this$0.f22710c;
        if (b2 == 1) {
            s = 78;
        } else if (b2 == 2) {
            s = 79;
        } else if (b2 == 3) {
            s = 80;
        } else if (b2 == 4) {
            s = 81;
        } else if (b2 == 5) {
            s = 5;
        } else if (b2 == 6) {
            s = 77;
        } else if (b2 == 7) {
            s = 31;
        } else {
            s = b2 == 8 ? (short) 27 : (short) 82;
        }
        s0.a(z2, false, s);
    }

    public static final void a(B0 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.f22708a.a(this$0.f22710c, true, (short) 0);
    }

    @Override // com.inmobi.media.InterfaceC3249u1
    public final void a(C3088k assetBatch, byte b2) {
        Intrinsics.f(assetBatch, "assetBatch");
        this.f22671a.f22712h.a(assetBatch, b2);
        B0 b1 = this.f22671a;
        InterfaceC3333z5 interfaceC3333z5 = b1.f;
        if (interfaceC3333z5 != null) {
            String str = b1.d;
            StringBuilder sbA = H6.a(str, "access$getTAG$p(...)", "Notifying failure  to ad unit with placement ID (");
            sbA.append(this.f22671a.f22710c);
            sbA.append(')');
            ((A5) interfaceC3333z5).b(str, sbA.toString());
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC0881b(this.f22671a, b2, 0));
    }

    @Override // com.inmobi.media.InterfaceC3249u1
    public final void a(C3088k assetBatch) {
        Intrinsics.f(assetBatch, "assetBatch");
        this.f22671a.f22712h.a(assetBatch);
        B0 b1 = this.f22671a;
        InterfaceC3333z5 interfaceC3333z5 = b1.f;
        if (interfaceC3333z5 != null) {
            String str = b1.d;
            StringBuilder sbA = H6.a(str, "access$getTAG$p(...)", "Notifying ad unit with placement ID (");
            sbA.append(this.f22671a.f22710c);
            sbA.append(')');
            ((A5) interfaceC3333z5).a(str, sbA.toString());
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC0883c(this.f22671a, 0));
    }
}
