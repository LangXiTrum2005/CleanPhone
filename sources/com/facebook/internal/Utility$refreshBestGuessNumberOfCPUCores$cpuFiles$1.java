package com.facebook.internal;

import com.p004ironsource.vc;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dir", "Ljava/io/File;", "kotlin.jvm.PlatformType", vc.c.f27494b, "", "accept"}, k = 3, mv = {1, 5, 1})
final class Utility$refreshBestGuessNumberOfCPUCores$cpuFiles$1 implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Utility$refreshBestGuessNumberOfCPUCores$cpuFiles$1 f16386a = new Utility$refreshBestGuessNumberOfCPUCores$cpuFiles$1();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }
}
