package com.inmobi.media;

import java.io.IOException;
import kotlinx.coroutines.kowloon;
import okhttp3.beachfront;
import okhttp3.cuirassed;
import okhttp3.marial;
import p002kotlin.Result;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2858dl implements beachfront {
    public final /* synthetic */ kowloon a;

    public C2858dl(kowloon kowloonVar) {
        this.a = kowloonVar;
    }

    @Override // okhttp3.beachfront
    public final void onFailure(marial call, IOException t) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t, "e");
        kowloon kowloonVar = this.a;
        Intrinsics.checkNotNullParameter(kowloonVar, "<this>");
        Intrinsics.checkNotNullParameter(t, "t");
        if (kowloonVar.isActive()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                kowloonVar.resumeWith(Result.m3351constructorimpl(dern.attabal(t)));
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // okhttp3.beachfront
    public final void onResponse(marial call, cuirassed response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        P4.a(this.a, response);
    }
}
