package ea;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1 f39924e;

    public y0(a1 a1Var, String str, boolean z10) {
        this.f39924e = a1Var;
        k9.c0.e(str);
        this.f39920a = str;
        this.f39921b = z10;
    }

    public final boolean a() {
        if (!this.f39922c) {
            this.f39922c = true;
            this.f39923d = this.f39924e.K0().getBoolean(this.f39920a, this.f39921b);
        }
        return this.f39923d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f39924e.K0().edit();
        editorEdit.putBoolean(this.f39920a, z10);
        editorEdit.apply();
        this.f39923d = z10;
    }
}
