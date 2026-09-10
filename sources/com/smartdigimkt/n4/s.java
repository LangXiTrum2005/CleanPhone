package com.smartdigimkt.n4;

import android.text.TextUtils;
import com.smartdigimkt.p4.f0;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface s extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.smartdigimkt.p4.u<String> f37054a = new a();

    public class a implements com.smartdigimkt.p4.u<String> {
        @Override // com.smartdigimkt.p4.u
        public boolean a(String str) {
            String strK = f0.k(str);
            if (TextUtils.isEmpty(strK)) {
                return false;
            }
            return ((strK.contains("text") && !strK.contains("text/vtt")) || strK.contains("html") || strK.contains("xml")) ? false : true;
        }
    }

    public static abstract class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f37055a = new g();

        public abstract s a(g gVar);

        @Override // com.smartdigimkt.n4.s.c
        @Deprecated
        public final void b() {
            this.f37055a.a();
        }

        @Override // com.smartdigimkt.n4.s.c
        public final g c() {
            return this.f37055a;
        }

        @Override // com.smartdigimkt.n4.s.c, com.smartdigimkt.n4.h.a
        public final s a() {
            return a(this.f37055a);
        }

        @Override // com.smartdigimkt.n4.s.c
        @Deprecated
        public final void a(String str, String str2) {
            this.f37055a.a(str, str2);
        }

        @Override // com.smartdigimkt.n4.s.c
        @Deprecated
        public final void a(String str) {
            this.f37055a.a(str);
        }
    }

    public interface c extends h.a {
        @Override // com.smartdigimkt.n4.h.a
        s a();

        @Deprecated
        void a(String str);

        @Deprecated
        void a(String str, String str2);

        @Deprecated
        void b();

        g c();
    }

    public static final class e extends d {
        public final String f;

        public e(String str, k kVar) {
            super(android.support.v4.media.a.C("Invalid content type: ", str), kVar, 1);
            this.f = str;
        }
    }

    public static final class f extends d {
        public final int f;
        public final Map<String, List<String>> g;

        public f(int i2, Map<String, List<String>> map, k kVar) {
            super(android.support.v4.media.a.h(i2, "Response code: "), kVar, 1);
            this.f = i2;
            this.g = map;
        }
    }

    @Override // com.smartdigimkt.n4.h
    int a(byte[] bArr, int i2, int i3) throws d;

    @Override // com.smartdigimkt.n4.h
    long a(k kVar) throws d;

    Map<String, List<String>> a();

    void a(String str);

    void a(String str, String str2);

    void b();

    @Override // com.smartdigimkt.n4.h
    void close() throws d;

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, String> f37060a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, String> f37061b;

        public synchronized void a(String str, String str2) {
            this.f37061b = null;
            this.f37060a.put(str, str2);
        }

        public synchronized void b(Map<String, String> map) {
            this.f37061b = null;
            this.f37060a.putAll(map);
        }

        public synchronized void a(Map<String, String> map) {
            this.f37061b = null;
            this.f37060a.clear();
            this.f37060a.putAll(map);
        }

        public synchronized Map<String, String> b() {
            try {
                if (this.f37061b == null) {
                    this.f37061b = Collections.unmodifiableMap(new HashMap(this.f37060a));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f37061b;
        }

        public synchronized void a(String str) {
            this.f37061b = null;
            this.f37060a.remove(str);
        }

        public synchronized void a() {
            this.f37061b = null;
            this.f37060a.clear();
        }
    }

    public static class d extends IOException {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f37056c = 1;
        public static final int d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f37057e = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f37058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f37059b;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public d(k kVar, int i2) {
            this.f37059b = kVar;
            this.f37058a = i2;
        }

        public d(String str, k kVar, int i2) {
            super(str);
            this.f37059b = kVar;
            this.f37058a = i2;
        }

        public d(IOException iOException, k kVar, int i2) {
            super(iOException);
            this.f37059b = kVar;
            this.f37058a = i2;
        }

        public d(String str, IOException iOException, k kVar, int i2) {
            super(str, iOException);
            this.f37059b = kVar;
            this.f37058a = i2;
        }
    }
}
