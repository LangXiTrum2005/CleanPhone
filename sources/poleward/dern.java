package poleward;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.stratoscope;
import retrofit2.beachfront;

/* JADX INFO: compiled from: GsonResponseBodyConverter.java */
/* JADX INFO: loaded from: classes5.dex */
public final class dern<T> implements beachfront<stratoscope, T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Gson f35412attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final TypeAdapter<T> f35413saneness;

    public dern(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f35412attabal = gson;
        this.f35413saneness = typeAdapter;
    }

    @Override // retrofit2.beachfront
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public T convert(stratoscope stratoscopeVar) throws IOException {
        JsonReader jsonReaderNewJsonReader = this.f35412attabal.newJsonReader(stratoscopeVar.charStream());
        try {
            T t = this.f35413saneness.read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            stratoscopeVar.close();
            return t;
        } catch (Throwable th) {
            stratoscopeVar.close();
            throw th;
        }
    }
}
