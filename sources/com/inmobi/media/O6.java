package com.inmobi.media;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class O6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R6 f23036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2963c4 f23037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f23038c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23039e;

    public O6(R6 r6, C2963c4 embeddedBrowserViewClient) {
        Intrinsics.f(embeddedBrowserViewClient, "embeddedBrowserViewClient");
        this.f23036a = r6;
        this.f23037b = embeddedBrowserViewClient;
        this.f23038c = new LinkedHashSet();
    }
}
