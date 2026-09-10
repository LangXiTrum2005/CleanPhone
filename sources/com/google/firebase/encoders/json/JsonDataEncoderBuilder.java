package com.google.firebase.encoders.json;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.EncoderConfig;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {
    public static final b f;
    public static final b g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f20790c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20786e = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TimestampEncoder f20787h = new TimestampEncoder();

    public static final class TimestampEncoder implements ValueEncoder<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SimpleDateFormat f20792a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f20792a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        @Override // com.google.firebase.encoders.ValueEncoder
        public final void a(Object obj, Object obj2) {
            ((ValueEncoderContext) obj2).e(f20792a.format((Date) obj));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.firebase.encoders.json.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.firebase.encoders.json.b] */
    static {
        final int i2 = 0;
        f = new ValueEncoder() { // from class: com.google.firebase.encoders.json.b
            @Override // com.google.firebase.encoders.ValueEncoder
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        a aVar = JsonDataEncoderBuilder.f20786e;
                        ((ValueEncoderContext) obj2).e((String) obj);
                        break;
                    default:
                        a aVar2 = JsonDataEncoderBuilder.f20786e;
                        ((ValueEncoderContext) obj2).g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i3 = 1;
        g = new ValueEncoder() { // from class: com.google.firebase.encoders.json.b
            @Override // com.google.firebase.encoders.ValueEncoder
            public final void a(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        a aVar = JsonDataEncoderBuilder.f20786e;
                        ((ValueEncoderContext) obj2).e((String) obj);
                        break;
                    default:
                        a aVar2 = JsonDataEncoderBuilder.f20786e;
                        ((ValueEncoderContext) obj2).g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public JsonDataEncoderBuilder() {
        HashMap map = new HashMap();
        this.f20788a = map;
        HashMap map2 = new HashMap();
        this.f20789b = map2;
        this.f20790c = f20786e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, f20787h);
        map.remove(Date.class);
    }

    public final DataEncoder a() {
        return new DataEncoder() { // from class: com.google.firebase.encoders.json.JsonDataEncoderBuilder.1
            @Override // com.google.firebase.encoders.DataEncoder
            public final void a(Object obj, Writer writer) throws IOException {
                JsonDataEncoderBuilder jsonDataEncoderBuilder = JsonDataEncoderBuilder.this;
                JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(writer, jsonDataEncoderBuilder.f20788a, jsonDataEncoderBuilder.f20789b, jsonDataEncoderBuilder.f20790c, jsonDataEncoderBuilder.d);
                jsonValueObjectEncoderContext.h(obj);
                jsonValueObjectEncoderContext.j();
                jsonValueObjectEncoderContext.f20794b.flush();
            }

            @Override // com.google.firebase.encoders.DataEncoder
            public final String b(Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    a(obj, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }
        };
    }

    public final EncoderConfig b(Class cls, ObjectEncoder objectEncoder) {
        this.f20788a.put(cls, objectEncoder);
        this.f20789b.remove(cls);
        return this;
    }
}
