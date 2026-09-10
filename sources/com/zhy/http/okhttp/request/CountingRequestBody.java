package com.zhy.http.okhttp.request;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;

/* JADX INFO: loaded from: classes6.dex */
public class CountingRequestBody extends RequestBody {

    public final class CountingSink extends ForwardingSink {
        @Override // okio.ForwardingSink, okio.Sink
        public final void write(Buffer buffer, long j) throws IOException {
            super.write(buffer, j);
            throw null;
        }
    }

    public interface Listener {
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) {
        Okio.c(new CountingSink(bufferedSink));
        throw null;
    }
}
