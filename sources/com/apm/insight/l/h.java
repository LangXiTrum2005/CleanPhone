package com.apm.insight.l;

import com.p004ironsource.d9;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Writer f10230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f10231b = new ArrayList();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10232a = new a("EMPTY_ARRAY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f10233b = new a("NONEMPTY_ARRAY", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f10234c = new a("EMPTY_OBJECT", 2);
        public static final a d = new a("DANGLING_KEY", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f10235e = new a("NONEMPTY_OBJECT", 4);
        public static final a f = new a("NULL", 5);

        private a(String str, int i2) {
            super(str, i2);
        }
    }

    private h(Writer writer) {
        this.f10230a = writer;
    }

    private h a() throws JSONException, IOException {
        return a(a.f10232a, d9.i.d);
    }

    private h b() throws JSONException, IOException {
        a aVar = a.f10232a;
        return a(d9.i.f24752e);
    }

    private h c() throws JSONException, IOException {
        return a(a.f10234c, "{");
    }

    private h d() throws JSONException, IOException {
        a aVar = a.f10232a;
        return a("}");
    }

    private a e() throws JSONException {
        return (a) androidx.media3.extractor.text.ttml.a.h(1, this.f10231b);
    }

    private void f() throws JSONException, IOException {
        if (this.f10231b.isEmpty()) {
            return;
        }
        a aVarE = e();
        if (aVarE == a.f10232a) {
            a(a.f10233b);
            return;
        }
        if (aVarE == a.f10233b) {
            this.f10230a.write(44);
        } else if (aVarE == a.d) {
            this.f10230a.write(":");
            a(a.f10235e);
        } else if (aVarE != a.f) {
            throw new JSONException("Nesting problem");
        }
    }

    public final String toString() {
        return "";
    }

    private h a(a aVar, String str) throws JSONException, IOException {
        f();
        this.f10231b.add(aVar);
        this.f10230a.write(str);
        return this;
    }

    private void b(String str) throws IOException {
        this.f10230a.write("\"");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\f') {
                this.f10230a.write("\\f");
            } else if (cCharAt != '\r') {
                if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        case '\b':
                            this.f10230a.write("\\b");
                            continue;
                        case '\t':
                            this.f10230a.write("\\t");
                            continue;
                        case '\n':
                            this.f10230a.write("\\n");
                            continue;
                        default:
                            if (cCharAt <= 31) {
                                this.f10230a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                            }
                            break;
                    }
                } else {
                    this.f10230a.write(92);
                }
                this.f10230a.write(cCharAt);
            } else {
                this.f10230a.write("\\r");
            }
        }
        this.f10230a.write("\"");
    }

    private h c(String str) throws JSONException, IOException {
        a aVarE = e();
        if (aVarE == a.f10235e) {
            this.f10230a.write(44);
        } else if (aVarE != a.f10234c) {
            throw new JSONException("Nesting problem");
        }
        a(a.d);
        b(str);
        return this;
    }

    private h a(String str) throws JSONException, IOException {
        e();
        List<a> list = this.f10231b;
        list.remove(list.size() - 1);
        this.f10230a.write(str);
        return this;
    }

    private void a(a aVar) {
        List<a> list = this.f10231b;
        list.set(list.size() - 1, aVar);
    }

    private h a(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            a((JSONArray) obj);
            return this;
        }
        if (obj instanceof JSONObject) {
            a((JSONObject) obj);
            return this;
        }
        f();
        if (obj != null && obj != JSONObject.NULL) {
            if (obj instanceof Boolean) {
                this.f10230a.write(String.valueOf(obj));
                return this;
            }
            if (obj instanceof Number) {
                this.f10230a.write(JSONObject.numberToString((Number) obj));
                return this;
            }
            b(obj.toString());
            return this;
        }
        this.f10230a.write(AbstractJsonLexerKt.NULL);
        return this;
    }

    public static void a(JSONObject jSONObject, Writer writer) throws Throwable {
        new h(writer).a(jSONObject);
        writer.flush();
    }

    public static void a(JSONArray jSONArray, Writer writer) throws Throwable {
        new h(writer).a(jSONArray);
        writer.flush();
    }

    private void a(JSONObject jSONObject) throws JSONException, IOException {
        c();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            c(next).a(jSONObject.get(next));
        }
        d();
    }

    private void a(JSONArray jSONArray) throws JSONException, IOException {
        a();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            a(jSONArray.get(i2));
        }
        b();
    }
}
