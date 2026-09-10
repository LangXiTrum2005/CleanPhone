package com.apm.insight.l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static DateFormat f10217a;

    public static DateFormat a() {
        if (f10217a == null) {
            f10217a = new SimpleDateFormat(com.smartdigimkt.n8.g.f37185a, Locale.getDefault());
        }
        return f10217a;
    }
}
