package com.charging.screenshow.battery.animations.themes.sp;

import android.content.SharedPreferences;
import com.charging.screenshow.battery.animations.themes.MyApp;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/sp/AppPreferencesUtil;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppPreferencesUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AppPreferencesUtil f13313a = new AppPreferencesUtil();

    public static SharedPreferences a(AppPreferencesUtil appPreferencesUtil, MyApp myApp) {
        appPreferencesUtil.getClass();
        SharedPreferences sharedPreferences = myApp.getSharedPreferences("cool_wallpaper", 0);
        Intrinsics.e(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public static SharedPreferences.Editor d(AppPreferencesUtil appPreferencesUtil, MyApp myApp) {
        appPreferencesUtil.getClass();
        SharedPreferences.Editor editorEdit = myApp.getSharedPreferences("cool_wallpaper", 0).edit();
        Intrinsics.e(editorEdit, "edit(...)");
        return editorEdit;
    }

    public final void b(String str, boolean z2) {
        d(this, AppExt.a()).putBoolean(str, z2).apply();
    }

    public final void c(String str, int i2) {
        d(this, AppExt.a()).putInt(str, i2).apply();
    }
}
