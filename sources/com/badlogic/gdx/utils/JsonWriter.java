package com.badlogic.gdx.utils;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class JsonWriter extends Writer {
    private JsonObject current;
    private boolean named;
    final Writer writer;
    private final Array<JsonObject> stack = new Array<>();
    private OutputType outputType = OutputType.json;
    private boolean quoteLongValues = false;

    /* JADX INFO: renamed from: com.badlogic.gdx.utils.JsonWriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$utils$JsonWriter$OutputType;

        static {
            int[] iArr = new int[OutputType.values().length];
            $SwitchMap$com$badlogic$gdx$utils$JsonWriter$OutputType = iArr;
            try {
                iArr[OutputType.minimal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$utils$JsonWriter$OutputType[OutputType.javascript.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class JsonObject {
        final boolean array;
        boolean needsComma;

        public JsonObject(boolean z) throws IOException {
            this.array = z;
            JsonWriter.this.writer.write(z ? 91 : 123);
        }

        public void close() throws IOException {
            JsonWriter.this.writer.write(this.array ? 93 : EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE);
        }
    }

    public enum OutputType {
        json,
        javascript,
        minimal;

        private static Pattern javascriptPattern = Pattern.compile("^[a-zA-Z_$][a-zA-Z_$0-9]*$");
        private static Pattern minimalNamePattern = Pattern.compile("^[^\":,}/ ][^:]*$");
        private static Pattern minimalValuePattern = Pattern.compile("^[^\":,{\\[\\]/ ][^}\\],]*$");

        public String quoteName(String str) {
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.replace('\\', "\\\\").replace('\r', "\\r").replace('\n', "\\n").replace('\t', "\\t");
            int i = AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonWriter$OutputType[ordinal()];
            if (i != 1) {
                if (i == 2) {
                }
                return "\"" + stringBuilder.replace('\"', "\\\"").toString() + '\"';
            }
            if (!str.contains("//") && !str.contains("/*") && minimalNamePattern.matcher(stringBuilder).matches()) {
                return stringBuilder.toString();
            }
            if (javascriptPattern.matcher(stringBuilder).matches()) {
                return stringBuilder.toString();
            }
            return "\"" + stringBuilder.replace('\"', "\\\"").toString() + '\"';
        }

        public String quoteValue(@Null Object obj) {
            int length;
            if (obj == null) {
                return "null";
            }
            String string = obj.toString();
            if ((obj instanceof Number) || (obj instanceof Boolean)) {
                return string;
            }
            StringBuilder stringBuilder = new StringBuilder(string);
            stringBuilder.replace('\\', "\\\\").replace('\r', "\\r").replace('\n', "\\n").replace('\t', "\\t");
            if (this == minimal && !string.equals("true") && !string.equals("false") && !string.equals("null") && !string.contains("//") && !string.contains("/*") && (length = stringBuilder.length()) > 0 && stringBuilder.charAt(length - 1) != ' ' && minimalValuePattern.matcher(stringBuilder).matches()) {
                return stringBuilder.toString();
            }
            return "\"" + stringBuilder.replace('\"', "\\\"").toString() + '\"';
        }
    }

    public JsonWriter(Writer writer) {
        this.writer = writer;
    }

    private void requireCommaOrName() throws IOException {
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
            this.writer.write(44);
        } else {
            jsonObject.needsComma = true;
        }
    }

    public JsonWriter array() throws IOException {
        requireCommaOrName();
        Array<JsonObject> array = this.stack;
        JsonObject jsonObject = new JsonObject(true);
        this.current = jsonObject;
        array.add(jsonObject);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        while (this.stack.size > 0) {
            pop();
        }
        this.writer.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.writer.flush();
    }

    public Writer getWriter() {
        return this.writer;
    }

    public JsonWriter json(String str) throws IOException {
        requireCommaOrName();
        this.writer.write(str);
        return this;
    }

    public JsonWriter name(String str) throws IOException {
        JsonObject jsonObject = this.current;
        if (jsonObject == null || jsonObject.array) {
            throw new IllegalStateException("Current item must be an object.");
        }
        if (jsonObject.needsComma) {
            this.writer.write(44);
        } else {
            jsonObject.needsComma = true;
        }
        this.writer.write(this.outputType.quoteName(str));
        this.writer.write(58);
        this.named = true;
        return this;
    }

    public JsonWriter object() throws IOException {
        requireCommaOrName();
        Array<JsonObject> array = this.stack;
        JsonObject jsonObject = new JsonObject(false);
        this.current = jsonObject;
        array.add(jsonObject);
        return this;
    }

    public JsonWriter pop() throws IOException {
        if (this.named) {
            throw new IllegalStateException("Expected an object, array, or value since a name was set.");
        }
        this.stack.pop().close();
        Array<JsonObject> array = this.stack;
        this.current = array.size == 0 ? null : array.peek();
        return this;
    }

    public JsonWriter set(String str, Object obj) throws IOException {
        return name(str).value(obj);
    }

    public void setOutputType(OutputType outputType) {
        this.outputType = outputType;
    }

    public void setQuoteLongValues(boolean z) {
        this.quoteLongValues = z;
    }

    public JsonWriter value(@Null Object obj) throws IOException {
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
        this.writer.write(this.outputType.quoteValue(obj));
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        this.writer.write(cArr, i, i2);
    }

    public JsonWriter array(String str) throws IOException {
        return name(str).array();
    }

    public JsonWriter json(String str, String str2) throws IOException {
        return name(str).json(str2);
    }

    public JsonWriter object(String str) throws IOException {
        return name(str).object();
    }
}
