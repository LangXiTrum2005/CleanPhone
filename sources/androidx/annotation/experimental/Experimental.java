package androidx.annotation.experimental;

import com.applovin.sdk.AppLovinEventTypes;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Method from annotation default annotation not found: level */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/annotation/experimental/Experimental;", "", "Landroidx/annotation/experimental/Experimental$Level;", AppLovinEventTypes.USER_COMPLETED_LEVEL, "<init>", "(Landroidx/annotation/experimental/Experimental$Level;)V", "Level", "annotation-experimental_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
@kotlin.annotation.Target
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention
public @interface Experimental {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/annotation/experimental/Experimental$Level;", "", "annotation-experimental_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Level {
        public static final Level X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ Level[] f3274Y;
        public static final /* synthetic */ EnumEntries Z;

        /* JADX INFO: Fake field, exist only in values array */
        Level EF0;

        static {
            Level level = new Level("WARNING", 0);
            Level level2 = new Level("ERROR", 1);
            X = level2;
            Level[] levelArr = {level, level2};
            f3274Y = levelArr;
            Z = EnumEntriesKt.a(levelArr);
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) f3274Y.clone();
        }
    }
}
