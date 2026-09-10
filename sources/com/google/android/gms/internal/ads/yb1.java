package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yb1 implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f22211a;

    public yb1(Pattern pattern) {
        pattern.getClass();
        this.f22211a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f22211a.matcher(str).matches();
    }
}
