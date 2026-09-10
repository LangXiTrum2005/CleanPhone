package com.bumptech.glide.load.resource.bytes;

import com.bumptech.glide.load.data.DataRewinder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ByteBufferRewinder implements DataRewinder<ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f12702a;

    public static class Factory implements DataRewinder.Factory<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public final Class a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public final DataRewinder b(Object obj) {
            return new ByteBufferRewinder((ByteBuffer) obj);
        }
    }

    public ByteBufferRewinder(ByteBuffer byteBuffer) {
        this.f12702a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public final Object a() {
        ByteBuffer byteBuffer = this.f12702a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public final void b() {
    }
}
