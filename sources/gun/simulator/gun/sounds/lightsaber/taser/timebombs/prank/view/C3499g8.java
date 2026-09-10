package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3499g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4405a;

    public C3499g8(long j) {
        this.f4405a = j;
    }

    public static C3499g8 a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        C3499g8 c3499g8 = new C3499g8(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return c3499g8;
                    }
                    C3499g8 c3499g9 = new C3499g8(jsonReader.nextLong());
                    jsonReader.close();
                    return c3499g9;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3499g8) {
            return this.f4405a == ((C3499g8) obj).f4405a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4405a;
        return 1000003 ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return AbstractC3950lJ.s(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f4405a, "}");
    }
}
