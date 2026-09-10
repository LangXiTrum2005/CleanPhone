package com.p004ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\tH\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\u000e\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u001c\u0010\u0012\u001a\n \f*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/ironsource/ba;", "Lcom/ironsource/ea;", "", "key", "value", "", "a", "defValue", "getString", "", "allData", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences$Editor;", "b", "Landroid/content/SharedPreferences$Editor;", "editor", "Landroid/content/Context;", "context", vc.c.f27494b, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ba implements ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences.Editor editor;

    public ba(Context context, String fileName) {
        Intrinsics.f(context, "context");
        Intrinsics.f(fileName, "fileName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        this.sharedPreferences = sharedPreferences;
        this.editor = sharedPreferences.edit();
    }

    @Override // com.p004ironsource.ea
    public void a(String key) {
        Intrinsics.f(key, "key");
        this.editor.remove(key).apply();
    }

    @Override // com.p004ironsource.ea
    public Map<String, ?> allData() {
        Map<String, ?> all = this.sharedPreferences.getAll();
        Intrinsics.e(all, "sharedPreferences.all");
        return all;
    }

    @Override // com.p004ironsource.ea
    public String getString(String key, String defValue) {
        Intrinsics.f(key, "key");
        try {
            return this.sharedPreferences.getString(key, defValue);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p004ironsource.ea
    public void a(String key, String value) {
        Intrinsics.f(key, "key");
        Intrinsics.f(value, "value");
        this.editor.putString(key, value).apply();
    }
}
