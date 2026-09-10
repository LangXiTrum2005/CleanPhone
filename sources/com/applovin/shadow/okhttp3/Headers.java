package com.applovin.shadow.okhttp3;

import an.h;
import an.p;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.DatesKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import go.k;
import java.time.Instant;
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
import kk.a;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import wj.f;
import xj.t;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 32\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u000243B\u0017\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\"\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020!H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b0/¢\u0006\u0004\b0\u00101R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u00065"}, d2 = {"Lcom/applovin/shadow/okhttp3/Headers;", "", "Lwj/f;", "", "", "namesAndValues", "<init>", "([Ljava/lang/String;)V", "name", "get", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Date;", "getDate", "(Ljava/lang/String;)Ljava/util/Date;", "Ljava/time/Instant;", "getInstant", "(Ljava/lang/String;)Ljava/time/Instant;", "", "-deprecated_size", "()I", "size", "index", "(I)Ljava/lang/String;", X3.i.X, "", "names", "()Ljava/util/Set;", "", "values", "(Ljava/lang/String;)Ljava/util/List;", "", "byteCount", "()J", "", "iterator", "()Ljava/util/Iterator;", "Lcom/applovin/shadow/okhttp3/Headers$Builder;", "newBuilder", "()Lcom/applovin/shadow/okhttp3/Headers$Builder;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "", "toMultimap", "()Ljava/util/Map;", "[Ljava/lang/String;", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Headers implements Iterable<f>, a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String[] namesAndValues;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0010J\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0086\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0087\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rH\u0086\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/applovin/shadow/okhttp3/Headers$Builder;", "", "()V", "namesAndValues", "", "", "getNamesAndValues$okhttp", "()Ljava/util/List;", "add", "line", "name", X3.i.X, "Ljava/time/Instant;", "Ljava/util/Date;", "addAll", "headers", "Lcom/applovin/shadow/okhttp3/Headers;", "addLenient", "addLenient$okhttp", "addUnsafeNonAscii", InAppPurchaseConstants.METHOD_BUILD, "get", "removeAll", "set", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String line) {
            n.f(line, "line");
            int iV0 = h.v0(line, ':', 0, 6);
            if (iV0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(line).toString());
            }
            String strSubstring = line.substring(0, iV0);
            n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = h.T0(strSubstring).toString();
            String strSubstring2 = line.substring(iV0 + 1);
            n.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        public final Builder addAll(Headers headers) {
            n.f(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                addLenient$okhttp(headers.name(i10), headers.value(i10));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String line) {
            n.f(line, "line");
            int iV0 = h.v0(line, ':', 1, 4);
            if (iV0 != -1) {
                String strSubstring = line.substring(0, iV0);
                n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iV0 + 1);
                n.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                addLenient$okhttp("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            n.e(strSubstring3, "this as java.lang.String).substring(startIndex)");
            addLenient$okhttp("", strSubstring3);
            return this;
        }

        public final Builder addUnsafeNonAscii(String name, String value) {
            n.f(name, "name");
            n.f(value, "value");
            Headers.INSTANCE.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final String get(String name) {
            n.f(name, "name");
            int size = this.namesAndValues.size() - 2;
            int iJ = k.J(size, 0, -2);
            if (iJ > size) {
                return null;
            }
            while (!name.equalsIgnoreCase(this.namesAndValues.get(size))) {
                if (size == iJ) {
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
            n.f(name, "name");
            int i10 = 0;
            while (i10 < this.namesAndValues.size()) {
                if (name.equalsIgnoreCase(this.namesAndValues.get(i10))) {
                    this.namesAndValues.remove(i10);
                    this.namesAndValues.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final Builder set(String name, Date value) {
            n.f(name, "name");
            n.f(value, "value");
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String name, Instant value) {
            n.f(name, "name");
            n.f(value, "value");
            return set(name, new Date(value.toEpochMilli()));
        }

        public final Builder set(String name, String value) {
            n.f(name, "name");
            n.f(value, "value");
            Companion companion = Headers.INSTANCE;
            companion.checkName(name);
            companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder add(String name, String value) {
            n.f(name, "name");
            n.f(value, "value");
            Companion companion = Headers.INSTANCE;
            companion.checkName(name);
            companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder add(String name, Date value) {
            n.f(name, "name");
            n.f(value, "value");
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        public final Builder addLenient$okhttp(String name, String value) {
            n.f(name, "name");
            n.f(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(h.T0(value).toString());
            return this;
        }

        @IgnoreJRERequirement
        public final Builder add(String name, Instant value) {
            n.f(name, "name");
            n.f(value, "value");
            add(name, new Date(value.toEpochMilli()));
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0013J#\u0010\u0018\u001a\u00020\u00112\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\u0017J#\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/applovin/shadow/okhttp3/Headers$Companion;", "", "<init>", "()V", "", "", "namesAndValues", "name", "get", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lwj/r;", "checkName", "(Ljava/lang/String;)V", X3.i.X, "checkValue", "(Ljava/lang/String;Ljava/lang/String;)V", "", "Lcom/applovin/shadow/okhttp3/Headers;", "of", "(Ljava/util/Map;)Lcom/applovin/shadow/okhttp3/Headers;", "toHeaders", "headers", "-deprecated_of", "([Ljava/lang/String;)Lxn/l;", "headersOf", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String name) {
            if (name.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = name.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = name.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), name).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String value, String name) {
            int length = value.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = value.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), name));
                    sb2.append(Util.isSensitiveHeader(name) ? "" : ": ".concat(value));
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] namesAndValues, String name) {
            int length = namesAndValues.length - 2;
            int iJ = k.J(length, 0, -2);
            if (iJ > length) {
                return null;
            }
            while (!p.i0(name, namesAndValues[length])) {
                if (length == iJ) {
                    return null;
                }
                length -= 2;
            }
            return namesAndValues[length + 1];
        }

        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m51deprecated_of(String... namesAndValues) {
            n.f(namesAndValues, "namesAndValues");
            return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        public final Headers of(String... namesAndValues) {
            n.f(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i11] = h.T0(str).toString();
            }
            int iJ = k.J(0, strArr.length - 1, 2);
            if (iJ >= 0) {
                while (true) {
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i10 == iJ) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new Headers(strArr, null);
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m50deprecated_of(Map<String, String> headers) {
            n.f(headers, "headers");
            return of(headers);
        }

        public final Headers of(Map<String, String> map) {
            n.f(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = h.T0(key).toString();
                String string2 = h.T0(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, g gVar) {
        this(strArr);
    }

    public static final Headers of(Map<String, String> map) {
        return INSTANCE.of(map);
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m49deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i10 = 0; i10 < length2; i10++) {
            length += (long) this.namesAndValues[i10].length();
        }
        return length;
    }

    public boolean equals(Object other) {
        return (other instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) other).namesAndValues);
    }

    public final String get(String name) {
        n.f(name, "name");
        return INSTANCE.get(this.namesAndValues, name);
    }

    public final Date getDate(String name) {
        n.f(name, "name");
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String name) {
        n.f(name, "name");
        Date date = getDate(name);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<f> iterator() {
        int size = size();
        f[] fVarArr = new f[size];
        for (int i10 = 0; i10 < size; i10++) {
            fVarArr[i10] = new f(name(i10), value(i10));
        }
        return m.a(fVarArr);
    }

    public final String name(int index) {
        return this.namesAndValues[index * 2];
    }

    public final Set<String> names() {
        p.j0();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(name(i10));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        n.e(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        t.b0(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        p.j0();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = name(i10);
            Locale US = Locale.US;
            n.e(US, "US");
            String lowerCase = strName.toLowerCase(US);
            n.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i10));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = name(i10);
            String strValue = value(i10);
            sb2.append(strName);
            sb2.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb2.append(strValue);
            sb2.append("\n");
        }
        String string = sb2.toString();
        n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String value(int index) {
        return this.namesAndValues[(index * 2) + 1];
    }

    public final List<String> values(String name) {
        n.f(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (name.equalsIgnoreCase(name(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i10));
            }
        }
        if (arrayList == null) {
            return v.f53866a;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        n.e(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public static final Headers of(String... strArr) {
        return INSTANCE.of(strArr);
    }
}
