package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class C6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f22734b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f22735a;

    public C6(Context context, String str) {
        this.f22735a = context.getSharedPreferences(str, 0);
    }

    @JvmStatic
    public static final C6 a(Context context, String str) {
        return B6.a(context, str);
    }

    public final void b() {
        SharedPreferences.Editor editorEdit = this.f22735a.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public final boolean a(String key) {
        Intrinsics.f(key, "key");
        if (!this.f22735a.contains(key)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f22735a.edit();
        editorEdit.remove(key);
        editorEdit.apply();
        return true;
    }

    public static void a(C6 c6, String key, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        c6.getClass();
        Intrinsics.f(key, "key");
        SharedPreferences.Editor editorEdit = c6.f22735a.edit();
        editorEdit.putString(key, str);
        if (z2) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static /* synthetic */ void a(C6 c6, String str, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        c6.a(str, i2, z2);
    }

    public final void a(String key, int i2, boolean z2) {
        Intrinsics.f(key, "key");
        SharedPreferences.Editor editorEdit = this.f22735a.edit();
        editorEdit.putInt(key, i2);
        if (z2) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static /* synthetic */ void a(C6 c6, String str, long j, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        c6.a(str, j, z2);
    }

    public final void a(String key, long j, boolean z2) {
        Intrinsics.f(key, "key");
        SharedPreferences.Editor editorEdit = this.f22735a.edit();
        editorEdit.putLong(key, j);
        if (z2) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static void a(C6 c6, String key, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        c6.getClass();
        Intrinsics.f(key, "key");
        SharedPreferences.Editor editorEdit = c6.f22735a.edit();
        editorEdit.putBoolean(key, z2);
        if (z3) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
