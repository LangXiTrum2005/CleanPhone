package e0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f38999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f39000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39001c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f38999a = colorStateList;
        this.f39000b = configuration;
        this.f39001c = theme == null ? 0 : theme.hashCode();
    }
}
