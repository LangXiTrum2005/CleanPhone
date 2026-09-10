package com.codejoy.boom.clap.helper;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.util.Hashtable;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TypefaceUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/codejoy/boom/clap/helper/competently;", "", "<init>", "()V", "Landroid/content/res/AssetManager;", "mgr", "", "assetPath", "Landroid/graphics/Typeface;", "attabal", "(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;", "Ljava/util/Hashtable;", "saneness", "Ljava/util/Hashtable;", "getCache", "()Ljava/util/Hashtable;", "cache", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final competently f18256attabal = new competently();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Hashtable<String, Typeface> cache = new Hashtable<>();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f18257dern = 8;

    public final Typeface attabal(AssetManager mgr, String assetPath) {
        Typeface typeface;
        Intrinsics.checkNotNullParameter(mgr, "mgr");
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        Hashtable<String, Typeface> hashtable = cache;
        synchronized (hashtable) {
            if (!hashtable.containsKey(assetPath)) {
                try {
                    hashtable.put(assetPath, Typeface.createFromAsset(mgr, assetPath));
                } catch (Exception unused) {
                    return null;
                }
            }
            typeface = hashtable.get(assetPath);
        }
        return typeface;
    }
}
