package poleward;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import duvetyn.wireman;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.cord;
import okhttp3.dovishness;
import retrofit2.beachfront;

/* JADX INFO: compiled from: GsonRequestBodyConverter.java */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness<T> implements beachfront<T, cord> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final dovishness f35414dern = dovishness.marial("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Charset f35415wireman = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Gson f35416attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final TypeAdapter<T> f35417saneness;

    public saneness(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f35416attabal = gson;
        this.f35417saneness = typeAdapter;
    }

    @Override // retrofit2.beachfront
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public cord convert(T t) throws IOException {
        wireman wiremanVar = new wireman();
        JsonWriter jsonWriterNewJsonWriter = this.f35416attabal.newJsonWriter(new OutputStreamWriter(wiremanVar.outputStream(), f35415wireman));
        this.f35417saneness.write(jsonWriterNewJsonWriter, t);
        jsonWriterNewJsonWriter.close();
        return cord.create(f35414dern, wiremanVar.readByteString());
    }
}
