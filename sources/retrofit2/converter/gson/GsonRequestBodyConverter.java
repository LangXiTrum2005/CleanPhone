package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes7.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final TypeAdapter<T> adapter;
    private final Gson gson;

    public GsonRequestBodyConverter(Gson gson, TypeAdapter<T> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t) throws IOException {
        final Buffer buffer = new Buffer();
        JsonWriter jsonWriterF = this.gson.f(new OutputStreamWriter(new OutputStream() { // from class: okio.Buffer$outputStream$1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
            }

            public final String toString() {
                return buffer + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public final void write(int i2) {
                buffer.T(i2);
            }

            @Override // java.io.OutputStream
            public final void write(byte[] data, int i2, int i3) {
                Intrinsics.f(data, "data");
                buffer.S(data, i2, i3);
            }
        }, UTF_8));
        this.adapter.c(jsonWriterF, t);
        jsonWriterF.close();
        return RequestBody.create(MEDIA_TYPE, buffer.readByteString(buffer.f45132Y));
    }
}
