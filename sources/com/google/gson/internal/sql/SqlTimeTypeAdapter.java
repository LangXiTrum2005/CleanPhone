package com.google.gson.internal.sql;

import android.support.v4.media.a;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TypeAdapterFactory f21318b = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter b(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f21319a;

    public /* synthetic */ SqlTimeTypeAdapter(int i2) {
        this();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        Time time;
        if (jsonReader.j0() == JsonToken.j0) {
            jsonReader.U();
            return null;
        }
        String strC0 = jsonReader.c0();
        try {
            synchronized (this) {
                time = new Time(this.f21319a.parse(strC0).getTime());
            }
            return time;
        } catch (ParseException e2) {
            StringBuilder sbY = a.y("Failed parsing '", strC0, "' as SQL Time; at path ");
            sbY.append(jsonReader.s());
            throw new JsonSyntaxException(sbY.toString(), e2);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            jsonWriter.s();
            return;
        }
        synchronized (this) {
            str = this.f21319a.format((Date) time);
        }
        jsonWriter.P(str);
    }

    private SqlTimeTypeAdapter() {
        this.f21319a = new SimpleDateFormat("hh:mm:ss a");
    }
}
