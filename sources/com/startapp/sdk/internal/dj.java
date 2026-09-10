package com.startapp.sdk.internal;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class dj implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f40919c = Pattern.compile("\\d{2}:\\d{2}:\\d{2}(.\\d{3})?");
    public static final Pattern d = Pattern.compile("((\\d{1,2})|(100))%");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Number f40921b;

    /* JADX WARN: Multi-variable type inference failed */
    public dj(String str, Comparable comparable) {
        this.f40920a = str;
        this.f40921b = (Number) comparable;
    }

    public static Integer a(String str) {
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length != 3) {
            return null;
        }
        try {
            return Integer.valueOf((Integer.parseInt(strArrSplit[1]) * 60000) + (Integer.parseInt(strArrSplit[0]) * 3600000) + ((int) (Float.parseFloat(strArrSplit[2]) * 1000.0f)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Comparable, java.lang.Number] */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f40921b.compareTo(((dj) obj).f40921b);
    }
}
