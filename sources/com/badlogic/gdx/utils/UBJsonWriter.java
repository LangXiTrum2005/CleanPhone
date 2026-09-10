package com.badlogic.gdx.utils;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class UBJsonWriter implements Closeable {
    private JsonObject current;
    private boolean named;
    final DataOutputStream out;
    private final Array<JsonObject> stack = new Array<>();

    public class JsonObject {
        final boolean array;

        public JsonObject(boolean z) throws IOException {
            this.array = z;
            UBJsonWriter.this.out.writeByte(z ? 91 : 123);
        }

        public void close() throws IOException {
            UBJsonWriter.this.out.writeByte(this.array ? 93 : EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE);
        }
    }

    public UBJsonWriter(OutputStream outputStream) {
        this.out = (DataOutputStream) (outputStream instanceof DataOutputStream ? outputStream : new DataOutputStream(outputStream));
    }

    private void checkName() {
        JsonObject jsonObject = this.current;
        if (jsonObject == null || jsonObject.array) {
            return;
        }
        if (!this.named) {
            throw new IllegalStateException("Name must be set.");
        }
        this.named = false;
    }

    public UBJsonWriter array() throws IOException {
        JsonObject jsonObject = this.current;
        if (jsonObject != null && !jsonObject.array) {
            if (!this.named) {
                throw new IllegalStateException("Name must be set.");
            }
            this.named = false;
        }
        Array<JsonObject> array = this.stack;
        JsonObject jsonObject2 = new JsonObject(true);
        this.current = jsonObject2;
        array.add(jsonObject2);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        while (this.stack.size > 0) {
            pop();
        }
        this.out.close();
    }

    public void flush() throws IOException {
        this.out.flush();
    }

    public UBJsonWriter name(String str) throws IOException {
        JsonObject jsonObject = this.current;
        if (jsonObject == null || jsonObject.array) {
            throw new IllegalStateException("Current item must be an object.");
        }
        byte[] bytes = str.getBytes(C.UTF8_NAME);
        if (bytes.length <= 127) {
            this.out.writeByte(105);
            this.out.writeByte(bytes.length);
        } else if (bytes.length <= 32767) {
            this.out.writeByte(73);
            this.out.writeShort(bytes.length);
        } else {
            this.out.writeByte(108);
            this.out.writeInt(bytes.length);
        }
        this.out.write(bytes);
        this.named = true;
        return this;
    }

    public UBJsonWriter object() throws IOException {
        JsonObject jsonObject = this.current;
        if (jsonObject != null && !jsonObject.array) {
            if (!this.named) {
                throw new IllegalStateException("Name must be set.");
            }
            this.named = false;
        }
        Array<JsonObject> array = this.stack;
        JsonObject jsonObject2 = new JsonObject(false);
        this.current = jsonObject2;
        array.add(jsonObject2);
        return this;
    }

    public UBJsonWriter pop() throws IOException {
        return pop(false);
    }

    public UBJsonWriter set(String str, byte b) throws IOException {
        return name(str).value(b);
    }

    public UBJsonWriter value(byte b) throws IOException {
        checkName();
        this.out.writeByte(105);
        this.out.writeByte(b);
        return this;
    }

    public UBJsonWriter pop(boolean z) throws IOException {
        if (this.named) {
            throw new IllegalStateException("Expected an object, array, or value since a name was set.");
        }
        if (z) {
            this.stack.pop();
        } else {
            this.stack.pop().close();
        }
        Array<JsonObject> array = this.stack;
        this.current = array.size == 0 ? null : array.peek();
        return this;
    }

    public UBJsonWriter set(String str, short s) throws IOException {
        return name(str).value(s);
    }

    public UBJsonWriter set(String str, int i) throws IOException {
        return name(str).value(i);
    }

    public UBJsonWriter set(String str, long j) throws IOException {
        return name(str).value(j);
    }

    public UBJsonWriter value(short s) throws IOException {
        checkName();
        this.out.writeByte(73);
        this.out.writeShort(s);
        return this;
    }

    public UBJsonWriter set(String str, float f) throws IOException {
        return name(str).value(f);
    }

    public UBJsonWriter set(String str, double d) throws IOException {
        return name(str).value(d);
    }

    public UBJsonWriter array(String str) throws IOException {
        name(str).array();
        return this;
    }

    public UBJsonWriter object(String str) throws IOException {
        name(str).object();
        return this;
    }

    public UBJsonWriter set(String str, boolean z) throws IOException {
        return name(str).value(z);
    }

    public UBJsonWriter value(int i) throws IOException {
        checkName();
        this.out.writeByte(108);
        this.out.writeInt(i);
        return this;
    }

    public UBJsonWriter set(String str, char c) throws IOException {
        return name(str).value(c);
    }

    public UBJsonWriter set(String str, String str2) throws IOException {
        return name(str).value(str2);
    }

    public UBJsonWriter set(String str, byte[] bArr) throws IOException {
        return name(str).value(bArr);
    }

    public UBJsonWriter value(long j) throws IOException {
        checkName();
        this.out.writeByte(76);
        this.out.writeLong(j);
        return this;
    }

    public UBJsonWriter set(String str, short[] sArr) throws IOException {
        return name(str).value(sArr);
    }

    public UBJsonWriter set(String str, int[] iArr) throws IOException {
        return name(str).value(iArr);
    }

    public UBJsonWriter set(String str, long[] jArr) throws IOException {
        return name(str).value(jArr);
    }

    public UBJsonWriter value(float f) throws IOException {
        checkName();
        this.out.writeByte(100);
        this.out.writeFloat(f);
        return this;
    }

    public UBJsonWriter set(String str, float[] fArr) throws IOException {
        return name(str).value(fArr);
    }

    public UBJsonWriter set(String str, double[] dArr) throws IOException {
        return name(str).value(dArr);
    }

    public UBJsonWriter set(String str, boolean[] zArr) throws IOException {
        return name(str).value(zArr);
    }

    public UBJsonWriter value(double d) throws IOException {
        checkName();
        this.out.writeByte(68);
        this.out.writeDouble(d);
        return this;
    }

    public UBJsonWriter set(String str, char[] cArr) throws IOException {
        return name(str).value(cArr);
    }

    public UBJsonWriter set(String str, String[] strArr) throws IOException {
        return name(str).value(strArr);
    }

    public UBJsonWriter set(String str) throws IOException {
        return name(str).value();
    }

    public UBJsonWriter value(boolean z) throws IOException {
        checkName();
        this.out.writeByte(z ? 84 : 70);
        return this;
    }

    public UBJsonWriter value(char c) throws IOException {
        checkName();
        this.out.writeByte(73);
        this.out.writeChar(c);
        return this;
    }

    public UBJsonWriter value(String str) throws IOException {
        checkName();
        byte[] bytes = str.getBytes(C.UTF8_NAME);
        this.out.writeByte(83);
        if (bytes.length <= 127) {
            this.out.writeByte(105);
            this.out.writeByte(bytes.length);
        } else if (bytes.length <= 32767) {
            this.out.writeByte(73);
            this.out.writeShort(bytes.length);
        } else {
            this.out.writeByte(108);
            this.out.writeInt(bytes.length);
        }
        this.out.write(bytes);
        return this;
    }

    public UBJsonWriter value(byte[] bArr) throws IOException {
        array();
        this.out.writeByte(36);
        this.out.writeByte(105);
        this.out.writeByte(35);
        value(bArr.length);
        for (byte b : bArr) {
            this.out.writeByte(b);
        }
        pop(true);
        return this;
    }

    public UBJsonWriter value(short[] sArr) throws IOException {
        array();
        this.out.writeByte(36);
        this.out.writeByte(73);
        this.out.writeByte(35);
        value(sArr.length);
        for (short s : sArr) {
            this.out.writeShort(s);
        }
        pop(true);
        return this;
    }

    public UBJsonWriter value(int[] iArr) throws IOException {
        array();
        this.out.writeByte(36);
        this.out.writeByte(108);
        this.out.writeByte(35);
        value(iArr.length);
        for (int i : iArr) {
            this.out.writeInt(i);
        }
        pop(true);
        return this;
    }

    public UBJsonWriter value(long[] jArr) throws IOException {
        array();
        this.out.writeByte(36);
        this.out.writeByte(76);
        this.out.writeByte(35);
        value(jArr.length);
        for (long j : jArr) {
            this.out.writeLong(j);
        }
        pop(true);
        return this;
    }

    public UBJsonWriter value(float[] fArr) throws IOException {
        array();
        this.out.writeByte(36);
        this.out.writeByte(100);
        this.out.writeByte(35);
        value(fArr.length);
        for (float f : fArr) {
            this.out.writeFloat(f);
        }
        pop(true);
        return this;
    }

    public UBJsonWriter value(double[] dArr) throws IOException {
        array();
        this.out.writeByte(36);
        this.out.writeByte(68);
        this.out.writeByte(35);
        value(dArr.length);
        for (double d : dArr) {
            this.out.writeDouble(d);
        }
        pop(true);
        return this;
    }

    public UBJsonWriter value(boolean[] zArr) throws IOException {
        array();
        for (boolean z : zArr) {
            this.out.writeByte(z ? 84 : 70);
        }
        pop();
        return this;
    }

    public UBJsonWriter value(char[] cArr) throws IOException {
        array();
        this.out.writeByte(36);
        this.out.writeByte(67);
        this.out.writeByte(35);
        value(cArr.length);
        for (char c : cArr) {
            this.out.writeChar(c);
        }
        pop(true);
        return this;
    }

    public UBJsonWriter value(String[] strArr) throws IOException {
        array();
        this.out.writeByte(36);
        this.out.writeByte(83);
        this.out.writeByte(35);
        value(strArr.length);
        for (String str : strArr) {
            byte[] bytes = str.getBytes(C.UTF8_NAME);
            if (bytes.length <= 127) {
                this.out.writeByte(105);
                this.out.writeByte(bytes.length);
            } else if (bytes.length <= 32767) {
                this.out.writeByte(73);
                this.out.writeShort(bytes.length);
            } else {
                this.out.writeByte(108);
                this.out.writeInt(bytes.length);
            }
            this.out.write(bytes);
        }
        pop(true);
        return this;
    }

    public UBJsonWriter value(JsonValue jsonValue) throws IOException {
        if (jsonValue.isObject()) {
            String str = jsonValue.name;
            if (str != null) {
                object(str);
            } else {
                object();
            }
            for (JsonValue jsonValue2 = jsonValue.child; jsonValue2 != null; jsonValue2 = jsonValue2.next) {
                value(jsonValue2);
            }
            pop();
        } else if (jsonValue.isArray()) {
            String str2 = jsonValue.name;
            if (str2 != null) {
                array(str2);
            } else {
                array();
            }
            for (JsonValue jsonValue3 = jsonValue.child; jsonValue3 != null; jsonValue3 = jsonValue3.next) {
                value(jsonValue3);
            }
            pop();
        } else if (jsonValue.isBoolean()) {
            String str3 = jsonValue.name;
            if (str3 != null) {
                name(str3);
            }
            value(jsonValue.asBoolean());
        } else if (jsonValue.isDouble()) {
            String str4 = jsonValue.name;
            if (str4 != null) {
                name(str4);
            }
            value(jsonValue.asDouble());
        } else if (jsonValue.isLong()) {
            String str5 = jsonValue.name;
            if (str5 != null) {
                name(str5);
            }
            value(jsonValue.asLong());
        } else if (jsonValue.isString()) {
            String str6 = jsonValue.name;
            if (str6 != null) {
                name(str6);
            }
            value(jsonValue.asString());
        } else if (jsonValue.isNull()) {
            String str7 = jsonValue.name;
            if (str7 != null) {
                name(str7);
            }
            value();
        } else {
            throw new IOException("Unhandled JsonValue type");
        }
        return this;
    }

    public UBJsonWriter value(Object obj) throws IOException {
        if (obj == null) {
            return value();
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (obj instanceof Byte) {
                return value(number.byteValue());
            }
            if (obj instanceof Short) {
                return value(number.shortValue());
            }
            if (obj instanceof Integer) {
                return value(number.intValue());
            }
            if (obj instanceof Long) {
                return value(number.longValue());
            }
            if (obj instanceof Float) {
                return value(number.floatValue());
            }
            return obj instanceof Double ? value(number.doubleValue()) : this;
        }
        if (obj instanceof Character) {
            return value(((Character) obj).charValue());
        }
        if (obj instanceof CharSequence) {
            return value(obj.toString());
        }
        throw new IOException("Unknown object type.");
    }

    public UBJsonWriter value() throws IOException {
        checkName();
        this.out.writeByte(90);
        return this;
    }
}
