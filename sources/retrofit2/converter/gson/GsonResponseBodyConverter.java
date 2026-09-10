package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes7.dex */
final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final TypeAdapter<T> adapter;
    private final Gson gson;

    public GsonResponseBodyConverter(Gson gson, TypeAdapter<T> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        Gson gson = this.gson;
        Reader readerCharStream = responseBody.charStream();
        gson.getClass();
        JsonReader jsonReader = new JsonReader(readerCharStream);
        jsonReader.f21326Y = false;
        try {
            T t = (T) this.adapter.b(jsonReader);
            if (jsonReader.j0() != JsonToken.k0) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            responseBody.close();
            return t;
        } catch (Throwable th) {
            responseBody.close();
            throw th;
        }
    }
}
