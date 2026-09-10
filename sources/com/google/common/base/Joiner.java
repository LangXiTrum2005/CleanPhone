package com.google.common.base;

import com.p004ironsource.d9;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class Joiner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19708a;

    /* JADX INFO: renamed from: com.google.common.base.Joiner$2, reason: invalid class name */
    class AnonymousClass2 extends Joiner {
        @Override // com.google.common.base.Joiner
        public final void a(StringBuilder sb, Iterator it) {
            Preconditions.j(it, "parts");
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw null;
                }
            }
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw null;
                }
            }
        }

        @Override // com.google.common.base.Joiner
        public final Joiner f() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Joiner$3, reason: invalid class name */
    class AnonymousClass3 extends AbstractList<Object> {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            if (i2 == 0 || i2 == 1) {
                return null;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    public static final class MapJoiner {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Joiner f19710a;

        public MapJoiner(Joiner joiner) {
            this.f19710a = joiner;
        }

        public final void a(StringBuilder sb, Iterator it) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                Joiner joiner = this.f19710a;
                sb.append(joiner.e(key));
                sb.append(d9.i.f24747b);
                sb.append(joiner.e(entry.getValue()));
                while (it.hasNext()) {
                    sb.append((CharSequence) joiner.f19708a);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb.append(joiner.e(entry2.getKey()));
                    sb.append(d9.i.f24747b);
                    sb.append(joiner.e(entry2.getValue()));
                }
            }
        }
    }

    public Joiner(String str) {
        str.getClass();
        this.f19708a = str;
    }

    public static Joiner d(char c2) {
        return new Joiner(String.valueOf(c2));
    }

    public void a(StringBuilder sb, Iterator it) {
        if (it.hasNext()) {
            sb.append(e(it.next()));
            while (it.hasNext()) {
                sb.append((CharSequence) this.f19708a);
                sb.append(e(it.next()));
            }
        }
    }

    public final void b(StringBuilder sb, Iterator it) {
        try {
            a(sb, it);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String c(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        b(sb, it);
        return sb.toString();
    }

    public CharSequence e(Object obj) {
        java.util.Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public Joiner f() {
        return new Joiner(this) { // from class: com.google.common.base.Joiner.1
            @Override // com.google.common.base.Joiner
            public final CharSequence e(Object obj) {
                return obj == null ? AbstractJsonLexerKt.NULL : Joiner.this.e(obj);
            }

            @Override // com.google.common.base.Joiner
            public final Joiner f() {
                throw null;
            }
        };
    }

    public Joiner(Joiner joiner) {
        this.f19708a = joiner.f19708a;
    }
}
