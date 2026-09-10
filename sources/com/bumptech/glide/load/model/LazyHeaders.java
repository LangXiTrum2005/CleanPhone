package com.bumptech.glide.load.model;

import android.support.v4.media.a;
import android.text.TextUtils;
import com.applovin.impl.Z;
import com.mbridge.msdk.foundation.download.Command;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class LazyHeaders implements Headers {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f12565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Map f12566c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map f12567a;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = property.charAt(i2);
                    if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                        sb.append(cCharAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put(Command.HTTP_HEADER_USER_AGENT, Collections.singletonList(new StringHeaderFactory(property)));
            }
            f12567a = Collections.unmodifiableMap(map);
        }
    }

    public static final class StringHeaderFactory implements LazyHeaderFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12568a;

        public StringHeaderFactory(String str) {
            this.f12568a = str;
        }

        @Override // com.bumptech.glide.load.model.LazyHeaderFactory
        public final String a() {
            return this.f12568a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof StringHeaderFactory) {
                return this.f12568a.equals(((StringHeaderFactory) obj).f12568a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f12568a.hashCode();
        }

        public final String toString() {
            return a.r(new StringBuilder("StringHeaderFactory{value='"), this.f12568a, "'}");
        }
    }

    public LazyHeaders(Map map) {
        this.f12565b = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f12565b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String strA = ((LazyHeaderFactory) list.get(i2)).a();
                if (!TextUtils.isEmpty(strA)) {
                    sb.append(strA);
                    if (i2 != list.size() - 1) {
                        sb.append(AbstractJsonLexerKt.COMMA);
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final Map b() {
        if (this.f12566c == null) {
            synchronized (this) {
                try {
                    if (this.f12566c == null) {
                        this.f12566c = Collections.unmodifiableMap(a());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f12566c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LazyHeaders) {
            return this.f12565b.equals(((LazyHeaders) obj).f12565b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12565b.hashCode();
    }

    public final String toString() {
        return Z.o(new StringBuilder("LazyHeaders{headers="), this.f12565b, AbstractJsonLexerKt.END_OBJ);
    }
}
