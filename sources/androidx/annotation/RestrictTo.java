package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@kotlin.annotation.Target
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention
@MustBeDocumented
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0014\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004R\u0017\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/annotation/RestrictTo;", "", "value", "", "Landroidx/annotation/RestrictTo$Scope;", "()[Landroidx/annotation/RestrictTo$Scope;", "Scope", "annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Documented
public @interface RestrictTo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/annotation/RestrictTo$Scope;", "", "annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Scope {
        public static final Scope X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Scope f3272Y;
        public static final Scope Z;
        public static final Scope e0;
        public static final Scope f0;
        public static final /* synthetic */ Scope[] g0;
        public static final /* synthetic */ EnumEntries h0;

        static {
            Scope scope = new Scope("LIBRARY", 0);
            X = scope;
            Scope scope2 = new Scope("LIBRARY_GROUP", 1);
            f3272Y = scope2;
            Scope scope3 = new Scope("LIBRARY_GROUP_PREFIX", 2);
            Z = scope3;
            Scope scope4 = new Scope("GROUP_ID", 3);
            Scope scope5 = new Scope("TESTS", 4);
            e0 = scope5;
            Scope scope6 = new Scope("SUBCLASSES", 5);
            f0 = scope6;
            Scope[] scopeArr = {scope, scope2, scope3, scope4, scope5, scope6};
            g0 = scopeArr;
            h0 = EnumEntriesKt.a(scopeArr);
        }

        public static Scope valueOf(String str) {
            return (Scope) Enum.valueOf(Scope.class, str);
        }

        public static Scope[] values() {
            return (Scope[]) g0.clone();
        }
    }

    Scope[] value();
}
