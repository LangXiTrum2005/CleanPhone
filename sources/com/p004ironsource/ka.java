package com.p004ironsource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/ironsource/ka;", "Lcom/ironsource/w8;", "", "url", "Ljava/io/InputStream;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
final class ka implements w8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ka f25522a = new ka();

    private ka() {
    }

    @Override // com.p004ironsource.w8
    public InputStream a(String url) throws IOException {
        Intrinsics.f(url, "url");
        InputStream inputStreamOpenStream = new URL(url).openStream();
        Intrinsics.e(inputStreamOpenStream, "URL(url).openStream()");
        return inputStreamOpenStream;
    }
}
