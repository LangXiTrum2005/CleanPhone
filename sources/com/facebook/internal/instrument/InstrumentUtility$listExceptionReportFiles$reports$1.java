package com.facebook.internal.instrument;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "name", "", "accept"}, k = 3, mv = {1, 5, 1})
final class InstrumentUtility$listExceptionReportFiles$reports$1 implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InstrumentUtility$listExceptionReportFiles$reports$1 f16423a = new InstrumentUtility$listExceptionReportFiles$reports$1();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        Intrinsics.e(name, "name");
        return new Regex(String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3))).b(name);
    }
}
