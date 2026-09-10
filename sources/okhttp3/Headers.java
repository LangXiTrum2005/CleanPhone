package okhttp3;

import com.applovin.impl.Z;
import com.p004ironsource.x4;
import com.smartdigimkt.o1.b;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.services.core.network.core.OkHttp3Client;
import j$.time.Instant;
import j$.util.DateRetargetClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 32\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u000243B\u0017\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\"\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020!H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b0/¢\u0006\u0004\b0\u00101R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u00065"}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "", "namesAndValues", "<init>", "([Ljava/lang/String;)V", "name", "get", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Date;", "getDate", "(Ljava/lang/String;)Ljava/util/Date;", "j$/time/Instant", "getInstant", "(Ljava/lang/String;)Lj$/time/Instant;", "", "-deprecated_size", "()I", "size", "index", "(I)Ljava/lang/String;", "value", "", "names", "()Ljava/util/Set;", "", "values", "(Ljava/lang/String;)Ljava/util/List;", "", "byteCount", "()J", "", "iterator", "()Ljava/util/Iterator;", "Lokhttp3/Headers$Builder;", "newBuilder", "()Lokhttp3/Headers$Builder;", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "", "toMultimap", "()Ljava/util/Map;", "[Ljava/lang/String;", "Companion", "Builder", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String[] namesAndValues;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\fJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0012¢\u0006\u0004\b\t\u0010\u0013J\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\t\u0010\u0015J \u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0013J \u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0014H\u0087\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\fJ\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0007J \u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lokhttp3/Headers$Builder;", "", "<init>", "()V", "", "line", "addLenient$okhttp", "(Ljava/lang/String;)Lokhttp3/Headers$Builder;", "addLenient", b.y0, "name", "value", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "addUnsafeNonAscii", "Lokhttp3/Headers;", "headers", "addAll", "(Lokhttp3/Headers;)Lokhttp3/Headers$Builder;", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)Lokhttp3/Headers$Builder;", "j$/time/Instant", "(Ljava/lang/String;Lj$/time/Instant;)Lokhttp3/Headers$Builder;", "set", "removeAll", "get", "(Ljava/lang/String;)Ljava/lang/String;", "build", "()Lokhttp3/Headers;", "", "namesAndValues", "Ljava/util/List;", "getNamesAndValues$okhttp", "()Ljava/util/List;", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String line) {
            Intrinsics.f(line, "line");
            int iU = StringsKt.u(line, AbstractJsonLexerKt.COLON, 0, 6);
            if (iU == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(line).toString());
            }
            String strSubstring = line.substring(0, iU);
            Intrinsics.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = StringsKt.a0(strSubstring).toString();
            String strSubstring2 = line.substring(iU + 1);
            Intrinsics.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        public final Builder addAll(Headers headers) {
            Intrinsics.f(headers, "headers");
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                addLenient$okhttp(headers.name(i2), headers.value(i2));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String line) {
            Intrinsics.f(line, "line");
            int iU = StringsKt.u(line, AbstractJsonLexerKt.COLON, 1, 4);
            if (iU != -1) {
                String strSubstring = line.substring(0, iU);
                Intrinsics.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iU + 1);
                Intrinsics.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                addLenient$okhttp("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            Intrinsics.e(strSubstring3, "this as java.lang.String).substring(startIndex)");
            addLenient$okhttp("", strSubstring3);
            return this;
        }

        public final Builder addUnsafeNonAscii(String name, String value) {
            Intrinsics.f(name, "name");
            Intrinsics.f(value, "value");
            Headers.INSTANCE.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final String get(String name) {
            Intrinsics.f(name, "name");
            int size = this.namesAndValues.size() - 2;
            int iA = ProgressionUtilKt.a(size, 0, -2);
            if (iA > size) {
                return null;
            }
            while (!name.equalsIgnoreCase(this.namesAndValues.get(size))) {
                if (size == iA) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String name) {
            Intrinsics.f(name, "name");
            int i2 = 0;
            while (i2 < this.namesAndValues.size()) {
                if (name.equalsIgnoreCase(this.namesAndValues.get(i2))) {
                    this.namesAndValues.remove(i2);
                    this.namesAndValues.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        public final Builder set(String name, Date value) {
            Intrinsics.f(name, "name");
            Intrinsics.f(value, "value");
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }

        public final Builder set(String name, Instant value) {
            Intrinsics.f(name, "name");
            Intrinsics.f(value, "value");
            return set(name, new Date(value.toEpochMilli()));
        }

        public final Builder set(String name, String value) {
            Intrinsics.f(name, "name");
            Intrinsics.f(value, "value");
            Companion companion = Headers.INSTANCE;
            companion.checkName(name);
            companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder add(String name, String value) {
            Intrinsics.f(name, "name");
            Intrinsics.f(value, "value");
            Companion companion = Headers.INSTANCE;
            companion.checkName(name);
            companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder add(String name, Date value) {
            Intrinsics.f(name, "name");
            Intrinsics.f(value, "value");
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        public final Builder addLenient$okhttp(String name, String value) {
            Intrinsics.f(name, "name");
            Intrinsics.f(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(StringsKt.a0(value).toString());
            return this;
        }

        public final Builder add(String name, Instant value) {
            Intrinsics.f(name, "name");
            Intrinsics.f(value, "value");
            add(name, new Date(value.toEpochMilli()));
            return this;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J%\u0010\t\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u00020\u000e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0002\b\u0011J\u001d\u0010\u0014\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0002\b\u000f¨\u0006\u0015"}, d2 = {"Lokhttp3/Headers$Companion;", "", "()V", "checkName", "", "name", "", "checkValue", "value", "get", "namesAndValues", "", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "headersOf", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "-deprecated_of", "headers", "", "toHeaders", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String name) {
            if (name.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = name.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = name.charAt(i2);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), name).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String value, String name) {
            int length = value.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = value.charAt(i2);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i2), name));
                    sb.append(Util.isSensitiveHeader(name) ? "" : ": ".concat(value));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] namesAndValues, String name) {
            int length = namesAndValues.length - 2;
            int iA = ProgressionUtilKt.a(length, 0, -2);
            if (iA > length) {
                return null;
            }
            while (!StringsKt.r(name, namesAndValues[length], true)) {
                if (length == iA) {
                    return null;
                }
                length -= 2;
            }
            return namesAndValues[length + 1];
        }

        @Deprecated
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m3435deprecated_of(String... namesAndValues) {
            Intrinsics.f(namesAndValues, "namesAndValues");
            return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @JvmStatic
        public final Headers of(String... namesAndValues) {
            Intrinsics.f(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                String str = strArr[i3];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i3] = StringsKt.a0(str).toString();
            }
            int iA = ProgressionUtilKt.a(0, strArr.length - 1, 2);
            if (iA >= 0) {
                while (true) {
                    String str2 = strArr[i2];
                    String str3 = strArr[i2 + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i2 == iA) {
                        break;
                    }
                    i2 += 2;
                }
            }
            return new Headers(strArr, null);
        }

        private Companion() {
        }

        @Deprecated
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m3434deprecated_of(Map<String, String> headers) {
            Intrinsics.f(headers, "headers");
            return of(headers);
        }

        @JvmStatic
        public final Headers of(Map<String, String> map) {
            Intrinsics.f(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i2 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = StringsKt.a0(key).toString();
                String string2 = StringsKt.a0(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i2] = string;
                strArr[i2 + 1] = string2;
                i2 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    @JvmStatic
    public static final Headers of(Map<String, String> map) {
        return INSTANCE.of(map);
    }

    @Deprecated
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m3433deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            length += (long) this.namesAndValues[i2].length();
        }
        return length;
    }

    public boolean equals(Object other) {
        return (other instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) other).namesAndValues);
    }

    public final String get(String name) {
        Intrinsics.f(name, "name");
        return INSTANCE.get(this.namesAndValues, name);
    }

    public final Date getDate(String name) {
        Intrinsics.f(name, "name");
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    public final Instant getInstant(String name) {
        Intrinsics.f(name, "name");
        Date date = getDate(name);
        if (date != null) {
            return DateRetargetClass.toInstant(date);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i2 = 0; i2 < size; i2++) {
            pairArr[i2] = new Pair(name(i2), value(i2));
        }
        return ArrayIteratorKt.a(pairArr);
    }

    public final String name(int index) {
        return this.namesAndValues[index * 2];
    }

    public final Set<String> names() {
        StringsKt.s();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            treeSet.add(name(i2));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.e(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        CollectionsKt.h(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        StringsKt.s();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String strName = name(i2);
            Locale locale = Locale.US;
            String strP = Z.p(locale, "US", strName, locale, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(strP);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strP, arrayList);
            }
            arrayList.add(value(i2));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String strName = name(i2);
            String strValue = value(i2);
            sb.append(strName);
            sb.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb.append(strValue);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String value(int index) {
        return this.namesAndValues[(index * 2) + 1];
    }

    public final List<String> values(String name) {
        Intrinsics.f(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            if (name.equalsIgnoreCase(name(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i2));
            }
        }
        if (arrayList == null) {
            return EmptyList.X;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.e(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    @JvmStatic
    public static final Headers of(String... strArr) {
        return INSTANCE.of(strArr);
    }
}
