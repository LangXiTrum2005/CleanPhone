package com.efs.sdk.base.core.util.a;

import androidx.annotation.NonNull;
import com.efs.sdk.base.http.HttpResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends com.efs.sdk.base.core.util.concurrent.d<HttpResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f423a;

    public c(@NonNull b bVar) {
        super(bVar);
        this.f423a = bVar;
    }

    @NonNull
    public final HttpResponse b() {
        this.f423a.e = "post";
        return a();
    }
}
