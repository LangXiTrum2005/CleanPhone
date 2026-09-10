package com.google.firebase.logger;

import com.p004ironsource.a4;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/logger/Logger;", "", "AndroidLogger", "FakeLogger", "Level", "Companion", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Logger {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/logger/Logger$AndroidLogger;", "Lcom/google/firebase/logger/Logger;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AndroidLogger extends Logger {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Level.values().length];
                try {
                    Level[] levelArr = Level.X;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Level[] levelArr2 = Level.X;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    Level[] levelArr3 = Level.X;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    Level[] levelArr4 = Level.X;
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    Level[] levelArr5 = Level.X;
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/logger/Logger$Companion;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/google/firebase/logger/Logger;", a4.f24253a, "Ljava/util/concurrent/ConcurrentHashMap;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/logger/Logger$FakeLogger;", "Lcom/google/firebase/logger/Logger;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FakeLogger extends Logger {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/logger/Logger$Level;", "", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Level {
        public static final /* synthetic */ Level[] X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f20901Y;

        /* JADX INFO: Fake field, exist only in values array */
        Level EF5;

        static {
            Level[] levelArr = {new Level("VERBOSE", 0), new Level("DEBUG", 1), new Level("INFO", 2), new Level("WARN", 3), new Level("ERROR", 4)};
            X = levelArr;
            f20901Y = EnumEntriesKt.a(levelArr);
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) X.clone();
        }
    }

    static {
        new ConcurrentHashMap();
    }
}
