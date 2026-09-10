package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class mf {
    public final String a(File htmlFile, String params, String adm) {
        Intrinsics.f(htmlFile, "htmlFile");
        Intrinsics.f(params, "params");
        Intrinsics.f(adm, "adm");
        try {
            return StringsKt.I(StringsKt.I(FilesKt.d(htmlFile, Charsets.f44691a), "\"{% params %}\"", params), "{% adm %}", adm);
        } catch (Exception e2) {
            za.b("Parse sdk bidding template exception", e2);
            return null;
        }
    }
}
