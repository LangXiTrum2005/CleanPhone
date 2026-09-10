package com.inmobi.media;

import duvetyn.marial;
import okhttp3.cord;
import okhttp3.dovishness;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3266u4 extends cord {
    public final /* synthetic */ AbstractC3280ui a;

    public C3266u4(AbstractC3280ui abstractC3280ui) {
        this.a = abstractC3280ui;
    }

    @Override // okhttp3.cord
    /* JADX INFO: renamed from: contentType */
    public final dovishness getF34158attabal() {
        return dovishness.competently(this.a.a());
    }

    @Override // okhttp3.cord
    public final void writeTo(marial sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.a.a(sink);
    }
}
