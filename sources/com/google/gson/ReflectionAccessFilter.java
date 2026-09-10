package com.google.gson;

/* JADX INFO: loaded from: classes4.dex */
public interface ReflectionAccessFilter {

    /* JADX INFO: renamed from: com.google.gson.ReflectionAccessFilter$1, reason: invalid class name */
    public class AnonymousClass1 implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public final FilterResult a(Class cls) {
            String name = cls.getName();
            return (name.startsWith("java.") || name.startsWith("javax.")) ? FilterResult.Z : FilterResult.f21204Y;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.ReflectionAccessFilter$2, reason: invalid class name */
    public class AnonymousClass2 implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public final FilterResult a(Class cls) {
            String name = cls.getName();
            return (name.startsWith("java.") || name.startsWith("javax.")) ? FilterResult.e0 : FilterResult.f21204Y;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.ReflectionAccessFilter$3, reason: invalid class name */
    public class AnonymousClass3 implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public final FilterResult a(Class cls) {
            String name = cls.getName();
            return (name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.")) ? FilterResult.e0 : FilterResult.f21204Y;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.ReflectionAccessFilter$4, reason: invalid class name */
    public class AnonymousClass4 implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public final FilterResult a(Class cls) {
            String name = cls.getName();
            return (name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.")) ? FilterResult.e0 : FilterResult.f21204Y;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FilterResult {
        public static final FilterResult X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final FilterResult f21204Y;
        public static final FilterResult Z;
        public static final FilterResult e0;
        public static final /* synthetic */ FilterResult[] f0;

        static {
            FilterResult filterResult = new FilterResult("ALLOW", 0);
            X = filterResult;
            FilterResult filterResult2 = new FilterResult("INDECISIVE", 1);
            f21204Y = filterResult2;
            FilterResult filterResult3 = new FilterResult("BLOCK_INACCESSIBLE", 2);
            Z = filterResult3;
            FilterResult filterResult4 = new FilterResult("BLOCK_ALL", 3);
            e0 = filterResult4;
            f0 = new FilterResult[]{filterResult, filterResult2, filterResult3, filterResult4};
        }

        public static FilterResult valueOf(String str) {
            return (FilterResult) Enum.valueOf(FilterResult.class, str);
        }

        public static FilterResult[] values() {
            return (FilterResult[]) f0.clone();
        }
    }

    FilterResult a(Class cls);
}
