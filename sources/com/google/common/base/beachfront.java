package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Joiner.java */
/* JADX INFO: loaded from: classes3.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f21525attabal;

    public beachfront(String str) {
        this.f21525attabal = (String) formularize.triweekly(str);
    }

    public static beachfront beachfront(char c) {
        return new beachfront(String.valueOf(c));
    }

    public static beachfront competently(String str) {
        return new beachfront(str);
    }

    public <A extends Appendable> A attabal(A a, Iterator<? extends Object> it) throws IOException {
        formularize.triweekly(a);
        if (it.hasNext()) {
            a.append(impromptu(it.next()));
            while (it.hasNext()) {
                a.append(this.f21525attabal);
                a.append(impromptu(it.next()));
            }
        }
        return a;
    }

    public final StringBuilder dern(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            attabal(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public CharSequence impromptu(@CheckForNull Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String marial(Iterator<? extends Object> it) {
        return dern(new StringBuilder(), it).toString();
    }

    public final StringBuilder saneness(StringBuilder sb, Iterable<? extends Object> iterable) {
        return dern(sb, iterable.iterator());
    }

    public final String wireman(Iterable<? extends Object> iterable) {
        return marial(iterable.iterator());
    }
}
