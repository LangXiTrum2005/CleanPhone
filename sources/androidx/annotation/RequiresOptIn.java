package androidx.annotation;

import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0014\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/annotation/RequiresOptIn;", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "Landroidx/annotation/RequiresOptIn$Level;", PglCryptUtils.KEY_MESSAGE, "", "()Landroidx/annotation/RequiresOptIn$Level;", "()Ljava/lang/String;", "Level", "annotation-experimental_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention
public @interface RequiresOptIn {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/annotation/RequiresOptIn$Level;", "", "annotation-experimental_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Level {
        public static final Level X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Level f3271Y;
        public static final /* synthetic */ Level[] Z;
        public static final /* synthetic */ EnumEntries e0;

        static {
            Level level = new Level("WARNING", 0);
            X = level;
            Level level2 = new Level("ERROR", 1);
            f3271Y = level2;
            Level[] levelArr = {level, level2};
            Z = levelArr;
            e0 = EnumEntriesKt.a(levelArr);
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) Z.clone();
        }
    }

    Level level() default Level.f3271Y;

    String message() default "";
}
