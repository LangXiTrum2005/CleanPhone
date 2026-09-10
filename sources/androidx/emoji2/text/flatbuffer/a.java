package androidx.emoji2.text.flatbuffer;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        int i2 = Utf8Old.f5020b;
        Utf8Old.Cache cache = new Utf8Old.Cache();
        Charset charset = StandardCharsets.UTF_8;
        charset.newEncoder();
        charset.newDecoder();
        return cache;
    }
}
