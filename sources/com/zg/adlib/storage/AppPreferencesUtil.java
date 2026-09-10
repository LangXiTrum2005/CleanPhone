package com.zg.adlib.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.p004ironsource.d9;
import com.zg.adlib.ZGAd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002J\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0013J\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0019J\u0016\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0011J\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0017J\u0016\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/zg/adlib/storage/AppPreferencesUtil;", "", "<init>", "()V", "defaultFile", "", "read", "Landroid/content/SharedPreferences;", "ctx", "Landroid/content/Context;", d9.h.f24719b, "write", "Landroid/content/SharedPreferences$Editor;", "setInt", "", "key", "value", "", "setBoolean", "", "getBoolean", "defaultValue", "setLong", "", "setFloat", "", "setString", "getFloat", "getInt", "getLong", "getString", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppPreferencesUtil {
    public static final AppPreferencesUtil INSTANCE = new AppPreferencesUtil();
    private static final String defaultFile = "ZGADLIB";

    private AppPreferencesUtil() {
    }

    private final SharedPreferences read(Context ctx, String file) {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(file, 0);
        Intrinsics.e(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public static /* synthetic */ SharedPreferences read$default(AppPreferencesUtil appPreferencesUtil, Context context, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = defaultFile;
        }
        return appPreferencesUtil.read(context, str);
    }

    private final SharedPreferences.Editor write(Context ctx, String file) {
        SharedPreferences.Editor editorEdit = ctx.getSharedPreferences(file, 0).edit();
        Intrinsics.e(editorEdit, "edit(...)");
        return editorEdit;
    }

    public static /* synthetic */ SharedPreferences.Editor write$default(AppPreferencesUtil appPreferencesUtil, Context context, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = defaultFile;
        }
        return appPreferencesUtil.write(context, str);
    }

    public final boolean getBoolean(String key, boolean defaultValue) {
        Intrinsics.f(key, "key");
        Context context = ZGAd.getInstance().getContext();
        Intrinsics.e(context, "getContext(...)");
        return read$default(this, context, null, 2, null).getBoolean(key, defaultValue);
    }

    public final float getFloat(String key, float defaultValue) {
        Intrinsics.f(key, "key");
        Context context = ZGAd.getInstance().getContext();
        Intrinsics.e(context, "getContext(...)");
        return read$default(this, context, null, 2, null).getFloat(key, defaultValue);
    }

    public final int getInt(String key, int defaultValue) {
        Intrinsics.f(key, "key");
        Context context = ZGAd.getInstance().getContext();
        Intrinsics.e(context, "getContext(...)");
        return read$default(this, context, null, 2, null).getInt(key, defaultValue);
    }

    public final long getLong(String key, long defaultValue) {
        Intrinsics.f(key, "key");
        Context context = ZGAd.getInstance().getContext();
        Intrinsics.e(context, "getContext(...)");
        return read$default(this, context, null, 2, null).getLong(key, defaultValue);
    }

    public final String getString(String key, String defaultValue) {
        Intrinsics.f(key, "key");
        Intrinsics.f(defaultValue, "defaultValue");
        Context context = ZGAd.getInstance().getContext();
        Intrinsics.e(context, "getContext(...)");
        String string = read$default(this, context, null, 2, null).getString(key, defaultValue);
        return string == null ? "" : string;
    }

    public final void setBoolean(String key, boolean value) {
        Intrinsics.f(key, "key");
        Context context = ZGAd.getInstance().getContext();
        Intrinsics.e(context, "getContext(...)");
        write$default(this, context, null, 2, null).putBoolean(key, value).apply();
    }

    public final void setFloat(String key, float value) {
        Intrinsics.f(key, "key");
        Context context = ZGAd.getInstance().getContext();
        Intrinsics.e(context, "getContext(...)");
        write$default(this, context, null, 2, null).putFloat(key, value).apply();
    }

    public final void setInt(String key, int value) {
        Intrinsics.f(key, "key");
        Context context = ZGAd.getInstance().getContext();
        Intrinsics.e(context, "getContext(...)");
        write$default(this, context, null, 2, null).putInt(key, value).apply();
    }

    public final void setLong(String key, long value) {
        Intrinsics.f(key, "key");
        Context context = ZGAd.getInstance().getContext();
        Intrinsics.e(context, "getContext(...)");
        write$default(this, context, null, 2, null).putLong(key, value).apply();
    }

    public final void setString(String key, String value) {
        Intrinsics.f(key, "key");
        Intrinsics.f(value, "value");
        Context context = ZGAd.getInstance().getContext();
        Intrinsics.e(context, "getContext(...)");
        write$default(this, context, null, 2, null).putString(key, value).apply();
    }
}
