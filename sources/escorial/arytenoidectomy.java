package escorial;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: compiled from: LogResponse.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class arytenoidectomy {
    public static arytenoidectomy attabal(long j) {
        return new taiyuan(j);
    }

    public static arytenoidectomy saneness(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        arytenoidectomy arytenoidectomyVarAttabal = attabal(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return arytenoidectomyVarAttabal;
                    }
                    arytenoidectomy arytenoidectomyVarAttabal2 = attabal(jsonReader.nextLong());
                    jsonReader.close();
                    return arytenoidectomyVarAttabal2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public abstract long dern();
}
