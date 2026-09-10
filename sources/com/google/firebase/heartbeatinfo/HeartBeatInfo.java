package com.google.firebase.heartbeatinfo;

/* JADX INFO: loaded from: classes4.dex */
public interface HeartBeatInfo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HeartBeat {
        public static final /* synthetic */ HeartBeat[] X = {new HeartBeat("NONE", 0), new HeartBeat("SDK", 1), new HeartBeat("GLOBAL", 2), new HeartBeat("COMBINED", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        HeartBeat EF5;

        public static HeartBeat valueOf(String str) {
            return (HeartBeat) Enum.valueOf(HeartBeat.class, str);
        }

        public static HeartBeat[] values() {
            return (HeartBeat[]) X.clone();
        }
    }
}
