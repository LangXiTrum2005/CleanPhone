package androidx.sqlite.db;

import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "", "Companion", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SupportSQLiteQueryBuilder {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteQueryBuilder$Companion;", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "limitPattern", "Ljava/util/regex/Pattern;", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    }
}
