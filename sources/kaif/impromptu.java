package kaif;

import com.google.common.base.formularize;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PatternFilenameFilter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class impromptu implements FilenameFilter {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Pattern f29046attabal;

    public impromptu(String str) {
        this(Pattern.compile(str));
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.f29046attabal.matcher(str).matches();
    }

    public impromptu(Pattern pattern) {
        this.f29046attabal = (Pattern) formularize.triweekly(pattern);
    }
}
