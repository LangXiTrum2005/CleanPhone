package com.ironsource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class H4 implements Q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H4 f26232a = new H4();

    private H4() {
    }

    @Override // com.ironsource.Q3
    public InputStream a(String url) throws IOException {
        kotlin.jvm.internal.n.f(url, "url");
        InputStream inputStreamOpenStream = new URL(url).openStream();
        kotlin.jvm.internal.n.e(inputStreamOpenStream, "URL(url).openStream()");
        return inputStreamOpenStream;
    }
}
