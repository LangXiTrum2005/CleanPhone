package com.facebook.appevents;

import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/appevents/PerformanceGuardian;", "", "UseCase", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class PerformanceGuardian {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/appevents/PerformanceGuardian$UseCase;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class UseCase {
        public static final /* synthetic */ UseCase[] X = {new UseCase("CODELESS", 0), new UseCase("SUGGESTED_EVENT", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        UseCase EF5;

        public static UseCase valueOf(String str) {
            return (UseCase) Enum.valueOf(UseCase.class, str);
        }

        public static UseCase[] values() {
            return (UseCase[]) X.clone();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[UseCase.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            int[] iArr2 = new int[UseCase.values().length];
            iArr2[0] = 1;
            iArr2[1] = 2;
        }
    }

    static {
        new HashSet();
        new HashSet();
        new HashMap();
        new HashMap();
    }
}
