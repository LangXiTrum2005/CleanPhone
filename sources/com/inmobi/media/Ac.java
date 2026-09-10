package com.inmobi.media;

import com.p004ironsource.ko;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Ac extends N9 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final AtomicBoolean f22700A;
    public final int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f22701z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ac(String url, C3262ue c3262ue, String str, int i2, int i3) {
        super(ko.f25535b, url, c3262ue, G4.a(G4.f22837a, false, 1, null), (InterfaceC3333z5) null, com.smartdigimkt.o0.b.f37293e, 64);
        Intrinsics.f(url, "url");
        this.y = i2;
        this.f22701z = i3;
        this.m = str;
        this.f22700A = new AtomicBoolean(false);
    }
}
