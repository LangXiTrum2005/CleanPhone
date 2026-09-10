package com.chartboost.sdk.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g3 f13982a = new g3();

    public static final List a(File file, boolean z2) {
        if (file == null) {
            return EmptyList.X;
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && !Intrinsics.a(file2.getName(), ".nomedia")) {
                    arrayList.add(file2);
                } else if (file2.isDirectory() && z2) {
                    arrayList.addAll(a(file2, z2));
                }
            }
        }
        return arrayList;
    }

    public static final String b() {
        return "Chartboost-Android-SDK  9.10.2";
    }

    public static final String a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ZZZZ", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(new Date());
        Intrinsics.e(str, "format(...)");
        return str;
    }
}
