package com.google.gson.internal.bind;

import android.support.v4.media.a;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TypeAdapterFactory f21250b = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter b(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f21251a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f21251a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (JavaVersion.f21231a >= 9) {
            arrayList.add(PreJava9DateFormatProvider.a(2, 2));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        if (jsonReader.j0() == JsonToken.j0) {
            jsonReader.U();
            return null;
        }
        String strC0 = jsonReader.c0();
        synchronized (this.f21251a) {
            try {
                Iterator it = this.f21251a.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(strC0);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return ISO8601Utils.b(strC0, new ParsePosition(0));
                } catch (ParseException e2) {
                    StringBuilder sbY = a.y("Failed parsing '", strC0, "' as Date; at path ");
                    sbY.append(jsonReader.s());
                    throw new JsonSyntaxException(sbY.toString(), e2);
                }
            } catch (Throwable th) {
                throw th;
            }
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
        DateFormat dateFormat = (DateFormat) this.f21251a.get(0);
        synchronized (this.f21251a) {
            str = dateFormat.format(date);
        }
        jsonWriter.P(str);
    }
}
