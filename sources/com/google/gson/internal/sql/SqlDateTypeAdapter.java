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
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes4.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TypeAdapterFactory f21316b = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter b(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f21317a;

    public /* synthetic */ SqlDateTypeAdapter(int i2) {
        this();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        java.util.Date date;
        if (jsonReader.j0() == JsonToken.j0) {
            jsonReader.U();
            return null;
        }
        String strC0 = jsonReader.c0();
        try {
            synchronized (this) {
                date = this.f21317a.parse(strC0);
            }
            return new Date(date.getTime());
        } catch (ParseException e2) {
            StringBuilder sbY = a.y("Failed parsing '", strC0, "' as SQL Date; at path ");
            sbY.append(jsonReader.s());
            throw new JsonSyntaxException(sbY.toString(), e2);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            jsonWriter.s();
            return;
        }
        synchronized (this) {
            str = this.f21317a.format((java.util.Date) date);
        }
        jsonWriter.P(str);
    }

    private SqlDateTypeAdapter() {
        this.f21317a = new SimpleDateFormat("MMM d, yyyy");
    }
}
