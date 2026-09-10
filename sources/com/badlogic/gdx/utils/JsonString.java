package com.badlogic.gdx.utils;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class JsonString {
    private JsonObject current;
    private boolean named;
    private final Array<JsonObject> stack = new Array<>();
    private JsonWriter.OutputType outputType = JsonWriter.OutputType.json;
    private boolean quoteLongValues = false;
    final StringBuilder buffer = new StringBuilder();

    public class JsonObject {
        final boolean array;
        boolean needsComma;

        public JsonObject(boolean z) {
            this.array = z;
            JsonString.this.buffer.append(z ? '[' : '{');
        }

        public void close() {
            JsonString.this.buffer.append(this.array ? ']' : '}');
        }
    }

    private void requireCommaOrName() {
        JsonObject jsonObject = this.current;
        if (jsonObject == null) {
            return;
        }
        if (!jsonObject.array) {
            if (!this.named) {
                throw new IllegalStateException("Name must be set.");
            }
            this.named = false;
        } else if (jsonObject.needsComma) {
            this.buffer.append(',');
        } else {
            jsonObject.needsComma = true;
        }
    }

    public JsonString array() {
        requireCommaOrName();
        Array<JsonObject> array = this.stack;
        JsonObject jsonObject = new JsonObject(true);
        this.current = jsonObject;
        array.add(jsonObject);
        return this;
    }

    public JsonString close() {
        while (this.stack.size > 0) {
            pop();
        }
        return this;
    }

    public StringBuilder getBuffer() {
        return this.buffer;
    }

    public JsonString json(String str) {
        requireCommaOrName();
        this.buffer.append(str);
        return this;
    }

    public JsonString name(String str) {
        JsonObject jsonObject = this.current;
        if (jsonObject == null || jsonObject.array) {
            throw new IllegalStateException("Current item must be an object.");
        }
        if (jsonObject.needsComma) {
            this.buffer.append(',');
        } else {
            jsonObject.needsComma = true;
        }
        this.buffer.append(this.outputType.quoteName(str));
        this.buffer.append(':');
        this.named = true;
        return this;
    }

    public JsonString object() {
        requireCommaOrName();
        Array<JsonObject> array = this.stack;
        JsonObject jsonObject = new JsonObject(false);
        this.current = jsonObject;
        array.add(jsonObject);
        return this;
    }

    public JsonString pop() {
        if (this.named) {
            throw new IllegalStateException("Expected an object, array, or value since a name was set.");
        }
        this.stack.pop().close();
        Array<JsonObject> array = this.stack;
        this.current = array.size == 0 ? null : array.peek();
        return this;
    }

    public void reset() {
        this.buffer.clear();
        this.stack.clear();
        this.current = null;
        this.named = false;
    }

    public JsonString set(String str, Object obj) {
        return name(str).value(obj);
    }

    public void setOutputType(JsonWriter.OutputType outputType) {
        this.outputType = outputType;
    }

    public void setQuoteLongValues(boolean z) {
        this.quoteLongValues = z;
    }

    public String toString() {
        return this.buffer.toString();
    }

    public JsonString value(@Null Object obj) {
        if (this.quoteLongValues && ((obj instanceof Long) || (obj instanceof Double) || (obj instanceof BigDecimal) || (obj instanceof BigInteger))) {
            obj = obj.toString();
        } else if (obj instanceof Number) {
            Number number = (Number) obj;
            long jLongValue = number.longValue();
            if (number.doubleValue() == jLongValue) {
                obj = Long.valueOf(jLongValue);
            }
        }
        requireCommaOrName();
        this.buffer.append(this.outputType.quoteValue(obj));
        return this;
    }

    public JsonString array(String str) {
        return name(str).array();
    }

    public JsonString json(String str, String str2) {
        return name(str).json(str2);
    }

    public JsonString object(String str) {
        return name(str).object();
    }
}
