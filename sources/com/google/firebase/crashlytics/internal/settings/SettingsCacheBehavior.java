package com.google.firebase.crashlytics.internal.settings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
final class SettingsCacheBehavior {
    public static final SettingsCacheBehavior X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final SettingsCacheBehavior f20754Y;
    public static final SettingsCacheBehavior Z;
    public static final /* synthetic */ SettingsCacheBehavior[] e0;

    static {
        SettingsCacheBehavior settingsCacheBehavior = new SettingsCacheBehavior("USE_CACHE", 0);
        X = settingsCacheBehavior;
        SettingsCacheBehavior settingsCacheBehavior2 = new SettingsCacheBehavior("SKIP_CACHE_LOOKUP", 1);
        f20754Y = settingsCacheBehavior2;
        SettingsCacheBehavior settingsCacheBehavior3 = new SettingsCacheBehavior("IGNORE_CACHE_EXPIRATION", 2);
        Z = settingsCacheBehavior3;
        e0 = new SettingsCacheBehavior[]{settingsCacheBehavior, settingsCacheBehavior2, settingsCacheBehavior3};
    }

    public static SettingsCacheBehavior valueOf(String str) {
        return (SettingsCacheBehavior) Enum.valueOf(SettingsCacheBehavior.class, str);
    }

    public static SettingsCacheBehavior[] values() {
        return (SettingsCacheBehavior[]) e0.clone();
    }
}
