package org.jetbrains.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: capitalization */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE, ElementType.TYPE, ElementType.PACKAGE})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface Nls {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Capitalization {
        public static final Capitalization X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ Capitalization[] f45279Y;

        static {
            Capitalization capitalization = new Capitalization("NotSpecified", 0);
            X = capitalization;
            f45279Y = new Capitalization[]{capitalization, new Capitalization("Title", 1), new Capitalization("Sentence", 2)};
        }

        public static Capitalization valueOf(String str) {
            return (Capitalization) Enum.valueOf(Capitalization.class, str);
        }

        public static Capitalization[] values() {
            return (Capitalization[]) f45279Y.clone();
        }
    }
}
