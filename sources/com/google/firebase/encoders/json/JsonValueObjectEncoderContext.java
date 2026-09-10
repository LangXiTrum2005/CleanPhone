package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class JsonValueObjectEncoderContext implements ObjectEncoderContext, ValueEncoderContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20793a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonWriter f20794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20795c;
    public final HashMap d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f20796e;
    public final boolean f;

    public JsonValueObjectEncoderContext(Writer writer, HashMap map, HashMap map2, a aVar, boolean z2) {
        this.f20794b = new JsonWriter(writer);
        this.f20795c = map;
        this.d = map2;
        this.f20796e = aVar;
        this.f = z2;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext a(FieldDescriptor fieldDescriptor, boolean z2) throws IOException {
        String str = fieldDescriptor.f20782a;
        j();
        JsonWriter jsonWriter = this.f20794b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z2);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext b(FieldDescriptor fieldDescriptor, long j) throws IOException {
        String str = fieldDescriptor.f20782a;
        j();
        JsonWriter jsonWriter = this.f20794b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext c(FieldDescriptor fieldDescriptor, int i2) throws IOException {
        String str = fieldDescriptor.f20782a;
        j();
        JsonWriter jsonWriter = this.f20794b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i2);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext d(FieldDescriptor fieldDescriptor, double d) throws IOException {
        String str = fieldDescriptor.f20782a;
        j();
        JsonWriter jsonWriter = this.f20794b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext e(String str) throws IOException {
        j();
        this.f20794b.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext f(FieldDescriptor fieldDescriptor, Object obj) throws IOException {
        i(obj, fieldDescriptor.f20782a);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext g(boolean z2) throws IOException {
        j();
        this.f20794b.value(z2);
        return this;
    }

    public final JsonValueObjectEncoderContext h(Object obj) {
        JsonWriter jsonWriter = this.f20794b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e2) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            ObjectEncoder objectEncoder = (ObjectEncoder) this.f20795c.get(obj.getClass());
            if (objectEncoder != null) {
                jsonWriter.beginObject();
                objectEncoder.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.d.get(obj.getClass());
            if (valueEncoder != null) {
                valueEncoder.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f20796e.a(obj, this);
                throw null;
            }
            if (obj instanceof NumberedEnum) {
                int x = ((NumberedEnum) obj).getX();
                j();
                jsonWriter.value(x);
                return this;
            }
            String strName = ((Enum) obj).name();
            j();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            j();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i2 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i2 < length) {
                jsonWriter.value(iArr[i2]);
                i2++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i2 < length2) {
                long j = jArr[i2];
                j();
                jsonWriter.value(j);
                i2++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i2 < length3) {
                jsonWriter.value(dArr[i2]);
                i2++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i2 < length4) {
                jsonWriter.value(zArr[i2]);
                i2++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i2 < length5) {
                h(numberArr[i2]);
                i2++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i2 < length6) {
                h(objArr[i2]);
                i2++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final JsonValueObjectEncoderContext i(Object obj, String str) throws IOException {
        boolean z2 = this.f;
        JsonWriter jsonWriter = this.f20794b;
        if (z2) {
            if (obj == null) {
                return this;
            }
            j();
            jsonWriter.name(str);
            h(obj);
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        h(obj);
        return this;
    }

    public final void j() {
        if (!this.f20793a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
