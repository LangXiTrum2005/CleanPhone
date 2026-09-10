package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonPrimitive extends JsonElement {
    public final Serializable X;

    public JsonPrimitive(Boolean bool) {
        Objects.requireNonNull(bool);
        this.X = bool;
    }

    public static boolean e(JsonPrimitive jsonPrimitive) {
        Serializable serializable = jsonPrimitive.X;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean a() {
        Serializable serializable = this.X;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(d());
    }

    public final Number c() {
        Serializable serializable = this.X;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new LazilyParsedNumber((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String d() {
        Serializable serializable = this.X;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return c().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        Serializable serializable = this.X;
        Serializable serializable2 = jsonPrimitive.X;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (e(this) && e(jsonPrimitive)) {
            return c().longValue() == jsonPrimitive.c().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = c().doubleValue();
        double dDoubleValue2 = jsonPrimitive.c().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.X;
        if (serializable == null) {
            return 31;
        }
        if (e(this)) {
            jDoubleToLongBits = c().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(c().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public JsonPrimitive(Number number) {
        Objects.requireNonNull(number);
        this.X = number;
    }

    public JsonPrimitive(String str) {
        Objects.requireNonNull(str);
        this.X = str;
    }
}
