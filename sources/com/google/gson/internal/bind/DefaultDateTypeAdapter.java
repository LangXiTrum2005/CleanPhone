package com.google.gson.internal.bind;

import android.support.v4.media.a;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateType f21252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21253b;

    public static abstract class DateType<T extends Date> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final DateType f21254b = new AnonymousClass1(Date.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f21255a;

        /* JADX INFO: renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType$1, reason: invalid class name */
        public class AnonymousClass1 extends DateType<Date> {
            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
            public final Date b(Date date) {
                return date;
            }
        }

        public DateType(Class cls) {
            this.f21255a = cls;
        }

        public final TypeAdapterFactory a(int i2, int i3) {
            DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, i2, i3);
            TypeAdapterFactory typeAdapterFactory = TypeAdapters.f21289a;
            return new TypeAdapters.AnonymousClass31(this.f21255a, defaultDateTypeAdapter);
        }

        public abstract Date b(Date date);
    }

    public DefaultDateTypeAdapter(DateType dateType, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        this.f21253b = arrayList;
        Objects.requireNonNull(dateType);
        this.f21252a = dateType;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i2, i3, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (JavaVersion.f21231a >= 9) {
            arrayList.add(PreJava9DateFormatProvider.a(i2, i3));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        Date dateB;
        if (jsonReader.j0() == JsonToken.j0) {
            jsonReader.U();
            return null;
        }
        String strC0 = jsonReader.c0();
        synchronized (this.f21253b) {
            try {
                Iterator it = this.f21253b.iterator();
                while (it.hasNext()) {
                    try {
                        dateB = ((DateFormat) it.next()).parse(strC0);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    dateB = ISO8601Utils.b(strC0, new ParsePosition(0));
                } catch (ParseException e2) {
                    StringBuilder sbY = a.y("Failed parsing '", strC0, "' as Date; at path ");
                    sbY.append(jsonReader.s());
                    throw new JsonSyntaxException(sbY.toString(), e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f21252a.b(dateB);
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            jsonWriter.s();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f21253b.get(0);
        synchronized (this.f21253b) {
            str = dateFormat.format(date);
        }
        jsonWriter.P(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f21253b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
