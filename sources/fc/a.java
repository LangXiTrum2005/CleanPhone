package fc;

import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40766a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        switch (this.f40766a) {
            case 0:
                return name.startsWith(NotificationCompat.CATEGORY_EVENT);
            case 1:
                return name.startsWith(NotificationCompat.CATEGORY_EVENT) && !name.endsWith("_");
            case 2:
                return Pattern.matches("cpu[0-9]+", name);
            case 3:
                n.e(name, "name");
                Pattern patternCompile = Pattern.compile(String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3)));
                n.e(patternCompile, "compile(...)");
                return patternCompile.matcher(name).matches();
            case 4:
                n.e(name, "name");
                Pattern patternCompile2 = Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1)));
                n.e(patternCompile2, "compile(...)");
                return patternCompile2.matcher(name).matches();
            case 5:
                n.e(name, "name");
                Pattern patternCompile3 = Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1)));
                n.e(patternCompile3, "compile(...)");
                return patternCompile3.matcher(name).matches();
            case 6:
                n.e(name, "name");
                Pattern patternCompile4 = Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1)));
                n.e(patternCompile4, "compile(...)");
                return patternCompile4.matcher(name).matches();
            case 7:
                return name.startsWith("aqs.");
            case 8:
                return name.startsWith(".ae");
            default:
                return List.of("trigger-type-anomaly", "trigger-type-oom").contains(name);
        }
    }
}
