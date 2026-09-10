package com.umeng.umcrash;

/* JADX INFO: loaded from: classes3.dex */
public interface IUMCrashCallbackWithType {

    public enum CrashType {
        CRASH_TYPE_NATIVE(1),
        CRASH_TYPE_JAVA(2),
        CRASH_TYPE_ANR(3),
        CRASH_TYPE_BLOCK(4),
        CRASH_TYPE_CUSTOM_LOG(5),
        CRASH_TYPE_MEM_LEAK(6);

        int mType;

        CrashType(int i) {
            this.mType = i;
        }

        public int getType() {
            return this.mType;
        }
    }

    String onCallback(CrashType crashType);
}
