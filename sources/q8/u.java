package q8;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48889a;

    public u(long j10) {
        this.f48889a = j10;
    }

    public static u a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        u uVar = new u(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return uVar;
                    }
                    u uVar2 = new u(jsonReader.nextLong());
                    jsonReader.close();
                    return uVar2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th2) {
            jsonReader.close();
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof u) && this.f48889a == ((u) obj).f48889a;
    }

    public final int hashCode() {
        long j10 = this.f48889a;
        return ((int) ((j10 >>> 32) ^ j10)) ^ 1000003;
    }

    public final String toString() {
        return defpackage.e.r(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f48889a, "}");
    }
}
